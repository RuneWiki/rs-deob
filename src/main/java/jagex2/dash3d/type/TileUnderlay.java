package jagex2.dash3d.type;

import deob.ObfuscatedName;

public class TileUnderlay {

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
		this.southwestColor = arg0;
		this.southeastColor = arg1;
		this.northeastColor = arg2;
		this.northwestColor = arg3;
		this.textureId = arg4;
		this.rgb = arg5;
		this.flat = arg6;
	}
}
