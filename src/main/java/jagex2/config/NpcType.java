package jagex2.config;

import deob.ObfuscatedName;
import deob.client;
import jagex2.datastruct.LruCache;
import jagex2.graphics.AnimFrame;
import jagex2.graphics.Model;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

public class NpcType {

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

	@ObfuscatedName("CKDEJADD.i")
	public int _flowObfuscator1 = 9;

	@ObfuscatedName("CKDEJADD.j")
	public int _flowObfuscator2 = 1834;

	@ObfuscatedName("CKDEJADD.m")
	public int walkanim = -1;

	@ObfuscatedName("CKDEJADD.n")
	public byte size = 1;

	@ObfuscatedName("CKDEJADD.o")
	public int _flowObfuscator3 = 9;

	@ObfuscatedName("CKDEJADD.q")
	public int field50 = -1;

	@ObfuscatedName("CKDEJADD.u")
	public int headicon = -1;

	@ObfuscatedName("CKDEJADD.w")
	public int readyanim = -1;

	@ObfuscatedName("CKDEJADD.x")
	public long type = -1L;

	@ObfuscatedName("CKDEJADD.y")
	public int turnspeed = 32;

	@ObfuscatedName("CKDEJADD.A")
	public boolean _flowObfuscator5 = false;

	@ObfuscatedName("CKDEJADD.C")
	public int walkanim_r = -1;

	@ObfuscatedName("CKDEJADD.D")
	public boolean active = true;

	@ObfuscatedName("CKDEJADD.F")
	public int resizev = 128;

	@ObfuscatedName("CKDEJADD.G")
	public boolean minimap = true;

	@ObfuscatedName("CKDEJADD.J")
	public int field69 = -1;

	@ObfuscatedName("CKDEJADD.K")
	public int resizeh = 128;

	@ObfuscatedName("CKDEJADD.M")
	public boolean alwaysontop = false;

	@ObfuscatedName("CKDEJADD.P")
	public int field75 = -1;

	@ObfuscatedName("CKDEJADD.t")
	public static int _flowObfuscator4 = 748;

	@ObfuscatedName("CKDEJADD.O")
	public static LruCache modelCacheStatic = new LruCache(false, 30);

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
			if ((long) arg0 == cache[var1].type) {
				return cache[var1];
			}
		}
		cachePos = (cachePos + 1) % 20;
		NpcType var2 = cache[cachePos] = new NpcType();
		dat.pos = idx[arg0];
		var2.type = arg0;
		var2.decodeClient(true, dat);
		return var2;
	}

	@ObfuscatedName("CKDEJADD.a(Z)LZKARKDQW;")
	public final Model getHeadModel(boolean arg0) {
		if (this.multinpc != null) {
			NpcType var2 = this.getMultiNpc(this._flowObfuscator2);
			return var2 == null ? null : var2.getHeadModel(true);
		} else if (this.heads == null) {
			return null;
		} else {
			boolean var3 = false;
			if (!arg0) {
				this._flowObfuscator2 = 303;
			}
			for (int var4 = 0; var4 < this.heads.length; var4++) {
				if (!Model.validate(this.heads[var4])) {
					var3 = true;
				}
			}
			if (var3) {
				return null;
			}
			Model[] var5 = new Model[this.heads.length];
			for (int var6 = 0; var6 < this.heads.length; var6++) {
				var5[var6] = Model.tryGet(this._flowObfuscator3, this.heads[var6]);
			}
			Model var7;
			if (var5.length == 1) {
				var7 = var5[0];
			} else {
				var7 = new Model(var5.length, var5, -38);
			}
			if (this.recol_s != null) {
				for (int var8 = 0; var8 < this.recol_s.length; var8++) {
					var7.recolour(this.recol_s[var8], this.recol_d[var8]);
				}
			}
			return var7;
		}
	}

	@ObfuscatedName("CKDEJADD.b(I)LCKDEJADD;")
	public final NpcType getMultiNpc(int arg0) {
		int var2 = -1;
		if (arg0 != 1834) {
			this._flowObfuscator5 = !this._flowObfuscator5;
		}
		if (this.multivarbit != -1) {
			VarbitType var3 = VarbitType.instances[this.multivarbit];
			int var4 = var3.basevar;
			int var5 = var3.startbit;
			int var6 = var3.endbit;
			int var7 = client.BITMASK[var6 - var5];
			var2 = varProvider.varps[var4] >> var5 & var7;
		} else if (this.mutlivarp != -1) {
			var2 = varProvider.varps[this.mutlivarp];
		}
		return var2 < 0 || var2 >= this.multinpc.length || this.multinpc[var2] == -1 ? null : get(this.multinpc[var2]);
	}

	@ObfuscatedName("CKDEJADD.a(LXTGLDHGX;)V")
	public static final void unpack(Jagfile arg0) {
		dat = new Packet(arg0.read("npc.dat", null), 891);
		Packet var1 = new Packet(arg0.read("npc.idx", null), 891);
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
	public static final void unload(int arg0) {
		modelCacheStatic = null;
		idx = null;
		if (arg0 >= 0) {
			_flowObfuscator4 = 60;
		}
		cache = null;
		dat = null;
	}

	@ObfuscatedName("CKDEJADD.a(III[I)LZKARKDQW;")
	public final Model getModel(int arg0, int arg1, int arg2, int[] arg3) {
		if (this.multinpc != null) {
			NpcType var5 = this.getMultiNpc(this._flowObfuscator2);
			return var5 == null ? null : var5.getModel(0, arg1, arg2, arg3);
		}
		Model var6 = (Model) modelCacheStatic.get(this.type);
		if (arg0 != 0) {
			for (int var7 = 1; var7 > 0; var7++) {
			}
		}
		if (var6 == null) {
			boolean var8 = false;
			for (int var9 = 0; var9 < this.models.length; var9++) {
				if (!Model.validate(this.models[var9])) {
					var8 = true;
				}
			}
			if (var8) {
				return null;
			}
			Model[] var10 = new Model[this.models.length];
			for (int var11 = 0; var11 < this.models.length; var11++) {
				var10[var11] = Model.tryGet(this._flowObfuscator3, this.models[var11]);
			}
			if (var10.length == 1) {
				var6 = var10[0];
			} else {
				var6 = new Model(var10.length, var10, -38);
			}
			if (this.recol_s != null) {
				for (int var12 = 0; var12 < this.recol_s.length; var12++) {
					var6.recolour(this.recol_s[var12], this.recol_d[var12]);
				}
			}
			var6.createLabelReferences((byte) -71);
			var6.calculateNormals(this.ambient + 64, this.contrast + 850, -30, -50, -30, true);
			modelCacheStatic.put(var6, this.type, (byte) 2);
		}
		Model var13 = Model.empty;
		var13.set(7, var6, AnimFrame.isNull(arg2, false) & AnimFrame.isNull(arg1, false));
		if (arg2 != -1 && arg1 != -1) {
			var13.applyTransforms(-20491, arg3, arg1, arg2);
		} else if (arg2 != -1) {
			var13.applyTransform(arg2, 40542);
		}
		if (this.resizeh != 128 || this.resizev != 128) {
			var13.scale(this.resizeh, this.resizeh, this._flowObfuscator1, this.resizev);
		}
		var13.calculateBoundsCylinder(false);
		var13.labelFaces = null;
		var13.labelVertices = null;
		if (this.size == 1) {
			var13.picking = true;
		}
		return var13;
	}

	@ObfuscatedName("CKDEJADD.a(ZLMBMGIXGO;)V")
	public final void decodeClient(boolean arg0, Packet arg1) {
		if (!arg0) {
			throw new NullPointerException();
		}
		while (true) {
			while (true) {
				int var3 = arg1.g1();
				if (var3 == 0) {
					return;
				}
				if (var3 == 1) {
					int var4 = arg1.g1();
					this.models = new int[var4];
					for (int var5 = 0; var5 < var4; var5++) {
						this.models[var5] = arg1.g2();
					}
				} else if (var3 == 2) {
					this.name = arg1.gjstr();
				} else if (var3 == 3) {
					this.desc = arg1.gjstrraw((byte) 30);
				} else if (var3 == 12) {
					this.size = arg1.g1b();
				} else if (var3 == 13) {
					this.readyanim = arg1.g2();
				} else if (var3 == 14) {
					this.walkanim = arg1.g2();
				} else if (var3 == 17) {
					this.walkanim = arg1.g2();
					this.walkanim_b = arg1.g2();
					this.walkanim_r = arg1.g2();
					this.walkanim_l = arg1.g2();
				} else if (var3 >= 30 && var3 < 40) {
					if (this.op == null) {
						this.op = new String[5];
					}
					this.op[var3 - 30] = arg1.gjstr();
					if (this.op[var3 - 30].equalsIgnoreCase("hidden")) {
						this.op[var3 - 30] = null;
					}
				} else if (var3 == 40) {
					int var6 = arg1.g1();
					this.recol_s = new int[var6];
					this.recol_d = new int[var6];
					for (int var7 = 0; var7 < var6; var7++) {
						this.recol_s[var7] = arg1.g2();
						this.recol_d[var7] = arg1.g2();
					}
				} else if (var3 == 60) {
					int var8 = arg1.g1();
					this.heads = new int[var8];
					for (int var9 = 0; var9 < var8; var9++) {
						this.heads[var9] = arg1.g2();
					}
				} else if (var3 == 90) {
					this.field75 = arg1.g2();
				} else if (var3 == 91) {
					this.field50 = arg1.g2();
				} else if (var3 == 92) {
					this.field69 = arg1.g2();
				} else if (var3 == 93) {
					this.minimap = false;
				} else if (var3 == 95) {
					this.vislevel = arg1.g2();
				} else if (var3 == 97) {
					this.resizeh = arg1.g2();
				} else if (var3 == 98) {
					this.resizev = arg1.g2();
				} else if (var3 == 99) {
					this.alwaysontop = true;
				} else if (var3 == 100) {
					this.ambient = arg1.g1b();
				} else if (var3 == 101) {
					this.contrast = arg1.g1b() * 5;
				} else if (var3 == 102) {
					this.headicon = arg1.g2();
				} else if (var3 == 103) {
					this.turnspeed = arg1.g2();
				} else if (var3 == 106) {
					this.multivarbit = arg1.g2();
					if (this.multivarbit == 65535) {
						this.multivarbit = -1;
					}
					this.mutlivarp = arg1.g2();
					if (this.mutlivarp == 65535) {
						this.mutlivarp = -1;
					}
					int var10 = arg1.g1();
					this.multinpc = new int[var10 + 1];
					for (int var11 = 0; var11 <= var10; var11++) {
						this.multinpc[var11] = arg1.g2();
						if (this.multinpc[var11] == 65535) {
							this.multinpc[var11] = -1;
						}
					}
				} else if (var3 == 107) {
					this.active = false;
				}
			}
		}
	}
}
