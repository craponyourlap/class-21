package classroom;

class MyNode{
	int value;
	MyNode left;
	MyNode right;
	MyNode(int value){
		this.value = value;
		left = null;
		right = null;
	}
}
class BST{
	MyNode root;
	BST(){
		root = null;
	}
	MyNode putShit(MyNode node, int value) {
		if (node == null) {
			node = new MyNode(value);
			return node;
		}
		if (value < node.value) {
			node.left = putShit(node.left, value);
		}
		else if (value > node.value) {
			node.right = putShit(node.right, value);
		}
		return node;
	}
	
	void printShit(MyNode node, int index) {
		if (node == null) { 
//			System.out.println("there's nothing lol");
			return;
		}
		System.out.println("level "+index+": "+node.value);
		printShit(node.left, index+1);
		printShit(node.right, index+1);
		
	}
}
public class BInarySearchTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst = new BST();
		bst.root = bst.putShit(bst.root, 43);
		bst.putShit(bst.root, 10);
		bst.putShit(bst.root, 79);
		bst.putShit(bst.root, 90);
		bst.putShit(bst.root, 12);
		bst.putShit(bst.root, 54);
		bst.putShit(bst.root, 11);
		bst.putShit(bst.root, 9);
		bst.putShit(bst.root, 50);
		bst.printShit(bst.root, 1);
	}

}
