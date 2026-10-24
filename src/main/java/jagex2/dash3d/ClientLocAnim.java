package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.LocType;
import jagex2.config.SeqType;
import jagex2.config.VarbitType;

@ObfuscatedName("bb")
public class ClientLocAnim extends ModelSource {

	@ObfuscatedName("bb.m")
	public static Client app;

	@ObfuscatedName("bb.n")
	public int id;

	@ObfuscatedName("bb.o")
	public int shape;

	@ObfuscatedName("bb.p")
	public int angle;

	@ObfuscatedName("bb.q")
	public int heightSW;

	@ObfuscatedName("bb.r")
	public int heightSE;

	@ObfuscatedName("bb.s")
	public int heightNE;

	@ObfuscatedName("bb.t")
	public int heightNW;

	@ObfuscatedName("bb.u")
	public SeqType anim;

	@ObfuscatedName("bb.v")
	public int animFrame;

	@ObfuscatedName("bb.w")
	public int animCycle;

	@ObfuscatedName("bb.x")
	public int multivarbit;

	@ObfuscatedName("bb.y")
	public int[] multiloc;

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
		id = arg1;
		shape = arg2;
		angle = arg0;
		heightSW = arg5;
		heightSE = arg8;
		heightNE = arg4;
		heightNW = arg3;

		if (arg6 != -1) {
			anim = SeqType.list[arg6];
			animFrame = 0;
			animCycle = Client.loopCycle;
			if (arg7 && anim.loops != -1) {
				animFrame = (int) (Math.random() * anim.numFrames);
				animCycle -= (int) (Math.random() * anim.getDelay(animFrame));
			}
		}

		LocType var10 = LocType.list(id);
		multivarbit = var10.multivarbit;
		multiloc = var10.multiloc;
	}

	@ObfuscatedName("bb.a(I)Leb;")
	public final Model getTempModel() {
		int var1 = -1;
		if (anim != null) {
			int var2 = Client.loopCycle - animCycle;
			if (var2 > 100 && anim.loops > 0) {
				var2 = 100;
			}

			while (var2 > anim.getDelay(animFrame)) {
				var2 -= anim.getDelay(animFrame);
				animFrame++;
				if (animFrame >= anim.numFrames) {
					animFrame -= anim.loops;
					if (animFrame < 0 || animFrame >= anim.numFrames) {
						break;
					}
				}
			}

			anim = null;
			animCycle = Client.loopCycle - var2;
			var1 = anim.frames[animFrame];
		}

		LocType var9;
		if (multiloc == null) {
			var9 = LocType.list(id);
		} else {
			VarbitType var3 = VarbitType.list[multivarbit];
			int var4 = var3.basevar;
			int var5 = var3.startbit;
			int var6 = var3.endbit;
			int var7 = Client.readbit[var6 - var5];
			int var8 = app.var[var4] >> var5 & var7;
			if (var8 < 0 || var8 >= multiloc.length || multiloc[var8] == -1) {
				return null;
			}

			var9 = LocType.list(multiloc[var8]);
		}

		return var9.getModel(shape, angle, heightSW, heightSE, heightNE, heightNW, var1);
	}
}
