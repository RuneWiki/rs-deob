package deob;

import java.util.Random;

@ObfuscatedName("js")
public abstract class class272 extends class291 {

    @ObfuscatedName("js.b")
    public byte[][] field3694 = new byte[256][];

    @ObfuscatedName("js.s")
    public int[] field3687;

    @ObfuscatedName("js.r")
    public int[] field3688;

    @ObfuscatedName("js.g")
    public int[] field3698;

    @ObfuscatedName("js.x")
    public int[] field3690;

    @ObfuscatedName("js.f")
    public int[] field3691;

    @ObfuscatedName("js.u")
    public int field3692 = 0;

    @ObfuscatedName("js.t")
    public int field3697;

    @ObfuscatedName("js.k")
    public int field3695;

    @ObfuscatedName("js.d")
    public byte[] field3707;

    @ObfuscatedName("js.o")
    public static int field3704 = -1;

    @ObfuscatedName("js.a")
    public static int field3686 = -1;

    @ObfuscatedName("js.q")
    public static int field3689 = -1;

    @ObfuscatedName("js.j")
    public static int field3700 = -1;

    @ObfuscatedName("js.m")
    public static int field3701 = 0;

    @ObfuscatedName("js.h")
    public static int field3702 = 0;

    @ObfuscatedName("js.c")
    public static int field3703 = 256;

    @ObfuscatedName("js.y")
    public static int field3693 = 0;

    @ObfuscatedName("js.p")
    public static int field3705 = 0;

    @ObfuscatedName("js.i")
    public static Random field3706 = new Random();

    @ObfuscatedName("js.l")
    public static String[] field3696 = new String[100];

    public class272(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3690 = arg1;
        this.field3691 = arg2;
        this.field3688 = arg3;
        this.field3698 = arg4;
        this.method4460(arg0);
        this.field3694 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3691[var10] < var8 && this.field3698[var10] != 0) {
                var8 = this.field3691[var10];
            }
            if (this.field3698[var10] + this.field3691[var10] > var9) {
                var9 = this.field3698[var10] + this.field3691[var10];
            }
        }
        this.field3697 = this.field3692 - var8;
        this.field3695 = var9 - this.field3692;
    }

    public class272(byte[] arg0) {
        this.method4460(arg0);
    }

    @ObfuscatedName("js.f([B)V")
    public void method4460(byte[] arg0) {
        this.field3687 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3687.length; var2++) {
                this.field3687[var2] = arg0[var2] & 0xFF;
            }
            this.field3692 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3687[var4] = arg0[var3++] & 0xFF;
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
        this.field3707 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3707[(var17 << 8) + var18] = (byte) method4520(var9, var13, var6, this.field3687, var5, var17, var18);
                    }
                }
            }
        }
        this.field3692 = var5[32] + var6[32];
    }

    @ObfuscatedName("js.u([[B[[B[I[I[III)I")
    public static int method4520(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("js.t(C)I")
    public int method4459(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3687[class274.method1555(arg0) & 0xFF];
    }

    @ObfuscatedName("js.k(Ljava/lang/String;)I")
    public int method4482(String arg0) {
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
                                    int var8 = class278.method4575(var7.substring(4));
                                    var4 += Statics.field3699[var8].field3831;
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
                    var4 += this.field3687[(char) (class274.method1555(var6) & 0xFF)];
                    if (this.field3707 != null && var3 != -1) {
                        var4 += this.field3707[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("js.n(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method4487(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method4459('<');
                        if (this.field3707 != null && var11 != -1) {
                            var4 += this.field3707[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method4459('>');
                        if (this.field3707 != null && var11 != -1) {
                            var4 += this.field3707[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class278.method913(var17, 10, true);
                            var4 += Statics.field3699[var18].field3831;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method4459(var15);
                        if (this.field3707 != null && var11 != -1) {
                            var4 += this.field3707[(var11 << 8) + var15];
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

    @ObfuscatedName("js.d(Ljava/lang/String;I)I")
    public int method4514(String arg0, int arg1) {
        int var3 = this.method4487(arg0, new int[] { arg1 }, field3696);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method4482(field3696[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("js.o(Ljava/lang/String;I)I")
    public int method4462(String arg0, int arg1) {
        return this.method4487(arg0, new int[] { arg1 }, field3696);
    }

    @ObfuscatedName("js.a(Ljava/lang/String;)Ljava/lang/String;")
    public static String method4463(String arg0) {
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

    @ObfuscatedName("js.q(Ljava/lang/String;IIII)V")
    public void method4464(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4488(arg3, arg4);
            this.method4476(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("js.j(Ljava/lang/String;IIIII)V")
    public void method4465(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method4488(arg3, arg4);
            field3703 = arg5;
            this.method4476(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("js.c(Ljava/lang/String;IIII)V")
    public void method4466(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4488(arg3, arg4);
            this.method4476(arg0, arg1 - this.method4482(arg0), arg2);
        }
    }

    @ObfuscatedName("js.i(Ljava/lang/String;IIII)V")
    public void method4467(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4488(arg3, arg4);
            this.method4476(arg0, arg1 - this.method4482(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("js.l(Ljava/lang/String;IIIIIIIII)I")
    public int method4468(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method4488(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3692;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3697 + this.field3695 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method4487(arg0, var11, field3696);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3697 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3697 - this.field3695 - (var12 - 1) * arg9) / 2 + this.field3697 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3695 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3697 - this.field3695 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3697 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method4476(field3696[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method4476(field3696[var15], arg1 + (arg3 - this.method4482(field3696[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method4476(field3696[var15], arg1 + arg3 - this.method4482(field3696[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method4476(field3696[var15], arg1, var13);
            } else {
                this.method4530(field3696[var15], arg3);
                this.method4476(field3696[var15], arg1, var13);
                field3693 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("js.z(Ljava/lang/String;IIIII)V")
    public void method4469(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4488(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method4477(arg0, arg1 - this.method4482(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("js.e(Ljava/lang/String;IIIII)V")
    public void method4470(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4488(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method4477(arg0, arg1 - this.method4482(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("js.v(Ljava/lang/String;IIIIII)V")
    public void method4471(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method4488(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method4477(arg0, arg1 - this.method4482(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("js.w(Ljava/lang/String;IIIII)V")
    public void method4472(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4488(arg3, arg4);
        field3706.setSeed((long) arg5);
        field3703 = 192 + (field3706.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3706.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method4477(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("js.av(II)V")
    public void method4488(int arg0, int arg1) {
        field3704 = -1;
        field3686 = -1;
        field3689 = arg1;
        field3700 = arg1;
        field3701 = arg0;
        field3702 = arg0;
        field3703 = 256;
        field3693 = 0;
        field3705 = 0;
    }

    @ObfuscatedName("js.au(Ljava/lang/String;)V")
    public void method4474(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field3702 = class278.method2844(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field3702 = field3701;
            } else if (arg0.startsWith("str=")) {
                String var2 = arg0.substring(4);
                int var3 = class278.method913(var2, 16, true);
                field3704 = var3;
            } else if (arg0.equals("str")) {
                field3704 = 8388608;
            } else if (arg0.equals("/str")) {
                field3704 = -1;
            } else if (arg0.startsWith("u=")) {
                String var4 = arg0.substring(2);
                int var5 = class278.method913(var4, 16, true);
                field3686 = var5;
            } else if (arg0.equals("u")) {
                field3686 = 0;
            } else if (arg0.equals("/u")) {
                field3686 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var6 = arg0.substring(5);
                int var7 = class278.method913(var6, 16, true);
                field3700 = var7;
            } else if (arg0.equals("shad")) {
                field3700 = 0;
            } else if (arg0.equals("/shad")) {
                field3700 = field3689;
            } else if (arg0.equals("br")) {
                this.method4488(field3701, field3689);
            }
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("js.ae(Ljava/lang/String;I)V")
    public void method4530(String arg0, int arg1) {
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
            field3693 = (arg1 - this.method4482(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("js.ak(Ljava/lang/String;II)V")
    public void method4476(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3692;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class274.method1555(arg0.charAt(var7)) & 0xFF);
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
                                        int var11 = class278.method913(var10, 10, true);
                                        class294 var13 = Statics.field3699[var11];
                                        var13.method4778(arg1, this.field3692 + var4 - var13.field3830);
                                        arg1 += var13.field3831;
                                        var6 = -1;
                                    } catch (Exception var18) {
                                    }
                                } else {
                                    this.method4474(var9);
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
                        if (this.field3707 != null && var6 != -1) {
                            arg1 += this.field3707[(var6 << 8) + var8];
                        }
                        int var15 = this.field3688[var8];
                        int var16 = this.field3698[var8];
                        if (var8 == ' ') {
                            if (field3693 > 0) {
                                field3705 += field3693;
                                arg1 += field3705 >> 8;
                                field3705 &= 0xFF;
                            }
                        } else if (field3703 == 256) {
                            if (field3700 != -1) {
                                method4479(this.field3694[var8], this.field3690[var8] + arg1 + 1, this.field3691[var8] + var4 + 1, var15, var16, field3700);
                            }
                            this.method4451(this.field3694[var8], this.field3690[var8] + arg1, this.field3691[var8] + var4, var15, var16, field3702);
                        } else {
                            if (field3700 != -1) {
                                method4511(this.field3694[var8], this.field3690[var8] + arg1 + 1, this.field3691[var8] + var4 + 1, var15, var16, field3700, field3703);
                            }
                            this.method4450(this.field3694[var8], this.field3690[var8] + arg1, this.field3691[var8] + var4, var15, var16, field3702, field3703);
                        }
                        int var17 = this.field3687[var8];
                        if (field3704 != -1) {
                            method4680(arg1, (int) ((double) this.field3692 * 0.7D) + var4, var17, field3704);
                        }
                        if (field3686 != -1) {
                            method4680(arg1, this.field3692 + var4 + 1, var17, field3686);
                        }
                        arg1 += var17;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("js.aq(Ljava/lang/String;II[I[I)V")
    public void method4477(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3692;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class274.method1555(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class278.method4575(var12.substring(4));
                                        class294 var16 = Statics.field3699[var15];
                                        var16.method4778(arg1 + var13, this.field3692 + var6 - var16.field3830 + var14);
                                        arg1 += var16.field3831;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method4474(var12);
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
                        if (this.field3707 != null && var8 != -1) {
                            arg1 += this.field3707[(var8 << 8) + var11];
                        }
                        int var18 = this.field3688[var11];
                        int var19 = this.field3698[var11];
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
                            if (field3693 > 0) {
                                field3705 += field3693;
                                arg1 += field3705 >> 8;
                                field3705 &= 0xFF;
                            }
                        } else if (field3703 == 256) {
                            if (field3700 != -1) {
                                method4479(this.field3694[var11], this.field3690[var11] + arg1 + 1 + var20, this.field3691[var11] + var6 + 1 + var21, var18, var19, field3700);
                            }
                            this.method4451(this.field3694[var11], this.field3690[var11] + arg1 + var20, this.field3691[var11] + var6 + var21, var18, var19, field3702);
                        } else {
                            if (field3700 != -1) {
                                method4511(this.field3694[var11], this.field3690[var11] + arg1 + 1 + var20, this.field3691[var11] + var6 + 1 + var21, var18, var19, field3700, field3703);
                            }
                            this.method4450(this.field3694[var11], this.field3690[var11] + arg1 + var20, this.field3691[var11] + var6 + var21, var18, var19, field3702, field3703);
                        }
                        int var22 = this.field3687[var11];
                        if (field3704 != -1) {
                            method4680(arg1, (int) ((double) this.field3692 * 0.7D) + var6, var22, field3704);
                        }
                        if (field3686 != -1) {
                            method4680(arg1, this.field3692 + var6, var22, field3686);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("js.an([BIIIII)V")
    public static void method4479(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field3807 * arg2 + arg1;
        int var7 = Statics.field3807 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field3809) {
            int var10 = field3809 - arg2;
            arg4 -= var10;
            arg2 = field3809;
            var9 += arg3 * var10;
            var6 += Statics.field3807 * var10;
        }
        if (arg2 + arg4 > field3810) {
            arg4 -= arg2 + arg4 - field3810;
        }
        if (arg1 < field3808) {
            int var11 = field3808 - arg1;
            arg3 -= var11;
            arg1 = field3808;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field3806) {
            int var12 = arg1 + arg3 - field3806;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4527(Statics.field3812, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("js.am([I[BIIIIIII)V")
    public static void method4527(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("js.ar([BIIIIII)V")
    public static void method4511(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field3807 * arg2 + arg1;
        int var8 = Statics.field3807 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3809) {
            int var11 = field3809 - arg2;
            arg4 -= var11;
            arg2 = field3809;
            var10 += arg3 * var11;
            var7 += Statics.field3807 * var11;
        }
        if (arg2 + arg4 > field3810) {
            arg4 -= arg2 + arg4 - field3810;
        }
        if (arg1 < field3808) {
            int var12 = field3808 - arg1;
            arg3 -= var12;
            arg1 = field3808;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3806) {
            int var13 = arg1 + arg3 - field3806;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4481(Statics.field3812, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("js.ao([I[BIIIIIIII)V")
    public static void method4481(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("js.b([BIIIII)V")
    public abstract void method4451(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("js.s([BIIIIII)V")
    public abstract void method4450(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
