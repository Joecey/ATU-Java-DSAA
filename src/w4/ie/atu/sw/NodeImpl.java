package w4.ie.atu.sw;
import java.util.*;

public class NodeImpl<T> implements TreeNode<T> {
    private TreeNode<T> parent;
    private List<TreeNode<T>> children = new ArrayList<TreeNode<T>>();
    private T value; // compiler will keep the T here but will change to appropriate type

    public NodeImpl(TreeNode<T> parent, T value) {
        this.parent = parent;
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isRoot() {
        return this.parent == null;
    }

    public boolean isLeaf() {
        return children.isEmpty();
    }

    public TreeNode<T> getParent() {
        return this.parent;
    }

    public  List<TreeNode<T>> children() {
        return this.children;
    }

    public void addChild(TreeNode<T> child) {
        children.add(child);
    }

    public void removeChild(TreeNode<T> child) {
        children.remove(child);
    }

    public boolean hasChild(TreeNode<T> child) {
        return children.contains(child);
    }

    public boolean hasSibling() {
        if (!isRoot()){
            return parent.children().size() > 1;
        }
        return false;
    }

    public List<TreeNode<T>> siblings() {
        List<TreeNode<T>> siblings = parent.children();
        siblings.remove(this);  // don't include this tree node in the list of children

        return siblings;
    }
}
