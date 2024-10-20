package deob;

import java.util.Random;

@ObfuscatedName("kx")
public abstract class class300 extends class391 {

    @ObfuscatedName("kx.f")
    public byte[][] field3727 = new byte[256][];

    @ObfuscatedName("kx.o")
    public int[] field3738;

    @ObfuscatedName("kx.u")
    public int[] field3728;

    @ObfuscatedName("kx.p")
    public int[] field3729;

    @ObfuscatedName("kx.b")
    public int[] field3745;

    @ObfuscatedName("kx.e")
    public int[] field3726;

    @ObfuscatedName("kx.k")
    public int field3732 = 0;

    @ObfuscatedName("kx.g")
    public int field3733;

    @ObfuscatedName("kx.h")
    public int field3730;

    @ObfuscatedName("kx.l")
    public byte[] field3737;

    @ObfuscatedName("kx.m")
    public static int field3744 = -1;

    @ObfuscatedName("kx.d")
    public static int field3736 = -1;

    @ObfuscatedName("kx.c")
    public static int field3739 = -1;

    @ObfuscatedName("kx.j")
    public static int field3740 = -1;

    @ObfuscatedName("kx.r")
    public static int field3741 = 0;

    @ObfuscatedName("kx.q")
    public static int field3742 = 0;

    @ObfuscatedName("kx.t")
    public static int field3743 = 256;

    @ObfuscatedName("kx.v")
    public static int field3731 = 0;

    @ObfuscatedName("kx.x")
    public static int field3734 = 0;

    @ObfuscatedName("kx.z")
    public static Random field3746 = new Random();

    @ObfuscatedName("kx.i")
    public static String[] field3747 = new String[100];

    public class300(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3745 = arg1;
        this.field3726 = arg2;
        this.field3728 = arg3;
        this.field3729 = arg4;
        this.method4801(arg0);
        this.field3727 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3726[var10] < var8 && this.field3729[var10] != 0) {
                var8 = this.field3726[var10];
            }
            if (this.field3729[var10] + this.field3726[var10] > var9) {
                var9 = this.field3729[var10] + this.field3726[var10];
            }
        }
        this.field3733 = this.field3732 - var8;
        this.field3730 = var9 - this.field3732;
    }

    public class300(byte[] arg0) {
        this.method4801(arg0);
    }

    @ObfuscatedName("kx.h([B)V")
    public void method4801(byte[] arg0) {
        this.field3738 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3738.length; var2++) {
                this.field3738[var2] = arg0[var2] & 0xFF;
            }
            this.field3732 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3738[var4] = arg0[var3++] & 0xFF;
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
        this.field3737 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3737[(var17 << 8) + var18] = (byte) method4795(var9, var13, var6, this.field3738, var5, var17, var18);
                    }
                }
            }
        }
        this.field3732 = var5[32] + var6[32];
    }

    @ObfuscatedName("kx.n([[B[[B[I[I[III)I")
    public static int method4795(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("kx.l(C)I")
    public int method4780(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3738[class301.method2075(arg0) & 0xFF];
    }

    @ObfuscatedName("kx.m(Ljava/lang/String;)I")
    public int method4781(String arg0) {
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
                                    int var8 = class303.method931(var7.substring(4));
                                    var4 += Statics.field3735[var8].field4240;
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
                    var4 += this.field3738[(char) (class301.method2075(var6) & 0xFF)];
                    if (this.field3737 != null && var3 != -1) {
                        var4 += this.field3737[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("kx.d(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method4811(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method4780('<');
                        if (this.field3737 != null && var11 != -1) {
                            var4 += this.field3737[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method4780('>');
                        if (this.field3737 != null && var11 != -1) {
                            var4 += this.field3737[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class303.method931(var16.substring(4));
                            var4 += Statics.field3735[var17].field4240;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method4780(var15);
                        if (this.field3737 != null && var11 != -1) {
                            var4 += this.field3737[(var11 << 8) + var15];
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

    @ObfuscatedName("kx.c(Ljava/lang/String;I)I")
    public int method4814(String arg0, int arg1) {
        int var3 = this.method4811(arg0, new int[] { arg1 }, field3747);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method4781(field3747[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("kx.j(Ljava/lang/String;I)I")
    public int method4813(String arg0, int arg1) {
        return this.method4811(arg0, new int[] { arg1 }, field3747);
    }

    @ObfuscatedName("kx.r(Ljava/lang/String;)Ljava/lang/String;")
    public static String method4804(String arg0) {
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

    @ObfuscatedName("kx.q(Ljava/lang/String;IIII)V")
    public void method4785(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4794(arg3, arg4);
            this.method4797(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kx.t(Ljava/lang/String;IIIII)V")
    public void method4840(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method4794(arg3, arg4);
            field3743 = arg5;
            this.method4797(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kx.v(Ljava/lang/String;IIII)V")
    public void method4855(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4794(arg3, arg4);
            this.method4797(arg0, arg1 - this.method4781(arg0), arg2);
        }
    }

    @ObfuscatedName("kx.x(Ljava/lang/String;IIII)V")
    public void method4788(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4794(arg3, arg4);
            this.method4797(arg0, arg1 - this.method4781(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("kx.z(Ljava/lang/String;IIIIIIIII)I")
    public int method4789(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method4794(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3732;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3733 + this.field3730 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method4811(arg0, var11, field3747);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3733 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3733 - this.field3730 - (var12 - 1) * arg9) / 2 + this.field3733 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3730 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3733 - this.field3730 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3733 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method4797(field3747[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method4797(field3747[var15], arg1 + (arg3 - this.method4781(field3747[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method4797(field3747[var15], arg1 + arg3 - this.method4781(field3747[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method4797(field3747[var15], arg1, var13);
            } else {
                this.method4796(field3747[var15], arg3);
                this.method4797(field3747[var15], arg1, var13);
                field3731 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("kx.i(Ljava/lang/String;IIIII)V")
    public void method4790(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4794(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method4798(arg0, arg1 - this.method4781(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("kx.a(Ljava/lang/String;IIIII)V")
    public void method4791(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4794(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method4798(arg0, arg1 - this.method4781(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("kx.w(Ljava/lang/String;IIIIII)V")
    public void method4792(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method4794(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method4798(arg0, arg1 - this.method4781(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("kx.s(Ljava/lang/String;IIIII)V")
    public void method4793(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4794(arg3, arg4);
        field3746.setSeed((long) arg5);
        field3743 = 192 + (field3746.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3746.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method4798(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("kx.y(II)V")
    public void method4794(int arg0, int arg1) {
        field3744 = -1;
        field3736 = -1;
        field3739 = arg1;
        field3740 = arg1;
        field3741 = arg0;
        field3742 = arg0;
        field3743 = 256;
        field3731 = 0;
        field3734 = 0;
    }

    @ObfuscatedName("kx.ac(Ljava/lang/String;)V")
    public void method4825(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field3742 = class303.method2837(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field3742 = field3741;
            } else if (arg0.startsWith("str=")) {
                field3744 = class303.method2837(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field3744 = 8388608;
            } else if (arg0.equals("/str")) {
                field3744 = -1;
            } else if (arg0.startsWith("u=")) {
                field3736 = class303.method2837(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field3736 = 0;
            } else if (arg0.equals("/u")) {
                field3736 = -1;
            } else if (arg0.startsWith("shad=")) {
                field3740 = class303.method2837(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field3740 = 0;
            } else if (arg0.equals("/shad")) {
                field3740 = field3739;
            } else if (arg0.equals("br")) {
                this.method4794(field3741, field3739);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("kx.ay(Ljava/lang/String;I)V")
    public void method4796(String arg0, int arg1) {
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
            field3731 = (arg1 - this.method4781(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("kx.am(Ljava/lang/String;II)V")
    public void method4797(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3732;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class301.method2075(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class303.method931(var9.substring(4));
                                        class394 var11 = Statics.field3735[var10];
                                        var11.method6207(arg1, this.field3732 + var4 - var11.field4235);
                                        arg1 += var11.field4240;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method4825(var9);
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
                        if (this.field3737 != null && var6 != -1) {
                            arg1 += this.field3737[(var6 << 8) + var8];
                        }
                        int var13 = this.field3728[var8];
                        int var14 = this.field3729[var8];
                        if (var8 == ' ') {
                            if (field3731 > 0) {
                                field3734 += field3731;
                                arg1 += field3734 >> 8;
                                field3734 &= 0xFF;
                            }
                        } else if (field3743 == 256) {
                            if (field3740 != -1) {
                                method4829(this.field3727[var8], this.field3745[var8] + arg1 + 1, this.field3726[var8] + var4 + 1, var13, var14, field3740);
                            }
                            this.method4774(this.field3727[var8], this.field3745[var8] + arg1, this.field3726[var8] + var4, var13, var14, field3742);
                        } else {
                            if (field3740 != -1) {
                                method4864(this.field3727[var8], this.field3745[var8] + arg1 + 1, this.field3726[var8] + var4 + 1, var13, var14, field3740, field3743);
                            }
                            this.method4771(this.field3727[var8], this.field3745[var8] + arg1, this.field3726[var8] + var4, var13, var14, field3742, field3743);
                        }
                        int var15 = this.field3738[var8];
                        if (field3744 != -1) {
                            method6133(arg1, (int) ((double) this.field3732 * 0.7D) + var4, var15, field3744);
                        }
                        if (field3736 != -1) {
                            method6133(arg1, this.field3732 + var4 + 1, var15, field3736);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kx.ag(Ljava/lang/String;II[I[I)V")
    public void method4798(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3732;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class301.method2075(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class303.method931(var12.substring(4));
                                        class394 var16 = Statics.field3735[var15];
                                        var16.method6207(arg1 + var13, this.field3732 + var6 - var16.field4235 + var14);
                                        arg1 += var16.field4240;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method4825(var12);
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
                        if (this.field3737 != null && var8 != -1) {
                            arg1 += this.field3737[(var8 << 8) + var11];
                        }
                        int var18 = this.field3728[var11];
                        int var19 = this.field3729[var11];
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
                            if (field3731 > 0) {
                                field3734 += field3731;
                                arg1 += field3734 >> 8;
                                field3734 &= 0xFF;
                            }
                        } else if (field3743 == 256) {
                            if (field3740 != -1) {
                                method4829(this.field3727[var11], this.field3745[var11] + arg1 + 1 + var20, this.field3726[var11] + var6 + 1 + var21, var18, var19, field3740);
                            }
                            this.method4774(this.field3727[var11], this.field3745[var11] + arg1 + var20, this.field3726[var11] + var6 + var21, var18, var19, field3742);
                        } else {
                            if (field3740 != -1) {
                                method4864(this.field3727[var11], this.field3745[var11] + arg1 + 1 + var20, this.field3726[var11] + var6 + 1 + var21, var18, var19, field3740, field3743);
                            }
                            this.method4771(this.field3727[var11], this.field3745[var11] + arg1 + var20, this.field3726[var11] + var6 + var21, var18, var19, field3742, field3743);
                        }
                        int var22 = this.field3738[var11];
                        if (field3744 != -1) {
                            method6133(arg1, (int) ((double) this.field3732 * 0.7D) + var6, var22, field3744);
                        }
                        if (field3736 != -1) {
                            method6133(arg1, this.field3732 + var6, var22, field3736);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kx.aq([BIIIII)V")
    public static void method4829(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field4219 * arg2 + arg1;
        int var7 = Statics.field4219 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field4222) {
            int var10 = field4222 - arg2;
            arg4 -= var10;
            arg2 = field4222;
            var9 += arg3 * var10;
            var6 += Statics.field4219 * var10;
        }
        if (arg2 + arg4 > field4220) {
            arg4 -= arg2 + arg4 - field4220;
        }
        if (arg1 < field4221) {
            int var11 = field4221 - arg1;
            arg3 -= var11;
            arg1 = field4221;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field4224) {
            int var12 = arg1 + arg3 - field4224;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4827(Statics.field4223, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("kx.at([I[BIIIIIII)V")
    public static void method4827(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("kx.aj([BIIIIII)V")
    public static void method4864(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field4219 * arg2 + arg1;
        int var8 = Statics.field4219 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4222) {
            int var11 = field4222 - arg2;
            arg4 -= var11;
            arg2 = field4222;
            var10 += arg3 * var11;
            var7 += Statics.field4219 * var11;
        }
        if (arg2 + arg4 > field4220) {
            arg4 -= arg2 + arg4 - field4220;
        }
        if (arg1 < field4221) {
            int var12 = field4221 - arg1;
            arg3 -= var12;
            arg1 = field4221;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4224) {
            int var13 = arg1 + arg3 - field4224;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4802(Statics.field4223, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("kx.aw([I[BIIIIIIII)V")
    public static void method4802(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("kx.f([BIIIII)V")
    public abstract void method4774(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("kx.o([BIIIIII)V")
    public abstract void method4771(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
