package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;
import jagex2.graphics.Model;
import jagex2.graphics.VertexNormal;

@ObfuscatedName("XHHRODPC")
public class Entity extends DoublyLinkable {

	@ObfuscatedName("XHHRODPC.k")
	public int minY = 1000;

	@ObfuscatedName("XHHRODPC.j")
	public VertexNormal[] vertexNormal;

	@ObfuscatedName("XHHRODPC.a(IIIIIIIII)V")
	public void draw(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Model var10 = getModel();
		if (var10 != null) {
			minY = var10.minY;
			var10.draw(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@ObfuscatedName("XHHRODPC.a(I)LZKARKDQW;")
	public Model getModel() {
		return null;
	}
}
