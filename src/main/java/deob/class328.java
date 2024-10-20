package deob;

import java.util.Random;

@ObfuscatedName("lm")
public abstract class class328 extends class428 {

    @ObfuscatedName("lm.c")
    public byte[][] field3995 = new byte[256][];

    @ObfuscatedName("lm.b")
    public int[] field3977;

    @ObfuscatedName("lm.p")
    public int[] field3984;

    @ObfuscatedName("lm.m")
    public int[] field3979;

    @ObfuscatedName("lm.t")
    public int[] field3980;

    @ObfuscatedName("lm.s")
    public int[] field3981;

    @ObfuscatedName("lm.j")
    public int field3989 = 0;

    @ObfuscatedName("lm.w")
    public int field3976;

    @ObfuscatedName("lm.n")
    public int field3988;

    @ObfuscatedName("lm.o")
    public byte[] field3992;

    @ObfuscatedName("lm.v")
    public static int field3978 = -1;

    @ObfuscatedName("lm.d")
    public static int field3986 = -1;

    @ObfuscatedName("lm.h")
    public static int field3994 = -1;

    @ObfuscatedName("lm.g")
    public static int field3990 = -1;

    @ObfuscatedName("lm.e")
    public static int field3991 = 0;

    @ObfuscatedName("lm.a")
    public static int field3983 = 0;

    @ObfuscatedName("lm.u")
    public static int field3993 = 256;

    @ObfuscatedName("lm.k")
    public static int field3987 = 0;

    @ObfuscatedName("lm.f")
    public static int field3982 = 0;

    @ObfuscatedName("lm.l")
    public static Random field3996 = new Random();

    @ObfuscatedName("lm.q")
    public static String[] field3997 = new String[100];

    public class328(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3980 = arg1;
        this.field3981 = arg2;
        this.field3984 = arg3;
        this.field3979 = arg4;
        this.method5453(arg0);
        this.field3995 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3981[var10] < var8 && this.field3979[var10] != 0) {
                var8 = this.field3981[var10];
            }
            if (this.field3981[var10] + this.field3979[var10] > var9) {
                var9 = this.field3981[var10] + this.field3979[var10];
            }
        }
        this.field3976 = this.field3989 - var8;
        this.field3988 = var9 - this.field3989;
    }

    public class328(byte[] arg0) {
        this.method5453(arg0);
    }

    @ObfuscatedName("lm.w([B)V")
    public void method5453(byte[] arg0) {
        this.field3977 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3977.length; var2++) {
                this.field3977[var2] = arg0[var2] & 0xFF;
            }
            this.field3989 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3977[var4] = arg0[var3++] & 0xFF;
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
        this.field3992 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3992[(var17 << 8) + var18] = (byte) method5475(var9, var13, var6, this.field3977, var5, var17, var18);
                    }
                }
            }
        }
        this.field3989 = var5[32] + var6[32];
    }

    @ObfuscatedName("lm.n([[B[[B[I[I[III)I")
    public static int method5475(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("lm.r(C)I")
    public int method5518(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3977[class329.method6128(arg0) & 0xFF];
    }

    @ObfuscatedName("lm.o(Ljava/lang/String;)I")
    public int method5487(String arg0) {
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
                                    int var8 = class331.method2606(var7.substring(4));
                                    var4 += Statics.field3985[var8].field4563;
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
                    var4 += this.field3977[(char) (class329.method6128(var6) & 0xFF)];
                    if (this.field3992 != null && var3 != -1) {
                        var4 += this.field3992[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("lm.v(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method5470(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method5518('<');
                        if (this.field3992 != null && var11 != -1) {
                            var4 += this.field3992[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method5518('>');
                        if (this.field3992 != null && var11 != -1) {
                            var4 += this.field3992[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class331.method2606(var16.substring(4));
                            var4 += Statics.field3985[var17].field4563;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method5518(var15);
                        if (this.field3992 != null && var11 != -1) {
                            var4 += this.field3992[(var11 << 8) + var15];
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

    @ObfuscatedName("lm.d(Ljava/lang/String;I)I")
    public int method5458(String arg0, int arg1) {
        int var3 = this.method5470(arg0, new int[] { arg1 }, field3997);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method5487(field3997[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("lm.h(Ljava/lang/String;I)I")
    public int method5482(String arg0, int arg1) {
        return this.method5470(arg0, new int[] { arg1 }, field3997);
    }

    @ObfuscatedName("lm.g(Ljava/lang/String;)Ljava/lang/String;")
    public static String method5460(String arg0) {
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

    @ObfuscatedName("lm.e(IILjava/lang/String;II)Lme;")
    public class363 method5521(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class363(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method5487(arg2) / 2;
        int var7 = var6 + this.method5487(arg2.substring(0, arg0));
        int var8 = arg4 - this.field3976;
        int var9 = this.method5487(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field3988 + this.field3976;
        return new class363(var7, var8, var9, var10);
    }

    @ObfuscatedName("lm.a(Ljava/lang/String;IIII)V")
    public void method5462(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5471(arg3, arg4);
            this.method5459(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lm.u(Ljava/lang/String;IIIII)V")
    public void method5463(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method5471(arg3, arg4);
            field3993 = arg5;
            this.method5459(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lm.k(Ljava/lang/String;IIII)V")
    public void method5464(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5471(arg3, arg4);
            this.method5459(arg0, arg1 - this.method5487(arg0), arg2);
        }
    }

    @ObfuscatedName("lm.f(Ljava/lang/String;IIII)V")
    public void method5454(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5471(arg3, arg4);
            this.method5459(arg0, arg1 - this.method5487(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("lm.l(Ljava/lang/String;IIIIIIIII)I")
    public int method5466(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method5471(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3989;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3988 + this.field3976 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method5470(arg0, var11, field3997);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3976 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3976 - this.field3988 - (var12 - 1) * arg9) / 2 + this.field3976 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3988 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3976 - this.field3988 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3976 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method5459(field3997[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method5459(field3997[var15], arg1 + (arg3 - this.method5487(field3997[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method5459(field3997[var15], arg1 + arg3 - this.method5487(field3997[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method5459(field3997[var15], arg1, var13);
            } else {
                this.method5473(field3997[var15], arg3);
                this.method5459(field3997[var15], arg1, var13);
                field3987 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("lm.q(Ljava/lang/String;IIIII)V")
    public void method5467(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5471(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method5457(arg0, arg1 - this.method5487(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("lm.x(Ljava/lang/String;IIIII)V")
    public void method5480(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5471(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method5457(arg0, arg1 - this.method5487(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("lm.z(Ljava/lang/String;IIIIII)V")
    public void method5469(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method5471(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method5457(arg0, arg1 - this.method5487(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("lm.i(Ljava/lang/String;IIIII)V")
    public void method5537(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5471(arg3, arg4);
        field3996.setSeed((long) arg5);
        field3993 = 192 + (field3996.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3996.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method5457(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("lm.y(II)V")
    public void method5471(int arg0, int arg1) {
        field3978 = -1;
        field3986 = -1;
        field3994 = arg1;
        field3990 = arg1;
        field3991 = arg0;
        field3983 = arg0;
        field3993 = 256;
        field3987 = 0;
        field3982 = 0;
    }

    @ObfuscatedName("lm.ah(Ljava/lang/String;)V")
    public void method5472(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class331.method4786(var2, 16, true);
                field3983 = var3;
            } else if (arg0.equals("/col")) {
                field3983 = field3991;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class331.method4786(var4, 16, true);
                field3978 = var5;
            } else if (arg0.equals("str")) {
                field3978 = 8388608;
            } else if (arg0.equals("/str")) {
                field3978 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class331.method4786(var6, 16, true);
                field3986 = var7;
            } else if (arg0.equals("u")) {
                field3986 = 0;
            } else if (arg0.equals("/u")) {
                field3986 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class331.method4786(var8, 16, true);
                field3990 = var9;
            } else if (arg0.equals("shad")) {
                field3990 = 0;
            } else if (arg0.equals("/shad")) {
                field3990 = field3994;
            } else if (arg0.equals("br")) {
                this.method5471(field3991, field3994);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("lm.ao(Ljava/lang/String;I)V")
    public void method5473(String arg0, int arg1) {
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
            field3987 = (arg1 - this.method5487(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("lm.ab(Ljava/lang/String;II)V")
    public void method5459(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3989;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class329.method6128(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class331.method2606(var9.substring(4));
                                        class431 var11 = Statics.field3985[var10];
                                        var11.method7018(arg1, this.field3989 + var4 - var11.field4564);
                                        arg1 += var11.field4563;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method5472(var9);
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
                        if (this.field3992 != null && var6 != -1) {
                            arg1 += this.field3992[(var6 << 8) + var8];
                        }
                        int var13 = this.field3984[var8];
                        int var14 = this.field3979[var8];
                        if (var8 == ' ') {
                            if (field3987 > 0) {
                                field3982 += field3987;
                                arg1 += field3982 >> 8;
                                field3982 &= 0xFF;
                            }
                        } else if (field3993 == 256) {
                            if (field3990 != -1) {
                                method5465(this.field3995[var8], this.field3980[var8] + arg1 + 1, this.field3981[var8] + var4 + 1, var13, var14, field3990);
                            }
                            this.method5447(this.field3995[var8], this.field3980[var8] + arg1, this.field3981[var8] + var4, var13, var14, field3983);
                        } else {
                            if (field3990 != -1) {
                                method5474(this.field3995[var8], this.field3980[var8] + arg1 + 1, this.field3981[var8] + var4 + 1, var13, var14, field3990, field3993);
                            }
                            this.method5446(this.field3995[var8], this.field3980[var8] + arg1, this.field3981[var8] + var4, var13, var14, field3983, field3993);
                        }
                        int var15 = this.field3977[var8];
                        if (field3978 != -1) {
                            method6949(arg1, (int) ((double) this.field3989 * 0.7D) + var4, var15, field3978);
                        }
                        if (field3986 != -1) {
                            method6949(arg1, this.field3989 + var4 + 1, var15, field3986);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("lm.an(Ljava/lang/String;II[I[I)V")
    public void method5457(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3989;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class329.method6128(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class331.method2606(var12.substring(4));
                                        class431 var16 = Statics.field3985[var15];
                                        var16.method7018(arg1 + var13, this.field3989 + var6 - var16.field4564 + var14);
                                        arg1 += var16.field4563;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method5472(var12);
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
                        if (this.field3992 != null && var8 != -1) {
                            arg1 += this.field3992[(var8 << 8) + var11];
                        }
                        int var18 = this.field3984[var11];
                        int var19 = this.field3979[var11];
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
                            if (field3987 > 0) {
                                field3982 += field3987;
                                arg1 += field3982 >> 8;
                                field3982 &= 0xFF;
                            }
                        } else if (field3993 == 256) {
                            if (field3990 != -1) {
                                method5465(this.field3995[var11], this.field3980[var11] + arg1 + 1 + var20, this.field3981[var11] + var6 + 1 + var21, var18, var19, field3990);
                            }
                            this.method5447(this.field3995[var11], this.field3980[var11] + arg1 + var20, this.field3981[var11] + var6 + var21, var18, var19, field3983);
                        } else {
                            if (field3990 != -1) {
                                method5474(this.field3995[var11], this.field3980[var11] + arg1 + 1 + var20, this.field3981[var11] + var6 + 1 + var21, var18, var19, field3990, field3993);
                            }
                            this.method5446(this.field3995[var11], this.field3980[var11] + arg1 + var20, this.field3981[var11] + var6 + var21, var18, var19, field3983, field3993);
                        }
                        int var22 = this.field3977[var11];
                        if (field3978 != -1) {
                            method6949(arg1, (int) ((double) this.field3989 * 0.7D) + var6, var22, field3978);
                        }
                        if (field3986 != -1) {
                            method6949(arg1, this.field3989 + var6, var22, field3986);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("lm.ax([BIIIII)V")
    public static void method5465(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field4542 * arg2 + arg1;
        int var7 = Statics.field4542 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field4541) {
            int var10 = field4541 - arg2;
            arg4 -= var10;
            arg2 = field4541;
            var9 += arg3 * var10;
            var6 += Statics.field4542 * var10;
        }
        if (arg2 + arg4 > field4547) {
            arg4 -= arg2 + arg4 - field4547;
        }
        if (arg1 < field4545) {
            int var11 = field4545 - arg1;
            arg3 -= var11;
            arg1 = field4545;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field4544) {
            int var12 = arg1 + arg3 - field4544;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5477(Statics.field4546, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("lm.am([I[BIIIIIII)V")
    public static void method5477(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("lm.az([BIIIIII)V")
    public static void method5474(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field4542 * arg2 + arg1;
        int var8 = Statics.field4542 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4541) {
            int var11 = field4541 - arg2;
            arg4 -= var11;
            arg2 = field4541;
            var10 += arg3 * var11;
            var7 += Statics.field4542 * var11;
        }
        if (arg2 + arg4 > field4547) {
            arg4 -= arg2 + arg4 - field4547;
        }
        if (arg1 < field4545) {
            int var12 = field4545 - arg1;
            arg3 -= var12;
            arg1 = field4545;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4544) {
            int var13 = arg1 + arg3 - field4544;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5479(Statics.field4546, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("lm.au([I[BIIIIIIII)V")
    public static void method5479(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("lm.c([BIIIII)V")
    public abstract void method5447(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("lm.b([BIIIIII)V")
    public abstract void method5446(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
