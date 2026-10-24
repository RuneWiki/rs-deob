package jagex2.dash3d.type;

import deob.ObfuscatedName;

@ObfuscatedName("XPBACSMK")
public final class TileUnderlay {

	@ObfuscatedName("XPBACSMK.f")
	public boolean flat = true;

	@ObfuscatedName("XPBACSMK.a")
	public int southwestColor;

	@ObfuscatedName("XPBACSMK.b")
	public int southeastColor;

	@ObfuscatedName("XPBACSMK.c")
	public int northeastColor;

	@ObfuscatedName("XPBACSMK.d")
	public int northwestColor;

	@ObfuscatedName("XPBACSMK.e")
	public int textureId;

	@ObfuscatedName("XPBACSMK.g")
	public int rgb;

	public TileUnderlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		southwestColor = arg0;
		southeastColor = arg1;
		northeastColor = arg2;
		northwestColor = arg3;
		textureId = arg4;
		rgb = arg5;
		flat = arg6;
	}
}
