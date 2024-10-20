package deob;

import java.util.Random;

@ObfuscatedName("nt")
public abstract class class369 extends class473 {

    @ObfuscatedName("nt.a")
    public byte[][] field4366 = new byte[256][];

    @ObfuscatedName("nt.f")
    public int[] field4350;

    @ObfuscatedName("nt.c")
    public int[] field4352;

    @ObfuscatedName("nt.x")
    public int[] field4351;

    @ObfuscatedName("nt.h")
    public int[] field4353;

    @ObfuscatedName("nt.j")
    public int[] field4354;

    @ObfuscatedName("nt.y")
    public int field4355 = 0;

    @ObfuscatedName("nt.d")
    public int field4356;

    @ObfuscatedName("nt.n")
    public int field4357;

    @ObfuscatedName("nt.l")
    public byte[] field4361;

    @ObfuscatedName("nt.s")
    public static int field4360 = -1;

    @ObfuscatedName("nt.p")
    public static int field4363 = -1;

    @ObfuscatedName("nt.b")
    public static int field4365 = -1;

    @ObfuscatedName("nt.o")
    public static int field4362 = -1;

    @ObfuscatedName("nt.u")
    public static int field4364 = 0;

    @ObfuscatedName("nt.z")
    public static int field4368 = 0;

    @ObfuscatedName("nt.t")
    public static int field4359 = 256;

    @ObfuscatedName("nt.w")
    public static int field4367 = 0;

    @ObfuscatedName("nt.m")
    public static int field4349 = 0;

    @ObfuscatedName("nt.q")
    public static Random field4369 = new Random();

    @ObfuscatedName("nt.i")
    public static String[] field4370 = new String[100];

    public class369(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field4353 = arg1;
        this.field4354 = arg2;
        this.field4352 = arg3;
        this.field4351 = arg4;
        this.method6441(arg0);
        this.field4366 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field4354[var10] < var8 && this.field4351[var10] != 0) {
                var8 = this.field4354[var10];
            }
            if (this.field4354[var10] + this.field4351[var10] > var9) {
                var9 = this.field4354[var10] + this.field4351[var10];
            }
        }
        this.field4356 = this.field4355 - var8;
        this.field4357 = var9 - this.field4355;
    }

    public class369(byte[] arg0) {
        this.method6441(arg0);
    }

    @ObfuscatedName("nt.y([B)V")
    public void method6441(byte[] arg0) {
        this.field4350 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4350.length; var2++) {
                this.field4350[var2] = arg0[var2] & 0xFF;
            }
            this.field4355 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4350[var4] = arg0[var3++] & 0xFF;
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
        this.field4361 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4361[(var17 << 8) + var18] = (byte) method6470(var9, var13, var6, this.field4350, var5, var17, var18);
                    }
                }
            }
        }
        this.field4355 = var5[32] + var6[32];
    }

    @ObfuscatedName("nt.d([[B[[B[I[I[III)I")
    public static int method6470(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("nt.n(C)I")
    public int method6480(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4350[class356.method2561(arg0) & 0xFF];
    }

    @ObfuscatedName("nt.r(Ljava/lang/String;)I")
    public int method6447(String arg0) {
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
                                    int var8 = class358.method2449(var7.substring(4));
                                    var4 += Statics.field4358[var8].field4950;
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
                    var4 += this.field4350[(char) (class356.method2561(var6) & 0xFF)];
                    if (this.field4361 != null && var3 != -1) {
                        var4 += this.field4361[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("nt.l(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method6462(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method6480('<');
                        if (this.field4361 != null && var11 != -1) {
                            var4 += this.field4361[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method6480('>');
                        if (this.field4361 != null && var11 != -1) {
                            var4 += this.field4361[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class358.method2449(var16.substring(4));
                            var4 += Statics.field4358[var17].field4950;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method6480(var15);
                        if (this.field4361 != null && var11 != -1) {
                            var4 += this.field4361[(var11 << 8) + var15];
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

    @ObfuscatedName("nt.s(Ljava/lang/String;I)I")
    public int method6417(String arg0, int arg1) {
        int var3 = this.method6462(arg0, new int[] { arg1 }, field4370);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method6447(field4370[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("nt.p(Ljava/lang/String;I)I")
    public int method6423(String arg0, int arg1) {
        return this.method6462(arg0, new int[] { arg1 }, field4370);
    }

    @ObfuscatedName("nt.b(Ljava/lang/String;)Ljava/lang/String;")
    public static String method6418(String arg0) {
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

    @ObfuscatedName("nt.o(IILjava/lang/String;II)Loq;")
    public class404 method6419(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class404(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method6447(arg2) / 2;
        int var7 = var6 + this.method6447(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4356;
        int var9 = this.method6447(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4357 + this.field4356;
        return new class404(var7, var8, var9, var10);
    }

    @ObfuscatedName("nt.u(Ljava/lang/String;IIII)V")
    public void method6429(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6430(arg3, arg4);
            this.method6433(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("nt.z(Ljava/lang/String;IIIII)V")
    public void method6421(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method6430(arg3, arg4);
            field4359 = arg5;
            this.method6433(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("nt.t(Ljava/lang/String;IIII)V")
    public void method6422(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6430(arg3, arg4);
            this.method6433(arg0, arg1 - this.method6447(arg0), arg2);
        }
    }

    @ObfuscatedName("nt.w(Ljava/lang/String;IIII)V")
    public void method6507(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6430(arg3, arg4);
            this.method6433(arg0, arg1 - this.method6447(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("nt.m(Ljava/lang/String;IIIIIIIII)I")
    public int method6424(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method6430(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field4355;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field4357 + this.field4356 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method6462(arg0, var11, field4370);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field4356 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field4356 - this.field4357 - (var12 - 1) * arg9) / 2 + this.field4356 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field4357 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field4356 - this.field4357 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field4356 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method6433(field4370[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method6433(field4370[var15], arg1 + (arg3 - this.method6447(field4370[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method6433(field4370[var15], arg1 + arg3 - this.method6447(field4370[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method6433(field4370[var15], arg1, var13);
            } else {
                this.method6432(field4370[var15], arg3);
                this.method6433(field4370[var15], arg1, var13);
                field4367 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("nt.q(Lnx;IIIII)Lpv;")
    public class438 method6425(class370 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0.method6511()) {
            this.method6430(arg3, arg4);
            int var7 = arg2 - this.field4355;
            for (int var8 = 0; var8 < arg0.method6512(); var8++) {
                class368 var9 = arg0.method6528(var8);
                if (arg5 != -1 && var9.field4344 > arg5) {
                    return new class438(var9.field4342, var9.field4344);
                }
                char var10 = var9.field4348;
                if (var10 != '\n') {
                    if (arg0.method6510(var8)) {
                        var10 = '*';
                    }
                    if (var10 != '\t') {
                        if (var10 == 160) {
                            var10 = ' ';
                        }
                        int var11 = var9.field4342 + arg1;
                        int var12 = var9.field4344 + var7;
                        int var13 = this.field4352[var10];
                        int var14 = this.field4351[var10];
                        if (field4362 != -1) {
                            this.method6295(this.field4366[var10], this.field4353[var10] + var11 + 1, this.field4354[var10] + var12 + 1, var13, var14, field4362);
                        }
                        this.method6295(this.field4366[var10], this.field4353[var10] + var11, this.field4354[var10] + var12, var13, var14, field4368);
                    }
                }
            }
        }
        return arg0.method6515();
    }

    @ObfuscatedName("nt.i(Ljava/lang/String;IIIII)V")
    public void method6426(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6430(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method6412(arg0, arg1 - this.method6447(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("nt.e(Ljava/lang/String;IIIII)V")
    public void method6427(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6430(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method6412(arg0, arg1 - this.method6447(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("nt.g(Ljava/lang/String;IIIIII)V")
    public void method6428(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method6430(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method6412(arg0, arg1 - this.method6447(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("nt.k(Ljava/lang/String;IIIII)V")
    public void method6415(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6430(arg3, arg4);
        field4369.setSeed((long) arg5);
        field4359 = 192 + (field4369.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4369.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method6412(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("nt.v(II)V")
    public void method6430(int arg0, int arg1) {
        field4360 = -1;
        field4363 = -1;
        field4365 = arg1;
        field4362 = arg1;
        field4364 = arg0;
        field4368 = arg0;
        field4359 = 256;
        field4367 = 0;
        field4349 = 0;
    }

    @ObfuscatedName("nt.aj(Ljava/lang/String;)V")
    public void method6431(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class358.method281(var2, 16, true);
                field4368 = var3;
            } else if (arg0.equals("/col")) {
                field4368 = field4364;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class358.method281(var4, 16, true);
                field4360 = var5;
            } else if (arg0.equals("str")) {
                field4360 = 8388608;
            } else if (arg0.equals("/str")) {
                field4360 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class358.method281(var6, 16, true);
                field4363 = var7;
            } else if (arg0.equals("u")) {
                field4363 = 0;
            } else if (arg0.equals("/u")) {
                field4363 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class358.method281(var8, 16, true);
                field4362 = var9;
            } else if (arg0.equals("shad")) {
                field4362 = 0;
            } else if (arg0.equals("/shad")) {
                field4362 = field4365;
            } else if (arg0.equals("br")) {
                this.method6430(field4364, field4365);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("nt.an(Ljava/lang/String;I)V")
    public void method6432(String arg0, int arg1) {
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
            field4367 = (arg1 - this.method6447(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("nt.ah(Ljava/lang/String;II)V")
    public void method6433(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4355;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class356.method2561(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class358.method2449(var9.substring(4));
                                        class476 var11 = Statics.field4358[var10];
                                        var11.method8102(arg1, this.field4355 + var4 - var11.field4952);
                                        arg1 += var11.field4950;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method6431(var9);
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
                        if (this.field4361 != null && var6 != -1) {
                            arg1 += this.field4361[(var6 << 8) + var8];
                        }
                        int var13 = this.field4352[var8];
                        int var14 = this.field4351[var8];
                        if (var8 == ' ') {
                            if (field4367 > 0) {
                                field4349 += field4367;
                                arg1 += field4349 >> 8;
                                field4349 &= 0xFF;
                            }
                        } else if (field4359 == 256) {
                            if (field4362 != -1) {
                                method6437(this.field4366[var8], this.field4353[var8] + arg1 + 1, this.field4354[var8] + var4 + 1, var13, var14, field4362);
                            }
                            this.method6295(this.field4366[var8], this.field4353[var8] + arg1, this.field4354[var8] + var4, var13, var14, field4368);
                        } else {
                            if (field4362 != -1) {
                                method6439(this.field4366[var8], this.field4353[var8] + arg1 + 1, this.field4354[var8] + var4 + 1, var13, var14, field4362, field4359);
                            }
                            this.method6297(this.field4366[var8], this.field4353[var8] + arg1, this.field4354[var8] + var4, var13, var14, field4368, field4359);
                        }
                        int var15 = this.field4350[var8];
                        if (field4360 != -1) {
                            method8028(arg1, (int) ((double) this.field4355 * 0.7D) + var4, var15, field4360);
                        }
                        if (field4363 != -1) {
                            method8028(arg1, this.field4355 + var4 + 1, var15, field4363);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("nt.ao(Ljava/lang/String;II[I[I)V")
    public void method6412(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field4355;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class356.method2561(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class358.method2449(var12.substring(4));
                                        class476 var16 = Statics.field4358[var15];
                                        var16.method8102(arg1 + var13, this.field4355 + var6 - var16.field4952 + var14);
                                        arg1 += var16.field4950;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method6431(var12);
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
                        if (this.field4361 != null && var8 != -1) {
                            arg1 += this.field4361[(var8 << 8) + var11];
                        }
                        int var18 = this.field4352[var11];
                        int var19 = this.field4351[var11];
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
                            if (field4367 > 0) {
                                field4349 += field4367;
                                arg1 += field4349 >> 8;
                                field4349 &= 0xFF;
                            }
                        } else if (field4359 == 256) {
                            if (field4362 != -1) {
                                method6437(this.field4366[var11], this.field4353[var11] + arg1 + 1 + var20, this.field4354[var11] + var6 + 1 + var21, var18, var19, field4362);
                            }
                            this.method6295(this.field4366[var11], this.field4353[var11] + arg1 + var20, this.field4354[var11] + var6 + var21, var18, var19, field4368);
                        } else {
                            if (field4362 != -1) {
                                method6439(this.field4366[var11], this.field4353[var11] + arg1 + 1 + var20, this.field4354[var11] + var6 + 1 + var21, var18, var19, field4362, field4359);
                            }
                            this.method6297(this.field4366[var11], this.field4353[var11] + arg1 + var20, this.field4354[var11] + var6 + var21, var18, var19, field4368, field4359);
                        }
                        int var22 = this.field4350[var11];
                        if (field4360 != -1) {
                            method8028(arg1, (int) ((double) this.field4355 * 0.7D) + var6, var22, field4360);
                        }
                        if (field4363 != -1) {
                            method8028(arg1, this.field4355 + var6, var22, field4363);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("nt.ac([BIIIII)V")
    public static void method6437(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field4935 * arg2 + arg1;
        int var7 = Statics.field4935 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field4937) {
            int var10 = field4937 - arg2;
            arg4 -= var10;
            arg2 = field4937;
            var9 += arg3 * var10;
            var6 += Statics.field4935 * var10;
        }
        if (arg2 + arg4 > field4940) {
            arg4 -= arg2 + arg4 - field4940;
        }
        if (arg1 < field4939) {
            int var11 = field4939 - arg1;
            arg3 -= var11;
            arg1 = field4939;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field4938) {
            int var12 = arg1 + arg3 - field4938;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6438(Statics.field4934, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("nt.af([I[BIIIIIII)V")
    public static void method6438(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("nt.ad([BIIIIII)V")
    public static void method6439(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field4935 * arg2 + arg1;
        int var8 = Statics.field4935 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4937) {
            int var11 = field4937 - arg2;
            arg4 -= var11;
            arg2 = field4937;
            var10 += arg3 * var11;
            var7 += Statics.field4935 * var11;
        }
        if (arg2 + arg4 > field4940) {
            arg4 -= arg2 + arg4 - field4940;
        }
        if (arg1 < field4939) {
            int var12 = field4939 - arg1;
            arg3 -= var12;
            arg1 = field4939;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4938) {
            int var13 = arg1 + arg3 - field4938;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6440(Statics.field4934, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("nt.av([I[BIIIIIIII)V")
    public static void method6440(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("nt.a([BIIIII)V")
    public abstract void method6295(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("nt.f([BIIIIII)V")
    public abstract void method6297(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
