package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotType;

@ObfuscatedName("eb")
public final class ClientProj extends ModelSource {

	@ObfuscatedName("eb.o")
	public SpotType spotanim;

	@ObfuscatedName("eb.p")
	public int level;

	@ObfuscatedName("eb.q")
	public int srcX;

	@ObfuscatedName("eb.r")
	public int srcZ;

	@ObfuscatedName("eb.s")
	public int h1;

	@ObfuscatedName("eb.t")
	public int h2;

	@ObfuscatedName("eb.u")
	public int t1;

	@ObfuscatedName("eb.v")
	public int t2;

	@ObfuscatedName("eb.w")
	public int angle;

	@ObfuscatedName("eb.x")
	public int startpos;

	@ObfuscatedName("eb.y")
	public int endpos;

	@ObfuscatedName("eb.z")
	public boolean mobile = false;

	@ObfuscatedName("eb.A")
	public double x;

	@ObfuscatedName("eb.B")
	public double z;

	@ObfuscatedName("eb.C")
	public double y;

	@ObfuscatedName("eb.D")
	public double velocityX;

	@ObfuscatedName("eb.E")
	public double velocityZ;

	@ObfuscatedName("eb.F")
	public double velocity;

	@ObfuscatedName("eb.G")
	public double velocityY;

	@ObfuscatedName("eb.H")
	public double accelerationY;

	@ObfuscatedName("eb.I")
	public int yaw;

	@ObfuscatedName("eb.J")
	public int pitch;

	@ObfuscatedName("eb.K")
	public int animFrame;

	@ObfuscatedName("eb.L")
	public int animCycle;

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		spotanim = SpotType.list[arg1];
		level = arg0;
		srcX = arg6;
		srcZ = arg9;
		h1 = arg4;
		t1 = arg2;
		t2 = arg3;
		angle = arg7;
		startpos = arg10;
		endpos = arg8;
		h2 = arg5;
		mobile = false;
	}

	@ObfuscatedName("eb.a(IIBII)V")
	public final void setTarget(int arg0, int arg1, int arg2, int arg3) {
		if (!mobile) {
			double var5 = (double) (arg2 - srcX);
			double var7 = (double) (arg0 - srcZ);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			x = startpos * var5 / var9 + srcX;
			z = startpos * var7 / var9 + srcZ;
			y = h1;
		}

		double var11 = (double) (t2 + 1 - arg3);
		velocityX = (arg2 - x) / var11;
		velocityZ = (arg0 - z) / var11;
		velocity = Math.sqrt(velocityZ * velocityZ + velocityX * velocityX);
		if (!mobile) {
			velocityY = -velocity * Math.tan(angle * 0.02454369D);
		}

		accelerationY = (arg1 - y - velocityY * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("eb.a(II)V")
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

	@ObfuscatedName("eb.a(I)Lfb;")
	public final Model getTempModel() {
		Model var1 = spotanim.getTempModel2();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (spotanim.seq != null) {
			var2 = spotanim.seq.frames[animFrame];
		}

		Model var3 = new Model(AnimFrame.animateTransparencies(var2), false, true, var1);
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
