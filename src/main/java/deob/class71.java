package deob;

@ObfuscatedName("sc")
public final class class71 {

	@ObfuscatedName("sc.l")
	public static int[] field1054;

	@ObfuscatedName("sc.m")
	public static char[][] field1055;

	@ObfuscatedName("sc.n")
	public static byte[][][] field1056;

	@ObfuscatedName("sc.o")
	public static char[][] field1057;

	@ObfuscatedName("sc.p")
	public static char[][] field1058;

	@ObfuscatedName("sc.q")
	public static int[] field1059;

	@ObfuscatedName("sc.r")
	public static final String[] field1060 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("sc.a(Lxb;)V")
	public static final void method391(class50 arg0) {
		class38 var1 = new class38(arg0.method299("fragmentsenc.txt", null));
		class38 var2 = new class38(arg0.method299("badenc.txt", null));
		class38 var3 = new class38(arg0.method299("domainenc.txt", null));
		class38 var4 = new class38(arg0.method299("tldlist.txt", null));
		method392(var1, var2, var3, var4);
	}

	@ObfuscatedName("sc.a(Llb;Llb;Llb;Llb;)V")
	public static final void method392(class38 arg0, class38 arg1, class38 arg2, class38 arg3) {
		method394(arg1);
		method395(arg2);
		method396(arg0);
		method393(arg3);
	}

	@ObfuscatedName("sc.a(Llb;I)V")
	public static final void method393(class38 arg0) {
		int var1 = arg0.method234();
		field1058 = new char[var1][];
		field1059 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field1059[var2] = arg0.method229();
			char[] var3 = new char[arg0.method229()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method229();
			}

			field1058[var2] = var3;
		}
	}

	@ObfuscatedName("sc.a(ILlb;)V")
	public static final void method394(class38 arg0) {
		int var1 = arg0.method234();
		field1055 = new char[var1][];
		field1056 = new byte[var1][][];
		method397(field1056, arg0, field1055);
	}

	@ObfuscatedName("sc.b(ILlb;)V")
	public static final void method395(class38 arg0) {
		int var1 = arg0.method234();
		field1057 = new char[var1][];
		method398(arg0, field1057);
	}

	@ObfuscatedName("sc.b(Llb;I)V")
	public static final void method396(class38 arg0) {
		field1054 = new int[arg0.method234()];
		for (int var1 = 0; var1 < field1054.length; var1++) {
			field1054[var1] = arg0.method231();
		}
	}

	@ObfuscatedName("sc.a([[[BZLlb;[[C)V")
	public static final void method397(byte[][][] arg0, class38 arg1, char[][] arg2) {
		for (int var3 = 0; var3 < arg2.length; var3++) {
			char[] var4 = new char[arg1.method229()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg1.method229();
			}

			arg2[var3] = var4;
			byte[][] var6 = new byte[arg1.method229()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg1.method229();
				var6[var7][1] = (byte) arg1.method229();
			}

			if (var6.length > 0) {
				arg0[var3] = var6;
			}
		}
	}

	@ObfuscatedName("sc.a(Llb;[[CI)V")
	public static final void method398(class38 arg0, char[][] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			char[] var3 = new char[arg0.method229()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method229();
			}

			arg1[var2] = var3;
		}
	}

	@ObfuscatedName("sc.a([CZ)V")
	public static final void method399(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method400(arg0[var2])) {
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

	@ObfuscatedName("sc.a(BC)Z")
	public static final boolean method400(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("sc.a(BLjava/lang/String;)Ljava/lang/String;")
	public static final String method401(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method399(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method409(var5);
		method404(var5);
		method405(var5);
		method418(var5);

		for (int var7 = 0; var7 < field1060.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field1060[var7], var8 + 1)) != -1) {
				char[] var9 = field1060[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		method402(var5, var4.toCharArray());
		method403(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("sc.a([C[CZ)V")
	public static final void method402(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			if (arg0[var2] != '*' && method426(arg1[var2])) {
				arg0[var2] = arg1[var2];
			}
		}
	}

	@ObfuscatedName("sc.a([CI)V")
	public static final void method403(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method423(var3)) {
				var1 = true;
			} else if (var1) {
				if (method425(var3)) {
					var1 = false;
				}
			} else if (method426(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("sc.a(I[C)V")
	public static final void method404(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field1055.length - 1; var2 >= 0; var2--) {
				method413(arg0, field1056[var2], field1055[var2]);
			}
		}
	}

	@ObfuscatedName("sc.b([CZ)V")
	public static final void method405(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method413(var1, null, var2);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method413(var3, null, var4);

		for (int var5 = field1057.length - 1; var5 >= 0; var5--) {
			method406(arg0, field1057[var5], var3, var1);
		}
	}

	@ObfuscatedName("sc.a(I[C[C[C[C)V")
	public static final void method406(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg1.length <= arg0.length) {
			boolean var4 = true;
			int var8;
			for (int var5 = 0; var5 <= arg0.length - arg1.length; var5 += var8) {
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

					if (var7 < arg1.length && (var12 = method415(var10, arg1[var7], var11)) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method415(var10, arg1[var7 - 1], var11)) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg1.length || !method421(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg1.length) {
					boolean var14 = false;
					int var15 = method407(var5, arg3, arg0);
					int var16 = method408(arg0, arg2, var6 - 1);
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

	@ObfuscatedName("sc.a(I[C[CB)I")
	public static final int method407(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		for (int var3 = arg0 - 1; var3 >= 0 && method421(arg2[var3]); var3--) {
			if (arg2[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method421(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method421(arg2[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("sc.a([C[CIB)I")
	public static final int method408(char[] arg0, char[] arg1, int arg2) {
		if (arg2 + 1 == arg0.length) {
			return 2;
		}

		int var3 = arg2 + 1;
		while (var3 < arg0.length && method421(arg0[var3])) {
			if (arg0[var3] != '.' && arg0[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg2 + 1; var5 < arg0.length && method421(arg1[var5]); var5++) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method421(arg0[arg2 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("sc.b([CI)V")
	public static final void method409(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method413(var1, null, var2);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method413(var3, null, var4);

		for (int var5 = 0; var5 < field1058.length; var5++) {
			method410(var1, arg0, var3, field1058[var5], field1059[var5]);
		}
	}

	@ObfuscatedName("sc.a(B[C[C[C[CI)V")
	public static final void method410(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4) {
		if (arg3.length <= arg1.length) {
			boolean var5 = true;
			int var9;
			for (int var6 = 0; var6 <= arg1.length - arg3.length; var6 += var9) {
				int var7 = var6;
				int var8 = 0;
				var9 = 1;
				while (var7 < arg1.length) {
					int var13;
					boolean var10 = false;
					char var11 = arg1[var7];
					char var12 = 0;
					if (var7 + 1 < arg1.length) {
						var12 = arg1[var7 + 1];
					}

					if (var8 < arg3.length && (var13 = method415(var11, arg3[var8], var12)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method415(var11, arg3[var8 - 1], var12)) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg3.length || !method421(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg3.length) {
					boolean var15 = false;
					int var16 = method411(arg0, arg1, var6);
					int var17 = method412(arg2, arg1, var7 - 1);
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
									if (method421(arg1[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method421(arg1[var23])) {
									var22 = true;
									var18 = var23;
								}
							}
						}

						if (var17 > 2) {
							if (var17 == 4) {
								boolean var24 = false;
								for (int var25 = var19 + 1; var25 < arg1.length; var25++) {
									if (var24) {
										if (arg2[var25] != '*') {
											break;
										}

										var19 = var25;
									} else if (arg2[var25] == '*') {
										var19 = var25;
										var24 = true;
									}
								}
							}

							boolean var26 = false;
							for (int var27 = var19 + 1; var27 < arg1.length; var27++) {
								if (var26) {
									if (method421(arg1[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method421(arg1[var27])) {
									var26 = true;
									var19 = var27;
								}
							}
						}

						for (int var28 = var18; var28 <= var19; var28++) {
							arg1[var28] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("sc.a([CB[CI)I")
	public static final int method411(char[] arg0, char[] arg1, int arg2) {
		if (arg2 == 0) {
			return 2;
		}

		int var3 = arg2 - 1;
		while (var3 >= 0 && method421(arg1[var3])) {
			if (arg1[var3] != ',' && arg1[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg2 - 1; var5 >= 0 && method421(arg0[var5]); var5--) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method421(arg1[arg2 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("sc.a([CI[CI)I")
	public static final int method412(char[] arg0, char[] arg1, int arg2) {
		if (arg2 + 1 == arg1.length) {
			return 2;
		}

		int var3 = arg2 + 1;
		while (var3 < arg1.length && method421(arg1[var3])) {
			if (arg1[var3] != '\\' && arg1[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg2 + 1; var5 < arg1.length && method421(arg0[var5]); var5++) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method421(arg1[arg2 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("sc.a([C[[B[CB)V")
	public static final void method413(char[] arg0, byte[][] arg1, char[] arg2) {
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

					if (var6 < arg2.length && (var15 = method416(var13, var14, arg2[var6])) > 0) {
						if (var15 == 1 && method424(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (method424(var13) || method424(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = method416(var13, var14, arg2[var6 - 1])) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg2.length || !method422(var13)) {
								break;
							}

							if (method421(var13) && var13 != '\'') {
								var9 = true;
							}

							if (method424(var13)) {
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

						if (var4 - 1 < 0 || method421(arg0[var4 - 1]) && arg0[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg0.length || method421(arg0[var5]) && arg0[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!method421(arg0[var25]) || arg0[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg0.length && (!method421(arg0[var25 + var27]) || arg0[var25 + var27] == '\''); var27++) {
										var26[var27] = arg0[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!method421(arg0[var25 - 1]) || arg0[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !method427(var26)) {
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

						byte var20 = method417(var18);
						byte var21 = method417(var19);
						if (arg1 != null && method414(arg1, var20, var21)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						int var31 = -1;
						for (int var32 = var4; var32 < var5; var32++) {
							if (method424(arg0[var32])) {
								var29++;
							} else if (method423(arg0[var32])) {
								var30++;
								var31 = var32;
							}
						}

						if (var31 > -1) {
							var29 -= var5 - var31 - 1;
						}

						if (var29 <= var30) {
							for (int var33 = var4; var33 < var5; var33++) {
								arg0[var33] = '*';
							}
						} else {
							var8 = 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("sc.a([[BBBI)Z")
	public static final boolean method414(byte[][] arg0, byte arg1, byte arg2) {
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
	public static final int method415(char arg0, char arg1, char arg2) {
		if (arg0 == arg1) {
			return 1;
		}

		if (arg1 == 'o' && arg0 == '0') {
			return 1;
		}

		if (arg1 == 'o' && arg0 == '(' && arg2 == ')') {
			return 2;
		}

		if (arg1 == 'c' && (arg0 == '(' || arg0 == '<' || arg0 == '[')) {
			return 1;
		}

		if (arg1 == 'e' && arg0 == '€') {
			return 1;
		}

		if (arg1 == 's' && arg0 == '$') {
			return 1;
		}

		if (arg1 == 'l' && arg0 == 'i') {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("sc.a(CCCZ)I")
	public static final int method416(char arg0, char arg1, char arg2) {
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
				if (arg0 != '6' && arg0 != '8') {
					if ((arg0 != '1' || arg1 != '3') && (arg0 != 'i' || arg1 != '3')) {
						return 0;
					}

					return 2;
				}

				return 1;
			}

			if (arg2 == 'c') {
				if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'd') {
				if ((arg0 != '[' || arg1 != ')') && (arg0 != 'i' || arg1 != ')')) {
					return 0;
				}

				return 2;
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
				if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
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
				if (arg0 != '7' && arg0 != '+') {
					return 0;
				}

				return 1;
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
				if ((arg0 != '(' || arg1 != ')') && (arg0 != '{' || arg1 != '}') && (arg0 != '[' || arg1 != ']')) {
					return 0;
				}

				return 2;
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

	@ObfuscatedName("sc.a(CZ)B")
	public static final byte method417(char arg0) {
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

	@ObfuscatedName("sc.a([CB)V")
	public static final void method418(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method419(var2, arg0)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method421(arg0[var6]) && !method422(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method420(arg0, var7);
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

	@ObfuscatedName("sc.a(I[CI)I")
	public static final int method419(int arg0, char[] arg1) {
		for (int var2 = arg0; var2 < arg1.length && var2 >= 0; var2++) {
			if (arg1[var2] >= '0' && arg1[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("sc.a(Z[CI)I")
	public static final int method420(char[] arg0, int arg1) {
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

	@ObfuscatedName("sc.a(CB)Z")
	public static final boolean method421(char arg0) {
		if (!method423(arg0) && !method424(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("sc.a(CI)Z")
	public static final boolean method422(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("sc.a(IC)Z")
	public static final boolean method423(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("sc.b(CB)Z")
	public static final boolean method424(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("sc.b(CZ)Z")
	public static final boolean method425(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("sc.b(CI)Z")
	public static final boolean method426(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("sc.a(B[C)Z")
	public static final boolean method427(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method424(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method428(arg0);
		int var4 = 0;
		int var5 = field1054.length - 1;
		if (field1054[var4] != var3 && field1054[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field1054[var6] == var3) {
					return true;
				}

				if (var3 < field1054[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("sc.b([CB)I")
	public static final int method428(char[] arg0) {
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
