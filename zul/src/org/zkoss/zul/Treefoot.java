/* Treefoot.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Fri Jan 19 15:36:05     2007, Created by tomyeh
}}IS_NOTE

Copyright (C) 2007 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.zul;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.UiException;

import org.zkoss.zul.impl.XulElement;

/**
 * A row of {@link Treefooter}.
 *
 * <p>Like {@link Treecols}, each tree has at most one {@link Treefoot}.
 *
 * @author tomyeh
 */
public class Treefoot extends XulElement {
	/** Returns the tree that it belongs to.
	 */
	public Tree getTree() {
		return (Tree)getParent();
	}

	//-- Component --//
	public void setParent(Component parent) {
		if (parent != null && !(parent instanceof Tree))
			throw new UiException("Wrong parent: "+parent);
		super.setParent(parent);
	}
	public boolean insertBefore(Component child, Component insertBefore) {
		if (!(child instanceof Treefooter))
			throw new UiException("Unsupported child for treefoot: "+child);
		return super.insertBefore(child, insertBefore);
	}
}
