package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;
import jagex2.graphics.AnimFrame;
import jagex2.graphics.Model;

public class SpotAnimEntity extends Entity {

	@ObfuscatedName("OJEALINP.r")
	public boolean _flowObfuscator1 = true;

	@ObfuscatedName("OJEALINP.s")
	public int _flowObfuscator2 = 9;

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

	public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.type = SpotAnimType.instances[arg4];
		this.level = arg0;
		this.x = arg7;
		this.z = arg6;
		this.y = arg5;
		this.startCycle = arg1 + arg3;
		if (arg2 != 6) {
			throw new NullPointerException();
		}
		this.seqComplete = false;
	}

	@ObfuscatedName("OJEALINP.a(I)LZKARKDQW;")
	public final Model getModel(int arg0) {
		if (arg0 != 4016) {
			throw new NullPointerException();
		}
		Model var2 = this.type.getModel();
		if (var2 == null) {
			return null;
		}
		int var3 = this.type.seq.frames[this.seqFrame];
		Model var4 = new Model(9, true, AnimFrame.isNull(var3, false), false, var2);
		if (!this.seqComplete) {
			var4.createLabelReferences((byte) -71);
			var4.applyTransform(var3, 40542);
			var4.labelFaces = null;
			var4.labelVertices = null;
		}
		if (this.type.resizeh != 128 || this.type.resizev != 128) {
			var4.scale(this.type.resizeh, this.type.resizeh, this._flowObfuscator2, this.type.resizev);
		}
		if (this.type.angle != 0) {
			if (this.type.angle == 90) {
				var4.rotateY90(360);
			}
			if (this.type.angle == 180) {
				var4.rotateY90(360);
				var4.rotateY90(360);
			}
			if (this.type.angle == 270) {
				var4.rotateY90(360);
				var4.rotateY90(360);
				var4.rotateY90(360);
			}
		}
		var4.calculateNormals(this.type.ambient + 64, this.type.contrast + 850, -30, -50, -30, true);
		return var4;
	}

	@ObfuscatedName("OJEALINP.a(IZ)V")
	public final void update(int arg0, boolean arg1) {
		if (!arg1) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		this.seqCycle += arg0;
		while (true) {
			do {
				do {
					if (this.seqCycle <= this.type.seq.getFrameDuration(this.seqFrame, (byte) -39)) {
						return;
					}
					this.seqCycle -= this.type.seq.getFrameDuration(this.seqFrame, (byte) -39) + 1;
					this.seqFrame++;
				} while (this.seqFrame < this.type.seq.frameCount);
			} while (this.seqFrame >= 0 && this.seqFrame < this.type.seq.frameCount);
			this.seqFrame = 0;
			this.seqComplete = true;
		}
	}
}
