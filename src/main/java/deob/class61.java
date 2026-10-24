package deob;

@ObfuscatedName("ic")
public final class class61 {

	@ObfuscatedName("ic.i")
	public static int[] field854;

	@ObfuscatedName("ic.j")
	public static char[][] field855;

	@ObfuscatedName("ic.k")
	public static byte[][][] field856;

	@ObfuscatedName("ic.l")
	public static char[][] field857;

	@ObfuscatedName("ic.m")
	public static char[][] field858;

	@ObfuscatedName("ic.n")
	public static int[] field859;

	@ObfuscatedName("ic.o")
	public static final String[] field860 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

	@ObfuscatedName("ic.a(Ltb;)V")
	public static final void method286(class46 arg0) {
		class36 var1 = new class36(arg0.method225(null, "fragmentsenc.txt"));
		class36 var2 = new class36(arg0.method225(null, "badenc.txt"));
		class36 var3 = new class36(arg0.method225(null, "domainenc.txt"));
		class36 var4 = new class36(arg0.method225(null, "tldlist.txt"));
		method287(var1, var2, var3, var4);
	}

	@ObfuscatedName("ic.a(Ljb;Ljb;Ljb;Ljb;)V")
	public static final void method287(class36 arg0, class36 arg1, class36 arg2, class36 arg3) {
		method289(arg1);
		method290(arg2);
		method291(arg0);
		method288(arg3);
	}

	@ObfuscatedName("ic.a(ZLjb;)V")
	public static final void method288(class36 arg0) {
		int var1 = arg0.method190();
		field858 = new char[var1][];
		field859 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field859[var2] = arg0.method185();
			char[] var3 = new char[arg0.method185()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method185();
			}

			field858[var2] = var3;
		}
	}

	@ObfuscatedName("ic.a(BLjb;)V")
	public static final void method289(class36 arg0) {
		int var1 = arg0.method190();
		field855 = new char[var1][];
		field856 = new byte[var1][][];
		method292(arg0, field856, field855);
	}

	@ObfuscatedName("ic.a(ILjb;)V")
	public static final void method290(class36 arg0) {
		int var1 = arg0.method190();
		field857 = new char[var1][];
		method293(arg0, field857);
	}

	@ObfuscatedName("ic.b(ILjb;)V")
	public static final void method291(class36 arg0) {
		field854 = new int[arg0.method190()];
		for (int var1 = 0; var1 < field854.length; var1++) {
			field854[var1] = arg0.method187();
		}
	}

	@ObfuscatedName("ic.a(ILjb;[[[B[[C)V")
	public static final void method292(class36 arg0, byte[][][] arg1, char[][] arg2) {
		for (int var3 = 0; var3 < arg2.length; var3++) {
			char[] var4 = new char[arg0.method185()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg0.method185();
			}

			arg2[var3] = var4;
			byte[][] var6 = new byte[arg0.method185()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg0.method185();
				var6[var7][1] = (byte) arg0.method185();
			}

			if (var6.length > 0) {
				arg1[var3] = var6;
			}
		}
	}

	@ObfuscatedName("ic.a(Ljb;I[[C)V")
	public static final void method293(class36 arg0, char[][] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			char[] var3 = new char[arg0.method185()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method185();
			}

			arg1[var2] = var3;
		}
	}

	@ObfuscatedName("ic.a(B[C)V")
	public static final void method294(char[] arg0) {
		for (int var1 = 0; var1 < arg0.length; var1++) {
			if (!method295(arg0[var1])) {
				arg0[var1] = ' ';
			}
		}
	}

	@ObfuscatedName("ic.a(CI)Z")
	public static final boolean method295(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("ic.a(ILjava/lang/String;)Ljava/lang/String;")
	public static final String method296(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toLowerCase().toCharArray();
		method294(var3);
		method304(var3);
		method299(var3);
		method300(var3);
		method313(var3);

		for (int var4 = 0; var4 < field860.length; var4++) {
			int var5 = -1;
			while ((var5 = arg0.indexOf(field860[var4], var5 + 1)) != -1) {
				char[] var6 = field860[var4].toCharArray();
				for (int var7 = 0; var7 < var6.length; var7++) {
					var3[var5 + var7] = var6[var7];
				}
			}
		}

		method297(arg0.toCharArray(), var3);
		method298(var3);
		long var8 = System.currentTimeMillis();
		return (new String(var3)).trim();
	}

	@ObfuscatedName("ic.a([CB[C)V")
	public static final void method297(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (arg1[var2] != '*' && method321(arg0[var2])) {
				arg1[var2] = arg0[var2];
			}
		}
	}

	@ObfuscatedName("ic.a(Z[C)V")
	public static final void method298(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method318(var3)) {
				var1 = true;
			} else if (var1) {
				if (method320(var3)) {
					var1 = false;
				}
			} else if (method321(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("ic.a([CI)V")
	public static final void method299(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field855.length - 1; var2 >= 0; var2--) {
				method308(arg0, field855[var2], field856[var2]);
			}
		}
	}

	@ObfuscatedName("ic.b([CI)V")
	public static final void method300(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method308(var1, var2, null);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method308(var3, var4, null);

		for (int var5 = field857.length - 1; var5 >= 0; var5--) {
			method301(var3, var1, arg0, field857[var5]);
		}
	}

	@ObfuscatedName("ic.a([CZ[C[C[C)V")
	public static final void method301(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg3.length <= arg2.length) {
			boolean var4 = true;
			int var8;
			for (int var5 = 0; var5 <= arg2.length - arg3.length; var5 += var8) {
				int var6 = var5;
				int var7 = 0;
				var8 = 1;
				while (var6 < arg2.length) {
					int var12;
					boolean var9 = false;
					char var10 = arg2[var6];
					char var11 = 0;
					if (var6 + 1 < arg2.length) {
						var11 = arg2[var6 + 1];
					}

					if (var7 < arg3.length && (var12 = method310(arg3[var7], var11, var10)) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method310(arg3[var7 - 1], var11, var10)) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg3.length || !method316(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg3.length) {
					boolean var14 = false;
					int var15 = method302(var5, arg1, arg2);
					int var16 = method303(arg2, var6 - 1, arg0);
					if (var15 > 2 || var16 > 2) {
						var14 = true;
					}

					if (var14) {
						for (int var17 = var5; var17 < var6; var17++) {
							arg2[var17] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ic.a(II[C[C)I")
	public static final int method302(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		for (int var3 = arg0 - 1; var3 >= 0 && method316(arg2[var3]); var3--) {
			if (arg2[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method316(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method316(arg2[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("ic.a([CIZ[C)I")
	public static final int method303(char[] arg0, int arg1, char[] arg2) {
		if (arg1 + 1 == arg0.length) {
			return 2;
		}

		int var3 = arg1 + 1;
		while (var3 < arg0.length && method316(arg0[var3])) {
			if (arg0[var3] != '.' && arg0[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 + 1; var5 < arg0.length && method316(arg2[var5]); var5++) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method316(arg0[arg1 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("ic.a(I[C)V")
	public static final void method304(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method308(var1, var2, null);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method308(var3, var4, null);

		for (int var5 = 0; var5 < field858.length; var5++) {
			method305(var3, var1, field858[var5], field859[var5], arg0);
		}
	}

	@ObfuscatedName("ic.a([C[C[CII[C)V")
	public static final void method305(char[] arg0, char[] arg1, char[] arg2, int arg3, char[] arg4) {
		if (arg2.length <= arg4.length) {
			boolean var5 = true;
			int var9;
			for (int var6 = 0; var6 <= arg4.length - arg2.length; var6 += var9) {
				int var7 = var6;
				int var8 = 0;
				var9 = 1;
				while (var7 < arg4.length) {
					int var13;
					boolean var10 = false;
					char var11 = arg4[var7];
					char var12 = 0;
					if (var7 + 1 < arg4.length) {
						var12 = arg4[var7 + 1];
					}

					if (var8 < arg2.length && (var13 = method310(arg2[var8], var12, var11)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method310(arg2[var8 - 1], var12, var11)) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg2.length || !method316(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg2.length) {
					boolean var15 = false;
					int var16 = method306(var6, arg4, arg1);
					int var17 = method307(arg4, var7 - 1, arg0);
					if (arg3 == 1 && var16 > 0 && var17 > 0) {
						var15 = true;
					}

					if (arg3 == 2 && (var16 > 2 && var17 > 0 || var16 > 0 && var17 > 2)) {
						var15 = true;
					}

					if (arg3 == 3 && var16 > 0 && var17 > 2) {
						var15 = true;
					}

					if (var15) {
						int var18 = var6;
						int var19 = var7 - 1;

						if (var16 > 2) {
							if (var16 == 4) {
								boolean var20 = false;
								for (int var21 = var6 - 1; var21 >= 0; var21--) {
									if (var20) {
										if (arg1[var21] != '*') {
											break;
										}

										var18 = var21;
									} else if (arg1[var21] == '*') {
										var18 = var21;
										var20 = true;
									}
								}
							}

							boolean var22 = false;
							for (int var23 = var18 - 1; var23 >= 0; var23--) {
								if (var22) {
									if (method316(arg4[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method316(arg4[var23])) {
									var22 = true;
									var18 = var23;
								}
							}
						}

						if (var17 > 2) {
							if (var17 == 4) {
								boolean var24 = false;
								for (int var25 = var19 + 1; var25 < arg4.length; var25++) {
									if (var24) {
										if (arg0[var25] != '*') {
											break;
										}

										var19 = var25;
									} else if (arg0[var25] == '*') {
										var19 = var25;
										var24 = true;
									}
								}
							}

							boolean var26 = false;
							for (int var27 = var19 + 1; var27 < arg4.length; var27++) {
								if (var26) {
									if (method316(arg4[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method316(arg4[var27])) {
									var26 = true;
									var19 = var27;
								}
							}
						}

						for (int var28 = var18; var28 <= var19; var28++) {
							arg4[var28] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ic.a(BI[C[C)I")
	public static final int method306(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		int var3 = arg0 - 1;
		while (var3 >= 0 && method316(arg1[var3])) {
			if (arg1[var3] != ',' && arg1[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method316(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method316(arg1[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("ic.a([CII[C)I")
	public static final int method307(char[] arg0, int arg1, char[] arg2) {
		if (arg1 + 1 == arg0.length) {
			return 2;
		}

		int var3 = arg1 + 1;
		while (var3 < arg0.length && method316(arg0[var3])) {
			if (arg0[var3] != '\\' && arg0[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 + 1; var5 < arg0.length && method316(arg2[var5]); var5++) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method316(arg0[arg1 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("ic.a([C[CI[[B)V")
	public static final void method308(char[] arg0, char[] arg1, byte[][] arg2) {
		if (arg1.length <= arg0.length) {
			boolean var3 = true;
			int var8;
			for (int var4 = 0; var4 <= arg0.length - arg1.length; var4 += var8) {
				int var5 = var4;
				int var6 = 0;
				int var7 = 0;
				var8 = 1;
				boolean var9 = false;
				while (var5 < arg0.length) {
					int var13;
					boolean var10 = false;
					char var11 = arg0[var5];
					char var12 = 0;
					if (var5 + 1 < arg0.length) {
						var12 = arg0[var5 + 1];
					}

					if (var6 < arg1.length && (var13 = method311(var11, arg1[var6], var12)) > 0) {
						var5 += var13;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var14;
						if ((var14 = method311(var11, arg1[var6 - 1], var12)) > 0) {
							var5 += var14;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg1.length || !method317(var11)) {
								break;
							}

							if (method316(var11) && var11 != '\'') {
								var9 = true;
							}

							var5++;
							var7++;
							if (var7 * 100 / (var5 - var4) > 90) {
								break;
							}
						}
					}
				}

				if (var6 >= arg1.length) {
					boolean var15 = true;
					if (var9) {
						boolean var20 = false;
						boolean var21 = false;

						if (var4 - 1 < 0 || method316(arg0[var4 - 1]) && arg0[var4 - 1] != '\'') {
							var20 = true;
						}

						if (var5 >= arg0.length || method316(arg0[var5]) && arg0[var5] != '\'') {
							var21 = true;
						}

						if (!var20 || !var21) {
							boolean var22 = false;
							int var23 = var4 - 2;
							if (var20) {
								var23 = var4;
							}

							while (!var22 && var23 < var5) {
								if (var23 >= 0 && (!method316(arg0[var23]) || arg0[var23] == '\'')) {
									char[] var24 = new char[3];
									int var25;
									for (var25 = 0; var25 < 3 && var23 + var25 < arg0.length && (!method316(arg0[var23 + var25]) || arg0[var23 + var25] == '\''); var25++) {
										var24[var25] = arg0[var23 + var25];
									}

									boolean var26 = true;
									if (var25 == 0) {
										var26 = false;
									}

									if (var25 < 3 && var23 - 1 >= 0 && (!method316(arg0[var23 - 1]) || arg0[var23 - 1] == '\'')) {
										var26 = false;
									}

									if (var26 && !method322(var24)) {
										var22 = true;
									}
								}

								var23++;
							}

							if (!var22) {
								var15 = false;
							}
						}
					} else {
						char var16 = ' ';
						if (var4 - 1 >= 0) {
							var16 = arg0[var4 - 1];
						}

						char var17 = ' ';
						if (var5 < arg0.length) {
							var17 = arg0[var5];
						}

						byte var18 = method312(var16);
						byte var19 = method312(var17);
						if (arg2 != null && method309(arg2, var19, var18)) {
							var15 = false;
						}
					}

					if (var15) {
						int var27 = 0;
						for (int var28 = var4; var28 < var5; var28++) {
							if (method319(arg0[var28])) {
								var27++;
							}
						}

						if (var27 * 100 / (var5 - var4) <= 50) {
							for (int var29 = var4; var29 < var5; var29++) {
								arg0[var29] = '*';
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ic.a([[BBBB)Z")
	public static final boolean method309(byte[][] arg0, byte arg1, byte arg2) {
		int var3 = 0;
		if (arg0[var3][0] == arg2 && arg0[var3][1] == arg1) {
			return true;
		}

		int var4 = arg0.length - 1;
		if (arg0[var4][0] == arg2 && arg0[var4][1] == arg1) {
			return true;
		}

		do {
			int var5 = (var3 + var4) / 2;
			if (arg0[var5][0] == arg2 && arg0[var5][1] == arg1) {
				return true;
			}

			if (arg2 < arg0[var5][0] || arg0[var5][0] == arg2 && arg1 < arg0[var5][1]) {
				var4 = var5;
			} else {
				var3 = var5;
			}
		} while (var3 != var4 && var3 + 1 != var4);

		return false;
	}

	@ObfuscatedName("ic.a(ZCCC)I")
	public static final int method310(char arg0, char arg1, char arg2) {
		if (arg0 == arg2) {
			return 1;
		}

		if (arg0 == 'o' && arg2 == '0') {
			return 1;
		}

		if (arg0 == 'o' && arg2 == '(' && arg1 == ')') {
			return 2;
		}

		if (arg0 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
			return 1;
		}

		if (arg0 == 'e' && arg2 == '€') {
			return 1;
		}

		if (arg0 == 's' && arg2 == '$') {
			return 1;
		}

		if (arg0 == 'l' && arg2 == 'i') {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("ic.a(CCIC)I")
	public static final int method311(char arg0, char arg1, char arg2) {
		if (arg0 == arg1) {
			return 1;
		}

		if (arg1 >= 'a' && arg1 <= 'm') {
			if (arg1 == 'a') {
				if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
					if (arg0 == '/' && arg2 == '\\') {
						return 2;
					}

					return 0;
				}

				return 1;
			}

			if (arg1 == 'b') {
				if (arg0 == '1' && arg2 == '3') {
					return 2;
				}

				return 0;
			}

			if (arg1 == 'c') {
				if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'd') {
				return 0;
			}

			if (arg1 == 'e') {
				if (arg0 != '3' && arg0 != '€') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'f') {
				if (arg0 == 'p' && arg2 == 'h') {
					return 2;
				}

				if (arg0 == '£') {
					return 1;
				}

				return 0;
			}

			if (arg1 == 'g') {
				if (arg0 != '9' && arg0 != '6') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'h') {
				if (arg0 == '#') {
					return 1;
				}

				return 0;
			}

			if (arg1 == 'i') {
				if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'j') {
				return 0;
			}

			if (arg1 == 'k') {
				return 0;
			}

			if (arg1 == 'l') {
				if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'm') {
				return 0;
			}
		}

		if (arg1 >= 'n' && arg1 <= 'z') {
			if (arg1 == 'n') {
				return 0;
			}

			if (arg1 == 'o') {
				if (arg0 != '0' && arg0 != '*') {
					if ((arg0 != '(' || arg2 != ')') && (arg0 != '[' || arg2 != ']') && (arg0 != '{' || arg2 != '}') && (arg0 != '<' || arg2 != '>')) {
						return 0;
					}

					return 2;
				}

				return 1;
			}

			if (arg1 == 'p') {
				return 0;
			}

			if (arg1 == 'q') {
				return 0;
			}

			if (arg1 == 'r') {
				return 0;
			}

			if (arg1 == 's') {
				if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 't') {
				if (arg0 == '7') {
					return 1;
				}

				return 0;
			}

			if (arg1 == 'u') {
				if (arg0 == 'v') {
					return 1;
				}

				if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg1 == 'v') {
				if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg1 == 'w') {
				if (arg0 == 'v' && arg2 == 'v') {
					return 2;
				}

				return 0;
			}

			if (arg1 == 'x') {
				if ((arg0 != ')' || arg2 != '(') && (arg0 != '}' || arg2 != '{') && (arg0 != ']' || arg2 != '[') && (arg0 != '>' || arg2 != '<')) {
					return 0;
				}

				return 2;
			}

			if (arg1 == 'y') {
				return 0;
			}

			if (arg1 == 'z') {
				return 0;
			}
		}

		if (arg1 >= '0' && arg1 <= '9') {
			if (arg1 != '0') {
				if (arg1 == '1') {
					if (arg0 == 'l') {
						return 1;
					}

					return 0;
				}

				return 0;
			}

			if (arg0 != 'o' && arg0 != 'O') {
				if (arg0 == '(' && arg2 == ')' || arg0 == '{' && arg2 == '}' || arg0 == '[' && arg2 == ']') {
					return 2;
				}

				return 0;
			}

			return 1;
		}

		if (arg1 == ',') {
			if (arg0 == '.') {
				return 1;
			}

			return 0;
		}

		if (arg1 == '.') {
			if (arg0 == ',') {
				return 1;
			}

			return 0;
		}

		if (arg1 == '!') {
			if (arg0 == 'i') {
				return 1;
			}

			return 0;
		}

		return 0;
	}

	@ObfuscatedName("ic.a(BC)B")
	public static final byte method312(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return (byte) (arg0 + 1 - 'a');
		}

		if (arg0 == '\'') {
			return 28;
		}

		if (arg0 >= '0' && arg0 <= '9') {
			return (byte) (arg0 + 29 - '0');
		}

		return 27;
	}

	@ObfuscatedName("ic.c([CI)V")
	public static final void method313(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method314(arg0, var2)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method316(arg0[var6]) && !method317(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method315(arg0, var7);
				int var8 = 0;
				for (int var9 = var7; var9 < var2; var9++) {
					var8 = var8 * 10 + arg0[var9] - 48;
				}

				if (var8 <= 255 && var2 - var7 <= 8) {
					var3++;
				} else {
					var3 = 0;
				}
			} while (var3 != 4);

			for (int var10 = var4; var10 < var2; var10++) {
				arg0[var10] = '*';
			}

			var3 = 0;
		}
	}

	@ObfuscatedName("ic.a([CII)I")
	public static final int method314(char[] arg0, int arg1) {
		for (int var2 = arg1; var2 < arg0.length && var2 >= 0; var2++) {
			if (arg0[var2] >= '0' && arg0[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("ic.a(I[CI)I")
	public static final int method315(char[] arg0, int arg1) {
		int var2 = arg1;
		while (var2 < arg0.length && var2 >= 0) {
			if (arg0[var2] >= '0' && arg0[var2] <= '9') {
				var2++;
				continue;
			}

			return var2;
		}

		return arg0.length;
	}

	@ObfuscatedName("ic.a(ZC)Z")
	public static final boolean method316(char arg0) {
		if (!method318(arg0) && !method319(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ic.a(IC)Z")
	public static final boolean method317(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("ic.b(CI)Z")
	public static final boolean method318(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ic.c(CI)Z")
	public static final boolean method319(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ic.b(BC)Z")
	public static final boolean method320(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ic.a(CB)Z")
	public static final boolean method321(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ic.d([CI)Z")
	public static final boolean method322(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method319(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method323(arg0);
		int var4 = 0;
		int var5 = field854.length - 1;
		if (field854[var4] != var3 && field854[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field854[var6] == var3) {
					return true;
				}

				if (var3 < field854[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("ic.b(B[C)I")
	public static final int method323(char[] arg0) {
		if (arg0.length > 6) {
			return 0;
		}

		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[arg0.length - var2 - 1];
			if (var3 >= 'a' && var3 <= 'z') {
				var1 = var1 * 38 + var3 + 1 - 'a';
			} else if (var3 == '\'') {
				var1 = var1 * 38 + 27;
			} else if (var3 >= '0' && var3 <= '9') {
				var1 = var1 * 38 + var3 + 28 - '0';
			} else if (var3 != 0) {
				return 0;
			}
		}

		return var1;
	}
}
