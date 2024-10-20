package deob;

import java.util.Random;

@ObfuscatedName("kc")
public abstract class class301 extends class392 {

    @ObfuscatedName("kc.v")
    public byte[][] field3720 = new byte[256][];

    @ObfuscatedName("kc.n")
    public int[] field3728;

    @ObfuscatedName("kc.f")
    public int[] field3721;

    @ObfuscatedName("kc.y")
    public int[] field3732;

    @ObfuscatedName("kc.p")
    public int[] field3723;

    @ObfuscatedName("kc.j")
    public int[] field3719;

    @ObfuscatedName("kc.r")
    public int field3730 = 0;

    @ObfuscatedName("kc.b")
    public int field3726;

    @ObfuscatedName("kc.d")
    public int field3727;

    @ObfuscatedName("kc.u")
    public byte[] field3729;

    @ObfuscatedName("kc.l")
    public static int field3722 = -1;

    @ObfuscatedName("kc.o")
    public static int field3724 = -1;

    @ObfuscatedName("kc.c")
    public static int field3738 = -1;

    @ObfuscatedName("kc.e")
    public static int field3733 = -1;

    @ObfuscatedName("kc.g")
    public static int field3734 = 0;

    @ObfuscatedName("kc.a")
    public static int field3725 = 0;

    @ObfuscatedName("kc.k")
    public static int field3736 = 256;

    @ObfuscatedName("kc.m")
    public static int field3737 = 0;

    @ObfuscatedName("kc.x")
    public static int field3731 = 0;

    @ObfuscatedName("kc.z")
    public static Random field3739 = new Random();

    @ObfuscatedName("kc.w")
    public static String[] field3740 = new String[100];

    public class301(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3723 = arg1;
        this.field3719 = arg2;
        this.field3721 = arg3;
        this.field3732 = arg4;
        this.method4933(arg0);
        this.field3720 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3719[var10] < var8 && this.field3732[var10] != 0) {
                var8 = this.field3719[var10];
            }
            if (this.field3732[var10] + this.field3719[var10] > var9) {
                var9 = this.field3732[var10] + this.field3719[var10];
            }
        }
        this.field3726 = this.field3730 - var8;
        this.field3727 = var9 - this.field3730;
    }

    public class301(byte[] arg0) {
        this.method4933(arg0);
    }

    @ObfuscatedName("kc.d([B)V")
    public void method4933(byte[] arg0) {
        this.field3728 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3728.length; var2++) {
                this.field3728[var2] = arg0[var2] & 0xFF;
            }
            this.field3730 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3728[var4] = arg0[var3++] & 0xFF;
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
        this.field3729 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3729[(var17 << 8) + var18] = (byte) method4884(var9, var13, var6, this.field3728, var5, var17, var18);
                    }
                }
            }
        }
        this.field3730 = var5[32] + var6[32];
    }

    @ObfuscatedName("kc.s([[B[[B[I[I[III)I")
    public static int method4884(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("kc.u(C)I")
    public int method4885(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3728[class302.method3977(arg0) & 0xFF];
    }

    @ObfuscatedName("kc.l(Ljava/lang/String;)I")
    public int method4906(String arg0) {
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
                                    int var8 = class304.method1725(var7.substring(4));
                                    var4 += Statics.field3735[var8].field4242;
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
                    var4 += this.field3728[(char) (class302.method3977(var6) & 0xFF)];
                    if (this.field3729 != null && var3 != -1) {
                        var4 += this.field3729[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("kc.o(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method4887(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method4885('<');
                        if (this.field3729 != null && var11 != -1) {
                            var4 += this.field3729[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method4885('>');
                        if (this.field3729 != null && var11 != -1) {
                            var4 += this.field3729[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class304.method1725(var16.substring(4));
                            var4 += Statics.field3735[var17].field4242;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method4885(var15);
                        if (this.field3729 != null && var11 != -1) {
                            var4 += this.field3729[(var11 << 8) + var15];
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

    @ObfuscatedName("kc.c(Ljava/lang/String;I)I")
    public int method4888(String arg0, int arg1) {
        int var3 = this.method4887(arg0, new int[] { arg1 }, field3740);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method4906(field3740[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("kc.e(Ljava/lang/String;I)I")
    public int method4889(String arg0, int arg1) {
        return this.method4887(arg0, new int[] { arg1 }, field3740);
    }

    @ObfuscatedName("kc.g(Ljava/lang/String;)Ljava/lang/String;")
    public static String method4890(String arg0) {
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

    @ObfuscatedName("kc.a(Ljava/lang/String;IIII)V")
    public void method4891(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4900(arg3, arg4);
            this.method4883(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kc.k(Ljava/lang/String;IIIII)V")
    public void method4892(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method4900(arg3, arg4);
            field3736 = arg5;
            this.method4883(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kc.m(Ljava/lang/String;IIII)V")
    public void method4964(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4900(arg3, arg4);
            this.method4883(arg0, arg1 - this.method4906(arg0), arg2);
        }
    }

    @ObfuscatedName("kc.x(Ljava/lang/String;IIII)V")
    public void method4894(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4900(arg3, arg4);
            this.method4883(arg0, arg1 - this.method4906(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("kc.z(Ljava/lang/String;IIIIIIIII)I")
    public int method4905(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method4900(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3730;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3727 + this.field3726 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method4887(arg0, var11, field3740);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3726 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3726 - this.field3727 - (var12 - 1) * arg9) / 2 + this.field3726 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3727 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3726 - this.field3727 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3726 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method4883(field3740[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method4883(field3740[var15], arg1 + (arg3 - this.method4906(field3740[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method4883(field3740[var15], arg1 + arg3 - this.method4906(field3740[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method4883(field3740[var15], arg1, var13);
            } else {
                this.method4960(field3740[var15], arg3);
                this.method4883(field3740[var15], arg1, var13);
                field3737 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("kc.w(Ljava/lang/String;IIIII)V")
    public void method4916(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4900(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method4918(arg0, arg1 - this.method4906(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("kc.t(Ljava/lang/String;IIIII)V")
    public void method4949(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4900(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method4918(arg0, arg1 - this.method4906(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("kc.h(Ljava/lang/String;IIIIII)V")
    public void method4898(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method4900(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method4918(arg0, arg1 - this.method4906(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("kc.q(Ljava/lang/String;IIIII)V")
    public void method4899(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4900(arg3, arg4);
        field3739.setSeed((long) arg5);
        field3736 = 192 + (field3739.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3739.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method4918(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("kc.i(II)V")
    public void method4900(int arg0, int arg1) {
        field3722 = -1;
        field3724 = -1;
        field3738 = arg1;
        field3733 = arg1;
        field3734 = arg0;
        field3725 = arg0;
        field3736 = 256;
        field3737 = 0;
        field3731 = 0;
    }

    @ObfuscatedName("kc.ae(Ljava/lang/String;)V")
    public void method4901(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class304.method180(var2, 16, true);
                field3725 = var3;
            } else if (arg0.equals("/col")) {
                field3725 = field3734;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class304.method180(var4, 16, true);
                field3722 = var5;
            } else if (arg0.equals("str")) {
                field3722 = 8388608;
            } else if (arg0.equals("/str")) {
                field3722 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class304.method180(var6, 16, true);
                field3724 = var7;
            } else if (arg0.equals("u")) {
                field3724 = 0;
            } else if (arg0.equals("/u")) {
                field3724 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class304.method180(var8, 16, true);
                field3733 = var9;
            } else if (arg0.equals("shad")) {
                field3733 = 0;
            } else if (arg0.equals("/shad")) {
                field3733 = field3738;
            } else if (arg0.equals("br")) {
                this.method4900(field3734, field3738);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("kc.ap(Ljava/lang/String;I)V")
    public void method4960(String arg0, int arg1) {
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
            field3737 = (arg1 - this.method4906(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("kc.ab(Ljava/lang/String;II)V")
    public void method4883(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3730;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class302.method3977(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class304.method1725(var9.substring(4));
                                        class395 var11 = Statics.field3735[var10];
                                        var11.method6324(arg1, this.field3730 + var4 - var11.field4239);
                                        arg1 += var11.field4242;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method4901(var9);
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
                        if (this.field3729 != null && var6 != -1) {
                            arg1 += this.field3729[(var6 << 8) + var8];
                        }
                        int var13 = this.field3721[var8];
                        int var14 = this.field3732[var8];
                        if (var8 == ' ') {
                            if (field3737 > 0) {
                                field3731 += field3737;
                                arg1 += field3731 >> 8;
                                field3731 &= 0xFF;
                            }
                        } else if (field3736 == 256) {
                            if (field3733 != -1) {
                                method4974(this.field3720[var8], this.field3723[var8] + arg1 + 1, this.field3719[var8] + var4 + 1, var13, var14, field3733);
                            }
                            this.method4876(this.field3720[var8], this.field3723[var8] + arg1, this.field3719[var8] + var4, var13, var14, field3725);
                        } else {
                            if (field3733 != -1) {
                                method4908(this.field3720[var8], this.field3723[var8] + arg1 + 1, this.field3719[var8] + var4 + 1, var13, var14, field3733, field3736);
                            }
                            this.method4877(this.field3720[var8], this.field3723[var8] + arg1, this.field3719[var8] + var4, var13, var14, field3725, field3736);
                        }
                        int var15 = this.field3728[var8];
                        if (field3722 != -1) {
                            method6309(arg1, (int) ((double) this.field3730 * 0.7D) + var4, var15, field3722);
                        }
                        if (field3724 != -1) {
                            method6309(arg1, this.field3730 + var4 + 1, var15, field3724);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kc.al(Ljava/lang/String;II[I[I)V")
    public void method4918(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3730;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class302.method3977(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class304.method1725(var12.substring(4));
                                        class395 var16 = Statics.field3735[var15];
                                        var16.method6324(arg1 + var13, this.field3730 + var6 - var16.field4239 + var14);
                                        arg1 += var16.field4242;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method4901(var12);
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
                        if (this.field3729 != null && var8 != -1) {
                            arg1 += this.field3729[(var8 << 8) + var11];
                        }
                        int var18 = this.field3721[var11];
                        int var19 = this.field3732[var11];
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
                            if (field3737 > 0) {
                                field3731 += field3737;
                                arg1 += field3731 >> 8;
                                field3731 &= 0xFF;
                            }
                        } else if (field3736 == 256) {
                            if (field3733 != -1) {
                                method4974(this.field3720[var11], this.field3723[var11] + arg1 + 1 + var20, this.field3719[var11] + var6 + 1 + var21, var18, var19, field3733);
                            }
                            this.method4876(this.field3720[var11], this.field3723[var11] + arg1 + var20, this.field3719[var11] + var6 + var21, var18, var19, field3725);
                        } else {
                            if (field3733 != -1) {
                                method4908(this.field3720[var11], this.field3723[var11] + arg1 + 1 + var20, this.field3719[var11] + var6 + 1 + var21, var18, var19, field3733, field3736);
                            }
                            this.method4877(this.field3720[var11], this.field3723[var11] + arg1 + var20, this.field3719[var11] + var6 + var21, var18, var19, field3725, field3736);
                        }
                        int var22 = this.field3728[var11];
                        if (field3722 != -1) {
                            method6309(arg1, (int) ((double) this.field3730 * 0.7D) + var6, var22, field3722);
                        }
                        if (field3724 != -1) {
                            method6309(arg1, this.field3730 + var6, var22, field3724);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kc.ad([BIIIII)V")
    public static void method4974(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field4221 * arg2 + arg1;
        int var7 = Statics.field4221 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field4224) {
            int var10 = field4224 - arg2;
            arg4 -= var10;
            arg2 = field4224;
            var9 += arg3 * var10;
            var6 += Statics.field4221 * var10;
        }
        if (arg2 + arg4 > field4222) {
            arg4 -= arg2 + arg4 - field4222;
        }
        if (arg1 < field4226) {
            int var11 = field4226 - arg1;
            arg3 -= var11;
            arg1 = field4226;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field4225) {
            int var12 = arg1 + arg3 - field4225;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4907(Statics.field4227, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("kc.ai([I[BIIIIIII)V")
    public static void method4907(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("kc.ar([BIIIIII)V")
    public static void method4908(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field4221 * arg2 + arg1;
        int var8 = Statics.field4221 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4224) {
            int var11 = field4224 - arg2;
            arg4 -= var11;
            arg2 = field4224;
            var10 += arg3 * var11;
            var7 += Statics.field4221 * var11;
        }
        if (arg2 + arg4 > field4222) {
            arg4 -= arg2 + arg4 - field4222;
        }
        if (arg1 < field4226) {
            int var12 = field4226 - arg1;
            arg3 -= var12;
            arg1 = field4226;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4225) {
            int var13 = arg1 + arg3 - field4225;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4909(Statics.field4227, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("kc.ag([I[BIIIIIIII)V")
    public static void method4909(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("kc.n([BIIIIII)V")
    public abstract void method4877(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("kc.v([BIIIII)V")
    public abstract void method4876(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
