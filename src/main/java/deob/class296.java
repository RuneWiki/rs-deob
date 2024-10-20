package deob;

import java.util.Random;

@ObfuscatedName("kl")
public abstract class class296 extends class321 {

    @ObfuscatedName("kl.s")
    public byte[][] field3683 = new byte[256][];

    @ObfuscatedName("kl.j")
    public int[] field3668;

    @ObfuscatedName("kl.i")
    public int[] field3667;

    @ObfuscatedName("kl.k")
    public int[] field3670;

    @ObfuscatedName("kl.u")
    public int[] field3671;

    @ObfuscatedName("kl.n")
    public int[] field3681;

    @ObfuscatedName("kl.t")
    public int field3688 = 0;

    @ObfuscatedName("kl.q")
    public int field3672;

    @ObfuscatedName("kl.x")
    public int field3675;

    @ObfuscatedName("kl.f")
    public byte[] field3677;

    @ObfuscatedName("kl.c")
    public static int field3678 = -1;

    @ObfuscatedName("kl.r")
    public static int field3674 = -1;

    @ObfuscatedName("kl.y")
    public static int field3673 = -1;

    @ObfuscatedName("kl.p")
    public static int field3680 = -1;

    @ObfuscatedName("kl.b")
    public static int field3682 = 0;

    @ObfuscatedName("kl.g")
    public static int field3669 = 0;

    @ObfuscatedName("kl.e")
    public static int field3684 = 256;

    @ObfuscatedName("kl.z")
    public static int field3685 = 0;

    @ObfuscatedName("kl.a")
    public static int field3686 = 0;

    @ObfuscatedName("kl.w")
    public static Random field3679 = new Random();

    @ObfuscatedName("kl.l")
    public static String[] field3687 = new String[100];

    public class296(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3671 = arg1;
        this.field3681 = arg2;
        this.field3667 = arg3;
        this.field3670 = arg4;
        this.method4906(arg0);
        this.field3683 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3681[var10] < var8 && this.field3670[var10] != 0) {
                var8 = this.field3681[var10];
            }
            if (this.field3681[var10] + this.field3670[var10] > var9) {
                var9 = this.field3681[var10] + this.field3670[var10];
            }
        }
        this.field3672 = this.field3688 - var8;
        this.field3675 = var9 - this.field3688;
    }

    public class296(byte[] arg0) {
        this.method4906(arg0);
    }

    @ObfuscatedName("kl.x([B)V")
    public void method4906(byte[] arg0) {
        this.field3668 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3668.length; var2++) {
                this.field3668[var2] = arg0[var2] & 0xFF;
            }
            this.field3688 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3668[var4] = arg0[var3++] & 0xFF;
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
        this.field3677 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3677[(var17 << 8) + var18] = (byte) method4907(var9, var13, var6, this.field3668, var5, var17, var18);
                    }
                }
            }
        }
        this.field3688 = var5[32] + var6[32];
    }

    @ObfuscatedName("kl.d([[B[[B[I[I[III)I")
    public static int method4907(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("kl.f(C)I")
    public int method4908(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3668[class288.method143(arg0) & 0xFF];
    }

    @ObfuscatedName("kl.c(Ljava/lang/String;)I")
    public int method4909(String arg0) {
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
                                    int var8 = class291.method3042(var7.substring(4));
                                    var4 += Statics.field3676[var8].field3871;
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
                    var4 += this.field3668[(char) (class288.method143(var6) & 0xFF)];
                    if (this.field3677 != null && var3 != -1) {
                        var4 += this.field3677[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("kl.r(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method4977(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method4908('<');
                        if (this.field3677 != null && var11 != -1) {
                            var4 += this.field3677[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method4908('>');
                        if (this.field3677 != null && var11 != -1) {
                            var4 += this.field3677[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class291.method3042(var16.substring(4));
                            var4 += Statics.field3676[var17].field3871;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method4908(var15);
                        if (this.field3677 != null && var11 != -1) {
                            var4 += this.field3677[(var11 << 8) + var15];
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

    @ObfuscatedName("kl.y(Ljava/lang/String;I)I")
    public int method4954(String arg0, int arg1) {
        int var3 = this.method4977(arg0, new int[] { arg1 }, field3687);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method4909(field3687[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("kl.p(Ljava/lang/String;I)I")
    public int method4946(String arg0, int arg1) {
        return this.method4977(arg0, new int[] { arg1 }, field3687);
    }

    @ObfuscatedName("kl.g(Ljava/lang/String;)Ljava/lang/String;")
    public static String method4987(String arg0) {
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

    @ObfuscatedName("kl.e(Ljava/lang/String;IIII)V")
    public void method4982(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4923(arg3, arg4);
            this.method4926(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kl.z(Ljava/lang/String;IIIII)V")
    public void method4915(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method4923(arg3, arg4);
            field3684 = arg5;
            this.method4926(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kl.w(Ljava/lang/String;IIII)V")
    public void method4916(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4923(arg3, arg4);
            this.method4926(arg0, arg1 - this.method4909(arg0), arg2);
        }
    }

    @ObfuscatedName("kl.l(Ljava/lang/String;IIII)V")
    public void method4965(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4923(arg3, arg4);
            this.method4926(arg0, arg1 - this.method4909(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("kl.h(Ljava/lang/String;IIIIIIIII)I")
    public int method4918(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method4923(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3688;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3675 + this.field3672 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method4977(arg0, var11, field3687);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3672 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3672 - this.field3675 - (var12 - 1) * arg9) / 2 + this.field3672 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3675 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3672 - this.field3675 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3672 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method4926(field3687[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method4926(field3687[var15], arg1 + (arg3 - this.method4909(field3687[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method4926(field3687[var15], arg1 + arg3 - this.method4909(field3687[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method4926(field3687[var15], arg1, var13);
            } else {
                this.method4925(field3687[var15], arg3);
                this.method4926(field3687[var15], arg1, var13);
                field3685 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("kl.v(Ljava/lang/String;IIIII)V")
    public void method4919(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4923(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method4927(arg0, arg1 - this.method4909(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("kl.m(Ljava/lang/String;IIIII)V")
    public void method4920(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4923(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method4927(arg0, arg1 - this.method4909(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("kl.o(Ljava/lang/String;IIIIII)V")
    public void method4921(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method4923(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method4927(arg0, arg1 - this.method4909(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("kl.av(Ljava/lang/String;IIIII)V")
    public void method4922(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4923(arg3, arg4);
        field3679.setSeed((long) arg5);
        field3684 = 192 + (field3679.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3679.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method4927(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("kl.am(II)V")
    public void method4923(int arg0, int arg1) {
        field3678 = -1;
        field3674 = -1;
        field3673 = arg1;
        field3680 = arg1;
        field3682 = arg0;
        field3669 = arg0;
        field3684 = 256;
        field3685 = 0;
        field3686 = 0;
    }

    @ObfuscatedName("kl.ai(Ljava/lang/String;)V")
    public void method4924(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class291.method4743(var2, 16, true);
                field3669 = var3;
            } else if (arg0.equals("/col")) {
                field3669 = field3682;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class291.method4743(var4, 16, true);
                field3678 = var5;
            } else if (arg0.equals("str")) {
                field3678 = 8388608;
            } else if (arg0.equals("/str")) {
                field3678 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class291.method4743(var6, 16, true);
                field3674 = var7;
            } else if (arg0.equals("u")) {
                field3674 = 0;
            } else if (arg0.equals("/u")) {
                field3674 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class291.method4743(var8, 16, true);
                field3680 = var9;
            } else if (arg0.equals("shad")) {
                field3680 = 0;
            } else if (arg0.equals("/shad")) {
                field3680 = field3673;
            } else if (arg0.equals("br")) {
                this.method4923(field3682, field3673);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("kl.af(Ljava/lang/String;I)V")
    public void method4925(String arg0, int arg1) {
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
            field3685 = (arg1 - this.method4909(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("kl.az(Ljava/lang/String;II)V")
    public void method4926(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3688;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class288.method143(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class291.method3042(var9.substring(4));
                                        class324 var11 = Statics.field3676[var10];
                                        var11.method5576(arg1, this.field3688 + var4 - var11.field3872);
                                        arg1 += var11.field3871;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method4924(var9);
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
                        if (this.field3677 != null && var6 != -1) {
                            arg1 += this.field3677[(var6 << 8) + var8];
                        }
                        int var13 = this.field3667[var8];
                        int var14 = this.field3670[var8];
                        if (var8 == ' ') {
                            if (field3685 > 0) {
                                field3686 += field3685;
                                arg1 += field3686 >> 8;
                                field3686 &= 0xFF;
                            }
                        } else if (field3684 == 256) {
                            if (field3680 != -1) {
                                method4928(this.field3683[var8], this.field3671[var8] + arg1 + 1, this.field3681[var8] + var4 + 1, var13, var14, field3680);
                            }
                            this.method4897(this.field3683[var8], this.field3671[var8] + arg1, this.field3681[var8] + var4, var13, var14, field3669);
                        } else {
                            if (field3680 != -1) {
                                method4930(this.field3683[var8], this.field3671[var8] + arg1 + 1, this.field3681[var8] + var4 + 1, var13, var14, field3680, field3684);
                            }
                            this.method4896(this.field3683[var8], this.field3671[var8] + arg1, this.field3681[var8] + var4, var13, var14, field3669, field3684);
                        }
                        int var15 = this.field3668[var8];
                        if (field3678 != -1) {
                            method5491(arg1, (int) ((double) this.field3688 * 0.7D) + var4, var15, field3678);
                        }
                        if (field3674 != -1) {
                            method5491(arg1, this.field3688 + var4 + 1, var15, field3674);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kl.aj(Ljava/lang/String;II[I[I)V")
    public void method4927(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3688;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class288.method143(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class291.method3042(var12.substring(4));
                                        class324 var16 = Statics.field3676[var15];
                                        var16.method5576(arg1 + var13, this.field3688 + var6 - var16.field3872 + var14);
                                        arg1 += var16.field3871;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method4924(var12);
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
                        if (this.field3677 != null && var8 != -1) {
                            arg1 += this.field3677[(var8 << 8) + var11];
                        }
                        int var18 = this.field3667[var11];
                        int var19 = this.field3670[var11];
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
                            if (field3685 > 0) {
                                field3686 += field3685;
                                arg1 += field3686 >> 8;
                                field3686 &= 0xFF;
                            }
                        } else if (field3684 == 256) {
                            if (field3680 != -1) {
                                method4928(this.field3683[var11], this.field3671[var11] + arg1 + 1 + var20, this.field3681[var11] + var6 + 1 + var21, var18, var19, field3680);
                            }
                            this.method4897(this.field3683[var11], this.field3671[var11] + arg1 + var20, this.field3681[var11] + var6 + var21, var18, var19, field3669);
                        } else {
                            if (field3680 != -1) {
                                method4930(this.field3683[var11], this.field3671[var11] + arg1 + 1 + var20, this.field3681[var11] + var6 + 1 + var21, var18, var19, field3680, field3684);
                            }
                            this.method4896(this.field3683[var11], this.field3671[var11] + arg1 + var20, this.field3681[var11] + var6 + var21, var18, var19, field3669, field3684);
                        }
                        int var22 = this.field3668[var11];
                        if (field3678 != -1) {
                            method5491(arg1, (int) ((double) this.field3688 * 0.7D) + var6, var22, field3678);
                        }
                        if (field3674 != -1) {
                            method5491(arg1, this.field3688 + var6, var22, field3674);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kl.an([BIIIII)V")
    public static void method4928(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field3849 * arg2 + arg1;
        int var7 = Statics.field3849 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field3851) {
            int var10 = field3851 - arg2;
            arg4 -= var10;
            arg2 = field3851;
            var9 += arg3 * var10;
            var6 += Statics.field3849 * var10;
        }
        if (arg2 + arg4 > field3850) {
            arg4 -= arg2 + arg4 - field3850;
        }
        if (arg1 < field3853) {
            int var11 = field3853 - arg1;
            arg3 -= var11;
            arg1 = field3853;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field3852) {
            int var12 = arg1 + arg3 - field3852;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4905(Statics.field3854, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("kl.at([I[BIIIIIII)V")
    public static void method4905(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("kl.as([BIIIIII)V")
    public static void method4930(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field3849 * arg2 + arg1;
        int var8 = Statics.field3849 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3851) {
            int var11 = field3851 - arg2;
            arg4 -= var11;
            arg2 = field3851;
            var10 += arg3 * var11;
            var7 += Statics.field3849 * var11;
        }
        if (arg2 + arg4 > field3850) {
            arg4 -= arg2 + arg4 - field3850;
        }
        if (arg1 < field3853) {
            int var12 = field3853 - arg1;
            arg3 -= var12;
            arg1 = field3853;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3852) {
            int var13 = arg1 + arg3 - field3852;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4931(Statics.field3854, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("kl.ak([I[BIIIIIIII)V")
    public static void method4931(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("kl.s([BIIIII)V")
    public abstract void method4897(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("kl.j([BIIIIII)V")
    public abstract void method4896(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
