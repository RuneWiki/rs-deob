package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.SeqType;

@ObfuscatedName("z")
public class ClientEntity extends ModelSource {

	@ObfuscatedName("z.o")
	public int x;

	@ObfuscatedName("z.p")
	public int z;

	@ObfuscatedName("z.q")
	public int yaw;

	@ObfuscatedName("z.r")
	public boolean needsForwardDrawPadding = false;

	@ObfuscatedName("z.s")
	public int size = 1;

	@ObfuscatedName("z.t")
	public int readyanim = -1;

	@ObfuscatedName("z.u")
	public int turnanim = -1;

	@ObfuscatedName("z.v")
	public int walkanim = -1;

	@ObfuscatedName("z.w")
	public int walkanim_b = -1;

	@ObfuscatedName("z.x")
	public int walkanim_l = -1;

	@ObfuscatedName("z.y")
	public int walkanim_r = -1;

	@ObfuscatedName("z.z")
	public int runanim = -1;

	@ObfuscatedName("z.ab")
	public int exactStartX;

	@ObfuscatedName("z.bb")
	public int exactEndX;

	@ObfuscatedName("z.cb")
	public int exactStartZ;

	@ObfuscatedName("z.db")
	public int exactEndZ;

	@ObfuscatedName("z.eb")
	public int exactMoveEnd;

	@ObfuscatedName("z.fb")
	public int exactMoveStart;

	@ObfuscatedName("z.gb")
	public int exactMoveFacing;

	@ObfuscatedName("z.hb")
	public int cycle;

	@ObfuscatedName("z.ib")
	public int height = 200;

	@ObfuscatedName("z.jb")
	public int dstYaw;

	@ObfuscatedName("z.kb")
	public int turnspeed = 32;

	@ObfuscatedName("z.lb")
	public int routeLength;

	@ObfuscatedName("z.mb")
	public int[] routeX = new int[10];

	@ObfuscatedName("z.nb")
	public int[] routeZ = new int[10];

	@ObfuscatedName("z.ob")
	public boolean[] routeRun = new boolean[10];

	@ObfuscatedName("z.pb")
	public int animDelayMove;

	@ObfuscatedName("z.qb")
	public int preanimRouteLength;

	@ObfuscatedName("z.B")
	public int chatTimer = 100;

	@ObfuscatedName("z.E")
	public int[] damageValues = new int[4];

	@ObfuscatedName("z.F")
	public int[] damageTypes = new int[4];

	@ObfuscatedName("z.G")
	public int[] damageCycles = new int[4];

	@ObfuscatedName("z.H")
	public int combatCycle = -1000;

	@ObfuscatedName("z.K")
	public int faceEntity = -1;

	@ObfuscatedName("z.N")
	public int secondaryAnim = -1;

	@ObfuscatedName("z.Q")
	public int primaryAnim = -1;

	@ObfuscatedName("z.V")
	public int spotanimId = -1;

	@ObfuscatedName("z.C")
	public int chatColour;

	@ObfuscatedName("z.D")
	public int chatEffect;

	@ObfuscatedName("z.I")
	public int health;

	@ObfuscatedName("z.J")
	public int totalHealth;

	@ObfuscatedName("z.L")
	public int faceSquareX;

	@ObfuscatedName("z.M")
	public int faceSquareZ;

	@ObfuscatedName("z.O")
	public int secondaryFrame;

	@ObfuscatedName("z.P")
	public int secondaryAnimCycle;

	@ObfuscatedName("z.R")
	public int primaryFrame;

	@ObfuscatedName("z.S")
	public int primaryAnimCycle;

	@ObfuscatedName("z.T")
	public int primaryAnimDelay;

	@ObfuscatedName("z.U")
	public int primaryAnimLoop;

	@ObfuscatedName("z.W")
	public int spotanimFrame;

	@ObfuscatedName("z.X")
	public int spotanimCycle;

	@ObfuscatedName("z.Y")
	public int spotanimLastCycle;

	@ObfuscatedName("z.Z")
	public int spotanimHeight;

	@ObfuscatedName("z.A")
	public String chatMessage;

	@ObfuscatedName("z.a(IIZZ)V")
	public final void teleport(int arg0, int arg1, boolean arg2) {
		if (primaryAnim != -1 && SeqType.list[primaryAnim].postanim_move == 1) {
			primaryAnim = -1;
		}

		if (!arg2) {
			int var4 = arg1 - routeX[0];
			int var5 = arg0 - routeZ[0];
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
				routeZ[0] = arg0;
				routeRun[0] = false;
				return;
			}
		}

		routeLength = 0;
		preanimRouteLength = 0;
		animDelayMove = 0;
		routeX[0] = arg1;
		routeZ[0] = arg0;
		x = routeX[0] * 128 + size * 64;
		z = routeZ[0] * 128 + size * 64;
	}

	@ObfuscatedName("z.a(ZIB)V")
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

	@ObfuscatedName("z.a(Z)V")
	public final void abortRoute() {
		routeLength = 0;
		preanimRouteLength = 0;
	}

	@ObfuscatedName("z.b(I)Z")
	public boolean isReady() {
		return false;
	}

	@ObfuscatedName("z.a(III)V")
	public final void addHitmark(int arg0, int arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			if (damageCycles[var3] <= Client.loopCycle) {
				damageValues[var3] = arg1;
				damageTypes[var3] = arg0;
				damageCycles[var3] = Client.loopCycle + 70;
				return;
			}
		}
	}
}
