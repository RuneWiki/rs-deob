package deob;

import java.util.Random;

@ObfuscatedName("ou")
public abstract class class383 extends class499 {

    @ObfuscatedName("ou.an")
    public byte[][] field4433 = new byte[256][];

    @ObfuscatedName("ou.aw")
    public int[] field4434;

    @ObfuscatedName("ou.ac")
    public int[] field4435;

    @ObfuscatedName("ou.au")
    public int[] field4446;

    @ObfuscatedName("ou.ab")
    public int[] field4443;

    @ObfuscatedName("ou.aq")
    public int[] field4438;

    @ObfuscatedName("ou.al")
    public int field4439 = 0;

    @ObfuscatedName("ou.at")
    public int field4440;

    @ObfuscatedName("ou.aa")
    public int field4441;

    @ObfuscatedName("ou.ao")
    public byte[] field4436;

    @ObfuscatedName("ou.ax")
    public static int field4452 = -1;

    @ObfuscatedName("ou.ai")
    public static int field4445 = -1;

    @ObfuscatedName("ou.ag")
    public static int field4444 = -1;

    @ObfuscatedName("ou.ah")
    public static int field4447 = -1;

    @ObfuscatedName("ou.av")
    public static int field4448 = 0;

    @ObfuscatedName("ou.ar")
    public static int field4449 = 0;

    @ObfuscatedName("ou.am")
    public static int field4437 = 256;

    @ObfuscatedName("ou.as")
    public static int field4432 = 0;

    @ObfuscatedName("ou.aj")
    public static int field4451 = 0;

    @ObfuscatedName("ou.ak")
    public static Random field4453 = new Random();

    @ObfuscatedName("ou.az")
    public static String[] field4454 = new String[100];

    public class383(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field4443 = arg1;
        this.field4438 = arg2;
        this.field4435 = arg3;
        this.field4446 = arg4;
        this.method6758(arg0);
        this.field4433 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field4438[var10] < var8 && this.field4446[var10] != 0) {
                var8 = this.field4438[var10];
            }
            if (this.field4446[var10] + this.field4438[var10] > var9) {
                var9 = this.field4446[var10] + this.field4438[var10];
            }
        }
        this.field4440 = this.field4439 - var8;
        this.field4441 = var9 - this.field4439;
    }

    public class383(byte[] arg0) {
        this.method6758(arg0);
    }

    @ObfuscatedName("ou.at([B)V")
    public void method6758(byte[] arg0) {
        this.field4434 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4434.length; var2++) {
                this.field4434[var2] = arg0[var2] & 0xFF;
            }
            this.field4439 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4434[var4] = arg0[var3++] & 0xFF;
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
        this.field4436 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4436[(var17 << 8) + var18] = (byte) method6847(var9, var13, var6, this.field4434, var5, var17, var18);
                    }
                }
            }
        }
        this.field4439 = var5[32] + var6[32];
    }

    @ObfuscatedName("ou.aa([[B[[B[I[I[III)I")
    public static int method6847(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("ou.ay(C)I")
    public int method6760(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4434[class370.method2543(arg0) & 0xFF];
    }

    @ObfuscatedName("ou.ao(Ljava/lang/String;)I")
    public int method6761(String arg0) {
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
                                    int var8 = class372.method5157(var7.substring(4));
                                    var4 += Statics.field4442[var8].field5079;
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
                    var4 += this.field4434[(char) (class370.method2543(var6) & 0xFF)];
                    if (this.field4436 != null && var3 != -1) {
                        var4 += this.field4436[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("ou.ax(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method6801(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method6760('<');
                        if (this.field4436 != null && var11 != -1) {
                            var4 += this.field4436[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method6760('>');
                        if (this.field4436 != null && var11 != -1) {
                            var4 += this.field4436[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class372.method5157(var16.substring(4));
                            var4 += Statics.field4442[var17].field5079;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method6760(var15);
                        if (this.field4436 != null && var11 != -1) {
                            var4 += this.field4436[(var11 << 8) + var15];
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

    @ObfuscatedName("ou.ai(Ljava/lang/String;I)I")
    public int method6848(String arg0, int arg1) {
        int var3 = this.method6801(arg0, new int[] { arg1 }, field4454);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method6761(field4454[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("ou.ag(Ljava/lang/String;I)I")
    public int method6808(String arg0, int arg1) {
        return this.method6801(arg0, new int[] { arg1 }, field4454);
    }

    @ObfuscatedName("ou.ah(Ljava/lang/String;)Ljava/lang/String;")
    public static String method6854(String arg0) {
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

    @ObfuscatedName("ou.av(IILjava/lang/String;II)Lqu;")
    public class421 method6766(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class421(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method6761(arg2) / 2;
        int var7 = var6 + this.method6761(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4440;
        int var9 = this.method6761(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4441 + this.field4440;
        return new class421(var7, var8, var9, var10);
    }

    @ObfuscatedName("ou.ar(Ljava/lang/String;IIII)V")
    public void method6837(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6763(arg3, arg4);
            this.method6781(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ou.am(Ljava/lang/String;IIIII)V")
    public void method6757(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method6763(arg3, arg4);
            field4437 = arg5;
            this.method6781(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ou.as(Ljava/lang/String;IIII)V")
    public void method6769(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6763(arg3, arg4);
            this.method6781(arg0, arg1 - this.method6761(arg0), arg2);
        }
    }

    @ObfuscatedName("ou.aj(Ljava/lang/String;IIII)V")
    public void method6770(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6763(arg3, arg4);
            this.method6781(arg0, arg1 - this.method6761(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("ou.ak(Ljava/lang/String;IIIIIIIII)I")
    public int method6771(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method6772(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @ObfuscatedName("ou.az(Ljava/lang/String;IIIIIIIIII)I")
    public int method6772(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        if (arg7 == 255) {
            arg7 = 256;
        }
        this.method6763(arg5, arg6);
        field4437 = arg7;
        if (arg10 == 0) {
            arg10 = this.field4439;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field4441 + this.field4440 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method6801(arg0, var12, field4454);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field4440 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field4440 - this.field4441 - (var13 - 1) * arg10) / 2 + this.field4440 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field4441 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field4440 - this.field4441 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field4440 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method6781(field4454[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method6781(field4454[var16], arg1 + (arg3 - this.method6761(field4454[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method6781(field4454[var16], arg1 + arg3 - this.method6761(field4454[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method6781(field4454[var16], arg1, var14);
            } else {
                this.method6805(field4454[var16], arg3);
                this.method6781(field4454[var16], arg1, var14);
                field4432 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @ObfuscatedName("ou.ad(Loa;IIIII)Lrg;")
    public class462 method6773(class384 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0.method6863()) {
            this.method6763(arg3, arg4);
            int var7 = arg2 - this.field4439;
            for (int var8 = 0; var8 < arg0.method6864(); var8++) {
                class382 var9 = arg0.method6865(var8);
                if (arg5 != -1 && var9.field4431 > arg5) {
                    return new class462(var9.field4428, var9.field4431);
                }
                char var10 = var9.field4429;
                if (var10 != '\n') {
                    if (arg0.method6866(var8)) {
                        var10 = '*';
                    }
                    if (var10 != '\t') {
                        if (var10 == 160) {
                            var10 = ' ';
                        }
                        int var11 = var9.field4428 + arg1;
                        int var12 = var9.field4431 + var7;
                        int var13 = this.field4435[var10];
                        int var14 = this.field4446[var10];
                        if (field4447 != -1) {
                            this.method6610(this.field4433[var10], this.field4443[var10] + var11 + 1, this.field4438[var10] + var12 + 1, var13, var14, field4447);
                        }
                        this.method6610(this.field4433[var10], this.field4443[var10] + var11, this.field4438[var10] + var12, var13, var14, field4449);
                    }
                }
            }
        }
        return arg0.method6862();
    }

    @ObfuscatedName("ou.ae(Ljava/lang/String;IIIII)V")
    public void method6774(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6763(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method6788(arg0, arg1 - this.method6761(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("ou.ap(Ljava/lang/String;IIIII)V")
    public void method6775(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6763(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method6788(arg0, arg1 - this.method6761(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("ou.by(Ljava/lang/String;IIIIII)V")
    public void method6776(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method6763(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method6788(arg0, arg1 - this.method6761(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("ou.bb(Ljava/lang/String;IIIII)V")
    public void method6804(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6763(arg3, arg4);
        field4453.setSeed((long) arg5);
        field4437 = 192 + (field4453.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4453.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method6788(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("ou.bi(II)V")
    public void method6763(int arg0, int arg1) {
        field4452 = -1;
        field4445 = -1;
        field4444 = arg1;
        field4447 = arg1;
        field4448 = arg0;
        field4449 = arg0;
        field4437 = 256;
        field4432 = 0;
        field4451 = 0;
    }

    @ObfuscatedName("ou.be(Ljava/lang/String;)V")
    public void method6846(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class372.method2021(var2, 16, true);
                field4449 = var3;
            } else if (arg0.equals("/col")) {
                field4449 = field4448;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class372.method2021(var4, 16, true);
                field4452 = var5;
            } else if (arg0.equals("str")) {
                field4452 = 8388608;
            } else if (arg0.equals("/str")) {
                field4452 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class372.method2021(var6, 16, true);
                field4445 = var7;
            } else if (arg0.equals("u")) {
                field4445 = 0;
            } else if (arg0.equals("/u")) {
                field4445 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class372.method2021(var8, 16, true);
                field4447 = var9;
            } else if (arg0.equals("shad")) {
                field4447 = 0;
            } else if (arg0.equals("/shad")) {
                field4447 = field4444;
            } else if (arg0.equals("br")) {
                this.method6763(field4448, field4444);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ou.bk(Ljava/lang/String;I)V")
    public void method6805(String arg0, int arg1) {
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
            field4432 = (arg1 - this.method6761(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("ou.bx(Ljava/lang/String;II)V")
    public void method6781(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4439;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class370.method2543(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class372.method5157(var9.substring(4));
                                        class502 var11 = Statics.field4442[var10];
                                        var11.method8656(arg1, this.field4439 + var4 - var11.field5085);
                                        arg1 += var11.field5079;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method6846(var9);
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
                        if (this.field4436 != null && var6 != -1) {
                            arg1 += this.field4436[(var6 << 8) + var8];
                        }
                        int var13 = this.field4435[var8];
                        int var14 = this.field4446[var8];
                        if (var8 == ' ') {
                            if (field4432 > 0) {
                                field4451 += field4432;
                                arg1 += field4451 >> 8;
                                field4451 &= 0xFF;
                            }
                        } else if (field4437 == 256) {
                            if (field4447 != -1) {
                                method6784(this.field4433[var8], this.field4443[var8] + arg1 + 1, this.field4438[var8] + var4 + 1, var13, var14, field4447);
                            }
                            this.method6610(this.field4433[var8], this.field4443[var8] + arg1, this.field4438[var8] + var4, var13, var14, field4449);
                        } else {
                            if (field4447 != -1) {
                                method6786(this.field4433[var8], this.field4443[var8] + arg1 + 1, this.field4438[var8] + var4 + 1, var13, var14, field4447, field4437);
                            }
                            this.method6609(this.field4433[var8], this.field4443[var8] + arg1, this.field4438[var8] + var4, var13, var14, field4449, field4437);
                        }
                        int var15 = this.field4434[var8];
                        if (field4452 != -1) {
                            method8586(arg1, (int) ((double) this.field4439 * 0.7D) + var4, var15, field4452);
                        }
                        if (field4445 != -1) {
                            method8586(arg1, this.field4439 + var4 + 1, var15, field4445);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ou.bo(Ljava/lang/String;II[I[I)V")
    public void method6788(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field4439;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class370.method2543(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class372.method5157(var12.substring(4));
                                        class502 var16 = Statics.field4442[var15];
                                        var16.method8656(arg1 + var13, this.field4439 + var6 - var16.field5085 + var14);
                                        arg1 += var16.field5079;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method6846(var12);
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
                        if (this.field4436 != null && var8 != -1) {
                            arg1 += this.field4436[(var8 << 8) + var11];
                        }
                        int var18 = this.field4435[var11];
                        int var19 = this.field4446[var11];
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
                            if (field4432 > 0) {
                                field4451 += field4432;
                                arg1 += field4451 >> 8;
                                field4451 &= 0xFF;
                            }
                        } else if (field4437 == 256) {
                            if (field4447 != -1) {
                                method6784(this.field4433[var11], this.field4443[var11] + arg1 + 1 + var20, this.field4438[var11] + var6 + 1 + var21, var18, var19, field4447);
                            }
                            this.method6610(this.field4433[var11], this.field4443[var11] + arg1 + var20, this.field4438[var11] + var6 + var21, var18, var19, field4449);
                        } else {
                            if (field4447 != -1) {
                                method6786(this.field4433[var11], this.field4443[var11] + arg1 + 1 + var20, this.field4438[var11] + var6 + 1 + var21, var18, var19, field4447, field4437);
                            }
                            this.method6609(this.field4433[var11], this.field4443[var11] + arg1 + var20, this.field4438[var11] + var6 + var21, var18, var19, field4449, field4437);
                        }
                        int var22 = this.field4434[var11];
                        if (field4452 != -1) {
                            method8586(arg1, (int) ((double) this.field4439 * 0.7D) + var6, var22, field4452);
                        }
                        if (field4445 != -1) {
                            method8586(arg1, this.field4439 + var6, var22, field4445);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ou.bz([BIIIII)V")
    public static void method6784(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field5061 * arg2 + arg1;
        int var7 = Statics.field5061 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field5065) {
            int var10 = field5065 - arg2;
            arg4 -= var10;
            arg2 = field5065;
            var9 += arg3 * var10;
            var6 += Statics.field5061 * var10;
        }
        if (arg2 + arg4 > field5066) {
            arg4 -= arg2 + arg4 - field5066;
        }
        if (arg1 < field5064) {
            int var11 = field5064 - arg1;
            arg3 -= var11;
            arg1 = field5064;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field5068) {
            int var12 = arg1 + arg3 - field5068;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6785(Statics.field5067, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("ou.bm([I[BIIIIIII)V")
    public static void method6785(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("ou.bd([BIIIIII)V")
    public static void method6786(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field5061 * arg2 + arg1;
        int var8 = Statics.field5061 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field5065) {
            int var11 = field5065 - arg2;
            arg4 -= var11;
            arg2 = field5065;
            var10 += arg3 * var11;
            var7 += Statics.field5061 * var11;
        }
        if (arg2 + arg4 > field5066) {
            arg4 -= arg2 + arg4 - field5066;
        }
        if (arg1 < field5064) {
            int var12 = field5064 - arg1;
            arg3 -= var12;
            arg1 = field5064;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field5068) {
            int var13 = arg1 + arg3 - field5068;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6787(Statics.field5067, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("ou.bt([I[BIIIIIIII)V")
    public static void method6787(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("ou.af([BIIIII)V")
    public abstract void method6610(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("ou.an([BIIIIII)V")
    public abstract void method6609(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
