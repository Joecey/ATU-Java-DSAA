package w4.ie.atu.sw;

import java.util.List;

public interface TreeNode<T> {
    // e.g. TreeNode<String>, TreeNode<int>, TreeNode<Student>
    public T getValue();
    public void setValue(T value);
    public boolean isRoot();
    public boolean isLeaf();
    public TreeNode<T> getParent();
    public List<TreeNode<T>> children();
    public void addChild(TreeNode<T> child);
    public void removeChild(TreeNode<T> child);
    public boolean hasChild(TreeNode<T> child);
    public boolean hasSibling();
    public List<TreeNode<T>> siblings();

}
