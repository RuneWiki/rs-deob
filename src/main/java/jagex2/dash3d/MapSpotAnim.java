package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotType;

@ObfuscatedName("bb")
public final class MapSpotAnim extends ModelSource {

	@ObfuscatedName("bb.g")
	public SpotType type;

	@ObfuscatedName("bb.h")
	public int startCycle;

	@ObfuscatedName("bb.i")
	public int level;

	@ObfuscatedName("bb.j")
	public int x;

	@ObfuscatedName("bb.k")
	public int z;

	@ObfuscatedName("bb.l")
	public int y;

	@ObfuscatedName("bb.m")
	public int animFrame;

	@ObfuscatedName("bb.n")
	public int animCycle;

	@ObfuscatedName("bb.o")
	public boolean animComplete = false;

	public MapSpotAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		type = SpotType.list[arg1];
		level = arg5;
		x = arg0;
		z = arg2;
		y = arg4;
		startCycle = arg3 + arg6;
		animComplete = false;
	}

	@ObfuscatedName("bb.a(II)V")
	public final void update(int arg0) {
		animCycle += arg0;
		while (animCycle > type.seq.delay[animFrame]) {
			animCycle -= type.seq.delay[animFrame] + 1;
			animFrame++;
			if (animFrame >= type.seq.numFrames && (animFrame < 0 || animFrame >= type.seq.numFrames)) {
				animFrame = 0;
				animComplete = true;
			}
		}
	}

	@ObfuscatedName("bb.a(Z)Leb;")
	public final Model getTempModel() {
		Model var1 = type.getTempModel2();
		Model var2 = new Model(var1, true, !type.animateTransparencies, false);
		if (!animComplete) {
			var2.prepareAnim();
			var2.animate(type.seq.frames[animFrame]);
			var2.labelFaces = null;
			var2.labelVertices = null;
		}

		if (type.resizeh != 128 || type.resizev != 128) {
			var2.resize(type.resizeh, type.resizev, type.resizeh);
		}

		if (type.angle != 0) {
			if (type.angle == 90) {
				var2.rotate90();
			}

			if (type.angle == 180) {
				var2.rotate90();
				var2.rotate90();
			}

			if (type.angle == 270) {
				var2.rotate90();
				var2.rotate90();
				var2.rotate90();
			}
		}

		var2.calculateNormals(type.ambient + 64, type.contrast + 850, -30, -50, -30, true);
		return var2;
	}
}
