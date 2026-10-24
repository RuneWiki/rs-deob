package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;
import jagex2.graphics.Model;

@ObfuscatedName("y")
public class Entity extends DoublyLinkable {

	@ObfuscatedName("y.i")
	public Model.VertexNormal[] field364;

	@ObfuscatedName("y.j")
	public int field365 = 1000;

	@ObfuscatedName("y.a(IIIIIIIII)V")
	public void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Model var10 = method122();
		if (var10 != null) {
			field365 = var10.field365;
			var10.method121(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@ObfuscatedName("y.a(I)Lfb;")
	public Model method122() {
		return null;
	}
}
