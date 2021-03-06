/**
 */
package org.wso2.developerstudio.datamapper;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.developerstudio.datamapper.Input#getTreeNode <em>Tree Node</em>}</li>
 * </ul>
 *
 * @see org.wso2.developerstudio.datamapper.DataMapperPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends DataMapperNode {

	/**
	 * Returns the value of the '<em><b>Tree Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.developerstudio.datamapper.TreeNode}.
	 * It is bidirectional and its opposite is '{@link org.wso2.developerstudio.datamapper.TreeNode#getInputParent <em>Input Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tree Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree Node</em>' containment reference list.
	 * @see org.wso2.developerstudio.datamapper.DataMapperPackage#getInput_TreeNode()
	 * @see org.wso2.developerstudio.datamapper.TreeNode#getInputParent
	 * @model opposite="inputParent" containment="true"
	 * @generated
	 */
	EList<TreeNode> getTreeNode();
} // Input
