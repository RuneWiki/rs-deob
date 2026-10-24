package jagex2.config;

import deob.ObfuscatedName;
import deob.client;
import jagex2.datastruct.LruCache;
import jagex2.graphics.AnimFrame;
import jagex2.graphics.Model;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("CKDEJADD")
public final class NpcType {

	@ObfuscatedName("CKDEJADD.a")
	public int walkanim_l = -1;

	@ObfuscatedName("CKDEJADD.c")
	public int multivarbit = -1;

	@ObfuscatedName("CKDEJADD.d")
	public int walkanim_b = -1;

	@ObfuscatedName("CKDEJADD.e")
	public int mutlivarp = -1;

	@ObfuscatedName("CKDEJADD.g")
	public int vislevel = -1;

	@ObfuscatedName("CKDEJADD.m")
	public int walkanim = -1;

	@ObfuscatedName("CKDEJADD.n")
	public byte size = 1;

	@ObfuscatedName("CKDEJADD.q")
	public int field36 = -1;

	@ObfuscatedName("CKDEJADD.u")
	public int headicon = -1;

	@ObfuscatedName("CKDEJADD.w")
	public int readyanim = -1;

	@ObfuscatedName("CKDEJADD.x")
	public long type = -1L;

	@ObfuscatedName("CKDEJADD.y")
	public int turnspeed = 32;

	@ObfuscatedName("CKDEJADD.C")
	public int walkanim_r = -1;

	@ObfuscatedName("CKDEJADD.D")
	public boolean active = true;

	@ObfuscatedName("CKDEJADD.F")
	public int resizev = 128;

	@ObfuscatedName("CKDEJADD.G")
	public boolean minimap = true;

	@ObfuscatedName("CKDEJADD.J")
	public int field53 = -1;

	@ObfuscatedName("CKDEJADD.K")
	public int resizeh = 128;

	@ObfuscatedName("CKDEJADD.M")
	public boolean alwaysontop = false;

	@ObfuscatedName("CKDEJADD.P")
	public int field59 = -1;

	@ObfuscatedName("CKDEJADD.O")
	public static LruCache modelCacheStatic = new LruCache(30);

	@ObfuscatedName("CKDEJADD.b")
	public static int cachePos;

	@ObfuscatedName("CKDEJADD.h")
	public static int count;

	@ObfuscatedName("CKDEJADD.E")
	public int ambient;

	@ObfuscatedName("CKDEJADD.L")
	public int contrast;

	@ObfuscatedName("CKDEJADD.f")
	public static Packet dat;

	@ObfuscatedName("CKDEJADD.B")
	public static client varProvider;

	@ObfuscatedName("CKDEJADD.k")
	public String name;

	@ObfuscatedName("CKDEJADD.I")
	public byte[] desc;

	@ObfuscatedName("CKDEJADD.p")
	public int[] recol_d;

	@ObfuscatedName("CKDEJADD.r")
	public static int[] idx;

	@ObfuscatedName("CKDEJADD.s")
	public int[] heads;

	@ObfuscatedName("CKDEJADD.v")
	public int[] recol_s;

	@ObfuscatedName("CKDEJADD.H")
	public int[] multinpc;

	@ObfuscatedName("CKDEJADD.N")
	public int[] models;

	@ObfuscatedName("CKDEJADD.z")
	public static NpcType[] cache;

	@ObfuscatedName("CKDEJADD.l")
	public String[] op;

	@ObfuscatedName("CKDEJADD.a(I)LCKDEJADD;")
	public static final NpcType get(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == cache[var1].type) {
				return cache[var1];
			}
		}

		cachePos = (cachePos + 1) % 20;
		NpcType var2 = cache[cachePos] = new NpcType();
		dat.pos = idx[arg0];
		var2.type = arg0;
		var2.decodeClient(dat);
		return var2;
	}

	@ObfuscatedName("CKDEJADD.a(Z)LZKARKDQW;")
	public final Model getHeadModel() {
		if (multinpc != null) {
			NpcType var1 = getMultiNpc();
			if (var1 == null) {
				return null;
			}

			return var1.getHeadModel();
		} else if (heads == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < heads.length; var3++) {
				if (!Model.validate(heads[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			Model[] var4 = new Model[heads.length];
			for (int var5 = 0; var5 < heads.length; var5++) {
				var4[var5] = Model.tryGet(heads[var5]);
			}

			Model var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new Model(var4.length, var4);
			}

			if (recol_s != null) {
				for (int var7 = 0; var7 < recol_s.length; var7++) {
					var6.recolour(recol_s[var7], recol_d[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("CKDEJADD.b(I)LCKDEJADD;")
	public final NpcType getMultiNpc() {
		int var1 = -1;
		if (multivarbit != -1) {
			VarbitType var2 = VarbitType.instances[multivarbit];
			int var3 = var2.basevar;
			int var4 = var2.startbit;
			int var5 = var2.endbit;
			int var6 = client.BITMASK[var5 - var4];
			var1 = varProvider.varps[var3] >> var4 & var6;
		} else if (mutlivarp != -1) {
			var1 = varProvider.varps[mutlivarp];
		}

		if (var1 >= 0 && var1 < multinpc.length && multinpc[var1] != -1) {
			return get(multinpc[var1]);
		}

		return null;
	}

	@ObfuscatedName("CKDEJADD.a(LXTGLDHGX;)V")
	public static final void unpack(Jagfile arg0) {
		dat = new Packet(arg0.read("npc.dat", null));
		Packet var1 = new Packet(arg0.read("npc.idx", null));
		count = var1.g2();
		idx = new int[count];
		int var2 = 2;
		for (int var3 = 0; var3 < count; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}

		cache = new NpcType[20];
		for (int var4 = 0; var4 < 20; var4++) {
			cache[var4] = new NpcType();
		}
	}

	@ObfuscatedName("CKDEJADD.c(I)V")
	public static final void unload() {
		modelCacheStatic = null;
		idx = null;
		cache = null;
		dat = null;
	}

	@ObfuscatedName("CKDEJADD.a(III[I)LZKARKDQW;")
	public final Model getModel(int arg0, int arg1, int[] arg2) {
		if (multinpc != null) {
			NpcType var4 = getMultiNpc();
			if (var4 == null) {
				return null;
			}

			return var4.getModel(arg0, arg1, arg2);
		}

		Model var5 = (Model) modelCacheStatic.get(type);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < models.length; var7++) {
				if (!Model.validate(models[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			Model[] var8 = new Model[models.length];
			for (int var9 = 0; var9 < models.length; var9++) {
				var8[var9] = Model.tryGet(models[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new Model(var8.length, var8);
			}

			if (recol_s != null) {
				for (int var10 = 0; var10 < recol_s.length; var10++) {
					var5.recolour(recol_s[var10], recol_d[var10]);
				}
			}

			var5.createLabelReferences();
			var5.calculateNormals(ambient + 64, contrast + 850, -30, -50, -30, true);
			modelCacheStatic.put(var5, type);
		}

		Model var11 = Model.empty;
		var11.set(var5, AnimFrame.isNull(arg1) & AnimFrame.isNull(arg0));

		if (arg1 != -1 && arg0 != -1) {
			var11.applyTransforms(arg2, arg0, arg1);
		} else if (arg1 != -1) {
			var11.applyTransform(arg1);
		}

		if (resizeh != 128 || resizev != 128) {
			var11.scale(resizeh, resizeh, resizev);
		}

		var11.calculateBoundsCylinder();
		var11.labelFaces = null;
		var11.labelVertices = null;

		if (size == 1) {
			var11.picking = true;
		}

		return var11;
	}

	@ObfuscatedName("CKDEJADD.a(ZLMBMGIXGO;)V")
	public final void decodeClient(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.g1();
				models = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					models[var4] = arg0.g2();
				}
			} else if (var2 == 2) {
				name = arg0.gjstr();
			} else if (var2 == 3) {
				desc = arg0.gjstrraw();
			} else if (var2 == 12) {
				size = arg0.g1b();
			} else if (var2 == 13) {
				readyanim = arg0.g2();
			} else if (var2 == 14) {
				walkanim = arg0.g2();
			} else if (var2 == 17) {
				walkanim = arg0.g2();
				walkanim_b = arg0.g2();
				walkanim_r = arg0.g2();
				walkanim_l = arg0.g2();
			} else if (var2 >= 30 && var2 < 40) {
				if (op == null) {
					op = new String[5];
				}

				op[var2 - 30] = arg0.gjstr();
				if (op[var2 - 30].equalsIgnoreCase("hidden")) {
					op[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.g1();
				recol_s = new int[var5];
				recol_d = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					recol_s[var6] = arg0.g2();
					recol_d[var6] = arg0.g2();
				}
			} else if (var2 == 60) {
				int var7 = arg0.g1();
				heads = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					heads[var8] = arg0.g2();
				}
			} else if (var2 == 90) {
				field59 = arg0.g2();
			} else if (var2 == 91) {
				field36 = arg0.g2();
			} else if (var2 == 92) {
				field53 = arg0.g2();
			} else if (var2 == 93) {
				minimap = false;
			} else if (var2 == 95) {
				vislevel = arg0.g2();
			} else if (var2 == 97) {
				resizeh = arg0.g2();
			} else if (var2 == 98) {
				resizev = arg0.g2();
			} else if (var2 == 99) {
				alwaysontop = true;
			} else if (var2 == 100) {
				ambient = arg0.g1b();
			} else if (var2 == 101) {
				contrast = arg0.g1b() * 5;
			} else if (var2 == 102) {
				headicon = arg0.g2();
			} else if (var2 == 103) {
				turnspeed = arg0.g2();
			} else if (var2 == 106) {
				multivarbit = arg0.g2();
				if (multivarbit == 0xFFFF) {
					multivarbit = -1;
				}

				mutlivarp = arg0.g2();
				if (mutlivarp == 0xFFFF) {
					mutlivarp = -1;
				}

				int var9 = arg0.g1();
				multinpc = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					multinpc[var10] = arg0.g2();
					if (multinpc[var10] == 0xFFFF) {
						multinpc[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				active = false;
			}
		}
	}
}
