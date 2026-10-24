package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.IdkType;
import jagex2.config.ObjType;
import jagex2.config.SeqType;
import jagex2.config.SpotType;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
import jagex2.io.Packet;

@ObfuscatedName("z")
public final class ClientPlayer extends ClientEntity {

	@ObfuscatedName("z.ib")
	public String name;

	@ObfuscatedName("z.jb")
	public boolean ready = false;

	@ObfuscatedName("z.kb")
	public int gender;

	@ObfuscatedName("z.lb")
	public int headicons;

	@ObfuscatedName("z.mb")
	public int[] appearance = new int[12];

	@ObfuscatedName("z.nb")
	public int[] colour = new int[5];

	@ObfuscatedName("z.ob")
	public int combatLevel;

	@ObfuscatedName("z.pb")
	public long baseId;

	@ObfuscatedName("z.qb")
	public int y;

	@ObfuscatedName("z.rb")
	public int locStartCycle;

	@ObfuscatedName("z.sb")
	public int locStopCycle;

	@ObfuscatedName("z.tb")
	public int locOffsetX;

	@ObfuscatedName("z.ub")
	public int locOffsetY;

	@ObfuscatedName("z.vb")
	public int locOffsetZ;

	@ObfuscatedName("z.wb")
	public Model locModel;

	@ObfuscatedName("z.xb")
	public int minTileX;

	@ObfuscatedName("z.yb")
	public int minTileZ;

	@ObfuscatedName("z.zb")
	public int maxTileX;

	@ObfuscatedName("z.Bb")
	public boolean lowMemory = false;

	@ObfuscatedName("z.Cb")
	public static LruCache modelCache = new LruCache(200);

	@ObfuscatedName("z.Ab")
	public int maxTileZ;

	@ObfuscatedName("z.a(ZLkb;)V")
	public final void setAppearance(Packet arg0) {
		arg0.pos = 0;
		gender = arg0.g1();
		headicons = arg0.g1();

		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.g1();
			if (var3 == 0) {
				appearance[var2] = 0;
			} else {
				int var4 = arg0.g1();
				appearance[var2] = (var3 << 8) + var4;
			}
		}

		for (int var5 = 0; var5 < 5; var5++) {
			int var6 = arg0.g1();
			if (var6 < 0 || var6 >= Client.recol1d[var5].length) {
				var6 = 0;
			}

			colour[var5] = var6;
		}

		readyanim = arg0.g2();
		if (readyanim == 0xFFFF) {
			readyanim = -1;
		}

		turnanim = arg0.g2();
		if (turnanim == 0xFFFF) {
			turnanim = -1;
		}

		walkanim = arg0.g2();
		if (walkanim == 0xFFFF) {
			walkanim = -1;
		}

		walkanim_b = arg0.g2();
		if (walkanim_b == 0xFFFF) {
			walkanim_b = -1;
		}

		walkanim_l = arg0.g2();
		if (walkanim_l == 0xFFFF) {
			walkanim_l = -1;
		}

		walkanim_r = arg0.g2();
		if (walkanim_r == 0xFFFF) {
			walkanim_r = -1;
		}

		runanim = arg0.g2();
		if (runanim == 0xFFFF) {
			runanim = -1;
		}

		name = JString.toScreenName(JString.toRawUsername(arg0.g8()));
		combatLevel = arg0.g1();
		ready = true;
		baseId = 0L;
		for (int var7 = 0; var7 < 12; var7++) {
			baseId <<= 4;
			if (appearance[var7] >= 256) {
				baseId += appearance[var7] - 256;
			}
		}

		if (appearance[0] >= 256) {
			baseId += appearance[0] - 256 >> 4;
		}

		if (appearance[1] >= 256) {
			baseId += appearance[1] - 256 >> 8;
		}

		for (int var8 = 0; var8 < 5; var8++) {
			baseId <<= 3;
			baseId += colour[var8];
		}

		baseId <<= 1;
		baseId += gender;
	}

	@ObfuscatedName("z.a(Z)Leb;")
	public final Model getTempModel() {
		if (!ready) {
			return null;
		}

		Model var1 = getTempModel2();
		height = var1.minY;
		var1.useAABBMouseCheck = true;

		if (lowMemory) {
			return var1;
		}

		if (spotanimId != -1 && spotanimFrame != -1) {
			SpotType var2 = SpotType.list[spotanimId];
			Model var3 = new Model(var2.getTempModel2(), true, !var2.animateTransparencies, false);
			var3.translate(-spotanimHeight, 0, 0);
			var3.prepareAnim();
			var3.animate(var2.seq.frames[spotanimFrame]);
			var3.labelFaces = null;
			var3.labelVertices = null;

			if (var2.resizeh != 128 || var2.resizev != 128) {
				var3.resize(var2.resizeh, var2.resizev, var2.resizeh);
			}

			var3.calculateNormals(var2.ambient + 64, var2.contrast + 850, -30, -50, -30, true);
			Model[] var4 = new Model[] { var1, var3 };
			var1 = new Model(var4, 2, true);
		}

		if (locModel != null) {
			if (Client.loopCycle >= locStopCycle) {
				locModel = null;
			}

			if (Client.loopCycle >= locStartCycle && Client.loopCycle < locStopCycle) {
				Model var5 = locModel;
				var5.translate(locOffsetY - y, locOffsetX - x, locOffsetZ - z);

				if (dstYaw == 512) {
					var5.rotate90();
					var5.rotate90();
					var5.rotate90();
				} else if (dstYaw == 1024) {
					var5.rotate90();
					var5.rotate90();
				} else if (dstYaw == 1536) {
					var5.rotate90();
				}

				Model[] var6 = new Model[] { var1, var5 };
				var1 = new Model(var6, 2, true);

				if (dstYaw == 512) {
					var5.rotate90();
				} else if (dstYaw == 1024) {
					var5.rotate90();
					var5.rotate90();
				} else if (dstYaw == 1536) {
					var5.rotate90();
					var5.rotate90();
					var5.rotate90();
				}

				var5.translate(y - locOffsetY, x - locOffsetX, z - locOffsetZ);
			}
		}

		var1.useAABBMouseCheck = true;
		return var1;
	}

	@ObfuscatedName("z.c(Z)Leb;")
	public final Model getTempModel2() {
		long var1 = baseId;
		int var3 = -1;
		int var4 = -1;
		int var5 = -1;
		int var6 = -1;
		if (primaryAnim >= 0 && primaryAnimDelay == 0) {
			SeqType var7 = SeqType.list[primaryAnim];
			var3 = var7.frames[primaryFrame];

			if (secondaryAnim >= 0 && secondaryAnim != readyanim) {
				var4 = SeqType.list[secondaryAnim].frames[secondaryFrame];
			}

			if (var7.replaceheldleft >= 0) {
				var5 = var7.replaceheldleft;
				var1 += var5 - appearance[5] << 40;
			}

			if (var7.replaceheldright >= 0) {
				var6 = var7.replaceheldright;
				var1 += var6 - appearance[3] << 48;
			}
		} else if (secondaryAnim >= 0) {
			var3 = SeqType.list[secondaryAnim].frames[secondaryFrame];
		}

		Model var8 = (Model) modelCache.find(var1);
		if (var8 == null) {
			Model[] var9 = new Model[12];
			int var10 = 0;
			for (int var11 = 0; var11 < 12; var11++) {
				int var12 = appearance[var11];
				if (var6 >= 0 && var11 == 3) {
					var12 = var6;
				}

				if (var5 >= 0 && var11 == 5) {
					var12 = var5;
				}

				if (var12 >= 256 && var12 < 512) {
					var9[var10++] = IdkType.list[var12 - 256].getModelNoCheck();
				}

				if (var12 >= 512) {
					ObjType var13 = ObjType.list(var12 - 512);
					Model var14 = var13.getWearModelNoCheck(gender);
					if (var14 != null) {
						var9[var10++] = var14;
					}
				}
			}

			var8 = new Model(var9, var10);
			for (int var15 = 0; var15 < 5; var15++) {
				if (colour[var15] != 0) {
					var8.recolour(Client.recol1d[var15][0], Client.recol1d[var15][colour[var15]]);

					if (var15 == 1) {
						var8.recolour(Client.recol2d[0], Client.recol2d[colour[var15]]);
					}
				}
			}

			var8.prepareAnim();
			var8.calculateNormals(64, 850, -30, -50, -30, true);
			modelCache.put(var1, var8);
		}

		if (lowMemory) {
			return var8;
		}

		Model var16 = new Model(var8, true);
		if (var3 != -1 && var4 != -1) {
			var16.maskAnimate(var4, var3, SeqType.list[primaryAnim].walkmerge);
		} else if (var3 != -1) {
			var16.animate(var3);
		}

		var16.calcBoundingCylinder();
		var16.labelFaces = null;
		var16.labelVertices = null;
		return var16;
	}

	@ObfuscatedName("z.a(I)Leb;")
	public final Model getHeadModel() {
		if (!ready) {
			return null;
		}

		Model[] var1 = new Model[12];
		int var2 = 0;
		for (int var3 = 0; var3 < 12; var3++) {
			int var4 = appearance[var3];
			if (var4 >= 256 && var4 < 512) {
				var1[var2++] = IdkType.list[var4 - 256].getHeadNoCheck();
			}

			if (var4 >= 512) {
				Model var5 = ObjType.list(var4 - 512).getHeadModelNoCheck(gender);
				if (var5 != null) {
					var1[var2++] = var5;
				}
			}
		}

		Model var6 = new Model(var1, var2);
		for (int var7 = 0; var7 < 5; var7++) {
			if (colour[var7] != 0) {
				var6.recolour(Client.recol1d[var7][0], Client.recol1d[var7][colour[var7]]);

				if (var7 == 1) {
					var6.recolour(Client.recol2d[0], Client.recol2d[colour[var7]]);
				}
			}
		}

		return var6;
	}

	@ObfuscatedName("z.b(Z)Z")
	public final boolean isReady() {
		if (!ready) {
			return false;
		}

		return true;
	}
}
