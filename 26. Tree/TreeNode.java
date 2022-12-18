class TreeNode 
{
	private String data;
	private LinkedList<TreeNode> children;
	TreeNode(String s) {
		data = s;
		children = new LinkedList<TreeNode>();
	}
	String getData() {
		return data;
	}
	void depthFirstTraverse() {
		System.out.println(data);

		ListIterator<TreeNode> i = children.listIterator();
		while(i.hasNext()) {
			TreeNode child = i.next();
			child.depthFirstTraverse();
		}
	}
	void depthFirstEnumeration(LinkedList<String> pEnumeration) {
		pEnumeration.addLast(data);
		ListIterator<TreeNode> i = children.listIterator();
		while(i.hasNext()) {
			TreeNode child = i.next();
			child.depthFirstEnumeration(pEnumeration);
		}
	}
	TreeNode find(String s) {
		if (data.equals(s)) return this;

		ListIterator<TreeNode> i = children.listIterator();
		while(i.hasNext()) {
			TreeNode child = i.next();
			TreeNode foundNode = child.find(s);
			if (foundNode != null) return foundNode;
		}
		return null;
	}
	void addChild(String s) {
		TreeNode pNewNode = new TreeNode(s);
		children.addLast(pNewNode);
	}
	int showTree(boolean isFirstChild,int level,int xPos,int gap,IntStack pStack) {
		if (isFirstChild == true && level > 0) {
			System.out.print("-+-");
		} else if (level > 0) {
			System.out.print(" +-");
		}
		System.out.print(data);
		if (level == 0) {
			xPos = xPos + data.length();
			pStack.push(data.length()+1);
		} else if (children.size() > 1) {
			xPos = xPos + data.length() + 3;
			pStack.push(data.length()+2+gap);
		} else {
			xPos = xPos + data.length();
			pStack.push(data.length()+1+gap);
		}
		int maxWidth = 0;
		boolean firstNodeFlag1 = true;
		boolean firstNodeFlag2 = true;
		boolean alreadyPoped = false;
		int nCount = children.size();
		ListIterator<TreeNode> iterator = children.listIterator();
		while(iterator.hasNext()) {
			int childWidth;
			TreeNode child = iterator.next();
			nCount--;
			if (firstNodeFlag1 == true) {
				firstNodeFlag1 = false;
			} else {
				int i;
				for(i = 0; i < pStack.size(); i++) {
					int n = pStack.getAt(i);
					for(int j = 0; j < n; j++) {
						System.out.print(" ");
					}
					System.out.print("|");
				}
				System.out.println();
				int nBlanks = xPos;
				for(i = 0; i < pStack.size()-1; i++) {
					int n = pStack.getAt(i);
					for(int j = 0; j < n; j++) {
						System.out.print(" ");
						nBlanks--;
					}
					System.out.print("|");
					nBlanks--;
				}
				for(i = 0; i < nBlanks; i++) {
					System.out.print(" ");
				}
			}
			int moreGap = 0;
			if (child.children.size() > 1 && nCount == 0) {
				moreGap = pStack.pop() + 1;
				alreadyPoped = true;
			}
			childWidth = child.showTree(firstNodeFlag2,level+1,xPos,moreGap,pStack);
			firstNodeFlag2 = false;
			if (maxWidth < childWidth) maxWidth = childWidth;
		}
		if (firstNodeFlag1) System.out.println();
		if (alreadyPoped == false) pStack.pop();
		return maxWidth;
	}
}
