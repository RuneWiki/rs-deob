package deob;

import java.util.Random;

@ObfuscatedName("ri")
public abstract class class466 extends class602 {

	@ObfuscatedName("ri.at")
	public static int field5259 = -1;

	@ObfuscatedName("ri.ac")
	public static int field5249 = -1;

	@ObfuscatedName("ri.ap")
	public static int field5264 = -1;

	@ObfuscatedName("ri.aq")
	public static int field5251 = -1;

	@ObfuscatedName("ri.ao")
	public static int field5263 = 0;

	@ObfuscatedName("ri.as")
	public static int field5253 = 0;

	@ObfuscatedName("ri.al")
	public static int field5254 = 256;

	@ObfuscatedName("ri.au")
	public static int field5255 = 0;

	@ObfuscatedName("ri.ai")
	public static int field5256 = 0;

	@ObfuscatedName("ri.aa")
	public static Random field5257 = new Random();

	@ObfuscatedName("ri.am")
	public static String[] field5262 = new String[100];

	@ObfuscatedName("ri.an")
	public int field5252 = 0;

	@ObfuscatedName("ri.ar")
	public int field5258;

	@ObfuscatedName("ri.ae")
	public int field5261;

	@ObfuscatedName("ri.ay")
	public byte[][] field5250 = new byte[256][];

	@ObfuscatedName("ri.ad")
	public int[] field5246;

	@ObfuscatedName("ri.ag")
	public int[] field5260;

	@ObfuscatedName("ri.av")
	public int[] field5265;

	@ObfuscatedName("ri.ah")
	public int[] field5266;

	@ObfuscatedName("ri.ab")
	public int[] field5267;

	@ObfuscatedName("ri.ax")
	public byte[] field5268;

	public class466(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
		this.field5266 = arg1;
		this.field5267 = arg2;
		this.field5260 = arg3;
		this.field5265 = arg4;
		this.method8756(arg0);
		this.field5250 = arg5;
		int var7 = Integer.MAX_VALUE;
		int var8 = Integer.MIN_VALUE;
		for (int var9 = 0; var9 < 256; var9++) {
			if (this.field5267[var9] < var7 && this.field5265[var9] != 0) {
				var7 = this.field5267[var9];
			}
			if (this.field5267[var9] + this.field5265[var9] > var8) {
				var8 = this.field5267[var9] + this.field5265[var9];
			}
		}
		this.field5258 = this.field5252 - var7;
		this.field5261 = var8 - this.field5252;
	}

	public class466(byte[] arg0) {
		this.method8756(arg0);
	}

	@ObfuscatedName("ri.au([[B[[B[I[I[III)I")
	public static int method8750(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
		int var7 = arg2[arg5];
		int var8 = arg4[arg5] + var7;
		int var9 = arg2[arg6];
		int var10 = arg4[arg6] + var9;
		int var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}
		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}
		int var13 = arg3[arg5];
		if (arg3[arg6] < var13) {
			var13 = arg3[arg6];
		}
		byte[] var14 = arg1[arg5];
		byte[] var15 = arg0[arg6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;
		for (int var18 = var11; var18 < var12; var18++) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}
		return -var13;
	}

	@ObfuscatedName("ri.ai(Ljava/lang/String;)Ljava/lang/String;")
	public static String method8836(String arg0) {
		int var1 = arg0.length();
		int var2 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			char var4 = arg0.charAt(var3);
			if (var4 == '<' || var4 == '>') {
				var2 += 3;
			}
		}
		StringBuilder var5 = new StringBuilder(var1 + var2);
		for (int var6 = 0; var6 < var1; var6++) {
			char var7 = arg0.charAt(var6);
			if (var7 == '<') {
				var5.append("<lt>");
			} else if (var7 == '>') {
				var5.append("<gt>");
			} else {
				var5.append(var7);
			}
		}
		return var5.toString();
	}

	@ObfuscatedName("ri.aa([BIIIII)V")
	public static void method8749(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = Statics.field5990 * arg2 + arg1;
		int var7 = Statics.field5990 - arg3;
		int var8 = 0;
		int var9 = 0;
		if (arg2 < field5993) {
			int var10 = field5993 - arg2;
			arg4 -= var10;
			arg2 = field5993;
			var9 += arg3 * var10;
			var6 += Statics.field5990 * var10;
		}
		if (arg2 + arg4 > field5994) {
			arg4 -= arg2 + arg4 - field5994;
		}
		if (arg1 < field5995) {
			int var11 = field5995 - arg1;
			arg3 -= var11;
			arg1 = field5995;
			var9 += var11;
			var6 += var11;
			var8 += var11;
			var7 += var11;
		}
		if (arg1 + arg3 > field5996) {
			int var12 = arg1 + arg3 - field5996;
			arg3 -= var12;
			var8 += var12;
			var7 += var12;
		}
		if (arg3 > 0 && arg4 > 0) {
			method8753(Statics.field5989, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
		}
	}

	@ObfuscatedName("ri.am([I[BIIIIIII)V")
	public static void method8753(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var9 = -(arg5 >> 2);
		int var10 = -(arg5 & 0x3);
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = var9; var12 < 0; var12++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (int var13 = var10; var13 < 0; var13++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("ri.an([BIIIIII)V")
	public static void method8754(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = Statics.field5990 * arg2 + arg1;
		int var8 = Statics.field5990 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < field5993) {
			int var11 = field5993 - arg2;
			arg4 -= var11;
			arg2 = field5993;
			var10 += arg3 * var11;
			var7 += Statics.field5990 * var11;
		}
		if (arg2 + arg4 > field5994) {
			arg4 -= arg2 + arg4 - field5994;
		}
		if (arg1 < field5995) {
			int var12 = field5995 - arg1;
			arg3 -= var12;
			arg1 = field5995;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}
		if (arg1 + arg3 > field5996) {
			int var13 = arg1 + arg3 - field5996;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			method8798(Statics.field5989, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
		}
	}

	@ObfuscatedName("ri.ar([I[BIIIIIIII)V")
	public static void method8798(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		int var11 = 256 - arg9;
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					int var14 = arg0[arg4];
					arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("ri.ae([B)V")
	public void method8756(byte[] arg0) {
		this.field5246 = new int[256];
		if (arg0.length == 257) {
			for (int var2 = 0; var2 < this.field5246.length; var2++) {
				this.field5246[var2] = arg0[var2] & 0xFF;
			}
			this.field5252 = arg0[256] & 0xFF;
			return;
		}
		int var3 = 0;
		for (int var4 = 0; var4 < 256; var4++) {
			this.field5246[var4] = arg0[var3++] & 0xFF;
		}
		int[] var5 = new int[256];
		int[] var6 = new int[256];
		for (int var7 = 0; var7 < 256; var7++) {
			var5[var7] = arg0[var3++] & 0xFF;
		}
		for (int var8 = 0; var8 < 256; var8++) {
			var6[var8] = arg0[var3++] & 0xFF;
		}
		byte[][] var9 = new byte[256][];
		for (int var10 = 0; var10 < 256; var10++) {
			var9[var10] = new byte[var5[var10]];
			byte var11 = 0;
			for (int var12 = 0; var12 < var9[var10].length; var12++) {
				var11 += arg0[var3++];
				var9[var10][var12] = var11;
			}
		}
		byte[][] var13 = new byte[256][];
		for (int var14 = 0; var14 < 256; var14++) {
			var13[var14] = new byte[var5[var14]];
			byte var15 = 0;
			for (int var16 = 0; var16 < var13[var14].length; var16++) {
				var15 += arg0[var3++];
				var13[var14][var16] = var15;
			}
		}
		this.field5268 = new byte[65536];
		for (int var17 = 0; var17 < 256; var17++) {
			if (var17 != 32 && var17 != 160) {
				for (int var18 = 0; var18 < 256; var18++) {
					if (var18 != 32 && var18 != 160) {
						this.field5268[(var17 << 8) + var18] = (byte) method8750(var9, var13, var6, this.field5246, var5, var17, var18);
					}
				}
			}
		}
		this.field5252 = var5[32] + var6[32];
	}

	@ObfuscatedName("ri.ay(C)I")
	public int method8757(char arg0) {
		if (arg0 == 160) {
			arg0 = ' ';
		}
		return this.field5246[class444.method3389(arg0) & 0xFF];
	}

	@ObfuscatedName("ri.ad(Ljava/lang/String;)I")
	public int method8758(String arg0) {
		if (arg0 == null) {
			return 0;
		}
		int var2 = -1;
		int var3 = -1;
		int var4 = 0;
		for (int var5 = 0; var5 < arg0.length(); var5++) {
			char var6 = arg0.charAt(var5);
			if (var6 == '<') {
				var2 = var5;
			} else {
				if (var6 == '>' && var2 != -1) {
					String var7 = arg0.substring(var2 + 1, var5);
					var2 = -1;
					if (var7.equals("lt")) {
						var6 = '<';
					} else {
						if (!var7.equals("gt")) {
							if (var7.startsWith("img=")) {
								try {
									int var8 = class446.method4011(var7.substring(4));
									var4 += Statics.field5247[var8].field6006;
									var3 = -1;
								} catch (Exception var10) {
								}
							}
							continue;
						}
						var6 = '>';
					}
				}
				if (var6 == 160) {
					var6 = ' ';
				}
				if (var2 == -1) {
					var4 += this.field5246[(char) (class444.method3389(var6) & 0xFF)];
					if (this.field5268 != null && var3 != -1) {
						var4 += this.field5268[(var3 << 8) + var6];
					}
					var3 = var6;
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("ri.ag(Ljava/lang/String;[I[Ljava/lang/String;)I")
	public int method8759(String arg0, int[] arg1, String[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		int var4 = 0;
		int var5 = 0;
		StringBuilder var6 = new StringBuilder(100);
		int var7 = -1;
		int var8 = 0;
		byte var9 = 0;
		int var10 = -1;
		char var11 = 0;
		int var12 = 0;
		int var13 = arg0.length();
		for (int var14 = 0; var14 < var13; var14++) {
			char var15 = arg0.charAt(var14);
			if (var15 == '<') {
				var10 = var14;
			} else {
				if (var15 == '>' && var10 != -1) {
					String var16 = arg0.substring(var10 + 1, var14);
					var10 = -1;
					var6.append('<');
					var6.append(var16);
					var6.append('>');
					if (var16.equals("br")) {
						arg2[var12++] = var6.substring(var5);
						var6.setLength(0);
						var5 = 0;
						var4 = 0;
						var7 = -1;
						var11 = 0;
					} else if (var16.equals("lt")) {
						var4 += this.method8757('<');
						if (this.field5268 != null && var11 != -1) {
							var4 += this.field5268[(var11 << 8) + 60];
						}
						var11 = '<';
					} else if (var16.equals("gt")) {
						var4 += this.method8757('>');
						if (this.field5268 != null && var11 != -1) {
							var4 += this.field5268[(var11 << 8) + 62];
						}
						var11 = '>';
					} else if (var16.startsWith("img=")) {
						try {
							int var17 = class446.method4011(var16.substring(4));
							var4 += Statics.field5247[var17].field6006;
							var11 = 0;
						} catch (Exception var19) {
						}
					}
					var15 = 0;
				}
				if (var10 == -1) {
					if (var15 != 0) {
						var6.append(var15);
						var4 += this.method8757(var15);
						if (this.field5268 != null && var11 != -1) {
							var4 += this.field5268[(var11 << 8) + var15];
						}
						var11 = var15;
					}
					if (var15 == ' ') {
						var7 = var6.length();
						var8 = var4;
						var9 = 1;
					}
					if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
						arg2[var12++] = var6.substring(var5, var7 - var9);
						var5 = var7;
						var7 = -1;
						var4 -= var8;
						var11 = 0;
					}
					if (var15 == '-') {
						var7 = var6.length();
						var8 = var4;
						var9 = 0;
					}
				}
			}
		}
		if (var6.length() > var5) {
			arg2[var12++] = var6.substring(var5);
		}
		return var12;
	}

	@ObfuscatedName("ri.av(Ljava/lang/String;I)I")
	public int method8787(String arg0, int arg1) {
		int var3 = this.method8759(arg0, new int[] { arg1 }, field5262);
		int var4 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = this.method8758(field5262[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}
		return var4;
	}

	@ObfuscatedName("ri.ah(Ljava/lang/String;I)I")
	public int method8761(String arg0, int arg1) {
		return this.method8759(arg0, new int[] { arg1 }, field5262);
	}

	@ObfuscatedName("ri.ab(IILjava/lang/String;II)Lrw;")
	public class450 method8762(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 == null || arg2.length() < arg0 + arg1) {
			return new class450(arg3, arg4, 0, 0);
		}
		int var6 = arg3 - this.method8758(arg2) / 2;
		int var7 = var6 + this.method8758(arg2.substring(0, arg0));
		int var8 = arg4 - this.field5258;
		int var9 = this.method8758(arg2.substring(arg0, arg0 + arg1));
		int var10 = this.field5261 + this.field5258;
		return new class450(var7, var8, var9, var10);
	}

	@ObfuscatedName("ri.ax(Ljava/lang/String;IIII)V")
	public void method8763(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.method8778(arg3, arg4);
			this.method8781(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("ri.ak(Ljava/lang/String;IIIII)V")
	public void method8764(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 != null) {
			this.method8778(arg3, arg4);
			field5254 = arg5;
			this.method8781(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("ri.aj(Ljava/lang/String;IIII)V")
	public void method8815(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.method8778(arg3, arg4);
			this.method8781(arg0, arg1 - this.method8758(arg0), arg2);
		}
	}

	@ObfuscatedName("ri.az(Ljava/lang/String;IIII)V")
	public void method8842(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.method8778(arg3, arg4);
			this.method8781(arg0, arg1 - this.method8758(arg0) / 2, arg2);
		}
	}

	@ObfuscatedName("ri.bt(Ljava/lang/String;IIIIIIIII)I")
	public int method8767(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		return this.method8768(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
	}

	@ObfuscatedName("ri.bs(Ljava/lang/String;IIIIIIIIII)I")
	public int method8768(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		if (arg0 == null) {
			return 0;
		}
		if (arg7 == 255) {
			arg7 = 256;
		}
		this.method8778(arg5, arg6);
		field5254 = arg7;
		if (arg10 == 0) {
			arg10 = this.field5252;
		}
		int[] var12 = new int[] { arg3 };
		if (arg4 < this.field5261 + this.field5258 + arg10 && arg4 < arg10 + arg10) {
			var12 = null;
		}
		int var13 = this.method8759(arg0, var12, field5262);
		if (arg9 == 3 && var13 == 1) {
			arg9 = 1;
		}
		int var14;
		if (arg9 == 0) {
			var14 = this.field5258 + arg2;
		} else if (arg9 == 1) {
			var14 = (arg4 - this.field5258 - this.field5261 - (var13 - 1) * arg10) / 2 + this.field5258 + arg2;
		} else if (arg9 == 2) {
			var14 = arg2 + arg4 - this.field5261 - (var13 - 1) * arg10;
		} else {
			int var15 = (arg4 - this.field5258 - this.field5261 - (var13 - 1) * arg10) / (var13 + 1);
			if (var15 < 0) {
				var15 = 0;
			}
			var14 = this.field5258 + arg2 + var15;
			arg10 += var15;
		}
		for (int var16 = 0; var16 < var13; var16++) {
			if (arg8 == 0) {
				this.method8781(field5262[var16], arg1, var14);
			} else if (arg8 == 1) {
				this.method8781(field5262[var16], arg1 + (arg3 - this.method8758(field5262[var16])) / 2, var14);
			} else if (arg8 == 2) {
				this.method8781(field5262[var16], arg1 + arg3 - this.method8758(field5262[var16]), var14);
			} else if (var13 - 1 == var16) {
				this.method8781(field5262[var16], arg1, var14);
			} else {
				this.method8783(field5262[var16], arg3);
				this.method8781(field5262[var16], arg1, var14);
				field5255 = 0;
			}
			var14 += arg10;
		}
		return var13;
	}

	@ObfuscatedName("ri.bu(Lrh;IIIII)Lvt;")
	public class558 method8769(class467 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (!arg0.method8868()) {
			this.method8778(arg3, arg4);
			int var7 = arg2 - this.field5252;
			for (int var8 = 0; var8 < arg0.method8867(); var8++) {
				class465 var9 = arg0.method8860(var8);
				if (arg5 != -1 && var9.field5245 > arg5) {
					return new class558(var9.field5242, var9.field5245);
				}
				char var10 = var9.field5243;
				if (var10 != '\n') {
					if (arg0.method8852(var8)) {
						var10 = '*';
					}
					if (var10 != '\t') {
						if (var10 == 160) {
							var10 = ' ';
						}
						int var11 = var9.field5242 + arg1;
						int var12 = var9.field5245 + var7;
						int var13 = this.field5260[var10];
						int var14 = this.field5265[var10];
						if (field5251 != -1) {
							this.method8601(this.field5250[var10], this.field5266[var10] + var11 + 1, this.field5267[var10] + var12 + 1, var13, var14, field5251);
						}
						this.method8601(this.field5250[var10], this.field5266[var10] + var11, this.field5267[var10] + var12, var13, var14, field5253);
					}
				}
			}
		}
		return arg0.method8859();
	}

	@ObfuscatedName("ri.bi(Ljava/lang/String;IIIII[I)V")
	public void method8770(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
		if (arg0 == null) {
			return;
		}
		this.method8778(arg3, arg4);
		int[] var8 = null;
		if (arg6 != null) {
			var8 = this.method8775(arg6, arg0.length());
		}
		int[] var9 = new int[arg0.length()];
		for (int var10 = 0; var10 < arg0.length(); var10++) {
			var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
		}
		this.method8782(arg0, arg1 - this.method8758(arg0) / 2, arg2, var8, null, var9);
	}

	@ObfuscatedName("ri.bd(Ljava/lang/String;IIIII[I)V")
	public void method8771(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
		if (arg0 == null) {
			return;
		}
		this.method8778(arg3, arg4);
		int[] var8 = null;
		if (arg6 != null) {
			var8 = this.method8775(arg6, arg0.length());
		}
		int[] var9 = new int[arg0.length()];
		int[] var10 = new int[arg0.length()];
		for (int var11 = 0; var11 < arg0.length(); var11++) {
			var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
			var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
		}
		this.method8782(arg0, arg1 - this.method8758(arg0) / 2, arg2, var8, var9, var10);
	}

	@ObfuscatedName("ri.ba(Ljava/lang/String;IIIIII[I)V")
	public void method8801(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
		if (arg0 == null) {
			return;
		}
		this.method8778(arg3, arg4);
		int[] var9 = null;
		if (arg7 != null) {
			var9 = this.method8775(arg7, arg0.length());
		}
		double var10 = 7.0D - (double) arg6 / 8.0D;
		if (var10 < 0.0D) {
			var10 = 0.0D;
		}
		int[] var12 = new int[arg0.length()];
		for (int var13 = 0; var13 < arg0.length(); var13++) {
			var12[var13] = (int) (Math.sin((double) arg5 / 1.0D + (double) var13 / 1.5D) * var10);
		}
		this.method8782(arg0, arg1 - this.method8758(arg0) / 2, arg2, var9, null, var12);
	}

	@ObfuscatedName("ri.bb(Ljava/lang/String;IIII[I)V")
	public void method8773(String arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
		if (arg0 == null) {
			return;
		}
		this.method8778(arg3, arg4);
		int[] var7 = null;
		if (arg5 != null) {
			var7 = this.method8775(arg5, arg0.length());
		}
		this.method8782(arg0, arg1 - this.method8758(arg0) / 2, arg2, var7, null, null);
	}

	@ObfuscatedName("ri.bo(Ljava/lang/String;IIII[I)V")
	public void method8774(String arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
		if (arg0 == null) {
			return;
		}
		this.method8778(arg3, arg4);
		int[] var7 = null;
		if (arg5 != null) {
			var7 = this.method8775(arg5, arg0.length());
		}
		this.method8782(arg0, arg1, arg2, var7, null, null);
	}

	@ObfuscatedName("ri.bl([II)[I")
	public int[] method8775(int[] arg0, int arg1) {
		if (arg1 == 0) {
			return null;
		}
		int[] var3 = new int[arg1];
		float var4 = (float) arg0.length / (float) arg1;
		for (int var5 = 0; var5 < arg1; var5++) {
			var3[var5] = arg0[(int) ((float) var5 * var4)];
		}
		return var3;
	}

	@ObfuscatedName("ri.by(Ljava/lang/String;IIIII)V")
	public void method8806(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method8778(arg3, arg4);
		field5257.setSeed((long) arg5);
		field5254 = (field5257.nextInt() & 0x1F) + 192;
		int[] var7 = new int[arg0.length()];
		int var8 = 0;
		for (int var9 = 0; var9 < arg0.length(); var9++) {
			var7[var9] = var8;
			if ((field5257.nextInt() & 0x3) == 0) {
				var8++;
			}
		}
		this.method8782(arg0, arg1, arg2, null, var7, null);
	}

	@ObfuscatedName("ri.bg(IIII)V")
	public void method8777(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg2 - this.field5252;
		int var6 = arg0 & 0xFF;
		if (var6 != 32) {
			this.method8601(this.field5250[var6], this.field5266[var6] + arg1, this.field5267[var6] + var5, this.field5260[var6], this.field5265[var6], arg3);
		}
	}

	@ObfuscatedName("ri.bx(II)V")
	public void method8778(int arg0, int arg1) {
		field5259 = -1;
		field5249 = -1;
		field5264 = arg1;
		field5251 = arg1;
		field5263 = arg0;
		field5253 = arg0;
		field5254 = 256;
		field5255 = 0;
		field5256 = 0;
	}

	@ObfuscatedName("ri.bq(Ljava/lang/String;)V")
	public void method8779(String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				field5253 = class446.method464(arg0.substring(4), 16);
			} else if (arg0.equals("/col")) {
				field5253 = field5263;
			} else if (arg0.startsWith("str=")) {
				field5259 = class446.method464(arg0.substring(4), 16);
			} else if (arg0.equals("str")) {
				field5259 = 8388608;
			} else if (arg0.equals("/str")) {
				field5259 = -1;
			} else if (arg0.startsWith("u=")) {
				field5249 = class446.method464(arg0.substring(2), 16);
			} else if (arg0.equals("u")) {
				field5249 = 0;
			} else if (arg0.equals("/u")) {
				field5249 = -1;
			} else if (arg0.startsWith("shad=")) {
				field5251 = class446.method464(arg0.substring(5), 16);
			} else if (arg0.equals("shad")) {
				field5251 = 0;
			} else if (arg0.equals("/shad")) {
				field5251 = field5264;
			} else if (arg0.equals("br")) {
				this.method8778(field5263, field5264);
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("ri.bz(Ljava/lang/String;I)V")
	public void method8783(String arg0, int arg1) {
		int var3 = 0;
		boolean var4 = false;
		for (int var5 = 0; var5 < arg0.length(); var5++) {
			char var6 = arg0.charAt(var5);
			if (var6 == '<') {
				var4 = true;
			} else if (var6 == '>') {
				var4 = false;
			} else if (!var4 && var6 == ' ') {
				var3++;
			}
		}
		if (var3 > 0) {
			field5255 = (arg1 - this.method8758(arg0) << 8) / var3;
		}
	}

	@ObfuscatedName("ri.bn(Ljava/lang/String;II)V")
	public void method8781(String arg0, int arg1, int arg2) {
		int var4 = arg2 - this.field5252;
		int var5 = -1;
		int var6 = -1;
		for (int var7 = 0; var7 < arg0.length(); var7++) {
			if (arg0.charAt(var7) != 0) {
				char var8 = (char) (class444.method3389(arg0.charAt(var7)) & 0xFF);
				if (var8 == '<') {
					var5 = var7;
				} else {
					if (var8 == '>' && var5 != -1) {
						String var9 = arg0.substring(var5 + 1, var7);
						var5 = -1;
						if (var9.equals("lt")) {
							var8 = '<';
						} else {
							if (!var9.equals("gt")) {
								if (var9.startsWith("img=")) {
									try {
										int var10 = class446.method4011(var9.substring(4));
										class605 var11 = Statics.field5247[var10];
										var11.method10780(arg1, this.field5252 + var4 - var11.field6009);
										arg1 += var11.field6006;
										var6 = -1;
									} catch (Exception var16) {
									}
								} else {
									this.method8779(var9);
								}
								continue;
							}
							var8 = '>';
						}
					}
					if (var8 == 160) {
						var8 = ' ';
					}
					if (var5 == -1) {
						if (this.field5268 != null && var6 != -1) {
							arg1 += this.field5268[(var6 << 8) + var8];
						}
						int var13 = this.field5260[var8];
						int var14 = this.field5265[var8];
						if (var8 == ' ') {
							if (field5255 > 0) {
								field5256 += field5255;
								arg1 += field5256 >> 8;
								field5256 &= 0xFF;
							}
						} else if (field5254 == 256) {
							if (field5251 != -1) {
								method8749(this.field5250[var8], this.field5266[var8] + arg1 + 1, this.field5267[var8] + var4 + 1, var13, var14, field5251);
							}
							this.method8601(this.field5250[var8], this.field5266[var8] + arg1, this.field5267[var8] + var4, var13, var14, field5253);
						} else {
							if (field5251 != -1) {
								method8754(this.field5250[var8], this.field5266[var8] + arg1 + 1, this.field5267[var8] + var4 + 1, var13, var14, field5251, field5254);
							}
							this.method8603(this.field5250[var8], this.field5266[var8] + arg1, this.field5267[var8] + var4, var13, var14, field5253, field5254);
						}
						int var15 = this.field5246[var8];
						if (field5259 != -1) {
							method10685(arg1, (int) ((double) this.field5252 * 0.7D) + var4, var15, field5259);
						}
						if (field5249 != -1) {
							method10685(arg1, this.field5252 + var4 + 1, var15, field5249);
						}
						arg1 += var15;
						var6 = var8;
					}
				}
			}
		}
	}

	@ObfuscatedName("ri.be(Ljava/lang/String;II[I[I[I)V")
	public void method8782(String arg0, int arg1, int arg2, int[] arg3, int[] arg4, int[] arg5) {
		int var7 = arg2 - this.field5252;
		int var8 = -1;
		int var9 = -1;
		int var10 = 0;
		for (int var11 = 0; var11 < arg0.length(); var11++) {
			if (arg0.charAt(var11) != 0) {
				char var12 = (char) (class444.method3389(arg0.charAt(var11)) & 0xFF);
				if (var12 == '<') {
					var8 = var11;
				} else {
					if (var12 == '>' && var8 != -1) {
						String var13 = arg0.substring(var8 + 1, var11);
						var8 = -1;
						if (var13.equals("lt")) {
							var12 = '<';
						} else {
							if (!var13.equals("gt")) {
								if (var13.startsWith("img=")) {
									try {
										int var14;
										if (arg4 == null) {
											var14 = 0;
										} else {
											var14 = arg4[var10];
										}
										int var15;
										if (arg5 == null) {
											var15 = 0;
										} else {
											var15 = arg5[var10];
										}
										var10++;
										int var16 = class446.method4011(var13.substring(4));
										class605 var17 = Statics.field5247[var16];
										var17.method10780(arg1 + var14, this.field5252 + var7 - var17.field6009 + var15);
										arg1 += var17.field6006;
										var9 = -1;
									} catch (Exception var25) {
									}
								} else {
									this.method8779(var13);
								}
								continue;
							}
							var12 = '>';
						}
					}
					if (var12 == 160) {
						var12 = ' ';
					}
					if (var8 == -1) {
						if (this.field5268 != null && var9 != -1) {
							arg1 += this.field5268[(var9 << 8) + var12];
						}
						int var19 = this.field5260[var12];
						int var20 = this.field5265[var12];
						int var21;
						if (arg4 == null) {
							var21 = 0;
						} else {
							var21 = arg4[var10];
						}
						int var22;
						if (arg5 == null) {
							var22 = 0;
						} else {
							var22 = arg5[var10];
						}
						int var23;
						if (arg3 == null) {
							var23 = field5253;
						} else {
							var23 = arg3[var10];
						}
						var10++;
						if (var12 == ' ') {
							if (field5255 > 0) {
								field5256 += field5255;
								arg1 += field5256 >> 8;
								field5256 &= 0xFF;
							}
						} else if (field5254 == 256) {
							if (field5251 != -1) {
								method8749(this.field5250[var12], this.field5266[var12] + arg1 + 1 + var21, this.field5267[var12] + var7 + 1 + var22, var19, var20, field5251);
							}
							this.method8601(this.field5250[var12], this.field5266[var12] + arg1 + var21, this.field5267[var12] + var7 + var22, var19, var20, var23);
						} else {
							if (field5251 != -1) {
								method8754(this.field5250[var12], this.field5266[var12] + arg1 + 1 + var21, this.field5267[var12] + var7 + 1 + var22, var19, var20, field5251, field5254);
							}
							this.method8603(this.field5250[var12], this.field5266[var12] + arg1 + var21, this.field5267[var12] + var7 + var22, var19, var20, var23, field5254);
						}
						int var24 = this.field5246[var12];
						if (field5259 != -1) {
							method10685(arg1, (int) ((double) this.field5252 * 0.7D) + var7, var24, field5259);
						}
						if (field5249 != -1) {
							method10685(arg1, this.field5252 + var7, var24, field5249);
						}
						arg1 += var24;
						var9 = var12;
					}
				}
			}
		}
	}

	@ObfuscatedName("ri.af([BIIIII)V")
	public abstract void method8601(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("ri.aw([BIIIIII)V")
	public abstract void method8603(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
