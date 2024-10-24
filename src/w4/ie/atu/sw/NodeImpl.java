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

    public List<TreeNode<T>> children() {
        return new ArrayList<TreeNode<T>>(this.children);
    }

    public void addChild(TreeNode<T> child) {
        // have some form of uniqueness - prevent duplicate children
        if (indexOf(child) == -1) children.add(child);
    }

    // O(n) time complexity
    private int indexOf(TreeNode<T> child) {
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).getValue().equals(child.getValue())) {
                return i;
            }
        }
        return -1;
    }

    public void removeChild(TreeNode<T> child) {
        int index = indexOf(child);
        if (index >= 0) {
            children.remove(index);
        }
    }

    public boolean hasChild(TreeNode<T> child) {
        // denote the data as our equality measure
        return indexOf(child) >= 0;
    }

    public boolean hasSibling() {
        if (!isRoot()) {
            return parent.children().size() > 1;
        }
        return false;
    }

    public List<TreeNode<T>> siblings() {
        List<TreeNode<T>> siblings = parent.children();

        // this removes the entire node! ideally we want to remove from a copy of the node
        siblings.remove(this);  // don't include this tree node in the list of children


        return siblings;
    }
}
