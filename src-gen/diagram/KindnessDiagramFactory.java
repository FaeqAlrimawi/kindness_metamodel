/**
 */
package diagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see diagram.KindnessDiagramPackage
 * @generated
 */
public interface KindnessDiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KindnessDiagramFactory eINSTANCE = diagram.impl.KindnessDiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>KDiagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KDiagram</em>'.
	 * @generated
	 */
	KDiagram createKDiagram();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KindnessDiagramPackage getKindnessDiagramPackage();

} //KindnessDiagramFactory
