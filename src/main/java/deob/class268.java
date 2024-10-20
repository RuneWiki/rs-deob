package deob;

import java.util.Random;

@ObfuscatedName("jo")
public abstract class class268 extends class285 {

    @ObfuscatedName("jo.s")
    public byte[][] field3664 = new byte[256][];

    @ObfuscatedName("jo.c")
    public int[] field3662;

    @ObfuscatedName("jo.f")
    public int[] field3655;

    @ObfuscatedName("jo.m")
    public int[] field3656;

    @ObfuscatedName("jo.h")
    public int[] field3657;

    @ObfuscatedName("jo.t")
    public int[] field3658;

    @ObfuscatedName("jo.p")
    public int field3659 = 0;

    @ObfuscatedName("jo.d")
    public int field3653;

    @ObfuscatedName("jo.n")
    public int field3661;

    @ObfuscatedName("jo.o")
    public byte[] field3654;

    @ObfuscatedName("jo.q")
    public static int field3673 = -1;

    @ObfuscatedName("jo.u")
    public static int field3665 = -1;

    @ObfuscatedName("jo.k")
    public static int field3666 = -1;

    @ObfuscatedName("jo.e")
    public static int field3670 = -1;

    @ObfuscatedName("jo.r")
    public static int field3663 = 0;

    @ObfuscatedName("jo.l")
    public static int field3669 = 0;

    @ObfuscatedName("jo.y")
    public static int field3671 = 256;

    @ObfuscatedName("jo.w")
    public static int field3668 = 0;

    @ObfuscatedName("jo.i")
    public static int field3672 = 0;

    @ObfuscatedName("jo.g")
    public static Random field3667 = new Random();

    @ObfuscatedName("jo.a")
    public static String[] field3674 = new String[100];

    public class268(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3657 = arg1;
        this.field3658 = arg2;
        this.field3655 = arg3;
        this.field3656 = arg4;
        this.method4479(arg0);
        this.field3664 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3658[var10] < var8 && this.field3656[var10] != 0) {
                var8 = this.field3658[var10];
            }
            if (this.field3658[var10] + this.field3656[var10] > var9) {
                var9 = this.field3658[var10] + this.field3656[var10];
            }
        }
        this.field3653 = this.field3659 - var8;
        this.field3661 = var9 - this.field3659;
    }

    public class268(byte[] arg0) {
        this.method4479(arg0);
    }

    @ObfuscatedName("jo.t([B)V")
    public void method4479(byte[] arg0) {
        this.field3662 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3662.length; var2++) {
                this.field3662[var2] = arg0[var2] & 0xFF;
            }
            this.field3659 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3662[var4] = arg0[var3++] & 0xFF;
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
        this.field3654 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3654[(var17 << 8) + var18] = (byte) method4480(var9, var13, var6, this.field3662, var5, var17, var18);
                    }
                }
            }
        }
        this.field3659 = var5[32] + var6[32];
    }

    @ObfuscatedName("jo.p([[B[[B[I[I[III)I")
    public static int method4480(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("jo.d(C)I")
    public int method4481(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3662[class270.method248(arg0) & 0xFF];
    }

    @ObfuscatedName("jo.n(Ljava/lang/String;)I")
    public int method4487(String arg0) {
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
                                    int var9 = class274.method3810(var8, 10, true);
                                    var4 += Statics.field3660[var9].field3789;
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
                    var4 += this.field3662[(char) (class270.method248(var6) & 0xFF)];
                    if (this.field3654 != null && var3 != -1) {
                        var4 += this.field3654[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("jo.z(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method4545(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method4481('<');
                        if (this.field3654 != null && var11 != -1) {
                            var4 += this.field3654[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method4481('>');
                        if (this.field3654 != null && var11 != -1) {
                            var4 += this.field3654[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class274.method3810(var17, 10, true);
                            var4 += Statics.field3660[var18].field3789;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method4481(var15);
                        if (this.field3654 != null && var11 != -1) {
                            var4 += this.field3654[(var11 << 8) + var15];
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

    @ObfuscatedName("jo.o(Ljava/lang/String;I)I")
    public int method4484(String arg0, int arg1) {
        int var3 = this.method4545(arg0, new int[] { arg1 }, field3674);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method4487(field3674[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("jo.u(Ljava/lang/String;I)I")
    public int method4485(String arg0, int arg1) {
        return this.method4545(arg0, new int[] { arg1 }, field3674);
    }

    @ObfuscatedName("jo.r(Ljava/lang/String;)Ljava/lang/String;")
    public static String method4486(String arg0) {
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

    @ObfuscatedName("jo.l(Ljava/lang/String;IIII)V")
    public void method4503(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4529(arg3, arg4);
            this.method4498(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("jo.y(Ljava/lang/String;IIIII)V")
    public void method4533(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method4529(arg3, arg4);
            field3671 = arg5;
            this.method4498(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("jo.w(Ljava/lang/String;IIII)V")
    public void method4489(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4529(arg3, arg4);
            this.method4498(arg0, arg1 - this.method4487(arg0), arg2);
        }
    }

    @ObfuscatedName("jo.i(Ljava/lang/String;IIII)V")
    public void method4490(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4529(arg3, arg4);
            this.method4498(arg0, arg1 - this.method4487(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("jo.g(Ljava/lang/String;IIIIIIIII)I")
    public int method4491(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method4529(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3659;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3661 + this.field3653 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method4545(arg0, var11, field3674);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3653 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3653 - this.field3661 - (var12 - 1) * arg9) / 2 + this.field3653 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3661 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3653 - this.field3661 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3653 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method4498(field3674[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method4498(field3674[var15], arg1 + (arg3 - this.method4487(field3674[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method4498(field3674[var15], arg1 + arg3 - this.method4487(field3674[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method4498(field3674[var15], arg1, var13);
            } else {
                this.method4497(field3674[var15], arg3);
                this.method4498(field3674[var15], arg1, var13);
                field3668 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("jo.a(Ljava/lang/String;IIIII)V")
    public void method4492(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4529(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method4499(arg0, arg1 - this.method4487(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("jo.x(Ljava/lang/String;IIIII)V")
    public void method4510(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4529(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method4499(arg0, arg1 - this.method4487(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("jo.j(Ljava/lang/String;IIIIII)V")
    public void method4550(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method4529(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method4499(arg0, arg1 - this.method4487(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("jo.v(Ljava/lang/String;IIIII)V")
    public void method4508(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4529(arg3, arg4);
        field3667.setSeed((long) arg5);
        field3671 = 192 + (field3667.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3667.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method4499(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("jo.ap(II)V")
    public void method4529(int arg0, int arg1) {
        field3673 = -1;
        field3665 = -1;
        field3666 = arg1;
        field3670 = arg1;
        field3663 = arg0;
        field3669 = arg0;
        field3671 = 256;
        field3668 = 0;
        field3672 = 0;
    }

    @ObfuscatedName("jo.ar(Ljava/lang/String;)V")
    public void method4496(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class274.method3810(var2, 16, true);
                field3669 = var3;
            } else if (arg0.equals("/col")) {
                field3669 = field3663;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class274.method3810(var4, 16, true);
                field3673 = var5;
            } else if (arg0.equals("str")) {
                field3673 = 8388608;
            } else if (arg0.equals("/str")) {
                field3673 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class274.method3810(var6, 16, true);
                field3665 = var7;
            } else if (arg0.equals("u")) {
                field3665 = 0;
            } else if (arg0.equals("/u")) {
                field3665 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class274.method3810(var8, 16, true);
                field3670 = var9;
            } else if (arg0.equals("shad")) {
                field3670 = 0;
            } else if (arg0.equals("/shad")) {
                field3670 = field3666;
            } else if (arg0.equals("br")) {
                this.method4529(field3663, field3666);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("jo.am(Ljava/lang/String;I)V")
    public void method4497(String arg0, int arg1) {
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
            field3668 = (arg1 - this.method4487(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("jo.ab(Ljava/lang/String;II)V")
    public void method4498(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3659;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class270.method248(arg0.charAt(var7)) & 0xFF);
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
                                        int var11 = class274.method3810(var10, 10, true);
                                        class288 var13 = Statics.field3660[var11];
                                        var13.method4744(arg1, this.field3659 + var4 - var13.field3788);
                                        arg1 += var13.field3789;
                                        var6 = -1;
                                    } catch (Exception var18) {
                                    }
                                } else {
                                    this.method4496(var9);
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
                        if (this.field3654 != null && var6 != -1) {
                            arg1 += this.field3654[(var6 << 8) + var8];
                        }
                        int var15 = this.field3655[var8];
                        int var16 = this.field3656[var8];
                        if (var8 == ' ') {
                            if (field3668 > 0) {
                                field3672 += field3668;
                                arg1 += field3672 >> 8;
                                field3672 &= 0xFF;
                            }
                        } else if (field3671 == 256) {
                            if (field3670 != -1) {
                                method4501(this.field3664[var8], this.field3657[var8] + arg1 + 1, this.field3658[var8] + var4 + 1, var15, var16, field3670);
                            }
                            this.method4473(this.field3664[var8], this.field3657[var8] + arg1, this.field3658[var8] + var4, var15, var16, field3669);
                        } else {
                            if (field3670 != -1) {
                                method4514(this.field3664[var8], this.field3657[var8] + arg1 + 1, this.field3658[var8] + var4 + 1, var15, var16, field3670, field3671);
                            }
                            this.method4474(this.field3664[var8], this.field3657[var8] + arg1, this.field3658[var8] + var4, var15, var16, field3669, field3671);
                        }
                        int var17 = this.field3662[var8];
                        if (field3673 != -1) {
                            method4672(arg1, (int) ((double) this.field3659 * 0.7D) + var4, var17, field3673);
                        }
                        if (field3665 != -1) {
                            method4672(arg1, this.field3659 + var4 + 1, var17, field3665);
                        }
                        arg1 += var17;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("jo.af(Ljava/lang/String;II[I[I)V")
    public void method4499(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3659;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class270.method248(arg0.charAt(var10)) & 0xFF);
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
                                        int var16 = class274.method3810(var15, 10, true);
                                        class288 var18 = Statics.field3660[var16];
                                        var18.method4744(arg1 + var13, this.field3659 + var6 - var18.field3788 + var14);
                                        arg1 += var18.field3789;
                                        var8 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method4496(var12);
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
                        if (this.field3654 != null && var8 != -1) {
                            arg1 += this.field3654[(var8 << 8) + var11];
                        }
                        int var20 = this.field3655[var11];
                        int var21 = this.field3656[var11];
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
                            if (field3668 > 0) {
                                field3672 += field3668;
                                arg1 += field3672 >> 8;
                                field3672 &= 0xFF;
                            }
                        } else if (field3671 == 256) {
                            if (field3670 != -1) {
                                method4501(this.field3664[var11], this.field3657[var11] + arg1 + 1 + var22, this.field3658[var11] + var6 + 1 + var23, var20, var21, field3670);
                            }
                            this.method4473(this.field3664[var11], this.field3657[var11] + arg1 + var22, this.field3658[var11] + var6 + var23, var20, var21, field3669);
                        } else {
                            if (field3670 != -1) {
                                method4514(this.field3664[var11], this.field3657[var11] + arg1 + 1 + var22, this.field3658[var11] + var6 + 1 + var23, var20, var21, field3670, field3671);
                            }
                            this.method4474(this.field3664[var11], this.field3657[var11] + arg1 + var22, this.field3658[var11] + var6 + var23, var20, var21, field3669, field3671);
                        }
                        int var24 = this.field3662[var11];
                        if (field3673 != -1) {
                            method4672(arg1, (int) ((double) this.field3659 * 0.7D) + var6, var24, field3673);
                        }
                        if (field3665 != -1) {
                            method4672(arg1, this.field3659 + var6, var24, field3665);
                        }
                        arg1 += var24;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("jo.aa([BIIIII)V")
    public static void method4501(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field3767 * arg2 + arg1;
        int var7 = Statics.field3767 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field3765) {
            int var10 = field3765 - arg2;
            arg4 -= var10;
            arg2 = field3765;
            var9 += arg3 * var10;
            var6 += Statics.field3767 * var10;
        }
        if (arg2 + arg4 > field3769) {
            arg4 -= arg2 + arg4 - field3769;
        }
        if (arg1 < field3770) {
            int var11 = field3770 - arg1;
            arg3 -= var11;
            arg1 = field3770;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field3768) {
            int var12 = arg1 + arg3 - field3768;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4478(Statics.field3766, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("jo.aq([I[BIIIIIII)V")
    public static void method4478(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("jo.aj([BIIIIII)V")
    public static void method4514(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field3767 * arg2 + arg1;
        int var8 = Statics.field3767 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3765) {
            int var11 = field3765 - arg2;
            arg4 -= var11;
            arg2 = field3765;
            var10 += arg3 * var11;
            var7 += Statics.field3767 * var11;
        }
        if (arg2 + arg4 > field3769) {
            arg4 -= arg2 + arg4 - field3769;
        }
        if (arg1 < field3770) {
            int var12 = field3770 - arg1;
            arg3 -= var12;
            arg1 = field3770;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3768) {
            int var13 = arg1 + arg3 - field3768;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4504(Statics.field3766, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("jo.as([I[BIIIIIIII)V")
    public static void method4504(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("jo.c([BIIIIII)V")
    public abstract void method4474(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("jo.s([BIIIII)V")
    public abstract void method4473(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
