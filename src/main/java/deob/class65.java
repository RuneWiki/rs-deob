package deob;

@ObfuscatedName("mc")
public final class class65 {

	@ObfuscatedName("mc.k")
	public static int[] field932;

	@ObfuscatedName("mc.l")
	public static char[][] field933;

	@ObfuscatedName("mc.m")
	public static byte[][][] field934;

	@ObfuscatedName("mc.n")
	public static char[][] field935;

	@ObfuscatedName("mc.o")
	public static char[][] field936;

	@ObfuscatedName("mc.p")
	public static int[] field937;

	@ObfuscatedName("mc.q")
	public static final String[] field938 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

	@ObfuscatedName("mc.a(Lub;)V")
	public static final void method324(class47 arg0) {
		class37 var1 = new class37(arg0.method249("fragmentsenc.txt", null));
		class37 var2 = new class37(arg0.method249("badenc.txt", null));
		class37 var3 = new class37(arg0.method249("domainenc.txt", null));
		class37 var4 = new class37(arg0.method249("tldlist.txt", null));
		method325(var1, var2, var3, var4);
	}

	@ObfuscatedName("mc.a(Lkb;Lkb;Lkb;Lkb;)V")
	public static final void method325(class37 arg0, class37 arg1, class37 arg2, class37 arg3) {
		method327(arg1);
		method328(arg2);
		method329(arg0);
		method326(arg3);
	}

	@ObfuscatedName("mc.a(Lkb;I)V")
	public static final void method326(class37 arg0) {
		int var1 = arg0.method213();
		field936 = new char[var1][];
		field937 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field937[var2] = arg0.method208();
			char[] var3 = new char[arg0.method208()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method208();
			}

			field936[var2] = var3;
		}
	}

	@ObfuscatedName("mc.b(Lkb;I)V")
	public static final void method327(class37 arg0) {
		int var1 = arg0.method213();
		field933 = new char[var1][];
		field934 = new byte[var1][][];
		method330(field934, field933, arg0);
	}

	@ObfuscatedName("mc.a(BLkb;)V")
	public static final void method328(class37 arg0) {
		int var1 = arg0.method213();
		field935 = new char[var1][];
		method331(field935, arg0);
	}

	@ObfuscatedName("mc.c(Lkb;I)V")
	public static final void method329(class37 arg0) {
		field932 = new int[arg0.method213()];
		for (int var1 = 0; var1 < field932.length; var1++) {
			field932[var1] = arg0.method210();
		}
	}

	@ObfuscatedName("mc.a([[[BI[[CLkb;)V")
	public static final void method330(byte[][][] arg0, char[][] arg1, class37 arg2) {
		for (int var3 = 0; var3 < arg1.length; var3++) {
			char[] var4 = new char[arg2.method208()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg2.method208();
			}

			arg1[var3] = var4;
			byte[][] var6 = new byte[arg2.method208()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg2.method208();
				var6[var7][1] = (byte) arg2.method208();
			}

			if (var6.length > 0) {
				arg0[var3] = var6;
			}
		}
	}

	@ObfuscatedName("mc.a(I[[CLkb;)V")
	public static final void method331(char[][] arg0, class37 arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char[] var3 = new char[arg1.method208()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg1.method208();
			}

			arg0[var2] = var3;
		}
	}

	@ObfuscatedName("mc.a(Z[C)V")
	public static final void method332(char[] arg0) {
		for (int var1 = 0; var1 < arg0.length; var1++) {
			if (!method333(arg0[var1])) {
				arg0[var1] = ' ';
			}
		}
	}

	@ObfuscatedName("mc.a(CI)Z")
	public static final boolean method333(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("mc.a(ZLjava/lang/String;)Ljava/lang/String;")
	public static final String method334(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toLowerCase().toCharArray();
		method332(var3);
		method342(var3);
		method337(var3);
		method338(var3);
		method351(var3);

		for (int var4 = 0; var4 < field938.length; var4++) {
			int var5 = -1;
			while ((var5 = arg0.indexOf(field938[var4], var5 + 1)) != -1) {
				char[] var6 = field938[var4].toCharArray();
				for (int var7 = 0; var7 < var6.length; var7++) {
					var3[var5 + var7] = var6[var7];
				}
			}
		}

		method335(var3, arg0.toCharArray());
		method336(var3);
		long var8 = System.currentTimeMillis();
		return (new String(var3)).trim();
	}

	@ObfuscatedName("mc.a([C[CI)V")
	public static final void method335(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			if (arg0[var2] != '*' && method359(arg1[var2])) {
				arg0[var2] = arg1[var2];
			}
		}
	}

	@ObfuscatedName("mc.a([CI)V")
	public static final void method336(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method356(var3)) {
				var1 = true;
			} else if (var1) {
				if (method358(var3)) {
					var1 = false;
				}
			} else if (method359(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("mc.a([CZ)V")
	public static final void method337(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field933.length - 1; var2 >= 0; var2--) {
				method346(field933[var2], field934[var2], arg0);
			}
		}
	}

	@ObfuscatedName("mc.b([CI)V")
	public static final void method338(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method346(var2, null, var1);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method346(var4, null, var3);

		for (int var5 = field935.length - 1; var5 >= 0; var5--) {
			method339(arg0, var1, var3, field935[var5]);
		}
	}

	@ObfuscatedName("mc.a(Z[C[C[C[C)V")
	public static final void method339(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg3.length <= arg0.length) {
			boolean var4 = true;
			int var8;
			for (int var5 = 0; var5 <= arg0.length - arg3.length; var5 += var8) {
				int var6 = var5;
				int var7 = 0;
				var8 = 1;
				while (var6 < arg0.length) {
					int var12;
					boolean var9 = false;
					char var10 = arg0[var6];
					char var11 = 0;
					if (var6 + 1 < arg0.length) {
						var11 = arg0[var6 + 1];
					}

					if (var7 < arg3.length && (var12 = method348(var11, var10, arg3[var7])) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method348(var11, var10, arg3[var7 - 1])) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg3.length || !method354(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg3.length) {
					boolean var14 = false;
					int var15 = method340(arg0, var5, arg1);
					int var16 = method341(var6 - 1, arg2, arg0);
					if (var15 > 2 || var16 > 2) {
						var14 = true;
					}

					if (var14) {
						for (int var17 = var5; var17 < var6; var17++) {
							arg0[var17] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("mc.a([CII[C)I")
	public static final int method340(char[] arg0, int arg1, char[] arg2) {
		if (arg1 == 0) {
			return 2;
		}

		for (int var3 = arg1 - 1; var3 >= 0 && method354(arg0[var3]); var3--) {
			if (arg0[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg1 - 1; var5 >= 0 && method354(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method354(arg0[arg1 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("mc.a(II[C[C)I")
	public static final int method341(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg0 + 1;
		while (var3 < arg2.length && method354(arg2[var3])) {
			if (arg2[var3] != '.' && arg2[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 + 1; var5 < arg2.length && method354(arg1[var5]); var5++) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method354(arg2[arg0 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("mc.a(I[C)V")
	public static final void method342(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method346(var2, null, var1);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method346(var4, null, var3);

		for (int var5 = 0; var5 < field936.length; var5++) {
			method343(var3, field936[var5], var1, arg0, field937[var5]);
		}
	}

	@ObfuscatedName("mc.a([C[CI[C[CI)V")
	public static final void method343(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4) {
		if (arg1.length <= arg3.length) {
			boolean var5 = true;
			int var9;
			for (int var6 = 0; var6 <= arg3.length - arg1.length; var6 += var9) {
				int var7 = var6;
				int var8 = 0;
				var9 = 1;
				while (var7 < arg3.length) {
					int var13;
					boolean var10 = false;
					char var11 = arg3[var7];
					char var12 = 0;
					if (var7 + 1 < arg3.length) {
						var12 = arg3[var7 + 1];
					}

					if (var8 < arg1.length && (var13 = method348(var12, var11, arg1[var8])) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method348(var12, var11, arg1[var8 - 1])) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg1.length || !method354(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg1.length) {
					boolean var15 = false;
					int var16 = method344(arg3, var6, arg2);
					int var17 = method345(var7 - 1, arg0, arg3);
					if (arg4 == 1 && var16 > 0 && var17 > 0) {
						var15 = true;
					}

					if (arg4 == 2 && (var16 > 2 && var17 > 0 || var16 > 0 && var17 > 2)) {
						var15 = true;
					}

					if (arg4 == 3 && var16 > 0 && var17 > 2) {
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
										if (arg2[var21] != '*') {
											break;
										}

										var18 = var21;
									} else if (arg2[var21] == '*') {
										var18 = var21;
										var20 = true;
									}
								}
							}

							boolean var22 = false;
							for (int var23 = var18 - 1; var23 >= 0; var23--) {
								if (var22) {
									if (method354(arg3[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method354(arg3[var23])) {
									var22 = true;
									var18 = var23;
								}
							}
						}

						if (var17 > 2) {
							if (var17 == 4) {
								boolean var24 = false;
								for (int var25 = var19 + 1; var25 < arg3.length; var25++) {
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
							for (int var27 = var19 + 1; var27 < arg3.length; var27++) {
								if (var26) {
									if (method354(arg3[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method354(arg3[var27])) {
									var26 = true;
									var19 = var27;
								}
							}
						}

						for (int var28 = var18; var28 <= var19; var28++) {
							arg3[var28] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("mc.a(I[CI[C)I")
	public static final int method344(char[] arg0, int arg1, char[] arg2) {
		if (arg1 == 0) {
			return 2;
		}

		int var3 = arg1 - 1;
		while (var3 >= 0 && method354(arg0[var3])) {
			if (arg0[var3] != ',' && arg0[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 - 1; var5 >= 0 && method354(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method354(arg0[arg1 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("mc.a(ZI[C[C)I")
	public static final int method345(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg0 + 1;
		while (var3 < arg2.length && method354(arg2[var3])) {
			if (arg2[var3] != '\\' && arg2[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 + 1; var5 < arg2.length && method354(arg1[var5]); var5++) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method354(arg2[arg0 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("mc.a([C[[BB[C)V")
	public static final void method346(char[] arg0, byte[][] arg1, char[] arg2) {
		if (arg0.length <= arg2.length) {
			boolean var3 = true;
			int var8;
			for (int var4 = 0; var4 <= arg2.length - arg0.length; var4 += var8) {
				int var5 = var4;
				int var6 = 0;
				int var7 = 0;
				var8 = 1;
				boolean var9 = false;
				while (var5 < arg2.length) {
					int var13;
					boolean var10 = false;
					char var11 = arg2[var5];
					char var12 = 0;
					if (var5 + 1 < arg2.length) {
						var12 = arg2[var5 + 1];
					}

					if (var6 < arg0.length && (var13 = method349(var12, var11, arg0[var6])) > 0) {
						var5 += var13;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var14;
						if ((var14 = method349(var12, var11, arg0[var6 - 1])) > 0) {
							var5 += var14;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg0.length || !method355(var11)) {
								break;
							}

							if (method354(var11) && var11 != '\'') {
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

				if (var6 >= arg0.length) {
					boolean var15 = true;
					if (var9) {
						boolean var20 = false;
						boolean var21 = false;

						if (var4 - 1 < 0 || method354(arg2[var4 - 1]) && arg2[var4 - 1] != '\'') {
							var20 = true;
						}

						if (var5 >= arg2.length || method354(arg2[var5]) && arg2[var5] != '\'') {
							var21 = true;
						}

						if (!var20 || !var21) {
							boolean var22 = false;
							int var23 = var4 - 2;
							if (var20) {
								var23 = var4;
							}

							while (!var22 && var23 < var5) {
								if (var23 >= 0 && (!method354(arg2[var23]) || arg2[var23] == '\'')) {
									char[] var24 = new char[3];
									int var25;
									for (var25 = 0; var25 < 3 && var23 + var25 < arg2.length && (!method354(arg2[var23 + var25]) || arg2[var23 + var25] == '\''); var25++) {
										var24[var25] = arg2[var23 + var25];
									}

									boolean var26 = true;
									if (var25 == 0) {
										var26 = false;
									}

									if (var25 < 3 && var23 - 1 >= 0 && (!method354(arg2[var23 - 1]) || arg2[var23 - 1] == '\'')) {
										var26 = false;
									}

									if (var26 && !method360(var24)) {
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
							var16 = arg2[var4 - 1];
						}

						char var17 = ' ';
						if (var5 < arg2.length) {
							var17 = arg2[var5];
						}

						byte var18 = method350(var16);
						byte var19 = method350(var17);
						if (arg1 != null && method347(arg1, var18, var19)) {
							var15 = false;
						}
					}

					if (var15) {
						int var27 = 0;
						for (int var28 = var4; var28 < var5; var28++) {
							if (method357(arg2[var28])) {
								var27++;
							}
						}

						if (var27 * 100 / (var5 - var4) <= 50) {
							for (int var29 = var4; var29 < var5; var29++) {
								arg2[var29] = '*';
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("mc.a(Z[[BBB)Z")
	public static final boolean method347(byte[][] arg0, byte arg1, byte arg2) {
		int var3 = 0;
		if (arg0[var3][0] == arg1 && arg0[var3][1] == arg2) {
			return true;
		}

		int var4 = arg0.length - 1;
		if (arg0[var4][0] == arg1 && arg0[var4][1] == arg2) {
			return true;
		}

		do {
			int var5 = (var3 + var4) / 2;
			if (arg0[var5][0] == arg1 && arg0[var5][1] == arg2) {
				return true;
			}

			if (arg1 < arg0[var5][0] || arg0[var5][0] == arg1 && arg2 < arg0[var5][1]) {
				var4 = var5;
			} else {
				var3 = var5;
			}
		} while (var3 != var4 && var3 + 1 != var4);

		return false;
	}

	@ObfuscatedName("mc.a(CCCB)I")
	public static final int method348(char arg0, char arg1, char arg2) {
		if (arg1 == arg2) {
			return 1;
		}

		if (arg2 == 'o' && arg1 == '0') {
			return 1;
		}

		if (arg2 == 'o' && arg1 == '(' && arg0 == ')') {
			return 2;
		}

		if (arg2 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
			return 1;
		}

		if (arg2 == 'e' && arg1 == '€') {
			return 1;
		}

		if (arg2 == 's' && arg1 == '$') {
			return 1;
		}

		if (arg2 == 'l' && arg1 == 'i') {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("mc.a(CCBC)I")
	public static final int method349(char arg0, char arg1, char arg2) {
		if (arg1 == arg2) {
			return 1;
		}

		if (arg2 >= 'a' && arg2 <= 'm') {
			if (arg2 == 'a') {
				if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
					if (arg1 == '/' && arg0 == '\\') {
						return 2;
					}

					return 0;
				}

				return 1;
			}

			if (arg2 == 'b') {
				if (arg1 == '1' && arg0 == '3') {
					return 2;
				}

				return 0;
			}

			if (arg2 == 'c') {
				if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'd') {
				return 0;
			}

			if (arg2 == 'e') {
				if (arg1 != '3' && arg1 != '€') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'f') {
				if (arg1 == 'p' && arg0 == 'h') {
					return 2;
				}

				if (arg1 == '£') {
					return 1;
				}

				return 0;
			}

			if (arg2 == 'g') {
				if (arg1 != '9' && arg1 != '6') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'h') {
				if (arg1 == '#') {
					return 1;
				}

				return 0;
			}

			if (arg2 == 'i') {
				if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'j') {
				return 0;
			}

			if (arg2 == 'k') {
				return 0;
			}

			if (arg2 == 'l') {
				if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'm') {
				return 0;
			}
		}

		if (arg2 >= 'n' && arg2 <= 'z') {
			if (arg2 == 'n') {
				return 0;
			}

			if (arg2 == 'o') {
				if (arg1 != '0' && arg1 != '*') {
					if ((arg1 != '(' || arg0 != ')') && (arg1 != '[' || arg0 != ']') && (arg1 != '{' || arg0 != '}') && (arg1 != '<' || arg0 != '>')) {
						return 0;
					}

					return 2;
				}

				return 1;
			}

			if (arg2 == 'p') {
				return 0;
			}

			if (arg2 == 'q') {
				return 0;
			}

			if (arg2 == 'r') {
				return 0;
			}

			if (arg2 == 's') {
				if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 't') {
				if (arg1 == '7') {
					return 1;
				}

				return 0;
			}

			if (arg2 == 'u') {
				if (arg1 == 'v') {
					return 1;
				}

				if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg2 == 'v') {
				if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg2 == 'w') {
				if (arg1 == 'v' && arg0 == 'v') {
					return 2;
				}

				return 0;
			}

			if (arg2 == 'x') {
				if ((arg1 != ')' || arg0 != '(') && (arg1 != '}' || arg0 != '{') && (arg1 != ']' || arg0 != '[') && (arg1 != '>' || arg0 != '<')) {
					return 0;
				}

				return 2;
			}

			if (arg2 == 'y') {
				return 0;
			}

			if (arg2 == 'z') {
				return 0;
			}
		}

		if (arg2 >= '0' && arg2 <= '9') {
			if (arg2 != '0') {
				if (arg2 == '1') {
					if (arg1 == 'l') {
						return 1;
					}

					return 0;
				}

				return 0;
			}

			if (arg1 != 'o' && arg1 != 'O') {
				if (arg1 == '(' && arg0 == ')' || arg1 == '{' && arg0 == '}' || arg1 == '[' && arg0 == ']') {
					return 2;
				}

				return 0;
			}

			return 1;
		}

		if (arg2 == ',') {
			if (arg1 == '.') {
				return 1;
			}

			return 0;
		}

		if (arg2 == '.') {
			if (arg1 == ',') {
				return 1;
			}

			return 0;
		}

		if (arg2 == '!') {
			if (arg1 == 'i') {
				return 1;
			}

			return 0;
		}

		return 0;
	}

	@ObfuscatedName("mc.a(CZ)B")
	public static final byte method350(char arg0) {
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

	@ObfuscatedName("mc.b(I[C)V")
	public static final void method351(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method352(arg0, var2)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method354(arg0[var6]) && !method355(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method353(var7, arg0);
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

	@ObfuscatedName("mc.a(Z[CI)I")
	public static final int method352(char[] arg0, int arg1) {
		for (int var2 = arg1; var2 < arg0.length && var2 >= 0; var2++) {
			if (arg0[var2] >= '0' && arg0[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("mc.a(I[CZ)I")
	public static final int method353(int arg0, char[] arg1) {
		int var2 = arg0;
		while (var2 < arg1.length && var2 >= 0) {
			if (arg1[var2] >= '0' && arg1[var2] <= '9') {
				var2++;
				continue;
			}

			return var2;
		}

		return arg1.length;
	}

	@ObfuscatedName("mc.a(ZC)Z")
	public static final boolean method354(char arg0) {
		if (!method356(arg0) && !method357(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("mc.a(IC)Z")
	public static final boolean method355(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("mc.b(IC)Z")
	public static final boolean method356(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("mc.a(CB)Z")
	public static final boolean method357(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("mc.b(CI)Z")
	public static final boolean method358(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("mc.b(ZC)Z")
	public static final boolean method359(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("mc.c([CI)Z")
	public static final boolean method360(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method357(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method361(arg0);
		int var4 = 0;
		int var5 = field932.length - 1;
		if (field932[var4] != var3 && field932[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field932[var6] == var3) {
					return true;
				}

				if (var3 < field932[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("mc.d([CI)I")
	public static final int method361(char[] arg0) {
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
