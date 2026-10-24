package deob;

@ObfuscatedName("ec")
public final class class57 {

	@ObfuscatedName("ec.c")
	public static int field812;

	@ObfuscatedName("ec.d")
	public static int[] field813;

	@ObfuscatedName("ec.e")
	public static class39 field814;

	@ObfuscatedName("ec.f")
	public static class57[] field815;

	@ObfuscatedName("ec.g")
	public static int field816;

	@ObfuscatedName("ec.h")
	public static class32[] field817 = new class32[4];

	@ObfuscatedName("ec.i")
	public int field818 = -1;

	@ObfuscatedName("ec.j")
	public int[] field819;

	@ObfuscatedName("ec.k")
	public int[] field820;

	@ObfuscatedName("ec.l")
	public String field821;

	@ObfuscatedName("ec.m")
	public byte[] field822;

	@ObfuscatedName("ec.n")
	public int[] field823;

	@ObfuscatedName("ec.o")
	public int[] field824;

	@ObfuscatedName("ec.p")
	public int field825;

	@ObfuscatedName("ec.q")
	public int field826;

	@ObfuscatedName("ec.r")
	public boolean field827;

	@ObfuscatedName("ec.s")
	public boolean field828;

	@ObfuscatedName("ec.t")
	public boolean field829;

	@ObfuscatedName("ec.u")
	public boolean field830;

	@ObfuscatedName("ec.v")
	public boolean field831;

	@ObfuscatedName("ec.w")
	public boolean field832;

	@ObfuscatedName("ec.x")
	public int field833;

	@ObfuscatedName("ec.y")
	public int field834;

	@ObfuscatedName("ec.z")
	public byte field835;

	@ObfuscatedName("ec.Q")
	public static class20 field852 = new class20(500);

	@ObfuscatedName("ec.R")
	public static class20 field853 = new class20(30);

	@ObfuscatedName("ec.A")
	public byte field836;

	@ObfuscatedName("ec.C")
	public int field838;

	@ObfuscatedName("ec.D")
	public int field839;

	@ObfuscatedName("ec.G")
	public int field842;

	@ObfuscatedName("ec.H")
	public int field843;

	@ObfuscatedName("ec.I")
	public int field844;

	@ObfuscatedName("ec.J")
	public int field845;

	@ObfuscatedName("ec.K")
	public int field846;

	@ObfuscatedName("ec.L")
	public int field847;

	@ObfuscatedName("ec.M")
	public int field848;

	@ObfuscatedName("ec.P")
	public int field851;

	@ObfuscatedName("ec.E")
	public boolean field840;

	@ObfuscatedName("ec.F")
	public boolean field841;

	@ObfuscatedName("ec.N")
	public boolean field849;

	@ObfuscatedName("ec.O")
	public boolean field850;

	@ObfuscatedName("ec.B")
	public String[] field837;

	@ObfuscatedName("ec.a(Lyb;)V")
	public static final void method332(class51 arg0) {
		field814 = new class39(arg0.method309("loc.dat", null));
		class39 var1 = new class39(arg0.method309("loc.idx", null));
		field812 = var1.method241();
		field813 = new int[field812];
		int var2 = 2;
		for (int var3 = 0; var3 < field812; var3++) {
			field813[var3] = var2;
			var2 += var1.method241();
		}

		field815 = new class57[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field815[var4] = new class57();
		}
	}

	@ObfuscatedName("ec.a(Z)V")
	public static final void method333() {
		field852 = null;
		field853 = null;
		field813 = null;
		field815 = null;
		field814 = null;
	}

	@ObfuscatedName("ec.a(I)Lec;")
	public static final class57 method334(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field815[var1].field818 == arg0) {
				return field815[var1];
			}
		}

		field816 = (field816 + 1) % 10;
		class57 var2 = field815[field816];
		field814.field624 = field813[arg0];
		var2.field818 = arg0;
		var2.method335();
		var2.method336(field814);
		return var2;
	}

	@ObfuscatedName("ec.a()V")
	public final void method335() {
		field819 = null;
		field820 = null;
		field821 = null;
		field822 = null;
		field823 = null;
		field824 = null;
		field825 = 1;
		field826 = 1;
		field827 = true;
		field828 = true;
		field829 = false;
		field830 = false;
		field831 = false;
		field832 = false;
		field833 = -1;
		field834 = 16;
		field835 = 0;
		field836 = 0;
		field837 = null;
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
		field851 = -1;
	}

	@ObfuscatedName("ec.a(ILmb;)V")
	public final void method336(class39 arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method239();
					if (var3 == 0) {
						if (var2 == -1) {
							field829 = false;
							if (field819 != null && (field820 == null || field820[0] == 10)) {
								field829 = true;
							}

							if (field837 != null) {
								field829 = true;
							}
						}

						if (field850) {
							field827 = false;
							field828 = false;
						}

						if (field851 == -1) {
							field851 = field827 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field821 = arg0.method246();
					} else if (var3 == 3) {
						field822 = arg0.method247();
					} else if (var3 == 5) {
						int var6 = arg0.method239();
						if (var6 > 0) {
							field820 = null;
							field819 = new int[var6];
							for (int var7 = 0; var7 < var6; var7++) {
								field819[var7] = arg0.method241();
							}
						}
					} else if (var3 == 14) {
						field825 = arg0.method239();
					} else if (var3 == 15) {
						field826 = arg0.method239();
					} else if (var3 == 17) {
						field827 = false;
					} else if (var3 == 18) {
						field828 = false;
					} else if (var3 == 19) {
						var2 = arg0.method239();
						if (var2 == 1) {
							field829 = true;
						}
					} else if (var3 == 21) {
						field830 = true;
					} else if (var3 == 22) {
						field831 = true;
					} else if (var3 == 23) {
						field832 = true;
					} else if (var3 == 24) {
						field833 = arg0.method241();
						if (field833 == 0xFFFF) {
							field833 = -1;
						}
					} else if (var3 == 28) {
						field834 = arg0.method239();
					} else if (var3 == 29) {
						field835 = arg0.method240();
					} else if (var3 == 39) {
						field836 = arg0.method240();
					} else if (var3 >= 30 && var3 < 39) {
						if (field837 == null) {
							field837 = new String[5];
						}

						field837[var3 - 30] = arg0.method246();
						if (field837[var3 - 30].equalsIgnoreCase("hidden")) {
							field837[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method239();
						field823 = new int[var8];
						field824 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field823[var9] = arg0.method241();
							field824[var9] = arg0.method241();
						}
					} else if (var3 == 60) {
						field838 = arg0.method241();
					} else if (var3 == 62) {
						field840 = true;
					} else if (var3 == 64) {
						field841 = false;
					} else if (var3 == 65) {
						field842 = arg0.method241();
					} else if (var3 == 66) {
						field843 = arg0.method241();
					} else if (var3 == 67) {
						field844 = arg0.method241();
					} else if (var3 == 68) {
						field839 = arg0.method241();
					} else if (var3 == 69) {
						field848 = arg0.method239();
					} else if (var3 == 70) {
						field845 = arg0.method242();
					} else if (var3 == 71) {
						field846 = arg0.method242();
					} else if (var3 == 72) {
						field847 = arg0.method242();
					} else if (var3 == 73) {
						field849 = true;
					} else if (var3 == 74) {
						field850 = true;
					} else if (var3 == 75) {
						field851 = arg0.method239();
					}
				}

				var4 = arg0.method239();
			} while (var4 <= 0);

			field820 = new int[var4];
			field819 = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field819[var5] = arg0.method241();
				field820[var5] = arg0.method239();
			}
		}
	}

	@ObfuscatedName("ec.a(II)Z")
	public final boolean method337(int arg0) {
		if (field820 != null) {
			for (int var4 = 0; var4 < field820.length; var4++) {
				if (field820[var4] == arg0) {
					return class32.method140(field819[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field819 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field819.length; var3++) {
				var2 &= class32.method140(field819[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("ec.a(B)Z")
	public final boolean method338() {
		if (field819 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field819.length; var2++) {
			var1 &= class32.method140(field819[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("ec.a(Lvb;Z)V")
	public final void method339(class48 arg0) {
		if (field819 != null) {
			for (int var2 = 0; var2 < field819.length; var2++) {
				arg0.method294(0, field819[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIII)Lfb;")
	public final class32 method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		class32 var8 = method341(arg6, arg1, arg0);
		if (var8 == null) {
			return null;
		}

		if (field830 || field831) {
			var8 = new class32(field830, var8, field831);
		}

		if (field830) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field488; var10++) {
				int var11 = var8.field489[var10];
				int var12 = var8.field491[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field490[var10] += var15 - var9;
			}

			var8.method144();
		}

		return var8;
	}

	@ObfuscatedName("ec.a(IIII)Lfb;")
	public final class32 method341(int arg0, int arg1, int arg2) {
		class32 var4 = null;
		long var5;
		if (field820 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field818 << 6) + arg1);
			class32 var7 = (class32) field853.method115(var5);
			if (var7 != null) {
				return var7;
			}

			if (field819 == null) {
				return null;
			}

			boolean var8 = field840 ^ arg1 > 3;
			int var9 = field819.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field819[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (class32) field852.method115(var11);
				if (var4 == null) {
					var4 = class32.method139(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method154();
					}

					field852.method116(var11, var4);
				}

				if (var9 > 1) {
					field817[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new class32(var9, field817);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field820.length; var13++) {
				if (field820[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field818 << 6) + (var12 << 3) + arg1);
			class32 var14 = (class32) field853.method115(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field819[var12];
			boolean var16 = field840 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (class32) field852.method115(var15);
			if (var4 == null) {
				var4 = class32.method139(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method154();
				}

				field852.method116(var15, var4);
			}
		}

		boolean var17;
		if (field842 == 128 && field843 == 128 && field844 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field845 == 0 && field846 == 0 && field847 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		class32 var19 = new class32(class8.method62(arg0), field823 == null, var4, arg1 == 0 && arg0 == -1 && !var17 && !var18);
		if (arg0 != -1) {
			var19.method146();
			var19.method147(arg0);
			var19.field520 = null;
			var19.field519 = null;
		}

		while (arg1-- > 0) {
			var19.method150();
		}

		if (field823 != null) {
			for (int var20 = 0; var20 < field823.length; var20++) {
				var19.method153(field823[var20], field824[var20]);
			}
		}

		if (var17) {
			var19.method155(field844, field843, field842);
		}

		if (var18) {
			var19.method152(field845, field846, field847);
		}

		var19.method156(field835 + 64, field836 * 5 + 768, -50, -10, -50, !field831);

		if (field851 == 1) {
			var19.field516 = var19.field368;
		}

		field853.method116(var5, var19);
		return var19;
	}
}
