package deob;

import java.util.Random;

@ObfuscatedName("gu")
public abstract class class204 extends class74 {

    @ObfuscatedName("gu.x")
    public byte[][] field2956 = new byte[256][];

    @ObfuscatedName("gu.v")
    public int[] field2949;

    @ObfuscatedName("gu.m")
    public int[] field2950;

    @ObfuscatedName("gu.e")
    public int[] field2951;

    @ObfuscatedName("gu.h")
    public int[] field2952;

    @ObfuscatedName("gu.p")
    public int[] field2953;

    @ObfuscatedName("gu.j")
    public int field2948 = 0;

    @ObfuscatedName("gu.i")
    public int field2955;

    @ObfuscatedName("gu.u")
    public int field2963;

    @ObfuscatedName("gu.k")
    public byte[] field2958;

    @ObfuscatedName("gu.q")
    public static int field2959 = -1;

    @ObfuscatedName("gu.t")
    public static int field2961 = -1;

    @ObfuscatedName("gu.o")
    public static int field2962 = -1;

    @ObfuscatedName("gu.z")
    public static int field2960 = -1;

    @ObfuscatedName("gu.d")
    public static int field2954 = 0;

    @ObfuscatedName("gu.y")
    public static int field2964 = 0;

    @ObfuscatedName("gu.a")
    public static int field2965 = 256;

    @ObfuscatedName("gu.n")
    public static int field2966 = 0;

    @ObfuscatedName("gu.ae")
    public static int field2967 = 0;

    @ObfuscatedName("gu.ay")
    public static Random field2968 = new Random();

    @ObfuscatedName("gu.ac")
    public static String[] field2969 = new String[100];

    public class204(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field2952 = arg1;
        this.field2953 = arg2;
        this.field2950 = arg3;
        this.field2951 = arg4;
        this.method3469(arg0);
        this.field2956 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2953[var10] < var8 && this.field2951[var10] != 0) {
                var8 = this.field2953[var10];
            }
            if (this.field2953[var10] + this.field2951[var10] > var9) {
                var9 = this.field2953[var10] + this.field2951[var10];
            }
        }
        this.field2955 = this.field2948 - var8;
        this.field2963 = var9 - this.field2948;
    }

    public class204(byte[] arg0) {
        this.method3469(arg0);
    }

    @ObfuscatedName("gu.x([B)V")
    public void method3469(byte[] arg0) {
        this.field2949 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2949.length; var2++) {
                this.field2949[var2] = arg0[var2] & 0xFF;
            }
            this.field2948 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2949[var4] = arg0[var3++] & 0xFF;
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
        this.field2958 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field2958[(var17 << 8) + var18] = (byte) method3470(var9, var13, var6, this.field2949, var5, var17, var18);
                    }
                }
            }
        }
        this.field2948 = var5[32] + var6[32];
    }

    @ObfuscatedName("gu.v([[B[[B[I[I[III)I")
    public static int method3470(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("gu.m(C)I")
    public int method3551(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field2949[class213.method3558(arg0) & 0xFF];
    }

    @ObfuscatedName("gu.e(Ljava/lang/String;)I")
    public int method3472(String arg0) {
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
                                    int var8 = class211.method600(var7.substring(4));
                                    var4 += Statics.field2957[var8].field1321;
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
                    var4 += this.field2949[(char) (class213.method3558(var6) & 0xFF)];
                    if (this.field2958 != null && var3 != -1) {
                        var4 += this.field2958[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("gu.h(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method3473(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method3551('<');
                        if (this.field2958 != null && var11 != -1) {
                            var4 += this.field2958[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method3551('>');
                        if (this.field2958 != null && var11 != -1) {
                            var4 += this.field2958[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class211.method88(var17, 10, true);
                            var4 += Statics.field2957[var18].field1321;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method3551(var15);
                        if (this.field2958 != null && var11 != -1) {
                            var4 += this.field2958[(var11 << 8) + var15];
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

    @ObfuscatedName("gu.p(Ljava/lang/String;I)I")
    public int method3468(String arg0, int arg1) {
        int var3 = this.method3473(arg0, new int[] { arg1 }, field2969);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method3472(field2969[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("gu.j(Ljava/lang/String;I)I")
    public int method3507(String arg0, int arg1) {
        return this.method3473(arg0, new int[] { arg1 }, field2969);
    }

    @ObfuscatedName("gu.i(Ljava/lang/String;)Ljava/lang/String;")
    public static String method3502(String arg0) {
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

    @ObfuscatedName("gu.u(Ljava/lang/String;IIII)V")
    public void method3477(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3485(arg3, arg4);
            this.method3488(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("gu.l(Ljava/lang/String;IIII)V")
    public void method3478(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3485(arg3, arg4);
            this.method3488(arg0, arg1 - this.method3472(arg0), arg2);
        }
    }

    @ObfuscatedName("gu.k(Ljava/lang/String;IIII)V")
    public void method3475(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3485(arg3, arg4);
            this.method3488(arg0, arg1 - this.method3472(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("gu.q(Ljava/lang/String;IIIIIIIII)I")
    public int method3525(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method3485(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field2948;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field2963 + this.field2955 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method3473(arg0, var11, field2969);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field2955 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field2955 - this.field2963 - (var12 - 1) * arg9) / 2 + this.field2955 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field2963 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field2955 - this.field2963 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field2955 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method3488(field2969[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method3488(field2969[var15], arg1 + (arg3 - this.method3472(field2969[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method3488(field2969[var15], arg1 + arg3 - this.method3472(field2969[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method3488(field2969[var15], arg1, var13);
            } else {
                this.method3487(field2969[var15], arg3);
                this.method3488(field2969[var15], arg1, var13);
                field2966 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("gu.b(Ljava/lang/String;IIIII)V")
    public void method3509(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3485(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method3528(arg0, arg1 - this.method3472(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("gu.w(Ljava/lang/String;IIIII)V")
    public void method3482(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3485(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method3528(arg0, arg1 - this.method3472(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("gu.g(Ljava/lang/String;IIIIII)V")
    public void method3483(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method3485(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method3528(arg0, arg1 - this.method3472(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("gu.s(Ljava/lang/String;IIIII)V")
    public void method3484(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3485(arg3, arg4);
        field2968.setSeed((long) arg5);
        field2965 = 192 + (field2968.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field2968.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method3528(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("gu.c(II)V")
    public void method3485(int arg0, int arg1) {
        field2959 = -1;
        field2961 = -1;
        field2962 = arg1;
        field2960 = arg1;
        field2954 = arg0;
        field2964 = arg0;
        field2965 = 256;
        field2966 = 0;
        field2967 = 0;
    }

    @ObfuscatedName("gu.r(Ljava/lang/String;)V")
    public void method3486(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field2964 = class211.method853(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field2964 = field2954;
            } else if (arg0.startsWith("str=")) {
                field2959 = class211.method853(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field2959 = 8388608;
            } else if (arg0.equals("/str")) {
                field2959 = -1;
            } else if (arg0.startsWith("u=")) {
                field2961 = class211.method853(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field2961 = 0;
            } else if (arg0.equals("/u")) {
                field2961 = -1;
            } else if (arg0.startsWith("shad=")) {
                field2960 = class211.method853(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field2960 = 0;
            } else if (arg0.equals("/shad")) {
                field2960 = field2962;
            } else if (arg0.equals("br")) {
                this.method3485(field2954, field2962);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("gu.f(Ljava/lang/String;I)V")
    public void method3487(String arg0, int arg1) {
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
            field2966 = (arg1 - this.method3472(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("gu.t(Ljava/lang/String;II)V")
    public void method3488(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2948;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class213.method3558(arg0.charAt(var7)) & 0xFF);
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
                                        int var11 = class211.method88(var10, 10, true);
                                        class75 var13 = Statics.field2957[var11];
                                        var13.method1598(arg1, this.field2948 + var4 - var13.field1328);
                                        arg1 += var13.field1321;
                                        var6 = -1;
                                    } catch (Exception var18) {
                                    }
                                } else {
                                    this.method3486(var9);
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
                        if (this.field2958 != null && var6 != -1) {
                            arg1 += this.field2958[(var6 << 8) + var8];
                        }
                        int var15 = this.field2950[var8];
                        int var16 = this.field2951[var8];
                        if (var8 == ' ') {
                            if (field2966 > 0) {
                                field2967 += field2966;
                                arg1 += field2967 >> 8;
                                field2967 &= 0xFF;
                            }
                        } else if (field2965 == 256) {
                            if (field2960 != -1) {
                                method3471(this.field2956[var8], this.field2952[var8] + arg1 + 1, this.field2953[var8] + var4 + 1, var15, var16, field2960);
                            }
                            this.method3490(this.field2956[var8], this.field2952[var8] + arg1, this.field2953[var8] + var4, var15, var16, field2964);
                        } else {
                            if (field2960 != -1) {
                                method3494(this.field2956[var8], this.field2952[var8] + arg1 + 1, this.field2953[var8] + var4 + 1, var15, var16, field2960, field2965);
                            }
                            this.method3491(this.field2956[var8], this.field2952[var8] + arg1, this.field2953[var8] + var4, var15, var16, field2964, field2965);
                        }
                        int var17 = this.field2949[var8];
                        if (field2959 != -1) {
                            method1571(arg1, (int) ((double) this.field2948 * 0.7D) + var4, var17, field2959);
                        }
                        if (field2961 != -1) {
                            method1571(arg1, this.field2948 + var4 + 1, var17, field2961);
                        }
                        arg1 += var17;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gu.o(Ljava/lang/String;II[I[I)V")
    public void method3528(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2948;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class213.method3558(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class211.method600(var12.substring(4));
                                        class75 var16 = Statics.field2957[var15];
                                        var16.method1598(arg1 + var13, this.field2948 + var6 - var16.field1328 + var14);
                                        arg1 += var16.field1321;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method3486(var12);
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
                        if (this.field2958 != null && var8 != -1) {
                            arg1 += this.field2958[(var8 << 8) + var11];
                        }
                        int var18 = this.field2950[var11];
                        int var19 = this.field2951[var11];
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
                            if (field2966 > 0) {
                                field2967 += field2966;
                                arg1 += field2967 >> 8;
                                field2967 &= 0xFF;
                            }
                        } else if (field2965 == 256) {
                            if (field2960 != -1) {
                                method3471(this.field2956[var11], this.field2952[var11] + arg1 + 1 + var20, this.field2953[var11] + var6 + 1 + var21, var18, var19, field2960);
                            }
                            this.method3490(this.field2956[var11], this.field2952[var11] + arg1 + var20, this.field2953[var11] + var6 + var21, var18, var19, field2964);
                        } else {
                            if (field2960 != -1) {
                                method3494(this.field2956[var11], this.field2952[var11] + arg1 + 1 + var20, this.field2953[var11] + var6 + 1 + var21, var18, var19, field2960, field2965);
                            }
                            this.method3491(this.field2956[var11], this.field2952[var11] + arg1 + var20, this.field2953[var11] + var6 + var21, var18, var19, field2964, field2965);
                        }
                        int var22 = this.field2949[var11];
                        if (field2959 != -1) {
                            method1571(arg1, (int) ((double) this.field2948 * 0.7D) + var6, var22, field2959);
                        }
                        if (field2961 != -1) {
                            method1571(arg1, this.field2948 + var6, var22, field2961);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gu.y([BIIIII)V")
    public static void method3471(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field1315 * arg2 + arg1;
        int var7 = Statics.field1315 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field1317) {
            int var10 = field1317 - arg2;
            arg4 -= var10;
            arg2 = field1317;
            var9 += arg3 * var10;
            var6 += Statics.field1315 * var10;
        }
        if (arg2 + arg4 > field1316) {
            arg4 -= arg2 + arg4 - field1316;
        }
        if (arg1 < field1319) {
            int var11 = field1319 - arg1;
            arg3 -= var11;
            arg1 = field1319;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field1320) {
            int var12 = arg1 + arg3 - field1320;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3493(Statics.field1318, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("gu.a([I[BIIIIIII)V")
    public static void method3493(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("gu.n([BIIIIII)V")
    public static void method3494(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field1315 * arg2 + arg1;
        int var8 = Statics.field1315 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1317) {
            int var11 = field1317 - arg2;
            arg4 -= var11;
            arg2 = field1317;
            var10 += arg3 * var11;
            var7 += Statics.field1315 * var11;
        }
        if (arg2 + arg4 > field1316) {
            arg4 -= arg2 + arg4 - field1316;
        }
        if (arg1 < field1319) {
            int var12 = field1319 - arg1;
            arg3 -= var12;
            arg1 = field1319;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field1320) {
            int var13 = arg1 + arg3 - field1320;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3495(Statics.field1318, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("gu.ae([I[BIIIIIIII)V")
    public static void method3495(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("gu.z([BIIIII)V")
    public abstract void method3490(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("gu.d([BIIIIII)V")
    public abstract void method3491(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
