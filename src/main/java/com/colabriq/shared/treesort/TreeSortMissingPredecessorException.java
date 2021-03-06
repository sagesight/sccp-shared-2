package com.colabriq.shared.treesort;

public class TreeSortMissingPredecessorException extends IllegalArgumentException {
	private static final long serialVersionUID = 1L;
	
	private final TreeNode<?> node;
	private final Object predecessor;

	public TreeSortMissingPredecessorException(TreeNode<?> node, Object predecessor) {
		super("Missing predecessor node");
		this.node = node;
		this.predecessor = predecessor;
	}
	
	public TreeNode<?> getNode() {
		return node;
	}
	
	public Object getPredecessor() {
		return predecessor;
	}
}
