package deob;

@ObfuscatedName("sc")
public final class class71 {

	@ObfuscatedName("sc.p")
	public static int[] field1035;

	@ObfuscatedName("sc.q")
	public static char[][] field1036;

	@ObfuscatedName("sc.r")
	public static byte[][][] field1037;

	@ObfuscatedName("sc.s")
	public static char[][] field1038;

	@ObfuscatedName("sc.t")
	public static char[][] field1039;

	@ObfuscatedName("sc.u")
	public static int[] field1040;

	@ObfuscatedName("sc.v")
	public static final String[] field1041 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq" };

	@ObfuscatedName("sc.a(Lxb;)V")
	public static final void method384(class50 arg0) {
		class38 var1 = new class38(arg0.method294("fragmentsenc.txt", null));
		class38 var2 = new class38(arg0.method294("badenc.txt", null));
		class38 var3 = new class38(arg0.method294("domainenc.txt", null));
		class38 var4 = new class38(arg0.method294("tldlist.txt", null));
		method385(var1, var2, var3, var4);
	}

	@ObfuscatedName("sc.a(Llb;Llb;Llb;Llb;)V")
	public static final void method385(class38 arg0, class38 arg1, class38 arg2, class38 arg3) {
		method387(arg1);
		method388(arg2);
		method389(arg0);
		method386(arg3);
	}

	@ObfuscatedName("sc.a(Llb;I)V")
	public static final void method386(class38 arg0) {
		int var1 = arg0.method229();
		field1039 = new char[var1][];
		field1040 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field1040[var2] = arg0.method224();
			char[] var3 = new char[arg0.method224()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method224();
			}

			field1039[var2] = var3;
		}
	}

	@ObfuscatedName("sc.a(Llb;B)V")
	public static final void method387(class38 arg0) {
		int var1 = arg0.method229();
		field1036 = new char[var1][];
		field1037 = new byte[var1][][];
		method390(field1037, arg0, field1036);
	}

	@ObfuscatedName("sc.b(Llb;B)V")
	public static final void method388(class38 arg0) {
		int var1 = arg0.method229();
		field1038 = new char[var1][];
		method391(arg0, field1038);
	}

	@ObfuscatedName("sc.b(Llb;I)V")
	public static final void method389(class38 arg0) {
		field1035 = new int[arg0.method229()];
		for (int var1 = 0; var1 < field1035.length; var1++) {
			field1035[var1] = arg0.method226();
		}
	}

	@ObfuscatedName("sc.a([[[BBLlb;[[C)V")
	public static final void method390(byte[][][] arg0, class38 arg1, char[][] arg2) {
		for (int var3 = 0; var3 < arg2.length; var3++) {
			char[] var4 = new char[arg1.method224()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg1.method224();
			}

			arg2[var3] = var4;
			byte[][] var6 = new byte[arg1.method224()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg1.method224();
				var6[var7][1] = (byte) arg1.method224();
			}

			if (var6.length > 0) {
				arg0[var3] = var6;
			}
		}
	}

	@ObfuscatedName("sc.a(ILlb;[[C)V")
	public static final void method391(class38 arg0, char[][] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			char[] var3 = new char[arg0.method224()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method224();
			}

			arg1[var2] = var3;
		}
	}

	@ObfuscatedName("sc.a([CI)V")
	public static final void method392(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method393(arg0[var2])) {
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

	@ObfuscatedName("sc.a(CI)Z")
	public static final boolean method393(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("sc.a(Ljava/lang/String;B)Ljava/lang/String;")
	public static final String method394(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method392(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method402(var5);
		method397(var5);
		method398(var5);
		method411(var5);

		for (int var7 = 0; var7 < field1041.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field1041[var7], var8 + 1)) != -1) {
				char[] var9 = field1041[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		method395(var4.toCharArray(), var5);
		method396(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("sc.a([CZ[C)V")
	public static final void method395(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (arg1[var2] != '*' && method419(arg0[var2])) {
				arg1[var2] = arg0[var2];
			}
		}
	}

	@ObfuscatedName("sc.a(I[C)V")
	public static final void method396(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method416(var3)) {
				var1 = true;
			} else if (var1) {
				if (method418(var3)) {
					var1 = false;
				}
			} else if (method419(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("sc.a([CB)V")
	public static final void method397(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field1036.length - 1; var2 >= 0; var2--) {
				method406(field1037[var2], field1036[var2], arg0);
			}
		}
	}

	@ObfuscatedName("sc.b(I[C)V")
	public static final void method398(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method406(null, var2, var1);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method406(null, var4, var3);

		for (int var5 = field1038.length - 1; var5 >= 0; var5--) {
			method399(var1, var3, field1038[var5], arg0);
		}
	}

	@ObfuscatedName("sc.a([C[CI[C[C)V")
	public static final void method399(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg2.length <= arg3.length) {
			boolean var4 = true;
			int var8;
			for (int var5 = 0; var5 <= arg3.length - arg2.length; var5 += var8) {
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

					if (var7 < arg2.length && (var12 = method408(var10, var11, arg2[var7])) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method408(var10, var11, arg2[var7 - 1])) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg2.length || !method414(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg2.length) {
					boolean var14 = false;
					int var15 = method400(var5, arg0, arg3);
					int var16 = method401(arg3, var6 - 1, arg1);
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

	@ObfuscatedName("sc.a(I[C[CI)I")
	public static final int method400(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		for (int var3 = arg0 - 1; var3 >= 0 && method414(arg2[var3]); var3--) {
			if (arg2[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method414(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method414(arg2[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("sc.a([CII[C)I")
	public static final int method401(char[] arg0, int arg1, char[] arg2) {
		if (arg1 + 1 == arg0.length) {
			return 2;
		}

		int var3 = arg1 + 1;
		while (var3 < arg0.length && method414(arg0[var3])) {
			if (arg0[var3] != '.' && arg0[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 + 1; var5 < arg0.length && method414(arg2[var5]); var5++) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method414(arg0[arg1 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("sc.c(I[C)V")
	public static final void method402(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method406(null, var2, var1);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method406(null, var4, var3);

		for (int var5 = 0; var5 < field1039.length; var5++) {
			method403(field1039[var5], var3, var1, field1040[var5], arg0);
		}
	}

	@ObfuscatedName("sc.a([C[C[CIB[C)V")
	public static final void method403(char[] arg0, char[] arg1, char[] arg2, int arg3, char[] arg4) {
		if (arg0.length <= arg4.length) {
			boolean var5 = true;
			int var9;
			for (int var6 = 0; var6 <= arg4.length - arg0.length; var6 += var9) {
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

					if (var8 < arg0.length && (var13 = method408(var11, var12, arg0[var8])) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method408(var11, var12, arg0[var8 - 1])) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg0.length || !method414(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg0.length) {
					boolean var15 = false;
					int var16 = method404(arg4, var6, arg2);
					int var17 = method405(var7 - 1, arg1, arg4);
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
									if (method414(arg4[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method414(arg4[var23])) {
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
										if (arg1[var25] != '*') {
											break;
										}

										var19 = var25;
									} else if (arg1[var25] == '*') {
										var19 = var25;
										var24 = true;
									}
								}
							}

							boolean var26 = false;
							for (int var27 = var19 + 1; var27 < arg4.length; var27++) {
								if (var26) {
									if (method414(arg4[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method414(arg4[var27])) {
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

	@ObfuscatedName("sc.b([CII[C)I")
	public static final int method404(char[] arg0, int arg1, char[] arg2) {
		if (arg1 == 0) {
			return 2;
		}

		int var3 = arg1 - 1;
		while (var3 >= 0 && method414(arg0[var3])) {
			if (arg0[var3] != ',' && arg0[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 - 1; var5 >= 0 && method414(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method414(arg0[arg1 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("sc.a(I[C[CB)I")
	public static final int method405(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg0 + 1;
		while (var3 < arg2.length && method414(arg2[var3])) {
			if (arg2[var3] != '\\' && arg2[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 + 1; var5 < arg2.length && method414(arg1[var5]); var5++) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method414(arg2[arg0 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("sc.a(I[[B[C[C)V")
	public static final void method406(byte[][] arg0, char[] arg1, char[] arg2) {
		if (arg1.length <= arg2.length) {
			boolean var3 = true;
			int var8;
			for (int var4 = 0; var4 <= arg2.length - arg1.length; var4 += var8) {
				int var5 = var4;
				int var6 = 0;
				int var7 = 0;
				var8 = 1;
				boolean var9 = false;
				boolean var10 = false;
				boolean var11 = false;
				while (var5 < arg2.length && (!var10 || !var11)) {
					char var13;
					char var14;
					int var15;
					boolean var12 = false;
					var13 = arg2[var5];
					var14 = 0;
					if (var5 + 1 < arg2.length) {
						var14 = arg2[var5 + 1];
					}

					if (var6 < arg1.length && (var15 = method409(var14, arg1[var6], var13)) > 0) {
						if (var15 == 1 && method417(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (method417(var13) || method417(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = method409(var14, arg1[var6 - 1], var13)) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg1.length || !method415(var13)) {
								break;
							}

							if (method414(var13) && var13 != '\'') {
								var9 = true;
							}

							if (method417(var13)) {
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

				if (var6 >= arg1.length && (!var10 || !var11)) {
					boolean var17 = true;
					if (var9) {
						boolean var22 = false;
						boolean var23 = false;

						if (var4 - 1 < 0 || method414(arg2[var4 - 1]) && arg2[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg2.length || method414(arg2[var5]) && arg2[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!method414(arg2[var25]) || arg2[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg2.length && (!method414(arg2[var25 + var27]) || arg2[var25 + var27] == '\''); var27++) {
										var26[var27] = arg2[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!method414(arg2[var25 - 1]) || arg2[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !method420(var26)) {
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
							var18 = arg2[var4 - 1];
						}

						char var19 = ' ';
						if (var5 < arg2.length) {
							var19 = arg2[var5];
						}

						byte var20 = method410(var18);
						byte var21 = method410(var19);
						if (arg0 != null && method407(arg0, var20, var21)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						int var31 = -1;
						for (int var32 = var4; var32 < var5; var32++) {
							if (method417(arg2[var32])) {
								var29++;
							} else if (method416(arg2[var32])) {
								var30++;
								var31 = var32;
							}
						}

						if (var31 > -1) {
							var29 -= var5 - var31 - 1;
						}

						if (var29 <= var30) {
							for (int var33 = var4; var33 < var5; var33++) {
								arg2[var33] = '*';
							}
						} else {
							var8 = 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("sc.a(I[[BBB)Z")
	public static final boolean method407(byte[][] arg0, byte arg1, byte arg2) {
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

	@ObfuscatedName("sc.a(CICC)I")
	public static final int method408(char arg0, char arg1, char arg2) {
		if (arg0 == arg2) {
			return 1;
		}

		if (arg2 == 'o' && arg0 == '0') {
			return 1;
		}

		if (arg2 == 'o' && arg0 == '(' && arg1 == ')') {
			return 2;
		}

		if (arg2 == 'c' && (arg0 == '(' || arg0 == '<' || arg0 == '[')) {
			return 1;
		}

		if (arg2 == 'e' && arg0 == '€') {
			return 1;
		}

		if (arg2 == 's' && arg0 == '$') {
			return 1;
		}

		if (arg2 == 'l' && arg0 == 'i') {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("sc.a(CCCI)I")
	public static final int method409(char arg0, char arg1, char arg2) {
		if (arg1 == arg2) {
			return 1;
		}

		if (arg1 >= 'a' && arg1 <= 'm') {
			if (arg1 == 'a') {
				if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
					if (arg2 == '/' && arg0 == '\\') {
						return 2;
					}

					return 0;
				}

				return 1;
			}

			if (arg1 == 'b') {
				if (arg2 != '6' && arg2 != '8') {
					if ((arg2 != '1' || arg0 != '3') && (arg2 != 'i' || arg0 != '3')) {
						return 0;
					}

					return 2;
				}

				return 1;
			}

			if (arg1 == 'c') {
				if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'd') {
				if ((arg2 != '[' || arg0 != ')') && (arg2 != 'i' || arg0 != ')')) {
					return 0;
				}

				return 2;
			}

			if (arg1 == 'e') {
				if (arg2 != '3' && arg2 != '€') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'f') {
				if (arg2 == 'p' && arg0 == 'h') {
					return 2;
				}

				if (arg2 == '£') {
					return 1;
				}

				return 0;
			}

			if (arg1 == 'g') {
				if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'h') {
				if (arg2 == '#') {
					return 1;
				}

				return 0;
			}

			if (arg1 == 'i') {
				if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
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
				if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
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
				if (arg2 != '0' && arg2 != '*') {
					if ((arg2 != '(' || arg0 != ')') && (arg2 != '[' || arg0 != ']') && (arg2 != '{' || arg0 != '}') && (arg2 != '<' || arg0 != '>')) {
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
				if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 't') {
				if (arg2 != '7' && arg2 != '+') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'u') {
				if (arg2 == 'v') {
					return 1;
				}

				if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg1 == 'v') {
				if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg1 == 'w') {
				if (arg2 == 'v' && arg0 == 'v') {
					return 2;
				}

				return 0;
			}

			if (arg1 == 'x') {
				if ((arg2 != ')' || arg0 != '(') && (arg2 != '}' || arg0 != '{') && (arg2 != ']' || arg0 != '[') && (arg2 != '>' || arg0 != '<')) {
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
					if (arg2 == 'l') {
						return 1;
					}

					return 0;
				}

				return 0;
			}

			if (arg2 != 'o' && arg2 != 'O') {
				if ((arg2 != '(' || arg0 != ')') && (arg2 != '{' || arg0 != '}') && (arg2 != '[' || arg0 != ']')) {
					return 0;
				}

				return 2;
			}

			return 1;
		}

		if (arg1 == ',') {
			if (arg2 == '.') {
				return 1;
			}

			return 0;
		}

		if (arg1 == '.') {
			if (arg2 == ',') {
				return 1;
			}

			return 0;
		}

		if (arg1 == '!') {
			if (arg2 == 'i') {
				return 1;
			}

			return 0;
		}

		return 0;
	}

	@ObfuscatedName("sc.b(CI)B")
	public static final byte method410(char arg0) {
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

	@ObfuscatedName("sc.b([CI)V")
	public static final void method411(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method412(arg0, var2)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method414(arg0[var6]) && !method415(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method413(arg0, var7);
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

	@ObfuscatedName("sc.a([CZI)I")
	public static final int method412(char[] arg0, int arg1) {
		for (int var2 = arg1; var2 < arg0.length && var2 >= 0; var2++) {
			if (arg0[var2] >= '0' && arg0[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("sc.a([CII)I")
	public static final int method413(char[] arg0, int arg1) {
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

	@ObfuscatedName("sc.a(CZ)Z")
	public static final boolean method414(char arg0) {
		if (!method416(arg0) && !method417(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("sc.c(CI)Z")
	public static final boolean method415(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("sc.d(CI)Z")
	public static final boolean method416(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("sc.a(IC)Z")
	public static final boolean method417(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("sc.a(ZC)Z")
	public static final boolean method418(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("sc.b(CZ)Z")
	public static final boolean method419(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("sc.c([CI)Z")
	public static final boolean method420(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method417(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method421(arg0);
		int var4 = 0;
		int var5 = field1035.length - 1;
		if (field1035[var4] != var3 && field1035[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field1035[var6] == var3) {
					return true;
				}

				if (var3 < field1035[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("sc.d(I[C)I")
	public static final int method421(char[] arg0) {
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
