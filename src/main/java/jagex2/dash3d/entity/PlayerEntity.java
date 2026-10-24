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

@ObfuscatedName("DLZHLHNK")
public final class PlayerEntity extends PathingEntity {

	@ObfuscatedName("DLZHLHNK.sb")
	public long modelUid = -1L;

	@ObfuscatedName("DLZHLHNK.ub")
	public boolean lowmem = false;

	@ObfuscatedName("DLZHLHNK.vb")
	public int[] colors = new int[5];

	@ObfuscatedName("DLZHLHNK.Fb")
	public boolean visible = false;

	@ObfuscatedName("DLZHLHNK.Mb")
	public int[] appearances = new int[12];

	@ObfuscatedName("DLZHLHNK.zb")
	public static LruCache modelCache = new LruCache(260);

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
	public final Model getModel() {
		if (!visible) {
			return null;
		}

		Model var1 = getSequencedModel();
		if (var1 == null) {
			return null;
		}

		height = var1.minY;
		var1.picking = true;

		if (lowmem) {
			return var1;
		}

		if (spotanimId != -1 && spotanimFrame != -1) {
			SpotAnimType var2 = SpotAnimType.instances[spotanimId];
			Model var3 = var2.getModel();
			if (var3 != null) {
				Model var4 = new Model(true, AnimFrame.isNull(spotanimFrame), false, var3);
				var4.translate(0, -spotanimHeight, 0);
				var4.createLabelReferences();
				var4.applyTransform(var2.seq.frames[spotanimFrame]);
				var4.labelFaces = null;
				var4.labelVertices = null;

				if (var2.resizeh != 128 || var2.resizev != 128) {
					var4.scale(var2.resizeh, var2.resizeh, var2.resizev);
				}

				var4.calculateNormals(var2.ambient + 64, var2.contrast + 850, -30, -50, -30, true);
				Model[] var5 = new Model[] { var1, var4 };
				var1 = new Model(2, true, var5);
			}
		}

		if (locModel != null) {
			if (client.loopCycle >= locStopCycle) {
				locModel = null;
			}

			if (client.loopCycle >= locStartCycle && client.loopCycle < locStopCycle) {
				Model var6 = locModel;
				var6.translate(locOffsetX - x, locOffsetY - y, locOffsetZ - z);

				if (dstYaw == 512) {
					var6.rotateY90();
					var6.rotateY90();
					var6.rotateY90();
				} else if (dstYaw == 1024) {
					var6.rotateY90();
					var6.rotateY90();
				} else if (dstYaw == 1536) {
					var6.rotateY90();
				}

				Model[] var7 = new Model[] { var1, var6 };
				var1 = new Model(2, true, var7);

				if (dstYaw == 512) {
					var6.rotateY90();
				} else if (dstYaw == 1024) {
					var6.rotateY90();
					var6.rotateY90();
				} else if (dstYaw == 1536) {
					var6.rotateY90();
					var6.rotateY90();
					var6.rotateY90();
				}

				var6.translate(x - locOffsetX, y - locOffsetY, z - locOffsetZ);
			}
		}

		var1.picking = true;
		return var1;
	}

	@ObfuscatedName("DLZHLHNK.a(ILMBMGIXGO;)V")
	public final void read(Packet arg0) {
		arg0.pos = 0;
		gender = arg0.g1();
		headicons = arg0.g1();
		npc = null;
		team = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.g1();
			if (var3 == 0) {
				appearances[var2] = 0;
			} else {
				int var4 = arg0.g1();
				appearances[var2] = (var3 << 8) + var4;
				if (var2 == 0 && appearances[0] == 0xFFFF) {
					npc = NpcType.get(arg0.g2());
					break;
				}

				if (appearances[var2] >= 512 && appearances[var2] - 512 < ObjType.count) {
					int var5 = ObjType.get(appearances[var2] - 512).team;
					if (var5 != 0) {
						team = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.g1();
			if (var7 < 0 || var7 >= client.DESIGN_BODY_COLOR[var6].length) {
				var7 = 0;
			}

			colors[var6] = var7;
		}

		seqStandId = arg0.g2();
		if (seqStandId == 0xFFFF) {
			seqStandId = -1;
		}

		seqTurnId = arg0.g2();
		if (seqTurnId == 0xFFFF) {
			seqTurnId = -1;
		}

		seqWalkId = arg0.g2();
		if (seqWalkId == 0xFFFF) {
			seqWalkId = -1;
		}

		seqTurnAroundId = arg0.g2();
		if (seqTurnAroundId == 0xFFFF) {
			seqTurnAroundId = -1;
		}

		seqTurnLeftId = arg0.g2();
		if (seqTurnLeftId == 0xFFFF) {
			seqTurnLeftId = -1;
		}

		seqTurnRightId = arg0.g2();
		if (seqTurnRightId == 0xFFFF) {
			seqTurnRightId = -1;
		}

		seqRunId = arg0.g2();
		if (seqRunId == 0xFFFF) {
			seqRunId = -1;
		}

		name = JString.toSentenceCase(JString.fromBase37(arg0.g8()));
		combatLevel = arg0.g1();
		skillLevel = arg0.g2();
		visible = true;
		appearanceHashcode = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			appearanceHashcode <<= 4;
			if (appearances[var8] >= 256) {
				appearanceHashcode += appearances[var8] - 256;
			}
		}

		if (appearances[0] >= 256) {
			appearanceHashcode += appearances[0] - 256 >> 4;
		}

		if (appearances[1] >= 256) {
			appearanceHashcode += appearances[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			appearanceHashcode <<= 3;
			appearanceHashcode += colors[var9];
		}

		appearanceHashcode <<= 1;
		appearanceHashcode += gender;
	}

	@ObfuscatedName("DLZHLHNK.b(I)LZKARKDQW;")
	public final Model getSequencedModel() {
		if (npc != null) {
			int var1 = -1;
			if (primarySeqId >= 0 && primarySeqDelay == 0) {
				var1 = SeqType.instances[primarySeqId].frames[primarySeqFrame];
			} else if (secondarySeqId >= 0) {
				var1 = SeqType.instances[secondarySeqId].frames[secondarySeqFrame];
			}

			return npc.getModel(-1, var1, null);
		}

		long var3 = appearanceHashcode;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (primarySeqId >= 0 && primarySeqDelay == 0) {
			SeqType var9 = SeqType.instances[primarySeqId];
			var5 = var9.frames[primarySeqFrame];

			if (secondarySeqId >= 0 && secondarySeqId != seqStandId) {
				var6 = SeqType.instances[secondarySeqId].frames[secondarySeqFrame];
			}

			if (var9.righthand >= 0) {
				var7 = var9.righthand;
				var3 += var7 - appearances[5] << 40;
			}

			if (var9.lefthand >= 0) {
				var8 = var9.lefthand;
				var3 += var8 - appearances[3] << 48;
			}
		} else if (secondarySeqId >= 0) {
			var5 = SeqType.instances[secondarySeqId].frames[secondarySeqFrame];
		}

		Model var10 = (Model) modelCache.get(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = appearances[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !IdkType.instances[var13 - 256].validateModel()) {
					var11 = true;
				}

				if (var13 >= 512 && !ObjType.get(var13 - 512).validateWornModel(gender)) {
					var11 = true;
				}
			}

			if (var11) {
				if (modelUid != -1L) {
					var10 = (Model) modelCache.get(modelUid);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			Model[] var14 = new Model[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = appearances[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					Model var18 = IdkType.instances[var17 - 256].getModel();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					Model var19 = ObjType.get(var17 - 512).getWornModel(gender);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new Model(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (colors[var20] != 0) {
					var10.recolour(client.DESIGN_BODY_COLOR[var20][0], client.DESIGN_BODY_COLOR[var20][colors[var20]]);

					if (var20 == 1) {
						var10.recolour(client.DESIGN_HAIR_COLOR[0], client.DESIGN_HAIR_COLOR[colors[var20]]);
					}
				}
			}

			var10.createLabelReferences();
			var10.calculateNormals(64, 850, -30, -50, -30, true);
			modelCache.put(var10, var3);
			modelUid = var3;
		}

		if (lowmem) {
			return var10;
		}

		Model var21 = Model.empty;
		var21.set(var10, AnimFrame.isNull(var5) & AnimFrame.isNull(var6));

		if (var5 != -1 && var6 != -1) {
			var21.applyTransforms(SeqType.instances[primarySeqId].walkmerge, var6, var5);
		} else if (var5 != -1) {
			var21.applyTransform(var5);
		}

		var21.calculateBoundsCylinder();
		var21.labelFaces = null;
		var21.labelVertices = null;
		return var21;
	}

	@ObfuscatedName("DLZHLHNK.b(Z)Z")
	public final boolean isVisible() {
		if (!visible) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("DLZHLHNK.a(B)LZKARKDQW;")
	public final Model getHeadModel() {
		if (!visible) {
			return null;
		}

		if (npc == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = appearances[var2];
				if (var3 >= 256 && var3 < 512 && !IdkType.instances[var3 - 256].validateHeadModel()) {
					var1 = true;
				}

				if (var3 >= 512 && !ObjType.get(var3 - 512).validateHeadModel(gender)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			Model[] var4 = new Model[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = appearances[var6];
				if (var7 >= 256 && var7 < 512) {
					Model var8 = IdkType.instances[var7 - 256].getHeadModel();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					Model var9 = ObjType.get(var7 - 512).getHeadModel(gender);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			Model var10 = new Model(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (colors[var11] != 0) {
					var10.recolour(client.DESIGN_BODY_COLOR[var11][0], client.DESIGN_BODY_COLOR[var11][colors[var11]]);

					if (var11 == 1) {
						var10.recolour(client.DESIGN_HAIR_COLOR[0], client.DESIGN_HAIR_COLOR[colors[var11]]);
					}
				}
			}

			return var10;
		}

		return npc.getHeadModel();
	}
}
