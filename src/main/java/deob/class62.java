package deob;

@ObfuscatedName("jc")
public final class class62 {

	@ObfuscatedName("jc.l")
	public static int[] field874;

	@ObfuscatedName("jc.m")
	public static char[][] field875;

	@ObfuscatedName("jc.n")
	public static byte[][][] field876;

	@ObfuscatedName("jc.o")
	public static char[][] field877;

	@ObfuscatedName("jc.p")
	public static char[][] field878;

	@ObfuscatedName("jc.q")
	public static int[] field879;

	@ObfuscatedName("jc.r")
	public static final String[] field880 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet" };

	@ObfuscatedName("jc.a(Lub;)V")
	public static final void method302(class47 arg0) {
		class37 var1 = new class37(arg0.method242(null, "fragmentsenc.txt"));
		class37 var2 = new class37(arg0.method242(null, "badenc.txt"));
		class37 var3 = new class37(arg0.method242(null, "domainenc.txt"));
		class37 var4 = new class37(arg0.method242(null, "tldlist.txt"));
		method303(var1, var2, var3, var4);
	}

	@ObfuscatedName("jc.a(Lkb;Lkb;Lkb;Lkb;)V")
	public static final void method303(class37 arg0, class37 arg1, class37 arg2, class37 arg3) {
		method305(arg1);
		method306(arg2);
		method307(arg0);
		method304(arg3);
	}

	@ObfuscatedName("jc.a(Lkb;I)V")
	public static final void method304(class37 arg0) {
		int var1 = arg0.method206();
		field878 = new char[var1][];
		field879 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field879[var2] = arg0.method201();
			char[] var3 = new char[arg0.method201()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method201();
			}

			field878[var2] = var3;
		}
	}

	@ObfuscatedName("jc.a(ILkb;)V")
	public static final void method305(class37 arg0) {
		int var1 = arg0.method206();
		field875 = new char[var1][];
		field876 = new byte[var1][][];
		method308(arg0, field876, field875);
	}

	@ObfuscatedName("jc.b(ILkb;)V")
	public static final void method306(class37 arg0) {
		int var1 = arg0.method206();
		field877 = new char[var1][];
		method309(arg0, field877);
	}

	@ObfuscatedName("jc.a(Lkb;Z)V")
	public static final void method307(class37 arg0) {
		field874 = new int[arg0.method206()];
		for (int var1 = 0; var1 < field874.length; var1++) {
			field874[var1] = arg0.method203();
		}
	}

	@ObfuscatedName("jc.a(ILkb;[[[B[[C)V")
	public static final void method308(class37 arg0, byte[][][] arg1, char[][] arg2) {
		for (int var3 = 0; var3 < arg2.length; var3++) {
			char[] var4 = new char[arg0.method201()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg0.method201();
			}

			arg2[var3] = var4;
			byte[][] var6 = new byte[arg0.method201()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg0.method201();
				var6[var7][1] = (byte) arg0.method201();
			}

			if (var6.length > 0) {
				arg1[var3] = var6;
			}
		}
	}

	@ObfuscatedName("jc.a(Lkb;B[[C)V")
	public static final void method309(class37 arg0, char[][] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			char[] var3 = new char[arg0.method201()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method201();
			}

			arg1[var2] = var3;
		}
	}

	@ObfuscatedName("jc.a(I[C)V")
	public static final void method310(char[] arg0) {
		for (int var1 = 0; var1 < arg0.length; var1++) {
			if (!method311(arg0[var1])) {
				arg0[var1] = ' ';
			}
		}
	}

	@ObfuscatedName("jc.a(CI)Z")
	public static final boolean method311(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("jc.a(BLjava/lang/String;)Ljava/lang/String;")
	public static final String method312(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toLowerCase().toCharArray();
		method310(var3);
		method320(var3);
		method315(var3);
		method316(var3);
		method329(var3);

		for (int var4 = 0; var4 < field880.length; var4++) {
			int var5 = -1;
			while ((var5 = arg0.indexOf(field880[var4], var5 + 1)) != -1) {
				char[] var6 = field880[var4].toCharArray();
				for (int var7 = 0; var7 < var6.length; var7++) {
					var3[var5 + var7] = var6[var7];
				}
			}
		}

		method313(var3, arg0.toCharArray());
		method314(var3);
		long var8 = System.currentTimeMillis();
		return (new String(var3)).trim();
	}

	@ObfuscatedName("jc.a(B[C[C)V")
	public static final void method313(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			if (arg0[var2] != '*' && method337(arg1[var2])) {
				arg0[var2] = arg1[var2];
			}
		}
	}

	@ObfuscatedName("jc.a(B[C)V")
	public static final void method314(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method334(var3)) {
				var1 = true;
			} else if (var1) {
				if (method336(var3)) {
					var1 = false;
				}
			} else if (method337(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("jc.b(B[C)V")
	public static final void method315(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field875.length - 1; var2 >= 0; var2--) {
				method324(field876[var2], arg0, field875[var2]);
			}
		}
	}

	@ObfuscatedName("jc.b(I[C)V")
	public static final void method316(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method324(null, var1, var2);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method324(null, var3, var4);

		for (int var5 = field877.length - 1; var5 >= 0; var5--) {
			method317(field877[var5], var3, var1, arg0);
		}
	}

	@ObfuscatedName("jc.a([C[CB[C[C)V")
	public static final void method317(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg0.length <= arg3.length) {
			boolean var4 = true;
			int var8;
			for (int var5 = 0; var5 <= arg3.length - arg0.length; var5 += var8) {
				int var6 = var5;
				int var7 = 0;
				var8 = 1;
				while (var6 < arg3.length) {
					int var12;
					boolean var9 = false;
					char var10 = arg3[var6];
					char var11 = 0;
					if (var6 + 1 < arg3.length) {
						var11 = arg3[var6 + 1];
					}

					if (var7 < arg0.length && (var12 = method326(arg0[var7], var11, var10)) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method326(arg0[var7 - 1], var11, var10)) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg0.length || !method332(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg0.length) {
					boolean var14 = false;
					int var15 = method318(arg3, var5, arg2);
					int var16 = method319(var6 - 1, arg3, arg1);
					if (var15 > 2 || var16 > 2) {
						var14 = true;
					}

					if (var14) {
						for (int var17 = var5; var17 < var6; var17++) {
							arg3[var17] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(I[CI[C)I")
	public static final int method318(char[] arg0, int arg1, char[] arg2) {
		if (arg1 == 0) {
			return 2;
		}

		for (int var3 = arg1 - 1; var3 >= 0 && method332(arg0[var3]); var3--) {
			if (arg0[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg1 - 1; var5 >= 0 && method332(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method332(arg0[arg1 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("jc.a(I[C[CB)I")
	public static final int method319(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg1.length) {
			return 2;
		}

		int var3 = arg0 + 1;
		while (var3 < arg1.length && method332(arg1[var3])) {
			if (arg1[var3] != '.' && arg1[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 + 1; var5 < arg1.length && method332(arg2[var5]); var5++) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method332(arg1[arg0 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("jc.a([CI)V")
	public static final void method320(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method324(null, var1, var2);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method324(null, var3, var4);

		for (int var5 = 0; var5 < field878.length; var5++) {
			method321(var1, field878[var5], field879[var5], arg0, var3);
		}
	}

	@ObfuscatedName("jc.a([C[CII[C[C)V")
	public static final void method321(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4) {
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

					if (var8 < arg1.length && (var13 = method326(arg1[var8], var12, var11)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method326(arg1[var8 - 1], var12, var11)) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg1.length || !method332(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg1.length) {
					boolean var15 = false;
					int var16 = method322(arg3, var6, arg0);
					int var17 = method323(arg4, var7 - 1, arg3);
					if (arg2 == 1 && var16 > 0 && var17 > 0) {
						var15 = true;
					}

					if (arg2 == 2 && (var16 > 2 && var17 > 0 || var16 > 0 && var17 > 2)) {
						var15 = true;
					}

					if (arg2 == 3 && var16 > 0 && var17 > 2) {
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
										if (arg0[var21] != '*') {
											break;
										}

										var18 = var21;
									} else if (arg0[var21] == '*') {
										var18 = var21;
										var20 = true;
									}
								}
							}

							boolean var22 = false;
							for (int var23 = var18 - 1; var23 >= 0; var23--) {
								if (var22) {
									if (method332(arg3[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method332(arg3[var23])) {
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
										if (arg4[var25] != '*') {
											break;
										}

										var19 = var25;
									} else if (arg4[var25] == '*') {
										var19 = var25;
										var24 = true;
									}
								}
							}

							boolean var26 = false;
							for (int var27 = var19 + 1; var27 < arg3.length; var27++) {
								if (var26) {
									if (method332(arg3[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method332(arg3[var27])) {
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

	@ObfuscatedName("jc.a([CBI[C)I")
	public static final int method322(char[] arg0, int arg1, char[] arg2) {
		if (arg1 == 0) {
			return 2;
		}

		int var3 = arg1 - 1;
		while (var3 >= 0 && method332(arg0[var3])) {
			if (arg0[var3] != ',' && arg0[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 - 1; var5 >= 0 && method332(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method332(arg0[arg1 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("jc.a([CIB[C)I")
	public static final int method323(char[] arg0, int arg1, char[] arg2) {
		if (arg1 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg1 + 1;
		while (var3 < arg2.length && method332(arg2[var3])) {
			if (arg2[var3] != '\\' && arg2[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 + 1; var5 < arg2.length && method332(arg0[var5]); var5++) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method332(arg2[arg1 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("jc.a([[B[C[CI)V")
	public static final void method324(byte[][] arg0, char[] arg1, char[] arg2) {
		if (arg2.length <= arg1.length) {
			boolean var3 = true;
			int var8;
			for (int var4 = 0; var4 <= arg1.length - arg2.length; var4 += var8) {
				int var5 = var4;
				int var6 = 0;
				int var7 = 0;
				var8 = 1;
				boolean var9 = false;
				while (var5 < arg1.length) {
					int var13;
					boolean var10 = false;
					char var11 = arg1[var5];
					char var12 = 0;
					if (var5 + 1 < arg1.length) {
						var12 = arg1[var5 + 1];
					}

					if (var6 < arg2.length && (var13 = method327(var11, var12, arg2[var6])) > 0) {
						var5 += var13;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var14;
						if ((var14 = method327(var11, var12, arg2[var6 - 1])) > 0) {
							var5 += var14;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg2.length || !method333(var11)) {
								break;
							}

							if (method332(var11) && var11 != '\'') {
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

				if (var6 >= arg2.length) {
					boolean var15 = true;
					if (var9) {
						boolean var20 = false;
						boolean var21 = false;

						if (var4 - 1 < 0 || method332(arg1[var4 - 1]) && arg1[var4 - 1] != '\'') {
							var20 = true;
						}

						if (var5 >= arg1.length || method332(arg1[var5]) && arg1[var5] != '\'') {
							var21 = true;
						}

						if (!var20 || !var21) {
							boolean var22 = false;
							int var23 = var4 - 2;
							if (var20) {
								var23 = var4;
							}

							while (!var22 && var23 < var5) {
								if (var23 >= 0 && (!method332(arg1[var23]) || arg1[var23] == '\'')) {
									char[] var24 = new char[3];
									int var25;
									for (var25 = 0; var25 < 3 && var23 + var25 < arg1.length && (!method332(arg1[var23 + var25]) || arg1[var23 + var25] == '\''); var25++) {
										var24[var25] = arg1[var23 + var25];
									}

									boolean var26 = true;
									if (var25 == 0) {
										var26 = false;
									}

									if (var25 < 3 && var23 - 1 >= 0 && (!method332(arg1[var23 - 1]) || arg1[var23 - 1] == '\'')) {
										var26 = false;
									}

									if (var26 && !method338(var24)) {
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
							var16 = arg1[var4 - 1];
						}

						char var17 = ' ';
						if (var5 < arg1.length) {
							var17 = arg1[var5];
						}

						byte var18 = method328(var16);
						byte var19 = method328(var17);
						if (arg0 != null && method325(var18, var19, arg0)) {
							var15 = false;
						}
					}

					if (var15) {
						int var27 = 0;
						for (int var28 = var4; var28 < var5; var28++) {
							if (method335(arg1[var28])) {
								var27++;
							}
						}

						if (var27 * 100 / (var5 - var4) <= 50) {
							for (int var29 = var4; var29 < var5; var29++) {
								arg1[var29] = '*';
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(BBI[[B)Z")
	public static final boolean method325(byte arg0, byte arg1, byte[][] arg2) {
		int var3 = 0;
		if (arg2[var3][0] == arg0 && arg2[var3][1] == arg1) {
			return true;
		}

		int var4 = arg2.length - 1;
		if (arg2[var4][0] == arg0 && arg2[var4][1] == arg1) {
			return true;
		}

		do {
			int var5 = (var3 + var4) / 2;
			if (arg2[var5][0] == arg0 && arg2[var5][1] == arg1) {
				return true;
			}

			if (arg0 < arg2[var5][0] || arg2[var5][0] == arg0 && arg1 < arg2[var5][1]) {
				var4 = var5;
			} else {
				var3 = var5;
			}
		} while (var3 != var4 && var3 + 1 != var4);

		return false;
	}

	@ObfuscatedName("jc.a(CCCB)I")
	public static final int method326(char arg0, char arg1, char arg2) {
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

	@ObfuscatedName("jc.a(CZCC)I")
	public static final int method327(char arg0, char arg1, char arg2) {
		if (arg0 == arg2) {
			return 1;
		}

		if (arg2 >= 'a' && arg2 <= 'm') {
			if (arg2 == 'a') {
				if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
					if (arg0 == '/' && arg1 == '\\') {
						return 2;
					}

					return 0;
				}

				return 1;
			}

			if (arg2 == 'b') {
				if (arg0 == '1' && arg1 == '3') {
					return 2;
				}

				return 0;
			}

			if (arg2 == 'c') {
				if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'd') {
				return 0;
			}

			if (arg2 == 'e') {
				if (arg0 != '3' && arg0 != '€') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'f') {
				if (arg0 == 'p' && arg1 == 'h') {
					return 2;
				}

				if (arg0 == '£') {
					return 1;
				}

				return 0;
			}

			if (arg2 == 'g') {
				if (arg0 != '9' && arg0 != '6') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'h') {
				if (arg0 == '#') {
					return 1;
				}

				return 0;
			}

			if (arg2 == 'i') {
				if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
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
				if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
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
				if (arg0 != '0' && arg0 != '*') {
					if ((arg0 != '(' || arg1 != ')') && (arg0 != '[' || arg1 != ']') && (arg0 != '{' || arg1 != '}') && (arg0 != '<' || arg1 != '>')) {
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
				if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 't') {
				if (arg0 == '7') {
					return 1;
				}

				return 0;
			}

			if (arg2 == 'u') {
				if (arg0 == 'v') {
					return 1;
				}

				if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg2 == 'v') {
				if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg2 == 'w') {
				if (arg0 == 'v' && arg1 == 'v') {
					return 2;
				}

				return 0;
			}

			if (arg2 == 'x') {
				if ((arg0 != ')' || arg1 != '(') && (arg0 != '}' || arg1 != '{') && (arg0 != ']' || arg1 != '[') && (arg0 != '>' || arg1 != '<')) {
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
					if (arg0 == 'l') {
						return 1;
					}

					return 0;
				}

				return 0;
			}

			if (arg0 != 'o' && arg0 != 'O') {
				if (arg0 == '(' && arg1 == ')' || arg0 == '{' && arg1 == '}' || arg0 == '[' && arg1 == ']') {
					return 2;
				}

				return 0;
			}

			return 1;
		}

		if (arg2 == ',') {
			if (arg0 == '.') {
				return 1;
			}

			return 0;
		}

		if (arg2 == '.') {
			if (arg0 == ',') {
				return 1;
			}

			return 0;
		}

		if (arg2 == '!') {
			if (arg0 == 'i') {
				return 1;
			}

			return 0;
		}

		return 0;
	}

	@ObfuscatedName("jc.a(ZC)B")
	public static final byte method328(char arg0) {
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

	@ObfuscatedName("jc.c(I[C)V")
	public static final void method329(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method330(arg0, var2)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method332(arg0[var6]) && !method333(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method331(arg0, var7);
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

	@ObfuscatedName("jc.a([CII)I")
	public static final int method330(char[] arg0, int arg1) {
		for (int var2 = arg1; var2 < arg0.length && var2 >= 0; var2++) {
			if (arg0[var2] >= '0' && arg0[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("jc.b([CII)I")
	public static final int method331(char[] arg0, int arg1) {
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

	@ObfuscatedName("jc.a(IC)Z")
	public static final boolean method332(char arg0) {
		if (!method334(arg0) && !method335(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("jc.a(BC)Z")
	public static final boolean method333(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("jc.b(IC)Z")
	public static final boolean method334(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("jc.a(CB)Z")
	public static final boolean method335(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("jc.b(BC)Z")
	public static final boolean method336(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("jc.b(CI)Z")
	public static final boolean method337(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("jc.a(Z[C)Z")
	public static final boolean method338(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method335(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method339(arg0);
		int var4 = 0;
		int var5 = field874.length - 1;
		if (field874[var4] != var3 && field874[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field874[var6] == var3) {
					return true;
				}

				if (var3 < field874[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("jc.b([CI)I")
	public static final int method339(char[] arg0) {
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
