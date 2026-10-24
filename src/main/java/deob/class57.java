package deob;

@ObfuscatedName("ec")
public final class class57 {

	@ObfuscatedName("ec.d")
	public static client field821;

	@ObfuscatedName("ec.e")
	public static boolean field822;

	@ObfuscatedName("ec.f")
	public static int field823;

	@ObfuscatedName("ec.g")
	public static int[] field824;

	@ObfuscatedName("ec.h")
	public static class38 field825;

	@ObfuscatedName("ec.i")
	public static class57[] field826;

	@ObfuscatedName("ec.j")
	public static int field827;

	@ObfuscatedName("ec.k")
	public static class31[] field828 = new class31[4];

	@ObfuscatedName("ec.l")
	public int field829 = -1;

	@ObfuscatedName("ec.m")
	public int[] field830;

	@ObfuscatedName("ec.n")
	public int[] field831;

	@ObfuscatedName("ec.o")
	public String field832;

	@ObfuscatedName("ec.p")
	public byte[] field833;

	@ObfuscatedName("ec.q")
	public int[] field834;

	@ObfuscatedName("ec.r")
	public int[] field835;

	@ObfuscatedName("ec.s")
	public int field836;

	@ObfuscatedName("ec.t")
	public int field837;

	@ObfuscatedName("ec.u")
	public boolean field838;

	@ObfuscatedName("ec.v")
	public boolean field839;

	@ObfuscatedName("ec.w")
	public boolean field840;

	@ObfuscatedName("ec.x")
	public boolean field841;

	@ObfuscatedName("ec.y")
	public boolean field842;

	@ObfuscatedName("ec.z")
	public boolean field843;

	@ObfuscatedName("ec.W")
	public static class19 field866 = new class19(500);

	@ObfuscatedName("ec.X")
	public static class19 field867 = new class19(30);

	@ObfuscatedName("ec.C")
	public byte field846;

	@ObfuscatedName("ec.D")
	public byte field847;

	@ObfuscatedName("ec.A")
	public int field844;

	@ObfuscatedName("ec.B")
	public int field845;

	@ObfuscatedName("ec.F")
	public int field849;

	@ObfuscatedName("ec.G")
	public int field850;

	@ObfuscatedName("ec.J")
	public int field853;

	@ObfuscatedName("ec.K")
	public int field854;

	@ObfuscatedName("ec.L")
	public int field855;

	@ObfuscatedName("ec.M")
	public int field856;

	@ObfuscatedName("ec.N")
	public int field857;

	@ObfuscatedName("ec.O")
	public int field858;

	@ObfuscatedName("ec.P")
	public int field859;

	@ObfuscatedName("ec.S")
	public int field862;

	@ObfuscatedName("ec.U")
	public int field864;

	@ObfuscatedName("ec.V")
	public int field865;

	@ObfuscatedName("ec.H")
	public boolean field851;

	@ObfuscatedName("ec.I")
	public boolean field852;

	@ObfuscatedName("ec.Q")
	public boolean field860;

	@ObfuscatedName("ec.R")
	public boolean field861;

	@ObfuscatedName("ec.T")
	public int[] field863;

	@ObfuscatedName("ec.E")
	public String[] field848;

	@ObfuscatedName("ec.a(Lxb;)V")
	public static final void method328(class50 arg0) {
		field825 = new class38(arg0.method299("loc.dat", null));
		class38 var1 = new class38(arg0.method299("loc.idx", null));
		field823 = var1.method231();
		field824 = new int[field823];
		int var2 = 2;
		for (int var3 = 0; var3 < field823; var3++) {
			field824[var3] = var2;
			var2 += var1.method231();
		}

		field826 = new class57[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field826[var4] = new class57();
		}
	}

	@ObfuscatedName("ec.a(I)V")
	public static final void method329() {
		field866 = null;
		field867 = null;
		field824 = null;
		field826 = null;
		field825 = null;
	}

	@ObfuscatedName("ec.b(I)Lec;")
	public static final class57 method330(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field826[var1].field829 == arg0) {
				return field826[var1];
			}
		}

		field827 = (field827 + 1) % 20;
		class57 var2 = field826[field827];
		field825.field621 = field824[arg0];
		var2.field829 = arg0;
		var2.method331();
		var2.method332(field825);
		return var2;
	}

	@ObfuscatedName("ec.a()V")
	public final void method331() {
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
		field864 = -1;
		field865 = -1;
		field863 = null;
	}

	@ObfuscatedName("ec.a(Llb;I)V")
	public final void method332(class38 arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method229();
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
						field832 = arg0.method236();
					} else if (var3 == 3) {
						field833 = arg0.method237();
					} else if (var3 == 5) {
						int var6 = arg0.method229();
						if (var6 > 0) {
							if (field830 == null || field822) {
								field831 = null;
								field830 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field830[var7] = arg0.method231();
								}
							} else {
								arg0.field621 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field836 = arg0.method229();
					} else if (var3 == 15) {
						field837 = arg0.method229();
					} else if (var3 == 17) {
						field838 = false;
					} else if (var3 == 18) {
						field839 = false;
					} else if (var3 == 19) {
						var2 = arg0.method229();
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
						field844 = arg0.method231();
						if (field844 == 0xFFFF) {
							field844 = -1;
						}
					} else if (var3 == 28) {
						field845 = arg0.method229();
					} else if (var3 == 29) {
						field846 = arg0.method230();
					} else if (var3 == 39) {
						field847 = arg0.method230();
					} else if (var3 >= 30 && var3 < 39) {
						if (field848 == null) {
							field848 = new String[5];
						}

						field848[var3 - 30] = arg0.method236();
						if (field848[var3 - 30].equalsIgnoreCase("hidden")) {
							field848[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method229();
						field834 = new int[var8];
						field835 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field834[var9] = arg0.method231();
							field835[var9] = arg0.method231();
						}
					} else if (var3 == 60) {
						field849 = arg0.method231();
					} else if (var3 == 62) {
						field851 = true;
					} else if (var3 == 64) {
						field852 = false;
					} else if (var3 == 65) {
						field853 = arg0.method231();
					} else if (var3 == 66) {
						field854 = arg0.method231();
					} else if (var3 == 67) {
						field855 = arg0.method231();
					} else if (var3 == 68) {
						field850 = arg0.method231();
					} else if (var3 == 69) {
						field859 = arg0.method229();
					} else if (var3 == 70) {
						field856 = arg0.method232();
					} else if (var3 == 71) {
						field857 = arg0.method232();
					} else if (var3 == 72) {
						field858 = arg0.method232();
					} else if (var3 == 73) {
						field860 = true;
					} else if (var3 == 74) {
						field861 = true;
					} else if (var3 == 75) {
						field862 = arg0.method229();
					} else if (var3 == 77) {
						field864 = arg0.method231();
						if (field864 == 0xFFFF) {
							field864 = -1;
						}

						field865 = arg0.method231();
						if (field865 == 0xFFFF) {
							field865 = -1;
						}

						int var10 = arg0.method229();
						field863 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field863[var11] = arg0.method231();
							if (field863[var11] == 0xFFFF) {
								field863[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method229();
			} while (var4 <= 0);

			if (field830 == null || field822) {
				field831 = new int[var4];
				field830 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field830[var5] = arg0.method231();
					field831[var5] = arg0.method229();
				}
			} else {
				arg0.field621 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("ec.a(II)Z")
	public final boolean method333(int arg0) {
		if (field831 != null) {
			for (int var4 = 0; var4 < field831.length; var4++) {
				if (field831[var4] == arg0) {
					return class31.method127(field830[var4] & 0xFFFF);
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
				var2 &= class31.method127(field830[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("ec.c(I)Z")
	public final boolean method334() {
		if (field830 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field830.length; var2++) {
			var1 &= class31.method127(field830[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("ec.a(Lub;B)V")
	public final void method335(class47 arg0) {
		if (field830 != null) {
			for (int var2 = 0; var2 < field830.length; var2++) {
				arg0.method284(0, field830[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIII)Leb;")
	public final class31 method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		class31 var8 = method337(arg1, arg6, arg0);
		if (var8 == null) {
			return null;
		}

		if (field841 || field842) {
			var8 = new class31(field841, var8, field842);
		}

		if (field841) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field487; var10++) {
				int var11 = var8.field488[var10];
				int var12 = var8.field490[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field489[var10] += var15 - var9;
			}

			var8.method131();
		}

		return var8;
	}

	@ObfuscatedName("ec.a(IIII)Leb;")
	public final class31 method337(int arg0, int arg1, int arg2) {
		class31 var4 = null;
		long var5;
		if (field831 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field829 << 6) + arg0);
			class31 var7 = (class31) field867.method101(var5);
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

				var4 = (class31) field866.method101(var11);
				if (var4 == null) {
					var4 = class31.method126(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method141();
					}

					field866.method102(var11, var4);
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
				if (field831[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field829 << 6) + (var12 << 3) + arg0);
			class31 var14 = (class31) field867.method101(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field830[var12];
			boolean var16 = field851 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (class31) field866.method101(var15);
			if (var4 == null) {
				var4 = class31.method126(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method141();
				}

				field866.method102(var15, var4);
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

		class31 var19 = new class31(arg0 == 0 && arg1 == -1 && !var17 && !var18, field834 == null, class7.method48(arg1), var4);
		if (arg1 != -1) {
			var19.method133();
			var19.method134(arg1);
			var19.field519 = null;
			var19.field518 = null;
		}

		while (arg0-- > 0) {
			var19.method137();
		}

		if (field834 != null) {
			for (int var20 = 0; var20 < field834.length; var20++) {
				var19.method140(field834[var20], field835[var20]);
			}
		}

		if (var17) {
			var19.method142(field855, field853, field854);
		}

		if (var18) {
			var19.method139(field858, field857, field856);
		}

		var19.method143(field846 + 64, field847 * 5 + 768, -50, -10, -50, !field842);

		if (field862 == 1) {
			var19.field515 = var19.field359;
		}

		field867.method102(var5, var19);
		return var19;
	}

	@ObfuscatedName("ec.d(I)Lec;")
	public final class57 method338() {
		int var1 = -1;
		if (field864 != -1) {
			class69 var2 = class69.field1031[field864];
			int var3 = var2.field1033;
			int var4 = var2.field1034;
			int var5 = var2.field1035;
			int var6 = client.field1343[var5 - var4];
			var1 = field821.field1073[var3] >> var4 & var6;
		} else if (field865 != -1) {
			var1 = field821.field1073[field865];
		}

		if (var1 >= 0 && var1 < field863.length && field863[var1] != -1) {
			return method330(field863[var1]);
		}

		return null;
	}
}
