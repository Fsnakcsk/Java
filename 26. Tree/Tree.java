class Tree 
{
	private TreeNode root;
	Tree() {
		root = null;
	}
	void setRoot(String s) {
		root = new TreeNode(s);
	}
	void depthFirstTraverse() {
		if (root == null) {
			System.out.println("No node to visit");
			return;
		}
		root.depthFirstTraverse();
	}
	LinkedList<String> depthFirstEnumeration() {
		if (root == null) return null;
		LinkedList<String> pEnumeration = new LinkedList<String>();
		root.depthFirstEnumeration(pEnumeration);
		return pEnumeration;
	}
	boolean addNewChild(String parent,String child) {
		if (root == null) return false;
		TreeNode pNode = root.find(parent);
		if (pNode == null) return false;
		pNode.addChild(child);
		return true;
	}
	void showTree() {
		if (root == null) {
			System.out.println("No data in the tree!");
			return;
		}
		IntStack pStack = new IntStack();
		root.showTree(true,0,0,0,pStack);
	}
}
