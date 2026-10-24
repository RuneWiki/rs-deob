package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;

@ObfuscatedName("ZOXDNIET")
public class ModelSource extends DoublyLinkable {

	@ObfuscatedName("ZOXDNIET.k")
	public int field1461 = 1000;

	@ObfuscatedName("ZOXDNIET.j")
	public VertexNormal[] field1460;

	@ObfuscatedName("ZOXDNIET.a(IIIIIIIII)V")
	public void method381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Model var10 = method239();
		if (var10 != null) {
			field1461 = var10.field1461;
			var10.method381(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@ObfuscatedName("ZOXDNIET.a(B)LLZYQDKJV;")
	public Model method239() {
		return null;
	}
}
