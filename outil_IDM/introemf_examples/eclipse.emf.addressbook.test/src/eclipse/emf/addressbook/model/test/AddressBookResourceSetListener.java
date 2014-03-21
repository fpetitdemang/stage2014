package eclipse.emf.addressbook.model.test;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;

public class AddressBookResourceSetListener extends ResourceSetListenerImpl {

	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {
		System.out.println("Domain " + event.getEditingDomain().getID() + " changed " + event.getNotifications().size() + " times");
		
		List<Notification> notifications = event.getNotifications();
		for (Notification notification : notifications) {
			System.out.print("Type: " + notification.getEventType() + " Old Value=" + notification.getOldValue() + " New Value=" + notification.getNewValue());
			System.out.println();
		}
	}
}
