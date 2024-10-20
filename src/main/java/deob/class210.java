package deob;

import java.util.Random;

@ObfuscatedName("hx")
public abstract class class210 extends class220 {

    @ObfuscatedName("hx.b")
    public byte[][] field3104 = new byte[256][];

    @ObfuscatedName("hx.l")
    public int[] field3100;

    @ObfuscatedName("hx.i")
    public int[] field3101;

    @ObfuscatedName("hx.t")
    public int[] field3113;

    @ObfuscatedName("hx.k")
    public int[] field3110;

    @ObfuscatedName("hx.h")
    public int[] field3116;

    @ObfuscatedName("hx.n")
    public int field3105 = 0;

    @ObfuscatedName("hx.f")
    public int field3106;

    @ObfuscatedName("hx.a")
    public int field3117;

    @ObfuscatedName("hx.x")
    public byte[] field3109;

    @ObfuscatedName("hx.z")
    public static int field3103 = -1;

    @ObfuscatedName("hx.p")
    public static int field3111 = -1;

    @ObfuscatedName("hx.s")
    public static int field3112 = -1;

    @ObfuscatedName("hx.o")
    public static int field3119 = -1;

    @ObfuscatedName("hx.y")
    public static int field3114 = 0;

    @ObfuscatedName("hx.w")
    public static int field3115 = 0;

    @ObfuscatedName("hx.m")
    public static int field3107 = 256;

    @ObfuscatedName("hx.u")
    public static int field3099 = 0;

    @ObfuscatedName("hx.q")
    public static int field3118 = 0;

    @ObfuscatedName("hx.c")
    public static Random field3108 = new Random();

    @ObfuscatedName("hx.v")
    public static String[] field3120 = new String[100];

    public class210(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3110 = arg1;
        this.field3116 = arg2;
        this.field3101 = arg3;
        this.field3113 = arg4;
        this.method3761(arg0);
        this.field3104 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3116[var10] < var8 && this.field3113[var10] != 0) {
                var8 = this.field3116[var10];
            }
            if (this.field3116[var10] + this.field3113[var10] > var9) {
                var9 = this.field3116[var10] + this.field3113[var10];
            }
        }
        this.field3106 = this.field3105 - var8;
        this.field3117 = var9 - this.field3105;
    }

    public class210(byte[] arg0) {
        this.method3761(arg0);
    }

    @ObfuscatedName("hx.y([B)V")
    public void method3761(byte[] arg0) {
        this.field3100 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3100.length; var2++) {
                this.field3100[var2] = arg0[var2] & 0xFF;
            }
            this.field3105 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3100[var4] = arg0[var3++] & 0xFF;
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
        this.field3109 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3109[(var17 << 8) + var18] = (byte) method3821(var9, var13, var6, this.field3100, var5, var17, var18);
                    }
                }
            }
        }
        this.field3105 = var5[32] + var6[32];
    }

    @ObfuscatedName("hx.w([[B[[B[I[I[III)I")
    public static int method3821(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("hx.m(C)I")
    public int method3763(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3100[class204.method3422(arg0) & 0xFF];
    }

    @ObfuscatedName("hx.u(Ljava/lang/String;)I")
    public int method3764(String arg0) {
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
                                    int var9 = class208.method2660(var8, 10, true);
                                    var4 += Statics.field3102[var9].field3204;
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
                    var4 += this.field3100[(char) (class204.method3422(var6) & 0xFF)];
                    if (this.field3109 != null && var3 != -1) {
                        var4 += this.field3109[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("hx.q(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method3765(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method3763('<');
                        if (this.field3109 != null && var11 != -1) {
                            var4 += this.field3109[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method3763('>');
                        if (this.field3109 != null && var11 != -1) {
                            var4 += this.field3109[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class208.method2660(var17, 10, true);
                            var4 += Statics.field3102[var18].field3204;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method3763(var15);
                        if (this.field3109 != null && var11 != -1) {
                            var4 += this.field3109[(var11 << 8) + var15];
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

    @ObfuscatedName("hx.c(Ljava/lang/String;I)I")
    public int method3766(String arg0, int arg1) {
        int var3 = this.method3765(arg0, new int[] { arg1 }, field3120);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method3764(field3120[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("hx.v(Ljava/lang/String;I)I")
    public int method3777(String arg0, int arg1) {
        return this.method3765(arg0, new int[] { arg1 }, field3120);
    }

    @ObfuscatedName("hx.e(Ljava/lang/String;)Ljava/lang/String;")
    public static String method3768(String arg0) {
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

    @ObfuscatedName("hx.j(Ljava/lang/String;IIII)V")
    public void method3769(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3787(arg3, arg4);
            this.method3778(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("hx.d(Ljava/lang/String;IIIII)V")
    public void method3770(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method3787(arg3, arg4);
            field3107 = arg5;
            this.method3778(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("hx.g(Ljava/lang/String;IIII)V")
    public void method3760(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3787(arg3, arg4);
            this.method3778(arg0, arg1 - this.method3764(arg0), arg2);
        }
    }

    @ObfuscatedName("hx.ap(Ljava/lang/String;IIII)V")
    public void method3794(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3787(arg3, arg4);
            this.method3778(arg0, arg1 - this.method3764(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("hx.aj(Ljava/lang/String;IIIIIIIII)I")
    public int method3829(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method3787(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3105;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3117 + this.field3106 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method3765(arg0, var11, field3120);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3106 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3106 - this.field3117 - (var12 - 1) * arg9) / 2 + this.field3106 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3117 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3106 - this.field3117 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3106 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method3778(field3120[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method3778(field3120[var15], arg1 + (arg3 - this.method3764(field3120[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method3778(field3120[var15], arg1 + arg3 - this.method3764(field3120[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method3778(field3120[var15], arg1, var13);
            } else {
                this.method3779(field3120[var15], arg3);
                this.method3778(field3120[var15], arg1, var13);
                field3099 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("hx.ab(Ljava/lang/String;IIIII)V")
    public void method3827(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3787(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method3781(arg0, arg1 - this.method3764(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("hx.af(Ljava/lang/String;IIIII)V")
    public void method3783(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3787(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method3781(arg0, arg1 - this.method3764(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("hx.aw(Ljava/lang/String;IIIIII)V")
    public void method3808(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method3787(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method3781(arg0, arg1 - this.method3764(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("hx.ac(Ljava/lang/String;IIIII)V")
    public void method3776(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3787(arg3, arg4);
        field3108.setSeed((long) arg5);
        field3107 = 192 + (field3108.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3108.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method3781(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("hx.an(II)V")
    public void method3787(int arg0, int arg1) {
        field3103 = -1;
        field3111 = -1;
        field3112 = arg1;
        field3119 = arg1;
        field3114 = arg0;
        field3115 = arg0;
        field3107 = 256;
        field3099 = 0;
        field3118 = 0;
    }

    @ObfuscatedName("hx.ae(Ljava/lang/String;)V")
    public void method3832(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class208.method2660(var2, 16, true);
                field3115 = var3;
            } else if (arg0.equals("/col")) {
                field3115 = field3114;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class208.method2660(var4, 16, true);
                field3103 = var5;
            } else if (arg0.equals("str")) {
                field3103 = 8388608;
            } else if (arg0.equals("/str")) {
                field3103 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class208.method2660(var6, 16, true);
                field3111 = var7;
            } else if (arg0.equals("u")) {
                field3111 = 0;
            } else if (arg0.equals("/u")) {
                field3111 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class208.method2660(var8, 16, true);
                field3119 = var9;
            } else if (arg0.equals("shad")) {
                field3119 = 0;
            } else if (arg0.equals("/shad")) {
                field3119 = field3112;
            } else if (arg0.equals("br")) {
                this.method3787(field3114, field3112);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("hx.au(Ljava/lang/String;I)V")
    public void method3779(String arg0, int arg1) {
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
            field3099 = (arg1 - this.method3764(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("hx.am(Ljava/lang/String;II)V")
    public void method3778(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3105;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class204.method3422(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class208.method3649(var9.substring(4));
                                        class223 var11 = Statics.field3102[var10];
                                        var11.method3957(arg1, this.field3105 + var4 - var11.field3210);
                                        arg1 += var11.field3204;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method3832(var9);
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
                        if (this.field3109 != null && var6 != -1) {
                            arg1 += this.field3109[(var6 << 8) + var8];
                        }
                        int var13 = this.field3101[var8];
                        int var14 = this.field3113[var8];
                        if (var8 == ' ') {
                            if (field3099 > 0) {
                                field3118 += field3099;
                                arg1 += field3118 >> 8;
                                field3118 &= 0xFF;
                            }
                        } else if (field3107 == 256) {
                            if (field3119 != -1) {
                                method3782(this.field3104[var8], this.field3110[var8] + arg1 + 1, this.field3116[var8] + var4 + 1, var13, var14, field3119);
                            }
                            this.method3753(this.field3104[var8], this.field3110[var8] + arg1, this.field3116[var8] + var4, var13, var14, field3115);
                        } else {
                            if (field3119 != -1) {
                                method3767(this.field3104[var8], this.field3110[var8] + arg1 + 1, this.field3116[var8] + var4 + 1, var13, var14, field3119, field3107);
                            }
                            this.method3751(this.field3104[var8], this.field3110[var8] + arg1, this.field3116[var8] + var4, var13, var14, field3115, field3107);
                        }
                        int var15 = this.field3100[var8];
                        if (field3103 != -1) {
                            method3876(arg1, (int) ((double) this.field3105 * 0.7D) + var4, var15, field3103);
                        }
                        if (field3111 != -1) {
                            method3876(arg1, this.field3105 + var4 + 1, var15, field3111);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hx.as(Ljava/lang/String;II[I[I)V")
    public void method3781(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3105;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class204.method3422(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class208.method3649(var12.substring(4));
                                        class223 var16 = Statics.field3102[var15];
                                        var16.method3957(arg1 + var13, this.field3105 + var6 - var16.field3210 + var14);
                                        arg1 += var16.field3204;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method3832(var12);
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
                        if (this.field3109 != null && var8 != -1) {
                            arg1 += this.field3109[(var8 << 8) + var11];
                        }
                        int var18 = this.field3101[var11];
                        int var19 = this.field3113[var11];
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
                            if (field3099 > 0) {
                                field3118 += field3099;
                                arg1 += field3118 >> 8;
                                field3118 &= 0xFF;
                            }
                        } else if (field3107 == 256) {
                            if (field3119 != -1) {
                                method3782(this.field3104[var11], this.field3110[var11] + arg1 + 1 + var20, this.field3116[var11] + var6 + 1 + var21, var18, var19, field3119);
                            }
                            this.method3753(this.field3104[var11], this.field3110[var11] + arg1 + var20, this.field3116[var11] + var6 + var21, var18, var19, field3115);
                        } else {
                            if (field3119 != -1) {
                                method3767(this.field3104[var11], this.field3110[var11] + arg1 + 1 + var20, this.field3116[var11] + var6 + 1 + var21, var18, var19, field3119, field3107);
                            }
                            this.method3751(this.field3104[var11], this.field3110[var11] + arg1 + var20, this.field3116[var11] + var6 + var21, var18, var19, field3115, field3107);
                        }
                        int var22 = this.field3100[var11];
                        if (field3103 != -1) {
                            method3876(arg1, (int) ((double) this.field3105 * 0.7D) + var6, var22, field3103);
                        }
                        if (field3111 != -1) {
                            method3876(arg1, this.field3105 + var6, var22, field3111);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hx.ay([BIIIII)V")
    public static void method3782(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field3184 * arg2 + arg1;
        int var7 = Statics.field3184 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field3188) {
            int var10 = field3188 - arg2;
            arg4 -= var10;
            arg2 = field3188;
            var9 += arg3 * var10;
            var6 += Statics.field3184 * var10;
        }
        if (arg2 + arg4 > field3183) {
            arg4 -= arg2 + arg4 - field3183;
        }
        if (arg1 < field3187) {
            int var11 = field3187 - arg1;
            arg3 -= var11;
            arg1 = field3187;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field3186) {
            int var12 = arg1 + arg3 - field3186;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3815(Statics.field3189, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("hx.at([I[BIIIIIII)V")
    public static void method3815(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("hx.ai([BIIIIII)V")
    public static void method3767(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field3184 * arg2 + arg1;
        int var8 = Statics.field3184 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3188) {
            int var11 = field3188 - arg2;
            arg4 -= var11;
            arg2 = field3188;
            var10 += arg3 * var11;
            var7 += Statics.field3184 * var11;
        }
        if (arg2 + arg4 > field3183) {
            arg4 -= arg2 + arg4 - field3183;
        }
        if (arg1 < field3187) {
            int var12 = field3187 - arg1;
            arg3 -= var12;
            arg1 = field3187;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3186) {
            int var13 = arg1 + arg3 - field3186;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3762(Statics.field3189, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("hx.aa([I[BIIIIIIII)V")
    public static void method3762(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("hx.b([BIIIII)V")
    public abstract void method3753(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("hx.l([BIIIIII)V")
    public abstract void method3751(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
