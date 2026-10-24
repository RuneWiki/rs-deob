package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotType;

@ObfuscatedName("ab")
public final class ClientProj extends ModelSource {

	@ObfuscatedName("ab.g")
	public SpotType spotanim;

	@ObfuscatedName("ab.h")
	public int level;

	@ObfuscatedName("ab.i")
	public int srcX;

	@ObfuscatedName("ab.j")
	public int srcZ;

	@ObfuscatedName("ab.k")
	public int h1;

	@ObfuscatedName("ab.l")
	public int h2;

	@ObfuscatedName("ab.m")
	public int t1;

	@ObfuscatedName("ab.n")
	public int t2;

	@ObfuscatedName("ab.o")
	public int angle;

	@ObfuscatedName("ab.p")
	public int startpos;

	@ObfuscatedName("ab.q")
	public int endpos;

	@ObfuscatedName("ab.r")
	public boolean mobile = false;

	@ObfuscatedName("ab.s")
	public double x;

	@ObfuscatedName("ab.t")
	public double z;

	@ObfuscatedName("ab.u")
	public double y;

	@ObfuscatedName("ab.v")
	public double velocityX;

	@ObfuscatedName("ab.w")
	public double velocityZ;

	@ObfuscatedName("ab.x")
	public double velocity;

	@ObfuscatedName("ab.y")
	public double velocityY;

	@ObfuscatedName("ab.z")
	public double accelerationY;

	@ObfuscatedName("ab.A")
	public int yaw;

	@ObfuscatedName("ab.B")
	public int pitch;

	@ObfuscatedName("ab.C")
	public int animFrame;

	@ObfuscatedName("ab.D")
	public int animCycle;

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		spotanim = SpotType.list[arg9];
		level = arg4;
		srcX = arg10;
		srcZ = arg2;
		h1 = arg8;
		t1 = arg6;
		t2 = arg3;
		angle = arg1;
		startpos = arg7;
		endpos = arg5;
		h2 = arg0;
		mobile = false;
	}

	@ObfuscatedName("ab.a(IIIII)V")
	public final void setTarget(int arg0, int arg1, int arg2, int arg3) {
		if (!mobile) {
			double var5 = (double) (arg2 - srcX);
			double var7 = (double) (arg1 - srcZ);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			x = startpos * var5 / var9 + srcX;
			z = startpos * var7 / var9 + srcZ;
			y = h1;
		}

		double var11 = (double) (t2 + 1 - arg3);
		velocityX = (arg2 - x) / var11;
		velocityZ = (arg1 - z) / var11;
		velocity = Math.sqrt(velocityZ * velocityZ + velocityX * velocityX);
		if (!mobile) {
			velocityY = -velocity * Math.tan(angle * 0.02454369D);
		}

		accelerationY = (arg0 - y - velocityY * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("ab.a(BI)V")
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
			while (animCycle > spotanim.seq.delay[animFrame]) {
				animCycle -= spotanim.seq.delay[animFrame] + 1;
				animFrame++;
				if (animFrame >= spotanim.seq.numFrames) {
					animFrame = 0;
				}
			}
		}
	}

	@ObfuscatedName("ab.a(Z)Leb;")
	public final Model getTempModel() {
		Model var1 = spotanim.getTempModel2();
		Model var2 = new Model(var1, true, !spotanim.animateTransparencies, false);
		if (spotanim.seq != null) {
			var2.prepareAnim();
			var2.animate(spotanim.seq.frames[animFrame]);
			var2.labelFaces = null;
			var2.labelVertices = null;
		}

		if (spotanim.resizeh != 128 || spotanim.resizev != 128) {
			var2.resize(spotanim.resizeh, spotanim.resizev, spotanim.resizeh);
		}

		var2.rotateXAxis(pitch);
		var2.calculateNormals(spotanim.ambient + 64, spotanim.contrast + 850, -30, -50, -30, true);
		return var2;
	}
}
