package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SeqType;
import jagex2.datastruct.Linkable;

@ObfuscatedName("nb")
public final class ClientLocAnim extends Linkable {

	@ObfuscatedName("nb.e")
	public int level;

	@ObfuscatedName("nb.f")
	public int layer;

	@ObfuscatedName("nb.g")
	public int x;

	@ObfuscatedName("nb.h")
	public int z;

	@ObfuscatedName("nb.i")
	public int id;

	@ObfuscatedName("nb.j")
	public SeqType anim;

	@ObfuscatedName("nb.k")
	public int animFrame;

	@ObfuscatedName("nb.l")
	public int animCycle;

	public ClientLocAnim(boolean arg0, int arg1, int arg2, int arg3, SeqType arg4, int arg5, int arg6) {
		level = arg2;
		layer = arg3;
		x = arg6;
		z = arg5;
		id = arg1;
		anim = arg4;
		if (arg0 && arg4.loops != -1) {
			animFrame = (int) (Math.random() * anim.numFrames);
			animCycle = (int) (Math.random() * anim.delay[animFrame]);
		} else {
			animFrame = -1;
			animCycle = 0;
		}
	}
}
