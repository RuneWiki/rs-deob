package deob;

@ObfuscatedName("mc")
public final class class65 {

	@ObfuscatedName("mc.n")
	public static int[] field940;

	@ObfuscatedName("mc.o")
	public static char[][] field941;

	@ObfuscatedName("mc.p")
	public static byte[][][] field942;

	@ObfuscatedName("mc.q")
	public static char[][] field943;

	@ObfuscatedName("mc.r")
	public static char[][] field944;

	@ObfuscatedName("mc.s")
	public static int[] field945;

	@ObfuscatedName("mc.t")
	public static final String[] field946 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

	@ObfuscatedName("mc.a(Lub;)V")
	public static final void method325(class47 arg0) {
		class37 var1 = new class37(arg0.method250("fragmentsenc.txt", null));
		class37 var2 = new class37(arg0.method250("badenc.txt", null));
		class37 var3 = new class37(arg0.method250("domainenc.txt", null));
		class37 var4 = new class37(arg0.method250("tldlist.txt", null));
		method326(var1, var2, var3, var4);
	}

	@ObfuscatedName("mc.a(Lkb;Lkb;Lkb;Lkb;)V")
	public static final void method326(class37 arg0, class37 arg1, class37 arg2, class37 arg3) {
		method328(arg1);
		method329(arg2);
		method330(arg0);
		method327(arg3);
	}

	@ObfuscatedName("mc.a(ILkb;)V")
	public static final void method327(class37 arg0) {
		int var1 = arg0.method214();
		field944 = new char[var1][];
		field945 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field945[var2] = arg0.method209();
			char[] var3 = new char[arg0.method209()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method209();
			}

			field944[var2] = var3;
		}
	}

	@ObfuscatedName("mc.a(Lkb;I)V")
	public static final void method328(class37 arg0) {
		int var1 = arg0.method214();
		field941 = new char[var1][];
		field942 = new byte[var1][][];
		method331(field941, field942, arg0);
	}

	@ObfuscatedName("mc.b(ILkb;)V")
	public static final void method329(class37 arg0) {
		int var1 = arg0.method214();
		field943 = new char[var1][];
		method332(field943, arg0);
	}

	@ObfuscatedName("mc.a(Lkb;Z)V")
	public static final void method330(class37 arg0) {
		field940 = new int[arg0.method214()];
		for (int var1 = 0; var1 < field940.length; var1++) {
			field940[var1] = arg0.method211();
		}
	}

	@ObfuscatedName("mc.a(Z[[C[[[BLkb;)V")
	public static final void method331(char[][] arg0, byte[][][] arg1, class37 arg2) {
		for (int var3 = 0; var3 < arg0.length; var3++) {
			char[] var4 = new char[arg2.method209()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg2.method209();
			}

			arg0[var3] = var4;
			byte[][] var6 = new byte[arg2.method209()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg2.method209();
				var6[var7][1] = (byte) arg2.method209();
			}

			if (var6.length > 0) {
				arg1[var3] = var6;
			}
		}
	}

	@ObfuscatedName("mc.a([[CZLkb;)V")
	public static final void method332(char[][] arg0, class37 arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char[] var3 = new char[arg1.method209()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg1.method209();
			}

			arg0[var2] = var3;
		}
	}

	@ObfuscatedName("mc.a([CZ)V")
	public static final void method333(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method334(arg0[var2])) {
				arg0[var1] = arg0[var2];
			} else {
				arg0[var1] = ' ';
			}

			if (var1 == 0 || arg0[var1] != ' ' || arg0[var1 - 1] != ' ') {
				var1++;
			}
		}

		for (int var3 = var1; var3 < arg0.length; var3++) {
			arg0[var3] = ' ';
		}
	}

	@ObfuscatedName("mc.a(IC)Z")
	public static final boolean method334(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("mc.a(Ljava/lang/String;I)Ljava/lang/String;")
	public static final String method335(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method333(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method343(var5);
		method338(var5);
		method339(var5);
		method352(var5);

		for (int var7 = 0; var7 < field946.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field946[var7], var8 + 1)) != -1) {
				char[] var9 = field946[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		method336(var5, var4.toCharArray());
		method337(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("mc.a(I[C[C)V")
	public static final void method336(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			if (arg0[var2] != '*' && method360(arg1[var2])) {
				arg0[var2] = arg1[var2];
			}
		}
	}

	@ObfuscatedName("mc.a(B[C)V")
	public static final void method337(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method357(var3)) {
				var1 = true;
			} else if (var1) {
				if (method359(var3)) {
					var1 = false;
				}
			} else if (method360(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("mc.a([CI)V")
	public static final void method338(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field941.length - 1; var2 >= 0; var2--) {
				method347(arg0, field942[var2], field941[var2]);
			}
		}
	}

	@ObfuscatedName("mc.a([CB)V")
	public static final void method339(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method347(var1, null, var2);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method347(var3, null, var4);

		for (int var5 = field943.length - 1; var5 >= 0; var5--) {
			method340(field943[var5], var3, arg0, var1);
		}
	}

	@ObfuscatedName("mc.a([C[C[C[CI)V")
	public static final void method340(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg0.length <= arg2.length) {
			boolean var4 = true;
			int var8;
			for (int var5 = 0; var5 <= arg2.length - arg0.length; var5 += var8) {
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

					if (var7 < arg0.length && (var12 = method349(arg0[var7], var10, var11)) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method349(arg0[var7 - 1], var10, var11)) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg0.length || !method355(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg0.length) {
					boolean var14 = false;
					int var15 = method341(arg2, arg3, var5);
					int var16 = method342(var6 - 1, arg1, arg2);
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

	@ObfuscatedName("mc.a([C[CII)I")
	public static final int method341(char[] arg0, char[] arg1, int arg2) {
		if (arg2 == 0) {
			return 2;
		}

		for (int var3 = arg2 - 1; var3 >= 0 && method355(arg0[var3]); var3--) {
			if (arg0[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg2 - 1; var5 >= 0 && method355(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method355(arg0[arg2 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("mc.a(I[C[CI)I")
	public static final int method342(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg0 + 1;
		while (var3 < arg2.length && method355(arg2[var3])) {
			if (arg2[var3] != '.' && arg2[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 + 1; var5 < arg2.length && method355(arg1[var5]); var5++) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method355(arg2[arg0 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("mc.b([CZ)V")
	public static final void method343(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method347(var1, null, var2);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method347(var3, null, var4);

		for (int var5 = 0; var5 < field944.length; var5++) {
			method344(var3, field945[var5], arg0, field944[var5], var1);
		}
	}

	@ObfuscatedName("mc.a([CII[C[C[C)V")
	public static final void method344(char[] arg0, int arg1, char[] arg2, char[] arg3, char[] arg4) {
		if (arg3.length <= arg2.length) {
			boolean var5 = true;
			int var9;
			for (int var6 = 0; var6 <= arg2.length - arg3.length; var6 += var9) {
				int var7 = var6;
				int var8 = 0;
				var9 = 1;
				while (var7 < arg2.length) {
					int var13;
					boolean var10 = false;
					char var11 = arg2[var7];
					char var12 = 0;
					if (var7 + 1 < arg2.length) {
						var12 = arg2[var7 + 1];
					}

					if (var8 < arg3.length && (var13 = method349(arg3[var8], var11, var12)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method349(arg3[var8 - 1], var11, var12)) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg3.length || !method355(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg3.length) {
					boolean var15 = false;
					int var16 = method345(arg4, arg2, var6);
					int var17 = method346(arg0, arg2, var7 - 1);
					if (arg1 == 1 && var16 > 0 && var17 > 0) {
						var15 = true;
					}

					if (arg1 == 2 && (var16 > 2 && var17 > 0 || var16 > 0 && var17 > 2)) {
						var15 = true;
					}

					if (arg1 == 3 && var16 > 0 && var17 > 2) {
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
										if (arg4[var21] != '*') {
											break;
										}

										var18 = var21;
									} else if (arg4[var21] == '*') {
										var18 = var21;
										var20 = true;
									}
								}
							}

							boolean var22 = false;
							for (int var23 = var18 - 1; var23 >= 0; var23--) {
								if (var22) {
									if (method355(arg2[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method355(arg2[var23])) {
									var22 = true;
									var18 = var23;
								}
							}
						}

						if (var17 > 2) {
							if (var17 == 4) {
								boolean var24 = false;
								for (int var25 = var19 + 1; var25 < arg2.length; var25++) {
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
							for (int var27 = var19 + 1; var27 < arg2.length; var27++) {
								if (var26) {
									if (method355(arg2[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method355(arg2[var27])) {
									var26 = true;
									var19 = var27;
								}
							}
						}

						for (int var28 = var18; var28 <= var19; var28++) {
							arg2[var28] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("mc.b([C[CII)I")
	public static final int method345(char[] arg0, char[] arg1, int arg2) {
		if (arg2 == 0) {
			return 2;
		}

		int var3 = arg2 - 1;
		while (var3 >= 0 && method355(arg1[var3])) {
			if (arg1[var3] != ',' && arg1[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg2 - 1; var5 >= 0 && method355(arg0[var5]); var5--) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method355(arg1[arg2 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("mc.a([CI[CI)I")
	public static final int method346(char[] arg0, char[] arg1, int arg2) {
		if (arg2 + 1 == arg1.length) {
			return 2;
		}

		int var3 = arg2 + 1;
		while (var3 < arg1.length && method355(arg1[var3])) {
			if (arg1[var3] != '\\' && arg1[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg2 + 1; var5 < arg1.length && method355(arg0[var5]); var5++) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method355(arg1[arg2 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("mc.a([C[[BI[C)V")
	public static final void method347(char[] arg0, byte[][] arg1, char[] arg2) {
		if (arg2.length <= arg0.length) {
			boolean var3 = true;
			int var8;
			for (int var4 = 0; var4 <= arg0.length - arg2.length; var4 += var8) {
				int var5 = var4;
				int var6 = 0;
				int var7 = 0;
				var8 = 1;
				boolean var9 = false;
				boolean var10 = false;
				boolean var11 = false;
				while (var5 < arg0.length && (!var10 || !var11)) {
					char var13;
					char var14;
					int var15;
					boolean var12 = false;
					var13 = arg0[var5];
					var14 = 0;
					if (var5 + 1 < arg0.length) {
						var14 = arg0[var5 + 1];
					}

					if (var6 < arg2.length && (var15 = method350(var14, var13, arg2[var6])) > 0) {
						if (var15 == 1 && method358(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (method358(var13) || method358(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = method350(var14, var13, arg2[var6 - 1])) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg2.length || !method356(var13)) {
								break;
							}

							if (method355(var13) && var13 != '\'') {
								var9 = true;
							}

							if (method358(var13)) {
								var11 = true;
							}

							var5++;
							var7++;
							if (var7 * 100 / (var5 - var4) > 90) {
								break;
							}
						}
					}
				}

				if (var6 >= arg2.length && (!var10 || !var11)) {
					boolean var17 = true;
					if (var9) {
						boolean var22 = false;
						boolean var23 = false;

						if (var4 - 1 < 0 || method355(arg0[var4 - 1]) && arg0[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg0.length || method355(arg0[var5]) && arg0[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!method355(arg0[var25]) || arg0[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg0.length && (!method355(arg0[var25 + var27]) || arg0[var25 + var27] == '\''); var27++) {
										var26[var27] = arg0[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!method355(arg0[var25 - 1]) || arg0[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !method361(var26)) {
										var24 = true;
									}
								}

								var25++;
							}

							if (!var24) {
								var17 = false;
							}
						}
					} else {
						char var18 = ' ';
						if (var4 - 1 >= 0) {
							var18 = arg0[var4 - 1];
						}

						char var19 = ' ';
						if (var5 < arg0.length) {
							var19 = arg0[var5];
						}

						byte var20 = method351(var18);
						byte var21 = method351(var19);
						if (arg1 != null && method348(arg1, var21, var20)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						for (int var31 = var4; var31 < var5; var31++) {
							if (method358(arg0[var31])) {
								var29++;
							} else if (method357(arg0[var31])) {
								var30++;
							}
						}

						if (var29 <= var30) {
							for (int var32 = var4; var32 < var5; var32++) {
								arg0[var32] = '*';
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("mc.a([[BBZB)Z")
	public static final boolean method348(byte[][] arg0, byte arg1, byte arg2) {
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

	@ObfuscatedName("mc.a(CCCZ)I")
	public static final int method349(char arg0, char arg1, char arg2) {
		if (arg0 == arg1) {
			return 1;
		}

		if (arg0 == 'o' && arg1 == '0') {
			return 1;
		}

		if (arg0 == 'o' && arg1 == '(' && arg2 == ')') {
			return 2;
		}

		if (arg0 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
			return 1;
		}

		if (arg0 == 'e' && arg1 == '€') {
			return 1;
		}

		if (arg0 == 's' && arg1 == '$') {
			return 1;
		}

		if (arg0 == 'l' && arg1 == 'i') {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("mc.a(CCZC)I")
	public static final int method350(char arg0, char arg1, char arg2) {
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
				if (arg1 != '6' && arg1 != '8') {
					if (arg1 == '1' && arg0 == '3') {
						return 2;
					}

					return 0;
				}

				return 1;
			}

			if (arg2 == 'c') {
				if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'd') {
				if (arg1 == '[' && arg0 == ')') {
					return 2;
				}

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
				if (arg1 != '7' && arg1 != '+') {
					return 0;
				}

				return 1;
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
				if ((arg1 != '(' || arg0 != ')') && (arg1 != '{' || arg0 != '}') && (arg1 != '[' || arg0 != ']')) {
					return 0;
				}

				return 2;
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

	@ObfuscatedName("mc.a(BC)B")
	public static final byte method351(char arg0) {
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

	@ObfuscatedName("mc.b(B[C)V")
	public static final void method352(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method353(var2, arg0)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method355(arg0[var6]) && !method356(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method354(var7, arg0);
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

	@ObfuscatedName("mc.a(IB[C)I")
	public static final int method353(int arg0, char[] arg1) {
		for (int var2 = arg0; var2 < arg1.length && var2 >= 0; var2++) {
			if (arg1[var2] >= '0' && arg1[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("mc.a(I[CZ)I")
	public static final int method354(int arg0, char[] arg1) {
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

	@ObfuscatedName("mc.a(CI)Z")
	public static final boolean method355(char arg0) {
		if (!method357(arg0) && !method358(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("mc.b(CI)Z")
	public static final boolean method356(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("mc.a(CZ)Z")
	public static final boolean method357(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("mc.b(BC)Z")
	public static final boolean method358(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("mc.c(CI)Z")
	public static final boolean method359(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("mc.a(CB)Z")
	public static final boolean method360(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("mc.a(Z[C)Z")
	public static final boolean method361(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method358(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method362(arg0);
		int var4 = 0;
		int var5 = field940.length - 1;
		if (field940[var4] != var3 && field940[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field940[var6] == var3) {
					return true;
				}

				if (var3 < field940[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("mc.b([CB)I")
	public static final int method362(char[] arg0) {
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
