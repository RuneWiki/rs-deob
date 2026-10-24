package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("ac")
public final class LocType {

	@ObfuscatedName("ac.c")
	public static boolean field696;

	@ObfuscatedName("ac.d")
	public static int numDefinitions;

	@ObfuscatedName("ac.e")
	public static int[] idx;

	@ObfuscatedName("ac.f")
	public static Packet dat;

	@ObfuscatedName("ac.g")
	public static LocType[] recent;

	@ObfuscatedName("ac.h")
	public static int recentPos;

	@ObfuscatedName("ac.i")
	public int id = -1;

	@ObfuscatedName("ac.j")
	public int[] model;

	@ObfuscatedName("ac.k")
	public int[] shape;

	@ObfuscatedName("ac.l")
	public String name;

	@ObfuscatedName("ac.m")
	public byte[] desc;

	@ObfuscatedName("ac.n")
	public int[] recol_s;

	@ObfuscatedName("ac.o")
	public int[] recol_d;

	@ObfuscatedName("ac.p")
	public int width;

	@ObfuscatedName("ac.q")
	public int length;

	@ObfuscatedName("ac.r")
	public boolean blockwalk;

	@ObfuscatedName("ac.s")
	public boolean blockrange;

	@ObfuscatedName("ac.t")
	public boolean active;

	@ObfuscatedName("ac.u")
	public boolean hillskew;

	@ObfuscatedName("ac.v")
	public boolean sharelight;

	@ObfuscatedName("ac.w")
	public boolean occlude;

	@ObfuscatedName("ac.x")
	public int anim;

	@ObfuscatedName("ac.y")
	public int wallwidth;

	@ObfuscatedName("ac.z")
	public byte ambient;

	@ObfuscatedName("ac.P")
	public static LruCache mc1 = new LruCache(500);

	@ObfuscatedName("ac.Q")
	public static LruCache mc2 = new LruCache(30);

	@ObfuscatedName("ac.A")
	public byte contrast;

	@ObfuscatedName("ac.D")
	public int mapfunction;

	@ObfuscatedName("ac.E")
	public int mapscene;

	@ObfuscatedName("ac.H")
	public int resizex;

	@ObfuscatedName("ac.I")
	public int resizey;

	@ObfuscatedName("ac.J")
	public int resizez;

	@ObfuscatedName("ac.K")
	public int offsetx;

	@ObfuscatedName("ac.L")
	public int offsety;

	@ObfuscatedName("ac.M")
	public int offsetz;

	@ObfuscatedName("ac.N")
	public int forceapproach;

	@ObfuscatedName("ac.C")
	public boolean animateTransparencies;

	@ObfuscatedName("ac.F")
	public boolean mirror;

	@ObfuscatedName("ac.G")
	public boolean shadow;

	@ObfuscatedName("ac.O")
	public boolean forcedecor;

	@ObfuscatedName("ac.B")
	public String[] op;

	@ObfuscatedName("ac.a(Lub;)V")
	public static final void init(JagFile arg0) {
		dat = new Packet(arg0.read("loc.dat", null));
		Packet var1 = new Packet(arg0.read("loc.idx", null));
		numDefinitions = var1.g2();
		idx = new int[numDefinitions];
		int var2 = 2;
		for (int var3 = 0; var3 < numDefinitions; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}

		recent = new LocType[10];
		for (int var4 = 0; var4 < 10; var4++) {
			recent[var4] = new LocType();
		}
	}

	@ObfuscatedName("ac.a(Z)V")
	public static final void unload() {
		mc1 = null;
		mc2 = null;
		idx = null;
		recent = null;
		dat = null;
	}

	@ObfuscatedName("ac.a(I)Lac;")
	public static final LocType list(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (recent[var1].id == arg0) {
				return recent[var1];
			}
		}

		recentPos = (recentPos + 1) % 10;
		LocType var2 = recent[recentPos];
		dat.pos = idx[arg0];
		var2.id = arg0;
		var2.reset();
		var2.decode(dat);
		return var2;
	}

	@ObfuscatedName("ac.a()V")
	public final void reset() {
		model = null;
		shape = null;
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
		animateTransparencies = false;
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
	}

	@ObfuscatedName("ac.a(ZLkb;)V")
	public final void decode(Packet arg0) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.g1();
			if (var3 == 0) {
				break;
			}

			if (var3 == 1) {
				int var4 = arg0.g1();
				shape = new int[var4];
				model = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					model[var5] = arg0.g2();
					shape[var5] = arg0.g1();
				}
			} else if (var3 == 2) {
				name = arg0.gstr();
			} else if (var3 == 3) {
				desc = arg0.gstrbyte();
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
			} else if (var3 == 25) {
				animateTransparencies = true;
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

				op[var3 - 30] = arg0.gstr();
				if (op[var3 - 30].equalsIgnoreCase("hidden")) {
					op[var3 - 30] = null;
				}
			} else if (var3 == 40) {
				int var6 = arg0.g1();
				recol_s = new int[var6];
				recol_d = new int[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					recol_s[var7] = arg0.g2();
					recol_d[var7] = arg0.g2();
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
			}
		}

		if (shape == null) {
			shape = new int[0];
		}

		if (var2 == -1) {
			active = false;
			if (shape.length > 0 && shape[0] == 10) {
				active = true;
			}

			if (op != null) {
				active = true;
			}
		}
	}

	@ObfuscatedName("ac.a(IIIIIII)Leb;")
	public final Model buildModel(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = -1;
		for (int var9 = 0; var9 < shape.length; var9++) {
			if (shape[var9] == arg0) {
				var8 = var9;
				break;
			}
		}

		if (var8 == -1) {
			return null;
		}

		long var10 = ((long) (arg6 + 1) << 32) + ((id << 6) + (var8 << 3) + arg1);
		if (field696) {
			var10 = 0L;
		}

		Model var12 = (Model) mc2.find(var10);
		if (var12 == null) {
			if (var8 >= model.length) {
				return null;
			}

			int var20 = model[var8];
			if (var20 == -1) {
				return null;
			}

			boolean var21 = mirror ^ arg1 > 3;
			if (var21) {
				var20 += 0x10000;
			}

			Model var22 = (Model) mc1.find(var20);
			if (var22 == null) {
				var22 = new Model(var20 & 0xFFFF);
				if (var21) {
					var22.mirror();
				}

				mc1.put(var20, var22);
			}

			boolean var23;
			if (resizex == 128 && resizey == 128 && resizez == 128) {
				var23 = false;
			} else {
				var23 = true;
			}

			boolean var24;
			if (offsetx == 0 && offsety == 0 && offsetz == 0) {
				var24 = false;
			} else {
				var24 = true;
			}

			Model var25 = new Model(var22, recol_s == null, !animateTransparencies, arg1 == 0 && arg6 == -1 && !var23 && !var24);
			if (arg6 != -1) {
				var25.prepareAnim();
				var25.animate(arg6);
				var25.labelFaces = null;
				var25.labelVertices = null;
			}

			while (arg1-- > 0) {
				var25.rotate90();
			}

			if (recol_s != null) {
				for (int var26 = 0; var26 < recol_s.length; var26++) {
					var25.recolour(recol_s[var26], recol_d[var26]);
				}
			}

			if (var23) {
				var25.resize(resizez, resizey, resizex);
			}

			if (var24) {
				var25.translate(offsety, offsetx, offsetz);
			}

			var25.calculateNormals(ambient + 64, contrast * 5 + 768, -50, -10, -50, !sharelight);

			if (blockwalk) {
				var25.objRaise = var25.minY;
			}

			mc2.put(var10, var25);

			if (hillskew || sharelight) {
				var25 = new Model(var25, hillskew, sharelight);
			}

			if (hillskew) {
				int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var28 = 0; var28 < var25.numPoints; var28++) {
					int var29 = var25.pointX[var28];
					int var30 = var25.pointZ[var28];
					int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
					int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
					int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
					var25.pointY[var28] += var33 - var27;
				}

				var25.recalcBoundingCylinder();
			}

			return var25;
		} else if (field696) {
			return var12;
		} else {
			if (hillskew || sharelight) {
				var12 = new Model(var12, hillskew, sharelight);
			}

			if (hillskew) {
				int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var14 = 0; var14 < var12.numPoints; var14++) {
					int var15 = var12.pointX[var14];
					int var16 = var12.pointZ[var14];
					int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
					int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
					int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
					var12.pointY[var14] += var19 - var13;
				}

				var12.recalcBoundingCylinder();
			}

			return var12;
		}
	}
}
