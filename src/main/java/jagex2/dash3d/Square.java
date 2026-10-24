package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;

@ObfuscatedName("v")
public final class Square extends Linkable {

	@ObfuscatedName("v.f")
	public int level;

	@ObfuscatedName("v.g")
	public int x;

	@ObfuscatedName("v.h")
	public int z;

	@ObfuscatedName("v.i")
	public int originalLevel;

	@ObfuscatedName("v.j")
	public QuickGround quickGround;

	@ObfuscatedName("v.k")
	public Ground ground;

	@ObfuscatedName("v.l")
	public Wall wall;

	@ObfuscatedName("v.m")
	public Decor decor;

	@ObfuscatedName("v.n")
	public GroundDecor groundDecor;

	@ObfuscatedName("v.o")
	public GroundObject groundObject;

	@ObfuscatedName("v.p")
	public int spriteCount;

	@ObfuscatedName("v.q")
	public Sprite[] sprites = new Sprite[5];

	@ObfuscatedName("v.r")
	public int[] spriteSpan = new int[5];

	@ObfuscatedName("v.s")
	public int spriteSpans;

	@ObfuscatedName("v.t")
	public int drawLevel;

	@ObfuscatedName("v.u")
	public boolean drawFront;

	@ObfuscatedName("v.v")
	public boolean drawBack;

	@ObfuscatedName("v.w")
	public boolean drawSprites;

	@ObfuscatedName("v.x")
	public int cornerSides;

	@ObfuscatedName("v.y")
	public int sidesBeforeCorner;

	@ObfuscatedName("v.z")
	public int sidesAfterCorner;

	@ObfuscatedName("v.A")
	public int backWallTypes;

	@ObfuscatedName("v.B")
	public Square linkedSquare;

	public Square(int arg0, int arg1, int arg2) {
		originalLevel = level = arg0;
		x = arg1;
		z = arg2;
	}
}
