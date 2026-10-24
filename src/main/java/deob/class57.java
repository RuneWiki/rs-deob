package deob;

@ObfuscatedName("ec")
public final class class57 {

	@ObfuscatedName("ec.e")
	public static int field811;

	@ObfuscatedName("ec.f")
	public static int[] field812;

	@ObfuscatedName("ec.g")
	public static class39 field813;

	@ObfuscatedName("ec.h")
	public static class57[] field814;

	@ObfuscatedName("ec.i")
	public static int field815;

	@ObfuscatedName("ec.j")
	public static class32[] field816 = new class32[4];

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

	@ObfuscatedName("ec.E")
	public int field837;

	@ObfuscatedName("ec.F")
	public int field838;

	@ObfuscatedName("ec.I")
	public int field841;

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

	@ObfuscatedName("ec.R")
	public int field850;

	@ObfuscatedName("ec.G")
	public boolean field839;

	@ObfuscatedName("ec.H")
	public boolean field840;

	@ObfuscatedName("ec.P")
	public boolean field848;

	@ObfuscatedName("ec.Q")
	public boolean field849;

	@ObfuscatedName("ec.D")
	public String[] field836;

	@ObfuscatedName("ec.a(Lyb;)V")
	public static final void method332(class51 arg0) {
		field813 = new class39(arg0.method309("loc.dat", null));
		class39 var1 = new class39(arg0.method309("loc.idx", null));
		field811 = var1.method241();
		field812 = new int[field811];
		int var2 = 2;
		for (int var3 = 0; var3 < field811; var3++) {
			field812[var3] = var2;
			var2 += var1.method241();
		}

		field814 = new class57[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field814[var4] = new class57();
		}
	}

	@ObfuscatedName("ec.a(Z)V")
	public static final void method333() {
		field851 = null;
		field852 = null;
		field812 = null;
		field814 = null;
		field813 = null;
	}

	@ObfuscatedName("ec.a(I)Lec;")
	public static final class57 method334(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field814[var1].field817 == arg0) {
				return field814[var1];
			}
		}

		field815 = (field815 + 1) % 10;
		class57 var2 = field814[field815];
		field813.field623 = field812[arg0];
		var2.field817 = arg0;
		var2.method335();
		var2.method336(field813);
		return var2;
	}

	@ObfuscatedName("ec.a()V")
	public final void method335() {
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
		field837 = -1;
		field838 = -1;
		field839 = false;
		field840 = true;
		field841 = 128;
		field842 = 128;
		field843 = 128;
		field847 = 0;
		field844 = 0;
		field845 = 0;
		field846 = 0;
		field848 = false;
		field849 = false;
		field850 = -1;
	}

	@ObfuscatedName("ec.a(Lmb;B)V")
	public final void method336(class39 arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method239();
					if (var3 == 0) {
						if (var2 == -1) {
							field828 = false;
							if (field818 != null && (field819 == null || field819[0] == 10)) {
								field828 = true;
							}

							if (field836 != null) {
								field828 = true;
							}
						}

						if (field849) {
							field826 = false;
							field827 = false;
						}

						if (field850 == -1) {
							field850 = field826 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field820 = arg0.method246();
					} else if (var3 == 3) {
						field821 = arg0.method247();
					} else if (var3 == 5) {
						int var6 = arg0.method239();
						if (var6 > 0) {
							field819 = null;
							field818 = new int[var6];
							for (int var7 = 0; var7 < var6; var7++) {
								field818[var7] = arg0.method241();
							}
						}
					} else if (var3 == 14) {
						field824 = arg0.method239();
					} else if (var3 == 15) {
						field825 = arg0.method239();
					} else if (var3 == 17) {
						field826 = false;
					} else if (var3 == 18) {
						field827 = false;
					} else if (var3 == 19) {
						var2 = arg0.method239();
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
						field832 = arg0.method241();
						if (field832 == 0xFFFF) {
							field832 = -1;
						}
					} else if (var3 == 28) {
						field833 = arg0.method239();
					} else if (var3 == 29) {
						field834 = arg0.method240();
					} else if (var3 == 39) {
						field835 = arg0.method240();
					} else if (var3 >= 30 && var3 < 39) {
						if (field836 == null) {
							field836 = new String[5];
						}

						field836[var3 - 30] = arg0.method246();
						if (field836[var3 - 30].equalsIgnoreCase("hidden")) {
							field836[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method239();
						field822 = new int[var8];
						field823 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field822[var9] = arg0.method241();
							field823[var9] = arg0.method241();
						}
					} else if (var3 == 60) {
						field837 = arg0.method241();
					} else if (var3 == 62) {
						field839 = true;
					} else if (var3 == 64) {
						field840 = false;
					} else if (var3 == 65) {
						field841 = arg0.method241();
					} else if (var3 == 66) {
						field842 = arg0.method241();
					} else if (var3 == 67) {
						field843 = arg0.method241();
					} else if (var3 == 68) {
						field838 = arg0.method241();
					} else if (var3 == 69) {
						field847 = arg0.method239();
					} else if (var3 == 70) {
						field844 = arg0.method242();
					} else if (var3 == 71) {
						field845 = arg0.method242();
					} else if (var3 == 72) {
						field846 = arg0.method242();
					} else if (var3 == 73) {
						field848 = true;
					} else if (var3 == 74) {
						field849 = true;
					} else if (var3 == 75) {
						field850 = arg0.method239();
					}
				}

				var4 = arg0.method239();
			} while (var4 <= 0);

			field819 = new int[var4];
			field818 = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field818[var5] = arg0.method241();
				field819[var5] = arg0.method239();
			}
		}
	}

	@ObfuscatedName("ec.a(II)Z")
	public final boolean method337(int arg0) {
		if (field819 != null) {
			for (int var4 = 0; var4 < field819.length; var4++) {
				if (field819[var4] == arg0) {
					return class32.method140(field818[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field818 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field818.length; var3++) {
				var2 &= class32.method140(field818[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("ec.a(B)Z")
	public final boolean method338() {
		if (field818 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field818.length; var2++) {
			var1 &= class32.method140(field818[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("ec.a(Lvb;I)V")
	public final void method339(class48 arg0) {
		if (field818 != null) {
			for (int var2 = 0; var2 < field818.length; var2++) {
				arg0.method294(0, field818[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIII)Lfb;")
	public final class32 method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		class32 var8 = method341(arg0, arg6, arg1);
		if (var8 == null) {
			return null;
		}

		if (field829 || field830) {
			var8 = new class32(var8, field830, field829);
		}

		if (field829) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field487; var10++) {
				int var11 = var8.field488[var10];
				int var12 = var8.field490[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field489[var10] += var15 - var9;
			}

			var8.method144();
		}

		return var8;
	}

	@ObfuscatedName("ec.a(ZIII)Lfb;")
	public final class32 method341(int arg0, int arg1, int arg2) {
		class32 var4 = null;
		long var5;
		if (field819 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field817 << 6) + arg2);
			class32 var7 = (class32) field852.method115(var5);
			if (var7 != null) {
				return var7;
			}

			if (field818 == null) {
				return null;
			}

			boolean var8 = field839 ^ arg2 > 3;
			int var9 = field818.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field818[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (class32) field851.method115(var11);
				if (var4 == null) {
					var4 = class32.method139(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method154();
					}

					field851.method116(var11, var4);
				}

				if (var9 > 1) {
					field816[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new class32(var9, field816);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field819.length; var13++) {
				if (field819[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field817 << 6) + (var12 << 3) + arg2);
			class32 var14 = (class32) field852.method115(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field818[var12];
			boolean var16 = field839 ^ arg2 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (class32) field851.method115(var15);
			if (var4 == null) {
				var4 = class32.method139(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method154();
				}

				field851.method116(var15, var4);
			}
		}

		boolean var17;
		if (field841 == 128 && field842 == 128 && field843 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field844 == 0 && field845 == 0 && field846 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		class32 var19 = new class32(class8.method62(arg1), arg2 == 0 && arg1 == -1 && !var17 && !var18, field822 == null, var4);
		if (arg1 != -1) {
			var19.method146();
			var19.method147(arg1);
			var19.field519 = null;
			var19.field518 = null;
		}

		while (arg2-- > 0) {
			var19.method150();
		}

		if (field822 != null) {
			for (int var20 = 0; var20 < field822.length; var20++) {
				var19.method153(field822[var20], field823[var20]);
			}
		}

		if (var17) {
			var19.method155(field843, field842, field841);
		}

		if (var18) {
			var19.method152(field846, field844, field845);
		}

		var19.method156(field834 + 64, field835 * 5 + 768, -50, -10, -50, !field830);

		if (field850 == 1) {
			var19.field515 = var19.field367;
		}

		field852.method116(var5, var19);
		return var19;
	}
}
