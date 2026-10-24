package deob;

@ObfuscatedName("ec")
public final class class57 {

	@ObfuscatedName("ec.c")
	public static boolean field794;

	@ObfuscatedName("ec.d")
	public static int field795;

	@ObfuscatedName("ec.e")
	public static int[] field796;

	@ObfuscatedName("ec.f")
	public static class39 field797;

	@ObfuscatedName("ec.g")
	public static class57[] field798;

	@ObfuscatedName("ec.h")
	public static int field799;

	@ObfuscatedName("ec.i")
	public int field800 = -1;

	@ObfuscatedName("ec.j")
	public int[] field801;

	@ObfuscatedName("ec.k")
	public int[] field802;

	@ObfuscatedName("ec.l")
	public String field803;

	@ObfuscatedName("ec.m")
	public byte[] field804;

	@ObfuscatedName("ec.n")
	public int[] field805;

	@ObfuscatedName("ec.o")
	public int[] field806;

	@ObfuscatedName("ec.p")
	public int field807;

	@ObfuscatedName("ec.q")
	public int field808;

	@ObfuscatedName("ec.r")
	public boolean field809;

	@ObfuscatedName("ec.s")
	public boolean field810;

	@ObfuscatedName("ec.t")
	public boolean field811;

	@ObfuscatedName("ec.u")
	public boolean field812;

	@ObfuscatedName("ec.v")
	public boolean field813;

	@ObfuscatedName("ec.w")
	public boolean field814;

	@ObfuscatedName("ec.x")
	public int field815;

	@ObfuscatedName("ec.y")
	public int field816;

	@ObfuscatedName("ec.z")
	public byte field817;

	@ObfuscatedName("ec.P")
	public static class20 field833 = new class20(500);

	@ObfuscatedName("ec.Q")
	public static class20 field834 = new class20(30);

	@ObfuscatedName("ec.A")
	public byte field818;

	@ObfuscatedName("ec.D")
	public int field821;

	@ObfuscatedName("ec.E")
	public int field822;

	@ObfuscatedName("ec.H")
	public int field825;

	@ObfuscatedName("ec.I")
	public int field826;

	@ObfuscatedName("ec.J")
	public int field827;

	@ObfuscatedName("ec.K")
	public int field828;

	@ObfuscatedName("ec.L")
	public int field829;

	@ObfuscatedName("ec.M")
	public int field830;

	@ObfuscatedName("ec.N")
	public int field831;

	@ObfuscatedName("ec.C")
	public boolean field820;

	@ObfuscatedName("ec.F")
	public boolean field823;

	@ObfuscatedName("ec.G")
	public boolean field824;

	@ObfuscatedName("ec.O")
	public boolean field832;

	@ObfuscatedName("ec.B")
	public String[] field819;

	@ObfuscatedName("ec.a(Lyb;)V")
	public static final void method318(class51 arg0) {
		field797 = new class39(arg0.method295("loc.dat", null));
		class39 var1 = new class39(arg0.method295("loc.idx", null));
		field795 = var1.method233();
		field796 = new int[field795];
		int var2 = 2;
		for (int var3 = 0; var3 < field795; var3++) {
			field796[var3] = var2;
			var2 += var1.method233();
		}

		field798 = new class57[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field798[var4] = new class57();
		}
	}

	@ObfuscatedName("ec.a(Z)V")
	public static final void method319() {
		field833 = null;
		field834 = null;
		field796 = null;
		field798 = null;
		field797 = null;
	}

	@ObfuscatedName("ec.a(I)Lec;")
	public static final class57 method320(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field798[var1].field800 == arg0) {
				return field798[var1];
			}
		}

		field799 = (field799 + 1) % 10;
		class57 var2 = field798[field799];
		field797.field611 = field796[arg0];
		var2.field800 = arg0;
		var2.method321();
		var2.method322(field797);
		return var2;
	}

	@ObfuscatedName("ec.a()V")
	public final void method321() {
		field801 = null;
		field802 = null;
		field803 = null;
		field804 = null;
		field805 = null;
		field806 = null;
		field807 = 1;
		field808 = 1;
		field809 = true;
		field810 = true;
		field811 = false;
		field812 = false;
		field813 = false;
		field814 = false;
		field815 = -1;
		field816 = 16;
		field817 = 0;
		field818 = 0;
		field819 = null;
		field820 = false;
		field821 = -1;
		field822 = -1;
		field823 = false;
		field824 = true;
		field825 = 128;
		field826 = 128;
		field827 = 128;
		field831 = 0;
		field828 = 0;
		field829 = 0;
		field830 = 0;
		field832 = false;
	}

	@ObfuscatedName("ec.a(ZLmb;)V")
	public final void method322(class39 arg0) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method231();
			if (var3 == 0) {
				if (field802 == null) {
					field802 = new int[0];
				}

				if (var2 == -1) {
					field811 = false;
					if (field802.length > 0 && field802[0] == 10) {
						field811 = true;
					}

					if (field819 != null) {
						field811 = true;
						return;
					}
				}

				return;
			}

			if (var3 == 1) {
				int var4 = arg0.method231();
				field802 = new int[var4];
				field801 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field801[var5] = arg0.method233();
					field802[var5] = arg0.method231();
				}
			} else if (var3 == 2) {
				field803 = arg0.method238();
			} else if (var3 == 3) {
				field804 = arg0.method239();
			} else if (var3 == 14) {
				field807 = arg0.method231();
			} else if (var3 == 15) {
				field808 = arg0.method231();
			} else if (var3 == 17) {
				field809 = false;
			} else if (var3 == 18) {
				field810 = false;
			} else if (var3 == 19) {
				var2 = arg0.method231();
				if (var2 == 1) {
					field811 = true;
				}
			} else if (var3 == 21) {
				field812 = true;
			} else if (var3 == 22) {
				field813 = true;
			} else if (var3 == 23) {
				field814 = true;
			} else if (var3 == 24) {
				field815 = arg0.method233();
				if (field815 == 0xFFFF) {
					field815 = -1;
				}
			} else if (var3 == 25) {
				field820 = true;
			} else if (var3 == 28) {
				field816 = arg0.method231();
			} else if (var3 == 29) {
				field817 = arg0.method232();
			} else if (var3 == 39) {
				field818 = arg0.method232();
			} else if (var3 >= 30 && var3 < 39) {
				if (field819 == null) {
					field819 = new String[5];
				}

				field819[var3 - 30] = arg0.method238();
				if (field819[var3 - 30].equalsIgnoreCase("hidden")) {
					field819[var3 - 30] = null;
				}
			} else if (var3 == 40) {
				int var6 = arg0.method231();
				field805 = new int[var6];
				field806 = new int[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					field805[var7] = arg0.method233();
					field806[var7] = arg0.method233();
				}
			} else if (var3 == 60) {
				field821 = arg0.method233();
			} else if (var3 == 62) {
				field823 = true;
			} else if (var3 == 64) {
				field824 = false;
			} else if (var3 == 65) {
				field825 = arg0.method233();
			} else if (var3 == 66) {
				field826 = arg0.method233();
			} else if (var3 == 67) {
				field827 = arg0.method233();
			} else if (var3 == 68) {
				field822 = arg0.method233();
			} else if (var3 == 69) {
				field831 = arg0.method231();
			} else if (var3 == 70) {
				field828 = arg0.method234();
			} else if (var3 == 71) {
				field829 = arg0.method234();
			} else if (var3 == 72) {
				field830 = arg0.method234();
			} else if (var3 == 73) {
				field832 = true;
			}
		}
	}

	@ObfuscatedName("ec.a(IZ)Z")
	public final boolean method323(int arg0) {
		int var2 = -1;
		for (int var3 = 0; var3 < field802.length; var3++) {
			if (field802[var3] == arg0) {
				var2 = var3;
				break;
			}
		}

		if (var2 == -1) {
			return true;
		} else if (field801 == null) {
			return true;
		} else {
			int var4 = field801[var2];
			if (var4 == -1) {
				return true;
			}

			return class32.method136(var4 & 0xFFFF);
		}
	}

	@ObfuscatedName("ec.b(I)Z")
	public final boolean method324() {
		boolean var1 = true;

		if (field801 == null) {
			return true;
		}

		for (int var2 = 0; var2 < field801.length; var2++) {
			int var3 = field801[var2];
			if (var3 != -1) {
				var1 &= class32.method136(var3 & 0xFFFF);
			}
		}

		return var1;
	}

	@ObfuscatedName("ec.a(Lvb;I)V")
	public final void method325(class48 arg0) {
		if (field801 != null) {
			for (int var2 = 0; var2 < field801.length; var2++) {
				int var3 = field801[var2];
				if (var3 != -1) {
					arg0.method284(0, var3 & 0xFFFF);
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIII)Lfb;")
	public final class32 method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = -1;
		for (int var9 = 0; var9 < field802.length; var9++) {
			if (field802[var9] == arg0) {
				var8 = var9;
				break;
			}
		}

		if (var8 == -1) {
			return null;
		}

		long var10 = ((long) (arg6 + 1) << 32) + ((field800 << 6) + (var8 << 3) + arg1);
		if (field794) {
			var10 = 0L;
		}

		class32 var12 = (class32) field834.method113(var10);
		if (var12 == null) {
			if (field801 == null || var8 >= field801.length) {
				return null;
			}

			int var20 = field801[var8];
			if (var20 == -1) {
				return null;
			}

			boolean var21 = field823 ^ arg1 > 3;
			if (var21) {
				var20 += 0x10000;
			}

			class32 var22 = (class32) field833.method113(var20);
			if (var22 == null) {
				var22 = class32.method135(var20 & 0xFFFF);
				if (var22 == null) {
					return null;
				}

				if (var21) {
					var22.method150();
				}

				field833.method114(var20, var22);
			}

			boolean var23;
			if (field825 == 128 && field826 == 128 && field827 == 128) {
				var23 = false;
			} else {
				var23 = true;
			}

			boolean var24;
			if (field828 == 0 && field829 == 0 && field830 == 0) {
				var24 = false;
			} else {
				var24 = true;
			}

			class32 var25 = new class32(field805 == null, !field820, arg1 == 0 && arg6 == -1 && !var23 && !var24, var22);
			if (arg6 != -1) {
				var25.method142();
				var25.method143(arg6);
				var25.field508 = null;
				var25.field507 = null;
			}

			while (arg1-- > 0) {
				var25.method146();
			}

			if (field805 != null) {
				for (int var26 = 0; var26 < field805.length; var26++) {
					var25.method149(field805[var26], field806[var26]);
				}
			}

			if (var23) {
				var25.method151(field825, field827, field826);
			}

			if (var24) {
				var25.method148(field829, field828, field830);
			}

			var25.method152(field817 + 64, field818 * 5 + 768, -50, -10, -50, !field813);

			if (field809) {
				var25.field504 = var25.field358;
			}

			field834.method114(var10, var25);

			if (field812 || field813) {
				var25 = new class32(field813, field812, var25);
			}

			if (field812) {
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
		} else if (field794) {
			return var12;
		} else {
			if (field812 || field813) {
				var12 = new class32(field813, field812, var12);
			}

			if (field812) {
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
