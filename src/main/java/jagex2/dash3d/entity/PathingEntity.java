package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.config.SeqType;

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

	@ObfuscatedName("GQOSZKJC.u")
	public boolean _flowObfuscator6 = false;

	@ObfuscatedName("GQOSZKJC.v")
	public int _flowObfuscator7 = -35698;

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

	@ObfuscatedName("GQOSZKJC.W")
	public int _flowObfuscator8 = -895;

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
	public final void move(int arg0, int arg1, boolean arg2, boolean arg3) {
		if (this.primarySeqId != -1 && SeqType.instances[this.primarySeqId].postanim_move == 1) {
			this.primarySeqId = -1;
		}
		if (!arg2) {
			int var5 = arg0 - this.pathTileX[0];
			int var6 = arg1 - this.pathTileZ[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (this.pathLength < 9) {
					this.pathLength++;
				}
				for (int var7 = this.pathLength; var7 > 0; var7--) {
					this.pathTileX[var7] = this.pathTileX[var7 - 1];
					this.pathTileZ[var7] = this.pathTileZ[var7 - 1];
					this.pathRunning[var7] = this.pathRunning[var7 - 1];
				}
				this.pathTileX[0] = arg0;
				this.pathTileZ[0] = arg1;
				this.pathRunning[0] = false;
				return;
			}
		}
		this.pathLength = 0;
		this.seqPathLength = 0;
		this.seqTrigger = 0;
		this.pathTileX[0] = arg0;
		this.pathTileZ[0] = arg1;
		this.x = this.pathTileX[0] * 128 + this.size * 64;
		if (arg3) {
			this._flowObfuscator8 = 42;
		}
		this.z = this.pathTileZ[0] * 128 + this.size * 64;
	}

	@ObfuscatedName("GQOSZKJC.a(Z)V")
	public final void resetPath(boolean arg0) {
		if (!arg0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		this.pathLength = 0;
		this.seqPathLength = 0;
	}

	@ObfuscatedName("GQOSZKJC.a(IIII)V")
	public final void hit(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = 0; var5 < 4; var5++) {
			if (this.damageCycle[var5] <= arg3) {
				this.damage[var5] = arg2;
				this.damageType[var5] = arg1;
				this.damageCycle[var5] = arg3 + 70;
				return;
			}
		}
		if (this._flowObfuscator7 != arg0) {
			this._flowObfuscator6 = !this._flowObfuscator6;
		}
	}

	@ObfuscatedName("GQOSZKJC.a(ZBI)V")
	public final void step(boolean arg0, byte arg1, int arg2) {
		int var4 = this.pathTileX[0];
		int var5 = this.pathTileZ[0];
		if (arg2 == 0) {
			var4--;
			var5++;
		}
		if (arg2 == 1) {
			var5++;
		}
		if (arg2 == 2) {
			var4++;
			var5++;
		}
		if (arg2 == 3) {
			var4--;
		}
		if (arg2 == 4) {
			var4++;
		}
		if (arg2 == 5) {
			var4--;
			var5--;
		}
		if (arg2 == 6) {
			var5--;
		}
		if (arg2 == 7) {
			var4++;
			var5--;
		}
		if (this.primarySeqId != -1 && SeqType.instances[this.primarySeqId].postanim_move == 1) {
			this.primarySeqId = -1;
		}
		if (this.pathLength < 9) {
			this.pathLength++;
		}
		for (int var6 = this.pathLength; var6 > 0; var6--) {
			this.pathTileX[var6] = this.pathTileX[var6 - 1];
			this.pathTileZ[var6] = this.pathTileZ[var6 - 1];
			this.pathRunning[var6] = this.pathRunning[var6 - 1];
		}
		if (arg1 == 20) {
			this.pathTileX[0] = var4;
			this.pathTileZ[0] = var5;
			this.pathRunning[0] = arg0;
		}
	}

	@ObfuscatedName("GQOSZKJC.b(Z)Z")
	public boolean isVisible(boolean arg0) {
		if (!arg0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		return false;
	}
}
