package org.anddev.andengine.extension.physics.box2d.util.triangulation;

import java.util.List;

import com.badlogic.gdx.math.Vector2;

/**
 * @author Nicolas Gramlich
 * @since 20:16:04 - 14.09.2010
 */
public interface ITriangulationAlgoritm {
	// ===========================================================
	// Final Fields
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * @return a {@link List} of {@link Vector2} objects where every three {@link Vector2} objects form a triangle.
	 */
	public List<Vector2> computeTriangles(final List<Vector2> pVertices);
}