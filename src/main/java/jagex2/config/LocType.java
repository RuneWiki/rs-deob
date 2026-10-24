package jagex2.config;

import deob.ObfuscatedName;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Model;
import jagex2.io.Jagfile;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

@ObfuscatedName("ec")
public final class LocType {

	@ObfuscatedName("ec.f")
	public static boolean field809;

	@ObfuscatedName("ec.g")
	public static int field810;

	@ObfuscatedName("ec.h")
	public static int[] field811;

	@ObfuscatedName("ec.i")
	public static Packet field812;

	@ObfuscatedName("ec.j")
	public static LocType[] field813;

	@ObfuscatedName("ec.k")
	public static int field814;

	@ObfuscatedName("ec.l")
	public int field815 = -1;

	@ObfuscatedName("ec.m")
	public int[] field816;

	@ObfuscatedName("ec.n")
	public int[] field817;

	@ObfuscatedName("ec.o")
	public String field818;

	@ObfuscatedName("ec.p")
	public byte[] field819;

	@ObfuscatedName("ec.q")
	public int[] field820;

	@ObfuscatedName("ec.r")
	public int[] field821;

	@ObfuscatedName("ec.s")
	public int field822;

	@ObfuscatedName("ec.t")
	public int field823;

	@ObfuscatedName("ec.u")
	public boolean field824;

	@ObfuscatedName("ec.v")
	public boolean field825;

	@ObfuscatedName("ec.w")
	public boolean field826;

	@ObfuscatedName("ec.x")
	public boolean field827;

	@ObfuscatedName("ec.y")
	public boolean field828;

	@ObfuscatedName("ec.z")
	public boolean field829;

	@ObfuscatedName("ec.S")
	public static LruCache field848 = new LruCache(500);

	@ObfuscatedName("ec.T")
	public static LruCache field849 = new LruCache(30);

	@ObfuscatedName("ec.C")
	public byte field832;

	@ObfuscatedName("ec.D")
	public byte field833;

	@ObfuscatedName("ec.A")
	public int field830;

	@ObfuscatedName("ec.B")
	public int field831;

	@ObfuscatedName("ec.G")
	public int field836;

	@ObfuscatedName("ec.H")
	public int field837;

	@ObfuscatedName("ec.K")
	public int field840;

	@ObfuscatedName("ec.L")
	public int field841;

	@ObfuscatedName("ec.M")
	public int field842;

	@ObfuscatedName("ec.N")
	public int field843;

	@ObfuscatedName("ec.O")
	public int field844;

	@ObfuscatedName("ec.P")
	public int field845;

	@ObfuscatedName("ec.Q")
	public int field846;

	@ObfuscatedName("ec.F")
	public boolean field835;

	@ObfuscatedName("ec.I")
	public boolean field838;

	@ObfuscatedName("ec.J")
	public boolean field839;

	@ObfuscatedName("ec.R")
	public boolean field847;

	@ObfuscatedName("ec.E")
	public String[] field834;

	@ObfuscatedName("ec.a(Lyb;)V")
	public static final void method331(Jagfile arg0) {
		field812 = new Packet(arg0.method308("loc.dat", null));
		Packet var1 = new Packet(arg0.method308("loc.idx", null));
		field810 = var1.method240();
		field811 = new int[field810];
		int var2 = 2;
		for (int var3 = 0; var3 < field810; var3++) {
			field811[var3] = var2;
			var2 += var1.method240();
		}

		field813 = new LocType[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field813[var4] = new LocType();
		}
	}

	@ObfuscatedName("ec.a(B)V")
	public static final void method332() {
		field848 = null;
		field849 = null;
		field811 = null;
		field813 = null;
		field812 = null;
	}

	@ObfuscatedName("ec.a(I)Lec;")
	public static final LocType method333(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field813[var1].field815 == arg0) {
				return field813[var1];
			}
		}

		field814 = (field814 + 1) % 10;
		LocType var2 = field813[field814];
		field812.field621 = field811[arg0];
		var2.field815 = arg0;
		var2.method334();
		var2.method335(field812);
		return var2;
	}

	@ObfuscatedName("ec.a()V")
	public final void method334() {
		field816 = null;
		field817 = null;
		field818 = null;
		field819 = null;
		field820 = null;
		field821 = null;
		field822 = 1;
		field823 = 1;
		field824 = true;
		field825 = true;
		field826 = false;
		field827 = false;
		field828 = false;
		field829 = false;
		field830 = -1;
		field831 = 16;
		field832 = 0;
		field833 = 0;
		field834 = null;
		field835 = false;
		field836 = -1;
		field837 = -1;
		field838 = false;
		field839 = true;
		field840 = 128;
		field841 = 128;
		field842 = 128;
		field846 = 0;
		field843 = 0;
		field844 = 0;
		field845 = 0;
		field847 = false;
	}

	@ObfuscatedName("ec.a(ILmb;)V")
	public final void method335(Packet arg0) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method238();
			if (var3 == 0) {
				if (field817 == null) {
					field817 = new int[0];
				}

				if (var2 == -1) {
					field826 = false;
					if (field817.length > 0 && field817[0] == 10) {
						field826 = true;
					}

					if (field834 != null) {
						field826 = true;
						return;
					}
				}

				return;
			}

			if (var3 == 1) {
				int var4 = arg0.method238();
				field817 = new int[var4];
				field816 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field816[var5] = arg0.method240();
					field817[var5] = arg0.method238();
				}
			} else if (var3 == 2) {
				field818 = arg0.method245();
			} else if (var3 == 3) {
				field819 = arg0.method246();
			} else if (var3 == 14) {
				field822 = arg0.method238();
			} else if (var3 == 15) {
				field823 = arg0.method238();
			} else if (var3 == 17) {
				field824 = false;
			} else if (var3 == 18) {
				field825 = false;
			} else if (var3 == 19) {
				var2 = arg0.method238();
				if (var2 == 1) {
					field826 = true;
				}
			} else if (var3 == 21) {
				field827 = true;
			} else if (var3 == 22) {
				field828 = true;
			} else if (var3 == 23) {
				field829 = true;
			} else if (var3 == 24) {
				field830 = arg0.method240();
				if (field830 == 0xFFFF) {
					field830 = -1;
				}
			} else if (var3 == 25) {
				field835 = true;
			} else if (var3 == 28) {
				field831 = arg0.method238();
			} else if (var3 == 29) {
				field832 = arg0.method239();
			} else if (var3 == 39) {
				field833 = arg0.method239();
			} else if (var3 >= 30 && var3 < 39) {
				if (field834 == null) {
					field834 = new String[5];
				}

				field834[var3 - 30] = arg0.method245();
				if (field834[var3 - 30].equalsIgnoreCase("hidden")) {
					field834[var3 - 30] = null;
				}
			} else if (var3 == 40) {
				int var6 = arg0.method238();
				field820 = new int[var6];
				field821 = new int[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					field820[var7] = arg0.method240();
					field821[var7] = arg0.method240();
				}
			} else if (var3 == 60) {
				field836 = arg0.method240();
			} else if (var3 == 62) {
				field838 = true;
			} else if (var3 == 64) {
				field839 = false;
			} else if (var3 == 65) {
				field840 = arg0.method240();
			} else if (var3 == 66) {
				field841 = arg0.method240();
			} else if (var3 == 67) {
				field842 = arg0.method240();
			} else if (var3 == 68) {
				field837 = arg0.method240();
			} else if (var3 == 69) {
				field846 = arg0.method238();
			} else if (var3 == 70) {
				field843 = arg0.method241();
			} else if (var3 == 71) {
				field844 = arg0.method241();
			} else if (var3 == 72) {
				field845 = arg0.method241();
			} else if (var3 == 73) {
				field847 = true;
			}
		}
	}

	@ObfuscatedName("ec.a(II)Z")
	public final boolean method336(int arg0) {
		int var2 = -1;
		for (int var3 = 0; var3 < field817.length; var3++) {
			if (field817[var3] == arg0) {
				var2 = var3;
				break;
			}
		}

		if (var2 == -1) {
			return true;
		} else if (field816 == null) {
			return true;
		} else {
			int var4 = field816[var2];
			if (var4 == -1) {
				return true;
			}

			return Model.method139(var4 & 0xFFFF);
		}
	}

	@ObfuscatedName("ec.b(I)Z")
	public final boolean method337() {
		boolean var1 = true;

		if (field816 == null) {
			return true;
		}

		for (int var2 = 0; var2 < field816.length; var2++) {
			int var3 = field816[var2];
			if (var3 != -1) {
				var1 &= Model.method139(var3 & 0xFFFF);
			}
		}

		return var1;
	}

	@ObfuscatedName("ec.a(ILvb;)V")
	public final void method338(OnDemand arg0) {
		if (field816 != null) {
			for (int var2 = 0; var2 < field816.length; var2++) {
				int var3 = field816[var2];
				if (var3 != -1) {
					arg0.method293(0, var3 & 0xFFFF);
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIII)Lfb;")
	public final Model method339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = -1;
		for (int var9 = 0; var9 < field817.length; var9++) {
			if (field817[var9] == arg0) {
				var8 = var9;
				break;
			}
		}

		if (var8 == -1) {
			return null;
		}

		long var10 = ((long) (arg6 + 1) << 32) + ((field815 << 6) + (var8 << 3) + arg1);
		if (field809) {
			var10 = 0L;
		}

		Model var12 = (Model) field849.method114(var10);
		if (var12 == null) {
			if (field816 == null || var8 >= field816.length) {
				return null;
			}

			int var20 = field816[var8];
			if (var20 == -1) {
				return null;
			}

			boolean var21 = field838 ^ arg1 > 3;
			if (var21) {
				var20 += 0x10000;
			}

			Model var22 = (Model) field848.method114(var20);
			if (var22 == null) {
				var22 = Model.method138(var20 & 0xFFFF);
				if (var22 == null) {
					return null;
				}

				if (var21) {
					var22.method153();
				}

				field848.method115(var22, var20);
			}

			boolean var23;
			if (field840 == 128 && field841 == 128 && field842 == 128) {
				var23 = false;
			} else {
				var23 = true;
			}

			boolean var24;
			if (field843 == 0 && field844 == 0 && field845 == 0) {
				var24 = false;
			} else {
				var24 = true;
			}

			Model var25 = new Model(var22, field820 == null, arg1 == 0 && arg6 == -1 && !var23 && !var24, !field835);
			if (arg6 != -1) {
				var25.method145();
				var25.method146(arg6);
				var25.field517 = null;
				var25.field516 = null;
			}

			while (arg1-- > 0) {
				var25.method149();
			}

			if (field820 != null) {
				for (int var26 = 0; var26 < field820.length; var26++) {
					var25.method152(field820[var26], field821[var26]);
				}
			}

			if (var23) {
				var25.method154(field841, field842, field840);
			}

			if (var24) {
				var25.method151(field844, field843, field845);
			}

			var25.method155(field832 + 64, field833 * 5 + 768, -50, -10, -50, !field828);

			if (field824) {
				var25.field513 = var25.field365;
			}

			field849.method115(var25, var10);

			if (field827 || field828) {
				var25 = new Model(field828, field827, var25);
			}

			if (field827) {
				int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var28 = 0; var28 < var25.field485; var28++) {
					int var29 = var25.field486[var28];
					int var30 = var25.field488[var28];
					int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
					int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
					int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
					var25.field487[var28] += var33 - var27;
				}

				var25.method143();
			}

			return var25;
		} else if (field809) {
			return var12;
		} else {
			if (field827 || field828) {
				var12 = new Model(field828, field827, var12);
			}

			if (field827) {
				int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var14 = 0; var14 < var12.field485; var14++) {
					int var15 = var12.field486[var14];
					int var16 = var12.field488[var14];
					int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
					int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
					int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
					var12.field487[var14] += var19 - var13;
				}

				var12.method143();
			}

			return var12;
		}
	}
}
