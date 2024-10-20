package deob;

import java.util.Random;

@ObfuscatedName("hu")
public abstract class class214 extends class75 {

    @ObfuscatedName("hu.p")
    public byte[][] field3094 = new byte[256][];

    @ObfuscatedName("hu.k")
    public int[] field3088;

    @ObfuscatedName("hu.e")
    public int[] field3089;

    @ObfuscatedName("hu.f")
    public int[] field3099;

    @ObfuscatedName("hu.w")
    public int[] field3107;

    @ObfuscatedName("hu.t")
    public int[] field3092;

    @ObfuscatedName("hu.s")
    public int field3093 = 0;

    @ObfuscatedName("hu.c")
    public int field3096;

    @ObfuscatedName("hu.d")
    public int field3095;

    @ObfuscatedName("hu.m")
    public byte[] field3097;

    @ObfuscatedName("hu.h")
    public static int field3098 = -1;

    @ObfuscatedName("hu.g")
    public static int field3087 = -1;

    @ObfuscatedName("hu.l")
    public static int field3100 = -1;

    @ObfuscatedName("hu.u")
    public static int field3101 = -1;

    @ObfuscatedName("hu.j")
    public static int field3102 = 0;

    @ObfuscatedName("hu.z")
    public static int field3103 = 0;

    @ObfuscatedName("hu.b")
    public static int field3104 = 256;

    @ObfuscatedName("hu.a")
    public static int field3091 = 0;

    @ObfuscatedName("hu.ag")
    public static int field3106 = 0;

    @ObfuscatedName("hu.am")
    public static Random field3105 = new Random();

    @ObfuscatedName("hu.aa")
    public static String[] field3108 = new String[100];

    public class214(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3107 = arg1;
        this.field3092 = arg2;
        this.field3089 = arg3;
        this.field3099 = arg4;
        this.method3623(arg0);
        this.field3094 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3092[var10] < var8 && this.field3099[var10] != 0) {
                var8 = this.field3092[var10];
            }
            if (this.field3099[var10] + this.field3092[var10] > var9) {
                var9 = this.field3099[var10] + this.field3092[var10];
            }
        }
        this.field3096 = this.field3093 - var8;
        this.field3095 = var9 - this.field3093;
    }

    public class214(byte[] arg0) {
        this.method3623(arg0);
    }

    @ObfuscatedName("hu.p([B)V")
    public void method3623(byte[] arg0) {
        this.field3088 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3088.length; var2++) {
                this.field3088[var2] = arg0[var2] & 0xFF;
            }
            this.field3093 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3088[var4] = arg0[var3++] & 0xFF;
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
        this.field3097 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3097[(var17 << 8) + var18] = (byte) method3646(var9, var13, var6, this.field3088, var5, var17, var18);
                    }
                }
            }
        }
        this.field3093 = var5[32] + var6[32];
    }

    @ObfuscatedName("hu.k([[B[[B[I[I[III)I")
    public static int method3646(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("hu.e(C)I")
    public int method3624(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3088[class156.method3101(arg0) & 0xFF];
    }

    @ObfuscatedName("hu.f(Ljava/lang/String;)I")
    public int method3657(String arg0) {
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
                                    int var9 = class154.method3025(var8, 10, true);
                                    var4 += Statics.field3090[var9].field1363;
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
                    var4 += this.field3088[(char) (class156.method3101(var6) & 0xFF)];
                    if (this.field3097 != null && var3 != -1) {
                        var4 += this.field3097[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("hu.w(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method3633(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method3624('<');
                        if (this.field3097 != null && var11 != -1) {
                            var4 += this.field3097[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method3624('>');
                        if (this.field3097 != null && var11 != -1) {
                            var4 += this.field3097[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class154.method3025(var17, 10, true);
                            var4 += Statics.field3090[var18].field1363;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method3624(var15);
                        if (this.field3097 != null && var11 != -1) {
                            var4 += this.field3097[(var11 << 8) + var15];
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

    @ObfuscatedName("hu.t(Ljava/lang/String;I)I")
    public int method3627(String arg0, int arg1) {
        int var3 = this.method3633(arg0, new int[] { arg1 }, field3108);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method3657(field3108[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("hu.s(Ljava/lang/String;I)I")
    public int method3628(String arg0, int arg1) {
        return this.method3633(arg0, new int[] { arg1 }, field3108);
    }

    @ObfuscatedName("hu.c(Ljava/lang/String;)Ljava/lang/String;")
    public static String method3629(String arg0) {
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

    @ObfuscatedName("hu.d(Ljava/lang/String;IIII)V")
    public void method3622(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3638(arg3, arg4);
            this.method3641(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("hu.v(Ljava/lang/String;IIII)V")
    public void method3631(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3638(arg3, arg4);
            this.method3641(arg0, arg1 - this.method3657(arg0), arg2);
        }
    }

    @ObfuscatedName("hu.m(Ljava/lang/String;IIII)V")
    public void method3632(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3638(arg3, arg4);
            this.method3641(arg0, arg1 - this.method3657(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("hu.h(Ljava/lang/String;IIIIIIIII)I")
    public int method3637(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method3638(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3093;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3096 + this.field3095 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method3633(arg0, var11, field3108);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3096 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3096 - this.field3095 - (var12 - 1) * arg9) / 2 + this.field3096 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3095 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3096 - this.field3095 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3096 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method3641(field3108[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method3641(field3108[var15], arg1 + (arg3 - this.method3657(field3108[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method3641(field3108[var15], arg1 + arg3 - this.method3657(field3108[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method3641(field3108[var15], arg1, var13);
            } else {
                this.method3640(field3108[var15], arg3);
                this.method3641(field3108[var15], arg1, var13);
                field3091 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("hu.n(Ljava/lang/String;IIIII)V")
    public void method3642(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3638(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method3636(arg0, arg1 - this.method3657(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("hu.x(Ljava/lang/String;IIIII)V")
    public void method3635(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3638(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method3636(arg0, arg1 - this.method3657(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("hu.o(Ljava/lang/String;IIIIII)V")
    public void method3651(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method3638(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method3636(arg0, arg1 - this.method3657(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("hu.r(Ljava/lang/String;IIIII)V")
    public void method3639(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3638(arg3, arg4);
        field3105.setSeed((long) arg5);
        field3104 = 192 + (field3105.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3105.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method3636(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("hu.y(II)V")
    public void method3638(int arg0, int arg1) {
        field3098 = -1;
        field3087 = -1;
        field3100 = arg1;
        field3101 = arg1;
        field3102 = arg0;
        field3103 = arg0;
        field3104 = 256;
        field3091 = 0;
        field3106 = 0;
    }

    @ObfuscatedName("hu.i(Ljava/lang/String;)V")
    public void method3672(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field3103 = class154.method556(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field3103 = field3102;
            } else if (arg0.startsWith("str=")) {
                field3098 = class154.method556(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field3098 = 8388608;
            } else if (arg0.equals("/str")) {
                field3098 = -1;
            } else if (arg0.startsWith("u=")) {
                field3087 = class154.method556(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field3087 = 0;
            } else if (arg0.equals("/u")) {
                field3087 = -1;
            } else if (arg0.startsWith("shad=")) {
                field3101 = class154.method556(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field3101 = 0;
            } else if (arg0.equals("/shad")) {
                field3101 = field3100;
            } else if (arg0.equals("br")) {
                this.method3638(field3102, field3100);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("hu.q(Ljava/lang/String;I)V")
    public void method3640(String arg0, int arg1) {
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
            field3091 = (arg1 - this.method3657(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("hu.g(Ljava/lang/String;II)V")
    public void method3641(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3093;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class156.method3101(arg0.charAt(var7)) & 0xFF);
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
                                        int var11 = class154.method3025(var10, 10, true);
                                        class76 var13 = Statics.field3090[var11];
                                        var13.method1598(arg1, this.field3093 + var4 - var13.field1360);
                                        arg1 += var13.field1363;
                                        var6 = -1;
                                    } catch (Exception var18) {
                                    }
                                } else {
                                    this.method3672(var9);
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
                        if (this.field3097 != null && var6 != -1) {
                            arg1 += this.field3097[(var6 << 8) + var8];
                        }
                        int var15 = this.field3089[var8];
                        int var16 = this.field3099[var8];
                        if (var8 == ' ') {
                            if (field3091 > 0) {
                                field3106 += field3091;
                                arg1 += field3106 >> 8;
                                field3106 &= 0xFF;
                            }
                        } else if (field3104 == 256) {
                            if (field3101 != -1) {
                                method3645(this.field3094[var8], this.field3107[var8] + arg1 + 1, this.field3092[var8] + var4 + 1, var15, var16, field3101);
                            }
                            this.method3681(this.field3094[var8], this.field3107[var8] + arg1, this.field3092[var8] + var4, var15, var16, field3103);
                        } else {
                            if (field3101 != -1) {
                                method3647(this.field3094[var8], this.field3107[var8] + arg1 + 1, this.field3092[var8] + var4 + 1, var15, var16, field3101, field3104);
                            }
                            this.method3644(this.field3094[var8], this.field3107[var8] + arg1, this.field3092[var8] + var4, var15, var16, field3103, field3104);
                        }
                        int var17 = this.field3088[var8];
                        if (field3098 != -1) {
                            method1544(arg1, (int) ((double) this.field3093 * 0.7D) + var4, var17, field3098);
                        }
                        if (field3087 != -1) {
                            method1544(arg1, this.field3093 + var4 + 1, var17, field3087);
                        }
                        arg1 += var17;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hu.l(Ljava/lang/String;II[I[I)V")
    public void method3636(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3093;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class156.method3101(arg0.charAt(var10)) & 0xFF);
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
                                        int var16 = class154.method3025(var15, 10, true);
                                        class76 var18 = Statics.field3090[var16];
                                        var18.method1598(arg1 + var13, this.field3093 + var6 - var18.field1360 + var14);
                                        arg1 += var18.field1363;
                                        var8 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method3672(var12);
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
                        if (this.field3097 != null && var8 != -1) {
                            arg1 += this.field3097[(var8 << 8) + var11];
                        }
                        int var20 = this.field3089[var11];
                        int var21 = this.field3099[var11];
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
                            if (field3091 > 0) {
                                field3106 += field3091;
                                arg1 += field3106 >> 8;
                                field3106 &= 0xFF;
                            }
                        } else if (field3104 == 256) {
                            if (field3101 != -1) {
                                method3645(this.field3094[var11], this.field3107[var11] + arg1 + 1 + var22, this.field3092[var11] + var6 + 1 + var23, var20, var21, field3101);
                            }
                            this.method3681(this.field3094[var11], this.field3107[var11] + arg1 + var22, this.field3092[var11] + var6 + var23, var20, var21, field3103);
                        } else {
                            if (field3101 != -1) {
                                method3647(this.field3094[var11], this.field3107[var11] + arg1 + 1 + var22, this.field3092[var11] + var6 + 1 + var23, var20, var21, field3101, field3104);
                            }
                            this.method3644(this.field3094[var11], this.field3107[var11] + arg1 + var22, this.field3092[var11] + var6 + var23, var20, var21, field3103, field3104);
                        }
                        int var24 = this.field3088[var11];
                        if (field3098 != -1) {
                            method1544(arg1, (int) ((double) this.field3093 * 0.7D) + var6, var24, field3098);
                        }
                        if (field3087 != -1) {
                            method1544(arg1, this.field3093 + var6, var24, field3087);
                        }
                        arg1 += var24;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hu.z([BIIIII)V")
    public static void method3645(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field1351 * arg2 + arg1;
        int var7 = Statics.field1351 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field1353) {
            int var10 = field1353 - arg2;
            arg4 -= var10;
            arg2 = field1353;
            var9 += arg3 * var10;
            var6 += Statics.field1351 * var10;
        }
        if (arg2 + arg4 > field1350) {
            arg4 -= arg2 + arg4 - field1350;
        }
        if (arg1 < field1354) {
            int var11 = field1354 - arg1;
            arg3 -= var11;
            arg1 = field1354;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field1356) {
            int var12 = arg1 + arg3 - field1356;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3707(Statics.field1355, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("hu.b([I[BIIIIIII)V")
    public static void method3707(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("hu.a([BIIIIII)V")
    public static void method3647(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field1351 * arg2 + arg1;
        int var8 = Statics.field1351 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1353) {
            int var11 = field1353 - arg2;
            arg4 -= var11;
            arg2 = field1353;
            var10 += arg3 * var11;
            var7 += Statics.field1351 * var11;
        }
        if (arg2 + arg4 > field1350) {
            arg4 -= arg2 + arg4 - field1350;
        }
        if (arg1 < field1354) {
            int var12 = field1354 - arg1;
            arg3 -= var12;
            arg1 = field1354;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field1356) {
            int var13 = arg1 + arg3 - field1356;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3648(Statics.field1355, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("hu.ag([I[BIIIIIIII)V")
    public static void method3648(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("hu.j([BIIIIII)V")
    public abstract void method3644(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("hu.u([BIIIII)V")
    public abstract void method3681(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
