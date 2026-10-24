package deob;

@ObfuscatedName("ec")
public final class class57 {

	@ObfuscatedName("ec.e")
	public static client field821;

	@ObfuscatedName("ec.f")
	public static int field822;

	@ObfuscatedName("ec.g")
	public static int[] field823;

	@ObfuscatedName("ec.h")
	public static class38 field824;

	@ObfuscatedName("ec.i")
	public static class57[] field825;

	@ObfuscatedName("ec.j")
	public static int field826;

	@ObfuscatedName("ec.k")
	public static class31[] field827 = new class31[4];

	@ObfuscatedName("ec.l")
	public int field828 = -1;

	@ObfuscatedName("ec.m")
	public int[] field829;

	@ObfuscatedName("ec.n")
	public int[] field830;

	@ObfuscatedName("ec.o")
	public String field831;

	@ObfuscatedName("ec.p")
	public byte[] field832;

	@ObfuscatedName("ec.q")
	public int[] field833;

	@ObfuscatedName("ec.r")
	public int[] field834;

	@ObfuscatedName("ec.s")
	public int field835;

	@ObfuscatedName("ec.t")
	public int field836;

	@ObfuscatedName("ec.u")
	public boolean field837;

	@ObfuscatedName("ec.v")
	public boolean field838;

	@ObfuscatedName("ec.w")
	public boolean field839;

	@ObfuscatedName("ec.x")
	public boolean field840;

	@ObfuscatedName("ec.y")
	public boolean field841;

	@ObfuscatedName("ec.z")
	public boolean field842;

	@ObfuscatedName("ec.W")
	public static class19 field865 = new class19(500);

	@ObfuscatedName("ec.X")
	public static class19 field866 = new class19(30);

	@ObfuscatedName("ec.C")
	public byte field845;

	@ObfuscatedName("ec.D")
	public byte field846;

	@ObfuscatedName("ec.A")
	public int field843;

	@ObfuscatedName("ec.B")
	public int field844;

	@ObfuscatedName("ec.F")
	public int field848;

	@ObfuscatedName("ec.G")
	public int field849;

	@ObfuscatedName("ec.J")
	public int field852;

	@ObfuscatedName("ec.K")
	public int field853;

	@ObfuscatedName("ec.L")
	public int field854;

	@ObfuscatedName("ec.M")
	public int field855;

	@ObfuscatedName("ec.N")
	public int field856;

	@ObfuscatedName("ec.O")
	public int field857;

	@ObfuscatedName("ec.P")
	public int field858;

	@ObfuscatedName("ec.S")
	public int field861;

	@ObfuscatedName("ec.U")
	public int field863;

	@ObfuscatedName("ec.V")
	public int field864;

	@ObfuscatedName("ec.H")
	public boolean field850;

	@ObfuscatedName("ec.I")
	public boolean field851;

	@ObfuscatedName("ec.Q")
	public boolean field859;

	@ObfuscatedName("ec.R")
	public boolean field860;

	@ObfuscatedName("ec.T")
	public int[] field862;

	@ObfuscatedName("ec.E")
	public String[] field847;

	@ObfuscatedName("ec.a(Lxb;)V")
	public static final void method328(class50 arg0) {
		field824 = new class38(arg0.method299("loc.dat", null));
		class38 var1 = new class38(arg0.method299("loc.idx", null));
		field822 = var1.method231();
		field823 = new int[field822];
		int var2 = 2;
		for (int var3 = 0; var3 < field822; var3++) {
			field823[var3] = var2;
			var2 += var1.method231();
		}

		field825 = new class57[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field825[var4] = new class57();
		}
	}

	@ObfuscatedName("ec.a(I)V")
	public static final void method329() {
		field865 = null;
		field866 = null;
		field823 = null;
		field825 = null;
		field824 = null;
	}

	@ObfuscatedName("ec.b(I)Lec;")
	public static final class57 method330(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field825[var1].field828 == arg0) {
				return field825[var1];
			}
		}

		field826 = (field826 + 1) % 20;
		class57 var2 = field825[field826];
		field824.field621 = field823[arg0];
		var2.field828 = arg0;
		var2.method331();
		var2.method332(field824);
		return var2;
	}

	@ObfuscatedName("ec.a()V")
	public final void method331() {
		field829 = null;
		field830 = null;
		field831 = null;
		field832 = null;
		field833 = null;
		field834 = null;
		field835 = 1;
		field836 = 1;
		field837 = true;
		field838 = true;
		field839 = false;
		field840 = false;
		field841 = false;
		field842 = false;
		field843 = -1;
		field844 = 16;
		field845 = 0;
		field846 = 0;
		field847 = null;
		field848 = -1;
		field849 = -1;
		field850 = false;
		field851 = true;
		field852 = 128;
		field853 = 128;
		field854 = 128;
		field858 = 0;
		field855 = 0;
		field856 = 0;
		field857 = 0;
		field859 = false;
		field860 = false;
		field861 = -1;
		field863 = -1;
		field864 = -1;
		field862 = null;
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
							field839 = false;
							if (field829 != null && (field830 == null || field830[0] == 10)) {
								field839 = true;
							}

							if (field847 != null) {
								field839 = true;
							}
						}

						if (field860) {
							field837 = false;
							field838 = false;
						}

						if (field861 == -1) {
							field861 = field837 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field831 = arg0.method236();
					} else if (var3 == 3) {
						field832 = arg0.method237();
					} else if (var3 == 5) {
						int var6 = arg0.method229();
						if (var6 > 0) {
							field830 = null;
							field829 = new int[var6];
							for (int var7 = 0; var7 < var6; var7++) {
								field829[var7] = arg0.method231();
							}
						}
					} else if (var3 == 14) {
						field835 = arg0.method229();
					} else if (var3 == 15) {
						field836 = arg0.method229();
					} else if (var3 == 17) {
						field837 = false;
					} else if (var3 == 18) {
						field838 = false;
					} else if (var3 == 19) {
						var2 = arg0.method229();
						if (var2 == 1) {
							field839 = true;
						}
					} else if (var3 == 21) {
						field840 = true;
					} else if (var3 == 22) {
						field841 = true;
					} else if (var3 == 23) {
						field842 = true;
					} else if (var3 == 24) {
						field843 = arg0.method231();
						if (field843 == 0xFFFF) {
							field843 = -1;
						}
					} else if (var3 == 28) {
						field844 = arg0.method229();
					} else if (var3 == 29) {
						field845 = arg0.method230();
					} else if (var3 == 39) {
						field846 = arg0.method230();
					} else if (var3 >= 30 && var3 < 39) {
						if (field847 == null) {
							field847 = new String[5];
						}

						field847[var3 - 30] = arg0.method236();
						if (field847[var3 - 30].equalsIgnoreCase("hidden")) {
							field847[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method229();
						field833 = new int[var8];
						field834 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field833[var9] = arg0.method231();
							field834[var9] = arg0.method231();
						}
					} else if (var3 == 60) {
						field848 = arg0.method231();
					} else if (var3 == 62) {
						field850 = true;
					} else if (var3 == 64) {
						field851 = false;
					} else if (var3 == 65) {
						field852 = arg0.method231();
					} else if (var3 == 66) {
						field853 = arg0.method231();
					} else if (var3 == 67) {
						field854 = arg0.method231();
					} else if (var3 == 68) {
						field849 = arg0.method231();
					} else if (var3 == 69) {
						field858 = arg0.method229();
					} else if (var3 == 70) {
						field855 = arg0.method232();
					} else if (var3 == 71) {
						field856 = arg0.method232();
					} else if (var3 == 72) {
						field857 = arg0.method232();
					} else if (var3 == 73) {
						field859 = true;
					} else if (var3 == 74) {
						field860 = true;
					} else if (var3 == 75) {
						field861 = arg0.method229();
					} else if (var3 == 77) {
						field863 = arg0.method231();
						if (field863 == 0xFFFF) {
							field863 = -1;
						}

						field864 = arg0.method231();
						if (field864 == 0xFFFF) {
							field864 = -1;
						}

						int var10 = arg0.method229();
						field862 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field862[var11] = arg0.method231();
							if (field862[var11] == 0xFFFF) {
								field862[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method229();
			} while (var4 <= 0);

			field830 = new int[var4];
			field829 = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field829[var5] = arg0.method231();
				field830[var5] = arg0.method229();
			}
		}
	}

	@ObfuscatedName("ec.a(II)Z")
	public final boolean method333(int arg0) {
		if (field830 != null) {
			for (int var4 = 0; var4 < field830.length; var4++) {
				if (field830[var4] == arg0) {
					return class31.method127(field829[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field829 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field829.length; var3++) {
				var2 &= class31.method127(field829[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("ec.c(I)Z")
	public final boolean method334() {
		if (field829 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field829.length; var2++) {
			var1 &= class31.method127(field829[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("ec.a(ILub;)V")
	public final void method335(class47 arg0) {
		if (field829 != null) {
			for (int var2 = 0; var2 < field829.length; var2++) {
				arg0.method284(0, field829[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIII)Leb;")
	public final class31 method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		class31 var8 = method337(arg6, arg0, arg1);
		if (var8 == null) {
			return null;
		}

		if (field840 || field841) {
			var8 = new class31(field840, var8, field841);
		}

		if (field840) {
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

	@ObfuscatedName("ec.a(IIZI)Leb;")
	public final class31 method337(int arg0, int arg1, int arg2) {
		class31 var4 = null;
		long var5;
		if (field830 == null) {
			if (arg1 != 10) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field828 << 6) + arg2);
			class31 var7 = (class31) field866.method101(var5);
			if (var7 != null) {
				return var7;
			}

			if (field829 == null) {
				return null;
			}

			boolean var8 = field850 ^ arg2 > 3;
			int var9 = field829.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field829[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (class31) field865.method101(var11);
				if (var4 == null) {
					var4 = class31.method126(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method141();
					}

					field865.method102(var11, var4);
				}

				if (var9 > 1) {
					field827[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new class31(var9, field827);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field830.length; var13++) {
				if (field830[var13] == arg1) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field828 << 6) + (var12 << 3) + arg2);
			class31 var14 = (class31) field866.method101(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field829[var12];
			boolean var16 = field850 ^ arg2 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (class31) field865.method101(var15);
			if (var4 == null) {
				var4 = class31.method126(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method141();
				}

				field865.method102(var15, var4);
			}
		}

		boolean var17;
		if (field852 == 128 && field853 == 128 && field854 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field855 == 0 && field856 == 0 && field857 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		class31 var19 = new class31(class7.method48(arg0), arg2 == 0 && arg0 == -1 && !var17 && !var18, field833 == null, var4);
		if (arg0 != -1) {
			var19.method133();
			var19.method134(arg0);
			var19.field519 = null;
			var19.field518 = null;
		}

		while (arg2-- > 0) {
			var19.method137();
		}

		if (field833 != null) {
			for (int var20 = 0; var20 < field833.length; var20++) {
				var19.method140(field833[var20], field834[var20]);
			}
		}

		if (var17) {
			var19.method142(field852, field854, field853);
		}

		if (var18) {
			var19.method139(field856, field857, field855);
		}

		var19.method143(field845 + 64, field846 * 5 + 768, -50, -10, -50, !field841);

		if (field861 == 1) {
			var19.field515 = var19.field359;
		}

		field866.method102(var5, var19);
		return var19;
	}

	@ObfuscatedName("ec.a(B)Lec;")
	public final class57 method338() {
		int var1 = -1;
		if (field863 != -1) {
			class69 var2 = class69.field1030[field863];
			int var3 = var2.field1032;
			int var4 = var2.field1033;
			int var5 = var2.field1034;
			int var6 = client.field1166[var5 - var4];
			var1 = field821.field1202[var3] >> var4 & var6;
		} else if (field864 != -1) {
			var1 = field821.field1202[field864];
		}

		if (var1 >= 0 && var1 < field862.length && field862[var1] != -1) {
			return method330(field862[var1]);
		}

		return null;
	}
}
