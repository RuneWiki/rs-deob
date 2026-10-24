package deob;

@ObfuscatedName("ec")
public final class class57 {

	@ObfuscatedName("ec.f")
	public static int field814;

	@ObfuscatedName("ec.g")
	public static int[] field815;

	@ObfuscatedName("ec.h")
	public static class38 field816;

	@ObfuscatedName("ec.i")
	public static class57[] field817;

	@ObfuscatedName("ec.j")
	public static int field818;

	@ObfuscatedName("ec.k")
	public static class31[] field819 = new class31[4];

	@ObfuscatedName("ec.l")
	public int field820 = -1;

	@ObfuscatedName("ec.m")
	public int[] field821;

	@ObfuscatedName("ec.n")
	public int[] field822;

	@ObfuscatedName("ec.o")
	public String field823;

	@ObfuscatedName("ec.p")
	public byte[] field824;

	@ObfuscatedName("ec.q")
	public int[] field825;

	@ObfuscatedName("ec.r")
	public int[] field826;

	@ObfuscatedName("ec.s")
	public int field827;

	@ObfuscatedName("ec.t")
	public int field828;

	@ObfuscatedName("ec.u")
	public boolean field829;

	@ObfuscatedName("ec.v")
	public boolean field830;

	@ObfuscatedName("ec.w")
	public boolean field831;

	@ObfuscatedName("ec.x")
	public boolean field832;

	@ObfuscatedName("ec.y")
	public boolean field833;

	@ObfuscatedName("ec.z")
	public boolean field834;

	@ObfuscatedName("ec.T")
	public static class19 field854 = new class19(500);

	@ObfuscatedName("ec.U")
	public static class19 field855 = new class19(30);

	@ObfuscatedName("ec.C")
	public byte field837;

	@ObfuscatedName("ec.D")
	public byte field838;

	@ObfuscatedName("ec.A")
	public int field835;

	@ObfuscatedName("ec.B")
	public int field836;

	@ObfuscatedName("ec.F")
	public int field840;

	@ObfuscatedName("ec.G")
	public int field841;

	@ObfuscatedName("ec.J")
	public int field844;

	@ObfuscatedName("ec.K")
	public int field845;

	@ObfuscatedName("ec.L")
	public int field846;

	@ObfuscatedName("ec.M")
	public int field847;

	@ObfuscatedName("ec.N")
	public int field848;

	@ObfuscatedName("ec.O")
	public int field849;

	@ObfuscatedName("ec.P")
	public int field850;

	@ObfuscatedName("ec.S")
	public int field853;

	@ObfuscatedName("ec.H")
	public boolean field842;

	@ObfuscatedName("ec.I")
	public boolean field843;

	@ObfuscatedName("ec.Q")
	public boolean field851;

	@ObfuscatedName("ec.R")
	public boolean field852;

	@ObfuscatedName("ec.E")
	public String[] field839;

	@ObfuscatedName("ec.a(Lxb;)V")
	public static final void method323(class50 arg0) {
		field816 = new class38(arg0.method294("loc.dat", null));
		class38 var1 = new class38(arg0.method294("loc.idx", null));
		field814 = var1.method226();
		field815 = new int[field814];
		int var2 = 2;
		for (int var3 = 0; var3 < field814; var3++) {
			field815[var3] = var2;
			var2 += var1.method226();
		}

		field817 = new class57[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field817[var4] = new class57();
		}
	}

	@ObfuscatedName("ec.a(B)V")
	public static final void method324() {
		field854 = null;
		field855 = null;
		field815 = null;
		field817 = null;
		field816 = null;
	}

	@ObfuscatedName("ec.a(I)Lec;")
	public static final class57 method325(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field817[var1].field820 == arg0) {
				return field817[var1];
			}
		}

		field818 = (field818 + 1) % 10;
		class57 var2 = field817[field818];
		field816.field616 = field815[arg0];
		var2.field820 = arg0;
		var2.method326();
		var2.method327(field816);
		return var2;
	}

	@ObfuscatedName("ec.a()V")
	public final void method326() {
		field821 = null;
		field822 = null;
		field823 = null;
		field824 = null;
		field825 = null;
		field826 = null;
		field827 = 1;
		field828 = 1;
		field829 = true;
		field830 = true;
		field831 = false;
		field832 = false;
		field833 = false;
		field834 = false;
		field835 = -1;
		field836 = 16;
		field837 = 0;
		field838 = 0;
		field839 = null;
		field840 = -1;
		field841 = -1;
		field842 = false;
		field843 = true;
		field844 = 128;
		field845 = 128;
		field846 = 128;
		field850 = 0;
		field847 = 0;
		field848 = 0;
		field849 = 0;
		field851 = false;
		field852 = false;
		field853 = -1;
	}

	@ObfuscatedName("ec.a(Llb;I)V")
	public final void method327(class38 arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method224();
					if (var3 == 0) {
						if (var2 == -1) {
							field831 = false;
							if (field821 != null && (field822 == null || field822[0] == 10)) {
								field831 = true;
							}

							if (field839 != null) {
								field831 = true;
							}
						}

						if (field852) {
							field829 = false;
							field830 = false;
						}

						if (field853 == -1) {
							field853 = field829 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field823 = arg0.method231();
					} else if (var3 == 3) {
						field824 = arg0.method232();
					} else if (var3 == 5) {
						int var6 = arg0.method224();
						if (var6 > 0) {
							field822 = null;
							field821 = new int[var6];
							for (int var7 = 0; var7 < var6; var7++) {
								field821[var7] = arg0.method226();
							}
						}
					} else if (var3 == 14) {
						field827 = arg0.method224();
					} else if (var3 == 15) {
						field828 = arg0.method224();
					} else if (var3 == 17) {
						field829 = false;
					} else if (var3 == 18) {
						field830 = false;
					} else if (var3 == 19) {
						var2 = arg0.method224();
						if (var2 == 1) {
							field831 = true;
						}
					} else if (var3 == 21) {
						field832 = true;
					} else if (var3 == 22) {
						field833 = true;
					} else if (var3 == 23) {
						field834 = true;
					} else if (var3 == 24) {
						field835 = arg0.method226();
						if (field835 == 0xFFFF) {
							field835 = -1;
						}
					} else if (var3 == 28) {
						field836 = arg0.method224();
					} else if (var3 == 29) {
						field837 = arg0.method225();
					} else if (var3 == 39) {
						field838 = arg0.method225();
					} else if (var3 >= 30 && var3 < 39) {
						if (field839 == null) {
							field839 = new String[5];
						}

						field839[var3 - 30] = arg0.method231();
						if (field839[var3 - 30].equalsIgnoreCase("hidden")) {
							field839[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method224();
						field825 = new int[var8];
						field826 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field825[var9] = arg0.method226();
							field826[var9] = arg0.method226();
						}
					} else if (var3 == 60) {
						field840 = arg0.method226();
					} else if (var3 == 62) {
						field842 = true;
					} else if (var3 == 64) {
						field843 = false;
					} else if (var3 == 65) {
						field844 = arg0.method226();
					} else if (var3 == 66) {
						field845 = arg0.method226();
					} else if (var3 == 67) {
						field846 = arg0.method226();
					} else if (var3 == 68) {
						field841 = arg0.method226();
					} else if (var3 == 69) {
						field850 = arg0.method224();
					} else if (var3 == 70) {
						field847 = arg0.method227();
					} else if (var3 == 71) {
						field848 = arg0.method227();
					} else if (var3 == 72) {
						field849 = arg0.method227();
					} else if (var3 == 73) {
						field851 = true;
					} else if (var3 == 74) {
						field852 = true;
					} else if (var3 == 75) {
						field853 = arg0.method224();
					}
				}

				var4 = arg0.method224();
			} while (var4 <= 0);

			field822 = new int[var4];
			field821 = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field821[var5] = arg0.method226();
				field822[var5] = arg0.method224();
			}
		}
	}

	@ObfuscatedName("ec.a(BI)Z")
	public final boolean method328(int arg0) {
		if (field822 != null) {
			for (int var4 = 0; var4 < field822.length; var4++) {
				if (field822[var4] == arg0) {
					return class31.method126(field821[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field821 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field821.length; var3++) {
				var2 &= class31.method126(field821[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("ec.b(I)Z")
	public final boolean method329() {
		if (field821 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field821.length; var2++) {
			var1 &= class31.method126(field821[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("ec.a(ILub;)V")
	public final void method330(class47 arg0) {
		if (field821 != null) {
			for (int var2 = 0; var2 < field821.length; var2++) {
				arg0.method279(0, field821[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIII)Leb;")
	public final class31 method331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		class31 var8 = method332(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}

		if (field832 || field833) {
			var8 = new class31(field833, var8, field832);
		}

		if (field832) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field482; var10++) {
				int var11 = var8.field483[var10];
				int var12 = var8.field485[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field484[var10] += var15 - var9;
			}

			var8.method130();
		}

		return var8;
	}

	@ObfuscatedName("ec.a(IIII)Leb;")
	public final class31 method332(int arg0, int arg1, int arg2) {
		class31 var4 = null;
		long var5;
		if (field822 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field820 << 6) + arg1);
			class31 var7 = (class31) field855.method101(var5);
			if (var7 != null) {
				return var7;
			}

			if (field821 == null) {
				return null;
			}

			boolean var8 = field842 ^ arg1 > 3;
			int var9 = field821.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field821[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (class31) field854.method101(var11);
				if (var4 == null) {
					var4 = class31.method125(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method140();
					}

					field854.method102(var11, var4);
				}

				if (var9 > 1) {
					field819[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new class31(var9, field819);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field822.length; var13++) {
				if (field822[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field820 << 6) + (var12 << 3) + arg1);
			class31 var14 = (class31) field855.method101(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field821[var12];
			boolean var16 = field842 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (class31) field854.method101(var15);
			if (var4 == null) {
				var4 = class31.method125(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method140();
				}

				field854.method102(var15, var4);
			}
		}

		boolean var17;
		if (field844 == 128 && field845 == 128 && field846 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field847 == 0 && field848 == 0 && field849 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		class31 var19 = new class31(arg1 == 0 && arg2 == -1 && !var17 && !var18, field825 == null, var4, class7.method48(arg2));
		if (arg2 != -1) {
			var19.method132();
			var19.method133(arg2);
			var19.field514 = null;
			var19.field513 = null;
		}

		while (arg1-- > 0) {
			var19.method136();
		}

		if (field825 != null) {
			for (int var20 = 0; var20 < field825.length; var20++) {
				var19.method139(field825[var20], field826[var20]);
			}
		}

		if (var17) {
			var19.method141(field846, field845, field844);
		}

		if (var18) {
			var19.method138(field847, field848, field849);
		}

		var19.method142(field837 + 64, field838 * 5 + 768, -50, -10, -50, !field833);

		if (field853 == 1) {
			var19.field510 = var19.field359;
		}

		field855.method102(var5, var19);
		return var19;
	}
}
