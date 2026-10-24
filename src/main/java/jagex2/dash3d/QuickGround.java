package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("p")
public final class QuickGround {

	@ObfuscatedName("p.a")
	public int colourSW;

	@ObfuscatedName("p.b")
	public int colourSE;

	@ObfuscatedName("p.c")
	public int colourNE;

	@ObfuscatedName("p.d")
	public int colourNW;

	@ObfuscatedName("p.e")
	public int texture;

	@ObfuscatedName("p.f")
	public boolean flat = true;

	@ObfuscatedName("p.g")
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
