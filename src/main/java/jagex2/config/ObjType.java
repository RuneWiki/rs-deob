package jagex2.config;

import deob.ObfuscatedName;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Model;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.graphics.Pix3D;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

public class ObjType {

	@ObfuscatedName("DJRMEMXO.d")
	public int type = -1;

	@ObfuscatedName("DJRMEMXO.r")
	public int _flowObfuscator1 = 9;

	@ObfuscatedName("DJRMEMXO.x")
	public int _flowObfuscator2 = 9;

	@ObfuscatedName("DJRMEMXO.G")
	public boolean _flowObfuscator3 = false;

	@ObfuscatedName("DJRMEMXO.ab")
	public boolean _flowObfuscator5 = false;

	@ObfuscatedName("DJRMEMXO.e")
	public static LruCache iconCache = new LruCache(false, 100);

	@ObfuscatedName("DJRMEMXO.f")
	public static LruCache modelCache = new LruCache(false, 50);

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
	public int field669;

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

	@ObfuscatedName("DJRMEMXO.H")
	public static boolean _flowObfuscator4;

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
	public static final void unload(int arg0) {
		modelCache = null;
		iconCache = null;
		idx = null;
		if (arg0 >= 0) {
			_flowObfuscator4 = !_flowObfuscator4;
		}
		cache = null;
		dat = null;
	}

	@ObfuscatedName("DJRMEMXO.a(II)Z")
	public final boolean validateHeadModel(int arg0, int arg1) {
		if (arg0 != -2836) {
			this._flowObfuscator3 = !this._flowObfuscator3;
		}
		int var3 = this.manhead;
		int var4 = this.manhead2;
		if (arg1 == 1) {
			var3 = this.womanhead;
			var4 = this.womanhead2;
		}
		if (var3 == -1) {
			return true;
		}
		boolean var5 = true;
		if (!Model.validate(var3)) {
			var5 = false;
		}
		if (var4 != -1 && !Model.validate(var4)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("DJRMEMXO.a(LXTGLDHGX;)V")
	public static final void unpack(Jagfile arg0) {
		dat = new Packet(arg0.read("obj.dat", null), 891);
		Packet var1 = new Packet(arg0.read("obj.idx", null), 891);
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
	public final Model getHeadModel(int arg0, int arg1) {
		while (arg0 >= 0) {
			this._flowObfuscator3 = !this._flowObfuscator3;
		}
		int var3 = this.manhead;
		int var4 = this.manhead2;
		if (arg1 == 1) {
			var3 = this.womanhead;
			var4 = this.womanhead2;
		}
		if (var3 == -1) {
			return null;
		}
		Model var5 = Model.tryGet(this._flowObfuscator1, var3);
		if (var4 != -1) {
			Model var6 = Model.tryGet(this._flowObfuscator1, var4);
			Model[] var7 = new Model[] { var5, var6 };
			var5 = new Model(2, var7, -38);
		}
		if (this.recol_s != null) {
			for (int var8 = 0; var8 < this.recol_s.length; var8++) {
				var5.recolour(this.recol_s[var8], this.recol_d[var8]);
			}
		}
		return var5;
	}

	@ObfuscatedName("DJRMEMXO.c(II)Z")
	public final boolean validateWornModel(int arg0, int arg1) {
		if (arg0 != 40903) {
			this._flowObfuscator5 = !this._flowObfuscator5;
		}
		int var3 = this.manwear;
		int var4 = this.manwear2;
		int var5 = this.manwear3;
		if (arg1 == 1) {
			var3 = this.womanwear;
			var4 = this.womanwear2;
			var5 = this.womanwear3;
		}
		if (var3 == -1) {
			return true;
		}
		boolean var6 = true;
		if (!Model.validate(var3)) {
			var6 = false;
		}
		if (var4 != -1 && !Model.validate(var4)) {
			var6 = false;
		}
		if (var5 != -1 && !Model.validate(var5)) {
			var6 = false;
		}
		return var6;
	}

	@ObfuscatedName("DJRMEMXO.a(ZI)LZKARKDQW;")
	public final Model getWornModel(boolean arg0, int arg1) {
		if (arg0) {
			throw new NullPointerException();
		}
		int var3 = this.manwear;
		int var4 = this.manwear2;
		int var5 = this.manwear3;
		if (arg1 == 1) {
			var3 = this.womanwear;
			var4 = this.womanwear2;
			var5 = this.womanwear3;
		}
		if (var3 == -1) {
			return null;
		}
		Model var6 = Model.tryGet(this._flowObfuscator1, var3);
		if (var4 != -1) {
			if (var5 == -1) {
				Model var10 = Model.tryGet(this._flowObfuscator1, var4);
				Model[] var11 = new Model[] { var6, var10 };
				var6 = new Model(2, var11, -38);
			} else {
				Model var7 = Model.tryGet(this._flowObfuscator1, var4);
				Model var8 = Model.tryGet(this._flowObfuscator1, var5);
				Model[] var9 = new Model[] { var6, var7, var8 };
				var6 = new Model(3, var9, -38);
			}
		}
		if (arg1 == 0 && this.manwearOffsetY != 0) {
			var6.translate(0, this.manwearOffsetY, 16384, 0);
		}
		if (arg1 == 1 && this.womanOffsetY != 0) {
			var6.translate(0, this.womanOffsetY, 16384, 0);
		}
		if (this.recol_s != null) {
			for (int var12 = 0; var12 < this.recol_s.length; var12++) {
				var6.recolour(this.recol_s[var12], this.recol_d[var12]);
			}
		}
		return var6;
	}

	@ObfuscatedName("DJRMEMXO.a()V")
	public final void reset() {
		this.model = 0;
		this.name = null;
		this.desc = null;
		this.recol_s = null;
		this.recol_d = null;
		this.zoom2d = 2000;
		this.xan2d = 0;
		this.yan2d = 0;
		this.zan2d = 0;
		this.xof2d = 0;
		this.yof2d = 0;
		this.field669 = -1;
		this.stackable = false;
		this.cost = 1;
		this.members = false;
		this.op = null;
		this.iop = null;
		this.manwear = -1;
		this.manwear2 = -1;
		this.manwearOffsetY = 0;
		this.womanwear = -1;
		this.womanwear2 = -1;
		this.womanOffsetY = 0;
		this.manwear3 = -1;
		this.womanwear3 = -1;
		this.manhead = -1;
		this.manhead2 = -1;
		this.womanhead = -1;
		this.womanhead2 = -1;
		this.countobj = null;
		this.countco = null;
		this.certlink = -1;
		this.certtemplate = -1;
		this.resizex = 128;
		this.resizey = 128;
		this.resizez = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
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
		var2.decodeClient(true, dat);
		if (var2.certtemplate != -1) {
			var2.toCertificate((byte) 61);
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
	public void toCertificate(byte arg0) {
		ObjType var2 = get(this.certtemplate);
		this.model = var2.model;
		this.zoom2d = var2.zoom2d;
		this.xan2d = var2.xan2d;
		this.yan2d = var2.yan2d;
		this.zan2d = var2.zan2d;
		this.xof2d = var2.xof2d;
		this.yof2d = var2.yof2d;
		if (arg0 != 61) {
			this._flowObfuscator3 = !this._flowObfuscator3;
		}
		this.recol_s = var2.recol_s;
		this.recol_d = var2.recol_d;
		ObjType var3 = get(this.certlink);
		this.name = var3.name;
		this.members = var3.members;
		this.cost = var3.cost;
		String var4 = "a";
		char var5 = var3.name.charAt(0);
		if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
			var4 = "an";
		}
		this.desc = ("Swap this note at any bank for " + var4 + " " + var3.name + ".").getBytes();
		this.stackable = true;
	}

	@ObfuscatedName("DJRMEMXO.a(IIII)LCXGZMTJK;")
	public static final Pix32 getIcon(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 == 0) {
			Pix32 var4 = (Pix32) iconCache.get((long) arg0);
			if (var4 != null && var4.height != arg1 && var4.height != -1) {
				var4.unlink();
				var4 = null;
			}
			if (var4 != null) {
				return var4;
			}
		}
		ObjType var5 = get(arg0);
		if (var5.countobj == null) {
			arg1 = -1;
		}
		if (arg1 > 1) {
			int var6 = -1;
			for (int var7 = 0; var7 < 10; var7++) {
				if (arg1 >= var5.countco[var7] && var5.countco[var7] != 0) {
					var6 = var5.countobj[var7];
				}
			}
			if (var6 != -1) {
				var5 = get(var6);
			}
		}
		Model var8 = var5.getModel(1);
		if (var8 == null) {
			return null;
		}
		Pix32 var9 = null;
		if (var5.certtemplate != -1) {
			var9 = getIcon(var5.certlink, 10, -1, 9);
			if (var9 == null) {
				return null;
			}
		}
		Pix32 var10 = new Pix32(32, 32);
		int var11 = Pix3D.centerX;
		int var12 = Pix3D.centerY;
		int[] var13 = Pix3D.lineOffset;
		int[] var14 = Pix2D.data;
		int var15 = Pix2D.width2d;
		int var16 = Pix2D.height2d;
		int var17 = Pix2D.left;
		int var18 = Pix2D.right;
		int var19 = Pix2D.top;
		int var20 = Pix2D.bottom;
		Pix3D.jagged = false;
		Pix2D.bind(32, 32, -293, var10.pixels);
		Pix2D.fillRect(32, 0, 0, 0, 32, 0);
		Pix3D.init2D((byte) 6);
		int var21 = var5.zoom2d;
		if (arg2 == -1) {
			var21 = (int) ((double) var21 * 1.5D);
		}
		if (arg2 > 0) {
			var21 = (int) ((double) var21 * 1.04D);
		}
		int var22 = Pix3D.sin[var5.xan2d] * var21 >> 16;
		int var23 = Pix3D.cos[var5.xan2d] * var21 >> 16;
		var8.drawSimple(0, var5.yan2d, var5.zan2d, var5.xan2d, var5.xof2d, var8.minY / 2 + var22 + var5.yof2d, var5.yof2d + var23);
		for (int var24 = 31; var24 >= 0; var24--) {
			for (int var32 = 31; var32 >= 0; var32--) {
				if (var10.pixels[var32 * 32 + var24] == 0) {
					if (var24 > 0 && var10.pixels[var32 * 32 + (var24 - 1)] > 1) {
						var10.pixels[var32 * 32 + var24] = 1;
					} else if (var32 > 0 && var10.pixels[(var32 - 1) * 32 + var24] > 1) {
						var10.pixels[var32 * 32 + var24] = 1;
					} else if (var24 < 31 && var10.pixels[var32 * 32 + var24 + 1] > 1) {
						var10.pixels[var32 * 32 + var24] = 1;
					} else if (var32 < 31 && var10.pixels[(var32 + 1) * 32 + var24] > 1) {
						var10.pixels[var32 * 32 + var24] = 1;
					}
				}
			}
		}
		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var10.pixels[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var10.pixels[var26 * 32 + (var25 - 1)] == 1) {
							var10.pixels[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var10.pixels[(var26 - 1) * 32 + var25] == 1) {
							var10.pixels[var26 * 32 + var25] = arg2;
						} else if (var25 < 31 && var10.pixels[var26 * 32 + var25 + 1] == 1) {
							var10.pixels[var26 * 32 + var25] = arg2;
						} else if (var26 < 31 && var10.pixels[(var26 + 1) * 32 + var25] == 1) {
							var10.pixels[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var10.pixels[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var10.pixels[(var28 - 1) * 32 + (var27 - 1)] > 0) {
						var10.pixels[var28 * 32 + var27] = 3153952;
					}
				}
			}
		}
		if (var5.certtemplate != -1) {
			int var29 = var9.width;
			int var30 = var9.height;
			var9.width = 32;
			var9.height = 32;
			var9.draw(0, 16083, 0);
			var9.width = var29;
			var9.height = var30;
		}
		if (arg2 == 0) {
			iconCache.put(var10, (long) arg0, (byte) 2);
		}
		Pix2D.bind(var16, var15, -293, var14);
		Pix2D.setBounds(var20, var17, false, var18, var19);
		Pix3D.centerX = var11;
		Pix3D.centerY = var12;
		Pix3D.lineOffset = var13;
		Pix3D.jagged = true;
		if (arg3 < 9 || arg3 > 9) {
			for (int var31 = 1; var31 > 0; var31++) {
			}
		}
		if (var5.stackable) {
			var10.width = 33;
		} else {
			var10.width = 32;
		}
		var10.height = arg1;
		return var10;
	}

	@ObfuscatedName("DJRMEMXO.c(I)LZKARKDQW;")
	public final Model getModel(int arg0) {
		if (this.countobj != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}
			if (var2 != -1) {
				return get(var2).getModel(1);
			}
		}
		Model var4 = (Model) modelCache.get((long) this.type);
		if (var4 != null) {
			return var4;
		}
		Model var5 = Model.tryGet(this._flowObfuscator1, this.model);
		if (var5 == null) {
			return null;
		}
		if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
			var5.scale(this.resizex, this.resizez, this._flowObfuscator2, this.resizey);
		}
		if (this.recol_s != null) {
			for (int var6 = 0; var6 < this.recol_s.length; var6++) {
				var5.recolour(this.recol_s[var6], this.recol_d[var6]);
			}
		}
		var5.calculateNormals(this.ambient + 64, this.contrast + 768, -50, -10, -50, true);
		var5.picking = true;
		modelCache.put(var5, (long) this.type, (byte) 2);
		return var5;
	}

	@ObfuscatedName("DJRMEMXO.a(IZ)LZKARKDQW;")
	public final Model getInvModel(int arg0, boolean arg1) {
		if (this.countobj != null && arg0 > 1) {
			int var3 = -1;
			for (int var4 = 0; var4 < 10; var4++) {
				if (arg0 >= this.countco[var4] && this.countco[var4] != 0) {
					var3 = this.countobj[var4];
				}
			}
			if (var3 != -1) {
				return get(var3).getInvModel(1, true);
			}
		}
		Model var5 = Model.tryGet(this._flowObfuscator1, this.model);
		if (!arg1) {
			throw new NullPointerException();
		} else if (var5 == null) {
			return null;
		} else {
			if (this.recol_s != null) {
				for (int var6 = 0; var6 < this.recol_s.length; var6++) {
					var5.recolour(this.recol_s[var6], this.recol_d[var6]);
				}
			}
			return var5;
		}
	}

	@ObfuscatedName("DJRMEMXO.a(ZLMBMGIXGO;)V")
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
					this.model = arg1.g2();
				} else if (var3 == 2) {
					this.name = arg1.gjstr();
				} else if (var3 == 3) {
					this.desc = arg1.gjstrraw((byte) 30);
				} else if (var3 == 4) {
					this.zoom2d = arg1.g2();
				} else if (var3 == 5) {
					this.xan2d = arg1.g2();
				} else if (var3 == 6) {
					this.yan2d = arg1.g2();
				} else if (var3 == 7) {
					this.xof2d = arg1.g2();
					if (this.xof2d > 32767) {
						this.xof2d -= 65536;
					}
				} else if (var3 == 8) {
					this.yof2d = arg1.g2();
					if (this.yof2d > 32767) {
						this.yof2d -= 65536;
					}
				} else if (var3 == 10) {
					this.field669 = arg1.g2();
				} else if (var3 == 11) {
					this.stackable = true;
				} else if (var3 == 12) {
					this.cost = arg1.g4();
				} else if (var3 == 16) {
					this.members = true;
				} else if (var3 == 23) {
					this.manwear = arg1.g2();
					this.manwearOffsetY = arg1.g1b();
				} else if (var3 == 24) {
					this.manwear2 = arg1.g2();
				} else if (var3 == 25) {
					this.womanwear = arg1.g2();
					this.womanOffsetY = arg1.g1b();
				} else if (var3 == 26) {
					this.womanwear2 = arg1.g2();
				} else if (var3 >= 30 && var3 < 35) {
					if (this.op == null) {
						this.op = new String[5];
					}
					this.op[var3 - 30] = arg1.gjstr();
					if (this.op[var3 - 30].equalsIgnoreCase("hidden")) {
						this.op[var3 - 30] = null;
					}
				} else if (var3 >= 35 && var3 < 40) {
					if (this.iop == null) {
						this.iop = new String[5];
					}
					this.iop[var3 - 35] = arg1.gjstr();
				} else if (var3 == 40) {
					int var4 = arg1.g1();
					this.recol_s = new int[var4];
					this.recol_d = new int[var4];
					for (int var5 = 0; var5 < var4; var5++) {
						this.recol_s[var5] = arg1.g2();
						this.recol_d[var5] = arg1.g2();
					}
				} else if (var3 == 78) {
					this.manwear3 = arg1.g2();
				} else if (var3 == 79) {
					this.womanwear3 = arg1.g2();
				} else if (var3 == 90) {
					this.manhead = arg1.g2();
				} else if (var3 == 91) {
					this.womanhead = arg1.g2();
				} else if (var3 == 92) {
					this.manhead2 = arg1.g2();
				} else if (var3 == 93) {
					this.womanhead2 = arg1.g2();
				} else if (var3 == 95) {
					this.zan2d = arg1.g2();
				} else if (var3 == 97) {
					this.certlink = arg1.g2();
				} else if (var3 == 98) {
					this.certtemplate = arg1.g2();
				} else if (var3 >= 100 && var3 < 110) {
					if (this.countobj == null) {
						this.countobj = new int[10];
						this.countco = new int[10];
					}
					this.countobj[var3 - 100] = arg1.g2();
					this.countco[var3 - 100] = arg1.g2();
				} else if (var3 == 110) {
					this.resizex = arg1.g2();
				} else if (var3 == 111) {
					this.resizey = arg1.g2();
				} else if (var3 == 112) {
					this.resizez = arg1.g2();
				} else if (var3 == 113) {
					this.ambient = arg1.g1b();
				} else if (var3 == 114) {
					this.contrast = arg1.g1b() * 5;
				} else if (var3 == 115) {
					this.team = arg1.g1();
				}
			}
		}
	}
}
