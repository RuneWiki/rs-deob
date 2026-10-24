package jagex2.config;

import deob.ObfuscatedName;
import deob.client;
import jagex2.datastruct.LruCache;
import jagex2.graphics.AnimFrame;
import jagex2.graphics.Model;
import jagex2.io.Jagfile;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

@ObfuscatedName("YZDBYLRM")
public final class LocType {

	@ObfuscatedName("YZDBYLRM.s")
	public int type = -1;

	@ObfuscatedName("YZDBYLRM.f")
	public static Model[] temp = new Model[4];

	@ObfuscatedName("YZDBYLRM.S")
	public static LruCache modelCacheDynamic = new LruCache(30);

	@ObfuscatedName("YZDBYLRM.X")
	public static LruCache modelCacheStatic = new LruCache(500);

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
		var2.decodeClient(dat);
		return var2;
	}

	@ObfuscatedName("YZDBYLRM.a()V")
	public final void reset() {
		models = null;
		shapes = null;
		name = null;
		desc = null;
		recol_s = null;
		recol_d = null;
		width = 1;
		length = 1;
		blockwalk = true;
		blockrange = true;
		active = false;
		hillskew = false;
		sharelight = false;
		occlude = false;
		anim = -1;
		wallwidth = 16;
		ambient = 0;
		contrast = 0;
		op = null;
		mapfunction = -1;
		mapscene = -1;
		mirror = false;
		shadow = true;
		resizex = 128;
		resizey = 128;
		resizez = 128;
		forceapproach = 0;
		offsetx = 0;
		offsety = 0;
		offsetz = 0;
		forcedecor = false;
		breakroutefinding = false;
		raiseobject = -1;
		multivarbit = -1;
		multivarp = -1;
		multiloc = null;
	}

	@ObfuscatedName("YZDBYLRM.a(LGHOWLKWN;I)V")
	public final void prefetch(OnDemand arg0) {
		if (models != null) {
			for (int var2 = 0; var2 < models.length; var2++) {
				arg0.prefetch(models[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("YZDBYLRM.b(I)V")
	public static final void unload() {
		modelCacheStatic = null;
		modelCacheDynamic = null;
		idx = null;
		cache = null;
		dat = null;
	}

	@ObfuscatedName("YZDBYLRM.a(LXTGLDHGX;)V")
	public static final void unpack(Jagfile arg0) {
		dat = new Packet(arg0.read("loc.dat", null));
		Packet var1 = new Packet(arg0.read("loc.idx", null));
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
	public final boolean validate(int arg0) {
		if (shapes != null) {
			for (int var4 = 0; var4 < shapes.length; var4++) {
				if (shapes[var4] == arg0) {
					return Model.validate(models[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (models == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < models.length; var3++) {
				var2 &= Model.validate(models[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("YZDBYLRM.a(IIIIIII)LZKARKDQW;")
	public final Model getModel(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		Model var8 = getModel(arg0, arg6, arg1);
		if (var8 == null) {
			return null;
		}

		if (hillskew || sharelight) {
			var8 = new Model(hillskew, sharelight, var8);
		}

		if (hillskew) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.vertexCount; var10++) {
				int var11 = var8.vertexX[var10];
				int var12 = var8.vertexZ[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.vertexY[var10] += var15 - var9;
			}

			var8.calculateBoundsY();
		}

		return var8;
	}

	@ObfuscatedName("YZDBYLRM.a(Z)Z")
	public final boolean validate() {
		if (models == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < models.length; var2++) {
			var1 &= Model.validate(models[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("YZDBYLRM.b(Z)LYZDBYLRM;")
	public final LocType getMultiLoc() {
		int var1 = -1;
		if (multivarbit != -1) {
			VarbitType var2 = VarbitType.instances[multivarbit];
			int var3 = var2.basevar;
			int var4 = var2.startbit;
			int var5 = var2.endbit;
			int var6 = client.BITMASK[var5 - var4];
			var1 = varProvider.varps[var3] >> var4 & var6;
		} else if (multivarp != -1) {
			var1 = varProvider.varps[multivarp];
		}

		if (var1 >= 0 && var1 < multiloc.length && multiloc[var1] != -1) {
			return get(multiloc[var1]);
		}

		return null;
	}

	@ObfuscatedName("YZDBYLRM.a(IIII)LZKARKDQW;")
	public final Model getModel(int arg0, int arg1, int arg2) {
		Model var4 = null;
		long var5;
		if (shapes == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((type << 6) + arg2);
			Model var7 = (Model) modelCacheDynamic.get(var5);
			if (var7 != null) {
				return var7;
			}

			if (models == null) {
				return null;
			}

			boolean var8 = mirror ^ arg2 > 3;
			int var9 = models.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = models[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (Model) modelCacheStatic.get(var11);
				if (var4 == null) {
					var4 = Model.tryGet(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.rotateY180();
					}

					modelCacheStatic.put(var4, var11);
				}

				if (var9 > 1) {
					temp[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new Model(var9, temp);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < shapes.length; var13++) {
				if (shapes[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((type << 6) + (var12 << 3) + arg2);
			Model var14 = (Model) modelCacheDynamic.get(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = models[var12];
			boolean var16 = mirror ^ arg2 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (Model) modelCacheStatic.get(var15);
			if (var4 == null) {
				var4 = Model.tryGet(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.rotateY180();
				}

				modelCacheStatic.put(var4, var15);
			}
		}

		boolean var17;
		if (resizex == 128 && resizey == 128 && resizez == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (offsetx == 0 && offsety == 0 && offsetz == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		Model var19 = new Model(recol_s == null, AnimFrame.isNull(arg1), arg2 == 0 && arg1 == -1 && !var17 && !var18, var4);
		if (arg1 != -1) {
			var19.createLabelReferences();
			var19.applyTransform(arg1);
			var19.labelFaces = null;
			var19.labelVertices = null;
		}

		while (arg2-- > 0) {
			var19.rotateY90();
		}

		if (recol_s != null) {
			for (int var20 = 0; var20 < recol_s.length; var20++) {
				var19.recolour(recol_s[var20], recol_d[var20]);
			}
		}

		if (var17) {
			var19.scale(resizex, resizez, resizey);
		}

		if (var18) {
			var19.translate(offsetx, offsety, offsetz);
		}

		var19.calculateNormals(ambient + 64, contrast * 5 + 768, -50, -10, -50, !sharelight);

		if (raiseobject == 1) {
			var19.objRaise = var19.minY;
		}

		modelCacheDynamic.put(var19, var5);
		return var19;
	}

	@ObfuscatedName("YZDBYLRM.a(ZLMBMGIXGO;)V")
	public final void decodeClient(Packet arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.g1();
					if (var3 == 0) {
						if (var2 == -1) {
							active = false;
							if (models != null && (shapes == null || shapes[0] == 10)) {
								active = true;
							}

							if (op != null) {
								active = true;
							}
						}

						if (breakroutefinding) {
							blockwalk = false;
							blockrange = false;
						}

						if (raiseobject == -1) {
							raiseobject = blockwalk ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						name = arg0.gjstr();
					} else if (var3 == 3) {
						desc = arg0.gjstrraw();
					} else if (var3 == 5) {
						int var6 = arg0.g1();
						if (var6 > 0) {
							if (models == null || lowMemory) {
								shapes = null;
								models = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									models[var7] = arg0.g2();
								}
							} else {
								arg0.pos += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						width = arg0.g1();
					} else if (var3 == 15) {
						length = arg0.g1();
					} else if (var3 == 17) {
						blockwalk = false;
					} else if (var3 == 18) {
						blockrange = false;
					} else if (var3 == 19) {
						var2 = arg0.g1();
						if (var2 == 1) {
							active = true;
						}
					} else if (var3 == 21) {
						hillskew = true;
					} else if (var3 == 22) {
						sharelight = true;
					} else if (var3 == 23) {
						occlude = true;
					} else if (var3 == 24) {
						anim = arg0.g2();
						if (anim == 0xFFFF) {
							anim = -1;
						}
					} else if (var3 == 28) {
						wallwidth = arg0.g1();
					} else if (var3 == 29) {
						ambient = arg0.g1b();
					} else if (var3 == 39) {
						contrast = arg0.g1b();
					} else if (var3 >= 30 && var3 < 39) {
						if (op == null) {
							op = new String[5];
						}

						op[var3 - 30] = arg0.gjstr();
						if (op[var3 - 30].equalsIgnoreCase("hidden")) {
							op[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.g1();
						recol_s = new int[var8];
						recol_d = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							recol_s[var9] = arg0.g2();
							recol_d[var9] = arg0.g2();
						}
					} else if (var3 == 60) {
						mapfunction = arg0.g2();
					} else if (var3 == 62) {
						mirror = true;
					} else if (var3 == 64) {
						shadow = false;
					} else if (var3 == 65) {
						resizex = arg0.g2();
					} else if (var3 == 66) {
						resizey = arg0.g2();
					} else if (var3 == 67) {
						resizez = arg0.g2();
					} else if (var3 == 68) {
						mapscene = arg0.g2();
					} else if (var3 == 69) {
						forceapproach = arg0.g1();
					} else if (var3 == 70) {
						offsetx = arg0.g2b();
					} else if (var3 == 71) {
						offsety = arg0.g2b();
					} else if (var3 == 72) {
						offsetz = arg0.g2b();
					} else if (var3 == 73) {
						forcedecor = true;
					} else if (var3 == 74) {
						breakroutefinding = true;
					} else if (var3 == 75) {
						raiseobject = arg0.g1();
					} else if (var3 == 77) {
						multivarbit = arg0.g2();
						if (multivarbit == 0xFFFF) {
							multivarbit = -1;
						}

						multivarp = arg0.g2();
						if (multivarp == 0xFFFF) {
							multivarp = -1;
						}

						int var10 = arg0.g1();
						multiloc = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							multiloc[var11] = arg0.g2();
							if (multiloc[var11] == 0xFFFF) {
								multiloc[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.g1();
			} while (var4 <= 0);

			if (models == null || lowMemory) {
				shapes = new int[var4];
				models = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					models[var5] = arg0.g2();
					shapes[var5] = arg0.g1();
				}
			} else {
				arg0.pos += var4 * 3;
			}
		}
	}
}
