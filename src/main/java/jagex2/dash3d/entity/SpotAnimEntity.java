package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;
import jagex2.graphics.AnimFrame;
import jagex2.graphics.Model;

@ObfuscatedName("OJEALINP")
public final class SpotAnimEntity extends Entity {

	@ObfuscatedName("OJEALINP.t")
	public boolean seqComplete = false;

	@ObfuscatedName("OJEALINP.u")
	public SpotAnimType type;

	@ObfuscatedName("OJEALINP.m")
	public int level;

	@ObfuscatedName("OJEALINP.n")
	public int x;

	@ObfuscatedName("OJEALINP.o")
	public int z;

	@ObfuscatedName("OJEALINP.p")
	public int y;

	@ObfuscatedName("OJEALINP.q")
	public int startCycle;

	@ObfuscatedName("OJEALINP.v")
	public int seqFrame;

	@ObfuscatedName("OJEALINP.w")
	public int seqCycle;

	public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		type = SpotAnimType.instances[arg3];
		level = arg0;
		x = arg6;
		z = arg5;
		y = arg4;
		startCycle = arg1 + arg2;
		seqComplete = false;
	}

	@ObfuscatedName("OJEALINP.a(I)LZKARKDQW;")
	public final Model getModel() {
		Model var1 = type.getModel();
		if (var1 == null) {
			return null;
		}

		int var2 = type.seq.frames[seqFrame];
		Model var3 = new Model(true, AnimFrame.isNull(var2), false, var1);
		if (!seqComplete) {
			var3.createLabelReferences();
			var3.applyTransform(var2);
			var3.labelFaces = null;
			var3.labelVertices = null;
		}

		if (type.resizeh != 128 || type.resizev != 128) {
			var3.scale(type.resizeh, type.resizeh, type.resizev);
		}

		if (type.angle != 0) {
			if (type.angle == 90) {
				var3.rotateY90();
			}

			if (type.angle == 180) {
				var3.rotateY90();
				var3.rotateY90();
			}

			if (type.angle == 270) {
				var3.rotateY90();
				var3.rotateY90();
				var3.rotateY90();
			}
		}

		var3.calculateNormals(type.ambient + 64, type.contrast + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("OJEALINP.a(IZ)V")
	public final void update(int arg0) {
		seqCycle += arg0;
		while (seqCycle > type.seq.getFrameDuration(seqFrame)) {
			seqCycle -= type.seq.getFrameDuration(seqFrame) + 1;
			seqFrame++;
			if (seqFrame >= type.seq.frameCount && (seqFrame < 0 || seqFrame >= type.seq.frameCount)) {
				seqFrame = 0;
				seqComplete = true;
			}
		}
	}
}
