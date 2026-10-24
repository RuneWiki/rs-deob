package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SeqType;

@ObfuscatedName("y")
public class ClientEntity extends ModelSource {

	@ObfuscatedName("y.o")
	public int x;

	@ObfuscatedName("y.p")
	public int z;

	@ObfuscatedName("y.q")
	public int yaw;

	@ObfuscatedName("y.r")
	public boolean needsForwardDrawPadding = false;

	@ObfuscatedName("y.s")
	public int size = 1;

	@ObfuscatedName("y.t")
	public int readyanim = -1;

	@ObfuscatedName("y.u")
	public int turnanim = -1;

	@ObfuscatedName("y.v")
	public int walkanim = -1;

	@ObfuscatedName("y.w")
	public int walkanim_b = -1;

	@ObfuscatedName("y.x")
	public int walkanim_l = -1;

	@ObfuscatedName("y.y")
	public int walkanim_r = -1;

	@ObfuscatedName("y.z")
	public int runanim = -1;

	@ObfuscatedName("y.ab")
	public int exactStartX;

	@ObfuscatedName("y.bb")
	public int exactEndX;

	@ObfuscatedName("y.cb")
	public int exactStartZ;

	@ObfuscatedName("y.db")
	public int exactEndZ;

	@ObfuscatedName("y.eb")
	public int exactMoveEnd;

	@ObfuscatedName("y.fb")
	public int exactMoveStart;

	@ObfuscatedName("y.gb")
	public int exactMoveFacing;

	@ObfuscatedName("y.hb")
	public int cycle;

	@ObfuscatedName("y.ib")
	public int height = 200;

	@ObfuscatedName("y.jb")
	public int dstYaw;

	@ObfuscatedName("y.kb")
	public int turnspeed = 32;

	@ObfuscatedName("y.lb")
	public int routeLength;

	@ObfuscatedName("y.mb")
	public int[] routeX = new int[10];

	@ObfuscatedName("y.nb")
	public int[] routeZ = new int[10];

	@ObfuscatedName("y.ob")
	public boolean[] routeRun = new boolean[10];

	@ObfuscatedName("y.pb")
	public int animDelayMove;

	@ObfuscatedName("y.qb")
	public int preanimRouteLength;

	@ObfuscatedName("y.B")
	public int chatTimer = 100;

	@ObfuscatedName("y.E")
	public int[] damageValues = new int[4];

	@ObfuscatedName("y.F")
	public int[] damageTypes = new int[4];

	@ObfuscatedName("y.G")
	public int[] damageCycles = new int[4];

	@ObfuscatedName("y.H")
	public int combatCycle = -1000;

	@ObfuscatedName("y.K")
	public int faceEntity = -1;

	@ObfuscatedName("y.N")
	public int secondaryAnim = -1;

	@ObfuscatedName("y.Q")
	public int primaryAnim = -1;

	@ObfuscatedName("y.V")
	public int spotanimId = -1;

	@ObfuscatedName("y.C")
	public int chatColour;

	@ObfuscatedName("y.D")
	public int chatEffect;

	@ObfuscatedName("y.I")
	public int health;

	@ObfuscatedName("y.J")
	public int totalHealth;

	@ObfuscatedName("y.L")
	public int faceSquareX;

	@ObfuscatedName("y.M")
	public int faceSquareZ;

	@ObfuscatedName("y.O")
	public int secondaryFrame;

	@ObfuscatedName("y.P")
	public int secondaryAnimCycle;

	@ObfuscatedName("y.R")
	public int primaryFrame;

	@ObfuscatedName("y.S")
	public int primaryAnimCycle;

	@ObfuscatedName("y.T")
	public int primaryAnimDelay;

	@ObfuscatedName("y.U")
	public int primaryAnimLoop;

	@ObfuscatedName("y.W")
	public int spotanimFrame;

	@ObfuscatedName("y.X")
	public int spotanimCycle;

	@ObfuscatedName("y.Y")
	public int spotanimLastCycle;

	@ObfuscatedName("y.Z")
	public int spotanimHeight;

	@ObfuscatedName("y.A")
	public String chatMessage;

	@ObfuscatedName("y.a(IZIB)V")
	public final void teleport(int arg0, boolean arg1, int arg2) {
		if (primaryAnim != -1 && SeqType.list[primaryAnim].postanim_move == 1) {
			primaryAnim = -1;
		}

		if (!arg1) {
			int var4 = arg0 - routeX[0];
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

				routeX[0] = arg0;
				routeZ[0] = arg2;
				routeRun[0] = false;
				return;
			}
		}

		routeLength = 0;
		preanimRouteLength = 0;
		animDelayMove = 0;
		routeX[0] = arg0;
		routeZ[0] = arg2;
		x = routeX[0] * 128 + size * 64;
		z = routeZ[0] * 128 + size * 64;
	}

	@ObfuscatedName("y.a(ZII)V")
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

		if (primaryAnim != -1 && SeqType.list[primaryAnim].postanim_move == 1) {
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

	@ObfuscatedName("y.a(Z)V")
	public final void abortRoute() {
		routeLength = 0;
		preanimRouteLength = 0;
	}

	@ObfuscatedName("y.b(Z)Z")
	public boolean isReady() {
		return false;
	}

	@ObfuscatedName("y.a(IIIZ)V")
	public final void addHitmark(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (damageCycles[var4] <= arg1) {
				damageValues[var4] = arg2;
				damageTypes[var4] = arg0;
				damageCycles[var4] = arg1 + 70;
				return;
			}
		}
	}
}
