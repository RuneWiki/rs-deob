package jagex2.config;

import deob.ObfuscatedName;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Model;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.graphics.Pix3D;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("DJRMEMXO")
public final class ObjType {

	@ObfuscatedName("DJRMEMXO.d")
	public int type = -1;

	@ObfuscatedName("DJRMEMXO.e")
	public static LruCache iconCache = new LruCache(100);

	@ObfuscatedName("DJRMEMXO.f")
	public static LruCache modelCache = new LruCache(50);

	@ObfuscatedName("DJRMEMXO.C")
	public static boolean membersWorld = true;

	@ObfuscatedName("DJRMEMXO.a")
	public byte womanOffsetY;

	@ObfuscatedName("DJRMEMXO.Z")
	public byte manwearOffsetY;

	@ObfuscatedName("DJRMEMXO.b")
	public int cost;

	@ObfuscatedName("DJRMEMXO.i")
	public int womanwear3;

	@ObfuscatedName("DJRMEMXO.j")
	public int certtemplate;

	@ObfuscatedName("DJRMEMXO.k")
	public int womanwear2;

	@ObfuscatedName("DJRMEMXO.l")
	public int manwear;

	@ObfuscatedName("DJRMEMXO.m")
	public int manhead2;

	@ObfuscatedName("DJRMEMXO.n")
	public int resizex;

	@ObfuscatedName("DJRMEMXO.p")
	public int xof2d;

	@ObfuscatedName("DJRMEMXO.t")
	public int womanhead2;

	@ObfuscatedName("DJRMEMXO.u")
	public int model;

	@ObfuscatedName("DJRMEMXO.v")
	public int manhead;

	@ObfuscatedName("DJRMEMXO.z")
	public int certlink;

	@ObfuscatedName("DJRMEMXO.A")
	public static int cachePos;

	@ObfuscatedName("DJRMEMXO.B")
	public int zoom2d;

	@ObfuscatedName("DJRMEMXO.E")
	public int contrast;

	@ObfuscatedName("DJRMEMXO.F")
	public int manwear3;

	@ObfuscatedName("DJRMEMXO.I")
	public int manwear2;

	@ObfuscatedName("DJRMEMXO.K")
	public int xan2d;

	@ObfuscatedName("DJRMEMXO.L")
	public int resizez;

	@ObfuscatedName("DJRMEMXO.M")
	public int resizey;

	@ObfuscatedName("DJRMEMXO.O")
	public int yof2d;

	@ObfuscatedName("DJRMEMXO.Q")
	public int ambient;

	@ObfuscatedName("DJRMEMXO.R")
	public int womanhead;

	@ObfuscatedName("DJRMEMXO.S")
	public int yan2d;

	@ObfuscatedName("DJRMEMXO.T")
	public int field585;

	@ObfuscatedName("DJRMEMXO.U")
	public int womanwear;

	@ObfuscatedName("DJRMEMXO.W")
	public int team;

	@ObfuscatedName("DJRMEMXO.X")
	public static int count;

	@ObfuscatedName("DJRMEMXO.Y")
	public int zan2d;

	@ObfuscatedName("DJRMEMXO.D")
	public static Packet dat;

	@ObfuscatedName("DJRMEMXO.q")
	public String name;

	@ObfuscatedName("DJRMEMXO.h")
	public boolean members;

	@ObfuscatedName("DJRMEMXO.w")
	public boolean stackable;

	@ObfuscatedName("DJRMEMXO.y")
	public byte[] desc;

	@ObfuscatedName("DJRMEMXO.c")
	public int[] recol_s;

	@ObfuscatedName("DJRMEMXO.g")
	public int[] recol_d;

	@ObfuscatedName("DJRMEMXO.N")
	public int[] countobj;

	@ObfuscatedName("DJRMEMXO.P")
	public static int[] idx;

	@ObfuscatedName("DJRMEMXO.V")
	public int[] countco;

	@ObfuscatedName("DJRMEMXO.s")
	public static ObjType[] cache;

	@ObfuscatedName("DJRMEMXO.o")
	public String[] op;

	@ObfuscatedName("DJRMEMXO.J")
	public String[] iop;

	@ObfuscatedName("DJRMEMXO.a(I)V")
	public static final void unload() {
		modelCache = null;
		iconCache = null;
		idx = null;
		cache = null;
		dat = null;
	}

	@ObfuscatedName("DJRMEMXO.a(II)Z")
	public final boolean validateHeadModel(int arg0) {
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
		if (!Model.validate(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !Model.validate(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("DJRMEMXO.a(LXTGLDHGX;)V")
	public static final void unpack(Jagfile arg0) {
		dat = new Packet(arg0.read("obj.dat", null));
		Packet var1 = new Packet(arg0.read("obj.idx", null));
		count = var1.g2();
		idx = new int[count];
		int var2 = 2;
		for (int var3 = 0; var3 < count; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}

		cache = new ObjType[10];
		for (int var4 = 0; var4 < 10; var4++) {
			cache[var4] = new ObjType();
		}
	}

	@ObfuscatedName("DJRMEMXO.b(II)LZKARKDQW;")
	public final Model getHeadModel(int arg0) {
		int var2 = manhead;
		int var3 = manhead2;
		if (arg0 == 1) {
			var2 = womanhead;
			var3 = womanhead2;
		}

		if (var2 == -1) {
			return null;
		}

		Model var4 = Model.tryGet(var2);
		if (var3 != -1) {
			Model var5 = Model.tryGet(var3);
			Model[] var6 = new Model[] { var4, var5 };
			var4 = new Model(2, var6);
		}

		if (recol_s != null) {
			for (int var7 = 0; var7 < recol_s.length; var7++) {
				var4.recolour(recol_s[var7], recol_d[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("DJRMEMXO.c(II)Z")
	public final boolean validateWornModel(int arg0) {
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
		if (!Model.validate(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !Model.validate(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !Model.validate(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("DJRMEMXO.a(ZI)LZKARKDQW;")
	public final Model getWornModel(int arg0) {
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

		Model var5 = Model.tryGet(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				Model var9 = Model.tryGet(var3);
				Model[] var10 = new Model[] { var5, var9 };
				var5 = new Model(2, var10);
			} else {
				Model var6 = Model.tryGet(var3);
				Model var7 = Model.tryGet(var4);
				Model[] var8 = new Model[] { var5, var6, var7 };
				var5 = new Model(3, var8);
			}
		}

		if (arg0 == 0 && manwearOffsetY != 0) {
			var5.translate(0, manwearOffsetY, 0);
		}

		if (arg0 == 1 && womanOffsetY != 0) {
			var5.translate(0, womanOffsetY, 0);
		}

		if (recol_s != null) {
			for (int var11 = 0; var11 < recol_s.length; var11++) {
				var5.recolour(recol_s[var11], recol_d[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("DJRMEMXO.a()V")
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
		field585 = -1;
		stackable = false;
		cost = 1;
		members = false;
		op = null;
		iop = null;
		manwear = -1;
		manwear2 = -1;
		manwearOffsetY = 0;
		womanwear = -1;
		womanwear2 = -1;
		womanOffsetY = 0;
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
		team = 0;
	}

	@ObfuscatedName("DJRMEMXO.b(I)LDJRMEMXO;")
	public static final ObjType get(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (cache[var1].type == arg0) {
				return cache[var1];
			}
		}

		cachePos = (cachePos + 1) % 10;
		ObjType var2 = cache[cachePos];
		dat.pos = idx[arg0];
		var2.type = arg0;
		var2.reset();
		var2.decodeClient(dat);

		if (var2.certtemplate != -1) {
			var2.toCertificate();
		}

		if (!membersWorld && var2.members) {
			var2.name = "Members Object";
			var2.desc = "Login to a members' server to use this object.".getBytes();
			var2.op = null;
			var2.iop = null;
			var2.team = 0;
		}

		return var2;
	}

	@ObfuscatedName("DJRMEMXO.a(B)V")
	public void toCertificate() {
		ObjType var1 = get(certtemplate);
		model = var1.model;
		zoom2d = var1.zoom2d;
		xan2d = var1.xan2d;
		yan2d = var1.yan2d;
		zan2d = var1.zan2d;
		xof2d = var1.xof2d;
		yof2d = var1.yof2d;
		recol_s = var1.recol_s;
		recol_d = var1.recol_d;
		ObjType var2 = get(certlink);
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

	@ObfuscatedName("DJRMEMXO.a(IIII)LCXGZMTJK;")
	public static final Pix32 getIcon(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			Pix32 var3 = (Pix32) iconCache.get(arg0);
			if (var3 != null && var3.height != arg1 && var3.height != -1) {
				var3.unlink();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		ObjType var4 = get(arg0);
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
				var4 = get(var5);
			}
		}

		Model var7 = var4.getModel(1);
		if (var7 == null) {
			return null;
		}

		Pix32 var8 = null;
		if (var4.certtemplate != -1) {
			var8 = getIcon(var4.certlink, 10, -1);
			if (var8 == null) {
				return null;
			}
		}

		Pix32 var9 = new Pix32(32, 32);
		int var10 = Pix3D.centerX;
		int var11 = Pix3D.centerY;
		int[] var12 = Pix3D.lineOffset;
		int[] var13 = Pix2D.data;
		int var14 = Pix2D.width2d;
		int var15 = Pix2D.height2d;
		int var16 = Pix2D.left;
		int var17 = Pix2D.right;
		int var18 = Pix2D.top;
		int var19 = Pix2D.bottom;
		Pix3D.jagged = false;
		Pix2D.bind(32, 32, var9.pixels);
		Pix2D.fillRect(32, 0, 0, 0, 32);
		Pix3D.init2D();
		int var20 = var4.zoom2d;
		if (arg2 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg2 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = Pix3D.sin[var4.xan2d] * var20 >> 16;
		int var22 = Pix3D.cos[var4.xan2d] * var20 >> 16;
		var7.drawSimple(0, var4.yan2d, var4.zan2d, var4.xan2d, var4.xof2d, var7.minY / 2 + var21 + var4.yof2d, var4.yof2d + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.pixels[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.pixels[var24 * 32 + var23 - 1] > 1) {
						var9.pixels[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.pixels[(var24 - 1) * 32 + var23] > 1) {
						var9.pixels[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.pixels[var24 * 32 + var23 + 1] > 1) {
						var9.pixels[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.pixels[(var24 + 1) * 32 + var23] > 1) {
						var9.pixels[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.pixels[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.pixels[var26 * 32 + var25 - 1] == 1) {
							var9.pixels[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var9.pixels[(var26 - 1) * 32 + var25] == 1) {
							var9.pixels[var26 * 32 + var25] = arg2;
						} else if (var25 < 31 && var9.pixels[var26 * 32 + var25 + 1] == 1) {
							var9.pixels[var26 * 32 + var25] = arg2;
						} else if (var26 < 31 && var9.pixels[(var26 + 1) * 32 + var25] == 1) {
							var9.pixels[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.pixels[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.pixels[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.pixels[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.certtemplate != -1) {
			int var29 = var8.width;
			int var30 = var8.height;
			var8.width = 32;
			var8.height = 32;
			var8.draw(0, 0);
			var8.width = var29;
			var8.height = var30;
		}

		if (arg2 == 0) {
			iconCache.put(var9, arg0);
		}

		Pix2D.bind(var15, var14, var13);
		Pix2D.setBounds(var19, var16, var17, var18);
		Pix3D.centerX = var10;
		Pix3D.centerY = var11;
		Pix3D.lineOffset = var12;
		Pix3D.jagged = true;

		if (var4.stackable) {
			var9.width = 33;
		} else {
			var9.width = 32;
		}

		var9.height = arg1;
		return var9;
	}

	@ObfuscatedName("DJRMEMXO.c(I)LZKARKDQW;")
	public final Model getModel(int arg0) {
		if (countobj != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= countco[var3] && countco[var3] != 0) {
					var2 = countobj[var3];
				}
			}

			if (var2 != -1) {
				return get(var2).getModel(1);
			}
		}

		Model var4 = (Model) modelCache.get(type);
		if (var4 != null) {
			return var4;
		}

		Model var5 = Model.tryGet(model);
		if (var5 == null) {
			return null;
		}

		if (resizex != 128 || resizey != 128 || resizez != 128) {
			var5.scale(resizex, resizez, resizey);
		}

		if (recol_s != null) {
			for (int var6 = 0; var6 < recol_s.length; var6++) {
				var5.recolour(recol_s[var6], recol_d[var6]);
			}
		}

		var5.calculateNormals(ambient + 64, contrast + 768, -50, -10, -50, true);
		var5.picking = true;
		modelCache.put(var5, type);
		return var5;
	}

	@ObfuscatedName("DJRMEMXO.a(IZ)LZKARKDQW;")
	public final Model getInvModel(int arg0) {
		if (countobj != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= countco[var3] && countco[var3] != 0) {
					var2 = countobj[var3];
				}
			}

			if (var2 != -1) {
				return get(var2).getInvModel(1);
			}
		}

		Model var4 = Model.tryGet(model);
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

	@ObfuscatedName("DJRMEMXO.a(ZLMBMGIXGO;)V")
	public final void decodeClient(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				model = arg0.g2();
			} else if (var2 == 2) {
				name = arg0.gjstr();
			} else if (var2 == 3) {
				desc = arg0.gjstrraw();
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
				field585 = arg0.g2();
			} else if (var2 == 11) {
				stackable = true;
			} else if (var2 == 12) {
				cost = arg0.g4();
			} else if (var2 == 16) {
				members = true;
			} else if (var2 == 23) {
				manwear = arg0.g2();
				manwearOffsetY = arg0.g1b();
			} else if (var2 == 24) {
				manwear2 = arg0.g2();
			} else if (var2 == 25) {
				womanwear = arg0.g2();
				womanOffsetY = arg0.g1b();
			} else if (var2 == 26) {
				womanwear2 = arg0.g2();
			} else if (var2 >= 30 && var2 < 35) {
				if (op == null) {
					op = new String[5];
				}

				op[var2 - 30] = arg0.gjstr();
				if (op[var2 - 30].equalsIgnoreCase("hidden")) {
					op[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (iop == null) {
					iop = new String[5];
				}

				iop[var2 - 35] = arg0.gjstr();
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
			} else if (var2 == 115) {
				team = arg0.g1();
			}
		}
	}
}
