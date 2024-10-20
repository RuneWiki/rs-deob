package deob;

import java.util.Random;

@ObfuscatedName("ks")
public abstract class class307 extends class332 {

    @ObfuscatedName("ks.n")
    public byte[][] field3733 = new byte[256][];

    @ObfuscatedName("ks.v")
    public int[] field3718;

    @ObfuscatedName("ks.d")
    public int[] field3731;

    @ObfuscatedName("ks.c")
    public int[] field3724;

    @ObfuscatedName("ks.y")
    public int[] field3714;

    @ObfuscatedName("ks.h")
    public int[] field3717;

    @ObfuscatedName("ks.z")
    public int field3712 = 0;

    @ObfuscatedName("ks.e")
    public int field3719;

    @ObfuscatedName("ks.q")
    public int field3720;

    @ObfuscatedName("ks.s")
    public byte[] field3722;

    @ObfuscatedName("ks.b")
    public static int field3716 = -1;

    @ObfuscatedName("ks.a")
    public static int field3713 = -1;

    @ObfuscatedName("ks.w")
    public static int field3725 = -1;

    @ObfuscatedName("ks.k")
    public static int field3726 = -1;

    @ObfuscatedName("ks.i")
    public static int field3727 = 0;

    @ObfuscatedName("ks.x")
    public static int field3728 = 0;

    @ObfuscatedName("ks.f")
    public static int field3729 = 256;

    @ObfuscatedName("ks.g")
    public static int field3730 = 0;

    @ObfuscatedName("ks.u")
    public static int field3715 = 0;

    @ObfuscatedName("ks.t")
    public static Random field3732 = new Random();

    @ObfuscatedName("ks.p")
    public static String[] field3723 = new String[100];

    public class307(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3714 = arg1;
        this.field3717 = arg2;
        this.field3731 = arg3;
        this.field3724 = arg4;
        this.method5134(arg0);
        this.field3733 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3717[var10] < var8 && this.field3724[var10] != 0) {
                var8 = this.field3717[var10];
            }
            if (this.field3724[var10] + this.field3717[var10] > var9) {
                var9 = this.field3724[var10] + this.field3717[var10];
            }
        }
        this.field3719 = this.field3712 - var8;
        this.field3720 = var9 - this.field3712;
    }

    public class307(byte[] arg0) {
        this.method5134(arg0);
    }

    @ObfuscatedName("ks.q([B)V")
    public void method5134(byte[] arg0) {
        this.field3718 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3718.length; var2++) {
                this.field3718[var2] = arg0[var2] & 0xFF;
            }
            this.field3712 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3718[var4] = arg0[var3++] & 0xFF;
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
        this.field3722 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3722[(var17 << 8) + var18] = (byte) method5105(var9, var13, var6, this.field3718, var5, var17, var18);
                    }
                }
            }
        }
        this.field3712 = var5[32] + var6[32];
    }

    @ObfuscatedName("ks.l([[B[[B[I[I[III)I")
    public static int method5105(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("ks.s(C)I")
    public int method5118(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3718[class299.method3498(arg0) & 0xFF];
    }

    @ObfuscatedName("ks.b(Ljava/lang/String;)I")
    public int method5084(String arg0) {
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
                                    int var8 = class302.method3791(var7.substring(4));
                                    var4 += Statics.field3721[var8].field3903;
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
                    var4 += this.field3718[(char) (class299.method3498(var6) & 0xFF)];
                    if (this.field3722 != null && var3 != -1) {
                        var4 += this.field3722[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("ks.a(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method5117(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method5118('<');
                        if (this.field3722 != null && var11 != -1) {
                            var4 += this.field3722[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method5118('>');
                        if (this.field3722 != null && var11 != -1) {
                            var4 += this.field3722[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class302.method3791(var16.substring(4));
                            var4 += Statics.field3721[var17].field3903;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method5118(var15);
                        if (this.field3722 != null && var11 != -1) {
                            var4 += this.field3722[(var11 << 8) + var15];
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

    @ObfuscatedName("ks.w(Ljava/lang/String;I)I")
    public int method5110(String arg0, int arg1) {
        int var3 = this.method5117(arg0, new int[] { arg1 }, field3723);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method5084(field3723[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("ks.k(Ljava/lang/String;I)I")
    public int method5083(String arg0, int arg1) {
        return this.method5117(arg0, new int[] { arg1 }, field3723);
    }

    @ObfuscatedName("ks.i(Ljava/lang/String;)Ljava/lang/String;")
    public static String method5122(String arg0) {
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

    @ObfuscatedName("ks.x(Ljava/lang/String;IIII)V")
    public void method5093(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5163(arg3, arg4);
            this.method5101(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ks.g(Ljava/lang/String;IIIII)V")
    public void method5090(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method5163(arg3, arg4);
            field3729 = arg5;
            this.method5101(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ks.u(Ljava/lang/String;IIII)V")
    public void method5091(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5163(arg3, arg4);
            this.method5101(arg0, arg1 - this.method5084(arg0), arg2);
        }
    }

    @ObfuscatedName("ks.t(Ljava/lang/String;IIII)V")
    public void method5092(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5163(arg3, arg4);
            this.method5101(arg0, arg1 - this.method5084(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("ks.p(Ljava/lang/String;IIIIIIIII)I")
    public int method5160(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method5163(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3712;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3720 + this.field3719 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method5117(arg0, var11, field3723);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3719 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3719 - this.field3720 - (var12 - 1) * arg9) / 2 + this.field3719 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3720 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3719 - this.field3720 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3719 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method5101(field3723[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method5101(field3723[var15], arg1 + (arg3 - this.method5084(field3723[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method5101(field3723[var15], arg1 + arg3 - this.method5084(field3723[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method5101(field3723[var15], arg1, var13);
            } else {
                this.method5100(field3723[var15], arg3);
                this.method5101(field3723[var15], arg1, var13);
                field3730 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("ks.o(Ljava/lang/String;IIIII)V")
    public void method5146(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5163(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method5102(arg0, arg1 - this.method5084(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("ks.ay(Ljava/lang/String;IIIII)V")
    public void method5095(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5163(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method5102(arg0, arg1 - this.method5084(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("ks.am(Ljava/lang/String;IIIIII)V")
    public void method5096(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method5163(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method5102(arg0, arg1 - this.method5084(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("ks.ag(Ljava/lang/String;IIIII)V")
    public void method5089(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5163(arg3, arg4);
        field3732.setSeed((long) arg5);
        field3729 = 192 + (field3732.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3732.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method5102(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("ks.ae(II)V")
    public void method5163(int arg0, int arg1) {
        field3716 = -1;
        field3713 = -1;
        field3725 = arg1;
        field3726 = arg1;
        field3727 = arg0;
        field3728 = arg0;
        field3729 = 256;
        field3730 = 0;
        field3715 = 0;
    }

    @ObfuscatedName("ks.ac(Ljava/lang/String;)V")
    public void method5137(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class302.method1777(var2, 16, true);
                field3728 = var3;
            } else if (arg0.equals("/col")) {
                field3728 = field3727;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class302.method1777(var4, 16, true);
                field3716 = var5;
            } else if (arg0.equals("str")) {
                field3716 = 8388608;
            } else if (arg0.equals("/str")) {
                field3716 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class302.method1777(var6, 16, true);
                field3713 = var7;
            } else if (arg0.equals("u")) {
                field3713 = 0;
            } else if (arg0.equals("/u")) {
                field3713 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class302.method1777(var8, 16, true);
                field3726 = var9;
            } else if (arg0.equals("shad")) {
                field3726 = 0;
            } else if (arg0.equals("/shad")) {
                field3726 = field3725;
            } else if (arg0.equals("br")) {
                this.method5163(field3727, field3725);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ks.aq(Ljava/lang/String;I)V")
    public void method5100(String arg0, int arg1) {
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
            field3730 = (arg1 - this.method5084(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("ks.at(Ljava/lang/String;II)V")
    public void method5101(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3712;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class299.method3498(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class302.method3791(var9.substring(4));
                                        class335 var11 = Statics.field3721[var10];
                                        var11.method5806(arg1, this.field3712 + var4 - var11.field3909);
                                        arg1 += var11.field3903;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method5137(var9);
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
                        if (this.field3722 != null && var6 != -1) {
                            arg1 += this.field3722[(var6 << 8) + var8];
                        }
                        int var13 = this.field3731[var8];
                        int var14 = this.field3724[var8];
                        if (var8 == ' ') {
                            if (field3730 > 0) {
                                field3715 += field3730;
                                arg1 += field3715 >> 8;
                                field3715 &= 0xFF;
                            }
                        } else if (field3729 == 256) {
                            if (field3726 != -1) {
                                method5087(this.field3733[var8], this.field3714[var8] + arg1 + 1, this.field3717[var8] + var4 + 1, var13, var14, field3726);
                            }
                            this.method5079(this.field3733[var8], this.field3714[var8] + arg1, this.field3717[var8] + var4, var13, var14, field3728);
                        } else {
                            if (field3726 != -1) {
                                method5098(this.field3733[var8], this.field3714[var8] + arg1 + 1, this.field3717[var8] + var4 + 1, var13, var14, field3726, field3729);
                            }
                            this.method5073(this.field3733[var8], this.field3714[var8] + arg1, this.field3717[var8] + var4, var13, var14, field3728, field3729);
                        }
                        int var15 = this.field3718[var8];
                        if (field3716 != -1) {
                            method5736(arg1, (int) ((double) this.field3712 * 0.7D) + var4, var15, field3716);
                        }
                        if (field3713 != -1) {
                            method5736(arg1, this.field3712 + var4 + 1, var15, field3713);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ks.ak(Ljava/lang/String;II[I[I)V")
    public void method5102(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3712;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class299.method3498(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class302.method3791(var12.substring(4));
                                        class335 var16 = Statics.field3721[var15];
                                        var16.method5806(arg1 + var13, this.field3712 + var6 - var16.field3909 + var14);
                                        arg1 += var16.field3903;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method5137(var12);
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
                        if (this.field3722 != null && var8 != -1) {
                            arg1 += this.field3722[(var8 << 8) + var11];
                        }
                        int var18 = this.field3731[var11];
                        int var19 = this.field3724[var11];
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
                            if (field3730 > 0) {
                                field3715 += field3730;
                                arg1 += field3715 >> 8;
                                field3715 &= 0xFF;
                            }
                        } else if (field3729 == 256) {
                            if (field3726 != -1) {
                                method5087(this.field3733[var11], this.field3714[var11] + arg1 + 1 + var20, this.field3717[var11] + var6 + 1 + var21, var18, var19, field3726);
                            }
                            this.method5079(this.field3733[var11], this.field3714[var11] + arg1 + var20, this.field3717[var11] + var6 + var21, var18, var19, field3728);
                        } else {
                            if (field3726 != -1) {
                                method5098(this.field3733[var11], this.field3714[var11] + arg1 + 1 + var20, this.field3717[var11] + var6 + 1 + var21, var18, var19, field3726, field3729);
                            }
                            this.method5073(this.field3733[var11], this.field3714[var11] + arg1 + var20, this.field3717[var11] + var6 + var21, var18, var19, field3728, field3729);
                        }
                        int var22 = this.field3718[var11];
                        if (field3716 != -1) {
                            method5736(arg1, (int) ((double) this.field3712 * 0.7D) + var6, var22, field3716);
                        }
                        if (field3713 != -1) {
                            method5736(arg1, this.field3712 + var6, var22, field3713);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ks.ax([BIIIII)V")
    public static void method5087(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field3886 * arg2 + arg1;
        int var7 = Statics.field3886 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field3888) {
            int var10 = field3888 - arg2;
            arg4 -= var10;
            arg2 = field3888;
            var9 += arg3 * var10;
            var6 += Statics.field3886 * var10;
        }
        if (arg2 + arg4 > field3889) {
            arg4 -= arg2 + arg4 - field3889;
        }
        if (arg1 < field3890) {
            int var11 = field3890 - arg1;
            arg3 -= var11;
            arg1 = field3890;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field3891) {
            int var12 = arg1 + arg3 - field3891;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5104(Statics.field3885, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("ks.ar([I[BIIIIIII)V")
    public static void method5104(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("ks.al([BIIIIII)V")
    public static void method5098(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field3886 * arg2 + arg1;
        int var8 = Statics.field3886 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3888) {
            int var11 = field3888 - arg2;
            arg4 -= var11;
            arg2 = field3888;
            var10 += arg3 * var11;
            var7 += Statics.field3886 * var11;
        }
        if (arg2 + arg4 > field3889) {
            arg4 -= arg2 + arg4 - field3889;
        }
        if (arg1 < field3890) {
            int var12 = field3890 - arg1;
            arg3 -= var12;
            arg1 = field3890;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3891) {
            int var13 = arg1 + arg3 - field3891;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5114(Statics.field3885, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("ks.aa([I[BIIIIIIII)V")
    public static void method5114(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("ks.n([BIIIII)V")
    public abstract void method5079(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("ks.v([BIIIIII)V")
    public abstract void method5073(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
