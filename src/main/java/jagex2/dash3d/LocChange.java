package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;

@ObfuscatedName("nb")
public final class LocChange extends Linkable {

	@ObfuscatedName("nb.f")
	public int level;

	@ObfuscatedName("nb.g")
	public int layer;

	@ObfuscatedName("nb.h")
	public int x;

	@ObfuscatedName("nb.i")
	public int z;

	@ObfuscatedName("nb.j")
	public int oldType;

	@ObfuscatedName("nb.k")
	public int oldAngle;

	@ObfuscatedName("nb.l")
	public int oldShape;

	@ObfuscatedName("nb.m")
	public int newType;

	@ObfuscatedName("nb.n")
	public int newAngle;

	@ObfuscatedName("nb.o")
	public int newShape;

	@ObfuscatedName("nb.p")
	public int startTime;

	@ObfuscatedName("nb.q")
	public int endTime = -1;
}
