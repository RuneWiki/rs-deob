package deob;

import java.util.Random;

@ObfuscatedName("jn")
public abstract class class265 extends class282 {

    @ObfuscatedName("jn.i")
    public byte[][] field3639 = new byte[256][];

    @ObfuscatedName("jn.c")
    public int[] field3634;

    @ObfuscatedName("jn.e")
    public int[] field3635;

    @ObfuscatedName("jn.v")
    public int[] field3633;

    @ObfuscatedName("jn.b")
    public int[] field3648;

    @ObfuscatedName("jn.y")
    public int[] field3638;

    @ObfuscatedName("jn.h")
    public int field3653 = 0;

    @ObfuscatedName("jn.x")
    public int field3640;

    @ObfuscatedName("jn.f")
    public int field3641;

    @ObfuscatedName("jn.a")
    public byte[] field3643;

    @ObfuscatedName("jn.o")
    public static int field3644 = -1;

    @ObfuscatedName("jn.z")
    public static int field3645 = -1;

    @ObfuscatedName("jn.q")
    public static int field3637 = -1;

    @ObfuscatedName("jn.j")
    public static int field3647 = -1;

    @ObfuscatedName("jn.k")
    public static int field3642 = 0;

    @ObfuscatedName("jn.r")
    public static int field3636 = 0;

    @ObfuscatedName("jn.m")
    public static int field3646 = 256;

    @ObfuscatedName("jn.d")
    public static int field3651 = 0;

    @ObfuscatedName("jn.s")
    public static int field3652 = 0;

    @ObfuscatedName("jn.g")
    public static Random field3649 = new Random();

    @ObfuscatedName("jn.w")
    public static String[] field3654 = new String[100];

    public class265(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3648 = arg1;
        this.field3638 = arg2;
        this.field3635 = arg3;
        this.field3633 = arg4;
        this.method4372(arg0);
        this.field3639 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3638[var10] < var8 && this.field3633[var10] != 0) {
                var8 = this.field3638[var10];
            }
            if (this.field3638[var10] + this.field3633[var10] > var9) {
                var9 = this.field3638[var10] + this.field3633[var10];
            }
        }
        this.field3640 = this.field3653 - var8;
        this.field3641 = var9 - this.field3653;
    }

    public class265(byte[] arg0) {
        this.method4372(arg0);
    }

    @ObfuscatedName("jn.n([B)V")
    public void method4372(byte[] arg0) {
        this.field3634 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3634.length; var2++) {
                this.field3634[var2] = arg0[var2] & 0xFF;
            }
            this.field3653 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3634[var4] = arg0[var3++] & 0xFF;
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
        this.field3643 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3643[(var17 << 8) + var18] = (byte) method4373(var9, var13, var6, this.field3634, var5, var17, var18);
                    }
                }
            }
        }
        this.field3653 = var5[32] + var6[32];
    }

    @ObfuscatedName("jn.a([[B[[B[I[I[III)I")
    public static int method4373(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("jn.o(C)I")
    public int method4400(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3634[class267.method124(arg0) & 0xFF];
    }

    @ObfuscatedName("jn.z(Ljava/lang/String;)I")
    public int method4374(String arg0) {
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
                                    int var8 = class271.method3551(var7.substring(4));
                                    var4 += Statics.field3650[var8].field3777;
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
                    var4 += this.field3634[(char) (class267.method124(var6) & 0xFF)];
                    if (this.field3643 != null && var3 != -1) {
                        var4 += this.field3643[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("jn.q(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method4375(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method4400('<');
                        if (this.field3643 != null && var11 != -1) {
                            var4 += this.field3643[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method4400('>');
                        if (this.field3643 != null && var11 != -1) {
                            var4 += this.field3643[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class271.method3551(var16.substring(4));
                            var4 += Statics.field3650[var17].field3777;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method4400(var15);
                        if (this.field3643 != null && var11 != -1) {
                            var4 += this.field3643[(var11 << 8) + var15];
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

    @ObfuscatedName("jn.j(Ljava/lang/String;I)I")
    public int method4376(String arg0, int arg1) {
        int var3 = this.method4375(arg0, new int[] { arg1 }, field3654);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method4374(field3654[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("jn.l(Ljava/lang/String;I)I")
    public int method4404(String arg0, int arg1) {
        return this.method4375(arg0, new int[] { arg1 }, field3654);
    }

    @ObfuscatedName("jn.u(Ljava/lang/String;)Ljava/lang/String;")
    public static String method4415(String arg0) {
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

    @ObfuscatedName("jn.t(Ljava/lang/String;IIII)V")
    public void method4383(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4409(arg3, arg4);
            this.method4453(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("jn.ad(Ljava/lang/String;IIIII)V")
    public void method4427(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method4409(arg3, arg4);
            field3646 = arg5;
            this.method4453(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("jn.ar(Ljava/lang/String;IIII)V")
    public void method4398(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4409(arg3, arg4);
            this.method4453(arg0, arg1 - this.method4374(arg0), arg2);
        }
    }

    @ObfuscatedName("jn.an(Ljava/lang/String;IIII)V")
    public void method4382(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4409(arg3, arg4);
            this.method4453(arg0, arg1 - this.method4374(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("jn.af(Ljava/lang/String;IIIIIIIII)I")
    public int method4390(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method4409(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3653;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3641 + this.field3640 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method4375(arg0, var11, field3654);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3640 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3640 - this.field3641 - (var12 - 1) * arg9) / 2 + this.field3640 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3641 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3640 - this.field3641 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3640 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method4453(field3654[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method4453(field3654[var15], arg1 + (arg3 - this.method4374(field3654[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method4453(field3654[var15], arg1 + arg3 - this.method4374(field3654[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method4453(field3654[var15], arg1, var13);
            } else {
                this.method4442(field3654[var15], arg3);
                this.method4453(field3654[var15], arg1, var13);
                field3651 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("jn.at(Ljava/lang/String;IIIII)V")
    public void method4384(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4409(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method4433(arg0, arg1 - this.method4374(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("jn.ah(Ljava/lang/String;IIIII)V")
    public void method4385(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4409(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method4433(arg0, arg1 - this.method4374(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("jn.ai(Ljava/lang/String;IIIIII)V")
    public void method4386(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method4409(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method4433(arg0, arg1 - this.method4374(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("jn.aw(Ljava/lang/String;IIIII)V")
    public void method4396(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4409(arg3, arg4);
        field3649.setSeed((long) arg5);
        field3646 = 192 + (field3649.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3649.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method4433(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("jn.al(II)V")
    public void method4409(int arg0, int arg1) {
        field3644 = -1;
        field3645 = -1;
        field3637 = arg1;
        field3647 = arg1;
        field3642 = arg0;
        field3636 = arg0;
        field3646 = 256;
        field3651 = 0;
        field3652 = 0;
    }

    @ObfuscatedName("jn.ab(Ljava/lang/String;)V")
    public void method4397(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field3636 = class271.method963(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field3636 = field3642;
            } else if (arg0.startsWith("str=")) {
                field3644 = class271.method963(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field3644 = 8388608;
            } else if (arg0.equals("/str")) {
                field3644 = -1;
            } else if (arg0.startsWith("u=")) {
                field3645 = class271.method963(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field3645 = 0;
            } else if (arg0.equals("/u")) {
                field3645 = -1;
            } else if (arg0.startsWith("shad=")) {
                field3647 = class271.method963(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field3647 = 0;
            } else if (arg0.equals("/shad")) {
                field3647 = field3637;
            } else if (arg0.equals("br")) {
                this.method4409(field3642, field3637);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("jn.aa(Ljava/lang/String;I)V")
    public void method4442(String arg0, int arg1) {
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
            field3651 = (arg1 - this.method4374(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("jn.ap(Ljava/lang/String;II)V")
    public void method4453(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3653;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class267.method124(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class271.method3551(var9.substring(4));
                                        class285 var11 = Statics.field3650[var10];
                                        var11.method4646(arg1, this.field3653 + var4 - var11.field3773);
                                        arg1 += var11.field3777;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method4397(var9);
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
                        if (this.field3643 != null && var6 != -1) {
                            arg1 += this.field3643[(var6 << 8) + var8];
                        }
                        int var13 = this.field3635[var8];
                        int var14 = this.field3633[var8];
                        if (var8 == ' ') {
                            if (field3651 > 0) {
                                field3652 += field3651;
                                arg1 += field3652 >> 8;
                                field3652 &= 0xFF;
                            }
                        } else if (field3646 == 256) {
                            if (field3647 != -1) {
                                method4389(this.field3639[var8], this.field3648[var8] + arg1 + 1, this.field3638[var8] + var4 + 1, var13, var14, field3647);
                            }
                            this.method4363(this.field3639[var8], this.field3648[var8] + arg1, this.field3638[var8] + var4, var13, var14, field3636);
                        } else {
                            if (field3647 != -1) {
                                method4394(this.field3639[var8], this.field3648[var8] + arg1 + 1, this.field3638[var8] + var4 + 1, var13, var14, field3647, field3646);
                            }
                            this.method4364(this.field3639[var8], this.field3648[var8] + arg1, this.field3638[var8] + var4, var13, var14, field3636, field3646);
                        }
                        int var15 = this.field3634[var8];
                        if (field3644 != -1) {
                            method4620(arg1, (int) ((double) this.field3653 * 0.7D) + var4, var15, field3644);
                        }
                        if (field3645 != -1) {
                            method4620(arg1, this.field3653 + var4 + 1, var15, field3645);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("jn.ae(Ljava/lang/String;II[I[I)V")
    public void method4433(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3653;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class267.method124(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class271.method3551(var12.substring(4));
                                        class285 var16 = Statics.field3650[var15];
                                        var16.method4646(arg1 + var13, this.field3653 + var6 - var16.field3773 + var14);
                                        arg1 += var16.field3777;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method4397(var12);
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
                        if (this.field3643 != null && var8 != -1) {
                            arg1 += this.field3643[(var8 << 8) + var11];
                        }
                        int var18 = this.field3635[var11];
                        int var19 = this.field3633[var11];
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
                            if (field3651 > 0) {
                                field3652 += field3651;
                                arg1 += field3652 >> 8;
                                field3652 &= 0xFF;
                            }
                        } else if (field3646 == 256) {
                            if (field3647 != -1) {
                                method4389(this.field3639[var11], this.field3648[var11] + arg1 + 1 + var20, this.field3638[var11] + var6 + 1 + var21, var18, var19, field3647);
                            }
                            this.method4363(this.field3639[var11], this.field3648[var11] + arg1 + var20, this.field3638[var11] + var6 + var21, var18, var19, field3636);
                        } else {
                            if (field3647 != -1) {
                                method4394(this.field3639[var11], this.field3648[var11] + arg1 + 1 + var20, this.field3638[var11] + var6 + 1 + var21, var18, var19, field3647, field3646);
                            }
                            this.method4364(this.field3639[var11], this.field3648[var11] + arg1 + var20, this.field3638[var11] + var6 + var21, var18, var19, field3636, field3646);
                        }
                        int var22 = this.field3634[var11];
                        if (field3644 != -1) {
                            method4620(arg1, (int) ((double) this.field3653 * 0.7D) + var6, var22, field3644);
                        }
                        if (field3645 != -1) {
                            method4620(arg1, this.field3653 + var6, var22, field3645);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("jn.as([BIIIII)V")
    public static void method4389(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field3754 * arg2 + arg1;
        int var7 = Statics.field3754 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field3753) {
            int var10 = field3753 - arg2;
            arg4 -= var10;
            arg2 = field3753;
            var9 += arg3 * var10;
            var6 += Statics.field3754 * var10;
        }
        if (arg2 + arg4 > field3757) {
            arg4 -= arg2 + arg4 - field3757;
        }
        if (arg1 < field3758) {
            int var11 = field3758 - arg1;
            arg3 -= var11;
            arg1 = field3758;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field3755) {
            int var12 = arg1 + arg3 - field3755;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4393(Statics.field3756, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("jn.av([I[BIIIIIII)V")
    public static void method4393(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("jn.ag([BIIIIII)V")
    public static void method4394(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field3754 * arg2 + arg1;
        int var8 = Statics.field3754 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3753) {
            int var11 = field3753 - arg2;
            arg4 -= var11;
            arg2 = field3753;
            var10 += arg3 * var11;
            var7 += Statics.field3754 * var11;
        }
        if (arg2 + arg4 > field3757) {
            arg4 -= arg2 + arg4 - field3757;
        }
        if (arg1 < field3758) {
            int var12 = field3758 - arg1;
            arg3 -= var12;
            arg1 = field3758;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3755) {
            int var13 = arg1 + arg3 - field3755;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4395(Statics.field3756, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("jn.az([I[BIIIIIIII)V")
    public static void method4395(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("jn.i([BIIIII)V")
    public abstract void method4363(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("jn.c([BIIIIII)V")
    public abstract void method4364(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
