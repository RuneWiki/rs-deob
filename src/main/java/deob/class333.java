package deob;

import java.util.Random;

@ObfuscatedName("ly")
public abstract class class333 extends class430 {

    @ObfuscatedName("ly.c")
    public byte[][] field4031 = new byte[256][];

    @ObfuscatedName("ly.l")
    public int[] field4037;

    @ObfuscatedName("ly.s")
    public int[] field4026;

    @ObfuscatedName("ly.e")
    public int[] field4027;

    @ObfuscatedName("ly.r")
    public int[] field4024;

    @ObfuscatedName("ly.o")
    public int[] field4029;

    @ObfuscatedName("ly.i")
    public int field4045 = 0;

    @ObfuscatedName("ly.w")
    public int field4028;

    @ObfuscatedName("ly.v")
    public int field4032;

    @ObfuscatedName("ly.y")
    public byte[] field4034;

    @ObfuscatedName("ly.u")
    public static int field4035 = -1;

    @ObfuscatedName("ly.h")
    public static int field4036 = -1;

    @ObfuscatedName("ly.q")
    public static int field4040 = -1;

    @ObfuscatedName("ly.x")
    public static int field4038 = -1;

    @ObfuscatedName("ly.p")
    public static int field4039 = 0;

    @ObfuscatedName("ly.n")
    public static int field4030 = 0;

    @ObfuscatedName("ly.m")
    public static int field4041 = 256;

    @ObfuscatedName("ly.d")
    public static int field4042 = 0;

    @ObfuscatedName("ly.j")
    public static int field4025 = 0;

    @ObfuscatedName("ly.f")
    public static Random field4044 = new Random();

    @ObfuscatedName("ly.g")
    public static String[] field4043 = new String[100];

    public class333(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field4024 = arg1;
        this.field4029 = arg2;
        this.field4026 = arg3;
        this.field4027 = arg4;
        this.method5534(arg0);
        this.field4031 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field4029[var10] < var8 && this.field4027[var10] != 0) {
                var8 = this.field4029[var10];
            }
            if (this.field4029[var10] + this.field4027[var10] > var9) {
                var9 = this.field4029[var10] + this.field4027[var10];
            }
        }
        this.field4028 = this.field4045 - var8;
        this.field4032 = var9 - this.field4045;
    }

    public class333(byte[] arg0) {
        this.method5534(arg0);
    }

    @ObfuscatedName("ly.a([B)V")
    public void method5534(byte[] arg0) {
        this.field4037 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4037.length; var2++) {
                this.field4037[var2] = arg0[var2] & 0xFF;
            }
            this.field4045 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4037[var4] = arg0[var3++] & 0xFF;
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
        this.field4034 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4034[(var17 << 8) + var18] = (byte) method5512(var9, var13, var6, this.field4037, var5, var17, var18);
                    }
                }
            }
        }
        this.field4045 = var5[32] + var6[32];
    }

    @ObfuscatedName("ly.y([[B[[B[I[I[III)I")
    public static int method5512(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("ly.u(C)I")
    public int method5440(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4037[class334.method2329(arg0) & 0xFF];
    }

    @ObfuscatedName("ly.h(Ljava/lang/String;)I")
    public int method5441(String arg0) {
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
                                    int var8 = Statics.method2340(var7.substring(4));
                                    var4 += Statics.field4033[var8].field4599;
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
                    var4 += this.field4037[(char) (class334.method2329(var6) & 0xFF)];
                    if (this.field4034 != null && var3 != -1) {
                        var4 += this.field4034[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("ly.q(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method5442(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method5440('<');
                        if (this.field4034 != null && var11 != -1) {
                            var4 += this.field4034[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method5440('>');
                        if (this.field4034 != null && var11 != -1) {
                            var4 += this.field4034[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = Statics.method2340(var16.substring(4));
                            var4 += Statics.field4033[var17].field4599;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method5440(var15);
                        if (this.field4034 != null && var11 != -1) {
                            var4 += this.field4034[(var11 << 8) + var15];
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

    @ObfuscatedName("ly.x(Ljava/lang/String;I)I")
    public int method5497(String arg0, int arg1) {
        int var3 = this.method5442(arg0, new int[] { arg1 }, field4043);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method5441(field4043[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("ly.p(Ljava/lang/String;I)I")
    public int method5443(String arg0, int arg1) {
        return this.method5442(arg0, new int[] { arg1 }, field4043);
    }

    @ObfuscatedName("ly.n(Ljava/lang/String;)Ljava/lang/String;")
    public static String method5477(String arg0) {
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

    @ObfuscatedName("ly.m(IILjava/lang/String;II)Lna;")
    public class368 method5445(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class368(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method5441(arg2) / 2;
        int var7 = var6 + this.method5441(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4028;
        int var9 = this.method5441(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4032 + this.field4028;
        return new class368(var7, var8, var9, var10);
    }

    @ObfuscatedName("ly.d(Ljava/lang/String;IIII)V")
    public void method5446(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5455(arg3, arg4);
            this.method5458(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ly.j(Ljava/lang/String;IIIII)V")
    public void method5464(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method5455(arg3, arg4);
            field4041 = arg5;
            this.method5458(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ly.f(Ljava/lang/String;IIII)V")
    public void method5448(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5455(arg3, arg4);
            this.method5458(arg0, arg1 - this.method5441(arg0), arg2);
        }
    }

    @ObfuscatedName("ly.g(Ljava/lang/String;IIII)V")
    public void method5449(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5455(arg3, arg4);
            this.method5458(arg0, arg1 - this.method5441(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("ly.t(Ljava/lang/String;IIIIIIIII)I")
    public int method5519(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method5455(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field4045;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field4032 + this.field4028 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method5442(arg0, var11, field4043);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field4028 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field4028 - this.field4032 - (var12 - 1) * arg9) / 2 + this.field4028 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field4032 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field4028 - this.field4032 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field4028 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method5458(field4043[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method5458(field4043[var15], arg1 + (arg3 - this.method5441(field4043[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method5458(field4043[var15], arg1 + arg3 - this.method5441(field4043[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method5458(field4043[var15], arg1, var13);
            } else {
                this.method5457(field4043[var15], arg3);
                this.method5458(field4043[var15], arg1, var13);
                field4042 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("ly.k(Ljava/lang/String;IIIII)V")
    public void method5474(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5455(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method5459(arg0, arg1 - this.method5441(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("ly.b(Ljava/lang/String;IIIII)V")
    public void method5452(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5455(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method5459(arg0, arg1 - this.method5441(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("ly.z(Ljava/lang/String;IIIIII)V")
    public void method5453(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method5455(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method5459(arg0, arg1 - this.method5441(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("ly.ap(Ljava/lang/String;IIIII)V")
    public void method5454(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5455(arg3, arg4);
        field4044.setSeed((long) arg5);
        field4041 = 192 + (field4044.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4044.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method5459(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("ly.af(II)V")
    public void method5455(int arg0, int arg1) {
        field4035 = -1;
        field4036 = -1;
        field4040 = arg1;
        field4038 = arg1;
        field4039 = arg0;
        field4030 = arg0;
        field4041 = 256;
        field4042 = 0;
        field4025 = 0;
    }

    @ObfuscatedName("ly.ak(Ljava/lang/String;)V")
    public void method5456(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class336.method4301(var2, 16, true);
                field4030 = var3;
            } else if (arg0.equals("/col")) {
                field4030 = field4039;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class336.method4301(var4, 16, true);
                field4035 = var5;
            } else if (arg0.equals("str")) {
                field4035 = 8388608;
            } else if (arg0.equals("/str")) {
                field4035 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class336.method4301(var6, 16, true);
                field4036 = var7;
            } else if (arg0.equals("u")) {
                field4036 = 0;
            } else if (arg0.equals("/u")) {
                field4036 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class336.method4301(var8, 16, true);
                field4038 = var9;
            } else if (arg0.equals("shad")) {
                field4038 = 0;
            } else if (arg0.equals("/shad")) {
                field4038 = field4040;
            } else if (arg0.equals("br")) {
                this.method5455(field4039, field4040);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ly.av(Ljava/lang/String;I)V")
    public void method5457(String arg0, int arg1) {
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
            field4042 = (arg1 - this.method5441(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("ly.ar(Ljava/lang/String;II)V")
    public void method5458(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4045;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class334.method2329(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = Statics.method2340(var9.substring(4));
                                        class433 var11 = Statics.field4033[var10];
                                        var11.method7034(arg1, this.field4045 + var4 - var11.field4593);
                                        arg1 += var11.field4599;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method5456(var9);
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
                        if (this.field4034 != null && var6 != -1) {
                            arg1 += this.field4034[(var6 << 8) + var8];
                        }
                        int var13 = this.field4026[var8];
                        int var14 = this.field4027[var8];
                        if (var8 == ' ') {
                            if (field4042 > 0) {
                                field4025 += field4042;
                                arg1 += field4025 >> 8;
                                field4025 &= 0xFF;
                            }
                        } else if (field4041 == 256) {
                            if (field4038 != -1) {
                                method5438(this.field4031[var8], this.field4024[var8] + arg1 + 1, this.field4029[var8] + var4 + 1, var13, var14, field4038);
                            }
                            this.method5430(this.field4031[var8], this.field4024[var8] + arg1, this.field4029[var8] + var4, var13, var14, field4030);
                        } else {
                            if (field4038 != -1) {
                                method5471(this.field4031[var8], this.field4024[var8] + arg1 + 1, this.field4029[var8] + var4 + 1, var13, var14, field4038, field4041);
                            }
                            this.method5429(this.field4031[var8], this.field4024[var8] + arg1, this.field4029[var8] + var4, var13, var14, field4030, field4041);
                        }
                        int var15 = this.field4037[var8];
                        if (field4035 != -1) {
                            method6963(arg1, (int) ((double) this.field4045 * 0.7D) + var4, var15, field4035);
                        }
                        if (field4036 != -1) {
                            method6963(arg1, this.field4045 + var4 + 1, var15, field4036);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ly.al(Ljava/lang/String;II[I[I)V")
    public void method5459(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field4045;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class334.method2329(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = Statics.method2340(var12.substring(4));
                                        class433 var16 = Statics.field4033[var15];
                                        var16.method7034(arg1 + var13, this.field4045 + var6 - var16.field4593 + var14);
                                        arg1 += var16.field4599;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method5456(var12);
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
                        if (this.field4034 != null && var8 != -1) {
                            arg1 += this.field4034[(var8 << 8) + var11];
                        }
                        int var18 = this.field4026[var11];
                        int var19 = this.field4027[var11];
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
                            if (field4042 > 0) {
                                field4025 += field4042;
                                arg1 += field4025 >> 8;
                                field4025 &= 0xFF;
                            }
                        } else if (field4041 == 256) {
                            if (field4038 != -1) {
                                method5438(this.field4031[var11], this.field4024[var11] + arg1 + 1 + var20, this.field4029[var11] + var6 + 1 + var21, var18, var19, field4038);
                            }
                            this.method5430(this.field4031[var11], this.field4024[var11] + arg1 + var20, this.field4029[var11] + var6 + var21, var18, var19, field4030);
                        } else {
                            if (field4038 != -1) {
                                method5471(this.field4031[var11], this.field4024[var11] + arg1 + 1 + var20, this.field4029[var11] + var6 + 1 + var21, var18, var19, field4038, field4041);
                            }
                            this.method5429(this.field4031[var11], this.field4024[var11] + arg1 + var20, this.field4029[var11] + var6 + var21, var18, var19, field4030, field4041);
                        }
                        int var22 = this.field4037[var11];
                        if (field4035 != -1) {
                            method6963(arg1, (int) ((double) this.field4045 * 0.7D) + var6, var22, field4035);
                        }
                        if (field4036 != -1) {
                            method6963(arg1, this.field4045 + var6, var22, field4036);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ly.aa([BIIIII)V")
    public static void method5438(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field4579 * arg2 + arg1;
        int var7 = Statics.field4579 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field4581) {
            int var10 = field4581 - arg2;
            arg4 -= var10;
            arg2 = field4581;
            var9 += arg3 * var10;
            var6 += Statics.field4579 * var10;
        }
        if (arg2 + arg4 > field4582) {
            arg4 -= arg2 + arg4 - field4582;
        }
        if (arg1 < field4583) {
            int var11 = field4583 - arg1;
            arg3 -= var11;
            arg1 = field4583;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field4584) {
            int var12 = arg1 + arg3 - field4584;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5462(Statics.field4578, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("ly.ao([I[BIIIIIII)V")
    public static void method5462(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("ly.aq([BIIIIII)V")
    public static void method5471(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field4579 * arg2 + arg1;
        int var8 = Statics.field4579 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4581) {
            int var11 = field4581 - arg2;
            arg4 -= var11;
            arg2 = field4581;
            var10 += arg3 * var11;
            var7 += Statics.field4579 * var11;
        }
        if (arg2 + arg4 > field4582) {
            arg4 -= arg2 + arg4 - field4582;
        }
        if (arg1 < field4583) {
            int var12 = field4583 - arg1;
            arg3 -= var12;
            arg1 = field4583;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4584) {
            int var13 = arg1 + arg3 - field4584;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5490(Statics.field4578, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("ly.ay([I[BIIIIIIII)V")
    public static void method5490(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("ly.l([BIIIIII)V")
    public abstract void method5429(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("ly.c([BIIIII)V")
    public abstract void method5430(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
