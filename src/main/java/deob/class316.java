package deob;

import java.util.Random;

@ObfuscatedName("ls")
public abstract class class316 extends class410 {

    @ObfuscatedName("ls.i")
    public byte[][] field3829 = new byte[256][];

    @ObfuscatedName("ls.w")
    public int[] field3828;

    @ObfuscatedName("ls.s")
    public int[] field3827;

    @ObfuscatedName("ls.a")
    public int[] field3843;

    @ObfuscatedName("ls.o")
    public int[] field3846;

    @ObfuscatedName("ls.g")
    public int[] field3842;

    @ObfuscatedName("ls.e")
    public int field3826 = 0;

    @ObfuscatedName("ls.p")
    public int field3832;

    @ObfuscatedName("ls.j")
    public int field3833;

    @ObfuscatedName("ls.x")
    public byte[] field3835;

    @ObfuscatedName("ls.y")
    public static int field3836 = -1;

    @ObfuscatedName("ls.k")
    public static int field3837 = -1;

    @ObfuscatedName("ls.t")
    public static int field3838 = -1;

    @ObfuscatedName("ls.l")
    public static int field3839 = -1;

    @ObfuscatedName("ls.u")
    public static int field3840 = 0;

    @ObfuscatedName("ls.n")
    public static int field3845 = 0;

    @ObfuscatedName("ls.z")
    public static int field3841 = 256;

    @ObfuscatedName("ls.q")
    public static int field3830 = 0;

    @ObfuscatedName("ls.d")
    public static int field3844 = 0;

    @ObfuscatedName("ls.r")
    public static Random field3831 = new Random();

    @ObfuscatedName("ls.m")
    public static String[] field3825 = new String[100];

    public class316(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3846 = arg1;
        this.field3842 = arg2;
        this.field3827 = arg3;
        this.field3843 = arg4;
        this.method5156(arg0);
        this.field3829 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3842[var10] < var8 && this.field3843[var10] != 0) {
                var8 = this.field3842[var10];
            }
            if (this.field3843[var10] + this.field3842[var10] > var9) {
                var9 = this.field3843[var10] + this.field3842[var10];
            }
        }
        this.field3832 = this.field3826 - var8;
        this.field3833 = var9 - this.field3826;
    }

    public class316(byte[] arg0) {
        this.method5156(arg0);
    }

    @ObfuscatedName("ls.x([B)V")
    public void method5156(byte[] arg0) {
        this.field3828 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3828.length; var2++) {
                this.field3828[var2] = arg0[var2] & 0xFF;
            }
            this.field3826 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3828[var4] = arg0[var3++] & 0xFF;
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
        this.field3835 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3835[(var17 << 8) + var18] = (byte) method5209(var9, var13, var6, this.field3828, var5, var17, var18);
                    }
                }
            }
        }
        this.field3826 = var5[32] + var6[32];
    }

    @ObfuscatedName("ls.y([[B[[B[I[I[III)I")
    public static int method5209(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("ls.k(C)I")
    public int method5161(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3828[Statics.method5595(arg0) & 0xFF];
    }

    @ObfuscatedName("ls.t(Ljava/lang/String;)I")
    public int method5159(String arg0) {
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
                                    int var8 = class319.method2587(var7.substring(4));
                                    var4 += Statics.field3834[var8].field4391;
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
                    var4 += this.field3828[(char) (Statics.method5595(var6) & 0xFF)];
                    if (this.field3835 != null && var3 != -1) {
                        var4 += this.field3835[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("ls.l(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method5160(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method5161('<');
                        if (this.field3835 != null && var11 != -1) {
                            var4 += this.field3835[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method5161('>');
                        if (this.field3835 != null && var11 != -1) {
                            var4 += this.field3835[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class319.method2587(var16.substring(4));
                            var4 += Statics.field3834[var17].field4391;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method5161(var15);
                        if (this.field3835 != null && var11 != -1) {
                            var4 += this.field3835[(var11 << 8) + var15];
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

    @ObfuscatedName("ls.u(Ljava/lang/String;I)I")
    public int method5215(String arg0, int arg1) {
        int var3 = this.method5160(arg0, new int[] { arg1 }, field3825);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method5159(field3825[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("ls.n(Ljava/lang/String;I)I")
    public int method5216(String arg0, int arg1) {
        return this.method5160(arg0, new int[] { arg1 }, field3825);
    }

    @ObfuscatedName("ls.z(Ljava/lang/String;)Ljava/lang/String;")
    public static String method5163(String arg0) {
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

    @ObfuscatedName("ls.q(IILjava/lang/String;II)Lmo;")
    public class351 method5164(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class351(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method5159(arg2) / 2;
        int var7 = var6 + this.method5159(arg2.substring(0, arg0));
        int var8 = arg4 - this.field3832;
        int var9 = this.method5159(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field3833 + this.field3832;
        return new class351(var7, var8, var9, var10);
    }

    @ObfuscatedName("ls.d(Ljava/lang/String;IIII)V")
    public void method5165(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5174(arg3, arg4);
            this.method5195(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ls.r(Ljava/lang/String;IIIII)V")
    public void method5166(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method5174(arg3, arg4);
            field3841 = arg5;
            this.method5195(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ls.m(Ljava/lang/String;IIII)V")
    public void method5242(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5174(arg3, arg4);
            this.method5195(arg0, arg1 - this.method5159(arg0), arg2);
        }
    }

    @ObfuscatedName("ls.c(Ljava/lang/String;IIII)V")
    public void method5168(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5174(arg3, arg4);
            this.method5195(arg0, arg1 - this.method5159(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("ls.f(Ljava/lang/String;IIIIIIIII)I")
    public int method5169(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method5174(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3826;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3833 + this.field3832 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method5160(arg0, var11, field3825);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3832 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3832 - this.field3833 - (var12 - 1) * arg9) / 2 + this.field3832 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3833 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3832 - this.field3833 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3832 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method5195(field3825[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method5195(field3825[var15], arg1 + (arg3 - this.method5159(field3825[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method5195(field3825[var15], arg1 + arg3 - this.method5159(field3825[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method5195(field3825[var15], arg1, var13);
            } else {
                this.method5176(field3825[var15], arg3);
                this.method5195(field3825[var15], arg1, var13);
                field3830 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("ls.h(Ljava/lang/String;IIIII)V")
    public void method5170(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5174(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method5228(arg0, arg1 - this.method5159(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("ls.v(Ljava/lang/String;IIIII)V")
    public void method5171(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5174(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method5228(arg0, arg1 - this.method5159(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("ls.ag(Ljava/lang/String;IIIIII)V")
    public void method5172(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method5174(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method5228(arg0, arg1 - this.method5159(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("ls.ae(Ljava/lang/String;IIIII)V")
    public void method5173(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5174(arg3, arg4);
        field3831.setSeed((long) arg5);
        field3841 = 192 + (field3831.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3831.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method5228(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("ls.aq(II)V")
    public void method5174(int arg0, int arg1) {
        field3836 = -1;
        field3837 = -1;
        field3838 = arg1;
        field3839 = arg1;
        field3840 = arg0;
        field3845 = arg0;
        field3841 = 256;
        field3830 = 0;
        field3844 = 0;
    }

    @ObfuscatedName("ls.al(Ljava/lang/String;)V")
    public void method5175(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field3845 = class319.method3089(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field3845 = field3840;
            } else if (arg0.startsWith("str=")) {
                field3836 = class319.method3089(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field3836 = 8388608;
            } else if (arg0.equals("/str")) {
                field3836 = -1;
            } else if (arg0.startsWith("u=")) {
                field3837 = class319.method3089(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field3837 = 0;
            } else if (arg0.equals("/u")) {
                field3837 = -1;
            } else if (arg0.startsWith("shad=")) {
                field3839 = class319.method3089(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field3839 = 0;
            } else if (arg0.equals("/shad")) {
                field3839 = field3838;
            } else if (arg0.equals("br")) {
                this.method5174(field3840, field3838);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ls.am(Ljava/lang/String;I)V")
    public void method5176(String arg0, int arg1) {
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
            field3830 = (arg1 - this.method5159(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("ls.ai(Ljava/lang/String;II)V")
    public void method5195(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3826;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (Statics.method5595(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class319.method2587(var9.substring(4));
                                        class413 var11 = Statics.field3834[var10];
                                        var11.method6611(arg1, this.field3826 + var4 - var11.field4392);
                                        arg1 += var11.field4391;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method5175(var9);
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
                        if (this.field3835 != null && var6 != -1) {
                            arg1 += this.field3835[(var6 << 8) + var8];
                        }
                        int var13 = this.field3827[var8];
                        int var14 = this.field3843[var8];
                        if (var8 == ' ') {
                            if (field3830 > 0) {
                                field3844 += field3830;
                                arg1 += field3844 >> 8;
                                field3844 &= 0xFF;
                            }
                        } else if (field3841 == 256) {
                            if (field3839 != -1) {
                                method5180(this.field3829[var8], this.field3846[var8] + arg1 + 1, this.field3842[var8] + var4 + 1, var13, var14, field3839);
                            }
                            this.method5146(this.field3829[var8], this.field3846[var8] + arg1, this.field3842[var8] + var4, var13, var14, field3845);
                        } else {
                            if (field3839 != -1) {
                                method5179(this.field3829[var8], this.field3846[var8] + arg1 + 1, this.field3842[var8] + var4 + 1, var13, var14, field3839, field3841);
                            }
                            this.method5149(this.field3829[var8], this.field3846[var8] + arg1, this.field3842[var8] + var4, var13, var14, field3845, field3841);
                        }
                        int var15 = this.field3828[var8];
                        if (field3836 != -1) {
                            method6532(arg1, (int) ((double) this.field3826 * 0.7D) + var4, var15, field3836);
                        }
                        if (field3837 != -1) {
                            method6532(arg1, this.field3826 + var4 + 1, var15, field3837);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ls.ah(Ljava/lang/String;II[I[I)V")
    public void method5228(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3826;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (Statics.method5595(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class319.method2587(var12.substring(4));
                                        class413 var16 = Statics.field3834[var15];
                                        var16.method6611(arg1 + var13, this.field3826 + var6 - var16.field4392 + var14);
                                        arg1 += var16.field4391;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method5175(var12);
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
                        if (this.field3835 != null && var8 != -1) {
                            arg1 += this.field3835[(var8 << 8) + var11];
                        }
                        int var18 = this.field3827[var11];
                        int var19 = this.field3843[var11];
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
                            if (field3830 > 0) {
                                field3844 += field3830;
                                arg1 += field3844 >> 8;
                                field3844 &= 0xFF;
                            }
                        } else if (field3841 == 256) {
                            if (field3839 != -1) {
                                method5180(this.field3829[var11], this.field3846[var11] + arg1 + 1 + var20, this.field3842[var11] + var6 + 1 + var21, var18, var19, field3839);
                            }
                            this.method5146(this.field3829[var11], this.field3846[var11] + arg1 + var20, this.field3842[var11] + var6 + var21, var18, var19, field3845);
                        } else {
                            if (field3839 != -1) {
                                method5179(this.field3829[var11], this.field3846[var11] + arg1 + 1 + var20, this.field3842[var11] + var6 + 1 + var21, var18, var19, field3839, field3841);
                            }
                            this.method5149(this.field3829[var11], this.field3846[var11] + arg1 + var20, this.field3842[var11] + var6 + var21, var18, var19, field3845, field3841);
                        }
                        int var22 = this.field3828[var11];
                        if (field3836 != -1) {
                            method6532(arg1, (int) ((double) this.field3826 * 0.7D) + var6, var22, field3836);
                        }
                        if (field3837 != -1) {
                            method6532(arg1, this.field3826 + var6, var22, field3837);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ls.as([BIIIII)V")
    public static void method5180(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field4367 * arg2 + arg1;
        int var7 = Statics.field4367 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field4370) {
            int var10 = field4370 - arg2;
            arg4 -= var10;
            arg2 = field4370;
            var9 += arg3 * var10;
            var6 += Statics.field4367 * var10;
        }
        if (arg2 + arg4 > field4368) {
            arg4 -= arg2 + arg4 - field4368;
        }
        if (arg1 < field4371) {
            int var11 = field4371 - arg1;
            arg3 -= var11;
            arg1 = field4371;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field4372) {
            int var12 = arg1 + arg3 - field4372;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5181(Statics.field4366, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("ls.at([I[BIIIIIII)V")
    public static void method5181(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("ls.az([BIIIIII)V")
    public static void method5179(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field4367 * arg2 + arg1;
        int var8 = Statics.field4367 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4370) {
            int var11 = field4370 - arg2;
            arg4 -= var11;
            arg2 = field4370;
            var10 += arg3 * var11;
            var7 += Statics.field4367 * var11;
        }
        if (arg2 + arg4 > field4368) {
            arg4 -= arg2 + arg4 - field4368;
        }
        if (arg1 < field4371) {
            int var12 = field4371 - arg1;
            arg3 -= var12;
            arg1 = field4371;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4372) {
            int var13 = arg1 + arg3 - field4372;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5182(Statics.field4366, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("ls.ac([I[BIIIIIIII)V")
    public static void method5182(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("ls.i([BIIIII)V")
    public abstract void method5146(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("ls.w([BIIIIII)V")
    public abstract void method5149(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
