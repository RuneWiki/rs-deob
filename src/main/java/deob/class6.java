package deob;

import java.util.Random;

@ObfuscatedName("gf")
public abstract class class6 extends class139 {

    @ObfuscatedName("gf.g")
    public int field28;

    @ObfuscatedName("gf.d")
    public static int field30 = 256;

    @ObfuscatedName("gf.e")
    public int field21;

    @ObfuscatedName("gf.b")
    public static int field25 = -1;

    @ObfuscatedName("gf.a")
    public static int field31 = 0;

    @ObfuscatedName("gf.n")
    public int field19 = 0;

    @ObfuscatedName("gf.o")
    public int[] field15;

    @ObfuscatedName("gf.j")
    public byte[][] field23 = new byte[256][];

    @ObfuscatedName("gf.k")
    public static int field17 = 0;

    @ObfuscatedName("gf.h")
    public int[] field20;

    @ObfuscatedName("gf.u")
    public static int field34 = -1;

    @ObfuscatedName("gf.t")
    public int[] field27;

    @ObfuscatedName("gf.r")
    public int[] field18;

    @ObfuscatedName("gf.q")
    public static int field29 = 0;

    @ObfuscatedName("gf.p")
    public int[] field14;

    @ObfuscatedName("gf.z")
    public static int field24 = -1;

    @ObfuscatedName("gf.y")
    public static int field13 = -1;

    @ObfuscatedName("gf.x")
    public byte[] field26;

    @ObfuscatedName("gf.at")
    public static Random field33 = new Random();

    @ObfuscatedName("gf.au")
    public static String[] field16 = new String[100];

    @ObfuscatedName("gf.aa")
    public static int field32 = 0;

    @ObfuscatedName("gf.e([[B[[B[I[I[III)I")
    public static int method55(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("gf.f(C)I")
    public int method56(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field14[class89.method1531(arg0) & 0xFF];
    }

    @ObfuscatedName("gf.z(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method58(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method56('<');
                        if (this.field26 != null && var11 != -1) {
                            var4 += this.field26[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method56('>');
                        if (this.field26 != null && var11 != -1) {
                            var4 += this.field26[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class99.method2705(var16.substring(4));
                            var4 += Statics.field22[var17].field2177;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.append(var15);
                        var4 += this.method56(var15);
                        if (this.field26 != null && var11 != -1) {
                            var4 += this.field26[(var11 << 8) + var15];
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

    @ObfuscatedName("gf.l(Ljava/lang/String;I)I")
    public int method59(String arg0, int arg1) {
        int var3 = this.method58(arg0, new int[] { arg1 }, field16);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method89(field16[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("gf.ax([I[BIIIIIII)V")
    public static void method60(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("gf.i(Ljava/lang/String;)Ljava/lang/String;")
    public static String method61(String arg0) {
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

    @ObfuscatedName("gf.s(Ljava/lang/String;IIII)V")
    public void method62(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method84(arg3, arg4);
            this.method123(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("gf.m(Ljava/lang/String;IIII)V")
    public void method63(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method84(arg3, arg4);
            this.method123(arg0, arg1 - this.method89(arg0), arg2);
        }
    }

    @ObfuscatedName("gf.c(Ljava/lang/String;IIIIIIIII)I")
    public int method65(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method84(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field19;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field28 + this.field21 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method58(arg0, var11, field16);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field28 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field28 - this.field21 - (var12 - 1) * arg9) / 2 + this.field28 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field21 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field28 - this.field21 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field28 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method123(field16[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method123(field16[var15], arg1 + (arg3 - this.method89(field16[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method123(field16[var15], arg1 + arg3 - this.method89(field16[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method123(field16[var15], arg1, var13);
            } else {
                this.method85(field16[var15], arg3);
                this.method123(field16[var15], arg1, var13);
                field31 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("gf.b(Ljava/lang/String;IIIIII)V")
    public void method68(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method84(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method74(arg0, arg1 - this.method89(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("gf.d(Ljava/lang/String;)V")
    public void method71(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field29 = class99.method997(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field29 = field17;
            } else if (arg0.startsWith("str=")) {
                field24 = class99.method997(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field24 = 8388608;
            } else if (arg0.equals("/str")) {
                field24 = -1;
            } else if (arg0.startsWith("u=")) {
                field34 = class99.method997(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field34 = 0;
            } else if (arg0.equals("/u")) {
                field34 = -1;
            } else if (arg0.startsWith("shad=")) {
                field25 = class99.method997(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field25 = 0;
            } else if (arg0.equals("/shad")) {
                field25 = field13;
            } else if (arg0.equals("br")) {
                this.method84(field17, field13);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("gf.at(Ljava/lang/String;II[I[I)V")
    public void method74(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field19;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class89.method1531(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class99.method2705(var12.substring(4));
                                        class145 var16 = Statics.field22[var15];
                                        var16.method2710(arg1 + var13, this.field19 + var6 - var16.field2181 + var14);
                                        arg1 += var16.field2177;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method71(var12);
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
                        if (this.field26 != null && var8 != -1) {
                            arg1 += this.field26[(var8 << 8) + var11];
                        }
                        int var18 = this.field15[var11];
                        int var19 = this.field27[var11];
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
                            if (field31 > 0) {
                                field32 += field31;
                                arg1 += field32 >> 8;
                                field32 &= 0xFF;
                            }
                        } else if (field30 == 256) {
                            if (field25 != -1) {
                                method77(this.field23[var11], this.field20[var11] + arg1 + 1 + var20, this.field18[var11] + var6 + 1 + var21, var18, var19, field25);
                            }
                            this.method75(this.field23[var11], this.field20[var11] + arg1 + var20, this.field18[var11] + var6 + var21, var18, var19, field29);
                        } else {
                            if (field25 != -1) {
                                method79(this.field23[var11], this.field20[var11] + arg1 + 1 + var20, this.field18[var11] + var6 + 1 + var21, var18, var19, field25, field30);
                            }
                            this.method76(this.field23[var11], this.field20[var11] + arg1 + var20, this.field18[var11] + var6 + var21, var18, var19, field29, field30);
                        }
                        int var22 = this.field14[var11];
                        if (field24 != -1) {
                            method2348(arg1, (int) ((double) this.field19 * 0.7D) + var6, var22, field24);
                        }
                        if (field34 != -1) {
                            method2348(arg1, this.field19 + var6, var22, field34);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gf.j([BIIIII)V")
    public abstract void method75(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("gf.p([BIIIIII)V")
    public abstract void method76(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("gf.au([BIIIII)V")
    public static void method77(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field2034 * arg2 + arg1;
        int var7 = Statics.field2034 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field2037) {
            int var10 = field2037 - arg2;
            arg4 -= var10;
            arg2 = field2037;
            var9 += arg3 * var10;
            var6 += Statics.field2034 * var10;
        }
        if (arg2 + arg4 > field2038) {
            arg4 -= arg2 + arg4 - field2038;
        }
        if (arg1 < field2039) {
            int var11 = field2039 - arg1;
            arg3 -= var11;
            arg1 = field2039;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field2040) {
            int var12 = arg1 + arg3 - field2040;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method60(Statics.field2036, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("gf.ag([BIIIIII)V")
    public static void method79(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field2034 * arg2 + arg1;
        int var8 = Statics.field2034 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field2037) {
            int var11 = field2037 - arg2;
            arg4 -= var11;
            arg2 = field2037;
            var10 += arg3 * var11;
            var7 += Statics.field2034 * var11;
        }
        if (arg2 + arg4 > field2038) {
            arg4 -= arg2 + arg4 - field2038;
        }
        if (arg1 < field2039) {
            int var12 = field2039 - arg1;
            arg3 -= var12;
            arg1 = field2039;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field2040) {
            int var13 = arg1 + arg3 - field2040;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method80(Statics.field2036, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("gf.ah([I[BIIIIIIII)V")
    public static void method80(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("gf.v(Ljava/lang/String;IIII)V")
    public void method81(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method84(arg3, arg4);
            this.method123(arg0, arg1 - this.method89(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("gf.q(II)V")
    public void method84(int arg0, int arg1) {
        field24 = -1;
        field34 = -1;
        field13 = arg1;
        field25 = arg1;
        field17 = arg0;
        field29 = arg0;
        field30 = 256;
        field31 = 0;
        field32 = 0;
    }

    @ObfuscatedName("gf.a(Ljava/lang/String;I)V")
    public void method85(String arg0, int arg1) {
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
            field31 = (arg1 - this.method89(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("gf.y(Ljava/lang/String;IIIII)V")
    public void method88(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method84(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method74(arg0, arg1 - this.method89(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("gf.x(Ljava/lang/String;)I")
    public int method89(String arg0) {
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
                                    int var8 = class99.method2705(var7.substring(4));
                                    var4 += Statics.field22[var8].field2177;
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
                    var4 += this.field14[(char) (class89.method1531(var6) & 0xFF)];
                    if (this.field26 != null && var3 != -1) {
                        var4 += this.field26[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    public class6(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field20 = arg1;
        this.field18 = arg2;
        this.field15 = arg3;
        this.field27 = arg4;
        this.method99(arg0);
        this.field23 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field18[var10] < var8 && this.field27[var10] != 0) {
                var8 = this.field18[var10];
            }
            if (this.field27[var10] + this.field18[var10] > var9) {
                var9 = this.field27[var10] + this.field18[var10];
            }
        }
        this.field28 = this.field19 - var8;
        this.field21 = var9 - this.field19;
    }

    @ObfuscatedName("gf.g([B)V")
    public void method99(byte[] arg0) {
        this.field14 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field14.length; var2++) {
                this.field14[var2] = arg0[var2] & 0xFF;
            }
            this.field19 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field14[var4] = arg0[var3++] & 0xFF;
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
        this.field26 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field26[(var17 << 8) + var18] = (byte) method55(var9, var13, var6, this.field14, var5, var17, var18);
                    }
                }
            }
        }
        this.field19 = var5[32] + var6[32];
    }

    @ObfuscatedName("gf.k(Ljava/lang/String;IIIII)V")
    public void method122(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method84(arg3, arg4);
        field33.setSeed((long) arg5);
        field30 = 192 + (field33.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field33.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method74(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("gf.aa(Ljava/lang/String;II)V")
    public void method123(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field19;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class89.method1531(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class99.method2705(var9.substring(4));
                                        class145 var11 = Statics.field22[var10];
                                        var11.method2710(arg1, this.field19 + var4 - var11.field2181);
                                        arg1 += var11.field2177;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method71(var9);
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
                        if (this.field26 != null && var6 != -1) {
                            arg1 += this.field26[(var6 << 8) + var8];
                        }
                        int var13 = this.field15[var8];
                        int var14 = this.field27[var8];
                        if (var8 == ' ') {
                            if (field31 > 0) {
                                field32 += field31;
                                arg1 += field32 >> 8;
                                field32 &= 0xFF;
                            }
                        } else if (field30 == 256) {
                            if (field25 != -1) {
                                method77(this.field23[var8], this.field20[var8] + arg1 + 1, this.field18[var8] + var4 + 1, var13, var14, field25);
                            }
                            this.method75(this.field23[var8], this.field20[var8] + arg1, this.field18[var8] + var4, var13, var14, field29);
                        } else {
                            if (field25 != -1) {
                                method79(this.field23[var8], this.field20[var8] + arg1 + 1, this.field18[var8] + var4 + 1, var13, var14, field25, field30);
                            }
                            this.method76(this.field23[var8], this.field20[var8] + arg1, this.field18[var8] + var4, var13, var14, field29, field30);
                        }
                        int var15 = this.field14[var8];
                        if (field24 != -1) {
                            method2348(arg1, (int) ((double) this.field19 * 0.7D) + var4, var15, field24);
                        }
                        if (field34 != -1) {
                            method2348(arg1, this.field19 + var4 + 1, var15, field34);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    public class6(byte[] arg0) {
        this.method99(arg0);
    }

    @ObfuscatedName("gf.u(Ljava/lang/String;IIIII)V")
    public void method148(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method84(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method74(arg0, arg1 - this.method89(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("gf.w(Ljava/lang/String;I)I")
    public int method151(String arg0, int arg1) {
        return this.method58(arg0, new int[] { arg1 }, field16);
    }
}
