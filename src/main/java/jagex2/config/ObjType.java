package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.graphics.Pix3D;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("GSCQQEUA")
public final class ObjType {

	@ObfuscatedName("GSCQQEUA.L")
	public int field742 = -1;

	@ObfuscatedName("GSCQQEUA.l")
	public static LruCache field720 = new LruCache(50);

	@ObfuscatedName("GSCQQEUA.s")
	public static boolean field727 = true;

	@ObfuscatedName("GSCQQEUA.u")
	public static LruCache field729 = new LruCache(100);

	@ObfuscatedName("GSCQQEUA.e")
	public byte field713;

	@ObfuscatedName("GSCQQEUA.ab")
	public byte field756;

	@ObfuscatedName("GSCQQEUA.a")
	public int field709;

	@ObfuscatedName("GSCQQEUA.b")
	public int field710;

	@ObfuscatedName("GSCQQEUA.f")
	public int field714;

	@ObfuscatedName("GSCQQEUA.g")
	public int field715;

	@ObfuscatedName("GSCQQEUA.h")
	public int field716;

	@ObfuscatedName("GSCQQEUA.i")
	public int field717;

	@ObfuscatedName("GSCQQEUA.j")
	public static int field718;

	@ObfuscatedName("GSCQQEUA.n")
	public int field722;

	@ObfuscatedName("GSCQQEUA.o")
	public int field723;

	@ObfuscatedName("GSCQQEUA.r")
	public int field726;

	@ObfuscatedName("GSCQQEUA.t")
	public int field728;

	@ObfuscatedName("GSCQQEUA.A")
	public static int field731;

	@ObfuscatedName("GSCQQEUA.B")
	public int field732;

	@ObfuscatedName("GSCQQEUA.C")
	public int field733;

	@ObfuscatedName("GSCQQEUA.D")
	public int field734;

	@ObfuscatedName("GSCQQEUA.E")
	public int field735;

	@ObfuscatedName("GSCQQEUA.F")
	public int field736;

	@ObfuscatedName("GSCQQEUA.G")
	public int field737;

	@ObfuscatedName("GSCQQEUA.H")
	public int field738;

	@ObfuscatedName("GSCQQEUA.I")
	public int field739;

	@ObfuscatedName("GSCQQEUA.J")
	public int field740;

	@ObfuscatedName("GSCQQEUA.K")
	public int field741;

	@ObfuscatedName("GSCQQEUA.O")
	public int field745;

	@ObfuscatedName("GSCQQEUA.P")
	public int field746;

	@ObfuscatedName("GSCQQEUA.Q")
	public int field747;

	@ObfuscatedName("GSCQQEUA.R")
	public int field748;

	@ObfuscatedName("GSCQQEUA.S")
	public int field749;

	@ObfuscatedName("GSCQQEUA.U")
	public int field751;

	@ObfuscatedName("GSCQQEUA.X")
	public int field753;

	@ObfuscatedName("GSCQQEUA.V")
	public static Packet field752;

	@ObfuscatedName("GSCQQEUA.d")
	public String field712;

	@ObfuscatedName("GSCQQEUA.T")
	public boolean field750;

	@ObfuscatedName("GSCQQEUA.Z")
	public boolean field755;

	@ObfuscatedName("GSCQQEUA.c")
	public byte[] field711;

	@ObfuscatedName("GSCQQEUA.p")
	public int[] field724;

	@ObfuscatedName("GSCQQEUA.q")
	public static int[] field725;

	@ObfuscatedName("GSCQQEUA.M")
	public int[] field743;

	@ObfuscatedName("GSCQQEUA.N")
	public int[] field744;

	@ObfuscatedName("GSCQQEUA.Y")
	public int[] field754;

	@ObfuscatedName("GSCQQEUA.k")
	public static ObjType[] field719;

	@ObfuscatedName("GSCQQEUA.m")
	public String[] field721;

	@ObfuscatedName("GSCQQEUA.w")
	public String[] field730;

	@ObfuscatedName("GSCQQEUA.a(II)Z")
	public final boolean method220(int arg0) {
		int var2 = field717;
		int var3 = field740;
		if (arg0 == 1) {
			var2 = field753;
			var3 = field741;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!Model.method360(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !Model.method360(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("GSCQQEUA.a(I)LGSCQQEUA;")
	public static final ObjType method221(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field719[var1].field742 == arg0) {
				return field719[var1];
			}
		}

		field731 = (field731 + 1) % 10;
		ObjType var2 = field719[field731];
		field752.pos = field725[arg0];
		var2.field742 = arg0;
		var2.method232();
		var2.method227(field752);

		if (var2.field726 != -1) {
			var2.method224();
		}

		if (!field727 && var2.field755) {
			var2.field712 = "Members Object";
			var2.field711 = "Login to a members' server to use this object.".getBytes();
			var2.field721 = null;
			var2.field730 = null;
			var2.field715 = 0;
		}

		return var2;
	}

	@ObfuscatedName("GSCQQEUA.a(BI)LLZYQDKJV;")
	public final Model method222(int arg0) {
		int var2 = field732;
		int var3 = field714;
		int var4 = field749;
		if (arg0 == 1) {
			var2 = field709;
			var3 = field734;
			var4 = field746;
		}

		if (var2 == -1) {
			return null;
		}

		Model var5 = Model.method359(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				Model var9 = Model.method359(var3);
				Model[] var10 = new Model[] { var5, var9 };
				var5 = new Model(2, var10);
			} else {
				Model var6 = Model.method359(var3);
				Model var7 = Model.method359(var4);
				Model[] var8 = new Model[] { var5, var6, var7 };
				var5 = new Model(3, var8);
			}
		}

		if (arg0 == 0 && field756 != 0) {
			var5.method372(0, 0, field756);
		}

		if (arg0 == 1 && field713 != 0) {
			var5.method372(0, 0, field713);
		}

		if (field743 != null) {
			for (int var11 = 0; var11 < field743.length; var11++) {
				var5.method373(field743[var11], field724[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("GSCQQEUA.a(LATJMVOZR;)V")
	public static final void method223(Jagfile arg0) {
		field752 = new Packet(arg0.method2("obj.dat", null));
		Packet var1 = new Packet(arg0.method2("obj.idx", null));
		field718 = var1.g2();
		field725 = new int[field718];
		int var2 = 2;
		for (int var3 = 0; var3 < field718; var3++) {
			field725[var3] = var2;
			var2 += var1.g2();
		}

		field719 = new ObjType[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field719[var4] = new ObjType();
		}
	}

	@ObfuscatedName("GSCQQEUA.b(I)V")
	public void method224() {
		ObjType var1 = method221(field726);
		field739 = var1.field739;
		field748 = var1.field748;
		field738 = var1.field738;
		field735 = var1.field735;
		field722 = var1.field722;
		field710 = var1.field710;
		field723 = var1.field723;
		field743 = var1.field743;
		field724 = var1.field724;
		ObjType var2 = method221(field716);
		field712 = var2.field712;
		field755 = var2.field755;
		field728 = var2.field728;
		String var3 = "a";
		char var4 = var2.field712.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field711 = ("Swap this note at any bank for " + var3 + " " + var2.field712 + ".").getBytes();
		field750 = true;
	}

	@ObfuscatedName("GSCQQEUA.b(II)Z")
	public final boolean method225(int arg0) {
		int var2 = field732;
		int var3 = field714;
		int var4 = field749;
		if (arg0 == 1) {
			var2 = field709;
			var3 = field734;
			var4 = field746;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!Model.method360(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !Model.method360(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !Model.method360(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("GSCQQEUA.c(II)LLZYQDKJV;")
	public final Model method226(int arg0) {
		if (field744 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field754[var3] && field754[var3] != 0) {
					var2 = field744[var3];
				}
			}

			if (var2 != -1) {
				return method221(var2).method226(1);
			}
		}

		Model var4 = Model.method359(field739);
		if (var4 == null) {
			return null;
		}

		if (field743 != null) {
			for (int var5 = 0; var5 < field743.length; var5++) {
				var4.method373(field743[var5], field724[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("GSCQQEUA.a(BLMFMVIYHT;)V")
	public final void method227(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field739 = arg0.g2();
			} else if (var2 == 2) {
				field712 = arg0.gjstr();
			} else if (var2 == 3) {
				field711 = arg0.gjstrraw();
			} else if (var2 == 4) {
				field748 = arg0.g2();
			} else if (var2 == 5) {
				field738 = arg0.g2();
			} else if (var2 == 6) {
				field735 = arg0.g2();
			} else if (var2 == 7) {
				field710 = arg0.g2();
				if (field710 > 32767) {
					field710 -= 0x10000;
				}
			} else if (var2 == 8) {
				field723 = arg0.g2();
				if (field723 > 32767) {
					field723 -= 0x10000;
				}
			} else if (var2 == 10) {
				field751 = arg0.g2();
			} else if (var2 == 11) {
				field750 = true;
			} else if (var2 == 12) {
				field728 = arg0.g4();
			} else if (var2 == 16) {
				field755 = true;
			} else if (var2 == 23) {
				field732 = arg0.g2();
				field756 = arg0.g1b();
			} else if (var2 == 24) {
				field714 = arg0.g2();
			} else if (var2 == 25) {
				field709 = arg0.g2();
				field713 = arg0.g1b();
			} else if (var2 == 26) {
				field734 = arg0.g2();
			} else if (var2 >= 30 && var2 < 35) {
				if (field721 == null) {
					field721 = new String[5];
				}

				field721[var2 - 30] = arg0.gjstr();
				if (field721[var2 - 30].equalsIgnoreCase("hidden")) {
					field721[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field730 == null) {
					field730 = new String[5];
				}

				field730[var2 - 35] = arg0.gjstr();
			} else if (var2 == 40) {
				int var3 = arg0.g1();
				field743 = new int[var3];
				field724 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field743[var4] = arg0.g2();
					field724[var4] = arg0.g2();
				}
			} else if (var2 == 78) {
				field749 = arg0.g2();
			} else if (var2 == 79) {
				field746 = arg0.g2();
			} else if (var2 == 90) {
				field717 = arg0.g2();
			} else if (var2 == 91) {
				field753 = arg0.g2();
			} else if (var2 == 92) {
				field740 = arg0.g2();
			} else if (var2 == 93) {
				field741 = arg0.g2();
			} else if (var2 == 95) {
				field722 = arg0.g2();
			} else if (var2 == 97) {
				field716 = arg0.g2();
			} else if (var2 == 98) {
				field726 = arg0.g2();
			} else if (var2 >= 100 && var2 < 110) {
				if (field744 == null) {
					field744 = new int[10];
					field754 = new int[10];
				}

				field744[var2 - 100] = arg0.g2();
				field754[var2 - 100] = arg0.g2();
			} else if (var2 == 110) {
				field745 = arg0.g2();
			} else if (var2 == 111) {
				field736 = arg0.g2();
			} else if (var2 == 112) {
				field747 = arg0.g2();
			} else if (var2 == 113) {
				field733 = arg0.g1b();
			} else if (var2 == 114) {
				field737 = arg0.g1b() * 5;
			} else if (var2 == 115) {
				field715 = arg0.g1();
			}
		}
	}

	@ObfuscatedName("GSCQQEUA.a(ZI)LLZYQDKJV;")
	public final Model method228(int arg0) {
		int var2 = field717;
		int var3 = field740;
		if (arg0 == 1) {
			var2 = field753;
			var3 = field741;
		}

		if (var2 == -1) {
			return null;
		}

		Model var4 = Model.method359(var2);
		if (var3 != -1) {
			Model var5 = Model.method359(var3);
			Model[] var6 = new Model[] { var4, var5 };
			var4 = new Model(2, var6);
		}

		if (field743 != null) {
			for (int var7 = 0; var7 < field743.length; var7++) {
				var4.method373(field743[var7], field724[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("GSCQQEUA.c(I)LLZYQDKJV;")
	public final Model method229(int arg0) {
		if (field744 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field754[var3] && field754[var3] != 0) {
					var2 = field744[var3];
				}
			}

			if (var2 != -1) {
				return method221(var2).method229(1);
			}
		}

		Model var4 = (Model) field720.method458(field742);
		if (var4 != null) {
			return var4;
		}

		Model var5 = Model.method359(field739);
		if (var5 == null) {
			return null;
		}

		if (field745 != 128 || field736 != 128 || field747 != 128) {
			var5.method375(field736, field747, field745);
		}

		if (field743 != null) {
			for (int var6 = 0; var6 < field743.length; var6++) {
				var5.method373(field743[var6], field724[var6]);
			}
		}

		var5.method376(field733 + 64, field737 + 768, -50, -10, -50, true);
		var5.field1070 = true;
		field720.method459(var5, field742);
		return var5;
	}

	@ObfuscatedName("GSCQQEUA.a(BIII)LEPQDEJTO;")
	public static final Pix32 method230(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			Pix32 var3 = (Pix32) field729.method458(arg2);
			if (var3 != null && var3.field605 != arg1 && var3.field605 != -1) {
				var3.method604();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		ObjType var4 = method221(arg2);
		if (var4.field744 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field754[var6] && var4.field754[var6] != 0) {
					var5 = var4.field744[var6];
				}
			}

			if (var5 != -1) {
				var4 = method221(var5);
			}
		}

		Model var7 = var4.method229(1);
		if (var7 == null) {
			return null;
		}

		Pix32 var8 = null;
		if (var4.field726 != -1) {
			var8 = method230(-1, 10, var4.field716);
			if (var8 == null) {
				return null;
			}
		}

		Pix32 var9 = new Pix32(32, 32);
		int var10 = Pix3D.field1361;
		int var11 = Pix3D.field1362;
		int[] var12 = Pix3D.field1367;
		int[] var13 = Pix2D.field949;
		int var14 = Pix2D.field950;
		int var15 = Pix2D.field951;
		int var16 = Pix2D.field954;
		int var17 = Pix2D.field955;
		int var18 = Pix2D.field952;
		int var19 = Pix2D.field953;
		Pix3D.field1359 = false;
		Pix2D.method332(32, 32, var9.field599);
		Pix2D.method337(32, 0, 0, 32, 0);
		Pix3D.method545();
		int var20 = var4.field748;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = Pix3D.field1365[var4.field738] * var20 >> 16;
		int var22 = Pix3D.field1366[var4.field738] * var20 >> 16;
		var7.method380(0, var4.field735, var4.field722, var4.field738, var4.field710, var7.field1461 / 2 + var21 + var4.field723, var4.field723 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field599[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field599[var24 * 32 + var23 - 1] > 1) {
						var9.field599[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field599[(var24 - 1) * 32 + var23] > 1) {
						var9.field599[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field599[var24 * 32 + var23 + 1] > 1) {
						var9.field599[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field599[(var24 + 1) * 32 + var23] > 1) {
						var9.field599[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field599[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field599[var26 * 32 + var25 - 1] == 1) {
							var9.field599[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field599[(var26 - 1) * 32 + var25] == 1) {
							var9.field599[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field599[var26 * 32 + var25 + 1] == 1) {
							var9.field599[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field599[(var26 + 1) * 32 + var25] == 1) {
							var9.field599[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field599[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field599[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field599[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field726 != -1) {
			int var29 = var8.field604;
			int var30 = var8.field605;
			var8.field604 = 32;
			var8.field605 = 32;
			var8.method195(0, 0);
			var8.field604 = var29;
			var8.field605 = var30;
		}

		if (arg0 == 0) {
			field729.method459(var9, arg2);
		}

		Pix2D.method332(var14, var15, var13);
		Pix2D.method334(var18, var16, var19, var17);
		Pix3D.field1361 = var10;
		Pix3D.field1362 = var11;
		Pix3D.field1367 = var12;
		Pix3D.field1359 = true;

		if (var4.field750) {
			var9.field604 = 33;
		} else {
			var9.field604 = 32;
		}

		var9.field605 = arg1;
		return var9;
	}

	@ObfuscatedName("GSCQQEUA.a(Z)V")
	public static final void method231() {
		field720 = null;
		field729 = null;
		field725 = null;
		field719 = null;
		field752 = null;
	}

	@ObfuscatedName("GSCQQEUA.a()V")
	public final void method232() {
		field739 = 0;
		field712 = null;
		field711 = null;
		field743 = null;
		field724 = null;
		field748 = 2000;
		field738 = 0;
		field735 = 0;
		field722 = 0;
		field710 = 0;
		field723 = 0;
		field751 = -1;
		field750 = false;
		field728 = 1;
		field755 = false;
		field721 = null;
		field730 = null;
		field732 = -1;
		field714 = -1;
		field756 = 0;
		field709 = -1;
		field734 = -1;
		field713 = 0;
		field749 = -1;
		field746 = -1;
		field717 = -1;
		field740 = -1;
		field753 = -1;
		field741 = -1;
		field744 = null;
		field754 = null;
		field716 = -1;
		field726 = -1;
		field745 = 128;
		field736 = 128;
		field747 = 128;
		field733 = 0;
		field737 = 0;
		field715 = 0;
	}
}
