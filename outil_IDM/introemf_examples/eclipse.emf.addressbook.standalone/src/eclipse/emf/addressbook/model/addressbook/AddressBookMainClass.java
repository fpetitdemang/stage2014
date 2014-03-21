package eclipse.emf.addressbook.model.addressbook;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : January 2011
 */
public class AddressBookMainClass {
	public static void main(String[] args) {
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
		
		System.out.println(createAddressBook.toString());
	}
}
