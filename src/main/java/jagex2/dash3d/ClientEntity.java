package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SeqType;

@ObfuscatedName("x")
public class ClientEntity extends ModelSource {

	@ObfuscatedName("x.g")
	public int x;

	@ObfuscatedName("x.h")
	public int z;

	@ObfuscatedName("x.i")
	public int yaw;

	@ObfuscatedName("x.j")
	public boolean needsForwardDrawPadding = false;

	@ObfuscatedName("x.k")
	public int size = 1;

	@ObfuscatedName("x.l")
	public int readyanim = -1;

	@ObfuscatedName("x.m")
	public int turnanim = -1;

	@ObfuscatedName("x.n")
	public int walkanim = -1;

	@ObfuscatedName("x.o")
	public int walkanim_b = -1;

	@ObfuscatedName("x.p")
	public int walkanim_l = -1;

	@ObfuscatedName("x.q")
	public int walkanim_r = -1;

	@ObfuscatedName("x.r")
	public int runanim = -1;

	@ObfuscatedName("x.s")
	public String chatMessage;

	@ObfuscatedName("x.t")
	public int chatTimer = 100;

	@ObfuscatedName("x.u")
	public int chatColour;

	@ObfuscatedName("x.v")
	public int chatEffect;

	@ObfuscatedName("x.w")
	public int damageValue;

	@ObfuscatedName("x.x")
	public int damageType;

	@ObfuscatedName("x.y")
	public int combatCycle = -1000;

	@ObfuscatedName("x.z")
	public int health;

	@ObfuscatedName("x.ab")
	public int dstYaw;

	@ObfuscatedName("x.bb")
	public int routeLength;

	@ObfuscatedName("x.cb")
	public int[] routeX = new int[10];

	@ObfuscatedName("x.db")
	public int[] routeZ = new int[10];

	@ObfuscatedName("x.eb")
	public boolean[] routeRun = new boolean[10];

	@ObfuscatedName("x.fb")
	public int animDelayMove;

	@ObfuscatedName("x.B")
	public int faceEntity = -1;

	@ObfuscatedName("x.E")
	public int secondaryAnim = -1;

	@ObfuscatedName("x.H")
	public int primaryAnim = -1;

	@ObfuscatedName("x.M")
	public int spotanimId = -1;

	@ObfuscatedName("x.A")
	public int totalHealth;

	@ObfuscatedName("x.C")
	public int faceSquareX;

	@ObfuscatedName("x.D")
	public int faceSquareZ;

	@ObfuscatedName("x.F")
	public int secondaryFrame;

	@ObfuscatedName("x.G")
	public int secondaryAnimCycle;

	@ObfuscatedName("x.I")
	public int primaryFrame;

	@ObfuscatedName("x.J")
	public int primaryAnimCycle;

	@ObfuscatedName("x.K")
	public int primaryAnimDelay;

	@ObfuscatedName("x.L")
	public int primaryAnimLoop;

	@ObfuscatedName("x.N")
	public int spotanimFrame;

	@ObfuscatedName("x.O")
	public int spotanimCycle;

	@ObfuscatedName("x.P")
	public int spotanimLastCycle;

	@ObfuscatedName("x.Q")
	public int spotanimHeight;

	@ObfuscatedName("x.R")
	public int exactStartX;

	@ObfuscatedName("x.S")
	public int exactEndX;

	@ObfuscatedName("x.T")
	public int exactStartZ;

	@ObfuscatedName("x.U")
	public int exactEndZ;

	@ObfuscatedName("x.V")
	public int exactMoveEnd;

	@ObfuscatedName("x.W")
	public int exactMoveStart;

	@ObfuscatedName("x.X")
	public int exactMoveFacing;

	@ObfuscatedName("x.Y")
	public int cycle;

	@ObfuscatedName("x.Z")
	public int height;

	@ObfuscatedName("x.a(ZZII)V")
	public final void teleport(boolean arg0, int arg1, int arg2) {
		if (primaryAnim != -1 && SeqType.list[primaryAnim].priority <= 1) {
			primaryAnim = -1;
		}

		if (!arg0) {
			int var4 = arg1 - routeX[0];
			int var5 = arg2 - routeZ[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (routeLength < 9) {
					routeLength++;
				}

				for (int var6 = routeLength; var6 > 0; var6--) {
					routeX[var6] = routeX[var6 - 1];
					routeZ[var6] = routeZ[var6 - 1];
					routeRun[var6] = routeRun[var6 - 1];
				}

				routeX[0] = arg1;
				routeZ[0] = arg2;
				routeRun[0] = false;
				return;
			}
		}

		routeLength = 0;
		animDelayMove = 0;
		routeX[0] = arg1;
		routeZ[0] = arg2;
		x = routeX[0] * 128 + size * 64;
		z = routeZ[0] * 128 + size * 64;
	}

	@ObfuscatedName("x.a(ZIB)V")
	public final void moveCode(boolean arg0, int arg1) {
		int var3 = routeX[0];
		int var4 = routeZ[0];
		if (arg1 == 0) {
			var3--;
			var4++;
		}

		if (arg1 == 1) {
			var4++;
		}

		if (arg1 == 2) {
			var3++;
			var4++;
		}

		if (arg1 == 3) {
			var3--;
		}

		if (arg1 == 4) {
			var3++;
		}

		if (arg1 == 5) {
			var3--;
			var4--;
		}

		if (arg1 == 6) {
			var4--;
		}

		if (arg1 == 7) {
			var3++;
			var4--;
		}

		if (primaryAnim != -1 && SeqType.list[primaryAnim].priority <= 1) {
			primaryAnim = -1;
		}

		if (routeLength < 9) {
			routeLength++;
		}

		for (int var5 = routeLength; var5 > 0; var5--) {
			routeX[var5] = routeX[var5 - 1];
			routeZ[var5] = routeZ[var5 - 1];
			routeRun[var5] = routeRun[var5 - 1];
		}

		routeX[0] = var3;
		routeZ[0] = var4;
		routeRun[0] = arg0;
	}

	@ObfuscatedName("x.b(Z)Z")
	public boolean isReady() {
		return false;
	}
}
