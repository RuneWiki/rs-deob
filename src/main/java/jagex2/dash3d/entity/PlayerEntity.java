package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import deob.client;
import jagex2.config.IdkType;
import jagex2.config.NpcType;
import jagex2.config.ObjType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;
import jagex2.datastruct.LruCache;
import jagex2.graphics.AnimFrame;
import jagex2.graphics.Model;
import jagex2.io.Packet;
import jagex2.jstring.JString;

public class PlayerEntity extends PathingEntity {

	@ObfuscatedName("DLZHLHNK.sb")
	public long modelUid = -1L;

	@ObfuscatedName("DLZHLHNK.ub")
	public boolean lowmem = false;

	@ObfuscatedName("DLZHLHNK.vb")
	public int[] colors = new int[5];

	@ObfuscatedName("DLZHLHNK.Fb")
	public boolean visible = false;

	@ObfuscatedName("DLZHLHNK.Kb")
	public int _flowObfuscator1 = 9;

	@ObfuscatedName("DLZHLHNK.Lb")
	public boolean _flowObfuscator2 = true;

	@ObfuscatedName("DLZHLHNK.Mb")
	public int[] appearances = new int[12];

	@ObfuscatedName("DLZHLHNK.zb")
	public static LruCache modelCache = new LruCache(false, 260);

	@ObfuscatedName("DLZHLHNK.wb")
	public int team;

	@ObfuscatedName("DLZHLHNK.xb")
	public int gender;

	@ObfuscatedName("DLZHLHNK.Ab")
	public int combatLevel;

	@ObfuscatedName("DLZHLHNK.Bb")
	public int headicons;

	@ObfuscatedName("DLZHLHNK.Cb")
	public int locStartCycle;

	@ObfuscatedName("DLZHLHNK.Db")
	public int locStopCycle;

	@ObfuscatedName("DLZHLHNK.Eb")
	public int y;

	@ObfuscatedName("DLZHLHNK.Gb")
	public int locOffsetX;

	@ObfuscatedName("DLZHLHNK.Hb")
	public int locOffsetY;

	@ObfuscatedName("DLZHLHNK.Ib")
	public int locOffsetZ;

	@ObfuscatedName("DLZHLHNK.Ob")
	public int minTileX;

	@ObfuscatedName("DLZHLHNK.Pb")
	public int minTileZ;

	@ObfuscatedName("DLZHLHNK.Qb")
	public int maxTileX;

	@ObfuscatedName("DLZHLHNK.Rb")
	public int maxTileZ;

	@ObfuscatedName("DLZHLHNK.Sb")
	public int skillLevel;

	@ObfuscatedName("DLZHLHNK.Nb")
	public long appearanceHashcode;

	@ObfuscatedName("DLZHLHNK.tb")
	public NpcType npc;

	@ObfuscatedName("DLZHLHNK.Jb")
	public Model locModel;

	@ObfuscatedName("DLZHLHNK.yb")
	public String name;

	@ObfuscatedName("DLZHLHNK.a(I)LZKARKDQW;")
	public final Model getModel(int arg0) {
		if (arg0 != 4016) {
			this._flowObfuscator2 = !this._flowObfuscator2;
		}
		if (!this.visible) {
			return null;
		}
		Model var2 = this.getSequencedModel(0);
		if (var2 == null) {
			return null;
		}
		super.height = var2.minY;
		var2.picking = true;
		if (this.lowmem) {
			return var2;
		}
		if (super.spotanimId != -1 && super.spotanimFrame != -1) {
			SpotAnimType var3 = SpotAnimType.instances[super.spotanimId];
			Model var4 = var3.getModel();
			if (var4 != null) {
				Model var5 = new Model(9, true, AnimFrame.isNull(super.spotanimFrame, false), false, var4);
				var5.translate(0, -super.spotanimHeight, 16384, 0);
				var5.createLabelReferences((byte) -71);
				var5.applyTransform(var3.seq.frames[super.spotanimFrame], 40542);
				var5.labelFaces = null;
				var5.labelVertices = null;
				if (var3.resizeh != 128 || var3.resizev != 128) {
					var5.scale(var3.resizeh, var3.resizeh, this._flowObfuscator1, var3.resizev);
				}
				var5.calculateNormals(var3.ambient + 64, var3.contrast + 850, -30, -50, -30, true);
				Model[] var6 = new Model[] { var2, var5 };
				var2 = new Model(2, -819, true, var6);
			}
		}
		if (this.locModel != null) {
			if (client.loopCycle >= this.locStopCycle) {
				this.locModel = null;
			}
			if (client.loopCycle >= this.locStartCycle && client.loopCycle < this.locStopCycle) {
				Model var7 = this.locModel;
				var7.translate(this.locOffsetX - super.x, this.locOffsetY - this.y, 16384, this.locOffsetZ - super.z);
				if (super.dstYaw == 512) {
					var7.rotateY90(360);
					var7.rotateY90(360);
					var7.rotateY90(360);
				} else if (super.dstYaw == 1024) {
					var7.rotateY90(360);
					var7.rotateY90(360);
				} else if (super.dstYaw == 1536) {
					var7.rotateY90(360);
				}
				Model[] var8 = new Model[] { var2, var7 };
				var2 = new Model(2, -819, true, var8);
				if (super.dstYaw == 512) {
					var7.rotateY90(360);
				} else if (super.dstYaw == 1024) {
					var7.rotateY90(360);
					var7.rotateY90(360);
				} else if (super.dstYaw == 1536) {
					var7.rotateY90(360);
					var7.rotateY90(360);
					var7.rotateY90(360);
				}
				var7.translate(super.x - this.locOffsetX, this.y - this.locOffsetY, 16384, super.z - this.locOffsetZ);
			}
		}
		var2.picking = true;
		return var2;
	}

	@ObfuscatedName("DLZHLHNK.a(ILMBMGIXGO;)V")
	public final void read(int arg0, Packet arg1) {
		arg1.pos = 0;
		this.gender = arg1.g1();
		this.headicons = arg1.g1();
		if (arg0 != 0) {
			return;
		}
		this.npc = null;
		this.team = 0;
		for (int var3 = 0; var3 < 12; var3++) {
			int var4 = arg1.g1();
			if (var4 == 0) {
				this.appearances[var3] = 0;
			} else {
				int var5 = arg1.g1();
				this.appearances[var3] = (var4 << 8) + var5;
				if (var3 == 0 && this.appearances[0] == 65535) {
					this.npc = NpcType.get(arg1.g2());
					break;
				}
				if (this.appearances[var3] >= 512 && this.appearances[var3] - 512 < ObjType.count) {
					int var10 = ObjType.get(this.appearances[var3] - 512).team;
					if (var10 != 0) {
						this.team = var10;
					}
				}
			}
		}
		for (int var6 = 0; var6 < 5; var6++) {
			int var9 = arg1.g1();
			if (var9 < 0 || var9 >= client.DESIGN_BODY_COLOR[var6].length) {
				var9 = 0;
			}
			this.colors[var6] = var9;
		}
		super.seqStandId = arg1.g2();
		if (super.seqStandId == 65535) {
			super.seqStandId = -1;
		}
		super.seqTurnId = arg1.g2();
		if (super.seqTurnId == 65535) {
			super.seqTurnId = -1;
		}
		super.seqWalkId = arg1.g2();
		if (super.seqWalkId == 65535) {
			super.seqWalkId = -1;
		}
		super.seqTurnAroundId = arg1.g2();
		if (super.seqTurnAroundId == 65535) {
			super.seqTurnAroundId = -1;
		}
		super.seqTurnLeftId = arg1.g2();
		if (super.seqTurnLeftId == 65535) {
			super.seqTurnLeftId = -1;
		}
		super.seqTurnRightId = arg1.g2();
		if (super.seqTurnRightId == 65535) {
			super.seqTurnRightId = -1;
		}
		super.seqRunId = arg1.g2();
		if (super.seqRunId == 65535) {
			super.seqRunId = -1;
		}
		this.name = JString.toSentenceCase(-45804, JString.fromBase37(arg1.g8(-35089), (byte) -99));
		this.combatLevel = arg1.g1();
		this.skillLevel = arg1.g2();
		this.visible = true;
		this.appearanceHashcode = 0L;
		for (int var7 = 0; var7 < 12; var7++) {
			this.appearanceHashcode <<= 0x4;
			if (this.appearances[var7] >= 256) {
				this.appearanceHashcode += this.appearances[var7] - 256;
			}
		}
		if (this.appearances[0] >= 256) {
			this.appearanceHashcode += this.appearances[0] - 256 >> 4;
		}
		if (this.appearances[1] >= 256) {
			this.appearanceHashcode += this.appearances[1] - 256 >> 8;
		}
		for (int var8 = 0; var8 < 5; var8++) {
			this.appearanceHashcode <<= 0x3;
			this.appearanceHashcode += this.colors[var8];
		}
		this.appearanceHashcode <<= 0x1;
		this.appearanceHashcode += this.gender;
	}

	@ObfuscatedName("DLZHLHNK.b(I)LZKARKDQW;")
	public final Model getSequencedModel(int arg0) {
		if (this.npc != null) {
			int var2 = -1;
			if (super.primarySeqId >= 0 && super.primarySeqDelay == 0) {
				var2 = SeqType.instances[super.primarySeqId].frames[super.primarySeqFrame];
			} else if (super.secondarySeqId >= 0) {
				var2 = SeqType.instances[super.secondarySeqId].frames[super.secondarySeqFrame];
			}
			return this.npc.getModel(0, -1, var2, null);
		}
		long var4 = this.appearanceHashcode;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		int var9 = -1;
		if (super.primarySeqId >= 0 && super.primarySeqDelay == 0) {
			SeqType var10 = SeqType.instances[super.primarySeqId];
			var6 = var10.frames[super.primarySeqFrame];
			if (super.secondarySeqId >= 0 && super.secondarySeqId != super.seqStandId) {
				var7 = SeqType.instances[super.secondarySeqId].frames[super.secondarySeqFrame];
			}
			if (var10.righthand >= 0) {
				var8 = var10.righthand;
				var4 += var8 - this.appearances[5] << 40;
			}
			if (var10.lefthand >= 0) {
				var9 = var10.lefthand;
				var4 += var9 - this.appearances[3] << 48;
			}
		} else if (super.secondarySeqId >= 0) {
			var6 = SeqType.instances[super.secondarySeqId].frames[super.secondarySeqFrame];
		}
		Model var11 = (Model) modelCache.get(var4);
		if (arg0 != 0) {
			for (int var12 = 1; var12 > 0; var12++) {
			}
		}
		if (var11 == null) {
			boolean var13 = false;
			for (int var14 = 0; var14 < 12; var14++) {
				int var15 = this.appearances[var14];
				if (var9 >= 0 && var14 == 3) {
					var15 = var9;
				}
				if (var8 >= 0 && var14 == 5) {
					var15 = var8;
				}
				if (var15 >= 256 && var15 < 512 && !IdkType.instances[var15 - 256].validateModel((byte) 2)) {
					var13 = true;
				}
				if (var15 >= 512 && !ObjType.get(var15 - 512).validateWornModel(40903, this.gender)) {
					var13 = true;
				}
			}
			if (var13) {
				if (this.modelUid != -1L) {
					var11 = (Model) modelCache.get(this.modelUid);
				}
				if (var11 == null) {
					return null;
				}
			}
		}
		if (var11 == null) {
			Model[] var16 = new Model[12];
			int var17 = 0;
			for (int var18 = 0; var18 < 12; var18++) {
				int var20 = this.appearances[var18];
				if (var9 >= 0 && var18 == 3) {
					var20 = var9;
				}
				if (var8 >= 0 && var18 == 5) {
					var20 = var8;
				}
				if (var20 >= 256 && var20 < 512) {
					Model var21 = IdkType.instances[var20 - 256].getModel(false);
					if (var21 != null) {
						var16[var17++] = var21;
					}
				}
				if (var20 >= 512) {
					Model var22 = ObjType.get(var20 - 512).getWornModel(false, this.gender);
					if (var22 != null) {
						var16[var17++] = var22;
					}
				}
			}
			var11 = new Model(var17, var16, -38);
			for (int var19 = 0; var19 < 5; var19++) {
				if (this.colors[var19] != 0) {
					var11.recolour(client.DESIGN_BODY_COLOR[var19][0], client.DESIGN_BODY_COLOR[var19][this.colors[var19]]);
					if (var19 == 1) {
						var11.recolour(client.DESIGN_HAIR_COLOR[0], client.DESIGN_HAIR_COLOR[this.colors[var19]]);
					}
				}
			}
			var11.createLabelReferences((byte) -71);
			var11.calculateNormals(64, 850, -30, -50, -30, true);
			modelCache.put(var11, var4, (byte) 2);
			this.modelUid = var4;
		}
		if (this.lowmem) {
			return var11;
		}
		Model var23 = Model.empty;
		var23.set(7, var11, AnimFrame.isNull(var6, false) & AnimFrame.isNull(var7, false));
		if (var6 != -1 && var7 != -1) {
			var23.applyTransforms(-20491, SeqType.instances[super.primarySeqId].walkmerge, var7, var6);
		} else if (var6 != -1) {
			var23.applyTransform(var6, 40542);
		}
		var23.calculateBoundsCylinder(false);
		var23.labelFaces = null;
		var23.labelVertices = null;
		return var23;
	}

	@ObfuscatedName("DLZHLHNK.b(Z)Z")
	public final boolean isVisible(boolean arg0) {
		if (!arg0) {
			throw new NullPointerException();
		}
		return this.visible;
	}

	@ObfuscatedName("DLZHLHNK.a(B)LZKARKDQW;")
	public final Model getHeadModel(byte arg0) {
		if (arg0 != -41) {
			this._flowObfuscator1 = 132;
		}
		if (!this.visible) {
			return null;
		} else if (this.npc == null) {
			boolean var2 = false;
			for (int var3 = 0; var3 < 12; var3++) {
				int var12 = this.appearances[var3];
				if (var12 >= 256 && var12 < 512 && !IdkType.instances[var12 - 256].validateHeadModel(false)) {
					var2 = true;
				}
				if (var12 >= 512 && !ObjType.get(var12 - 512).validateHeadModel(-2836, this.gender)) {
					var2 = true;
				}
			}
			if (var2) {
				return null;
			}
			Model[] var4 = new Model[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var9 = this.appearances[var6];
				if (var9 >= 256 && var9 < 512) {
					Model var10 = IdkType.instances[var9 - 256].getHeadModel(0);
					if (var10 != null) {
						var4[var5++] = var10;
					}
				}
				if (var9 >= 512) {
					Model var11 = ObjType.get(var9 - 512).getHeadModel(-705, this.gender);
					if (var11 != null) {
						var4[var5++] = var11;
					}
				}
			}
			Model var7 = new Model(var5, var4, -38);
			for (int var8 = 0; var8 < 5; var8++) {
				if (this.colors[var8] != 0) {
					var7.recolour(client.DESIGN_BODY_COLOR[var8][0], client.DESIGN_BODY_COLOR[var8][this.colors[var8]]);
					if (var8 == 1) {
						var7.recolour(client.DESIGN_HAIR_COLOR[0], client.DESIGN_HAIR_COLOR[this.colors[var8]]);
					}
				}
			}
			return var7;
		} else {
			return this.npc.getHeadModel(true);
		}
	}
}
