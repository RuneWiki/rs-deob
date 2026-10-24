package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotType;

@ObfuscatedName("gb")
public final class MapSpotAnim extends ModelSource {

	@ObfuscatedName("gb.o")
	public SpotType type;

	@ObfuscatedName("gb.p")
	public int startCycle;

	@ObfuscatedName("gb.q")
	public int level;

	@ObfuscatedName("gb.r")
	public int x;

	@ObfuscatedName("gb.s")
	public int z;

	@ObfuscatedName("gb.t")
	public int y;

	@ObfuscatedName("gb.u")
	public int animFrame;

	@ObfuscatedName("gb.v")
	public int animCycle;

	@ObfuscatedName("gb.w")
	public boolean animComplete = false;

	public MapSpotAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		type = SpotType.list[arg5];
		level = arg3;
		x = arg4;
		z = arg2;
		y = arg0;
		startCycle = arg1 + arg6;
		animComplete = false;
	}

	@ObfuscatedName("gb.a(II)V")
	public final void update(int arg0) {
		animCycle += arg0;
		while (animCycle > type.seq.getDelay(animFrame)) {
			animCycle -= type.seq.getDelay(animFrame) + 1;
			animFrame++;
			if (animFrame >= type.seq.numFrames && (animFrame < 0 || animFrame >= type.seq.numFrames)) {
				animFrame = 0;
				animComplete = true;
			}
		}
	}

	@ObfuscatedName("gb.a(I)Lfb;")
	public final Model getTempModel() {
		Model var1 = type.getTempModel2();
		if (var1 == null) {
			return null;
		}

		int var2 = type.seq.frames[animFrame];
		Model var3 = new Model(AnimFrame.animateTransparencies(var2), false, true, var1);
		if (!animComplete) {
			var3.prepareAnim();
			var3.animate(var2);
			var3.labelFaces = null;
			var3.labelVertices = null;
		}

		if (type.resizeh != 128 || type.resizev != 128) {
			var3.resize(type.resizeh, type.resizeh, type.resizev);
		}

		if (type.angle != 0) {
			if (type.angle == 90) {
				var3.rotate90();
			}

			if (type.angle == 180) {
				var3.rotate90();
				var3.rotate90();
			}

			if (type.angle == 270) {
				var3.rotate90();
				var3.rotate90();
				var3.rotate90();
			}
		}

		var3.calculateNormals(type.ambient + 64, type.contrast + 850, -30, -50, -30, true);
		return var3;
	}
}
