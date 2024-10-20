package deob;

import java.util.Random;

@ObfuscatedName("jr")
public abstract class class265 extends class282 {

    @ObfuscatedName("jr.e")
    public byte[][] field3630 = new byte[256][];

    @ObfuscatedName("jr.o")
    public int[] field3622;

    @ObfuscatedName("jr.m")
    public int[] field3623;

    @ObfuscatedName("jr.g")
    public int[] field3624;

    @ObfuscatedName("jr.d")
    public int[] field3634;

    @ObfuscatedName("jr.b")
    public int[] field3626;

    @ObfuscatedName("jr.k")
    public int field3627 = 0;

    @ObfuscatedName("jr.f")
    public int field3625;

    @ObfuscatedName("jr.j")
    public int field3632;

    @ObfuscatedName("jr.h")
    public byte[] field3631;

    @ObfuscatedName("jr.i")
    public static int field3621 = -1;

    @ObfuscatedName("jr.s")
    public static int field3633 = -1;

    @ObfuscatedName("jr.n")
    public static int field3629 = -1;

    @ObfuscatedName("jr.c")
    public static int field3635 = -1;

    @ObfuscatedName("jr.v")
    public static int field3636 = 0;

    @ObfuscatedName("jr.u")
    public static int field3637 = 0;

    @ObfuscatedName("jr.w")
    public static int field3640 = 256;

    @ObfuscatedName("jr.z")
    public static int field3639 = 0;

    @ObfuscatedName("jr.y")
    public static int field3628 = 0;

    @ObfuscatedName("jr.p")
    public static Random field3641 = new Random();

    @ObfuscatedName("jr.l")
    public static String[] field3642 = new String[100];

    public class265(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3634 = arg1;
        this.field3626 = arg2;
        this.field3623 = arg3;
        this.field3624 = arg4;
        this.method4393(arg0);
        this.field3630 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3626[var10] < var8 && this.field3624[var10] != 0) {
                var8 = this.field3626[var10];
            }
            if (this.field3626[var10] + this.field3624[var10] > var9) {
                var9 = this.field3626[var10] + this.field3624[var10];
            }
        }
        this.field3625 = this.field3627 - var8;
        this.field3632 = var9 - this.field3627;
    }

    public class265(byte[] arg0) {
        this.method4393(arg0);
    }

    @ObfuscatedName("jr.h([B)V")
    public void method4393(byte[] arg0) {
        this.field3622 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3622.length; var2++) {
                this.field3622[var2] = arg0[var2] & 0xFF;
            }
            this.field3627 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3622[var4] = arg0[var3++] & 0xFF;
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
        this.field3631 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3631[(var17 << 8) + var18] = (byte) method4394(var9, var13, var6, this.field3622, var5, var17, var18);
                    }
                }
            }
        }
        this.field3627 = var5[32] + var6[32];
    }

    @ObfuscatedName("jr.i([[B[[B[I[I[III)I")
    public static int method4394(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("jr.s(C)I")
    public int method4395(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3622[class267.method928(arg0) & 0xFF];
    }

    @ObfuscatedName("jr.n(Ljava/lang/String;)I")
    public int method4446(String arg0) {
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
                                    int var8 = class271.method311(var7.substring(4));
                                    var4 += Statics.field3638[var8].field3772;
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
                    var4 += this.field3622[(char) (class267.method928(var6) & 0xFF)];
                    if (this.field3631 != null && var3 != -1) {
                        var4 += this.field3631[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("jr.c(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method4419(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method4395('<');
                        if (this.field3631 != null && var11 != -1) {
                            var4 += this.field3631[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method4395('>');
                        if (this.field3631 != null && var11 != -1) {
                            var4 += this.field3631[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class271.method311(var16.substring(4));
                            var4 += Statics.field3638[var17].field3772;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method4395(var15);
                        if (this.field3631 != null && var11 != -1) {
                            var4 += this.field3631[(var11 << 8) + var15];
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

    @ObfuscatedName("jr.v(Ljava/lang/String;I)I")
    public int method4398(String arg0, int arg1) {
        int var3 = this.method4419(arg0, new int[] { arg1 }, field3642);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method4446(field3642[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("jr.u(Ljava/lang/String;I)I")
    public int method4399(String arg0, int arg1) {
        return this.method4419(arg0, new int[] { arg1 }, field3642);
    }

    @ObfuscatedName("jr.w(Ljava/lang/String;)Ljava/lang/String;")
    public static String method4400(String arg0) {
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

    @ObfuscatedName("jr.p(Ljava/lang/String;IIII)V")
    public void method4401(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4441(arg3, arg4);
            this.method4443(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("jr.l(Ljava/lang/String;IIIII)V")
    public void method4402(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method4441(arg3, arg4);
            field3640 = arg5;
            this.method4443(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("jr.x(Ljava/lang/String;IIII)V")
    public void method4440(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4441(arg3, arg4);
            this.method4443(arg0, arg1 - this.method4446(arg0), arg2);
        }
    }

    @ObfuscatedName("jr.r(Ljava/lang/String;IIII)V")
    public void method4432(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4441(arg3, arg4);
            this.method4443(arg0, arg1 - this.method4446(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("jr.t(Ljava/lang/String;IIIIIIIII)I")
    public int method4435(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method4441(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3627;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3632 + this.field3625 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method4419(arg0, var11, field3642);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3625 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3625 - this.field3632 - (var12 - 1) * arg9) / 2 + this.field3625 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3632 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3625 - this.field3632 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3625 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method4443(field3642[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method4443(field3642[var15], arg1 + (arg3 - this.method4446(field3642[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method4443(field3642[var15], arg1 + arg3 - this.method4446(field3642[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method4443(field3642[var15], arg1, var13);
            } else {
                this.method4410(field3642[var15], arg3);
                this.method4443(field3642[var15], arg1, var13);
                field3639 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("jr.a(Ljava/lang/String;IIIII)V")
    public void method4418(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4441(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method4476(arg0, arg1 - this.method4446(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("jr.ad(Ljava/lang/String;IIIII)V")
    public void method4406(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4441(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method4476(arg0, arg1 - this.method4446(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("jr.ay(Ljava/lang/String;IIIIII)V")
    public void method4422(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method4441(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method4476(arg0, arg1 - this.method4446(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("jr.am(Ljava/lang/String;IIIII)V")
    public void method4415(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4441(arg3, arg4);
        field3641.setSeed((long) arg5);
        field3640 = 192 + (field3641.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3641.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method4476(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("jr.ae(II)V")
    public void method4441(int arg0, int arg1) {
        field3621 = -1;
        field3633 = -1;
        field3629 = arg1;
        field3635 = arg1;
        field3636 = arg0;
        field3637 = arg0;
        field3640 = 256;
        field3639 = 0;
        field3628 = 0;
    }

    @ObfuscatedName("jr.az(Ljava/lang/String;)V")
    public void method4409(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class271.method132(var2, 16, true);
                field3637 = var3;
            } else if (arg0.equals("/col")) {
                field3637 = field3636;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class271.method132(var4, 16, true);
                field3621 = var5;
            } else if (arg0.equals("str")) {
                field3621 = 8388608;
            } else if (arg0.equals("/str")) {
                field3621 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class271.method132(var6, 16, true);
                field3633 = var7;
            } else if (arg0.equals("u")) {
                field3633 = 0;
            } else if (arg0.equals("/u")) {
                field3633 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class271.method132(var8, 16, true);
                field3635 = var9;
            } else if (arg0.equals("shad")) {
                field3635 = 0;
            } else if (arg0.equals("/shad")) {
                field3635 = field3629;
            } else if (arg0.equals("br")) {
                this.method4441(field3636, field3629);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("jr.ar(Ljava/lang/String;I)V")
    public void method4410(String arg0, int arg1) {
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
            field3639 = (arg1 - this.method4446(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("jr.ai(Ljava/lang/String;II)V")
    public void method4443(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3627;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class267.method928(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class271.method311(var9.substring(4));
                                        class285 var11 = Statics.field3638[var10];
                                        var11.method4666(arg1, this.field3627 + var4 - var11.field3773);
                                        arg1 += var11.field3772;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method4409(var9);
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
                        if (this.field3631 != null && var6 != -1) {
                            arg1 += this.field3631[(var6 << 8) + var8];
                        }
                        int var13 = this.field3623[var8];
                        int var14 = this.field3624[var8];
                        if (var8 == ' ') {
                            if (field3639 > 0) {
                                field3628 += field3639;
                                arg1 += field3628 >> 8;
                                field3628 &= 0xFF;
                            }
                        } else if (field3640 == 256) {
                            if (field3635 != -1) {
                                method4481(this.field3630[var8], this.field3634[var8] + arg1 + 1, this.field3626[var8] + var4 + 1, var13, var14, field3635);
                            }
                            this.method4386(this.field3630[var8], this.field3634[var8] + arg1, this.field3626[var8] + var4, var13, var14, field3637);
                        } else {
                            if (field3635 != -1) {
                                method4416(this.field3630[var8], this.field3634[var8] + arg1 + 1, this.field3626[var8] + var4 + 1, var13, var14, field3635, field3640);
                            }
                            this.method4384(this.field3630[var8], this.field3634[var8] + arg1, this.field3626[var8] + var4, var13, var14, field3637, field3640);
                        }
                        int var15 = this.field3622[var8];
                        if (field3621 != -1) {
                            method4609(arg1, (int) ((double) this.field3627 * 0.7D) + var4, var15, field3621);
                        }
                        if (field3633 != -1) {
                            method4609(arg1, this.field3627 + var4 + 1, var15, field3633);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("jr.ap(Ljava/lang/String;II[I[I)V")
    public void method4476(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3627;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class267.method928(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class271.method311(var12.substring(4));
                                        class285 var16 = Statics.field3638[var15];
                                        var16.method4666(arg1 + var13, this.field3627 + var6 - var16.field3773 + var14);
                                        arg1 += var16.field3772;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method4409(var12);
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
                        if (this.field3631 != null && var8 != -1) {
                            arg1 += this.field3631[(var8 << 8) + var11];
                        }
                        int var18 = this.field3623[var11];
                        int var19 = this.field3624[var11];
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
                            if (field3639 > 0) {
                                field3628 += field3639;
                                arg1 += field3628 >> 8;
                                field3628 &= 0xFF;
                            }
                        } else if (field3640 == 256) {
                            if (field3635 != -1) {
                                method4481(this.field3630[var11], this.field3634[var11] + arg1 + 1 + var20, this.field3626[var11] + var6 + 1 + var21, var18, var19, field3635);
                            }
                            this.method4386(this.field3630[var11], this.field3634[var11] + arg1 + var20, this.field3626[var11] + var6 + var21, var18, var19, field3637);
                        } else {
                            if (field3635 != -1) {
                                method4416(this.field3630[var11], this.field3634[var11] + arg1 + 1 + var20, this.field3626[var11] + var6 + 1 + var21, var18, var19, field3635, field3640);
                            }
                            this.method4384(this.field3630[var11], this.field3634[var11] + arg1 + var20, this.field3626[var11] + var6 + var21, var18, var19, field3637, field3640);
                        }
                        int var22 = this.field3622[var11];
                        if (field3621 != -1) {
                            method4609(arg1, (int) ((double) this.field3627 * 0.7D) + var6, var22, field3621);
                        }
                        if (field3633 != -1) {
                            method4609(arg1, this.field3627 + var6, var22, field3633);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("jr.al([BIIIII)V")
    public static void method4481(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field3753 * arg2 + arg1;
        int var7 = Statics.field3753 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field3751) {
            int var10 = field3751 - arg2;
            arg4 -= var10;
            arg2 = field3751;
            var9 += arg3 * var10;
            var6 += Statics.field3753 * var10;
        }
        if (arg2 + arg4 > field3752) {
            arg4 -= arg2 + arg4 - field3752;
        }
        if (arg1 < field3749) {
            int var11 = field3749 - arg1;
            arg3 -= var11;
            arg1 = field3749;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field3754) {
            int var12 = arg1 + arg3 - field3754;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4408(Statics.field3748, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("jr.aw([I[BIIIIIII)V")
    public static void method4408(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("jr.ak([BIIIIII)V")
    public static void method4416(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field3753 * arg2 + arg1;
        int var8 = Statics.field3753 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3751) {
            int var11 = field3751 - arg2;
            arg4 -= var11;
            arg2 = field3751;
            var10 += arg3 * var11;
            var7 += Statics.field3753 * var11;
        }
        if (arg2 + arg4 > field3752) {
            arg4 -= arg2 + arg4 - field3752;
        }
        if (arg1 < field3749) {
            int var12 = field3749 - arg1;
            arg3 -= var12;
            arg1 = field3749;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3754) {
            int var13 = arg1 + arg3 - field3754;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4417(Statics.field3748, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("jr.ax([I[BIIIIIIII)V")
    public static void method4417(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("jr.o([BIIIIII)V")
    public abstract void method4384(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("jr.e([BIIIII)V")
    public abstract void method4386(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
