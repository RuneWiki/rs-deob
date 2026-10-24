package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("o")
public final class QuickGround {

	@ObfuscatedName("o.a")
	public int colourSW;

	@ObfuscatedName("o.b")
	public int colourSE;

	@ObfuscatedName("o.c")
	public int colourNE;

	@ObfuscatedName("o.d")
	public int colourNW;

	@ObfuscatedName("o.e")
	public int texture;

	@ObfuscatedName("o.f")
	public boolean flat = true;

	@ObfuscatedName("o.g")
	public int minimapRgb;

	public QuickGround(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		colourSW = arg0;
		colourSE = arg1;
		colourNE = arg2;
		colourNW = arg3;
		texture = arg4;
		minimapRgb = arg5;
		flat = arg6;
	}
}
