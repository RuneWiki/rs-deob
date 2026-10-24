package deob;

@ObfuscatedName("ec")
public final class class57 {

	@ObfuscatedName("ec.e")
	public static boolean field797;

	@ObfuscatedName("ec.f")
	public static int field798;

	@ObfuscatedName("ec.g")
	public static int[] field799;

	@ObfuscatedName("ec.h")
	public static class39 field800;

	@ObfuscatedName("ec.i")
	public static class57[] field801;

	@ObfuscatedName("ec.j")
	public static int field802;

	@ObfuscatedName("ec.k")
	public int field803 = -1;

	@ObfuscatedName("ec.l")
	public int[] field804;

	@ObfuscatedName("ec.m")
	public int[] field805;

	@ObfuscatedName("ec.n")
	public String field806;

	@ObfuscatedName("ec.o")
	public byte[] field807;

	@ObfuscatedName("ec.p")
	public int[] field808;

	@ObfuscatedName("ec.q")
	public int[] field809;

	@ObfuscatedName("ec.r")
	public int field810;

	@ObfuscatedName("ec.s")
	public int field811;

	@ObfuscatedName("ec.t")
	public boolean field812;

	@ObfuscatedName("ec.u")
	public boolean field813;

	@ObfuscatedName("ec.v")
	public boolean field814;

	@ObfuscatedName("ec.w")
	public boolean field815;

	@ObfuscatedName("ec.x")
	public boolean field816;

	@ObfuscatedName("ec.y")
	public boolean field817;

	@ObfuscatedName("ec.z")
	public int field818;

	@ObfuscatedName("ec.R")
	public static class20 field836 = new class20(500);

	@ObfuscatedName("ec.S")
	public static class20 field837 = new class20(30);

	@ObfuscatedName("ec.B")
	public byte field820;

	@ObfuscatedName("ec.C")
	public byte field821;

	@ObfuscatedName("ec.A")
	public int field819;

	@ObfuscatedName("ec.F")
	public int field824;

	@ObfuscatedName("ec.G")
	public int field825;

	@ObfuscatedName("ec.J")
	public int field828;

	@ObfuscatedName("ec.K")
	public int field829;

	@ObfuscatedName("ec.L")
	public int field830;

	@ObfuscatedName("ec.M")
	public int field831;

	@ObfuscatedName("ec.N")
	public int field832;

	@ObfuscatedName("ec.O")
	public int field833;

	@ObfuscatedName("ec.P")
	public int field834;

	@ObfuscatedName("ec.E")
	public boolean field823;

	@ObfuscatedName("ec.H")
	public boolean field826;

	@ObfuscatedName("ec.I")
	public boolean field827;

	@ObfuscatedName("ec.Q")
	public boolean field835;

	@ObfuscatedName("ec.D")
	public String[] field822;

	@ObfuscatedName("ec.a(Lyb;)V")
	public static final void method322(class51 arg0) {
		field800 = new class39(arg0.method299("loc.dat", null));
		class39 var1 = new class39(arg0.method299("loc.idx", null));
		field798 = var1.method233();
		field799 = new int[field798];
		int var2 = 2;
		for (int var3 = 0; var3 < field798; var3++) {
			field799[var3] = var2;
			var2 += var1.method233();
		}

		field801 = new class57[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field801[var4] = new class57();
		}
	}

	@ObfuscatedName("ec.a(B)V")
	public static final void method323() {
		field836 = null;
		field837 = null;
		field799 = null;
		field801 = null;
		field800 = null;
	}

	@ObfuscatedName("ec.a(I)Lec;")
	public static final class57 method324(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field801[var1].field803 == arg0) {
				return field801[var1];
			}
		}

		field802 = (field802 + 1) % 10;
		class57 var2 = field801[field802];
		field800.field611 = field799[arg0];
		var2.field803 = arg0;
		var2.method325();
		var2.method326(field800);
		return var2;
	}

	@ObfuscatedName("ec.a()V")
	public final void method325() {
		field804 = null;
		field805 = null;
		field806 = null;
		field807 = null;
		field808 = null;
		field809 = null;
		field810 = 1;
		field811 = 1;
		field812 = true;
		field813 = true;
		field814 = false;
		field815 = false;
		field816 = false;
		field817 = false;
		field818 = -1;
		field819 = 16;
		field820 = 0;
		field821 = 0;
		field822 = null;
		field823 = false;
		field824 = -1;
		field825 = -1;
		field826 = false;
		field827 = true;
		field828 = 128;
		field829 = 128;
		field830 = 128;
		field834 = 0;
		field831 = 0;
		field832 = 0;
		field833 = 0;
		field835 = false;
	}

	@ObfuscatedName("ec.a(ILmb;)V")
	public final void method326(class39 arg0) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method231();
			if (var3 == 0) {
				if (field805 == null) {
					field805 = new int[0];
				}

				if (var2 == -1) {
					field814 = false;
					if (field805.length > 0 && field805[0] == 10) {
						field814 = true;
					}

					if (field822 != null) {
						field814 = true;
						return;
					}
				}

				return;
			}

			if (var3 == 1) {
				int var4 = arg0.method231();
				field805 = new int[var4];
				field804 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field804[var5] = arg0.method233();
					field805[var5] = arg0.method231();
				}
			} else if (var3 == 2) {
				field806 = arg0.method238();
			} else if (var3 == 3) {
				field807 = arg0.method239();
			} else if (var3 == 14) {
				field810 = arg0.method231();
			} else if (var3 == 15) {
				field811 = arg0.method231();
			} else if (var3 == 17) {
				field812 = false;
			} else if (var3 == 18) {
				field813 = false;
			} else if (var3 == 19) {
				var2 = arg0.method231();
				if (var2 == 1) {
					field814 = true;
				}
			} else if (var3 == 21) {
				field815 = true;
			} else if (var3 == 22) {
				field816 = true;
			} else if (var3 == 23) {
				field817 = true;
			} else if (var3 == 24) {
				field818 = arg0.method233();
				if (field818 == 0xFFFF) {
					field818 = -1;
				}
			} else if (var3 == 25) {
				field823 = true;
			} else if (var3 == 28) {
				field819 = arg0.method231();
			} else if (var3 == 29) {
				field820 = arg0.method232();
			} else if (var3 == 39) {
				field821 = arg0.method232();
			} else if (var3 >= 30 && var3 < 39) {
				if (field822 == null) {
					field822 = new String[5];
				}

				field822[var3 - 30] = arg0.method238();
				if (field822[var3 - 30].equalsIgnoreCase("hidden")) {
					field822[var3 - 30] = null;
				}
			} else if (var3 == 40) {
				int var6 = arg0.method231();
				field808 = new int[var6];
				field809 = new int[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					field808[var7] = arg0.method233();
					field809[var7] = arg0.method233();
				}
			} else if (var3 == 60) {
				field824 = arg0.method233();
			} else if (var3 == 62) {
				field826 = true;
			} else if (var3 == 64) {
				field827 = false;
			} else if (var3 == 65) {
				field828 = arg0.method233();
			} else if (var3 == 66) {
				field829 = arg0.method233();
			} else if (var3 == 67) {
				field830 = arg0.method233();
			} else if (var3 == 68) {
				field825 = arg0.method233();
			} else if (var3 == 69) {
				field834 = arg0.method231();
			} else if (var3 == 70) {
				field831 = arg0.method234();
			} else if (var3 == 71) {
				field832 = arg0.method234();
			} else if (var3 == 72) {
				field833 = arg0.method234();
			} else if (var3 == 73) {
				field835 = true;
			}
		}
	}

	@ObfuscatedName("ec.a(IB)Z")
	public final boolean method327(int arg0) {
		int var2 = -1;
		for (int var3 = 0; var3 < field805.length; var3++) {
			if (field805[var3] == arg0) {
				var2 = var3;
				break;
			}
		}

		if (var2 == -1) {
			return true;
		} else if (field804 == null) {
			return true;
		} else {
			int var4 = field804[var2];
			if (var4 == -1) {
				return true;
			}

			return class32.method136(var4 & 0xFFFF);
		}
	}

	@ObfuscatedName("ec.a(Z)Z")
	public final boolean method328() {
		boolean var1 = true;

		if (field804 == null) {
			return true;
		}

		for (int var2 = 0; var2 < field804.length; var2++) {
			int var3 = field804[var2];
			if (var3 != -1) {
				var1 &= class32.method136(var3 & 0xFFFF);
			}
		}

		return var1;
	}

	@ObfuscatedName("ec.a(ZLvb;)V")
	public final void method329(class48 arg0) {
		if (field804 != null) {
			for (int var2 = 0; var2 < field804.length; var2++) {
				int var3 = field804[var2];
				if (var3 != -1) {
					arg0.method284(0, var3 & 0xFFFF);
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIII)Lfb;")
	public final class32 method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = -1;
		for (int var9 = 0; var9 < field805.length; var9++) {
			if (field805[var9] == arg0) {
				var8 = var9;
				break;
			}
		}

		if (var8 == -1) {
			return null;
		}

		long var10 = ((long) (arg6 + 1) << 32) + ((field803 << 6) + (var8 << 3) + arg1);
		if (field797) {
			var10 = 0L;
		}

		class32 var12 = (class32) field837.method113(var10);
		if (var12 == null) {
			if (field804 == null || var8 >= field804.length) {
				return null;
			}

			int var20 = field804[var8];
			if (var20 == -1) {
				return null;
			}

			boolean var21 = field826 ^ arg1 > 3;
			if (var21) {
				var20 += 0x10000;
			}

			class32 var22 = (class32) field836.method113(var20);
			if (var22 == null) {
				var22 = class32.method135(var20 & 0xFFFF);
				if (var22 == null) {
					return null;
				}

				if (var21) {
					var22.method150();
				}

				field836.method114(var22, var20);
			}

			boolean var23;
			if (field828 == 128 && field829 == 128 && field830 == 128) {
				var23 = false;
			} else {
				var23 = true;
			}

			boolean var24;
			if (field831 == 0 && field832 == 0 && field833 == 0) {
				var24 = false;
			} else {
				var24 = true;
			}

			class32 var25 = new class32(field808 == null, arg1 == 0 && arg6 == -1 && !var23 && !var24, var22, !field823);
			if (arg6 != -1) {
				var25.method142();
				var25.method143(arg6);
				var25.field508 = null;
				var25.field507 = null;
			}

			while (arg1-- > 0) {
				var25.method146();
			}

			if (field808 != null) {
				for (int var26 = 0; var26 < field808.length; var26++) {
					var25.method149(field808[var26], field809[var26]);
				}
			}

			if (var23) {
				var25.method151(field829, field828, field830);
			}

			if (var24) {
				var25.method148(field832, field831, field833);
			}

			var25.method152(field820 + 64, field821 * 5 + 768, -50, -10, -50, !field816);

			if (field812) {
				var25.field504 = var25.field358;
			}

			field837.method114(var25, var10);

			if (field815 || field816) {
				var25 = new class32(var25, field815, field816);
			}

			if (field815) {
				int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var28 = 0; var28 < var25.field476; var28++) {
					int var29 = var25.field477[var28];
					int var30 = var25.field479[var28];
					int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
					int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
					int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
					var25.field478[var28] += var33 - var27;
				}

				var25.method140();
			}

			return var25;
		} else if (field797) {
			return var12;
		} else {
			if (field815 || field816) {
				var12 = new class32(var12, field815, field816);
			}

			if (field815) {
				int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var14 = 0; var14 < var12.field476; var14++) {
					int var15 = var12.field477[var14];
					int var16 = var12.field479[var14];
					int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
					int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
					int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
					var12.field478[var14] += var19 - var13;
				}

				var12.method140();
			}

			return var12;
		}
	}
}
