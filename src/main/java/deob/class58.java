package deob;

@ObfuscatedName("fc")
public final class class58 {

	@ObfuscatedName("fc.d")
	public static int field823;

	@ObfuscatedName("fc.e")
	public static int[] field824;

	@ObfuscatedName("fc.f")
	public static class39 field825;

	@ObfuscatedName("fc.g")
	public static class58[] field826;

	@ObfuscatedName("fc.h")
	public static int field827;

	@ObfuscatedName("fc.i")
	public static class31[] field828 = new class31[4];

	@ObfuscatedName("fc.j")
	public int field829 = -1;

	@ObfuscatedName("fc.k")
	public int[] field830;

	@ObfuscatedName("fc.l")
	public int[] field831;

	@ObfuscatedName("fc.m")
	public String field832;

	@ObfuscatedName("fc.n")
	public byte[] field833;

	@ObfuscatedName("fc.o")
	public int[] field834;

	@ObfuscatedName("fc.p")
	public int[] field835;

	@ObfuscatedName("fc.q")
	public int field836;

	@ObfuscatedName("fc.r")
	public int field837;

	@ObfuscatedName("fc.s")
	public boolean field838;

	@ObfuscatedName("fc.t")
	public boolean field839;

	@ObfuscatedName("fc.u")
	public boolean field840;

	@ObfuscatedName("fc.v")
	public boolean field841;

	@ObfuscatedName("fc.w")
	public boolean field842;

	@ObfuscatedName("fc.x")
	public boolean field843;

	@ObfuscatedName("fc.y")
	public int field844;

	@ObfuscatedName("fc.z")
	public int field845;

	@ObfuscatedName("fc.R")
	public static class19 field863 = new class19(500);

	@ObfuscatedName("fc.S")
	public static class19 field864 = new class19(30);

	@ObfuscatedName("fc.A")
	public byte field846;

	@ObfuscatedName("fc.B")
	public byte field847;

	@ObfuscatedName("fc.D")
	public int field849;

	@ObfuscatedName("fc.E")
	public int field850;

	@ObfuscatedName("fc.H")
	public int field853;

	@ObfuscatedName("fc.I")
	public int field854;

	@ObfuscatedName("fc.J")
	public int field855;

	@ObfuscatedName("fc.K")
	public int field856;

	@ObfuscatedName("fc.L")
	public int field857;

	@ObfuscatedName("fc.M")
	public int field858;

	@ObfuscatedName("fc.N")
	public int field859;

	@ObfuscatedName("fc.Q")
	public int field862;

	@ObfuscatedName("fc.F")
	public boolean field851;

	@ObfuscatedName("fc.G")
	public boolean field852;

	@ObfuscatedName("fc.O")
	public boolean field860;

	@ObfuscatedName("fc.P")
	public boolean field861;

	@ObfuscatedName("fc.C")
	public String[] field848;

	@ObfuscatedName("fc.a(Lyb;)V")
	public static final void method327(class51 arg0) {
		field825 = new class39(arg0.method298("loc.dat", null));
		class39 var1 = new class39(arg0.method298("loc.idx", null));
		field823 = var1.method230();
		field824 = new int[field823];
		int var2 = 2;
		for (int var3 = 0; var3 < field823; var3++) {
			field824[var3] = var2;
			var2 += var1.method230();
		}

		field826 = new class58[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field826[var4] = new class58();
		}
	}

	@ObfuscatedName("fc.a(I)V")
	public static final void method328() {
		field863 = null;
		field864 = null;
		field824 = null;
		field826 = null;
		field825 = null;
	}

	@ObfuscatedName("fc.b(I)Lfc;")
	public static final class58 method329(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field826[var1].field829 == arg0) {
				return field826[var1];
			}
		}

		field827 = (field827 + 1) % 10;
		class58 var2 = field826[field827];
		field825.field625 = field824[arg0];
		var2.field829 = arg0;
		var2.method330();
		var2.method331(field825);
		return var2;
	}

	@ObfuscatedName("fc.a()V")
	public final void method330() {
		field830 = null;
		field831 = null;
		field832 = null;
		field833 = null;
		field834 = null;
		field835 = null;
		field836 = 1;
		field837 = 1;
		field838 = true;
		field839 = true;
		field840 = false;
		field841 = false;
		field842 = false;
		field843 = false;
		field844 = -1;
		field845 = 16;
		field846 = 0;
		field847 = 0;
		field848 = null;
		field849 = -1;
		field850 = -1;
		field851 = false;
		field852 = true;
		field853 = 128;
		field854 = 128;
		field855 = 128;
		field859 = 0;
		field856 = 0;
		field857 = 0;
		field858 = 0;
		field860 = false;
		field861 = false;
		field862 = -1;
	}

	@ObfuscatedName("fc.a(BLmb;)V")
	public final void method331(class39 arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method228();
					if (var3 == 0) {
						if (var2 == -1) {
							field840 = false;
							if (field830 != null && (field831 == null || field831[0] == 10)) {
								field840 = true;
							}

							if (field848 != null) {
								field840 = true;
							}
						}

						if (field861) {
							field838 = false;
							field839 = false;
						}

						if (field862 == -1) {
							field862 = field838 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field832 = arg0.method235();
					} else if (var3 == 3) {
						field833 = arg0.method236();
					} else if (var3 == 5) {
						int var6 = arg0.method228();
						if (var6 > 0) {
							field831 = null;
							field830 = new int[var6];
							for (int var7 = 0; var7 < var6; var7++) {
								field830[var7] = arg0.method230();
							}
						}
					} else if (var3 == 14) {
						field836 = arg0.method228();
					} else if (var3 == 15) {
						field837 = arg0.method228();
					} else if (var3 == 17) {
						field838 = false;
					} else if (var3 == 18) {
						field839 = false;
					} else if (var3 == 19) {
						var2 = arg0.method228();
						if (var2 == 1) {
							field840 = true;
						}
					} else if (var3 == 21) {
						field841 = true;
					} else if (var3 == 22) {
						field842 = true;
					} else if (var3 == 23) {
						field843 = true;
					} else if (var3 == 24) {
						field844 = arg0.method230();
						if (field844 == 0xFFFF) {
							field844 = -1;
						}
					} else if (var3 == 28) {
						field845 = arg0.method228();
					} else if (var3 == 29) {
						field846 = arg0.method229();
					} else if (var3 == 39) {
						field847 = arg0.method229();
					} else if (var3 >= 30 && var3 < 39) {
						if (field848 == null) {
							field848 = new String[5];
						}

						field848[var3 - 30] = arg0.method235();
						if (field848[var3 - 30].equalsIgnoreCase("hidden")) {
							field848[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method228();
						field834 = new int[var8];
						field835 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field834[var9] = arg0.method230();
							field835[var9] = arg0.method230();
						}
					} else if (var3 == 60) {
						field849 = arg0.method230();
					} else if (var3 == 62) {
						field851 = true;
					} else if (var3 == 64) {
						field852 = false;
					} else if (var3 == 65) {
						field853 = arg0.method230();
					} else if (var3 == 66) {
						field854 = arg0.method230();
					} else if (var3 == 67) {
						field855 = arg0.method230();
					} else if (var3 == 68) {
						field850 = arg0.method230();
					} else if (var3 == 69) {
						field859 = arg0.method228();
					} else if (var3 == 70) {
						field856 = arg0.method231();
					} else if (var3 == 71) {
						field857 = arg0.method231();
					} else if (var3 == 72) {
						field858 = arg0.method231();
					} else if (var3 == 73) {
						field860 = true;
					} else if (var3 == 74) {
						field861 = true;
					} else if (var3 == 75) {
						field862 = arg0.method228();
					}
				}

				var4 = arg0.method228();
			} while (var4 <= 0);

			field831 = new int[var4];
			field830 = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field830[var5] = arg0.method230();
				field831[var5] = arg0.method228();
			}
		}
	}

	@ObfuscatedName("fc.a(II)Z")
	public final boolean method332(int arg0) {
		if (field831 != null) {
			for (int var4 = 0; var4 < field831.length; var4++) {
				if (field831[var4] == arg0) {
					return class31.method126(field830[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field830 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field830.length; var3++) {
				var2 &= class31.method126(field830[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("fc.a(Z)Z")
	public final boolean method333() {
		if (field830 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field830.length; var2++) {
			var1 &= class31.method126(field830[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("fc.a(ZLvb;)V")
	public final void method334(class48 arg0) {
		if (field830 != null) {
			for (int var2 = 0; var2 < field830.length; var2++) {
				arg0.method283(0, field830[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("fc.a(IIIIIII)Leb;")
	public final class31 method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		class31 var8 = method336(arg1, arg0, arg6);
		if (var8 == null) {
			return null;
		}

		if (field841 || field842) {
			var8 = new class31(field841, field842, var8);
		}

		if (field841) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field481; var10++) {
				int var11 = var8.field482[var10];
				int var12 = var8.field484[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field483[var10] += var15 - var9;
			}

			var8.method130();
		}

		return var8;
	}

	@ObfuscatedName("fc.a(IIII)Leb;")
	public final class31 method336(int arg0, int arg1, int arg2) {
		class31 var4 = null;
		long var5;
		if (field831 == null) {
			if (arg1 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field829 << 6) + arg0);
			class31 var7 = (class31) field864.method101(var5);
			if (var7 != null) {
				return var7;
			}

			if (field830 == null) {
				return null;
			}

			boolean var8 = field851 ^ arg0 > 3;
			int var9 = field830.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field830[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (class31) field863.method101(var11);
				if (var4 == null) {
					var4 = class31.method125(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method140();
					}

					field863.method102(var4, var11);
				}

				if (var9 > 1) {
					field828[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new class31(field828, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field831.length; var13++) {
				if (field831[var13] == arg1) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field829 << 6) + (var12 << 3) + arg0);
			class31 var14 = (class31) field864.method101(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field830[var12];
			boolean var16 = field851 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (class31) field863.method101(var15);
			if (var4 == null) {
				var4 = class31.method125(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method140();
				}

				field863.method102(var4, var15);
			}
		}

		boolean var17;
		if (field853 == 128 && field854 == 128 && field855 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field856 == 0 && field857 == 0 && field858 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		class31 var19 = new class31(arg0 == 0 && arg2 == -1 && !var17 && !var18, var4, field834 == null, class7.method48(arg2));
		if (arg2 != -1) {
			var19.method132();
			var19.method133(arg2);
			var19.field513 = null;
			var19.field512 = null;
		}

		while (arg0-- > 0) {
			var19.method136();
		}

		if (field834 != null) {
			for (int var20 = 0; var20 < field834.length; var20++) {
				var19.method139(field834[var20], field835[var20]);
			}
		}

		if (var17) {
			var19.method141(field853, field855, field854);
		}

		if (var18) {
			var19.method138(field857, field856, field858);
		}

		var19.method142(field846 + 64, field847 * 5 + 768, -50, -10, -50, !field842);

		if (field862 == 1) {
			var19.field509 = var19.field359;
		}

		field864.method102(var19, var5);
		return var19;
	}
}
