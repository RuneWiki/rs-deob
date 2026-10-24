package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.dash3d.Pix3D;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("hc")
public final class ObjType {

	@ObfuscatedName("hc.f")
	public static int numDefinitions;

	@ObfuscatedName("hc.g")
	public static int[] idx;

	@ObfuscatedName("hc.h")
	public static Packet dat;

	@ObfuscatedName("hc.i")
	public static ObjType[] recent;

	@ObfuscatedName("hc.j")
	public static int recentPos;

	@ObfuscatedName("hc.k")
	public static boolean memServer = true;

	@ObfuscatedName("hc.l")
	public int id = -1;

	@ObfuscatedName("hc.m")
	public int model;

	@ObfuscatedName("hc.n")
	public String name;

	@ObfuscatedName("hc.o")
	public byte[] desc;

	@ObfuscatedName("hc.p")
	public int[] recol_s;

	@ObfuscatedName("hc.q")
	public int[] recol_d;

	@ObfuscatedName("hc.r")
	public int zoom2d;

	@ObfuscatedName("hc.s")
	public int xan2d;

	@ObfuscatedName("hc.t")
	public int yan2d;

	@ObfuscatedName("hc.u")
	public int zan2d;

	@ObfuscatedName("hc.v")
	public int xof2d;

	@ObfuscatedName("hc.w")
	public int yof2d;

	@ObfuscatedName("hc.x")
	public int field911;

	@ObfuscatedName("hc.y")
	public boolean stackable;

	@ObfuscatedName("hc.z")
	public int cost;

	@ObfuscatedName("hc.Y")
	public static LruCache modelcache = new LruCache(50);

	@ObfuscatedName("hc.Z")
	public static LruCache spriteCache = new LruCache(100);

	@ObfuscatedName("hc.F")
	public byte manwearOffset;

	@ObfuscatedName("hc.I")
	public byte womanwearOffset;

	@ObfuscatedName("hc.D")
	public int manwear;

	@ObfuscatedName("hc.E")
	public int manwear2;

	@ObfuscatedName("hc.G")
	public int womanwear;

	@ObfuscatedName("hc.H")
	public int womanwear2;

	@ObfuscatedName("hc.J")
	public int manwear3;

	@ObfuscatedName("hc.K")
	public int womanwear3;

	@ObfuscatedName("hc.L")
	public int manhead;

	@ObfuscatedName("hc.M")
	public int manhead2;

	@ObfuscatedName("hc.N")
	public int womanhead;

	@ObfuscatedName("hc.O")
	public int womanhead2;

	@ObfuscatedName("hc.R")
	public int certlink;

	@ObfuscatedName("hc.S")
	public int certtemplate;

	@ObfuscatedName("hc.T")
	public int resizex;

	@ObfuscatedName("hc.U")
	public int resizey;

	@ObfuscatedName("hc.V")
	public int resizez;

	@ObfuscatedName("hc.W")
	public int ambient;

	@ObfuscatedName("hc.X")
	public int contrast;

	@ObfuscatedName("hc.A")
	public boolean members;

	@ObfuscatedName("hc.P")
	public int[] countobj;

	@ObfuscatedName("hc.Q")
	public int[] countco;

	@ObfuscatedName("hc.B")
	public String[] op;

	@ObfuscatedName("hc.C")
	public String[] iop;

	@ObfuscatedName("hc.a(Lyb;)V")
	public static final void init(JagFile arg0) {
		dat = new Packet(arg0.read("obj.dat", null));
		Packet var1 = new Packet(arg0.read("obj.idx", null));
		numDefinitions = var1.g2();
		idx = new int[numDefinitions];
		int var2 = 2;
		for (int var3 = 0; var3 < numDefinitions; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}

		recent = new ObjType[10];
		for (int var4 = 0; var4 < 10; var4++) {
			recent[var4] = new ObjType();
		}
	}

	@ObfuscatedName("hc.a(I)V")
	public static final void unload() {
		modelcache = null;
		spriteCache = null;
		idx = null;
		recent = null;
		dat = null;
	}

	@ObfuscatedName("hc.b(I)Lhc;")
	public static final ObjType list(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (recent[var1].id == arg0) {
				return recent[var1];
			}
		}

		recentPos = (recentPos + 1) % 10;
		ObjType var2 = recent[recentPos];
		dat.pos = idx[arg0];
		var2.id = arg0;
		var2.reset();
		var2.decode(dat);

		if (var2.certtemplate != -1) {
			var2.genCert();
		}

		if (!memServer && var2.members) {
			var2.name = "Members Object";
			var2.desc = "Login to a members' server to use this object.".getBytes();
			var2.op = null;
			var2.iop = null;
		}

		return var2;
	}

	@ObfuscatedName("hc.a()V")
	public final void reset() {
		model = 0;
		name = null;
		desc = null;
		recol_s = null;
		recol_d = null;
		zoom2d = 2000;
		xan2d = 0;
		yan2d = 0;
		zan2d = 0;
		xof2d = 0;
		yof2d = 0;
		field911 = -1;
		stackable = false;
		cost = 1;
		members = false;
		op = null;
		iop = null;
		manwear = -1;
		manwear2 = -1;
		manwearOffset = 0;
		womanwear = -1;
		womanwear2 = -1;
		womanwearOffset = 0;
		manwear3 = -1;
		womanwear3 = -1;
		manhead = -1;
		manhead2 = -1;
		womanhead = -1;
		womanhead2 = -1;
		countobj = null;
		countco = null;
		certlink = -1;
		certtemplate = -1;
		resizex = 128;
		resizey = 128;
		resizez = 128;
		ambient = 0;
		contrast = 0;
	}

	@ObfuscatedName("hc.a(ILmb;)V")
	public final void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				model = arg0.g2();
			} else if (var2 == 2) {
				name = arg0.gstr();
			} else if (var2 == 3) {
				desc = arg0.gstrbyte();
			} else if (var2 == 4) {
				zoom2d = arg0.g2();
			} else if (var2 == 5) {
				xan2d = arg0.g2();
			} else if (var2 == 6) {
				yan2d = arg0.g2();
			} else if (var2 == 7) {
				xof2d = arg0.g2();
				if (xof2d > 32767) {
					xof2d -= 0x10000;
				}
			} else if (var2 == 8) {
				yof2d = arg0.g2();
				if (yof2d > 32767) {
					yof2d -= 0x10000;
				}
			} else if (var2 == 10) {
				field911 = arg0.g2();
			} else if (var2 == 11) {
				stackable = true;
			} else if (var2 == 12) {
				cost = arg0.g4();
			} else if (var2 == 16) {
				members = true;
			} else if (var2 == 23) {
				manwear = arg0.g2();
				manwearOffset = arg0.g1b();
			} else if (var2 == 24) {
				manwear2 = arg0.g2();
			} else if (var2 == 25) {
				womanwear = arg0.g2();
				womanwearOffset = arg0.g1b();
			} else if (var2 == 26) {
				womanwear2 = arg0.g2();
			} else if (var2 >= 30 && var2 < 35) {
				if (op == null) {
					op = new String[5];
				}

				op[var2 - 30] = arg0.gstr();
				if (op[var2 - 30].equalsIgnoreCase("hidden")) {
					op[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (iop == null) {
					iop = new String[5];
				}

				iop[var2 - 35] = arg0.gstr();
			} else if (var2 == 40) {
				int var3 = arg0.g1();
				recol_s = new int[var3];
				recol_d = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					recol_s[var4] = arg0.g2();
					recol_d[var4] = arg0.g2();
				}
			} else if (var2 == 78) {
				manwear3 = arg0.g2();
			} else if (var2 == 79) {
				womanwear3 = arg0.g2();
			} else if (var2 == 90) {
				manhead = arg0.g2();
			} else if (var2 == 91) {
				womanhead = arg0.g2();
			} else if (var2 == 92) {
				manhead2 = arg0.g2();
			} else if (var2 == 93) {
				womanhead2 = arg0.g2();
			} else if (var2 == 95) {
				zan2d = arg0.g2();
			} else if (var2 == 97) {
				certlink = arg0.g2();
			} else if (var2 == 98) {
				certtemplate = arg0.g2();
			} else if (var2 >= 100 && var2 < 110) {
				if (countobj == null) {
					countobj = new int[10];
					countco = new int[10];
				}

				countobj[var2 - 100] = arg0.g2();
				countco[var2 - 100] = arg0.g2();
			} else if (var2 == 110) {
				resizex = arg0.g2();
			} else if (var2 == 111) {
				resizey = arg0.g2();
			} else if (var2 == 112) {
				resizez = arg0.g2();
			} else if (var2 == 113) {
				ambient = arg0.g1b();
			} else if (var2 == 114) {
				contrast = arg0.g1b() * 5;
			}
		}
	}

	@ObfuscatedName("hc.a(Z)V")
	public void genCert() {
		ObjType var1 = list(certtemplate);
		model = var1.model;
		zoom2d = var1.zoom2d;
		xan2d = var1.xan2d;
		yan2d = var1.yan2d;
		zan2d = var1.zan2d;
		xof2d = var1.xof2d;
		yof2d = var1.yof2d;
		recol_s = var1.recol_s;
		recol_d = var1.recol_d;
		ObjType var2 = list(certlink);
		name = var2.name;
		members = var2.members;
		cost = var2.cost;
		String var3 = "a";
		char var4 = var2.name.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		desc = ("Swap this note at any bank for " + var3 + " " + var2.name + ".").getBytes();
		stackable = true;
	}

	@ObfuscatedName("hc.c(I)Lfb;")
	public final Model getModelLit(int arg0) {
		if (countobj != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= countco[var3] && countco[var3] != 0) {
					var2 = countobj[var3];
				}
			}

			if (var2 != -1) {
				return list(var2).getModelLit(1);
			}
		}

		Model var4 = (Model) modelcache.find(id);
		if (var4 != null) {
			return var4;
		}

		Model var5 = Model.load(model);
		if (var5 == null) {
			return null;
		}

		if (resizex != 128 || resizey != 128 || resizez != 128) {
			var5.resize(resizez, resizex, resizey);
		}

		if (recol_s != null) {
			for (int var6 = 0; var6 < recol_s.length; var6++) {
				var5.recolour(recol_s[var6], recol_d[var6]);
			}
		}

		var5.calculateNormals(ambient + 64, contrast + 768, -50, -10, -50, true);
		var5.useAABBMouseCheck = true;
		modelcache.put(var5, id);
		return var5;
	}

	@ObfuscatedName("hc.a(II)Lfb;")
	public final Model getModelUnlit(int arg0) {
		if (countobj != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= countco[var3] && countco[var3] != 0) {
					var2 = countobj[var3];
				}
			}

			if (var2 != -1) {
				return list(var2).getModelUnlit(1);
			}
		}

		Model var4 = Model.load(model);
		if (var4 == null) {
			return null;
		}

		if (recol_s != null) {
			for (int var5 = 0; var5 < recol_s.length; var5++) {
				var4.recolour(recol_s[var5], recol_d[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("hc.a(IIII)Ljb;")
	public static final Pix32 getSprite(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			Pix32 var3 = (Pix32) spriteCache.find(arg2);
			if (var3 != null && var3.ohi != arg1 && var3.ohi != -1) {
				var3.unlink();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		ObjType var4 = list(arg2);
		if (var4.countobj == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.countco[var6] && var4.countco[var6] != 0) {
					var5 = var4.countobj[var6];
				}
			}

			if (var5 != -1) {
				var4 = list(var5);
			}
		}

		Model var7 = var4.getModelLit(1);
		if (var7 == null) {
			return null;
		}

		Pix32 var8 = null;
		if (var4.certtemplate != -1) {
			var8 = getSprite(-1, 10, var4.certlink);
			if (var8 == null) {
				return null;
			}
		}

		Pix32 var9 = new Pix32(32, 32);
		int var10 = Pix3D.originX;
		int var11 = Pix3D.originY;
		int[] var12 = Pix3D.scanline;
		int[] var13 = Pix2D.pixels;
		int var14 = Pix2D.width;
		int var15 = Pix2D.height;
		int var16 = Pix2D.clipMinX;
		int var17 = Pix2D.clipMaxX;
		int var18 = Pix2D.clipMinY;
		int var19 = Pix2D.clipMaxY;
		Pix3D.lowDetail = false;
		Pix2D.setPixels(32, var9.data, 32);
		Pix2D.fillRect(32, 32, 0, 0, 0);
		Pix3D.setRenderClipping();
		int var20 = var4.zoom2d;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = Pix3D.sinTable[var4.xan2d] * var20 >> 16;
		int var22 = Pix3D.cosTable[var4.xan2d] * var20 >> 16;
		var7.objRender(0, var4.yan2d, var4.zan2d, var4.xan2d, var4.xof2d, var7.minY / 2 + var21 + var4.yof2d, var4.yof2d + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.data[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.data[var24 * 32 + var23 - 1] > 1) {
						var9.data[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.data[(var24 - 1) * 32 + var23] > 1) {
						var9.data[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.data[var24 * 32 + var23 + 1] > 1) {
						var9.data[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.data[(var24 + 1) * 32 + var23] > 1) {
						var9.data[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.data[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.data[var26 * 32 + var25 - 1] == 1) {
							var9.data[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.data[(var26 - 1) * 32 + var25] == 1) {
							var9.data[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.data[var26 * 32 + var25 + 1] == 1) {
							var9.data[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.data[(var26 + 1) * 32 + var25] == 1) {
							var9.data[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.data[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.data[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.data[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.certtemplate != -1) {
			int var29 = var8.owi;
			int var30 = var8.ohi;
			var8.owi = 32;
			var8.ohi = 32;
			var8.plotSprite(0, 0);
			var8.owi = var29;
			var8.ohi = var30;
		}

		if (arg0 == 0) {
			spriteCache.put(var9, arg2);
		}

		Pix2D.setPixels(var15, var13, var14);
		Pix2D.setClipping(var17, var16, var19, var18);
		Pix3D.originX = var10;
		Pix3D.originY = var11;
		Pix3D.scanline = var12;
		Pix3D.lowDetail = true;

		if (var4.stackable) {
			var9.owi = 33;
		} else {
			var9.owi = 32;
		}

		var9.ohi = arg1;
		return var9;
	}

	@ObfuscatedName("hc.a(BI)Z")
	public final boolean checkWearModel(int arg0) {
		int var2 = manwear;
		int var3 = manwear2;
		int var4 = manwear3;
		if (arg0 == 1) {
			var2 = womanwear;
			var3 = womanwear2;
			var4 = womanwear3;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!Model.requestDownload(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !Model.requestDownload(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !Model.requestDownload(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("hc.b(II)Lfb;")
	public final Model getWearModelNoCheck(int arg0) {
		int var2 = manwear;
		int var3 = manwear2;
		int var4 = manwear3;
		if (arg0 == 1) {
			var2 = womanwear;
			var3 = womanwear2;
			var4 = womanwear3;
		}

		if (var2 == -1) {
			return null;
		}

		Model var5 = Model.load(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				Model var9 = Model.load(var3);
				Model[] var10 = new Model[] { var5, var9 };
				var5 = new Model(var10, 2);
			} else {
				Model var6 = Model.load(var3);
				Model var7 = Model.load(var4);
				Model[] var8 = new Model[] { var5, var6, var7 };
				var5 = new Model(var8, 3);
			}
		}

		if (arg0 == 0 && manwearOffset != 0) {
			var5.translate(0, 0, manwearOffset);
		}

		if (arg0 == 1 && womanwearOffset != 0) {
			var5.translate(0, 0, womanwearOffset);
		}

		if (recol_s != null) {
			for (int var11 = 0; var11 < recol_s.length; var11++) {
				var5.recolour(recol_s[var11], recol_d[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("hc.a(ZI)Z")
	public final boolean checkHeadModel(int arg0) {
		int var2 = manhead;
		int var3 = manhead2;
		if (arg0 == 1) {
			var2 = womanhead;
			var3 = womanhead2;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!Model.requestDownload(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !Model.requestDownload(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("hc.b(ZI)Lfb;")
	public final Model getHeadModelNoCheck(int arg0) {
		int var2 = manhead;
		int var3 = manhead2;
		if (arg0 == 1) {
			var2 = womanhead;
			var3 = womanhead2;
		}

		if (var2 == -1) {
			return null;
		}

		Model var4 = Model.load(var2);
		if (var3 != -1) {
			Model var5 = Model.load(var3);
			Model[] var6 = new Model[] { var4, var5 };
			var4 = new Model(var6, 2);
		}

		if (recol_s != null) {
			for (int var7 = 0; var7 < recol_s.length; var7++) {
				var4.recolour(recol_s[var7], recol_d[var7]);
			}
		}

		return var4;
	}
}
