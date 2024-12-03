package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;
import jagex2.graphics.AnimFrame;
import jagex2.graphics.Model;

public class ProjectileEntity extends Entity {

	@ObfuscatedName("SWTXAYDT.o")
	public int _flowObfuscator1 = 9;

	@ObfuscatedName("SWTXAYDT.u")
	public boolean mobile = false;

	@ObfuscatedName("SWTXAYDT.G")
	public boolean _flowObfuscator3 = true;

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

	@ObfuscatedName("SWTXAYDT.z")
	public int _flowObfuscator2;

	@ObfuscatedName("SWTXAYDT.I")
	public int seqFrame;

	@ObfuscatedName("SWTXAYDT.J")
	public int seqCycle;

	@ObfuscatedName("SWTXAYDT.K")
	public int yaw;

	@ObfuscatedName("SWTXAYDT.L")
	public int pitch;

	@ObfuscatedName("SWTXAYDT.a(IIIIB)V")
	public final void updateVelocity(int arg0, int arg1, int arg2, int arg3, byte arg4) {
		if (!this.mobile) {
			double var6 = (double) (arg3 - this.srcX);
			double var8 = (double) (arg1 - this.srcZ);
			double var10 = Math.sqrt(var6 * var6 + var8 * var8);
			this.x = (double) this.arc * var6 / var10 + (double) this.srcX;
			this.z = (double) this.arc * var8 / var10 + (double) this.srcZ;
			this.y = this.srcY;
		}
		double var12 = (double) (this.endCycle + 1 - arg0);
		this.velocityX = ((double) arg3 - this.x) / var12;
		if (arg4 != -83) {
			return;
		}
		this.velocityZ = ((double) arg1 - this.z) / var12;
		this.velocity = Math.sqrt(this.velocityZ * this.velocityZ + this.velocityX * this.velocityX);
		if (!this.mobile) {
			this.velocityY = -this.velocity * Math.tan((double) this.peakPitch * 0.02454369D);
		}
		this.accelerationY = ((double) arg2 - this.y - this.velocityY * var12) * 2.0D / (var12 * var12);
	}

	@ObfuscatedName("SWTXAYDT.a(I)LZKARKDQW;")
	public final Model getModel(int arg0) {
		Model var2 = this.spotanim.getModel();
		if (var2 == null) {
			return null;
		}
		int var3 = -1;
		if (this.spotanim.seq != null) {
			var3 = this.spotanim.seq.frames[this.seqFrame];
		}
		Model var4 = new Model(9, true, AnimFrame.isNull(var3, false), false, var2);
		if (var3 != -1) {
			var4.createLabelReferences((byte) -71);
			var4.applyTransform(var3, 40542);
			var4.labelFaces = null;
			var4.labelVertices = null;
		}
		if (this.spotanim.resizeh != 128 || this.spotanim.resizev != 128) {
			var4.scale(this.spotanim.resizeh, this.spotanim.resizeh, this._flowObfuscator1, this.spotanim.resizev);
		}
		var4.rotateX(this.pitch, 1);
		var4.calculateNormals(this.spotanim.ambient + 64, this.spotanim.contrast + 850, -30, -50, -30, true);
		if (arg0 != 4016) {
			throw new NullPointerException();
		}
		return var4;
	}

	public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		this.spotanim = SpotAnimType.instances[arg11];
		if (arg2 != 46883) {
			this._flowObfuscator3 = !this._flowObfuscator3;
		}
		this.level = arg6;
		this.srcX = arg9;
		this.srcZ = arg8;
		this.srcY = arg7;
		this.startCycle = arg3;
		this.endCycle = arg4;
		this.peakPitch = arg0;
		this.arc = arg5;
		this.target = arg10;
		this.offsetY = arg1;
		this.mobile = false;
	}

	@ObfuscatedName("SWTXAYDT.a(II)V")
	public final void update(int arg0, int arg1) {
		this.mobile = true;
		this.x += (double) arg0 * this.velocityX;
		this.z += (double) arg0 * this.velocityZ;
		this.y += this.accelerationY * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.velocityY;
		this.velocityY += (double) arg0 * this.accelerationY;
		if (arg1 != 0) {
			this._flowObfuscator2 = 16;
		}
		this.yaw = (int) (Math.atan2(this.velocityX, this.velocityZ) * 325.949D) + 1024 & 0x7FF;
		this.pitch = (int) (Math.atan2(this.velocityY, this.velocity) * 325.949D) & 0x7FF;
		if (this.spotanim.seq == null) {
			return;
		}
		this.seqCycle += arg0;
		while (this.seqCycle > this.spotanim.seq.getFrameDuration(this.seqFrame, (byte) -39)) {
			this.seqCycle -= this.spotanim.seq.getFrameDuration(this.seqFrame, (byte) -39) + 1;
			this.seqFrame++;
			if (this.seqFrame >= this.spotanim.seq.frameCount) {
				this.seqFrame = 0;
			}
		}
	}
}
