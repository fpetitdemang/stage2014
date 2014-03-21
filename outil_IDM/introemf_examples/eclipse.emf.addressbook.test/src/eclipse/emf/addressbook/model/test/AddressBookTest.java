package eclipse.emf.addressbook.model.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.transaction.DemultiplexingListener;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.junit.Assert;
import org.junit.Test;

import eclipse.emf.addressbook.model.addressbook.Address;
import eclipse.emf.addressbook.model.addressbook.AddressBook;
import eclipse.emf.addressbook.model.addressbook.AddressbookFactory;
import eclipse.emf.addressbook.model.addressbook.AddressbookPackage;
import eclipse.emf.addressbook.model.addressbook.Person;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : January 2011
 */
public class AddressBookTest {

	@Test
	public void createAddressBook() {
		AddressBook createAddressBook = AddressbookFactory.eINSTANCE
				.createAddressBook();
		createAddressBook.setName("Mon Carnet d'Adresses");

		Address createMBAddress = AddressbookFactory.eINSTANCE.createAddress();
		createMBAddress.setNumber(5);
		createMBAddress.setStreet("Rue des Javaistes");
		Person mickaelBaron = AddressbookFactory.eINSTANCE.createPerson();
		mickaelBaron.setAge(35);
		mickaelBaron.setFamilyName("BARON");
		mickaelBaron.setFirstName("Mickael");
		mickaelBaron.setLocation(createMBAddress);
		Assert.assertEquals("BARON", mickaelBaron.getFamilyName());

		Address createAddress = AddressbookFactory.eINSTANCE.createAddress();
		createAddress.setNumber(6);
		createAddress.setStreet("Rue des Espions");
		Person johnAaron = AddressbookFactory.eINSTANCE.createPerson();
		johnAaron.setAge(14);
		johnAaron.setFamilyName("AARON");
		johnAaron.setFirstName("John");
		johnAaron.setLocation(createAddress);
		Assert.assertEquals("Rue des Espions", johnAaron.getLocation()
				.getStreet());

		createAddressBook.getContains().add(mickaelBaron);
		createAddressBook.getContains().add(johnAaron);

		Assert.assertEquals(2, createAddressBook.getContains().size());
	}

	@Test
	public void createAddressBookNotifier() {
		AddressBook createAddressBook = AddressbookFactory.eINSTANCE.createAddressBook();
		createAddressBook.eAdapters().add(new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				System.out
						.println("(Global) Notfication received from the data model : " + notification.getNewValue());
			}
		});
		createAddressBook.eAdapters().add(new AdapterImpl() {

			@Override
			public void notifyChanged(Notification notification) {
				System.out.println("(Local) Notification received from the data model : " + notification.getNewValue());
			}
			
		});
		createAddressBook.setName("Mon Carnet d'Adresses");
		
		Person mickaelBaron = AddressbookFactory.eINSTANCE.createPerson();
		createAddressBook.getContains().add(mickaelBaron);
		mickaelBaron.setAge(35);
		mickaelBaron.setFamilyName("BARON");
		mickaelBaron.setFirstName("Mickael");
		Address createMBAddress = AddressbookFactory.eINSTANCE.createAddress();
		mickaelBaron.setLocation(createMBAddress);
		createMBAddress.setNumber(5);
		createMBAddress.setStreet("Rue des Javaistes");
		Assert.assertEquals("BARON", mickaelBaron.getFamilyName());

		Person johnAaron = AddressbookFactory.eINSTANCE.createPerson();
		createAddressBook.getContains().add(johnAaron);
		johnAaron.setAge(14);
		johnAaron.setFamilyName("AARON");
		johnAaron.setFirstName("John");
		Address createAddress = AddressbookFactory.eINSTANCE.createAddress();
		johnAaron.setLocation(createAddress);
		createAddress.setNumber(6);
		createAddress.setStreet("Rue des Espions");
		Assert.assertEquals("Rue des Espions", johnAaron.getLocation()
				.getStreet());


		Assert.assertEquals(2, createAddressBook.getContains().size());
	}
	
	@Test
	public void saveAndLoadAddressBook() {
		AddressBook createAddressBook = AddressbookFactory.eINSTANCE
				.createAddressBook();
		createAddressBook.setName("Mon Carnet d'Adresses");

		Address createMBAddress = AddressbookFactory.eINSTANCE.createAddress();
		createMBAddress.setNumber(5);
		createMBAddress.setStreet("Rue des Javaistes");
		Person mickaelBaron = AddressbookFactory.eINSTANCE.createPerson();
		mickaelBaron.setAge(35);
		mickaelBaron.setFamilyName("BARON");
		mickaelBaron.setFirstName("Mickael");
		mickaelBaron.setLocation(createMBAddress);

		Address createAddress = AddressbookFactory.eINSTANCE.createAddress();
		createAddress.setNumber(6);
		createAddress.setStreet("Rue des Espions");
		Person johnAaron = AddressbookFactory.eINSTANCE.createPerson();
		johnAaron.setAge(14);
		johnAaron.setFamilyName("AARON");
		johnAaron.setFirstName("John");
		johnAaron.setLocation(createAddress);

		createAddressBook.getContains().add(mickaelBaron);
		createAddressBook.getContains().add(johnAaron);

		// Save model to XMI.
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xmi", new XMIResourceFactoryImpl());
		URI uri = URI.createURI("file:/c:/addressbookinstances.xmi");
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(createAddressBook);
		try {
			resource.save(null);
			Assert.assertEquals("Mon Carnet d'Adresses",
					createAddressBook.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Load model from XMI.
		// resourceSet = new ResourceSetImpl();
		// resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi",
		// new XMIResourceFactoryImpl());
		uri = URI.createURI("file:/c:/addressbookinstances.xmi");
		resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
			createAddressBook = (AddressBook) resource.getContents().get(0);
			Assert.assertEquals("Mon Carnet d'Adresses",
					createAddressBook.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Load model from XMI in a second way.
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xmi", new XMIResourceFactoryImpl());
		uri = URI.createURI("file:/c:/addressbookinstances.xmi");
		resource = resourceSet.getResource(uri, true);
		createAddressBook = (AddressBook) resource.getContents().get(0);
		Assert.assertEquals("Mon Carnet d'Adresses",
				createAddressBook.getName());
	}

	@Test
	public void queryAddressBookStructure() {
		AddressbookPackage addressbookPackage = AddressbookPackage.eINSTANCE;
		EList<EClassifier> eClassifiers = addressbookPackage.getEClassifiers();

		for (EClassifier eClassifier : eClassifiers) {
			System.out.println(eClassifier.getName());
			System.out.print("  ");

			if (eClassifier instanceof EClass) {
				EClass eClass = (EClass) eClassifier;
				EList<EAttribute> eAttributes = eClass.getEAttributes();
				for (EAttribute eAttribute : eAttributes) {
					System.out.print(eAttribute.getName() + "("
							+ eAttribute.getEAttributeType().getName() + ") ");
				}

				if (!eClass.getEAttributes().isEmpty()
						&& !eClass.getEReferences().isEmpty()) {
					System.out.println();
					System.out.print("  Références : ");
				}

				EList<EReference> eReferences = eClass.getEReferences();
				for (EReference eReference : eReferences) {
					System.out.print(eReference.getName() + "("
							+ eReference.getEReferenceType().getName() + "["
							+ eReference.getLowerBound() + ".."
							+ eReference.getUpperBound() + "])");
				}

				if (!eClass.getEOperations().isEmpty()) {
					System.out.println();
					System.out.print("  Opérations : ");

					for (EOperation eOperation : eClass.getEOperations()) {
						System.out.println(eOperation.getEType().getName()
								+ " " + eOperation.getName());
					}
				}
			}
			System.out.println();
		}
	}

	@Test
	public void createTransactionalEditingDomainByFactory() {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI
				.createURI("addressbookinstances"));
		AddressBook createAddressBook = AddressbookFactory.eINSTANCE
				.createAddressBook();
		resource.getContents().add(createAddressBook);

		TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE
				.createEditingDomain(resourceSet);

		Command createCommand = domain.createCommand(SetCommand.class,
				new CommandParameter(createAddressBook,
						AddressbookPackage.Literals.ADDRESS_BOOK__NAME,
						"Mon Carnet d'Adresses"));
		CommandStack commandStack = domain.getCommandStack();
		commandStack.execute(createCommand);

		try {
			createAddressBook.setName("Mon Nouveau Carnet d'Adressess");
			Assert.fail();
		} catch (IllegalStateException p) {
			p.printStackTrace();
		}
	}

	@Test
	public void createTransactionalEditingDomainByRegistry() {
		TransactionalEditingDomain domain = TransactionalEditingDomain.Registry.INSTANCE
				.getEditingDomain("eclipse.emf.addressbook.test.editingDomainId");
		final Resource resource = domain.getResourceSet().createResource(
				URI.createURI("addressbookinstances"));

		RecordingCommand recordingCommand = new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				AddressBook createAddressBook = AddressbookFactory.eINSTANCE
						.createAddressBook();
				createAddressBook.setName("Mon Carnet d'Adresses");
				resource.getContents().add(createAddressBook);
			}
		};
		TransactionalCommandStack commandStack = (TransactionalCommandStack) domain
				.getCommandStack();
		commandStack.execute(recordingCommand);
	}

//	Person firstPerson = AddressbookFactory.eINSTANCE
//			.createPerson();
//	Person secondPerson = AddressbookFactory.eINSTANCE
//			.createPerson();
//	Person troisiPerson = AddressbookFactory.eINSTANCE
//			.createPerson();
//
//	createAddressBook.getContains().add(firstPerson);
//	createAddressBook.getContains().add(secondPerson);
//	// createAddressBook.getContains().add(troisiPerson);
//
//	Diagnostic validate = Diagnostician.INSTANCE
//			.validate(createAddressBook);
//	handleDiagnostic(validate);
//	System.out.println(validate.getSeverity());
//	System.out.println(validate.getMessage());
	
	protected void handleDiagnostic(Diagnostic diagnostic) {
		int severity = diagnostic.getSeverity();
		String title = null;
		String message = null;

		if (severity == Diagnostic.ERROR || severity == Diagnostic.WARNING) {
			title = EMFEditUIPlugin.INSTANCE
					.getString("_UI_ValidationProblems_title");
			message = EMFEditUIPlugin.INSTANCE
					.getString("_UI_ValidationProblems_message");
		}
		
		System.out.println(title);
		System.out.println(message);

		List<Diagnostic> children = diagnostic.getChildren();
		for (Diagnostic diagnostic2 : children) {
			System.out.println(diagnostic2.getMessage());
			System.out.println(diagnostic2.getChildren().size());
		}
	}

	@Test
	public void disableTransactionalEditingDomainByFactory() {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI
				.createURI("addressbookinstances"));
		AddressBook createAddressBook = AddressbookFactory.eINSTANCE
				.createAddressBook();
		resource.getContents().add(createAddressBook);

		TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE
				.createEditingDomain(resourceSet);

		Command createCommand = domain.createCommand(SetCommand.class,
				new CommandParameter(createAddressBook,
						AddressbookPackage.Literals.ADDRESS_BOOK__NAME,
						"Mon Carnet d'Adresses"));
		TransactionalCommandStack commandStack = (TransactionalCommandStack) domain
				.getCommandStack();
		commandStack.execute(createCommand);

		domain.dispose();

		try {
			createAddressBook.setName("Mon Nouveau Carnet d'Adressess");
		} catch (IllegalStateException p) {
			Assert.fail();
		}
	}
	
	@Test
	public void createWriteTransactionWithCreateCommand() {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI
				.createURI("addressbookinstances"));
		AddressBook createAddressBook = AddressbookFactory.eINSTANCE
				.createAddressBook();
		resource.getContents().add(createAddressBook);

		TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE
				.createEditingDomain(resourceSet);

		Command createCommand = domain.createCommand(SetCommand.class,
				new CommandParameter(createAddressBook, AddressbookPackage.Literals.ADDRESS_BOOK__NAME,"Mon Carnet d'Adresses"));
		domain.getCommandStack().execute(createCommand);

		Assert.assertEquals("Mon Carnet d'Adresses", createAddressBook.getName());
	}
	
	private AddressBook createAddressBook;
	
	@Test
	public void createWriteTransactionWithRecordingCommand() {
		TransactionalEditingDomain domain = TransactionalEditingDomain.Registry.INSTANCE
				.getEditingDomain("eclipse.emf.addressbook.test.editingDomainId");
		final Resource resource = domain.getResourceSet().createResource(
				URI.createURI("addressbookinstances"));
		
		RecordingCommand recordingCommand = new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				createAddressBook = AddressbookFactory.eINSTANCE.createAddressBook();
				createAddressBook.setName("Mon Carnet d'Adresses");
				resource.getContents().add(createAddressBook);
				
				Person firstPerson = AddressbookFactory.eINSTANCE.createPerson();
				Person secondPerson = AddressbookFactory.eINSTANCE.createPerson();
				
				createAddressBook.getContains().add(firstPerson);
				createAddressBook.getContains().add(secondPerson);
			}
		};
		TransactionalCommandStack commandStack = (TransactionalCommandStack) domain
				.getCommandStack();
		commandStack.execute(recordingCommand);
		
		Assert.assertNotNull(createAddressBook);
		Assert.assertEquals("Mon Carnet d'Adresses", createAddressBook.getName());
		Assert.assertEquals(2, createAddressBook.getContains().size());
	}
	
	@Test
	public void createPostCommitListeners() {
		TransactionalEditingDomain domain = TransactionalEditingDomain.Registry.INSTANCE
				.getEditingDomain("eclipse.emf.addressbook.test.editingDomainId");
		final Resource resource = domain.getResourceSet().createResource(
				URI.createURI("addressbookinstances"));
		
		
		RecordingCommand recordingCommand = new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				createAddressBook = AddressbookFactory.eINSTANCE.createAddressBook();
				createAddressBook.setName("Mon Carnet d'Adresses");
				resource.getContents().add(createAddressBook);				
			}
		};
		CommandStack commandStack = domain.getCommandStack();
		commandStack.execute(recordingCommand);

		domain.addResourceSetListener(new ResourceSetListenerImpl() {

			@Override
			public void resourceSetChanged(ResourceSetChangeEvent event) {
				System.out.println("Domain " + event.getEditingDomain().getID() + " changed " + event.getNotifications().size() + " times");
				
				List<Notification> notifications = event.getNotifications();
				for (Notification notification : notifications) {
					System.out.print("Type: " + notification.getEventType() + " Old Value=" + notification.getOldValue() + " New Value=" + notification.getNewValue());
					System.out.println();
				}
			}			
		});
		
		recordingCommand = new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				createAddressBook.setName("Mon Nouveau Carnet d'Adresses");
				Person firstPerson = AddressbookFactory.eINSTANCE.createPerson();
				
				createAddressBook.getContains().add(firstPerson);
			}
		};
		commandStack = domain.getCommandStack();
		commandStack.execute(recordingCommand);
		
		Assert.assertNotNull(createAddressBook);
		Assert.assertEquals("Mon Nouveau Carnet d'Adresses", createAddressBook.getName());
	}
	
	@Test
	public void createPostCommitListenersWithDemultiplexingListener() {
		TransactionalEditingDomain domain = TransactionalEditingDomain.Registry.INSTANCE
				.getEditingDomain("eclipse.emf.addressbook.test.editingDomainId");
		final Resource resource = domain.getResourceSet().createResource(
				URI.createURI("addressbookinstances"));
		
		
		RecordingCommand recordingCommand = new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				createAddressBook = AddressbookFactory.eINSTANCE.createAddressBook();
				createAddressBook.setName("Mon Carnet d'Adresses");
				resource.getContents().add(createAddressBook);				
			}
		};
		CommandStack commandStack = domain.getCommandStack();
		commandStack.execute(recordingCommand);

		domain.addResourceSetListener(new DemultiplexingListener() {
			@Override
			protected void handleNotification(
					TransactionalEditingDomain domain, Notification notification) {
				System.out.println("Domain " + domain.getID() + " changed ");				
				
				System.out.print("Type: " + notification.getEventType() + " Old Value=" + notification.getOldValue() + " New Value=" + notification.getNewValue());
				System.out.println();
			}			
		});
		
		recordingCommand = new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				createAddressBook.setName("Mon Nouveau Carnet d'Adresses");
				Person firstPerson = AddressbookFactory.eINSTANCE.createPerson();
				
				createAddressBook.getContains().add(firstPerson);
			}
		};
		commandStack = domain.getCommandStack();
		commandStack.execute(recordingCommand);
		
		Assert.assertNotNull(createAddressBook);
		Assert.assertEquals("Mon Nouveau Carnet d'Adresses", createAddressBook.getName());
	}
	
	@Test
	public void createTriggers() {
		TransactionalEditingDomain domain = TransactionalEditingDomain.Registry.INSTANCE
				.getEditingDomain("eclipse.emf.addressbook.test.editingDomainId");
		final Resource resource = domain.getResourceSet().createResource(
				URI.createURI("addressbookinstances"));
		
		domain.addResourceSetListener(new ResourceSetListenerImpl() {
			@Override
			public Command transactionAboutToCommit(ResourceSetChangeEvent event)
					throws RollbackException {
				List<Command> commands = new ArrayList<Command>();
				for (Notification notification : event.getNotifications()) {
					if (notification.getNotifier() instanceof AddressBook) {
						AddressBook currentAB = (AddressBook)notification.getNotifier();
						for(final Person currentPerson : currentAB.getContains()) {
							commands.add(new RecordingCommand(event.getEditingDomain()) {
								@Override
								protected void doExecute() { 
									currentPerson.setFirstName("A FirstName");
									currentPerson.setFamilyName("A FamilyName");
									currentPerson.setAge(18);									
								}
							});
						}
					}
				}
				
				return commands.isEmpty()? null : new CompoundCommand(commands);
			}
		});
		
		RecordingCommand recordingCommand = new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				createAddressBook = AddressbookFactory.eINSTANCE.createAddressBook();
				createAddressBook.setName("Mon Carnet d'Adresses");
				resource.getContents().add(createAddressBook);	
				
				firstPerson = AddressbookFactory.eINSTANCE.createPerson();				
				createAddressBook.getContains().add(firstPerson);
			}
		};
		CommandStack commandStack = domain.getCommandStack();
		commandStack.execute(recordingCommand);

		Assert.assertNotNull(createAddressBook);
		Assert.assertEquals("Mon Carnet d'Adresses", createAddressBook.getName());
		Assert.assertEquals(1, createAddressBook.getContains().size());
	}
	
	Person firstPerson;
}
