package deob;

@ObfuscatedName("ec")
public final class class57 {

	@ObfuscatedName("ec.d")
	public static int field816;

	@ObfuscatedName("ec.e")
	public static int[] field817;

	@ObfuscatedName("ec.f")
	public static class38 field818;

	@ObfuscatedName("ec.g")
	public static class57[] field819;

	@ObfuscatedName("ec.h")
	public static int field820;

	@ObfuscatedName("ec.i")
	public static class31[] field821 = new class31[4];

	@ObfuscatedName("ec.j")
	public int field822 = -1;

	@ObfuscatedName("ec.k")
	public int[] field823;

	@ObfuscatedName("ec.l")
	public int[] field824;

	@ObfuscatedName("ec.m")
	public String field825;

	@ObfuscatedName("ec.n")
	public byte[] field826;

	@ObfuscatedName("ec.o")
	public int[] field827;

	@ObfuscatedName("ec.p")
	public int[] field828;

	@ObfuscatedName("ec.q")
	public int field829;

	@ObfuscatedName("ec.r")
	public int field830;

	@ObfuscatedName("ec.s")
	public boolean field831;

	@ObfuscatedName("ec.t")
	public boolean field832;

	@ObfuscatedName("ec.u")
	public boolean field833;

	@ObfuscatedName("ec.v")
	public boolean field834;

	@ObfuscatedName("ec.w")
	public boolean field835;

	@ObfuscatedName("ec.x")
	public boolean field836;

	@ObfuscatedName("ec.y")
	public int field837;

	@ObfuscatedName("ec.z")
	public int field838;

	@ObfuscatedName("ec.R")
	public static class19 field856 = new class19(500);

	@ObfuscatedName("ec.S")
	public static class19 field857 = new class19(30);

	@ObfuscatedName("ec.A")
	public byte field839;

	@ObfuscatedName("ec.B")
	public byte field840;

	@ObfuscatedName("ec.D")
	public int field842;

	@ObfuscatedName("ec.E")
	public int field843;

	@ObfuscatedName("ec.H")
	public int field846;

	@ObfuscatedName("ec.I")
	public int field847;

	@ObfuscatedName("ec.J")
	public int field848;

	@ObfuscatedName("ec.K")
	public int field849;

	@ObfuscatedName("ec.L")
	public int field850;

	@ObfuscatedName("ec.M")
	public int field851;

	@ObfuscatedName("ec.N")
	public int field852;

	@ObfuscatedName("ec.Q")
	public int field855;

	@ObfuscatedName("ec.F")
	public boolean field844;

	@ObfuscatedName("ec.G")
	public boolean field845;

	@ObfuscatedName("ec.O")
	public boolean field853;

	@ObfuscatedName("ec.P")
	public boolean field854;

	@ObfuscatedName("ec.C")
	public String[] field841;

	@ObfuscatedName("ec.a(Lxb;)V")
	public static final void method324(class50 arg0) {
		field818 = new class38(arg0.method295("loc.dat", null));
		class38 var1 = new class38(arg0.method295("loc.idx", null));
		field816 = var1.method227();
		field817 = new int[field816];
		int var2 = 2;
		for (int var3 = 0; var3 < field816; var3++) {
			field817[var3] = var2;
			var2 += var1.method227();
		}

		field819 = new class57[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field819[var4] = new class57();
		}
	}

	@ObfuscatedName("ec.a(I)V")
	public static final void method325() {
		field856 = null;
		field857 = null;
		field817 = null;
		field819 = null;
		field818 = null;
	}

	@ObfuscatedName("ec.b(I)Lec;")
	public static final class57 method326(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field819[var1].field822 == arg0) {
				return field819[var1];
			}
		}

		field820 = (field820 + 1) % 10;
		class57 var2 = field819[field820];
		field818.field617 = field817[arg0];
		var2.field822 = arg0;
		var2.method327();
		var2.method328(field818);
		return var2;
	}

	@ObfuscatedName("ec.a()V")
	public final void method327() {
		field823 = null;
		field824 = null;
		field825 = null;
		field826 = null;
		field827 = null;
		field828 = null;
		field829 = 1;
		field830 = 1;
		field831 = true;
		field832 = true;
		field833 = false;
		field834 = false;
		field835 = false;
		field836 = false;
		field837 = -1;
		field838 = 16;
		field839 = 0;
		field840 = 0;
		field841 = null;
		field842 = -1;
		field843 = -1;
		field844 = false;
		field845 = true;
		field846 = 128;
		field847 = 128;
		field848 = 128;
		field852 = 0;
		field849 = 0;
		field850 = 0;
		field851 = 0;
		field853 = false;
		field854 = false;
		field855 = -1;
	}

	@ObfuscatedName("ec.a(Llb;B)V")
	public final void method328(class38 arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method225();
					if (var3 == 0) {
						if (var2 == -1) {
							field833 = false;
							if (field823 != null && (field824 == null || field824[0] == 10)) {
								field833 = true;
							}

							if (field841 != null) {
								field833 = true;
							}
						}

						if (field854) {
							field831 = false;
							field832 = false;
						}

						if (field855 == -1) {
							field855 = field831 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field825 = arg0.method232();
					} else if (var3 == 3) {
						field826 = arg0.method233();
					} else if (var3 == 5) {
						int var6 = arg0.method225();
						if (var6 > 0) {
							field824 = null;
							field823 = new int[var6];
							for (int var7 = 0; var7 < var6; var7++) {
								field823[var7] = arg0.method227();
							}
						}
					} else if (var3 == 14) {
						field829 = arg0.method225();
					} else if (var3 == 15) {
						field830 = arg0.method225();
					} else if (var3 == 17) {
						field831 = false;
					} else if (var3 == 18) {
						field832 = false;
					} else if (var3 == 19) {
						var2 = arg0.method225();
						if (var2 == 1) {
							field833 = true;
						}
					} else if (var3 == 21) {
						field834 = true;
					} else if (var3 == 22) {
						field835 = true;
					} else if (var3 == 23) {
						field836 = true;
					} else if (var3 == 24) {
						field837 = arg0.method227();
						if (field837 == 0xFFFF) {
							field837 = -1;
						}
					} else if (var3 == 28) {
						field838 = arg0.method225();
					} else if (var3 == 29) {
						field839 = arg0.method226();
					} else if (var3 == 39) {
						field840 = arg0.method226();
					} else if (var3 >= 30 && var3 < 39) {
						if (field841 == null) {
							field841 = new String[5];
						}

						field841[var3 - 30] = arg0.method232();
						if (field841[var3 - 30].equalsIgnoreCase("hidden")) {
							field841[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method225();
						field827 = new int[var8];
						field828 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field827[var9] = arg0.method227();
							field828[var9] = arg0.method227();
						}
					} else if (var3 == 60) {
						field842 = arg0.method227();
					} else if (var3 == 62) {
						field844 = true;
					} else if (var3 == 64) {
						field845 = false;
					} else if (var3 == 65) {
						field846 = arg0.method227();
					} else if (var3 == 66) {
						field847 = arg0.method227();
					} else if (var3 == 67) {
						field848 = arg0.method227();
					} else if (var3 == 68) {
						field843 = arg0.method227();
					} else if (var3 == 69) {
						field852 = arg0.method225();
					} else if (var3 == 70) {
						field849 = arg0.method228();
					} else if (var3 == 71) {
						field850 = arg0.method228();
					} else if (var3 == 72) {
						field851 = arg0.method228();
					} else if (var3 == 73) {
						field853 = true;
					} else if (var3 == 74) {
						field854 = true;
					} else if (var3 == 75) {
						field855 = arg0.method225();
					}
				}

				var4 = arg0.method225();
			} while (var4 <= 0);

			field824 = new int[var4];
			field823 = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field823[var5] = arg0.method227();
				field824[var5] = arg0.method225();
			}
		}
	}

	@ObfuscatedName("ec.a(ZI)Z")
	public final boolean method329(int arg0) {
		if (field824 != null) {
			for (int var4 = 0; var4 < field824.length; var4++) {
				if (field824[var4] == arg0) {
					return class31.method126(field823[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field823 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field823.length; var3++) {
				var2 &= class31.method126(field823[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("ec.c(I)Z")
	public final boolean method330() {
		if (field823 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field823.length; var2++) {
			var1 &= class31.method126(field823[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("ec.a(Lub;I)V")
	public final void method331(class47 arg0) {
		if (field823 != null) {
			for (int var2 = 0; var2 < field823.length; var2++) {
				arg0.method280(0, field823[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIII)Leb;")
	public final class31 method332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		class31 var8 = method333(arg6, arg1, arg0);
		if (var8 == null) {
			return null;
		}

		if (field834 || field835) {
			var8 = new class31(field835, var8, field834);
		}

		if (field834) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field483; var10++) {
				int var11 = var8.field484[var10];
				int var12 = var8.field486[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field485[var10] += var15 - var9;
			}

			var8.method130();
		}

		return var8;
	}

	@ObfuscatedName("ec.a(IIII)Leb;")
	public final class31 method333(int arg0, int arg1, int arg2) {
		class31 var4 = null;
		long var5;
		if (field824 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field822 << 6) + arg1);
			class31 var7 = (class31) field857.method101(var5);
			if (var7 != null) {
				return var7;
			}

			if (field823 == null) {
				return null;
			}

			boolean var8 = field844 ^ arg1 > 3;
			int var9 = field823.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field823[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (class31) field856.method101(var11);
				if (var4 == null) {
					var4 = class31.method125(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method140();
					}

					field856.method102(var4, var11);
				}

				if (var9 > 1) {
					field821[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new class31(var9, field821);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field824.length; var13++) {
				if (field824[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field822 << 6) + (var12 << 3) + arg1);
			class31 var14 = (class31) field857.method101(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field823[var12];
			boolean var16 = field844 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (class31) field856.method101(var15);
			if (var4 == null) {
				var4 = class31.method125(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method140();
				}

				field856.method102(var4, var15);
			}
		}

		boolean var17;
		if (field846 == 128 && field847 == 128 && field848 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field849 == 0 && field850 == 0 && field851 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		class31 var19 = new class31(arg1 == 0 && arg0 == -1 && !var17 && !var18, class7.method48(arg0), field827 == null, var4);
		if (arg0 != -1) {
			var19.method132();
			var19.method133(arg0);
			var19.field515 = null;
			var19.field514 = null;
		}

		while (arg1-- > 0) {
			var19.method136();
		}

		if (field827 != null) {
			for (int var20 = 0; var20 < field827.length; var20++) {
				var19.method139(field827[var20], field828[var20]);
			}
		}

		if (var17) {
			var19.method141(field848, field846, field847);
		}

		if (var18) {
			var19.method138(field849, field850, field851);
		}

		var19.method142(field839 + 64, field840 * 5 + 768, -50, -10, -50, !field835);

		if (field855 == 1) {
			var19.field511 = var19.field359;
		}

		field857.method102(var19, var5);
		return var19;
	}
}
