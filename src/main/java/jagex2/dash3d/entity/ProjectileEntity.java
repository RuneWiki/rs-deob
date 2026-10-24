package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;
import jagex2.graphics.AnimFrame;
import jagex2.graphics.Model;

@ObfuscatedName("SWTXAYDT")
public final class ProjectileEntity extends Entity {

	@ObfuscatedName("SWTXAYDT.u")
	public boolean mobile = false;

	@ObfuscatedName("SWTXAYDT.H")
	public SpotAnimType spotanim;

	@ObfuscatedName("SWTXAYDT.M")
	public int level;

	@ObfuscatedName("SWTXAYDT.v")
	public int srcX;

	@ObfuscatedName("SWTXAYDT.w")
	public int srcZ;

	@ObfuscatedName("SWTXAYDT.x")
	public int srcY;

	@ObfuscatedName("SWTXAYDT.m")
	public int startCycle;

	@ObfuscatedName("SWTXAYDT.n")
	public int endCycle;

	@ObfuscatedName("SWTXAYDT.D")
	public int peakPitch;

	@ObfuscatedName("SWTXAYDT.E")
	public int arc;

	@ObfuscatedName("SWTXAYDT.F")
	public int target;

	@ObfuscatedName("SWTXAYDT.y")
	public int offsetY;

	@ObfuscatedName("SWTXAYDT.p")
	public double velocityX;

	@ObfuscatedName("SWTXAYDT.q")
	public double velocityZ;

	@ObfuscatedName("SWTXAYDT.r")
	public double velocity;

	@ObfuscatedName("SWTXAYDT.s")
	public double velocityY;

	@ObfuscatedName("SWTXAYDT.t")
	public double accelerationY;

	@ObfuscatedName("SWTXAYDT.A")
	public double x;

	@ObfuscatedName("SWTXAYDT.B")
	public double z;

	@ObfuscatedName("SWTXAYDT.C")
	public double y;

	@ObfuscatedName("SWTXAYDT.I")
	public int seqFrame;

	@ObfuscatedName("SWTXAYDT.J")
	public int seqCycle;

	@ObfuscatedName("SWTXAYDT.K")
	public int yaw;

	@ObfuscatedName("SWTXAYDT.L")
	public int pitch;

	@ObfuscatedName("SWTXAYDT.a(IIIIB)V")
	public final void updateVelocity(int arg0, int arg1, int arg2, int arg3) {
		if (!mobile) {
			double var5 = (double) (arg3 - srcX);
			double var7 = (double) (arg1 - srcZ);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			x = arc * var5 / var9 + srcX;
			z = arc * var7 / var9 + srcZ;
			y = srcY;
		}

		double var11 = (double) (endCycle + 1 - arg0);
		velocityX = (arg3 - x) / var11;
		velocityZ = (arg1 - z) / var11;
		velocity = Math.sqrt(velocityZ * velocityZ + velocityX * velocityX);
		if (!mobile) {
			velocityY = -velocity * Math.tan(peakPitch * 0.02454369D);
		}

		accelerationY = (arg2 - y - velocityY * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("SWTXAYDT.a(I)LZKARKDQW;")
	public final Model getModel() {
		Model var1 = spotanim.getModel();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (spotanim.seq != null) {
			var2 = spotanim.seq.frames[seqFrame];
		}

		Model var3 = new Model(true, AnimFrame.isNull(var2), false, var1);
		if (var2 != -1) {
			var3.createLabelReferences();
			var3.applyTransform(var2);
			var3.labelFaces = null;
			var3.labelVertices = null;
		}

		if (spotanim.resizeh != 128 || spotanim.resizev != 128) {
			var3.scale(spotanim.resizeh, spotanim.resizeh, spotanim.resizev);
		}

		var3.rotateX(pitch);
		var3.calculateNormals(spotanim.ambient + 64, spotanim.contrast + 850, -30, -50, -30, true);
		return var3;
	}

	public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		spotanim = SpotAnimType.instances[arg10];
		level = arg5;
		srcX = arg8;
		srcZ = arg7;
		srcY = arg6;
		startCycle = arg2;
		endCycle = arg3;
		peakPitch = arg0;
		arc = arg4;
		target = arg9;
		offsetY = arg1;
		mobile = false;
	}

	@ObfuscatedName("SWTXAYDT.a(II)V")
	public final void update(int arg0) {
		mobile = true;
		x += arg0 * velocityX;
		z += arg0 * velocityZ;
		y += accelerationY * 0.5D * arg0 * arg0 + arg0 * velocityY;
		velocityY += arg0 * accelerationY;
		yaw = (int) (Math.atan2(velocityX, velocityZ) * 325.949D) + 1024 & 0x7FF;
		pitch = (int) (Math.atan2(velocityY, velocity) * 325.949D) & 0x7FF;

		if (spotanim.seq != null) {
			seqCycle += arg0;
			while (seqCycle > spotanim.seq.getFrameDuration(seqFrame)) {
				seqCycle -= spotanim.seq.getFrameDuration(seqFrame) + 1;
				seqFrame++;
				if (seqFrame >= spotanim.seq.frameCount) {
					seqFrame = 0;
				}
			}
		}
	}
}
