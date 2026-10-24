package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import deob.client;
import jagex2.config.LocType;
import jagex2.config.SeqType;
import jagex2.config.VarbitType;
import jagex2.graphics.Model;

@ObfuscatedName("WBWOBAFW")
public class LocEntity extends Entity {

	@ObfuscatedName("WBWOBAFW.y")
	public int type;

	@ObfuscatedName("WBWOBAFW.z")
	public int shape;

	@ObfuscatedName("WBWOBAFW.A")
	public int rotation;

	@ObfuscatedName("WBWOBAFW.r")
	public int heightmapSW;

	@ObfuscatedName("WBWOBAFW.s")
	public int heightmapSE;

	@ObfuscatedName("WBWOBAFW.t")
	public int heightmapNE;

	@ObfuscatedName("WBWOBAFW.u")
	public int heightmapNW;

	@ObfuscatedName("WBWOBAFW.v")
	public SeqType anim;

	@ObfuscatedName("WBWOBAFW.n")
	public int animFrame;

	@ObfuscatedName("WBWOBAFW.w")
	public int animCycle;

	@ObfuscatedName("WBWOBAFW.p")
	public int multivarbit;

	@ObfuscatedName("WBWOBAFW.q")
	public int mutlivarp;

	@ObfuscatedName("WBWOBAFW.o")
	public int[] multiloc;

	@ObfuscatedName("WBWOBAFW.x")
	public static client varProvider;

	@ObfuscatedName("WBWOBAFW.a(I)LZKARKDQW;")
	public final Model getModel() {
		int var1 = -1;
		if (anim != null) {
			int var2 = client.loopCycle - animCycle;
			if (var2 > 100 && anim.replayoff > 0) {
				var2 = 100;
			}

			while (var2 > anim.getFrameDuration(animFrame)) {
				var2 -= anim.getFrameDuration(animFrame);
				animFrame++;
				if (animFrame >= anim.frameCount) {
					animFrame -= anim.replayoff;
					if (animFrame < 0 || animFrame >= anim.frameCount) {
						break;
					}
				}
			}

			anim = null;
			animCycle = client.loopCycle - var2;

			if (anim != null) {
				var1 = anim.frames[animFrame];
			}
		}

		LocType var3;
		if (multiloc == null) {
			var3 = LocType.get(type);
		} else {
			var3 = getMultiLoc();
		}

		if (var3 == null) {
			return null;
		}

		return var3.getModel(shape, rotation, heightmapSW, heightmapSE, heightmapNE, heightmapNW, var1);
	}

	@ObfuscatedName("WBWOBAFW.a(Z)LYZDBYLRM;")
	public final LocType getMultiLoc() {
		int var1 = -1;
		if (multivarbit != -1) {
			VarbitType var2 = VarbitType.instances[multivarbit];
			int var3 = var2.basevar;
			int var4 = var2.startbit;
			int var5 = var2.endbit;
			int var6 = client.BITMASK[var5 - var4];
			var1 = varProvider.varps[var3] >> var4 & var6;
		} else if (mutlivarp != -1) {
			var1 = varProvider.varps[mutlivarp];
		}

		if (var1 >= 0 && var1 < multiloc.length && multiloc[var1] != -1) {
			return LocType.get(multiloc[var1]);
		}

		return null;
	}

	public LocEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
		type = arg0;
		shape = arg2;
		rotation = arg1;
		heightmapSW = arg5;
		heightmapSE = arg3;
		heightmapNE = arg4;
		heightmapNW = arg6;

		if (arg7 != -1) {
			anim = SeqType.instances[arg7];
			animFrame = 0;
			animCycle = client.loopCycle;
			if (arg8 && anim.replayoff != -1) {
				animFrame = (int) (Math.random() * anim.frameCount);
				animCycle -= (int) (Math.random() * anim.getFrameDuration(animFrame));
			}
		}

		LocType var10 = LocType.get(type);
		multivarbit = var10.multivarbit;
		mutlivarp = var10.multivarp;
		multiloc = var10.multiloc;
	}
}
