class TestTree 
{
	public static void main(String[] args) 
	{
		Tree aTree = new Tree();
		String rootName;
		System.out.print("Type the name of the root node of this tree: ");
		rootName = System.console().readLine();
		aTree.setRoot(rootName);
		while(true) {
			String parent, child;

			System.out.println(">>"); 
			System.out.print("Type a parent name: "); 
			parent = System.console().readLine();
			System.out.print("Type a child name: "); 
			child = System.console().readLine();
			if (aTree.addNewChild(parent,child) == false) break;
		}

		System.out.println("- depth first traverse -");
		aTree.depthFirstTraverse();

		System.out.println("- depth first traverse using enumeration -");
		LinkedList<String> pList = aTree.depthFirstEnumeration();

		ListIterator<String> i = pList.listIterator();
		while(i.hasNext()) {
			String s = i.next();
			System.out.println(s);
		}

		System.out.println("=== the tree you made looks like as follows ===");
		aTree.showTree();
	}
}
