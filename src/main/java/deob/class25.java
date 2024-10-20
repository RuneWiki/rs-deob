package deob;

import java.util.Random;

@ObfuscatedName("gu")
public abstract class class25 extends class146 {

    @ObfuscatedName("gu.f")
    public int field242;

    @ObfuscatedName("gu.g")
    public static int field249 = -1;

    @ObfuscatedName("gu.d")
    public int[] field243;

    @ObfuscatedName("gu.b")
    public byte[][] field241 = new byte[256][];

    @ObfuscatedName("gu.c")
    public static int field252 = 256;

    @ObfuscatedName("gu.a")
    public static int field250 = -1;

    @ObfuscatedName("gu.l")
    public int field244 = 0;

    @ObfuscatedName("gu.m")
    public static int field254 = 0;

    @ObfuscatedName("gu.k")
    public int[] field255;

    @ObfuscatedName("gu.h")
    public int[] field239;

    @ObfuscatedName("gu.w")
    public int[] field245;

    @ObfuscatedName("gu.v")
    public static int field256 = 0;

    @ObfuscatedName("gu.u")
    public static int field240 = -1;

    @ObfuscatedName("gu.t")
    public int[] field238;

    @ObfuscatedName("gu.s")
    public int field246;

    @ObfuscatedName("gu.p")
    public static int field253 = 0;

    @ObfuscatedName("gu.y")
    public static int field258 = -1;

    @ObfuscatedName("gu.x")
    public byte[] field248;

    @ObfuscatedName("gu.ax")
    public static Random field251 = new Random();

    @ObfuscatedName("gu.aw")
    public static String[] field259 = new String[100];

    @ObfuscatedName("gu.ac")
    public static int field257 = 0;

    public class25(byte[] arg0) {
        this.method356(arg0);
    }

    @ObfuscatedName("gu.m(Ljava/lang/String;IIIIII)V")
    public void method278(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method320(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method334(arg0, arg1 - this.method281(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("gu.x([[B[[B[I[I[III)I")
    public static int method279(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("gu.c(Ljava/lang/String;IIIII)V")
    public void method280(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method320(arg3, arg4);
        field251.setSeed((long) arg5);
        field252 = 192 + (field251.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field251.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method334(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("gu.o(Ljava/lang/String;)I")
    public int method281(String arg0) {
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
                                    int var8 = class91.method2282(var7.substring(4));
                                    var4 += Statics.field247[var8].field2243;
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
                    var4 += this.field239[(char) (class101.method2323(var6) & 0xFF)];
                    if (this.field248 != null && var3 != -1) {
                        var4 += this.field248[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("gu.ai([I[BIIIIIIII)V")
    public static void method283(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("gu.y(Ljava/lang/String;IIIIIIIII)I")
    public int method284(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method320(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field244;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field246 + this.field242 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method337(arg0, var11, field259);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field242 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field242 - this.field246 - (var12 - 1) * arg9) / 2 + this.field242 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field246 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field242 - this.field246 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field242 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method296(field259[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method296(field259[var15], arg1 + (arg3 - this.method281(field259[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method296(field259[var15], arg1 + arg3 - this.method281(field259[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method296(field259[var15], arg1, var13);
            } else {
                this.method295(field259[var15], arg3);
                this.method296(field259[var15], arg1, var13);
                field256 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("gu.r(Ljava/lang/String;IIII)V")
    public void method286(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method320(arg3, arg4);
            this.method296(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("gu.n(Ljava/lang/String;IIII)V")
    public void method287(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method320(arg3, arg4);
            this.method296(arg0, arg1 - this.method281(arg0), arg2);
        }
    }

    @ObfuscatedName("gu.q(Ljava/lang/String;I)I")
    public int method289(String arg0, int arg1) {
        int var3 = this.method337(arg0, new int[] { arg1 }, field259);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method281(field259[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("gu.a(Ljava/lang/String;IIIII)V")
    public void method290(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method320(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method334(arg0, arg1 - this.method281(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("gu.p(Ljava/lang/String;IIIII)V")
    public void method291(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method320(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method334(arg0, arg1 - this.method281(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("gu.z(Ljava/lang/String;I)I")
    public int method292(String arg0, int arg1) {
        return this.method337(arg0, new int[] { arg1 }, field259);
    }

    @ObfuscatedName("gu.ax(Ljava/lang/String;I)V")
    public void method295(String arg0, int arg1) {
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
            field256 = (arg1 - this.method281(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("gu.aw(Ljava/lang/String;II)V")
    public void method296(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field244;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class101.method2323(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class91.method2282(var9.substring(4));
                                        class148 var11 = Statics.field247[var10];
                                        var11.method2463(arg1, this.field244 + var4 - var11.field2240);
                                        arg1 += var11.field2243;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method346(var9);
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
                        if (this.field248 != null && var6 != -1) {
                            arg1 += this.field248[(var6 << 8) + var8];
                        }
                        int var13 = this.field255[var8];
                        int var14 = this.field245[var8];
                        if (var8 == ' ') {
                            if (field256 > 0) {
                                field257 += field256;
                                arg1 += field257 >> 8;
                                field257 &= 0xFF;
                            }
                        } else if (field252 == 256) {
                            if (field250 != -1) {
                                method299(this.field241[var8], this.field238[var8] + arg1 + 1, this.field243[var8] + var4 + 1, var13, var14, field250);
                            }
                            this.method274(this.field241[var8], this.field238[var8] + arg1, this.field243[var8] + var4, var13, var14, field254);
                        } else {
                            if (field250 != -1) {
                                method303(this.field241[var8], this.field238[var8] + arg1 + 1, this.field243[var8] + var4 + 1, var13, var14, field250, field252);
                            }
                            this.method267(this.field241[var8], this.field238[var8] + arg1, this.field243[var8] + var4, var13, var14, field254, field252);
                        }
                        int var15 = this.field239[var8];
                        if (field249 != -1) {
                            method2404(arg1, (int) ((double) this.field244 * 0.7D) + var4, var15, field249);
                        }
                        if (field240 != -1) {
                            method2404(arg1, this.field244 + var4 + 1, var15, field240);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gu.h([BIIIIII)V")
    public abstract void method267(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("gu.ak([BIIIII)V")
    public static void method299(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field2209 * arg2 + arg1;
        int var7 = Statics.field2209 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field2211) {
            int var10 = field2211 - arg2;
            arg4 -= var10;
            arg2 = field2211;
            var9 += arg3 * var10;
            var6 += Statics.field2209 * var10;
        }
        if (arg2 + arg4 > field2212) {
            arg4 -= arg2 + arg4 - field2212;
        }
        if (arg1 < field2214) {
            int var11 = field2214 - arg1;
            arg3 -= var11;
            arg1 = field2214;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field2208) {
            int var12 = arg1 + arg3 - field2208;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method324(Statics.field2213, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("gu.u(Ljava/lang/String;IIII)V")
    public void method302(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method320(arg3, arg4);
            this.method296(arg0, arg1 - this.method281(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("gu.ar([BIIIIII)V")
    public static void method303(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field2209 * arg2 + arg1;
        int var8 = Statics.field2209 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field2211) {
            int var11 = field2211 - arg2;
            arg4 -= var11;
            arg2 = field2211;
            var10 += arg3 * var11;
            var7 += Statics.field2209 * var11;
        }
        if (arg2 + arg4 > field2212) {
            arg4 -= arg2 + arg4 - field2212;
        }
        if (arg1 < field2214) {
            int var12 = field2214 - arg1;
            arg3 -= var12;
            arg1 = field2214;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field2208) {
            int var13 = arg1 + arg3 - field2208;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method283(Statics.field2213, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    public class25(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field238 = arg1;
        this.field243 = arg2;
        this.field255 = arg3;
        this.field245 = arg4;
        this.method356(arg0);
        this.field241 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field243[var10] < var8 && this.field245[var10] != 0) {
                var8 = this.field243[var10];
            }
            if (this.field245[var10] + this.field243[var10] > var9) {
                var9 = this.field245[var10] + this.field243[var10];
            }
        }
        this.field242 = this.field244 - var8;
        this.field246 = var9 - this.field244;
    }

    @ObfuscatedName("gu.v(II)V")
    public void method320(int arg0, int arg1) {
        field249 = -1;
        field240 = -1;
        field258 = arg1;
        field250 = arg1;
        field253 = arg0;
        field254 = arg0;
        field252 = 256;
        field256 = 0;
        field257 = 0;
    }

    @ObfuscatedName("gu.ab([I[BIIIIIII)V")
    public static void method324(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("gu.b([BIIIII)V")
    public abstract void method274(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("gu.aq(Ljava/lang/String;II[I[I)V")
    public void method334(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field244;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class101.method2323(arg0.charAt(var10)) & 0xFF);
                if (var11 == '<') {
                    var7 = var10;
                } else {
                    if (var11 == '>' && var7 != -1) {
                        String var12 = arg0.substring(var7 + 1, var10);
                        var7 = -1;
                        if (var12.equals("lt")) {
                            var11 = '<';
                        } else {
                            if (!var12.equals("gt")) {
                                if (var12.startsWith("img=")) {
                                    try {
                                        int var13;
                                        if (arg3 == null) {
                                            var13 = 0;
                                        } else {
                                            var13 = arg3[var9];
                                        }
                                        int var14;
                                        if (arg4 == null) {
                                            var14 = 0;
                                        } else {
                                            var14 = arg4[var9];
                                        }
                                        var9++;
                                        int var15 = class91.method2282(var12.substring(4));
                                        class148 var16 = Statics.field247[var15];
                                        var16.method2463(arg1 + var13, this.field244 + var6 - var16.field2240 + var14);
                                        arg1 += var16.field2243;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method346(var12);
                                }
                                continue;
                            }
                            var11 = '>';
                        }
                    }
                    if (var11 == 160) {
                        var11 = ' ';
                    }
                    if (var7 == -1) {
                        if (this.field248 != null && var8 != -1) {
                            arg1 += this.field248[(var8 << 8) + var11];
                        }
                        int var18 = this.field255[var11];
                        int var19 = this.field245[var11];
                        int var20;
                        if (arg3 == null) {
                            var20 = 0;
                        } else {
                            var20 = arg3[var9];
                        }
                        int var21;
                        if (arg4 == null) {
                            var21 = 0;
                        } else {
                            var21 = arg4[var9];
                        }
                        var9++;
                        if (var11 == ' ') {
                            if (field256 > 0) {
                                field257 += field256;
                                arg1 += field257 >> 8;
                                field257 &= 0xFF;
                            }
                        } else if (field252 == 256) {
                            if (field250 != -1) {
                                method299(this.field241[var11], this.field238[var11] + arg1 + 1 + var20, this.field243[var11] + var6 + 1 + var21, var18, var19, field250);
                            }
                            this.method274(this.field241[var11], this.field238[var11] + arg1 + var20, this.field243[var11] + var6 + var21, var18, var19, field254);
                        } else {
                            if (field250 != -1) {
                                method303(this.field241[var11], this.field238[var11] + arg1 + 1 + var20, this.field243[var11] + var6 + 1 + var21, var18, var19, field250, field252);
                            }
                            this.method267(this.field241[var11], this.field238[var11] + arg1 + var20, this.field243[var11] + var6 + var21, var18, var19, field254, field252);
                        }
                        int var22 = this.field239[var11];
                        if (field249 != -1) {
                            method2404(arg1, (int) ((double) this.field244 * 0.7D) + var6, var22, field249);
                        }
                        if (field240 != -1) {
                            method2404(arg1, this.field244 + var6, var22, field240);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gu.e(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method337(String arg0, int[] arg1, String[] arg2) {
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
                        arg2[var12] = var6.toString().substring(var5, var6.length());
                        var12++;
                        var5 = var6.length();
                        var4 = 0;
                        var7 = -1;
                        var11 = 0;
                    } else if (var16.equals("lt")) {
                        var4 += this.method362('<');
                        if (this.field248 != null && var11 != -1) {
                            var4 += this.field248[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method362('>');
                        if (this.field248 != null && var11 != -1) {
                            var4 += this.field248[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class91.method2282(var16.substring(4));
                            var4 += Statics.field247[var17].field2243;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.append(var15);
                        var4 += this.method362(var15);
                        if (this.field248 != null && var11 != -1) {
                            var4 += this.field248[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == ' ') {
                        var7 = var6.length();
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12] = var6.toString().substring(var5, var7 - var9);
                        var12++;
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
        String var19 = var6.toString();
        if (var19.length() > var5) {
            arg2[var12++] = var19.substring(var5, var19.length());
        }
        return var12;
    }

    @ObfuscatedName("gu.ac(Ljava/lang/String;)V")
    public void method346(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field254 = class91.method2314(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field254 = field253;
            } else if (arg0.startsWith("str=")) {
                field249 = class91.method2314(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field249 = 8388608;
            } else if (arg0.equals("/str")) {
                field249 = -1;
            } else if (arg0.startsWith("u=")) {
                field240 = class91.method2314(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field240 = 0;
            } else if (arg0.equals("/u")) {
                field240 = -1;
            } else if (arg0.startsWith("shad=")) {
                field250 = class91.method2314(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field250 = 0;
            } else if (arg0.equals("/shad")) {
                field250 = field258;
            } else if (arg0.equals("br")) {
                this.method320(field253, field258);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("gu.j([B)V")
    public void method356(byte[] arg0) {
        this.field239 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field239.length; var2++) {
                this.field239[var2] = arg0[var2] & 0xFF;
            }
            this.field244 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field239[var4] = arg0[var3++] & 0xFF;
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
        this.field248 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field248[(var17 << 8) + var18] = (byte) method279(var9, var13, var6, this.field239, var5, var17, var18);
                    }
                }
            }
        }
        this.field244 = var5[32] + var6[32];
    }

    @ObfuscatedName("gu.i(Ljava/lang/String;)Ljava/lang/String;")
    public static String method357(String arg0) {
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

    @ObfuscatedName("gu.g(C)I")
    public int method362(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field239[class101.method2323(arg0) & 0xFF];
    }
}
