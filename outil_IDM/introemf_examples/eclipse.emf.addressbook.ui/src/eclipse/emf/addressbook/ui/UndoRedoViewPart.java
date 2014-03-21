package eclipse.emf.addressbook.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import eclipse.emf.addressbook.model.addressbook.AddressBook;
import eclipse.emf.addressbook.model.addressbook.AddressbookFactory;

public class UndoRedoViewPart extends ViewPart {

	private TransactionalEditingDomain domain;
	
	private AddressBook createAddressBook;
	
	private Button undo;
	
	private Button redo;
	
	public UndoRedoViewPart() {
	}

	@Override
	public void createPartControl(Composite parent) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI("addressbookinstances"));
		createAddressBook = AddressbookFactory.eINSTANCE.createAddressBook();
			
		createAddressBook.setName("This is a sample AddressBook");	
		resource.getContents().add(createAddressBook);

		domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
		
		parent.setLayout(new GridLayout(3, false));
	
		Button modify = new Button(parent, SWT.FLAT);
		modify.setText("Modify");
		modify.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				RecordingCommand recordingCommand = new RecordingCommand(domain) {
					protected void doExecute() {
						StringBuffer sb = new StringBuffer();
						sb.append(createAddressBook.getName());
						createAddressBook.setName(sb.reverse().toString());
					}
				};
				domain.getCommandStack().execute(recordingCommand);
				
				redo.setEnabled(domain.getCommandStack().canRedo());
				undo.setEnabled(domain.getCommandStack().canUndo());
				
				System.out.println(createAddressBook.toString());
			}
		});
		
		undo = new Button(parent, SWT.FLAT);
		undo.setText("Undo");
		undo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				domain.getCommandStack().undo();

				redo.setEnabled(domain.getCommandStack().canRedo());
				undo.setEnabled(domain.getCommandStack().canUndo());
				
				System.out.println(createAddressBook.toString());
			}
		});
		
		redo = new Button(parent, SWT.FLAT);
		redo.setText("Redo");
		redo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				domain.getCommandStack().redo();
				
				redo.setEnabled(domain.getCommandStack().canRedo());
				undo.setEnabled(domain.getCommandStack().canUndo());
				
				System.out.println(createAddressBook.toString());
			}
		});
	}

	@Override
	public void setFocus() {
	}
}