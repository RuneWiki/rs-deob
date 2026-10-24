package jagex2.wordenc;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("RKAYAFDQ")
public final class WordFilter {

	@ObfuscatedName("RKAYAFDQ.u")
	public static final String[] WHITELIST = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("RKAYAFDQ.o")
	public static int[] fragments;

	@ObfuscatedName("RKAYAFDQ.t")
	public static int[] tldType;

	@ObfuscatedName("RKAYAFDQ.p")
	public static char[][] badWords;

	@ObfuscatedName("RKAYAFDQ.r")
	public static char[][] domains;

	@ObfuscatedName("RKAYAFDQ.s")
	public static char[][] tlds;

	@ObfuscatedName("RKAYAFDQ.q")
	public static byte[][][] badCombinations;

	@ObfuscatedName("RKAYAFDQ.a(LXTGLDHGX;)V")
	public static final void unpack(Jagfile arg0) {
		Packet var1 = new Packet(arg0.read("fragmentsenc.txt", null));
		Packet var2 = new Packet(arg0.read("badenc.txt", null));
		Packet var3 = new Packet(arg0.read("domainenc.txt", null));
		Packet var4 = new Packet(arg0.read("tldlist.txt", null));
		read(var1, var2, var3, var4);
	}

	@ObfuscatedName("RKAYAFDQ.a(LMBMGIXGO;LMBMGIXGO;LMBMGIXGO;LMBMGIXGO;)V")
	public static final void read(Packet arg0, Packet arg1, Packet arg2, Packet arg3) {
		readBadWords(arg1);
		readDomains(arg2);
		readFragments(arg0);
		readTld(arg3);
	}

	@ObfuscatedName("RKAYAFDQ.a(BLMBMGIXGO;)V")
	public static final void readTld(Packet arg0) {
		int var1 = arg0.g4();
		tlds = new char[var1][];
		tldType = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			tldType[var2] = arg0.g1();
			char[] var3 = new char[arg0.g1()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.g1();
			}

			tlds[var2] = var3;
		}
	}

	@ObfuscatedName("RKAYAFDQ.a(ILMBMGIXGO;)V")
	public static final void readBadWords(Packet arg0) {
		int var1 = arg0.g4();
		badWords = new char[var1][];
		badCombinations = new byte[var1][][];
		readBadCombinations(arg0, badWords, badCombinations);
	}

	@ObfuscatedName("RKAYAFDQ.a(LMBMGIXGO;B)V")
	public static final void readDomains(Packet arg0) {
		int var1 = arg0.g4();
		domains = new char[var1][];
		readDomain(domains, arg0);
	}

	@ObfuscatedName("RKAYAFDQ.a(LMBMGIXGO;Z)V")
	public static final void readFragments(Packet arg0) {
		fragments = new int[arg0.g4()];
		for (int var1 = 0; var1 < fragments.length; var1++) {
			fragments[var1] = arg0.g2();
		}
	}

	@ObfuscatedName("RKAYAFDQ.a(LMBMGIXGO;[[CZ[[[B)V")
	public static final void readBadCombinations(Packet arg0, char[][] arg1, byte[][][] arg2) {
		for (int var3 = 0; var3 < arg1.length; var3++) {
			char[] var4 = new char[arg0.g1()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg0.g1();
			}

			arg1[var3] = var4;
			byte[][] var6 = new byte[arg0.g1()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg0.g1();
				var6[var7][1] = (byte) arg0.g1();
			}

			if (var6.length > 0) {
				arg2[var3] = var6;
			}
		}
	}

	@ObfuscatedName("RKAYAFDQ.a([[CLMBMGIXGO;I)V")
	public static final void readDomain(char[][] arg0, Packet arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char[] var3 = new char[arg1.g1()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg1.g1();
			}

			arg0[var2] = var3;
		}
	}

	@ObfuscatedName("RKAYAFDQ.a(Z[C)V")
	public static final void filterCharacters(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (allowCharacters(arg0[var2])) {
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

	@ObfuscatedName("RKAYAFDQ.a(CI)Z")
	public static final boolean allowCharacters(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("RKAYAFDQ.a(Ljava/lang/String;I)Ljava/lang/String;")
	public static final String filter(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		filterCharacters(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		filterTld(var5);
		filterBad(var5);
		filterDomains(var5);
		filterFragments(var5);

		for (int var7 = 0; var7 < WHITELIST.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(WHITELIST[var7], var8 + 1)) != -1) {
				char[] var9 = WHITELIST[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		replaceUpperCases(var4.toCharArray(), var5);
		formatUpperCases(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("RKAYAFDQ.a([CI[C)V")
	public static final void replaceUpperCases(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (arg1[var2] != '*' && isUpperCase(arg0[var2])) {
				arg1[var2] = arg0[var2];
			}
		}
	}

	@ObfuscatedName("RKAYAFDQ.a(I[C)V")
	public static final void formatUpperCases(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!isAlpha(var3)) {
				var1 = true;
			} else if (var1) {
				if (isLowerCase(var3)) {
					var1 = false;
				}
			} else if (isUpperCase(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("RKAYAFDQ.a([CZ)V")
	public static final void filterBad(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = badWords.length - 1; var2 >= 0; var2--) {
				filter(badCombinations[var2], arg0, badWords[var2]);
			}
		}
	}

	@ObfuscatedName("RKAYAFDQ.a(B[C)V")
	public static final void filterDomains(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		filter(null, var1, var2);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		filter(null, var3, var4);

		for (int var5 = domains.length - 1; var5 >= 0; var5--) {
			filterDomain(arg0, domains[var5], var3, var1);
		}
	}

	@ObfuscatedName("RKAYAFDQ.a(I[C[C[C[C)V")
	public static final void filterDomain(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
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

					if (var7 < arg1.length && (var12 = getEmulatedDomainCharSize(var10, arg1[var7], var11)) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = getEmulatedDomainCharSize(var10, arg1[var7 - 1], var11)) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg1.length || !isSymbol(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg1.length) {
					boolean var14 = false;
					int var15 = getDomainAtFilterStatus(arg0, arg3, var5);
					int var16 = getDomainDotFilterStatus(arg2, var6 - 1, arg0);
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

	@ObfuscatedName("RKAYAFDQ.a([CI[CI)I")
	public static final int getDomainAtFilterStatus(char[] arg0, char[] arg1, int arg2) {
		if (arg2 == 0) {
			return 2;
		}

		for (int var3 = arg2 - 1; var3 >= 0 && isSymbol(arg0[var3]); var3--) {
			if (arg0[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg2 - 1; var5 >= 0 && isSymbol(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (isSymbol(arg0[arg2 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("RKAYAFDQ.a(B[CI[C)I")
	public static final int getDomainDotFilterStatus(char[] arg0, int arg1, char[] arg2) {
		if (arg1 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg1 + 1;
		while (var3 < arg2.length && isSymbol(arg2[var3])) {
			if (arg2[var3] != '.' && arg2[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 + 1; var5 < arg2.length && isSymbol(arg0[var5]); var5++) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (isSymbol(arg2[arg1 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("RKAYAFDQ.b(Z[C)V")
	public static final void filterTld(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		filter(null, var1, var2);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		filter(null, var3, var4);

		for (int var5 = 0; var5 < tlds.length; var5++) {
			filterTld(var3, tlds[var5], tldType[var5], var1, arg0);
		}
	}

	@ObfuscatedName("RKAYAFDQ.a([C[CIB[C[C)V")
	public static final void filterTld(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4) {
		if (arg1.length <= arg4.length) {
			boolean var5 = true;
			int var9;
			for (int var6 = 0; var6 <= arg4.length - arg1.length; var6 += var9) {
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

					if (var8 < arg1.length && (var13 = getEmulatedDomainCharSize(var11, arg1[var8], var12)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = getEmulatedDomainCharSize(var11, arg1[var8 - 1], var12)) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg1.length || !isSymbol(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg1.length) {
					boolean var15 = false;
					int var16 = getTldDotFilterStatus(arg4, var6, arg3);
					int var17 = getTldSlashFilterStatus(arg4, arg0, var7 - 1);
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
										if (arg3[var21] != '*') {
											break;
										}

										var18 = var21;
									} else if (arg3[var21] == '*') {
										var18 = var21;
										var20 = true;
									}
								}
							}

							boolean var22 = false;
							for (int var23 = var18 - 1; var23 >= 0; var23--) {
								if (var22) {
									if (isSymbol(arg4[var23])) {
										break;
									}

									var18 = var23;
								} else if (!isSymbol(arg4[var23])) {
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
									if (isSymbol(arg4[var27])) {
										break;
									}

									var19 = var27;
								} else if (!isSymbol(arg4[var27])) {
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

	@ObfuscatedName("RKAYAFDQ.a(I[CI[C)I")
	public static final int getTldDotFilterStatus(char[] arg0, int arg1, char[] arg2) {
		if (arg1 == 0) {
			return 2;
		}

		int var3 = arg1 - 1;
		while (var3 >= 0 && isSymbol(arg0[var3])) {
			if (arg0[var3] != ',' && arg0[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 - 1; var5 >= 0 && isSymbol(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (isSymbol(arg0[arg1 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("RKAYAFDQ.a(Z[C[CI)I")
	public static final int getTldSlashFilterStatus(char[] arg0, char[] arg1, int arg2) {
		if (arg2 + 1 == arg0.length) {
			return 2;
		}

		int var3 = arg2 + 1;
		while (var3 < arg0.length && isSymbol(arg0[var3])) {
			if (arg0[var3] != '\\' && arg0[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg2 + 1; var5 < arg0.length && isSymbol(arg1[var5]); var5++) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (isSymbol(arg0[arg2 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("RKAYAFDQ.a([[B[CI[C)V")
	public static final void filter(byte[][] arg0, char[] arg1, char[] arg2) {
		if (arg2.length <= arg1.length) {
			boolean var3 = true;
			int var8;
			for (int var4 = 0; var4 <= arg1.length - arg2.length; var4 += var8) {
				int var5 = var4;
				int var6 = 0;
				int var7 = 0;
				var8 = 1;
				boolean var9 = false;
				boolean var10 = false;
				boolean var11 = false;
				while (var5 < arg1.length && (!var10 || !var11)) {
					char var13;
					char var14;
					int var15;
					boolean var12 = false;
					var13 = arg1[var5];
					var14 = 0;
					if (var5 + 1 < arg1.length) {
						var14 = arg1[var5 + 1];
					}

					if (var6 < arg2.length && (var15 = getEmulatedSize(var14, var13, arg2[var6])) > 0) {
						if (var15 == 1 && isNumber(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (isNumber(var13) || isNumber(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = getEmulatedSize(var14, var13, arg2[var6 - 1])) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg2.length || !isLowerCaseAlpha(var13)) {
								break;
							}

							if (isSymbol(var13) && var13 != '\'') {
								var9 = true;
							}

							if (isNumber(var13)) {
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

						if (var4 - 1 < 0 || isSymbol(arg1[var4 - 1]) && arg1[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg1.length || isSymbol(arg1[var5]) && arg1[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!isSymbol(arg1[var25]) || arg1[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg1.length && (!isSymbol(arg1[var25 + var27]) || arg1[var25 + var27] == '\''); var27++) {
										var26[var27] = arg1[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!isSymbol(arg1[var25 - 1]) || arg1[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !isBadFragment(var26)) {
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
							var18 = arg1[var4 - 1];
						}

						char var19 = ' ';
						if (var5 < arg1.length) {
							var19 = arg1[var5];
						}

						byte var20 = getIndex(var18);
						byte var21 = getIndex(var19);
						if (arg0 != null && comboMatches(var20, arg0, var21)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						int var31 = -1;
						for (int var32 = var4; var32 < var5; var32++) {
							if (isNumber(arg1[var32])) {
								var29++;
							} else if (isAlpha(arg1[var32])) {
								var30++;
								var31 = var32;
							}
						}

						if (var31 > -1) {
							var29 -= var5 - var31 - 1;
						}

						if (var29 <= var30) {
							for (int var33 = var4; var33 < var5; var33++) {
								arg1[var33] = '*';
							}
						} else {
							var8 = 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("RKAYAFDQ.a(BB[[BB)Z")
	public static final boolean comboMatches(byte arg0, byte[][] arg1, byte arg2) {
		int var3 = 0;
		if (arg1[var3][0] == arg0 && arg1[var3][1] == arg2) {
			return true;
		}

		int var4 = arg1.length - 1;
		if (arg1[var4][0] == arg0 && arg1[var4][1] == arg2) {
			return true;
		}

		do {
			int var5 = (var3 + var4) / 2;
			if (arg1[var5][0] == arg0 && arg1[var5][1] == arg2) {
				return true;
			}

			if (arg0 < arg1[var5][0] || arg1[var5][0] == arg0 && arg2 < arg1[var5][1]) {
				var4 = var5;
			} else {
				var3 = var5;
			}
		} while (var3 != var4 && var3 + 1 != var4);

		return false;
	}

	@ObfuscatedName("RKAYAFDQ.a(ICCC)I")
	public static final int getEmulatedDomainCharSize(char arg0, char arg1, char arg2) {
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

	@ObfuscatedName("RKAYAFDQ.a(CCZC)I")
	public static final int getEmulatedSize(char arg0, char arg1, char arg2) {
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
					if ((arg1 != '1' || arg0 != '3') && (arg1 != 'i' || arg0 != '3')) {
						return 0;
					}

					return 2;
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
				if ((arg1 != '[' || arg0 != ')') && (arg1 != 'i' || arg0 != ')')) {
					return 0;
				}

				return 2;
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
				if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
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

	@ObfuscatedName("RKAYAFDQ.b(CI)B")
	public static final byte getIndex(char arg0) {
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

	@ObfuscatedName("RKAYAFDQ.a([CI)V")
	public static final void filterFragments(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = indexOfNumber(arg0, var2)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!isSymbol(arg0[var6]) && !isLowerCaseAlpha(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = indexOfNonNumber(arg0, var7);
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

	@ObfuscatedName("RKAYAFDQ.a([CII)I")
	public static final int indexOfNumber(char[] arg0, int arg1) {
		for (int var2 = arg1; var2 < arg0.length && var2 >= 0; var2++) {
			if (arg0[var2] >= '0' && arg0[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("RKAYAFDQ.b([CII)I")
	public static final int indexOfNonNumber(char[] arg0, int arg1) {
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

	@ObfuscatedName("RKAYAFDQ.a(IC)Z")
	public static final boolean isSymbol(char arg0) {
		if (!isAlpha(arg0) && !isNumber(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("RKAYAFDQ.a(ZC)Z")
	public static final boolean isLowerCaseAlpha(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("RKAYAFDQ.c(CI)Z")
	public static final boolean isAlpha(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("RKAYAFDQ.d(CI)Z")
	public static final boolean isNumber(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("RKAYAFDQ.e(CI)Z")
	public static final boolean isLowerCase(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("RKAYAFDQ.b(ZC)Z")
	public static final boolean isUpperCase(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("RKAYAFDQ.a([CB)Z")
	public static final boolean isBadFragment(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!isNumber(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = firstFragmentId(arg0);
		int var4 = 0;
		int var5 = fragments.length - 1;
		if (fragments[var4] != var3 && fragments[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (fragments[var6] == var3) {
					return true;
				}

				if (var3 < fragments[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("RKAYAFDQ.b([CI)I")
	public static final int firstFragmentId(char[] arg0) {
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
