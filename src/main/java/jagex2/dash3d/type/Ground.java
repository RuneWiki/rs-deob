package jagex2.dash3d.type;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;

@ObfuscatedName("w")
public final class Ground extends Linkable {

	@ObfuscatedName("w.f")
	public int field339;

	@ObfuscatedName("w.g")
	public int field340;

	@ObfuscatedName("w.h")
	public int field341;

	@ObfuscatedName("w.i")
	public int field342;

	@ObfuscatedName("w.j")
	public TileUnderlay field343;

	@ObfuscatedName("w.k")
	public TileOverlay field344;

	@ObfuscatedName("w.l")
	public Wall field345;

	@ObfuscatedName("w.m")
	public Decor field346;

	@ObfuscatedName("w.n")
	public GroundDecor field347;

	@ObfuscatedName("w.o")
	public GroundObject field348;

	@ObfuscatedName("w.p")
	public int field349;

	@ObfuscatedName("w.q")
	public Location[] field350 = new Location[5];

	@ObfuscatedName("w.r")
	public int[] field351 = new int[5];

	@ObfuscatedName("w.s")
	public int field352;

	@ObfuscatedName("w.t")
	public int field353;

	@ObfuscatedName("w.u")
	public boolean field354;

	@ObfuscatedName("w.v")
	public boolean field355;

	@ObfuscatedName("w.w")
	public boolean field356;

	@ObfuscatedName("w.x")
	public int field357;

	@ObfuscatedName("w.y")
	public int field358;

	@ObfuscatedName("w.z")
	public int field359;

	@ObfuscatedName("w.A")
	public int field360;

	@ObfuscatedName("w.B")
	public Ground field361;

	public Ground(int arg0, int arg1, int arg2) {
		field342 = field339 = arg0;
		field340 = arg1;
		field341 = arg2;
	}
}
