package jagex2.dash3d.type;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;

public class Ground extends Linkable {

	@ObfuscatedName("QTKGMFHL.f")
	public int _flowObfuscator3 = -589;

	@ObfuscatedName("QTKGMFHL.r")
	public Location[] locs = new Location[5];

	@ObfuscatedName("QTKGMFHL.s")
	public int[] locSpan = new int[5];

	@ObfuscatedName("QTKGMFHL.g")
	public int level;

	@ObfuscatedName("QTKGMFHL.j")
	public int occludeLevel;

	@ObfuscatedName("QTKGMFHL.h")
	public int x;

	@ObfuscatedName("QTKGMFHL.i")
	public int z;

	@ObfuscatedName("QTKGMFHL.q")
	public int locCount;

	@ObfuscatedName("QTKGMFHL.t")
	public int locSpans;

	@ObfuscatedName("QTKGMFHL.u")
	public int drawLevel;

	@ObfuscatedName("QTKGMFHL.y")
	public int checkLocSpans;

	@ObfuscatedName("QTKGMFHL.z")
	public int blockLocSpans;

	@ObfuscatedName("QTKGMFHL.A")
	public int inverseBlockLocSpans;

	@ObfuscatedName("QTKGMFHL.B")
	public int backWallTypes;

	@ObfuscatedName("QTKGMFHL.p")
	public GroundObject objStack;

	@ObfuscatedName("QTKGMFHL.m")
	public Wall wall;

	@ObfuscatedName("QTKGMFHL.n")
	public Decor wallDecoration;

	@ObfuscatedName("QTKGMFHL.C")
	public Ground bridge;

	@ObfuscatedName("QTKGMFHL.l")
	public TileOverlay overlay;

	@ObfuscatedName("QTKGMFHL.k")
	public TileUnderlay underlay;

	@ObfuscatedName("QTKGMFHL.o")
	public GroundDecor groundDecoration;

	@ObfuscatedName("QTKGMFHL.v")
	public boolean visible;

	@ObfuscatedName("QTKGMFHL.w")
	public boolean update;

	@ObfuscatedName("QTKGMFHL.x")
	public boolean containsLocs;

	public Ground(int arg0, int arg1, int arg2) {
		this.occludeLevel = this.level = arg0;
		this.x = arg1;
		this.z = arg2;
	}
}
