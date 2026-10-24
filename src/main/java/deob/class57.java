package deob;

@ObfuscatedName("ec")
public final class class57 {

	@ObfuscatedName("ec.e")
	public static boolean field811;

	@ObfuscatedName("ec.f")
	public static int field812;

	@ObfuscatedName("ec.g")
	public static int[] field813;

	@ObfuscatedName("ec.h")
	public static class39 field814;

	@ObfuscatedName("ec.i")
	public static class57[] field815;

	@ObfuscatedName("ec.j")
	public static int field816;

	@ObfuscatedName("ec.k")
	public int field817 = -1;

	@ObfuscatedName("ec.l")
	public int[] field818;

	@ObfuscatedName("ec.m")
	public int[] field819;

	@ObfuscatedName("ec.n")
	public String field820;

	@ObfuscatedName("ec.o")
	public byte[] field821;

	@ObfuscatedName("ec.p")
	public int[] field822;

	@ObfuscatedName("ec.q")
	public int[] field823;

	@ObfuscatedName("ec.r")
	public int field824;

	@ObfuscatedName("ec.s")
	public int field825;

	@ObfuscatedName("ec.t")
	public boolean field826;

	@ObfuscatedName("ec.u")
	public boolean field827;

	@ObfuscatedName("ec.v")
	public boolean field828;

	@ObfuscatedName("ec.w")
	public boolean field829;

	@ObfuscatedName("ec.x")
	public boolean field830;

	@ObfuscatedName("ec.y")
	public boolean field831;

	@ObfuscatedName("ec.z")
	public int field832;

	@ObfuscatedName("ec.S")
	public static class20 field851 = new class20(500);

	@ObfuscatedName("ec.T")
	public static class20 field852 = new class20(30);

	@ObfuscatedName("ec.B")
	public byte field834;

	@ObfuscatedName("ec.C")
	public byte field835;

	@ObfuscatedName("ec.A")
	public int field833;

	@ObfuscatedName("ec.F")
	public int field838;

	@ObfuscatedName("ec.G")
	public int field839;

	@ObfuscatedName("ec.J")
	public int field842;

	@ObfuscatedName("ec.K")
	public int field843;

	@ObfuscatedName("ec.L")
	public int field844;

	@ObfuscatedName("ec.M")
	public int field845;

	@ObfuscatedName("ec.N")
	public int field846;

	@ObfuscatedName("ec.O")
	public int field847;

	@ObfuscatedName("ec.P")
	public int field848;

	@ObfuscatedName("ec.E")
	public boolean field837;

	@ObfuscatedName("ec.H")
	public boolean field840;

	@ObfuscatedName("ec.I")
	public boolean field841;

	@ObfuscatedName("ec.Q")
	public boolean field849;

	@ObfuscatedName("ec.R")
	public boolean field850;

	@ObfuscatedName("ec.D")
	public String[] field836;

	@ObfuscatedName("ec.a(Lyb;)V")
	public static final void method331(class51 arg0) {
		field814 = new class39(arg0.method308("loc.dat", null));
		class39 var1 = new class39(arg0.method308("loc.idx", null));
		field812 = var1.method240();
		field813 = new int[field812];
		int var2 = 2;
		for (int var3 = 0; var3 < field812; var3++) {
			field813[var3] = var2;
			var2 += var1.method240();
		}

		field815 = new class57[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field815[var4] = new class57();
		}
	}

	@ObfuscatedName("ec.a(B)V")
	public static final void method332() {
		field851 = null;
		field852 = null;
		field813 = null;
		field815 = null;
		field814 = null;
	}

	@ObfuscatedName("ec.a(I)Lec;")
	public static final class57 method333(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field815[var1].field817 == arg0) {
				return field815[var1];
			}
		}

		field816 = (field816 + 1) % 10;
		class57 var2 = field815[field816];
		field814.field623 = field813[arg0];
		var2.field817 = arg0;
		var2.method334();
		var2.method335(field814);
		return var2;
	}

	@ObfuscatedName("ec.a()V")
	public final void method334() {
		field818 = null;
		field819 = null;
		field820 = null;
		field821 = null;
		field822 = null;
		field823 = null;
		field824 = 1;
		field825 = 1;
		field826 = true;
		field827 = true;
		field828 = false;
		field829 = false;
		field830 = false;
		field831 = false;
		field832 = -1;
		field833 = 16;
		field834 = 0;
		field835 = 0;
		field836 = null;
		field837 = false;
		field838 = -1;
		field839 = -1;
		field840 = false;
		field841 = true;
		field842 = 128;
		field843 = 128;
		field844 = 128;
		field848 = 0;
		field845 = 0;
		field846 = 0;
		field847 = 0;
		field849 = false;
		field850 = false;
	}

	@ObfuscatedName("ec.a(ZLmb;)V")
	public final void method335(class39 arg0) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method238();
			if (var3 == 0) {
				if (field819 == null) {
					field819 = new int[0];
				}

				if (var2 == -1) {
					field828 = false;
					if (field819.length > 0 && field819[0] == 10) {
						field828 = true;
					}

					if (field836 != null) {
						field828 = true;
					}
				}

				if (field850) {
					field826 = false;
					field827 = false;
					return;
				}

				return;
			}

			if (var3 == 1) {
				int var4 = arg0.method238();
				field819 = new int[var4];
				field818 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field818[var5] = arg0.method240();
					field819[var5] = arg0.method238();
				}
			} else if (var3 == 2) {
				field820 = arg0.method245();
			} else if (var3 == 3) {
				field821 = arg0.method246();
			} else if (var3 == 14) {
				field824 = arg0.method238();
			} else if (var3 == 15) {
				field825 = arg0.method238();
			} else if (var3 == 17) {
				field826 = false;
			} else if (var3 == 18) {
				field827 = false;
			} else if (var3 == 19) {
				var2 = arg0.method238();
				if (var2 == 1) {
					field828 = true;
				}
			} else if (var3 == 21) {
				field829 = true;
			} else if (var3 == 22) {
				field830 = true;
			} else if (var3 == 23) {
				field831 = true;
			} else if (var3 == 24) {
				field832 = arg0.method240();
				if (field832 == 0xFFFF) {
					field832 = -1;
				}
			} else if (var3 == 25) {
				field837 = true;
			} else if (var3 == 28) {
				field833 = arg0.method238();
			} else if (var3 == 29) {
				field834 = arg0.method239();
			} else if (var3 == 39) {
				field835 = arg0.method239();
			} else if (var3 >= 30 && var3 < 39) {
				if (field836 == null) {
					field836 = new String[5];
				}

				field836[var3 - 30] = arg0.method245();
				if (field836[var3 - 30].equalsIgnoreCase("hidden")) {
					field836[var3 - 30] = null;
				}
			} else if (var3 == 40) {
				int var6 = arg0.method238();
				field822 = new int[var6];
				field823 = new int[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					field822[var7] = arg0.method240();
					field823[var7] = arg0.method240();
				}
			} else if (var3 == 60) {
				field838 = arg0.method240();
			} else if (var3 == 62) {
				field840 = true;
			} else if (var3 == 64) {
				field841 = false;
			} else if (var3 == 65) {
				field842 = arg0.method240();
			} else if (var3 == 66) {
				field843 = arg0.method240();
			} else if (var3 == 67) {
				field844 = arg0.method240();
			} else if (var3 == 68) {
				field839 = arg0.method240();
			} else if (var3 == 69) {
				field848 = arg0.method238();
			} else if (var3 == 70) {
				field845 = arg0.method241();
			} else if (var3 == 71) {
				field846 = arg0.method241();
			} else if (var3 == 72) {
				field847 = arg0.method241();
			} else if (var3 == 73) {
				field849 = true;
			} else if (var3 == 74) {
				field850 = true;
			}
		}
	}

	@ObfuscatedName("ec.a(IB)Z")
	public final boolean method336(int arg0) {
		int var2 = -1;
		for (int var3 = 0; var3 < field819.length; var3++) {
			if (field819[var3] == arg0) {
				var2 = var3;
				break;
			}
		}

		if (var2 == -1) {
			return true;
		} else if (field818 == null) {
			return true;
		} else {
			int var4 = field818[var2];
			if (var4 == -1) {
				return true;
			}

			return class32.method139(var4 & 0xFFFF);
		}
	}

	@ObfuscatedName("ec.b(B)Z")
	public final boolean method337() {
		boolean var1 = true;

		if (field818 == null) {
			return true;
		}

		for (int var2 = 0; var2 < field818.length; var2++) {
			int var3 = field818[var2];
			if (var3 != -1) {
				var1 &= class32.method139(var3 & 0xFFFF);
			}
		}

		return var1;
	}

	@ObfuscatedName("ec.a(Lvb;I)V")
	public final void method338(class48 arg0) {
		if (field818 != null) {
			for (int var2 = 0; var2 < field818.length; var2++) {
				int var3 = field818[var2];
				if (var3 != -1) {
					arg0.method293(var3 & 0xFFFF, 0);
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIII)Lfb;")
	public final class32 method339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = -1;
		for (int var9 = 0; var9 < field819.length; var9++) {
			if (field819[var9] == arg0) {
				var8 = var9;
				break;
			}
		}

		if (var8 == -1) {
			return null;
		}

		long var10 = ((long) (arg6 + 1) << 32) + ((field817 << 6) + (var8 << 3) + arg1);
		if (field811) {
			var10 = 0L;
		}

		class32 var12 = (class32) field852.method114(var10);
		if (var12 == null) {
			if (field818 == null || var8 >= field818.length) {
				return null;
			}

			int var20 = field818[var8];
			if (var20 == -1) {
				return null;
			}

			boolean var21 = field840 ^ arg1 > 3;
			if (var21) {
				var20 += 0x10000;
			}

			class32 var22 = (class32) field851.method114(var20);
			if (var22 == null) {
				var22 = class32.method138(var20 & 0xFFFF);
				if (var22 == null) {
					return null;
				}

				if (var21) {
					var22.method153();
				}

				field851.method115(var22, var20);
			}

			boolean var23;
			if (field842 == 128 && field843 == 128 && field844 == 128) {
				var23 = false;
			} else {
				var23 = true;
			}

			boolean var24;
			if (field845 == 0 && field846 == 0 && field847 == 0) {
				var24 = false;
			} else {
				var24 = true;
			}

			class32 var25 = new class32(field822 == null, var22, arg1 == 0 && arg6 == -1 && !var23 && !var24, !field837);
			if (arg6 != -1) {
				var25.method145();
				var25.method146(arg6);
				var25.field519 = null;
				var25.field518 = null;
			}

			while (arg1-- > 0) {
				var25.method149();
			}

			if (field822 != null) {
				for (int var26 = 0; var26 < field822.length; var26++) {
					var25.method152(field822[var26], field823[var26]);
				}
			}

			if (var23) {
				var25.method154(field842, field844, field843);
			}

			if (var24) {
				var25.method151(field845, field847, field846);
			}

			var25.method155(field834 + 64, field835 * 5 + 768, -50, -10, -50, !field830);

			if (field826) {
				var25.field515 = var25.field367;
			}

			field852.method115(var25, var10);

			if (field829 || field830) {
				var25 = new class32(field829, field830, var25);
			}

			if (field829) {
				int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var28 = 0; var28 < var25.field487; var28++) {
					int var29 = var25.field488[var28];
					int var30 = var25.field490[var28];
					int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
					int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
					int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
					var25.field489[var28] += var33 - var27;
				}

				var25.method143();
			}

			return var25;
		} else if (field811) {
			return var12;
		} else {
			if (field829 || field830) {
				var12 = new class32(field829, field830, var12);
			}

			if (field829) {
				int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var14 = 0; var14 < var12.field487; var14++) {
					int var15 = var12.field488[var14];
					int var16 = var12.field490[var14];
					int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
					int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
					int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
					var12.field489[var14] += var19 - var13;
				}

				var12.method143();
			}

			return var12;
		}
	}
}
