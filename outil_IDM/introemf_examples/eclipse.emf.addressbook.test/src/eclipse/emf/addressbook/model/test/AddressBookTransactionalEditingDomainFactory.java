package eclipse.emf.addressbook.model.test;

import org.eclipse.emf.transaction.ExceptionHandler;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : January 2012
 */
public class AddressBookTransactionalEditingDomainFactory extends TransactionalEditingDomainImpl.FactoryImpl {

	@Override
	public TransactionalEditingDomain createEditingDomain() {
		TransactionalEditingDomain transactionalEditingDomain = super.createEditingDomain();
		
		// TODO specific configurations for this EditingDomain.

		((TransactionalCommandStack)transactionalEditingDomain.getCommandStack()).setExceptionHandler(new ExceptionHandler() {

			@Override
			public void handleException(Exception e) {
				System.out
						.println("AddressBookTransactionalEditingDomainFactory.createEditingDomain().new ExceptionHandler() {...}.handleException()");
				
			}
			
		});
		
		return transactionalEditingDomain;
	}	
}
