package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.LocType;
import jagex2.config.SeqType;

@ObfuscatedName("bb")
public class ClientLocAnim extends ModelSource {

	@ObfuscatedName("bb.o")
	public int id;

	@ObfuscatedName("bb.p")
	public int shape;

	@ObfuscatedName("bb.q")
	public int angle;

	@ObfuscatedName("bb.r")
	public int heightSW;

	@ObfuscatedName("bb.s")
	public int heightSE;

	@ObfuscatedName("bb.t")
	public int heightNE;

	@ObfuscatedName("bb.u")
	public int heightNW;

	@ObfuscatedName("bb.v")
	public SeqType anim;

	@ObfuscatedName("bb.w")
	public int animFrame;

	@ObfuscatedName("bb.x")
	public int animCycle;

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
		id = arg3;
		shape = arg0;
		angle = arg1;
		heightSW = arg8;
		heightSE = arg6;
		heightNE = arg4;
		heightNW = arg7;
		anim = SeqType.list[arg2];
		animFrame = 0;
		animCycle = Client.loopCycle;
		if (arg5 && anim.loops != -1) {
			animFrame = (int) (Math.random() * anim.numFrames);
			animCycle -= (int) (Math.random() * anim.getDelay(animFrame));
		}
	}

	@ObfuscatedName("bb.a(Z)Leb;")
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
