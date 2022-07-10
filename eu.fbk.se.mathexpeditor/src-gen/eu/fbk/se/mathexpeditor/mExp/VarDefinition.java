/**
 * generated by Xtext 2.27.0.M3
 */
package eu.fbk.se.mathexpeditor.mExp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.fbk.se.mathexpeditor.mExp.VarDefinition#getVarName <em>Var Name</em>}</li>
 *   <li>{@link eu.fbk.se.mathexpeditor.mExp.VarDefinition#getVarValue <em>Var Value</em>}</li>
 * </ul>
 *
 * @see eu.fbk.se.mathexpeditor.mExp.MExpPackage#getVarDefinition()
 * @model
 * @generated
 */
public interface VarDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name</em>' attribute.
   * @see #setVarName(String)
   * @see eu.fbk.se.mathexpeditor.mExp.MExpPackage#getVarDefinition_VarName()
   * @model
   * @generated
   */
  String getVarName();

  /**
   * Sets the value of the '{@link eu.fbk.se.mathexpeditor.mExp.VarDefinition#getVarName <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name</em>' attribute.
   * @see #getVarName()
   * @generated
   */
  void setVarName(String value);

  /**
   * Returns the value of the '<em><b>Var Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Value</em>' attribute.
   * @see #setVarValue(int)
   * @see eu.fbk.se.mathexpeditor.mExp.MExpPackage#getVarDefinition_VarValue()
   * @model
   * @generated
   */
  int getVarValue();

  /**
   * Sets the value of the '{@link eu.fbk.se.mathexpeditor.mExp.VarDefinition#getVarValue <em>Var Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Value</em>' attribute.
   * @see #getVarValue()
   * @generated
   */
  void setVarValue(int value);

} // VarDefinition