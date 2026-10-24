package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.dash3d.Pix3D;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("cc")
public final class ObjType {

	@ObfuscatedName("cc.e")
	public static int numDefinitions;

	@ObfuscatedName("cc.f")
	public static int[] idx;

	@ObfuscatedName("cc.g")
	public static Packet dat;

	@ObfuscatedName("cc.h")
	public static ObjType[] recent;

	@ObfuscatedName("cc.i")
	public static int recentPos;

	@ObfuscatedName("cc.j")
	public static boolean memServer = true;

	@ObfuscatedName("cc.k")
	public int id = -1;

	@ObfuscatedName("cc.l")
	public int model;

	@ObfuscatedName("cc.m")
	public String name;

	@ObfuscatedName("cc.n")
	public byte[] desc;

	@ObfuscatedName("cc.o")
	public int[] recol_s;

	@ObfuscatedName("cc.p")
	public int[] recol_d;

	@ObfuscatedName("cc.q")
	public int zoom2d;

	@ObfuscatedName("cc.r")
	public int xan2d;

	@ObfuscatedName("cc.s")
	public int yan2d;

	@ObfuscatedName("cc.t")
	public int zan2d;

	@ObfuscatedName("cc.u")
	public int xof2d;

	@ObfuscatedName("cc.v")
	public int yof2d;

	@ObfuscatedName("cc.x")
	public int field783;

	@ObfuscatedName("cc.y")
	public boolean stackable;

	@ObfuscatedName("cc.z")
	public int cost;

	@ObfuscatedName("cc.T")
	public static LruCache modelcache = new LruCache(50);

	@ObfuscatedName("cc.U")
	public static LruCache spriteCache = new LruCache(200);

	@ObfuscatedName("cc.F")
	public byte manwearOffset;

	@ObfuscatedName("cc.I")
	public byte womanwearOffset;

	@ObfuscatedName("cc.D")
	public int manwear;

	@ObfuscatedName("cc.E")
	public int manwear2;

	@ObfuscatedName("cc.G")
	public int womanwear;

	@ObfuscatedName("cc.H")
	public int womanwear2;

	@ObfuscatedName("cc.J")
	public int manwear3;

	@ObfuscatedName("cc.K")
	public int womanwear3;

	@ObfuscatedName("cc.L")
	public int manhead;

	@ObfuscatedName("cc.M")
	public int manhead2;

	@ObfuscatedName("cc.N")
	public int womanhead;

	@ObfuscatedName("cc.O")
	public int womanhead2;

	@ObfuscatedName("cc.R")
	public int certlink;

	@ObfuscatedName("cc.S")
	public int certtemplate;

	@ObfuscatedName("cc.A")
	public boolean members;

	@ObfuscatedName("cc.P")
	public int[] countobj;

	@ObfuscatedName("cc.Q")
	public int[] countco;

	@ObfuscatedName("cc.B")
	public String[] op;

	@ObfuscatedName("cc.C")
	public String[] iop;

	@ObfuscatedName("cc.a(Lub;)V")
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

	@ObfuscatedName("cc.a(Z)V")
	public static final void unload() {
		modelcache = null;
		spriteCache = null;
		idx = null;
		recent = null;
		dat = null;
	}

	@ObfuscatedName("cc.a(I)Lcc;")
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

	@ObfuscatedName("cc.a()V")
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
		field783 = -1;
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
	}

	@ObfuscatedName("cc.a(ZLkb;)V")
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
			} else if (var2 != 9) {
				if (var2 == 10) {
					field783 = arg0.g2();
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
				}
			}
		}
	}

	@ObfuscatedName("cc.b(I)V")
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

	@ObfuscatedName("cc.c(I)Leb;")
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

		Model var5 = new Model(model);
		if (recol_s != null) {
			for (int var6 = 0; var6 < recol_s.length; var6++) {
				var5.recolour(recol_s[var6], recol_d[var6]);
			}
		}

		var5.calculateNormals(64, 768, -50, -10, -50, true);
		var5.useAABBMouseCheck = true;
		modelcache.put(id, var5);
		return var5;
	}

	@ObfuscatedName("cc.a(III)Lhb;")
	public static final Pix32 getSprite(int arg0, int arg1) {
		Pix32 var2 = (Pix32) spriteCache.find(arg0);
		if (var2 != null && var2.ohi != arg1 && var2.ohi != -1) {
			var2.unlink();
			var2 = null;
		}

		if (var2 != null) {
			return var2;
		}

		ObjType var3 = list(arg0);
		if (var3.countobj == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var4 = -1;
			for (int var5 = 0; var5 < 10; var5++) {
				if (arg1 >= var3.countco[var5] && var3.countco[var5] != 0) {
					var4 = var3.countobj[var5];
				}
			}

			if (var4 != -1) {
				var3 = list(var4);
			}
		}

		Pix32 var6 = new Pix32(32, 32);
		int var7 = Pix3D.originX;
		int var8 = Pix3D.originY;
		int[] var9 = Pix3D.scanline;
		int[] var10 = Pix2D.pixels;
		int var11 = Pix2D.width;
		int var12 = Pix2D.height;
		int var13 = Pix2D.clipMinX;
		int var14 = Pix2D.clipMaxX;
		int var15 = Pix2D.clipMinY;
		int var16 = Pix2D.clipMaxY;
		Pix3D.lowDetail = false;
		Pix2D.setPixels(32, var6.data, 32);
		Pix2D.fillRect(0, 0, 0, 32, 32);
		Pix3D.setRenderClipping();
		Model var17 = var3.getModelLit(1);
		int var18 = Pix3D.sinTable[var3.xan2d] * var3.zoom2d >> 16;
		int var19 = Pix3D.cosTable[var3.xan2d] * var3.zoom2d >> 16;
		var17.objRender(0, var3.yan2d, var3.zan2d, var3.xan2d, var3.xof2d, var17.minY / 2 + var18 + var3.yof2d, var3.yof2d + var19);

		for (int var20 = 31; var20 >= 0; var20--) {
			for (int var21 = 31; var21 >= 0; var21--) {
				if (var6.data[var21 * 32 + var20] == 0) {
					if (var20 > 0 && var6.data[var21 * 32 + var20 - 1] > 1) {
						var6.data[var21 * 32 + var20] = 1;
					} else if (var21 > 0 && var6.data[(var21 - 1) * 32 + var20] > 1) {
						var6.data[var21 * 32 + var20] = 1;
					} else if (var20 < 31 && var6.data[var21 * 32 + var20 + 1] > 1) {
						var6.data[var21 * 32 + var20] = 1;
					} else if (var21 < 31 && var6.data[(var21 + 1) * 32 + var20] > 1) {
						var6.data[var21 * 32 + var20] = 1;
					}
				}
			}
		}

		for (int var22 = 31; var22 >= 0; var22--) {
			for (int var23 = 31; var23 >= 0; var23--) {
				if (var6.data[var23 * 32 + var22] == 0 && var22 > 0 && var23 > 0 && var6.data[(var23 - 1) * 32 + var22 - 1] > 0) {
					var6.data[var23 * 32 + var22] = 0x302020;
				}
			}
		}

		if (var3.certtemplate != -1) {
			Pix32 var24 = getSprite(var3.certlink, 10);
			int var25 = var24.owi;
			int var26 = var24.ohi;
			var24.owi = 32;
			var24.ohi = 32;
			var24.scalePlotSprite(22, 5, 22, 5);
			var24.owi = var25;
			var24.ohi = var26;
		}

		spriteCache.put(arg0, var6);
		Pix2D.setPixels(var11, var10, var12);
		Pix2D.setClipping(var16, var15, var14, var13);
		Pix3D.originX = var7;
		Pix3D.originY = var8;
		Pix3D.scanline = var9;
		Pix3D.lowDetail = true;

		if (var3.stackable) {
			var6.owi = 33;
		} else {
			var6.owi = 32;
		}

		var6.ohi = arg1;
		return var6;
	}

	@ObfuscatedName("cc.a(BI)Leb;")
	public final Model getWearModelNoCheck(int arg0) {
		int var2 = manwear;
		if (arg0 == 1) {
			var2 = womanwear;
		}

		if (var2 == -1) {
			return null;
		}

		int var3 = manwear2;
		int var4 = manwear3;
		if (arg0 == 1) {
			var3 = womanwear2;
			var4 = womanwear3;
		}

		Model var5 = new Model(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				Model var9 = new Model(var3);
				Model[] var10 = new Model[] { var5, var9 };
				var5 = new Model(var10, 2);
			} else {
				Model var6 = new Model(var3);
				Model var7 = new Model(var4);
				Model[] var8 = new Model[] { var5, var6, var7 };
				var5 = new Model(var8, 3);
			}
		}

		if (arg0 == 0 && manwearOffset != 0) {
			var5.translate(manwearOffset, 0, 0);
		}

		if (arg0 == 1 && womanwearOffset != 0) {
			var5.translate(womanwearOffset, 0, 0);
		}

		if (recol_s != null) {
			for (int var11 = 0; var11 < recol_s.length; var11++) {
				var5.recolour(recol_s[var11], recol_d[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("cc.a(II)Leb;")
	public final Model getHeadModelNoCheck(int arg0) {
		int var2 = manhead;
		if (arg0 == 1) {
			var2 = womanhead;
		}

		if (var2 == -1) {
			return null;
		}

		int var3 = manhead2;
		if (arg0 == 1) {
			var3 = womanhead2;
		}

		Model var4 = new Model(var2);
		if (var3 != -1) {
			Model var5 = new Model(var3);
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
