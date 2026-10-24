package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotType;

@ObfuscatedName("db")
public final class ClientProj extends ModelSource {

	@ObfuscatedName("db.o")
	public SpotType spotanim;

	@ObfuscatedName("db.p")
	public int level;

	@ObfuscatedName("db.q")
	public int srcX;

	@ObfuscatedName("db.r")
	public int srcZ;

	@ObfuscatedName("db.s")
	public int h1;

	@ObfuscatedName("db.t")
	public int h2;

	@ObfuscatedName("db.u")
	public int t1;

	@ObfuscatedName("db.v")
	public int t2;

	@ObfuscatedName("db.w")
	public int angle;

	@ObfuscatedName("db.x")
	public int startpos;

	@ObfuscatedName("db.y")
	public int target;

	@ObfuscatedName("db.z")
	public boolean mobile = false;

	@ObfuscatedName("db.A")
	public double x;

	@ObfuscatedName("db.B")
	public double z;

	@ObfuscatedName("db.C")
	public double y;

	@ObfuscatedName("db.D")
	public double velocityX;

	@ObfuscatedName("db.E")
	public double velocityZ;

	@ObfuscatedName("db.F")
	public double velocity;

	@ObfuscatedName("db.G")
	public double velocityY;

	@ObfuscatedName("db.H")
	public double accelerationY;

	@ObfuscatedName("db.I")
	public int yaw;

	@ObfuscatedName("db.J")
	public int pitch;

	@ObfuscatedName("db.K")
	public int animFrame;

	@ObfuscatedName("db.L")
	public int animCycle;

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		spotanim = SpotType.list[arg3];
		level = arg6;
		srcX = arg4;
		srcZ = arg7;
		h1 = arg1;
		t1 = arg2;
		t2 = arg8;
		angle = arg9;
		startpos = arg0;
		target = arg5;
		h2 = arg10;
		mobile = false;
	}

	@ObfuscatedName("db.a(IZIII)V")
	public final void setTarget(int arg0, int arg1, int arg2, int arg3) {
		if (!mobile) {
			double var5 = (double) (arg3 - srcX);
			double var7 = (double) (arg1 - srcZ);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			x = startpos * var5 / var9 + srcX;
			z = startpos * var7 / var9 + srcZ;
			y = h1;
		}

		double var11 = (double) (t2 + 1 - arg2);
		velocityX = (arg3 - x) / var11;
		velocityZ = (arg1 - z) / var11;
		velocity = Math.sqrt(velocityZ * velocityZ + velocityX * velocityX);
		if (!mobile) {
			velocityY = -velocity * Math.tan(angle * 0.02454369D);
		}

		accelerationY = (arg0 - y - velocityY * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("db.a(II)V")
	public final void move(int arg0) {
		mobile = true;
		x += arg0 * velocityX;
		z += arg0 * velocityZ;
		y += accelerationY * 0.5D * arg0 * arg0 + arg0 * velocityY;
		velocityY += arg0 * accelerationY;
		yaw = (int) (Math.atan2(velocityX, velocityZ) * 325.949D) + 1024 & 0x7FF;
		pitch = (int) (Math.atan2(velocityY, velocity) * 325.949D) & 0x7FF;

		if (spotanim.seq != null) {
			animCycle += arg0;
			while (animCycle > spotanim.seq.getDelay(animFrame)) {
				animCycle -= spotanim.seq.getDelay(animFrame) + 1;
				animFrame++;
				if (animFrame >= spotanim.seq.numFrames) {
					animFrame = 0;
				}
			}
		}
	}

	@ObfuscatedName("db.a(I)Leb;")
	public final Model getTempModel() {
		Model var1 = spotanim.getTempModel2();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (spotanim.seq != null) {
			var2 = spotanim.seq.frames[animFrame];
		}

		Model var3 = new Model(var1, AnimFrame.animateTransparencies(var2), false, true);
		if (var2 != -1) {
			var3.prepareAnim();
			var3.animate(var2);
			var3.labelFaces = null;
			var3.labelVertices = null;
		}

		if (spotanim.resizeh != 128 || spotanim.resizev != 128) {
			var3.resize(spotanim.resizeh, spotanim.resizeh, spotanim.resizev);
		}

		var3.rotateXAxis(pitch);
		var3.calculateNormals(spotanim.ambient + 64, spotanim.contrast + 850, -30, -50, -30, true);
		return var3;
	}
}
