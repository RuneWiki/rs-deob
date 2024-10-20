package deob;

import java.util.Random;

@ObfuscatedName("mo")
public abstract class class351 extends class449 {

    @ObfuscatedName("mo.o")
    public byte[][] field4196 = new byte[256][];

    @ObfuscatedName("mo.q")
    public int[] field4185;

    @ObfuscatedName("mo.l")
    public int[] field4186;

    @ObfuscatedName("mo.k")
    public int[] field4187;

    @ObfuscatedName("mo.a")
    public int[] field4188;

    @ObfuscatedName("mo.m")
    public int[] field4204;

    @ObfuscatedName("mo.p")
    public int field4189 = 0;

    @ObfuscatedName("mo.s")
    public int field4191;

    @ObfuscatedName("mo.r")
    public int field4195;

    @ObfuscatedName("mo.y")
    public byte[] field4194;

    @ObfuscatedName("mo.c")
    public static int field4190 = -1;

    @ObfuscatedName("mo.w")
    public static int field4199 = -1;

    @ObfuscatedName("mo.b")
    public static int field4197 = -1;

    @ObfuscatedName("mo.t")
    public static int field4198 = -1;

    @ObfuscatedName("mo.g")
    public static int field4184 = 0;

    @ObfuscatedName("mo.x")
    public static int field4200 = 0;

    @ObfuscatedName("mo.n")
    public static int field4201 = 256;

    @ObfuscatedName("mo.e")
    public static int field4202 = 0;

    @ObfuscatedName("mo.h")
    public static int field4203 = 0;

    @ObfuscatedName("mo.f")
    public static Random field4205 = new Random();

    @ObfuscatedName("mo.d")
    public static String[] field4192 = new String[100];

    public class351(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field4188 = arg1;
        this.field4204 = arg2;
        this.field4186 = arg3;
        this.field4187 = arg4;
        this.method5720(arg0);
        this.field4196 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field4204[var10] < var8 && this.field4187[var10] != 0) {
                var8 = this.field4204[var10];
            }
            if (this.field4204[var10] + this.field4187[var10] > var9) {
                var9 = this.field4204[var10] + this.field4187[var10];
            }
        }
        this.field4191 = this.field4189 - var8;
        this.field4195 = var9 - this.field4189;
    }

    public class351(byte[] arg0) {
        this.method5720(arg0);
    }

    @ObfuscatedName("mo.m([B)V")
    public void method5720(byte[] arg0) {
        this.field4185 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4185.length; var2++) {
                this.field4185[var2] = arg0[var2] & 0xFF;
            }
            this.field4189 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4185[var4] = arg0[var3++] & 0xFF;
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
        this.field4194 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4194[(var17 << 8) + var18] = (byte) method5721(var9, var13, var6, this.field4185, var5, var17, var18);
                    }
                }
            }
        }
        this.field4189 = var5[32] + var6[32];
    }

    @ObfuscatedName("mo.p([[B[[B[I[I[III)I")
    public static int method5721(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("mo.s(C)I")
    public int method5722(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4185[class342.method2456(arg0) & 0xFF];
    }

    @ObfuscatedName("mo.r(Ljava/lang/String;)I")
    public int method5723(String arg0) {
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
                                    int var8 = class344.method2246(var7.substring(4));
                                    var4 += Statics.field4193[var8].field4765;
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
                    var4 += this.field4185[(char) (class342.method2456(var6) & 0xFF)];
                    if (this.field4194 != null && var3 != -1) {
                        var4 += this.field4194[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("mo.v(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method5724(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method5722('<');
                        if (this.field4194 != null && var11 != -1) {
                            var4 += this.field4194[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method5722('>');
                        if (this.field4194 != null && var11 != -1) {
                            var4 += this.field4194[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class344.method2246(var16.substring(4));
                            var4 += Statics.field4193[var17].field4765;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method5722(var15);
                        if (this.field4194 != null && var11 != -1) {
                            var4 += this.field4194[(var11 << 8) + var15];
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

    @ObfuscatedName("mo.y(Ljava/lang/String;I)I")
    public int method5725(String arg0, int arg1) {
        int var3 = this.method5724(arg0, new int[] { arg1 }, field4192);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method5723(field4192[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("mo.c(Ljava/lang/String;I)I")
    public int method5813(String arg0, int arg1) {
        return this.method5724(arg0, new int[] { arg1 }, field4192);
    }

    @ObfuscatedName("mo.w(Ljava/lang/String;)Ljava/lang/String;")
    public static String method5790(String arg0) {
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

    @ObfuscatedName("mo.b(IILjava/lang/String;II)Lne;")
    public class385 method5728(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class385(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method5723(arg2) / 2;
        int var7 = var6 + this.method5723(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4191;
        int var9 = this.method5723(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4195 + this.field4191;
        return new class385(var7, var8, var9, var10);
    }

    @ObfuscatedName("mo.t(Ljava/lang/String;IIII)V")
    public void method5729(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5800(arg3, arg4);
            this.method5809(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("mo.g(Ljava/lang/String;IIIII)V")
    public void method5730(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method5800(arg3, arg4);
            field4201 = arg5;
            this.method5809(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("mo.x(Ljava/lang/String;IIII)V")
    public void method5773(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5800(arg3, arg4);
            this.method5809(arg0, arg1 - this.method5723(arg0), arg2);
        }
    }

    @ObfuscatedName("mo.n(Ljava/lang/String;IIII)V")
    public void method5731(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5800(arg3, arg4);
            this.method5809(arg0, arg1 - this.method5723(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("mo.e(Ljava/lang/String;IIIIIIIII)I")
    public int method5732(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method5800(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field4189;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field4195 + this.field4191 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method5724(arg0, var11, field4192);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field4191 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field4191 - this.field4195 - (var12 - 1) * arg9) / 2 + this.field4191 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field4195 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field4191 - this.field4195 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field4191 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method5809(field4192[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method5809(field4192[var15], arg1 + (arg3 - this.method5723(field4192[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method5809(field4192[var15], arg1 + arg3 - this.method5723(field4192[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method5809(field4192[var15], arg1, var13);
            } else {
                this.method5739(field4192[var15], arg3);
                this.method5809(field4192[var15], arg1, var13);
                field4202 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("mo.h(Ljava/lang/String;IIIII)V")
    public void method5733(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5800(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method5719(arg0, arg1 - this.method5723(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("mo.f(Ljava/lang/String;IIIII)V")
    public void method5734(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5800(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method5719(arg0, arg1 - this.method5723(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("mo.d(Ljava/lang/String;IIIIII)V")
    public void method5735(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method5800(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method5719(arg0, arg1 - this.method5723(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("mo.j(Ljava/lang/String;IIIII)V")
    public void method5774(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5800(arg3, arg4);
        field4205.setSeed((long) arg5);
        field4201 = 192 + (field4205.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4205.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method5719(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("mo.z(II)V")
    public void method5800(int arg0, int arg1) {
        field4190 = -1;
        field4199 = -1;
        field4197 = arg1;
        field4198 = arg1;
        field4184 = arg0;
        field4200 = arg0;
        field4201 = 256;
        field4202 = 0;
        field4203 = 0;
    }

    @ObfuscatedName("mo.i(Ljava/lang/String;)V")
    public void method5797(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field4200 = class344.method337(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field4200 = field4184;
            } else if (arg0.startsWith("str=")) {
                field4190 = class344.method337(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field4190 = 8388608;
            } else if (arg0.equals("/str")) {
                field4190 = -1;
            } else if (arg0.startsWith("u=")) {
                field4199 = class344.method337(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field4199 = 0;
            } else if (arg0.equals("/u")) {
                field4199 = -1;
            } else if (arg0.startsWith("shad=")) {
                field4198 = class344.method337(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field4198 = 0;
            } else if (arg0.equals("/shad")) {
                field4198 = field4197;
            } else if (arg0.equals("br")) {
                this.method5800(field4184, field4197);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("mo.u(Ljava/lang/String;I)V")
    public void method5739(String arg0, int arg1) {
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
            field4202 = (arg1 - this.method5723(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("mo.ag(Ljava/lang/String;II)V")
    public void method5809(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4189;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class342.method2456(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class344.method2246(var9.substring(4));
                                        class452 var11 = Statics.field4193[var10];
                                        var11.method7287(arg1, this.field4189 + var4 - var11.field4761);
                                        arg1 += var11.field4765;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method5797(var9);
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
                        if (this.field4194 != null && var6 != -1) {
                            arg1 += this.field4194[(var6 << 8) + var8];
                        }
                        int var13 = this.field4186[var8];
                        int var14 = this.field4187[var8];
                        if (var8 == ' ') {
                            if (field4202 > 0) {
                                field4203 += field4202;
                                arg1 += field4203 >> 8;
                                field4203 &= 0xFF;
                            }
                        } else if (field4201 == 256) {
                            if (field4198 != -1) {
                                method5744(this.field4196[var8], this.field4188[var8] + arg1 + 1, this.field4204[var8] + var4 + 1, var13, var14, field4198);
                            }
                            this.method5714(this.field4196[var8], this.field4188[var8] + arg1, this.field4204[var8] + var4, var13, var14, field4200);
                        } else {
                            if (field4198 != -1) {
                                method5746(this.field4196[var8], this.field4188[var8] + arg1 + 1, this.field4204[var8] + var4 + 1, var13, var14, field4198, field4201);
                            }
                            this.method5715(this.field4196[var8], this.field4188[var8] + arg1, this.field4204[var8] + var4, var13, var14, field4200, field4201);
                        }
                        int var15 = this.field4185[var8];
                        if (field4190 != -1) {
                            method7210(arg1, (int) ((double) this.field4189 * 0.7D) + var4, var15, field4190);
                        }
                        if (field4199 != -1) {
                            method7210(arg1, this.field4189 + var4 + 1, var15, field4199);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("mo.ar(Ljava/lang/String;II[I[I)V")
    public void method5719(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field4189;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class342.method2456(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class344.method2246(var12.substring(4));
                                        class452 var16 = Statics.field4193[var15];
                                        var16.method7287(arg1 + var13, this.field4189 + var6 - var16.field4761 + var14);
                                        arg1 += var16.field4765;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method5797(var12);
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
                        if (this.field4194 != null && var8 != -1) {
                            arg1 += this.field4194[(var8 << 8) + var11];
                        }
                        int var18 = this.field4186[var11];
                        int var19 = this.field4187[var11];
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
                            if (field4202 > 0) {
                                field4203 += field4202;
                                arg1 += field4203 >> 8;
                                field4203 &= 0xFF;
                            }
                        } else if (field4201 == 256) {
                            if (field4198 != -1) {
                                method5744(this.field4196[var11], this.field4188[var11] + arg1 + 1 + var20, this.field4204[var11] + var6 + 1 + var21, var18, var19, field4198);
                            }
                            this.method5714(this.field4196[var11], this.field4188[var11] + arg1 + var20, this.field4204[var11] + var6 + var21, var18, var19, field4200);
                        } else {
                            if (field4198 != -1) {
                                method5746(this.field4196[var11], this.field4188[var11] + arg1 + 1 + var20, this.field4204[var11] + var6 + 1 + var21, var18, var19, field4198, field4201);
                            }
                            this.method5715(this.field4196[var11], this.field4188[var11] + arg1 + var20, this.field4204[var11] + var6 + var21, var18, var19, field4200, field4201);
                        }
                        int var22 = this.field4185[var11];
                        if (field4190 != -1) {
                            method7210(arg1, (int) ((double) this.field4189 * 0.7D) + var6, var22, field4190);
                        }
                        if (field4199 != -1) {
                            method7210(arg1, this.field4189 + var6, var22, field4199);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("mo.am([BIIIII)V")
    public static void method5744(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field4745 * arg2 + arg1;
        int var7 = Statics.field4745 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field4749) {
            int var10 = field4749 - arg2;
            arg4 -= var10;
            arg2 = field4749;
            var9 += arg3 * var10;
            var6 += Statics.field4745 * var10;
        }
        if (arg2 + arg4 > field4747) {
            arg4 -= arg2 + arg4 - field4747;
        }
        if (arg1 < field4748) {
            int var11 = field4748 - arg1;
            arg3 -= var11;
            arg1 = field4748;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field4750) {
            int var12 = arg1 + arg3 - field4750;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5745(Statics.field4744, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("mo.ac([I[BIIIIIII)V")
    public static void method5745(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("mo.ab([BIIIIII)V")
    public static void method5746(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field4745 * arg2 + arg1;
        int var8 = Statics.field4745 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4749) {
            int var11 = field4749 - arg2;
            arg4 -= var11;
            arg2 = field4749;
            var10 += arg3 * var11;
            var7 += Statics.field4745 * var11;
        }
        if (arg2 + arg4 > field4747) {
            arg4 -= arg2 + arg4 - field4747;
        }
        if (arg1 < field4748) {
            int var12 = field4748 - arg1;
            arg3 -= var12;
            arg1 = field4748;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4750) {
            int var13 = arg1 + arg3 - field4750;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5727(Statics.field4744, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("mo.aj([I[BIIIIIIII)V")
    public static void method5727(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("mo.q([BIIIIII)V")
    public abstract void method5715(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("mo.o([BIIIII)V")
    public abstract void method5714(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
