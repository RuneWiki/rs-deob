package deob;

import java.util.Random;

@ObfuscatedName("jz")
public abstract class class265 extends class282 {

    @ObfuscatedName("jz.d")
    public byte[][] field3633 = new byte[256][];

    @ObfuscatedName("jz.q")
    public int[] field3618;

    @ObfuscatedName("jz.x")
    public int[] field3622;

    @ObfuscatedName("jz.y")
    public int[] field3635;

    @ObfuscatedName("jz.e")
    public int[] field3632;

    @ObfuscatedName("jz.f")
    public int[] field3617;

    @ObfuscatedName("jz.v")
    public int field3623 = 0;

    @ObfuscatedName("jz.t")
    public int field3619;

    @ObfuscatedName("jz.i")
    public int field3620;

    @ObfuscatedName("jz.g")
    public byte[] field3624;

    @ObfuscatedName("jz.s")
    public static int field3628 = -1;

    @ObfuscatedName("jz.o")
    public static int field3629 = -1;

    @ObfuscatedName("jz.p")
    public static int field3630 = -1;

    @ObfuscatedName("jz.u")
    public static int field3631 = -1;

    @ObfuscatedName("jz.b")
    public static int field3636 = 0;

    @ObfuscatedName("jz.w")
    public static int field3621 = 0;

    @ObfuscatedName("jz.k")
    public static int field3634 = 256;

    @ObfuscatedName("jz.n")
    public static int field3625 = 0;

    @ObfuscatedName("jz.c")
    public static int field3627 = 0;

    @ObfuscatedName("jz.l")
    public static Random field3637 = new Random();

    @ObfuscatedName("jz.m")
    public static String[] field3638 = new String[100];

    public class265(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3632 = arg1;
        this.field3617 = arg2;
        this.field3622 = arg3;
        this.field3635 = arg4;
        this.method4353(arg0);
        this.field3633 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3617[var10] < var8 && this.field3635[var10] != 0) {
                var8 = this.field3617[var10];
            }
            if (this.field3635[var10] + this.field3617[var10] > var9) {
                var9 = this.field3635[var10] + this.field3617[var10];
            }
        }
        this.field3619 = this.field3623 - var8;
        this.field3620 = var9 - this.field3623;
    }

    public class265(byte[] arg0) {
        this.method4353(arg0);
    }

    @ObfuscatedName("jz.t([B)V")
    public void method4353(byte[] arg0) {
        this.field3618 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3618.length; var2++) {
                this.field3618[var2] = arg0[var2] & 0xFF;
            }
            this.field3623 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3618[var4] = arg0[var3++] & 0xFF;
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
        this.field3624 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3624[(var17 << 8) + var18] = (byte) method4354(var9, var13, var6, this.field3618, var5, var17, var18);
                    }
                }
            }
        }
        this.field3623 = var5[32] + var6[32];
    }

    @ObfuscatedName("jz.i([[B[[B[I[I[III)I")
    public static int method4354(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("jz.r(C)I")
    public int method4355(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3618[class267.method1387(arg0) & 0xFF];
    }

    @ObfuscatedName("jz.g(Ljava/lang/String;)I")
    public int method4434(String arg0) {
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
                                    int var9 = class271.method2729(var8, 10, true);
                                    var4 += Statics.field3626[var9].field3765;
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
                    var4 += this.field3618[(char) (class267.method1387(var6) & 0xFF)];
                    if (this.field3624 != null && var3 != -1) {
                        var4 += this.field3624[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("jz.s(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method4441(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method4355('<');
                        if (this.field3624 != null && var11 != -1) {
                            var4 += this.field3624[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method4355('>');
                        if (this.field3624 != null && var11 != -1) {
                            var4 += this.field3624[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class271.method2729(var17, 10, true);
                            var4 += Statics.field3626[var18].field3765;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method4355(var15);
                        if (this.field3624 != null && var11 != -1) {
                            var4 += this.field3624[(var11 << 8) + var15];
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

    @ObfuscatedName("jz.o(Ljava/lang/String;I)I")
    public int method4380(String arg0, int arg1) {
        int var3 = this.method4441(arg0, new int[] { arg1 }, field3638);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method4434(field3638[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("jz.p(Ljava/lang/String;I)I")
    public int method4405(String arg0, int arg1) {
        return this.method4441(arg0, new int[] { arg1 }, field3638);
    }

    @ObfuscatedName("jz.u(Ljava/lang/String;)Ljava/lang/String;")
    public static String method4360(String arg0) {
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

    @ObfuscatedName("jz.b(Ljava/lang/String;IIII)V")
    public void method4371(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4421(arg3, arg4);
            this.method4422(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("jz.w(Ljava/lang/String;IIIII)V")
    public void method4361(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method4421(arg3, arg4);
            field3634 = arg5;
            this.method4422(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("jz.k(Ljava/lang/String;IIII)V")
    public void method4362(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4421(arg3, arg4);
            this.method4422(arg0, arg1 - this.method4434(arg0), arg2);
        }
    }

    @ObfuscatedName("jz.c(Ljava/lang/String;IIII)V")
    public void method4363(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method4421(arg3, arg4);
            this.method4422(arg0, arg1 - this.method4434(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("jz.h(Ljava/lang/String;IIIIIIIII)I")
    public int method4447(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method4421(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3623;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3620 + this.field3619 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method4441(arg0, var11, field3638);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3619 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3619 - this.field3620 - (var12 - 1) * arg9) / 2 + this.field3619 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3620 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3619 - this.field3620 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3619 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method4422(field3638[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method4422(field3638[var15], arg1 + (arg3 - this.method4434(field3638[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method4422(field3638[var15], arg1 + arg3 - this.method4434(field3638[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method4422(field3638[var15], arg1, var13);
            } else {
                this.method4370(field3638[var15], arg3);
                this.method4422(field3638[var15], arg1, var13);
                field3625 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("jz.z(Ljava/lang/String;IIIII)V")
    public void method4365(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4421(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method4372(arg0, arg1 - this.method4434(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("jz.j(Ljava/lang/String;IIIII)V")
    public void method4366(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4421(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method4372(arg0, arg1 - this.method4434(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("jz.am(Ljava/lang/String;IIIIII)V")
    public void method4358(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method4421(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method4372(arg0, arg1 - this.method4434(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("jz.ac(Ljava/lang/String;IIIII)V")
    public void method4367(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method4421(arg3, arg4);
        field3637.setSeed((long) arg5);
        field3634 = 192 + (field3637.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3637.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method4372(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("jz.ax(II)V")
    public void method4421(int arg0, int arg1) {
        field3628 = -1;
        field3629 = -1;
        field3630 = arg1;
        field3631 = arg1;
        field3636 = arg0;
        field3621 = arg0;
        field3634 = 256;
        field3625 = 0;
        field3627 = 0;
    }

    @ObfuscatedName("jz.at(Ljava/lang/String;)V")
    public void method4369(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class271.method2729(var2, 16, true);
                field3621 = var3;
            } else if (arg0.equals("/col")) {
                field3621 = field3636;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class271.method2729(var4, 16, true);
                field3628 = var5;
            } else if (arg0.equals("str")) {
                field3628 = 8388608;
            } else if (arg0.equals("/str")) {
                field3628 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class271.method2729(var6, 16, true);
                field3629 = var7;
            } else if (arg0.equals("u")) {
                field3629 = 0;
            } else if (arg0.equals("/u")) {
                field3629 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class271.method2729(var8, 16, true);
                field3631 = var9;
            } else if (arg0.equals("shad")) {
                field3631 = 0;
            } else if (arg0.equals("/shad")) {
                field3631 = field3630;
            } else if (arg0.equals("br")) {
                this.method4421(field3636, field3630);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("jz.ag(Ljava/lang/String;I)V")
    public void method4370(String arg0, int arg1) {
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
            field3625 = (arg1 - this.method4434(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("jz.ar(Ljava/lang/String;II)V")
    public void method4422(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3623;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class267.method1387(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class271.method3130(var9.substring(4));
                                        class285 var11 = Statics.field3626[var10];
                                        var11.method4636(arg1, this.field3623 + var4 - var11.field3759);
                                        arg1 += var11.field3765;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method4369(var9);
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
                        if (this.field3624 != null && var6 != -1) {
                            arg1 += this.field3624[(var6 << 8) + var8];
                        }
                        int var13 = this.field3622[var8];
                        int var14 = this.field3635[var8];
                        if (var8 == ' ') {
                            if (field3625 > 0) {
                                field3627 += field3625;
                                arg1 += field3627 >> 8;
                                field3627 &= 0xFF;
                            }
                        } else if (field3634 == 256) {
                            if (field3631 != -1) {
                                method4373(this.field3633[var8], this.field3632[var8] + arg1 + 1, this.field3617[var8] + var4 + 1, var13, var14, field3631);
                            }
                            this.method4344(this.field3633[var8], this.field3632[var8] + arg1, this.field3617[var8] + var4, var13, var14, field3621);
                        } else {
                            if (field3631 != -1) {
                                method4430(this.field3633[var8], this.field3632[var8] + arg1 + 1, this.field3617[var8] + var4 + 1, var13, var14, field3631, field3634);
                            }
                            this.method4349(this.field3633[var8], this.field3632[var8] + arg1, this.field3617[var8] + var4, var13, var14, field3621, field3634);
                        }
                        int var15 = this.field3618[var8];
                        if (field3628 != -1) {
                            method4617(arg1, (int) ((double) this.field3623 * 0.7D) + var4, var15, field3628);
                        }
                        if (field3629 != -1) {
                            method4617(arg1, this.field3623 + var4 + 1, var15, field3629);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("jz.ae(Ljava/lang/String;II[I[I)V")
    public void method4372(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3623;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class267.method1387(arg0.charAt(var10)) & 0xFF);
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
                                        int var16 = class271.method2729(var15, 10, true);
                                        class285 var18 = Statics.field3626[var16];
                                        var18.method4636(arg1 + var13, this.field3623 + var6 - var18.field3759 + var14);
                                        arg1 += var18.field3765;
                                        var8 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method4369(var12);
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
                        if (this.field3624 != null && var8 != -1) {
                            arg1 += this.field3624[(var8 << 8) + var11];
                        }
                        int var20 = this.field3622[var11];
                        int var21 = this.field3635[var11];
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
                            if (field3625 > 0) {
                                field3627 += field3625;
                                arg1 += field3627 >> 8;
                                field3627 &= 0xFF;
                            }
                        } else if (field3634 == 256) {
                            if (field3631 != -1) {
                                method4373(this.field3633[var11], this.field3632[var11] + arg1 + 1 + var22, this.field3617[var11] + var6 + 1 + var23, var20, var21, field3631);
                            }
                            this.method4344(this.field3633[var11], this.field3632[var11] + arg1 + var22, this.field3617[var11] + var6 + var23, var20, var21, field3621);
                        } else {
                            if (field3631 != -1) {
                                method4430(this.field3633[var11], this.field3632[var11] + arg1 + 1 + var22, this.field3617[var11] + var6 + 1 + var23, var20, var21, field3631, field3634);
                            }
                            this.method4349(this.field3633[var11], this.field3632[var11] + arg1 + var22, this.field3617[var11] + var6 + var23, var20, var21, field3621, field3634);
                        }
                        int var24 = this.field3618[var11];
                        if (field3628 != -1) {
                            method4617(arg1, (int) ((double) this.field3623 * 0.7D) + var6, var24, field3628);
                        }
                        if (field3629 != -1) {
                            method4617(arg1, this.field3623 + var6, var24, field3629);
                        }
                        arg1 += var24;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("jz.ai([BIIIII)V")
    public static void method4373(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field3739 * arg2 + arg1;
        int var7 = Statics.field3739 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field3741) {
            int var10 = field3741 - arg2;
            arg4 -= var10;
            arg2 = field3741;
            var9 += arg3 * var10;
            var6 += Statics.field3739 * var10;
        }
        if (arg2 + arg4 > field3742) {
            arg4 -= arg2 + arg4 - field3742;
        }
        if (arg1 < field3743) {
            int var11 = field3743 - arg1;
            arg3 -= var11;
            arg1 = field3743;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field3740) {
            int var12 = arg1 + arg3 - field3740;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4374(Statics.field3744, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("jz.au([I[BIIIIIII)V")
    public static void method4374(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("jz.ad([BIIIIII)V")
    public static void method4430(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field3739 * arg2 + arg1;
        int var8 = Statics.field3739 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3741) {
            int var11 = field3741 - arg2;
            arg4 -= var11;
            arg2 = field3741;
            var10 += arg3 * var11;
            var7 += Statics.field3739 * var11;
        }
        if (arg2 + arg4 > field3742) {
            arg4 -= arg2 + arg4 - field3742;
        }
        if (arg1 < field3743) {
            int var12 = field3743 - arg1;
            arg3 -= var12;
            arg1 = field3743;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3740) {
            int var13 = arg1 + arg3 - field3740;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4376(Statics.field3744, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("jz.ah([I[BIIIIIIII)V")
    public static void method4376(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("jz.d([BIIIII)V")
    public abstract void method4344(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("jz.q([BIIIIII)V")
    public abstract void method4349(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
