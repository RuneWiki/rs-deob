package deob;

import java.util.Random;

@ObfuscatedName("fe")
public abstract class class173 extends class164 {

    @ObfuscatedName("fe.v")
    public byte[][] field2551 = new byte[256][];

    @ObfuscatedName("fe.u")
    public int[] field2546;

    @ObfuscatedName("fe.m")
    public int[] field2547;

    @ObfuscatedName("fe.b")
    public int[] field2552;

    @ObfuscatedName("fe.f")
    public int[] field2558;

    @ObfuscatedName("fe.d")
    public int[] field2550;

    @ObfuscatedName("fe.x")
    public int field2559 = 0;

    @ObfuscatedName("fe.z")
    public int field2562;

    @ObfuscatedName("fe.o")
    public int field2553;

    @ObfuscatedName("fe.y")
    public byte[] field2555;

    @ObfuscatedName("fe.j")
    public static int field2549 = -1;

    @ObfuscatedName("fe.s")
    public static int field2545 = -1;

    @ObfuscatedName("fe.p")
    public static int field2557 = -1;

    @ObfuscatedName("fe.ak")
    public static int field2566 = -1;

    @ObfuscatedName("fe.ap")
    public static int field2560 = 0;

    @ObfuscatedName("fe.ai")
    public static int field2556 = 0;

    @ObfuscatedName("fe.ae")
    public static int field2565 = 256;

    @ObfuscatedName("fe.ad")
    public static int field2563 = 0;

    @ObfuscatedName("fe.am")
    public static int field2564 = 0;

    @ObfuscatedName("fe.ah")
    public static Random field2561 = new Random();

    @ObfuscatedName("fe.au")
    public static String[] field2548 = new String[100];

    public class173(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field2558 = arg1;
        this.field2550 = arg2;
        this.field2547 = arg3;
        this.field2552 = arg4;
        this.method2878(arg0);
        this.field2551 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2550[var10] < var8 && this.field2552[var10] != 0) {
                var8 = this.field2550[var10];
            }
            if (this.field2552[var10] + this.field2550[var10] > var9) {
                var9 = this.field2552[var10] + this.field2550[var10];
            }
        }
        this.field2562 = this.field2559 - var8;
        this.field2553 = var9 - this.field2559;
    }

    public class173(byte[] arg0) {
        this.method2878(arg0);
    }

    @ObfuscatedName("fe.bd([B)V")
    public void method2878(byte[] arg0) {
        this.field2546 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2546.length; var2++) {
                this.field2546[var2] = arg0[var2] & 0xFF;
            }
            this.field2559 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2546[var4] = arg0[var3++] & 0xFF;
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
        this.field2555 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field2555[(var17 << 8) + var18] = (byte) method2884(var9, var13, var6, this.field2546, var5, var17, var18);
                    }
                }
            }
        }
        this.field2559 = var5[32] + var6[32];
    }

    @ObfuscatedName("fe.bo([[B[[B[I[I[III)I")
    public static int method2884(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("fe.bi(C)I")
    public int method2801(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field2546[class84.method867(arg0) & 0xFF];
    }

    @ObfuscatedName("fe.bu(Ljava/lang/String;)I")
    public int method2802(String arg0) {
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
                                    String var8 = var7.substring(4);
                                    int var9 = class82.method740(var8, 10, true);
                                    var4 += Statics.field2554[var9].field2518;
                                    var3 = -1;
                                } catch (Exception var12) {
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
                    var4 += this.field2546[(char) (class84.method867(var6) & 0xFF)];
                    if (this.field2555 != null && var3 != -1) {
                        var4 += this.field2555[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("fe.bt(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method2803(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method2801('<');
                        if (this.field2555 != null && var11 != -1) {
                            var4 += this.field2555[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method2801('>');
                        if (this.field2555 != null && var11 != -1) {
                            var4 += this.field2555[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class82.method740(var17, 10, true);
                            var4 += Statics.field2554[var18].field2518;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.append(var15);
                        var4 += this.method2801(var15);
                        if (this.field2555 != null && var11 != -1) {
                            var4 += this.field2555[(var11 << 8) + var15];
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
        String var21 = var6.toString();
        if (var21.length() > var5) {
            arg2[var12++] = var21.substring(var5, var21.length());
        }
        return var12;
    }

    @ObfuscatedName("fe.br(Ljava/lang/String;I)I")
    public int method2826(String arg0, int arg1) {
        int var3 = this.method2803(arg0, new int[] { arg1 }, field2548);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method2802(field2548[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("fe.bp(Ljava/lang/String;I)I")
    public int method2805(String arg0, int arg1) {
        return this.method2803(arg0, new int[] { arg1 }, field2548);
    }

    @ObfuscatedName("fe.bw(Ljava/lang/String;)Ljava/lang/String;")
    public static String method2806(String arg0) {
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

    @ObfuscatedName("fe.bg(Ljava/lang/String;IIII)V")
    public void method2876(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method2815(arg3, arg4);
            this.method2818(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("fe.bv(Ljava/lang/String;IIII)V")
    public void method2808(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method2815(arg3, arg4);
            this.method2818(arg0, arg1 - this.method2802(arg0), arg2);
        }
    }

    @ObfuscatedName("fe.by(Ljava/lang/String;IIII)V")
    public void method2881(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method2815(arg3, arg4);
            this.method2818(arg0, arg1 - this.method2802(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("fe.bb(Ljava/lang/String;IIIIIIIII)I")
    public int method2810(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method2815(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field2559;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field2562 + this.field2553 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method2803(arg0, var11, field2548);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field2562 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field2562 - this.field2553 - (var12 - 1) * arg9) / 2 + this.field2562 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field2553 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field2562 - this.field2553 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field2562 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method2818(field2548[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method2818(field2548[var15], arg1 + (arg3 - this.method2802(field2548[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method2818(field2548[var15], arg1 + arg3 - this.method2802(field2548[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method2818(field2548[var15], arg1, var13);
            } else {
                this.method2817(field2548[var15], arg3);
                this.method2818(field2548[var15], arg1, var13);
                field2563 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("fe.bc(Ljava/lang/String;IIIII)V")
    public void method2811(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method2815(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method2819(arg0, arg1 - this.method2802(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("fe.bm(Ljava/lang/String;IIIII)V")
    public void method2812(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method2815(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method2819(arg0, arg1 - this.method2802(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("fe.cl(Ljava/lang/String;IIIIII)V")
    public void method2813(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method2815(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method2819(arg0, arg1 - this.method2802(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("fe.cp(Ljava/lang/String;IIIII)V")
    public void method2814(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method2815(arg3, arg4);
        field2561.setSeed((long) arg5);
        field2565 = 192 + (field2561.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field2561.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method2819(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("fe.cb(II)V")
    public void method2815(int arg0, int arg1) {
        field2549 = -1;
        field2545 = -1;
        field2557 = arg1;
        field2566 = arg1;
        field2560 = arg0;
        field2556 = arg0;
        field2565 = 256;
        field2563 = 0;
        field2564 = 0;
    }

    @ObfuscatedName("fe.cd(Ljava/lang/String;)V")
    public void method2828(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class82.method740(var2, 16, true);
                field2556 = var3;
            } else if (arg0.equals("/col")) {
                field2556 = field2560;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class82.method740(var4, 16, true);
                field2549 = var5;
            } else if (arg0.equals("str")) {
                field2549 = 8388608;
            } else if (arg0.equals("/str")) {
                field2549 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class82.method740(var6, 16, true);
                field2545 = var7;
            } else if (arg0.equals("u")) {
                field2545 = 0;
            } else if (arg0.equals("/u")) {
                field2545 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class82.method740(var8, 16, true);
                field2566 = var9;
            } else if (arg0.equals("shad")) {
                field2566 = 0;
            } else if (arg0.equals("/shad")) {
                field2566 = field2557;
            } else if (arg0.equals("br")) {
                this.method2815(field2560, field2557);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("fe.cj(Ljava/lang/String;I)V")
    public void method2817(String arg0, int arg1) {
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
            field2563 = (arg1 - this.method2802(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("fe.cz(Ljava/lang/String;II)V")
    public void method2818(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2559;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class84.method867(arg0.charAt(var7)) & 0xFF);
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
                                        String var10 = var9.substring(4);
                                        int var11 = class82.method740(var10, 10, true);
                                        class171 var13 = Statics.field2554[var11];
                                        var13.method2736(arg1, this.field2559 + var4 - var13.field2514);
                                        arg1 += var13.field2518;
                                        var6 = -1;
                                    } catch (Exception var18) {
                                    }
                                } else {
                                    this.method2828(var9);
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
                        if (this.field2555 != null && var6 != -1) {
                            arg1 += this.field2555[(var6 << 8) + var8];
                        }
                        int var15 = this.field2547[var8];
                        int var16 = this.field2552[var8];
                        if (var8 == ' ') {
                            if (field2563 > 0) {
                                field2564 += field2563;
                                arg1 += field2564 >> 8;
                                field2564 &= 0xFF;
                            }
                        } else if (field2565 == 256) {
                            if (field2566 != -1) {
                                method2822(this.field2551[var8], this.field2558[var8] + arg1 + 1, this.field2550[var8] + var4 + 1, var15, var16, field2566);
                            }
                            this.method2820(this.field2551[var8], this.field2558[var8] + arg1, this.field2550[var8] + var4, var15, var16, field2556);
                        } else {
                            if (field2566 != -1) {
                                method2824(this.field2551[var8], this.field2558[var8] + arg1 + 1, this.field2550[var8] + var4 + 1, var15, var16, field2566, field2565);
                            }
                            this.method2821(this.field2551[var8], this.field2558[var8] + arg1, this.field2550[var8] + var4, var15, var16, field2556, field2565);
                        }
                        int var17 = this.field2546[var8];
                        if (field2549 != -1) {
                            method2616(arg1, (int) ((double) this.field2559 * 0.7D) + var4, var17, field2549);
                        }
                        if (field2545 != -1) {
                            method2616(arg1, this.field2559 + var4 + 1, var17, field2545);
                        }
                        arg1 += var17;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("fe.cm(Ljava/lang/String;II[I[I)V")
    public void method2819(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2559;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class84.method867(arg0.charAt(var10)) & 0xFF);
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
                                        String var15 = var12.substring(4);
                                        int var16 = class82.method740(var15, 10, true);
                                        class171 var18 = Statics.field2554[var16];
                                        var18.method2736(arg1 + var13, this.field2559 + var6 - var18.field2514 + var14);
                                        arg1 += var18.field2518;
                                        var8 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method2828(var12);
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
                        if (this.field2555 != null && var8 != -1) {
                            arg1 += this.field2555[(var8 << 8) + var11];
                        }
                        int var20 = this.field2547[var11];
                        int var21 = this.field2552[var11];
                        int var22;
                        if (arg3 == null) {
                            var22 = 0;
                        } else {
                            var22 = arg3[var9];
                        }
                        int var23;
                        if (arg4 == null) {
                            var23 = 0;
                        } else {
                            var23 = arg4[var9];
                        }
                        var9++;
                        if (var11 == ' ') {
                            if (field2563 > 0) {
                                field2564 += field2563;
                                arg1 += field2564 >> 8;
                                field2564 &= 0xFF;
                            }
                        } else if (field2565 == 256) {
                            if (field2566 != -1) {
                                method2822(this.field2551[var11], this.field2558[var11] + arg1 + 1 + var22, this.field2550[var11] + var6 + 1 + var23, var20, var21, field2566);
                            }
                            this.method2820(this.field2551[var11], this.field2558[var11] + arg1 + var22, this.field2550[var11] + var6 + var23, var20, var21, field2556);
                        } else {
                            if (field2566 != -1) {
                                method2824(this.field2551[var11], this.field2558[var11] + arg1 + 1 + var22, this.field2550[var11] + var6 + 1 + var23, var20, var21, field2566, field2565);
                            }
                            this.method2821(this.field2551[var11], this.field2558[var11] + arg1 + var22, this.field2550[var11] + var6 + var23, var20, var21, field2556, field2565);
                        }
                        int var24 = this.field2546[var11];
                        if (field2549 != -1) {
                            method2616(arg1, (int) ((double) this.field2559 * 0.7D) + var6, var24, field2549);
                        }
                        if (field2545 != -1) {
                            method2616(arg1, this.field2559 + var6, var24, field2545);
                        }
                        arg1 += var24;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("fe.ct([BIIIII)V")
    public static void method2822(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field2477 * arg2 + arg1;
        int var7 = Statics.field2477 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field2479) {
            int var10 = field2479 - arg2;
            arg4 -= var10;
            arg2 = field2479;
            var9 += arg3 * var10;
            var6 += Statics.field2477 * var10;
        }
        if (arg2 + arg4 > field2481) {
            arg4 -= arg2 + arg4 - field2481;
        }
        if (arg1 < field2480) {
            int var11 = field2480 - arg1;
            arg3 -= var11;
            arg1 = field2480;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field2476) {
            int var12 = arg1 + arg3 - field2476;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method2823(Statics.field2482, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("fe.cv([I[BIIIIIII)V")
    public static void method2823(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("fe.cx([BIIIIII)V")
    public static void method2824(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field2477 * arg2 + arg1;
        int var8 = Statics.field2477 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field2479) {
            int var11 = field2479 - arg2;
            arg4 -= var11;
            arg2 = field2479;
            var10 += arg3 * var11;
            var7 += Statics.field2477 * var11;
        }
        if (arg2 + arg4 > field2481) {
            arg4 -= arg2 + arg4 - field2481;
        }
        if (arg1 < field2480) {
            int var12 = field2480 - arg1;
            arg3 -= var12;
            arg1 = field2480;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field2476) {
            int var13 = arg1 + arg3 - field2476;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method2863(Statics.field2482, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("fe.cs([I[BIIIIIIII)V")
    public static void method2863(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("fe.cy([BIIIII)V")
    public abstract void method2820(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("fe.ck([BIIIIII)V")
    public abstract void method2821(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
