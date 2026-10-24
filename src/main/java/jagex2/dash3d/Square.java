package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;

@ObfuscatedName("cb")
public final class Square extends Linkable {

	@ObfuscatedName("cb.e")
	public int level;

	@ObfuscatedName("cb.f")
	public int x;

	@ObfuscatedName("cb.g")
	public int z;

	@ObfuscatedName("cb.h")
	public int originalLevel;

	@ObfuscatedName("cb.i")
	public QuickGround quickGround;

	@ObfuscatedName("cb.j")
	public Ground ground;

	@ObfuscatedName("cb.k")
	public Wall wall;

	@ObfuscatedName("cb.l")
	public Decor decor;

	@ObfuscatedName("cb.m")
	public GroundDecor groundDecor;

	@ObfuscatedName("cb.n")
	public GroundObject groundObject;

	@ObfuscatedName("cb.o")
	public int spriteCount;

	@ObfuscatedName("cb.p")
	public Sprite[] sprites = new Sprite[5];

	@ObfuscatedName("cb.q")
	public int[] spriteSpan = new int[5];

	@ObfuscatedName("cb.r")
	public int spriteSpans;

	@ObfuscatedName("cb.s")
	public int drawLevel;

	@ObfuscatedName("cb.t")
	public boolean drawFront;

	@ObfuscatedName("cb.u")
	public boolean drawBack;

	@ObfuscatedName("cb.v")
	public boolean drawSprites;

	@ObfuscatedName("cb.w")
	public int cornerSides;

	@ObfuscatedName("cb.x")
	public int sidesBeforeCorner;

	@ObfuscatedName("cb.y")
	public int sidesAfterCorner;

	@ObfuscatedName("cb.z")
	public int backWallTypes;

	@ObfuscatedName("cb.A")
	public Square linkedSquare;

	public Square(int arg0, int arg1, int arg2) {
		originalLevel = level = arg0;
		x = arg1;
		z = arg2;
	}
}
