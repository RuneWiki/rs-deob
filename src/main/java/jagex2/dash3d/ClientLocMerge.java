package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;

@ObfuscatedName("mb")
public final class ClientLocMerge extends Linkable {

	@ObfuscatedName("mb.f")
	public int level;

	@ObfuscatedName("mb.g")
	public int layer;

	@ObfuscatedName("mb.h")
	public int x;

	@ObfuscatedName("mb.i")
	public int z;

	@ObfuscatedName("mb.j")
	public int id;

	@ObfuscatedName("mb.k")
	public int angle;

	@ObfuscatedName("mb.l")
	public int shape;

	@ObfuscatedName("mb.m")
	public int endTime;

	public ClientLocMerge(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		level = arg0;
		layer = arg7;
		x = arg6;
		z = arg2;
		id = arg5;
		angle = arg1;
		shape = arg4;
		endTime = arg3;
	}
}
