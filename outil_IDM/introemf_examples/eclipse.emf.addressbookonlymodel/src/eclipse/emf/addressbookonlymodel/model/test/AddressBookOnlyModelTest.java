package eclipse.emf.addressbookonlymodel.model.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : January 2011
 */
public class AddressBookOnlyModelTest {

	@Test
	public void createAddressBookWithMetaModel() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ecore", new XMIResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI("model/addressbook.ecore");
		Resource resource = resourceSet.getResource(fileURI, true);

		EPackage ePackage = (EPackage) resource.getContents().get(0);

		EClass eAddressBook = (EClass) ePackage.getEClassifier("AddressBook");
		EReference eContains = (EReference) eAddressBook.getEStructuralFeature("contains");
		EAttribute eName = (EAttribute) eAddressBook.getEStructuralFeature("name");
		EObject addressBookInstance = ePackage.getEFactoryInstance().create(eAddressBook);
		addressBookInstance.eSet(eName, "Mon Carnet d'Adresses");
		
		EClass ePerson = (EClass) ePackage.getEClassifier("Person");
		EAttribute eFirstName = (EAttribute) ePerson.getEStructuralFeature("firstName");
		EAttribute eFamilyName = (EAttribute) ePerson.getEStructuralFeature("familyName");
		EObject personInstance = ePackage.getEFactoryInstance().create(ePerson);
		personInstance.eSet(eFirstName, "Mickael");
		personInstance.eSet(eFamilyName, "BARON");
		
		List<EClass> containsList = new ArrayList<EClass>();
		containsList.add(ePerson);
		addressBookInstance.eSet(eContains, containsList);
	}

	@Test
	public void saveAndLoadAddressBookWithMetaModel() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ecore", new XMIResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI("model/addressbook.ecore");
		Resource resource = resourceSet.createResource(fileURI);
		try {
			resource.load(null);
			EPackage ePackage = (EPackage) resource.getContents().get(0);

			EClass eAddressBook = (EClass) ePackage.getEClassifier("AddressBook");
			EReference eContains = (EReference) eAddressBook.getEStructuralFeature("contains");
			EAttribute eName = (EAttribute) eAddressBook.getEStructuralFeature("name");
			EObject addressBookInstance = ePackage.getEFactoryInstance().create(eAddressBook);
			addressBookInstance.eSet(eName, "Mon Carnet d'Adresses");
			
			EClass ePerson = (EClass) ePackage.getEClassifier("Person");
			EAttribute eFirstName = (EAttribute) ePerson.getEStructuralFeature("firstName");
			EAttribute eFamilyName = (EAttribute) ePerson.getEStructuralFeature("familyName");
			EObject personInstance = ePackage.getEFactoryInstance().create(ePerson);
			personInstance.eSet(eFirstName, "Mickael");
			personInstance.eSet(eFamilyName, "BARON");
			
			List<EObject> containsList = new ArrayList<EObject>();
			containsList.add(personInstance);
			addressBookInstance.eSet(eContains, containsList);
						
			resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			URI uri = URI.createURI("file:/c:/addressbookinstancesonlymodel.xmi");
			resource = resourceSet.createResource(uri);
			resource.getContents().add(addressBookInstance);
			resource.save(null);

			resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			Registry packageRegistry = resourceSet.getPackageRegistry();
			packageRegistry.put("http://addressbook/1.0", ePackage);
			
			uri = URI.createURI("file:/c:/addressbookinstancesonlymodel.xmi");
			resource = resourceSet.getResource(uri, true);
			resource.load(null);
			EObject test = resource.getContents().get(0);
			System.out.println(test);
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
