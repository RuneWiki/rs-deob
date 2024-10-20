package deob;

import java.util.Random;

@ObfuscatedName("ge")
public abstract class class204 extends class74 {

    @ObfuscatedName("ge.e")
    public byte[][] field2966 = new byte[256][];

    @ObfuscatedName("ge.v")
    public int[] field2963;

    @ObfuscatedName("ge.k")
    public int[] field2954;

    @ObfuscatedName("ge.g")
    public int[] field2955;

    @ObfuscatedName("ge.q")
    public int[] field2956;

    @ObfuscatedName("ge.l")
    public int[] field2957;

    @ObfuscatedName("ge.a")
    public int field2958 = 0;

    @ObfuscatedName("ge.b")
    public int field2959;

    @ObfuscatedName("ge.z")
    public int field2960;

    @ObfuscatedName("ge.j")
    public byte[] field2962;

    @ObfuscatedName("ge.p")
    public static int field2973 = -1;

    @ObfuscatedName("ge.u")
    public static int field2952 = -1;

    @ObfuscatedName("ge.y")
    public static int field2964 = -1;

    @ObfuscatedName("ge.o")
    public static int field2969 = -1;

    @ObfuscatedName("ge.m")
    public static int field2967 = 0;

    @ObfuscatedName("ge.h")
    public static int field2968 = 0;

    @ObfuscatedName("ge.x")
    public static int field2953 = 256;

    @ObfuscatedName("ge.d")
    public static int field2970 = 0;

    @ObfuscatedName("ge.ac")
    public static int field2971 = 0;

    @ObfuscatedName("ge.ax")
    public static Random field2972 = new Random();

    @ObfuscatedName("ge.af")
    public static String[] field2965 = new String[100];

    public class204(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field2956 = arg1;
        this.field2957 = arg2;
        this.field2954 = arg3;
        this.field2955 = arg4;
        this.method3418(arg0);
        this.field2966 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2957[var10] < var8 && this.field2955[var10] != 0) {
                var8 = this.field2957[var10];
            }
            if (this.field2957[var10] + this.field2955[var10] > var9) {
                var9 = this.field2957[var10] + this.field2955[var10];
            }
        }
        this.field2959 = this.field2958 - var8;
        this.field2960 = var9 - this.field2958;
    }

    public class204(byte[] arg0) {
        this.method3418(arg0);
    }

    @ObfuscatedName("ge.e([B)V")
    public void method3418(byte[] arg0) {
        this.field2963 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2963.length; var2++) {
                this.field2963[var2] = arg0[var2] & 0xFF;
            }
            this.field2958 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2963[var4] = arg0[var3++] & 0xFF;
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
        this.field2962 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field2962[(var17 << 8) + var18] = (byte) method3426(var9, var13, var6, this.field2963, var5, var17, var18);
                    }
                }
            }
        }
        this.field2958 = var5[32] + var6[32];
    }

    @ObfuscatedName("ge.v([[B[[B[I[I[III)I")
    public static int method3426(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("ge.k(C)I")
    public int method3420(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field2963[class213.method2547(arg0) & 0xFF];
    }

    @ObfuscatedName("ge.g(Ljava/lang/String;)I")
    public int method3477(String arg0) {
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
                                    int var8 = class211.method3149(var7.substring(4));
                                    var4 += Statics.field2961[var8].field1338;
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
                    var4 += this.field2963[(char) (class213.method2547(var6) & 0xFF)];
                    if (this.field2962 != null && var3 != -1) {
                        var4 += this.field2962[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("ge.q(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method3422(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method3420('<');
                        if (this.field2962 != null && var11 != -1) {
                            var4 += this.field2962[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method3420('>');
                        if (this.field2962 != null && var11 != -1) {
                            var4 += this.field2962[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class211.method993(var17, 10, true);
                            var4 += Statics.field2961[var18].field1338;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method3420(var15);
                        if (this.field2962 != null && var11 != -1) {
                            var4 += this.field2962[(var11 << 8) + var15];
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

    @ObfuscatedName("ge.l(Ljava/lang/String;I)I")
    public int method3450(String arg0, int arg1) {
        int var3 = this.method3422(arg0, new int[] { arg1 }, field2965);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method3477(field2965[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("ge.a(Ljava/lang/String;I)I")
    public int method3424(String arg0, int arg1) {
        return this.method3422(arg0, new int[] { arg1 }, field2965);
    }

    @ObfuscatedName("ge.b(Ljava/lang/String;)Ljava/lang/String;")
    public static String method3425(String arg0) {
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

    @ObfuscatedName("ge.z(Ljava/lang/String;IIII)V")
    public void method3483(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3434(arg3, arg4);
            this.method3437(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ge.w(Ljava/lang/String;IIII)V")
    public void method3427(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3434(arg3, arg4);
            this.method3437(arg0, arg1 - this.method3477(arg0), arg2);
        }
    }

    @ObfuscatedName("ge.j(Ljava/lang/String;IIII)V")
    public void method3428(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3434(arg3, arg4);
            this.method3437(arg0, arg1 - this.method3477(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("ge.p(Ljava/lang/String;IIIIIIIII)I")
    public int method3419(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method3434(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field2958;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field2960 + this.field2959 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method3422(arg0, var11, field2965);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field2959 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field2959 - this.field2960 - (var12 - 1) * arg9) / 2 + this.field2959 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field2960 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field2959 - this.field2960 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field2959 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method3437(field2965[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method3437(field2965[var15], arg1 + (arg3 - this.method3477(field2965[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method3437(field2965[var15], arg1 + arg3 - this.method3477(field2965[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method3437(field2965[var15], arg1, var13);
            } else {
                this.method3436(field2965[var15], arg3);
                this.method3437(field2965[var15], arg1, var13);
                field2970 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("ge.n(Ljava/lang/String;IIIII)V")
    public void method3430(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3434(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method3472(arg0, arg1 - this.method3477(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("ge.r(Ljava/lang/String;IIIII)V")
    public void method3438(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3434(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method3472(arg0, arg1 - this.method3477(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("ge.s(Ljava/lang/String;IIIIII)V")
    public void method3443(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method3434(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method3472(arg0, arg1 - this.method3477(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("ge.f(Ljava/lang/String;IIIII)V")
    public void method3488(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3434(arg3, arg4);
        field2972.setSeed((long) arg5);
        field2953 = 192 + (field2972.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field2972.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method3472(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("ge.c(II)V")
    public void method3434(int arg0, int arg1) {
        field2973 = -1;
        field2952 = -1;
        field2964 = arg1;
        field2969 = arg1;
        field2967 = arg0;
        field2968 = arg0;
        field2953 = 256;
        field2970 = 0;
        field2971 = 0;
    }

    @ObfuscatedName("ge.t(Ljava/lang/String;)V")
    public void method3435(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field2968 = class211.method591(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field2968 = field2967;
            } else if (arg0.startsWith("str=")) {
                field2973 = class211.method591(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field2973 = 8388608;
            } else if (arg0.equals("/str")) {
                field2973 = -1;
            } else if (arg0.startsWith("u=")) {
                field2952 = class211.method591(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field2952 = 0;
            } else if (arg0.equals("/u")) {
                field2952 = -1;
            } else if (arg0.startsWith("shad=")) {
                field2969 = class211.method591(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field2969 = 0;
            } else if (arg0.equals("/shad")) {
                field2969 = field2964;
            } else if (arg0.equals("br")) {
                this.method3434(field2967, field2964);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ge.i(Ljava/lang/String;I)V")
    public void method3436(String arg0, int arg1) {
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
            field2970 = (arg1 - this.method3477(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("ge.u(Ljava/lang/String;II)V")
    public void method3437(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2958;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class213.method2547(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class211.method3149(var9.substring(4));
                                        class75 var11 = Statics.field2961[var10];
                                        var11.method1565(arg1, this.field2958 + var4 - var11.field1337);
                                        arg1 += var11.field1338;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method3435(var9);
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
                        if (this.field2962 != null && var6 != -1) {
                            arg1 += this.field2962[(var6 << 8) + var8];
                        }
                        int var13 = this.field2954[var8];
                        int var14 = this.field2955[var8];
                        if (var8 == ' ') {
                            if (field2970 > 0) {
                                field2971 += field2970;
                                arg1 += field2971 >> 8;
                                field2971 &= 0xFF;
                            }
                        } else if (field2953 == 256) {
                            if (field2969 != -1) {
                                method3433(this.field2966[var8], this.field2956[var8] + arg1 + 1, this.field2957[var8] + var4 + 1, var13, var14, field2969);
                            }
                            this.method3505(this.field2966[var8], this.field2956[var8] + arg1, this.field2957[var8] + var4, var13, var14, field2968);
                        } else {
                            if (field2969 != -1) {
                                method3442(this.field2966[var8], this.field2956[var8] + arg1 + 1, this.field2957[var8] + var4 + 1, var13, var14, field2969, field2953);
                            }
                            this.method3463(this.field2966[var8], this.field2956[var8] + arg1, this.field2957[var8] + var4, var13, var14, field2968, field2953);
                        }
                        int var15 = this.field2963[var8];
                        if (field2973 != -1) {
                            method1509(arg1, (int) ((double) this.field2958 * 0.7D) + var4, var15, field2973);
                        }
                        if (field2952 != -1) {
                            method1509(arg1, this.field2958 + var4 + 1, var15, field2952);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ge.y(Ljava/lang/String;II[I[I)V")
    public void method3472(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2958;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class213.method2547(arg0.charAt(var10)) & 0xFF);
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
                                        int var16 = class211.method993(var15, 10, true);
                                        class75 var18 = Statics.field2961[var16];
                                        var18.method1565(arg1 + var13, this.field2958 + var6 - var18.field1337 + var14);
                                        arg1 += var18.field1338;
                                        var8 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method3435(var12);
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
                        if (this.field2962 != null && var8 != -1) {
                            arg1 += this.field2962[(var8 << 8) + var11];
                        }
                        int var20 = this.field2954[var11];
                        int var21 = this.field2955[var11];
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
                            if (field2970 > 0) {
                                field2971 += field2970;
                                arg1 += field2971 >> 8;
                                field2971 &= 0xFF;
                            }
                        } else if (field2953 == 256) {
                            if (field2969 != -1) {
                                method3433(this.field2966[var11], this.field2956[var11] + arg1 + 1 + var22, this.field2957[var11] + var6 + 1 + var23, var20, var21, field2969);
                            }
                            this.method3505(this.field2966[var11], this.field2956[var11] + arg1 + var22, this.field2957[var11] + var6 + var23, var20, var21, field2968);
                        } else {
                            if (field2969 != -1) {
                                method3442(this.field2966[var11], this.field2956[var11] + arg1 + 1 + var22, this.field2957[var11] + var6 + 1 + var23, var20, var21, field2969, field2953);
                            }
                            this.method3463(this.field2966[var11], this.field2956[var11] + arg1 + var22, this.field2957[var11] + var6 + var23, var20, var21, field2968, field2953);
                        }
                        int var24 = this.field2963[var11];
                        if (field2973 != -1) {
                            method1509(arg1, (int) ((double) this.field2958 * 0.7D) + var6, var24, field2973);
                        }
                        if (field2952 != -1) {
                            method1509(arg1, this.field2958 + var6, var24, field2952);
                        }
                        arg1 += var24;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ge.h([BIIIII)V")
    public static void method3433(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field1331 * arg2 + arg1;
        int var7 = Statics.field1331 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field1333) {
            int var10 = field1333 - arg2;
            arg4 -= var10;
            arg2 = field1333;
            var9 += arg3 * var10;
            var6 += Statics.field1331 * var10;
        }
        if (arg2 + arg4 > field1334) {
            arg4 -= arg2 + arg4 - field1334;
        }
        if (arg1 < field1332) {
            int var11 = field1332 - arg1;
            arg3 -= var11;
            arg1 = field1332;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field1330) {
            int var12 = arg1 + arg3 - field1330;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3441(Statics.field1335, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("ge.x([I[BIIIIIII)V")
    public static void method3441(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("ge.d([BIIIIII)V")
    public static void method3442(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field1331 * arg2 + arg1;
        int var8 = Statics.field1331 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1333) {
            int var11 = field1333 - arg2;
            arg4 -= var11;
            arg2 = field1333;
            var10 += arg3 * var11;
            var7 += Statics.field1331 * var11;
        }
        if (arg2 + arg4 > field1334) {
            arg4 -= arg2 + arg4 - field1334;
        }
        if (arg1 < field1332) {
            int var12 = field1332 - arg1;
            arg3 -= var12;
            arg1 = field1332;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field1330) {
            int var13 = arg1 + arg3 - field1330;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3462(Statics.field1335, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("ge.ac([I[BIIIIIIII)V")
    public static void method3462(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("ge.m([BIIIIII)V")
    public abstract void method3463(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("ge.o([BIIIII)V")
    public abstract void method3505(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
