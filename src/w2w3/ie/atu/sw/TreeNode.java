package w2w3.ie.atu.sw;

public interface TreeNode<T> {
    // e.g. TreeNode<String>, TreeNode<int>, TreeNode<Student>
    public T getValue();
    public void setValue(T value);
    public boolean isRoot();
    public boolean isLeaf();
    public TreeNode<T> getParent();
    public TreeNode<T>[] children();
    public boolean addChild(TreeNode<T> child);
    public boolean removeChild(TreeNode<T> child);
    public boolean hasChild(TreeNode<T> child);
    public boolean hasSibling();
    public TreeNode<T>[] siblings();

}
