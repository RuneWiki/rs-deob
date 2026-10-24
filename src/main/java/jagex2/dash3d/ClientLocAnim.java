package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.LocType;
import jagex2.config.SeqType;

@ObfuscatedName("cb")
public class ClientLocAnim extends ModelSource {

	@ObfuscatedName("cb.m")
	public int id;

	@ObfuscatedName("cb.n")
	public int shape;

	@ObfuscatedName("cb.o")
	public int angle;

	@ObfuscatedName("cb.p")
	public int heightSW;

	@ObfuscatedName("cb.q")
	public int heightSE;

	@ObfuscatedName("cb.r")
	public int heightNE;

	@ObfuscatedName("cb.s")
	public int heightNW;

	@ObfuscatedName("cb.t")
	public SeqType anim;

	@ObfuscatedName("cb.u")
	public int animFrame;

	@ObfuscatedName("cb.v")
	public int animCycle;

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
		id = arg3;
		shape = arg0;
		angle = arg1;
		heightSW = arg2;
		heightSE = arg8;
		heightNE = arg4;
		heightNW = arg5;
		anim = SeqType.list[arg7];
		animFrame = 0;
		animCycle = Client.loopCycle;
		if (arg6 && anim.loops != -1) {
			animFrame = (int) (Math.random() * anim.numFrames);
			animCycle -= (int) (Math.random() * anim.getDelay(animFrame));
		}
	}

	@ObfuscatedName("cb.a(I)Lfb;")
	public final Model getTempModel() {
		if (anim != null) {
			int var1 = Client.loopCycle - animCycle;
			if (var1 > 100 && anim.loops > 0) {
				var1 = 100;
			}

			while (var1 > anim.getDelay(animFrame)) {
				var1 -= anim.getDelay(animFrame);
				animFrame++;
				if (animFrame >= anim.numFrames) {
					animFrame -= anim.loops;
					if (animFrame < 0 || animFrame >= anim.numFrames) {
						break;
					}
				}
			}

			anim = null;
			animCycle = Client.loopCycle - var1;
		}

		int var2 = -1;
		if (anim != null) {
			var2 = anim.frames[animFrame];
		}

		LocType var3 = LocType.list(id);
		return var3.getModel(shape, angle, heightSW, heightSE, heightNE, heightNW, var2);
	}
}
