package jagex2.config;

import deob.ObfuscatedName;
import deob.client;
import jagex2.datastruct.LruCache;
import jagex2.graphics.AnimFrame;
import jagex2.graphics.Model;
import jagex2.io.Jagfile;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

public class LocType {

	@ObfuscatedName("YZDBYLRM.h")
	public int _flowObfuscator1 = 9;

	@ObfuscatedName("YZDBYLRM.s")
	public int type = -1;

	@ObfuscatedName("YZDBYLRM.B")
	public boolean _flowObfuscator3 = true;

	@ObfuscatedName("YZDBYLRM.I")
	public int _flowObfuscator4 = 9;

	@ObfuscatedName("YZDBYLRM.f")
	public static Model[] temp = new Model[4];

	@ObfuscatedName("YZDBYLRM.S")
	public static LruCache modelCacheDynamic = new LruCache(false, 30);

	@ObfuscatedName("YZDBYLRM.X")
	public static LruCache modelCacheStatic = new LruCache(false, 500);

	@ObfuscatedName("YZDBYLRM.b")
	public byte ambient;

	@ObfuscatedName("YZDBYLRM.g")
	public byte contrast;

	@ObfuscatedName("YZDBYLRM.c")
	public int offsetx;

	@ObfuscatedName("YZDBYLRM.e")
	public int resizez;

	@ObfuscatedName("YZDBYLRM.i")
	public int width;

	@ObfuscatedName("YZDBYLRM.j")
	public int offsety;

	@ObfuscatedName("YZDBYLRM.k")
	public int mapfunction;

	@ObfuscatedName("YZDBYLRM.m")
	public int resizex;

	@ObfuscatedName("YZDBYLRM.n")
	public int multivarp;

	@ObfuscatedName("YZDBYLRM.o")
	public int _flowObfuscator2;

	@ObfuscatedName("YZDBYLRM.u")
	public static int count;

	@ObfuscatedName("YZDBYLRM.w")
	public int mapscene;

	@ObfuscatedName("YZDBYLRM.y")
	public int raiseobject;

	@ObfuscatedName("YZDBYLRM.z")
	public int length;

	@ObfuscatedName("YZDBYLRM.G")
	public int forceapproach;

	@ObfuscatedName("YZDBYLRM.J")
	public static int cachePos;

	@ObfuscatedName("YZDBYLRM.K")
	public int resizey;

	@ObfuscatedName("YZDBYLRM.M")
	public int multivarbit;

	@ObfuscatedName("YZDBYLRM.N")
	public int wallwidth;

	@ObfuscatedName("YZDBYLRM.T")
	public int anim;

	@ObfuscatedName("YZDBYLRM.V")
	public int offsetz;

	@ObfuscatedName("YZDBYLRM.r")
	public static Packet dat;

	@ObfuscatedName("YZDBYLRM.D")
	public static client varProvider;

	@ObfuscatedName("YZDBYLRM.d")
	public String name;

	@ObfuscatedName("YZDBYLRM.a")
	public boolean forcedecor;

	@ObfuscatedName("YZDBYLRM.p")
	public boolean mirror;

	@ObfuscatedName("YZDBYLRM.q")
	public static boolean lowMemory;

	@ObfuscatedName("YZDBYLRM.v")
	public boolean blockrange;

	@ObfuscatedName("YZDBYLRM.A")
	public boolean hillskew;

	@ObfuscatedName("YZDBYLRM.C")
	public boolean occlude;

	@ObfuscatedName("YZDBYLRM.E")
	public boolean breakroutefinding;

	@ObfuscatedName("YZDBYLRM.F")
	public boolean blockwalk;

	@ObfuscatedName("YZDBYLRM.H")
	public boolean sharelight;

	@ObfuscatedName("YZDBYLRM.Q")
	public boolean active;

	@ObfuscatedName("YZDBYLRM.R")
	public boolean shadow;

	@ObfuscatedName("YZDBYLRM.P")
	public byte[] desc;

	@ObfuscatedName("YZDBYLRM.l")
	public int[] recol_d;

	@ObfuscatedName("YZDBYLRM.t")
	public static int[] idx;

	@ObfuscatedName("YZDBYLRM.x")
	public int[] multiloc;

	@ObfuscatedName("YZDBYLRM.L")
	public int[] models;

	@ObfuscatedName("YZDBYLRM.O")
	public int[] shapes;

	@ObfuscatedName("YZDBYLRM.W")
	public int[] recol_s;

	@ObfuscatedName("YZDBYLRM.U")
	public static LocType[] cache;

	@ObfuscatedName("YZDBYLRM.Y")
	public String[] op;

	@ObfuscatedName("YZDBYLRM.a(I)LYZDBYLRM;")
	public static final LocType get(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (cache[var1].type == arg0) {
				return cache[var1];
			}
		}
		cachePos = (cachePos + 1) % 20;
		LocType var2 = cache[cachePos];
		dat.pos = idx[arg0];
		var2.type = arg0;
		var2.reset();
		var2.decodeClient(true, dat);
		return var2;
	}

	@ObfuscatedName("YZDBYLRM.a()V")
	public final void reset() {
		this.models = null;
		this.shapes = null;
		this.name = null;
		this.desc = null;
		this.recol_s = null;
		this.recol_d = null;
		this.width = 1;
		this.length = 1;
		this.blockwalk = true;
		this.blockrange = true;
		this.active = false;
		this.hillskew = false;
		this.sharelight = false;
		this.occlude = false;
		this.anim = -1;
		this.wallwidth = 16;
		this.ambient = 0;
		this.contrast = 0;
		this.op = null;
		this.mapfunction = -1;
		this.mapscene = -1;
		this.mirror = false;
		this.shadow = true;
		this.resizex = 128;
		this.resizey = 128;
		this.resizez = 128;
		this.forceapproach = 0;
		this.offsetx = 0;
		this.offsety = 0;
		this.offsetz = 0;
		this.forcedecor = false;
		this.breakroutefinding = false;
		this.raiseobject = -1;
		this.multivarbit = -1;
		this.multivarp = -1;
		this.multiloc = null;
	}

	@ObfuscatedName("YZDBYLRM.a(LGHOWLKWN;I)V")
	public final void prefetch(OnDemand arg0, int arg1) {
		if (this.models == null) {
			return;
		}
		for (int var3 = 0; var3 < this.models.length; var3++) {
			arg0.prefetch(this.models[var3] & 0xFFFF, 0, false);
		}
		while (arg1 >= 0) {
			this._flowObfuscator3 = !this._flowObfuscator3;
		}
	}

	@ObfuscatedName("YZDBYLRM.b(I)V")
	public static final void unload(int arg0) {
		modelCacheStatic = null;
		modelCacheDynamic = null;
		idx = null;
		cache = null;
		dat = null;
		if (arg0 >= 0) {
			;
		}
	}

	@ObfuscatedName("YZDBYLRM.a(LXTGLDHGX;)V")
	public static final void unpack(Jagfile arg0) {
		dat = new Packet(arg0.read("loc.dat", null), 891);
		Packet var1 = new Packet(arg0.read("loc.idx", null), 891);
		count = var1.g2();
		idx = new int[count];
		int var2 = 2;
		for (int var3 = 0; var3 < count; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}
		cache = new LocType[20];
		for (int var4 = 0; var4 < 20; var4++) {
			cache[var4] = new LocType();
		}
	}

	@ObfuscatedName("YZDBYLRM.a(IZ)Z")
	public final boolean validate(int arg0, boolean arg1) {
		if (!arg1) {
			throw new NullPointerException();
		} else if (this.shapes != null) {
			for (int var5 = 0; var5 < this.shapes.length; var5++) {
				if (this.shapes[var5] == arg0) {
					return Model.validate(this.models[var5] & 0xFFFF);
				}
			}
			return true;
		} else if (this.models == null) {
			return true;
		} else if (arg0 == 10) {
			boolean var3 = true;
			for (int var4 = 0; var4 < this.models.length; var4++) {
				var3 &= Model.validate(this.models[var4] & 0xFFFF);
			}
			return var3;
		} else {
			return true;
		}
	}

	@ObfuscatedName("YZDBYLRM.a(IIIIIII)LZKARKDQW;")
	public final Model getModel(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		Model var8 = this.getModel(0, arg0, arg6, arg1);
		if (var8 == null) {
			return null;
		}
		if (this.hillskew || this.sharelight) {
			var8 = new Model(this.hillskew, -819, this.sharelight, var8);
		}
		if (this.hillskew) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.vertexCount; var10++) {
				int var11 = var8.vertexX[var10];
				int var12 = var8.vertexZ[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.vertexY[var10] += var15 - var9;
			}
			var8.calculateBoundsY(false);
		}
		return var8;
	}

	@ObfuscatedName("YZDBYLRM.a(Z)Z")
	public final boolean validate(boolean arg0) {
		if (this.models == null) {
			return true;
		}
		boolean var2 = true;
		for (int var3 = 0; var3 < this.models.length; var3++) {
			var2 &= Model.validate(this.models[var3] & 0xFFFF);
		}
		if (!arg0) {
			throw new NullPointerException();
		}
		return var2;
	}

	@ObfuscatedName("YZDBYLRM.b(Z)LYZDBYLRM;")
	public final LocType getMultiLoc(boolean arg0) {
		if (!arg0) {
			throw new NullPointerException();
		}
		int var2 = -1;
		if (this.multivarbit != -1) {
			VarbitType var3 = VarbitType.instances[this.multivarbit];
			int var4 = var3.basevar;
			int var5 = var3.startbit;
			int var6 = var3.endbit;
			int var7 = client.BITMASK[var6 - var5];
			var2 = varProvider.varps[var4] >> var5 & var7;
		} else if (this.multivarp != -1) {
			var2 = varProvider.varps[this.multivarp];
		}
		return var2 < 0 || var2 >= this.multiloc.length || this.multiloc[var2] == -1 ? null : get(this.multiloc[var2]);
	}

	@ObfuscatedName("YZDBYLRM.a(IIII)LZKARKDQW;")
	public final Model getModel(int arg0, int arg1, int arg2, int arg3) {
		Model var5 = null;
		long var6;
		if (this.shapes == null) {
			if (arg1 != 10) {
				return null;
			}
			var6 = ((long) (arg2 + 1) << 32) + (long) ((this.type << 6) + arg3);
			Model var8 = (Model) modelCacheDynamic.get(var6);
			if (var8 != null) {
				return var8;
			}
			if (this.models == null) {
				return null;
			}
			boolean var9 = this.mirror ^ arg3 > 3;
			int var10 = this.models.length;
			for (int var11 = 0; var11 < var10; var11++) {
				int var12 = this.models[var11];
				if (var9) {
					var12 += 65536;
				}
				var5 = (Model) modelCacheStatic.get((long) var12);
				if (var5 == null) {
					var5 = Model.tryGet(this._flowObfuscator4, var12 & 0xFFFF);
					if (var5 == null) {
						return null;
					}
					if (var9) {
						var5.rotateY180(0);
					}
					modelCacheStatic.put(var5, (long) var12, (byte) 2);
				}
				if (var10 > 1) {
					temp[var11] = var5;
				}
			}
			if (var10 > 1) {
				var5 = new Model(var10, temp, -38);
			}
		} else {
			int var13 = -1;
			for (int var14 = 0; var14 < this.shapes.length; var14++) {
				if (this.shapes[var14] == arg1) {
					var13 = var14;
					break;
				}
			}
			if (var13 == -1) {
				return null;
			}
			var6 = ((long) (arg2 + 1) << 32) + (long) ((this.type << 6) + (var13 << 3) + arg3);
			Model var15 = (Model) modelCacheDynamic.get(var6);
			if (var15 != null) {
				return var15;
			}
			int var16 = this.models[var13];
			boolean var17 = this.mirror ^ arg3 > 3;
			if (var17) {
				var16 += 65536;
			}
			var5 = (Model) modelCacheStatic.get((long) var16);
			if (var5 == null) {
				var5 = Model.tryGet(this._flowObfuscator4, var16 & 0xFFFF);
				if (var5 == null) {
					return null;
				}
				if (var17) {
					var5.rotateY180(0);
				}
				modelCacheStatic.put(var5, (long) var16, (byte) 2);
			}
		}
		boolean var18;
		if (this.resizex == 128 && this.resizey == 128 && this.resizez == 128) {
			var18 = false;
		} else {
			var18 = true;
		}
		boolean var19;
		if (this.offsetx == 0 && this.offsety == 0 && this.offsetz == 0) {
			var19 = false;
		} else {
			var19 = true;
		}
		Model var20 = new Model(9, this.recol_s == null, AnimFrame.isNull(arg2, false), arg3 == 0 && arg2 == -1 && !var18 && !var19, var5);
		if (arg2 != -1) {
			var20.createLabelReferences((byte) -71);
			var20.applyTransform(arg2, 40542);
			var20.labelFaces = null;
			var20.labelVertices = null;
		}
		while (arg3-- > 0) {
			var20.rotateY90(360);
		}
		if (this.recol_s != null) {
			for (int var21 = 0; var21 < this.recol_s.length; var21++) {
				var20.recolour(this.recol_s[var21], this.recol_d[var21]);
			}
		}
		if (var18) {
			var20.scale(this.resizex, this.resizez, this._flowObfuscator1, this.resizey);
		}
		if (var19) {
			var20.translate(this.offsetx, this.offsety, 16384, this.offsetz);
		}
		var20.calculateNormals(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50, !this.sharelight);
		if (this.raiseobject == 1) {
			var20.objRaise = var20.minY;
		}
		modelCacheDynamic.put(var20, var6, (byte) 2);
		if (arg0 != 0) {
			this._flowObfuscator1 = 422;
		}
		return var20;
	}

	@ObfuscatedName("YZDBYLRM.a(ZLMBMGIXGO;)V")
	public final void decodeClient(boolean arg0, Packet arg1) {
		if (!arg0) {
			this._flowObfuscator2 = 217;
		}
		int var3 = -1;
		while (true) {
			while (true) {
				int var5;
				do {
					while (true) {
						int var4 = arg1.g1();
						if (var4 == 0) {
							if (var3 == -1) {
								this.active = false;
								if (this.models != null && (this.shapes == null || this.shapes[0] == 10)) {
									this.active = true;
								}
								if (this.op != null) {
									this.active = true;
								}
							}
							if (this.breakroutefinding) {
								this.blockwalk = false;
								this.blockrange = false;
							}
							if (this.raiseobject == -1) {
								this.raiseobject = this.blockwalk ? 1 : 0;
								return;
							}
							return;
						}
						if (var4 == 1) {
							var5 = arg1.g1();
							break;
						}
						if (var4 == 2) {
							this.name = arg1.gjstr();
						} else if (var4 == 3) {
							this.desc = arg1.gjstrraw((byte) 30);
						} else if (var4 == 5) {
							int var7 = arg1.g1();
							if (var7 > 0) {
								if (this.models == null || lowMemory) {
									this.shapes = null;
									this.models = new int[var7];
									for (int var8 = 0; var8 < var7; var8++) {
										this.models[var8] = arg1.g2();
									}
								} else {
									arg1.pos += var7 * 2;
								}
							}
						} else if (var4 == 14) {
							this.width = arg1.g1();
						} else if (var4 == 15) {
							this.length = arg1.g1();
						} else if (var4 == 17) {
							this.blockwalk = false;
						} else if (var4 == 18) {
							this.blockrange = false;
						} else if (var4 == 19) {
							var3 = arg1.g1();
							if (var3 == 1) {
								this.active = true;
							}
						} else if (var4 == 21) {
							this.hillskew = true;
						} else if (var4 == 22) {
							this.sharelight = true;
						} else if (var4 == 23) {
							this.occlude = true;
						} else if (var4 == 24) {
							this.anim = arg1.g2();
							if (this.anim == 65535) {
								this.anim = -1;
							}
						} else if (var4 == 28) {
							this.wallwidth = arg1.g1();
						} else if (var4 == 29) {
							this.ambient = arg1.g1b();
						} else if (var4 == 39) {
							this.contrast = arg1.g1b();
						} else if (var4 >= 30 && var4 < 39) {
							if (this.op == null) {
								this.op = new String[5];
							}
							this.op[var4 - 30] = arg1.gjstr();
							if (this.op[var4 - 30].equalsIgnoreCase("hidden")) {
								this.op[var4 - 30] = null;
							}
						} else if (var4 == 40) {
							int var9 = arg1.g1();
							this.recol_s = new int[var9];
							this.recol_d = new int[var9];
							for (int var10 = 0; var10 < var9; var10++) {
								this.recol_s[var10] = arg1.g2();
								this.recol_d[var10] = arg1.g2();
							}
						} else if (var4 == 60) {
							this.mapfunction = arg1.g2();
						} else if (var4 == 62) {
							this.mirror = true;
						} else if (var4 == 64) {
							this.shadow = false;
						} else if (var4 == 65) {
							this.resizex = arg1.g2();
						} else if (var4 == 66) {
							this.resizey = arg1.g2();
						} else if (var4 == 67) {
							this.resizez = arg1.g2();
						} else if (var4 == 68) {
							this.mapscene = arg1.g2();
						} else if (var4 == 69) {
							this.forceapproach = arg1.g1();
						} else if (var4 == 70) {
							this.offsetx = arg1.g2b();
						} else if (var4 == 71) {
							this.offsety = arg1.g2b();
						} else if (var4 == 72) {
							this.offsetz = arg1.g2b();
						} else if (var4 == 73) {
							this.forcedecor = true;
						} else if (var4 == 74) {
							this.breakroutefinding = true;
						} else if (var4 == 75) {
							this.raiseobject = arg1.g1();
						} else if (var4 == 77) {
							this.multivarbit = arg1.g2();
							if (this.multivarbit == 65535) {
								this.multivarbit = -1;
							}
							this.multivarp = arg1.g2();
							if (this.multivarp == 65535) {
								this.multivarp = -1;
							}
							int var11 = arg1.g1();
							this.multiloc = new int[var11 + 1];
							for (int var12 = 0; var12 <= var11; var12++) {
								this.multiloc[var12] = arg1.g2();
								if (this.multiloc[var12] == 65535) {
									this.multiloc[var12] = -1;
								}
							}
						}
					}
				} while (var5 <= 0);
				if (this.models == null || lowMemory) {
					this.shapes = new int[var5];
					this.models = new int[var5];
					for (int var6 = 0; var6 < var5; var6++) {
						this.models[var6] = arg1.g2();
						this.shapes[var6] = arg1.g1();
					}
				} else {
					arg1.pos += var5 * 3;
				}
			}
		}
	}
}
