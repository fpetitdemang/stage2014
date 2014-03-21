/**
 */
package uml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml.TemplateParameter;
import uml.UmlFactory;
import uml.UmlPackage;

/**
 * This is the item provider adapter for a {@link uml.TemplateParameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateParameterItemProvider
	extends ElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addParameteredElementPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parametered Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameteredElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateParameter_parameteredElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateParameter_parameteredElement_feature", "_UI_TemplateParameter_type"),
				 UmlPackage.eINSTANCE.getTemplateParameter_ParameteredElement(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TemplateParameter_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TemplateParameter_default_feature", "_UI_TemplateParameter_type"),
				 UmlPackage.eINSTANCE.getTemplateParameter_Default(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement());
			childrenFeatures.add(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TemplateParameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TemplateParameter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TemplateParameter_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TemplateParameter.class)) {
			case UmlPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT:
			case UmlPackage.TEMPLATE_PARAMETER__OWNED_DEFAULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createExecutionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createCreationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createDestructionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createSendOperationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createSendSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createReceiveOperationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createReceiveSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createTimeObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement(),
				 UmlFactory.eINSTANCE.createAssociationClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createGeneralizationSet()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createAbstraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createSubstitution()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createDeploymentSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createManifestation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createInterfaceRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createProtocolStateMachine()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createExtensionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createStereotype()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createProfile()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createUseCase()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createInstanceSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createEnumerationLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createOpaqueBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createFunctionBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createInteractionConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createExecutionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createCreationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createDestructionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createSendOperationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createSendSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createReceiveOperationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createReceiveSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createCallEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createSignalEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createAnyReceiveEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createComponentRealization()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createCommunicationPath()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createExecutionEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createIntervalConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createDurationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createTimeObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createDurationObservation()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createTimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createInformationItem()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createInformationFlow()));

		newChildDescriptors.add
			(createChildParameter
				(UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault(),
				 UmlFactory.eINSTANCE.createAssociationClass()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == UmlPackage.eINSTANCE.getTemplateParameter_OwnedParameteredElement() ||
			childFeature == UmlPackage.eINSTANCE.getTemplateParameter_OwnedDefault();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
