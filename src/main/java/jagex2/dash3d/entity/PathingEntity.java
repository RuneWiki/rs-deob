package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.config.SeqType;

@ObfuscatedName("GQOSZKJC")
public class PathingEntity extends Entity {

	@ObfuscatedName("GQOSZKJC.m")
	public int[] pathTileX = new int[10];

	@ObfuscatedName("GQOSZKJC.n")
	public int[] pathTileZ = new int[10];

	@ObfuscatedName("GQOSZKJC.o")
	public int targetId = -1;

	@ObfuscatedName("GQOSZKJC.q")
	public int turnSpeed = 32;

	@ObfuscatedName("GQOSZKJC.r")
	public int seqRunId = -1;

	@ObfuscatedName("GQOSZKJC.t")
	public int height = 200;

	@ObfuscatedName("GQOSZKJC.x")
	public int seqStandId = -1;

	@ObfuscatedName("GQOSZKJC.y")
	public int seqTurnId = -1;

	@ObfuscatedName("GQOSZKJC.A")
	public int[] damage = new int[4];

	@ObfuscatedName("GQOSZKJC.B")
	public int[] damageType = new int[4];

	@ObfuscatedName("GQOSZKJC.C")
	public int[] damageCycle = new int[4];

	@ObfuscatedName("GQOSZKJC.D")
	public int secondarySeqId = -1;

	@ObfuscatedName("GQOSZKJC.G")
	public int spotanimId = -1;

	@ObfuscatedName("GQOSZKJC.M")
	public int primarySeqId = -1;

	@ObfuscatedName("GQOSZKJC.S")
	public int combatCycle = -1000;

	@ObfuscatedName("GQOSZKJC.V")
	public int chatTimer = 100;

	@ObfuscatedName("GQOSZKJC.ab")
	public int size = 1;

	@ObfuscatedName("GQOSZKJC.bb")
	public boolean needsForwardDrawPadding = false;

	@ObfuscatedName("GQOSZKJC.nb")
	public boolean[] pathRunning = new boolean[10];

	@ObfuscatedName("GQOSZKJC.ob")
	public int seqWalkId = -1;

	@ObfuscatedName("GQOSZKJC.pb")
	public int seqTurnAroundId = -1;

	@ObfuscatedName("GQOSZKJC.qb")
	public int seqTurnLeftId = -1;

	@ObfuscatedName("GQOSZKJC.rb")
	public int seqTurnRightId = -1;

	@ObfuscatedName("GQOSZKJC.p")
	public int seqTrigger;

	@ObfuscatedName("GQOSZKJC.w")
	public int dstYaw;

	@ObfuscatedName("GQOSZKJC.z")
	public int chatColor;

	@ObfuscatedName("GQOSZKJC.E")
	public int secondarySeqFrame;

	@ObfuscatedName("GQOSZKJC.F")
	public int secondarySeqCycle;

	@ObfuscatedName("GQOSZKJC.H")
	public int spotanimFrame;

	@ObfuscatedName("GQOSZKJC.I")
	public int spotanimCycle;

	@ObfuscatedName("GQOSZKJC.J")
	public int spotanimLastCycle;

	@ObfuscatedName("GQOSZKJC.K")
	public int spotanimHeight;

	@ObfuscatedName("GQOSZKJC.L")
	public int pathLength;

	@ObfuscatedName("GQOSZKJC.N")
	public int primarySeqFrame;

	@ObfuscatedName("GQOSZKJC.O")
	public int primarySeqCycle;

	@ObfuscatedName("GQOSZKJC.P")
	public int primarySeqDelay;

	@ObfuscatedName("GQOSZKJC.Q")
	public int primarySeqLoop;

	@ObfuscatedName("GQOSZKJC.R")
	public int chatStyle;

	@ObfuscatedName("GQOSZKJC.T")
	public int health;

	@ObfuscatedName("GQOSZKJC.U")
	public int totalHealth;

	@ObfuscatedName("GQOSZKJC.X")
	public int cycle;

	@ObfuscatedName("GQOSZKJC.Y")
	public int targetTileX;

	@ObfuscatedName("GQOSZKJC.Z")
	public int targetTile;

	@ObfuscatedName("GQOSZKJC.cb")
	public int seqPathLength;

	@ObfuscatedName("GQOSZKJC.db")
	public int forceMoveStartSceneTileX;

	@ObfuscatedName("GQOSZKJC.eb")
	public int forceMoveEndSceneTileX;

	@ObfuscatedName("GQOSZKJC.fb")
	public int forceMoveStartSceneTileZ;

	@ObfuscatedName("GQOSZKJC.gb")
	public int forceMoveEndSceneTileZ;

	@ObfuscatedName("GQOSZKJC.hb")
	public int forceMoveEndCycle;

	@ObfuscatedName("GQOSZKJC.ib")
	public int forceMoveStartCycle;

	@ObfuscatedName("GQOSZKJC.jb")
	public int forceMoveFaceDirection;

	@ObfuscatedName("GQOSZKJC.kb")
	public int x;

	@ObfuscatedName("GQOSZKJC.lb")
	public int z;

	@ObfuscatedName("GQOSZKJC.mb")
	public int yaw;

	@ObfuscatedName("GQOSZKJC.s")
	public String chat;

	@ObfuscatedName("GQOSZKJC.a(IIZZ)V")
	public final void move(int arg0, int arg1, boolean arg2) {
		if (primarySeqId != -1 && SeqType.instances[primarySeqId].postanim_move == 1) {
			primarySeqId = -1;
		}

		if (!arg2) {
			int var4 = arg0 - pathTileX[0];
			int var5 = arg1 - pathTileZ[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (pathLength < 9) {
					pathLength++;
				}

				for (int var6 = pathLength; var6 > 0; var6--) {
					pathTileX[var6] = pathTileX[var6 - 1];
					pathTileZ[var6] = pathTileZ[var6 - 1];
					pathRunning[var6] = pathRunning[var6 - 1];
				}

				pathTileX[0] = arg0;
				pathTileZ[0] = arg1;
				pathRunning[0] = false;
				return;
			}
		}

		pathLength = 0;
		seqPathLength = 0;
		seqTrigger = 0;
		pathTileX[0] = arg0;
		pathTileZ[0] = arg1;
		x = pathTileX[0] * 128 + size * 64;
		z = pathTileZ[0] * 128 + size * 64;
	}

	@ObfuscatedName("GQOSZKJC.a(Z)V")
	public final void resetPath() {
		pathLength = 0;
		seqPathLength = 0;
	}

	@ObfuscatedName("GQOSZKJC.a(IIII)V")
	public final void hit(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (damageCycle[var4] <= arg2) {
				damage[var4] = arg1;
				damageType[var4] = arg0;
				damageCycle[var4] = arg2 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("GQOSZKJC.a(ZBI)V")
	public final void step(boolean arg0, int arg1) {
		int var3 = pathTileX[0];
		int var4 = pathTileZ[0];
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

		if (primarySeqId != -1 && SeqType.instances[primarySeqId].postanim_move == 1) {
			primarySeqId = -1;
		}

		if (pathLength < 9) {
			pathLength++;
		}

		for (int var5 = pathLength; var5 > 0; var5--) {
			pathTileX[var5] = pathTileX[var5 - 1];
			pathTileZ[var5] = pathTileZ[var5 - 1];
			pathRunning[var5] = pathRunning[var5 - 1];
		}

		pathTileX[0] = var3;
		pathTileZ[0] = var4;
		pathRunning[0] = arg0;
	}

	@ObfuscatedName("GQOSZKJC.b(Z)Z")
	public boolean isVisible() {
		return false;
	}
}
