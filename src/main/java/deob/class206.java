package deob;

import java.util.Random;

@ObfuscatedName("gb")
public abstract class class206 extends class74 {

    @ObfuscatedName("gb.p")
    public byte[][] field2993 = new byte[256][];

    @ObfuscatedName("gb.y")
    public int[] field2976;

    @ObfuscatedName("gb.d")
    public int[] field2983;

    @ObfuscatedName("gb.c")
    public int[] field2975;

    @ObfuscatedName("gb.r")
    public int[] field2979;

    @ObfuscatedName("gb.f")
    public int[] field2980;

    @ObfuscatedName("gb.z")
    public int field2981 = 0;

    @ObfuscatedName("gb.o")
    public int field2982;

    @ObfuscatedName("gb.k")
    public int field2996;

    @ObfuscatedName("gb.h")
    public byte[] field2984;

    @ObfuscatedName("gb.m")
    public static int field2986 = -1;

    @ObfuscatedName("gb.a")
    public static int field2977 = -1;

    @ObfuscatedName("gb.x")
    public static int field2988 = -1;

    @ObfuscatedName("gb.n")
    public static int field2989 = -1;

    @ObfuscatedName("gb.v")
    public static int field2990 = 0;

    @ObfuscatedName("gb.l")
    public static int field2992 = 0;

    @ObfuscatedName("gb.t")
    public static int field2991 = 256;

    @ObfuscatedName("gb.i")
    public static int field2985 = 0;

    @ObfuscatedName("gb.aw")
    public static int field2994 = 0;

    @ObfuscatedName("gb.ar")
    public static Random field2995 = new Random();

    @ObfuscatedName("gb.af")
    public static String[] field2978 = new String[100];

    public class206(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field2979 = arg1;
        this.field2980 = arg2;
        this.field2983 = arg3;
        this.field2975 = arg4;
        this.method3461(arg0);
        this.field2993 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2980[var10] < var8 && this.field2975[var10] != 0) {
                var8 = this.field2980[var10];
            }
            if (this.field2980[var10] + this.field2975[var10] > var9) {
                var9 = this.field2980[var10] + this.field2975[var10];
            }
        }
        this.field2982 = this.field2981 - var8;
        this.field2996 = var9 - this.field2981;
    }

    public class206(byte[] arg0) {
        this.method3461(arg0);
    }

    @ObfuscatedName("gb.p([B)V")
    public void method3461(byte[] arg0) {
        this.field2976 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2976.length; var2++) {
                this.field2976[var2] = arg0[var2] & 0xFF;
            }
            this.field2981 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2976[var4] = arg0[var3++] & 0xFF;
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
        this.field2984 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field2984[(var17 << 8) + var18] = (byte) method3526(var9, var13, var6, this.field2976, var5, var17, var18);
                    }
                }
            }
        }
        this.field2981 = var5[32] + var6[32];
    }

    @ObfuscatedName("gb.y([[B[[B[I[I[III)I")
    public static int method3526(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("gb.d(C)I")
    public int method3463(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field2976[class215.method596(arg0) & 0xFF];
    }

    @ObfuscatedName("gb.c(Ljava/lang/String;)I")
    public int method3464(String arg0) {
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
                                    int var9 = class213.method2826(var8, 10, true);
                                    var4 += Statics.field2987[var9].field1314;
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
                    var4 += this.field2976[(char) (class215.method596(var6) & 0xFF)];
                    if (this.field2984 != null && var3 != -1) {
                        var4 += this.field2984[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("gb.r(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method3465(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method3463('<');
                        if (this.field2984 != null && var11 != -1) {
                            var4 += this.field2984[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method3463('>');
                        if (this.field2984 != null && var11 != -1) {
                            var4 += this.field2984[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class213.method2826(var17, 10, true);
                            var4 += Statics.field2987[var18].field1314;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method3463(var15);
                        if (this.field2984 != null && var11 != -1) {
                            var4 += this.field2984[(var11 << 8) + var15];
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

    @ObfuscatedName("gb.f(Ljava/lang/String;I)I")
    public int method3502(String arg0, int arg1) {
        int var3 = this.method3465(arg0, new int[] { arg1 }, field2978);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method3464(field2978[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("gb.z(Ljava/lang/String;I)I")
    public int method3485(String arg0, int arg1) {
        return this.method3465(arg0, new int[] { arg1 }, field2978);
    }

    @ObfuscatedName("gb.o(Ljava/lang/String;)Ljava/lang/String;")
    public static String method3468(String arg0) {
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

    @ObfuscatedName("gb.k(Ljava/lang/String;IIII)V")
    public void method3534(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3477(arg3, arg4);
            this.method3498(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("gb.s(Ljava/lang/String;IIII)V")
    public void method3470(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3477(arg3, arg4);
            this.method3498(arg0, arg1 - this.method3464(arg0), arg2);
        }
    }

    @ObfuscatedName("gb.h(Ljava/lang/String;IIII)V")
    public void method3471(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3477(arg3, arg4);
            this.method3498(arg0, arg1 - this.method3464(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("gb.m(Ljava/lang/String;IIIIIIIII)I")
    public int method3489(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method3477(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field2981;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field2996 + this.field2982 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method3465(arg0, var11, field2978);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field2982 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field2982 - this.field2996 - (var12 - 1) * arg9) / 2 + this.field2982 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field2996 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field2982 - this.field2996 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field2982 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method3498(field2978[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method3498(field2978[var15], arg1 + (arg3 - this.method3464(field2978[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method3498(field2978[var15], arg1 + arg3 - this.method3464(field2978[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method3498(field2978[var15], arg1, var13);
            } else {
                this.method3479(field2978[var15], arg3);
                this.method3498(field2978[var15], arg1, var13);
                field2985 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("gb.w(Ljava/lang/String;IIIII)V")
    public void method3560(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3477(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method3481(arg0, arg1 - this.method3464(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("gb.q(Ljava/lang/String;IIIII)V")
    public void method3474(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3477(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method3481(arg0, arg1 - this.method3464(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("gb.u(Ljava/lang/String;IIIIII)V")
    public void method3475(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method3477(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method3481(arg0, arg1 - this.method3464(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("gb.e(Ljava/lang/String;IIIII)V")
    public void method3476(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3477(arg3, arg4);
        field2995.setSeed((long) arg5);
        field2991 = 192 + (field2995.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field2995.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method3481(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("gb.b(II)V")
    public void method3477(int arg0, int arg1) {
        field2986 = -1;
        field2977 = -1;
        field2988 = arg1;
        field2989 = arg1;
        field2990 = arg0;
        field2992 = arg0;
        field2991 = 256;
        field2985 = 0;
        field2994 = 0;
    }

    @ObfuscatedName("gb.g(Ljava/lang/String;)V")
    public void method3535(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field2992 = class213.method2410(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field2992 = field2990;
            } else if (arg0.startsWith("str=")) {
                field2986 = class213.method2410(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field2986 = 8388608;
            } else if (arg0.equals("/str")) {
                field2986 = -1;
            } else if (arg0.startsWith("u=")) {
                field2977 = class213.method2410(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field2977 = 0;
            } else if (arg0.equals("/u")) {
                field2977 = -1;
            } else if (arg0.startsWith("shad=")) {
                field2989 = class213.method2410(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field2989 = 0;
            } else if (arg0.equals("/shad")) {
                field2989 = field2988;
            } else if (arg0.equals("br")) {
                this.method3477(field2990, field2988);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("gb.j(Ljava/lang/String;I)V")
    public void method3479(String arg0, int arg1) {
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
            field2985 = (arg1 - this.method3464(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("gb.a(Ljava/lang/String;II)V")
    public void method3498(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2981;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class215.method596(arg0.charAt(var7)) & 0xFF);
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
                                        int var11 = class213.method2826(var10, 10, true);
                                        class75 var13 = Statics.field2987[var11];
                                        var13.method1601(arg1, this.field2981 + var4 - var13.field1320);
                                        arg1 += var13.field1314;
                                        var6 = -1;
                                    } catch (Exception var18) {
                                    }
                                } else {
                                    this.method3535(var9);
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
                        if (this.field2984 != null && var6 != -1) {
                            arg1 += this.field2984[(var6 << 8) + var8];
                        }
                        int var15 = this.field2983[var8];
                        int var16 = this.field2975[var8];
                        if (var8 == ' ') {
                            if (field2985 > 0) {
                                field2994 += field2985;
                                arg1 += field2994 >> 8;
                                field2994 &= 0xFF;
                            }
                        } else if (field2991 == 256) {
                            if (field2989 != -1) {
                                method3484(this.field2993[var8], this.field2979[var8] + arg1 + 1, this.field2980[var8] + var4 + 1, var15, var16, field2989);
                            }
                            this.method3482(this.field2993[var8], this.field2979[var8] + arg1, this.field2980[var8] + var4, var15, var16, field2992);
                        } else {
                            if (field2989 != -1) {
                                method3486(this.field2993[var8], this.field2979[var8] + arg1 + 1, this.field2980[var8] + var4 + 1, var15, var16, field2989, field2991);
                            }
                            this.method3483(this.field2993[var8], this.field2979[var8] + arg1, this.field2980[var8] + var4, var15, var16, field2992, field2991);
                        }
                        int var17 = this.field2976[var8];
                        if (field2986 != -1) {
                            method1544(arg1, (int) ((double) this.field2981 * 0.7D) + var4, var17, field2986);
                        }
                        if (field2977 != -1) {
                            method1544(arg1, this.field2981 + var4 + 1, var17, field2977);
                        }
                        arg1 += var17;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gb.x(Ljava/lang/String;II[I[I)V")
    public void method3481(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2981;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class215.method596(arg0.charAt(var10)) & 0xFF);
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
                                        int var16 = class213.method2826(var15, 10, true);
                                        class75 var18 = Statics.field2987[var16];
                                        var18.method1601(arg1 + var13, this.field2981 + var6 - var18.field1320 + var14);
                                        arg1 += var18.field1314;
                                        var8 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method3535(var12);
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
                        if (this.field2984 != null && var8 != -1) {
                            arg1 += this.field2984[(var8 << 8) + var11];
                        }
                        int var20 = this.field2983[var11];
                        int var21 = this.field2975[var11];
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
                            if (field2985 > 0) {
                                field2994 += field2985;
                                arg1 += field2994 >> 8;
                                field2994 &= 0xFF;
                            }
                        } else if (field2991 == 256) {
                            if (field2989 != -1) {
                                method3484(this.field2993[var11], this.field2979[var11] + arg1 + 1 + var22, this.field2980[var11] + var6 + 1 + var23, var20, var21, field2989);
                            }
                            this.method3482(this.field2993[var11], this.field2979[var11] + arg1 + var22, this.field2980[var11] + var6 + var23, var20, var21, field2992);
                        } else {
                            if (field2989 != -1) {
                                method3486(this.field2993[var11], this.field2979[var11] + arg1 + 1 + var22, this.field2980[var11] + var6 + 1 + var23, var20, var21, field2989, field2991);
                            }
                            this.method3483(this.field2993[var11], this.field2979[var11] + arg1 + var22, this.field2980[var11] + var6 + var23, var20, var21, field2992, field2991);
                        }
                        int var24 = this.field2976[var11];
                        if (field2986 != -1) {
                            method1544(arg1, (int) ((double) this.field2981 * 0.7D) + var6, var24, field2986);
                        }
                        if (field2977 != -1) {
                            method1544(arg1, this.field2981 + var6, var24, field2977);
                        }
                        arg1 += var24;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gb.l([BIIIII)V")
    public static void method3484(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field1308 * arg2 + arg1;
        int var7 = Statics.field1308 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field1306) {
            int var10 = field1306 - arg2;
            arg4 -= var10;
            arg2 = field1306;
            var9 += arg3 * var10;
            var6 += Statics.field1308 * var10;
        }
        if (arg2 + arg4 > field1310) {
            arg4 -= arg2 + arg4 - field1310;
        }
        if (arg1 < field1307) {
            int var11 = field1307 - arg1;
            arg3 -= var11;
            arg1 = field1307;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field1312) {
            int var12 = arg1 + arg3 - field1312;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3523(Statics.field1311, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("gb.t([I[BIIIIIII)V")
    public static void method3523(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("gb.i([BIIIIII)V")
    public static void method3486(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field1308 * arg2 + arg1;
        int var8 = Statics.field1308 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1306) {
            int var11 = field1306 - arg2;
            arg4 -= var11;
            arg2 = field1306;
            var10 += arg3 * var11;
            var7 += Statics.field1308 * var11;
        }
        if (arg2 + arg4 > field1310) {
            arg4 -= arg2 + arg4 - field1310;
        }
        if (arg1 < field1307) {
            int var12 = field1307 - arg1;
            arg3 -= var12;
            arg1 = field1307;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field1312) {
            int var13 = arg1 + arg3 - field1312;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3487(Statics.field1311, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("gb.aw([I[BIIIIIIII)V")
    public static void method3487(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("gb.n([BIIIII)V")
    public abstract void method3482(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("gb.v([BIIIIII)V")
    public abstract void method3483(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
