package deob;

import java.util.Random;

@ObfuscatedName("pk")
public abstract class class413 extends class540 {

    @ObfuscatedName("pk.al")
    public byte[][] field4542 = new byte[256][];

    @ObfuscatedName("pk.ak")
    public int[] field4533;

    @ObfuscatedName("pk.ax")
    public int[] field4540;

    @ObfuscatedName("pk.ao")
    public int[] field4538;

    @ObfuscatedName("pk.ah")
    public int[] field4534;

    @ObfuscatedName("pk.ar")
    public int[] field4535;

    @ObfuscatedName("pk.ab")
    public int field4536 = 0;

    @ObfuscatedName("pk.am")
    public int field4537;

    @ObfuscatedName("pk.av")
    public int field4543;

    @ObfuscatedName("pk.aa")
    public byte[] field4531;

    @ObfuscatedName("pk.ap")
    public static int field4541 = -1;

    @ObfuscatedName("pk.ay")
    public static int field4545 = -1;

    @ObfuscatedName("pk.as")
    public static int field4547 = -1;

    @ObfuscatedName("pk.aj")
    public static int field4544 = -1;

    @ObfuscatedName("pk.an")
    public static int field4530 = 0;

    @ObfuscatedName("pk.au")
    public static int field4546 = 0;

    @ObfuscatedName("pk.ai")
    public static int field4529 = 256;

    @ObfuscatedName("pk.ae")
    public static int field4548 = 0;

    @ObfuscatedName("pk.aw")
    public static int field4532 = 0;

    @ObfuscatedName("pk.aq")
    public static Random field4550 = new Random();

    @ObfuscatedName("pk.az")
    public static String[] field4551 = new String[100];

    public class413(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field4534 = arg1;
        this.field4535 = arg2;
        this.field4540 = arg3;
        this.field4538 = arg4;
        this.method7027(arg0);
        this.field4542 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field4535[var10] < var8 && this.field4538[var10] != 0) {
                var8 = this.field4535[var10];
            }
            if (this.field4538[var10] + this.field4535[var10] > var9) {
                var9 = this.field4538[var10] + this.field4535[var10];
            }
        }
        this.field4537 = this.field4536 - var8;
        this.field4543 = var9 - this.field4536;
    }

    public class413(byte[] arg0) {
        this.method7027(arg0);
    }

    @ObfuscatedName("pk.ab([B)V")
    public void method7027(byte[] arg0) {
        this.field4533 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4533.length; var2++) {
                this.field4533[var2] = arg0[var2] & 0xFF;
            }
            this.field4536 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4533[var4] = arg0[var3++] & 0xFF;
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
        this.field4531 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4531[(var17 << 8) + var18] = (byte) method6974(var9, var13, var6, this.field4533, var5, var17, var18);
                    }
                }
            }
        }
        this.field4536 = var5[32] + var6[32];
    }

    @ObfuscatedName("pk.am([[B[[B[I[I[III)I")
    public static int method6974(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("pk.av(C)I")
    public int method6947(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4533[class400.method2339(arg0) & 0xFF];
    }

    @ObfuscatedName("pk.ag(Ljava/lang/String;)I")
    public int method6948(String arg0) {
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
                                    int var8 = class402.method677(var7.substring(4));
                                    var4 += Statics.field4539[var8].field5232;
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
                    var4 += this.field4533[(char) (class400.method2339(var6) & 0xFF)];
                    if (this.field4531 != null && var3 != -1) {
                        var4 += this.field4531[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("pk.aa(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method6949(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method6947('<');
                        if (this.field4531 != null && var11 != -1) {
                            var4 += this.field4531[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method6947('>');
                        if (this.field4531 != null && var11 != -1) {
                            var4 += this.field4531[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class402.method677(var16.substring(4));
                            var4 += Statics.field4539[var17].field5232;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method6947(var15);
                        if (this.field4531 != null && var11 != -1) {
                            var4 += this.field4531[(var11 << 8) + var15];
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

    @ObfuscatedName("pk.ap(Ljava/lang/String;I)I")
    public int method6950(String arg0, int arg1) {
        int var3 = this.method6949(arg0, new int[] { arg1 }, field4551);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method6948(field4551[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("pk.ay(Ljava/lang/String;I)I")
    public int method6986(String arg0, int arg1) {
        return this.method6949(arg0, new int[] { arg1 }, field4551);
    }

    @ObfuscatedName("pk.as(Ljava/lang/String;)Ljava/lang/String;")
    public static String method6952(String arg0) {
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

    @ObfuscatedName("pk.aj(IILjava/lang/String;II)Lrx;")
    public class461 method6970(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class461(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method6948(arg2) / 2;
        int var7 = var6 + this.method6948(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4537;
        int var9 = this.method6948(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4543 + this.field4537;
        return new class461(var7, var8, var9, var10);
    }

    @ObfuscatedName("pk.an(Ljava/lang/String;IIII)V")
    public void method6954(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6999(arg3, arg4);
            this.method6943(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("pk.au(Ljava/lang/String;IIIII)V")
    public void method6955(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method6999(arg3, arg4);
            field4529 = arg5;
            this.method6943(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("pk.ai(Ljava/lang/String;IIII)V")
    public void method6991(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6999(arg3, arg4);
            this.method6943(arg0, arg1 - this.method6948(arg0), arg2);
        }
    }

    @ObfuscatedName("pk.ae(Ljava/lang/String;IIII)V")
    public void method6963(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6999(arg3, arg4);
            this.method6943(arg0, arg1 - this.method6948(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("pk.aw(Ljava/lang/String;IIIIIIIII)I")
    public int method6958(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method6959(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @ObfuscatedName("pk.aq(Ljava/lang/String;IIIIIIIIII)I")
    public int method6959(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        if (arg7 == 255) {
            arg7 = 256;
        }
        this.method6999(arg5, arg6);
        field4529 = arg7;
        if (arg10 == 0) {
            arg10 = this.field4536;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field4543 + this.field4537 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method6949(arg0, var12, field4551);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field4537 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field4537 - this.field4543 - (var13 - 1) * arg10) / 2 + this.field4537 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field4543 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field4537 - this.field4543 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field4537 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method6943(field4551[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method6943(field4551[var16], arg1 + (arg3 - this.method6948(field4551[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method6943(field4551[var16], arg1 + arg3 - this.method6948(field4551[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method6943(field4551[var16], arg1, var14);
            } else {
                this.method6969(field4551[var16], arg3);
                this.method6943(field4551[var16], arg1, var14);
                field4548 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @ObfuscatedName("pk.az(Lpr;IIIII)Ltw;")
    public class501 method7029(class414 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0.method7034()) {
            this.method6999(arg3, arg4);
            int var7 = arg2 - this.field4536;
            for (int var8 = 0; var8 < arg0.method7036(); var8++) {
                class412 var9 = arg0.method7039(var8);
                if (arg5 != -1 && var9.field4526 > arg5) {
                    return new class501(var9.field4525, var9.field4526);
                }
                char var10 = var9.field4524;
                if (var10 != '\n') {
                    if (arg0.method7033(var8)) {
                        var10 = '*';
                    }
                    if (var10 != '\t') {
                        if (var10 == 160) {
                            var10 = ' ';
                        }
                        int var11 = var9.field4525 + arg1;
                        int var12 = var9.field4526 + var7;
                        int var13 = this.field4540[var10];
                        int var14 = this.field4538[var10];
                        if (field4544 != -1) {
                            this.method6790(this.field4542[var10], this.field4534[var10] + var11 + 1, this.field4535[var10] + var12 + 1, var13, var14, field4544);
                        }
                        this.method6790(this.field4542[var10], this.field4534[var10] + var11, this.field4535[var10] + var12, var13, var14, field4546);
                    }
                }
            }
        }
        return arg0.method7038();
    }

    @ObfuscatedName("pk.at(Ljava/lang/String;IIIII[I)V")
    public void method6956(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg0 == null) {
            return;
        }
        this.method6999(arg3, arg4);
        int[] var8 = null;
        if (arg6 != null) {
            var8 = this.method6965(arg6, arg0.length());
        }
        int[] var9 = new int[arg0.length()];
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method7006(arg0, arg1 - this.method6948(arg0) / 2, arg2, var8, (int[]) null, var9);
    }

    @ObfuscatedName("pk.af(Ljava/lang/String;IIIII[I)V")
    public void method6961(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg0 == null) {
            return;
        }
        this.method6999(arg3, arg4);
        int[] var8 = null;
        if (arg6 != null) {
            var8 = this.method6965(arg6, arg0.length());
        }
        int[] var9 = new int[arg0.length()];
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method7006(arg0, arg1 - this.method6948(arg0) / 2, arg2, var8, var9, var10);
    }

    @ObfuscatedName("pk.ad(Ljava/lang/String;IIIIII[I)V")
    public void method6962(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        if (arg0 == null) {
            return;
        }
        this.method6999(arg3, arg4);
        int[] var9 = null;
        if (arg7 != null) {
            var9 = this.method6965(arg7, arg0.length());
        }
        double var10 = 7.0D - (double) arg6 / 8.0D;
        if (var10 < 0.0D) {
            var10 = 0.0D;
        }
        int[] var12 = new int[arg0.length()];
        for (int var13 = 0; var13 < arg0.length(); var13++) {
            var12[var13] = (int) (Math.sin((double) arg5 / 1.0D + (double) var13 / 1.5D) * var10);
        }
        this.method7006(arg0, arg1 - this.method6948(arg0) / 2, arg2, var9, (int[]) null, var12);
    }

    @ObfuscatedName("pk.bn(Ljava/lang/String;IIII[I)V")
    public void method6960(String arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6999(arg3, arg4);
        int[] var7 = null;
        if (arg5 != null) {
            var7 = this.method6965(arg5, arg0.length());
        }
        this.method7006(arg0, arg1 - this.method6948(arg0) / 2, arg2, var7, (int[]) null, (int[]) null);
    }

    @ObfuscatedName("pk.bk(Ljava/lang/String;IIII[I)V")
    public void method6984(String arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6999(arg3, arg4);
        int[] var7 = null;
        if (arg5 != null) {
            var7 = this.method6965(arg5, arg0.length());
        }
        this.method7006(arg0, arg1, arg2, var7, (int[]) null, (int[]) null);
    }

    @ObfuscatedName("pk.by([II)[I")
    public int[] method6965(int[] arg0, int arg1) {
        if (arg1 == 0) {
            return null;
        }
        int[] var3 = new int[arg1];
        float var4 = (float) arg0.length / (float) arg1;
        for (int var5 = 0; var5 < arg1; var5++) {
            var3[var5] = arg0[(int) ((float) var5 * var4)];
        }
        return var3;
    }

    @ObfuscatedName("pk.bd(Ljava/lang/String;IIIII)V")
    public void method6966(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6999(arg3, arg4);
        field4550.setSeed((long) arg5);
        field4529 = 192 + (field4550.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4550.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method7006(arg0, arg1, arg2, (int[]) null, var7, (int[]) null);
    }

    @ObfuscatedName("pk.be(II)V")
    public void method6999(int arg0, int arg1) {
        field4541 = -1;
        field4545 = -1;
        field4547 = arg1;
        field4544 = arg1;
        field4530 = arg0;
        field4546 = arg0;
        field4529 = 256;
        field4548 = 0;
        field4532 = 0;
    }

    @ObfuscatedName("pk.bv(Ljava/lang/String;)V")
    public void method6968(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = Statics.method3988(var2, 16, true);
                field4546 = var3;
            } else if (arg0.equals("/col")) {
                field4546 = field4530;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = Statics.method3988(var4, 16, true);
                field4541 = var5;
            } else if (arg0.equals("str")) {
                field4541 = 8388608;
            } else if (arg0.equals("/str")) {
                field4541 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = Statics.method3988(var6, 16, true);
                field4545 = var7;
            } else if (arg0.equals("u")) {
                field4545 = 0;
            } else if (arg0.equals("/u")) {
                field4545 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = Statics.method3988(var8, 16, true);
                field4544 = var9;
            } else if (arg0.equals("shad")) {
                field4544 = 0;
            } else if (arg0.equals("/shad")) {
                field4544 = field4547;
            } else if (arg0.equals("br")) {
                this.method6999(field4530, field4547);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("pk.ba(Ljava/lang/String;I)V")
    public void method6969(String arg0, int arg1) {
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
            field4548 = (arg1 - this.method6948(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("pk.bz(Ljava/lang/String;II)V")
    public void method6943(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4536;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class400.method2339(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class402.method677(var9.substring(4));
                                        class543 var11 = Statics.field4539[var10];
                                        var11.method8786(arg1, this.field4536 + var4 - var11.field5233);
                                        arg1 += var11.field5232;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method6968(var9);
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
                        if (this.field4531 != null && var6 != -1) {
                            arg1 += this.field4531[(var6 << 8) + var8];
                        }
                        int var13 = this.field4540[var8];
                        int var14 = this.field4538[var8];
                        if (var8 == ' ') {
                            if (field4548 > 0) {
                                field4532 += field4548;
                                arg1 += field4532 >> 8;
                                field4532 &= 0xFF;
                            }
                        } else if (field4529 == 256) {
                            if (field4544 != -1) {
                                method6973(this.field4542[var8], this.field4534[var8] + arg1 + 1, this.field4535[var8] + var4 + 1, var13, var14, field4544);
                            }
                            this.method6790(this.field4542[var8], this.field4534[var8] + arg1, this.field4535[var8] + var4, var13, var14, field4546);
                        } else {
                            if (field4544 != -1) {
                                method6975(this.field4542[var8], this.field4534[var8] + arg1 + 1, this.field4535[var8] + var4 + 1, var13, var14, field4544, field4529);
                            }
                            this.method6791(this.field4542[var8], this.field4534[var8] + arg1, this.field4535[var8] + var4, var13, var14, field4546, field4529);
                        }
                        int var15 = this.field4533[var8];
                        if (field4541 != -1) {
                            method8708(arg1, (int) ((double) this.field4536 * 0.7D) + var4, var15, field4541);
                        }
                        if (field4545 != -1) {
                            method8708(arg1, this.field4536 + var4 + 1, var15, field4545);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("pk.bb(Ljava/lang/String;II[I[I[I)V")
    public void method7006(String arg0, int arg1, int arg2, int[] arg3, int[] arg4, int[] arg5) {
        int var7 = arg2 - this.field4536;
        int var8 = -1;
        int var9 = -1;
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            if (arg0.charAt(var11) != 0) {
                char var12 = (char) (class400.method2339(arg0.charAt(var11)) & 0xFF);
                if (var12 == '<') {
                    var8 = var11;
                } else {
                    if (var12 == '>' && var8 != -1) {
                        String var13 = arg0.substring(var8 + 1, var11);
                        var8 = -1;
                        if (var13.equals("lt")) {
                            var12 = '<';
                        } else {
                            if (!var13.equals("gt")) {
                                if (var13.startsWith("img=")) {
                                    try {
                                        int var14;
                                        if (arg4 == null) {
                                            var14 = 0;
                                        } else {
                                            var14 = arg4[var10];
                                        }
                                        int var15;
                                        if (arg5 == null) {
                                            var15 = 0;
                                        } else {
                                            var15 = arg5[var10];
                                        }
                                        var10++;
                                        int var16 = class402.method677(var13.substring(4));
                                        class543 var17 = Statics.field4539[var16];
                                        var17.method8786(arg1 + var14, this.field4536 + var7 - var17.field5233 + var15);
                                        arg1 += var17.field5232;
                                        var9 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method6968(var13);
                                }
                                continue;
                            }
                            var12 = '>';
                        }
                    }
                    if (var12 == 160) {
                        var12 = ' ';
                    }
                    if (var8 == -1) {
                        if (this.field4531 != null && var9 != -1) {
                            arg1 += this.field4531[(var9 << 8) + var12];
                        }
                        int var19 = this.field4540[var12];
                        int var20 = this.field4538[var12];
                        int var21;
                        if (arg4 == null) {
                            var21 = 0;
                        } else {
                            var21 = arg4[var10];
                        }
                        int var22;
                        if (arg5 == null) {
                            var22 = 0;
                        } else {
                            var22 = arg5[var10];
                        }
                        int var23;
                        if (arg3 == null) {
                            var23 = field4546;
                        } else {
                            var23 = arg3[var10];
                        }
                        var10++;
                        if (var12 == ' ') {
                            if (field4548 > 0) {
                                field4532 += field4548;
                                arg1 += field4532 >> 8;
                                field4532 &= 0xFF;
                            }
                        } else if (field4529 == 256) {
                            if (field4544 != -1) {
                                method6973(this.field4542[var12], this.field4534[var12] + arg1 + 1 + var21, this.field4535[var12] + var7 + 1 + var22, var19, var20, field4544);
                            }
                            this.method6790(this.field4542[var12], this.field4534[var12] + arg1 + var21, this.field4535[var12] + var7 + var22, var19, var20, var23);
                        } else {
                            if (field4544 != -1) {
                                method6975(this.field4542[var12], this.field4534[var12] + arg1 + 1 + var21, this.field4535[var12] + var7 + 1 + var22, var19, var20, field4544, field4529);
                            }
                            this.method6791(this.field4542[var12], this.field4534[var12] + arg1 + var21, this.field4535[var12] + var7 + var22, var19, var20, var23, field4529);
                        }
                        int var24 = this.field4533[var12];
                        if (field4541 != -1) {
                            method8708(arg1, (int) ((double) this.field4536 * 0.7D) + var7, var24, field4541);
                        }
                        if (field4545 != -1) {
                            method8708(arg1, this.field4536 + var7, var24, field4545);
                        }
                        arg1 += var24;
                        var9 = var12;
                    }
                }
            }
        }
    }

    @ObfuscatedName("pk.bo([BIIIII)V")
    public static void method6973(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field5207 * arg2 + arg1;
        int var7 = Statics.field5207 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field5213) {
            int var10 = field5213 - arg2;
            arg4 -= var10;
            arg2 = field5213;
            var9 += arg3 * var10;
            var6 += Statics.field5207 * var10;
        }
        if (arg2 + arg4 > field5208) {
            arg4 -= arg2 + arg4 - field5208;
        }
        if (arg1 < field5214) {
            int var11 = field5214 - arg1;
            arg3 -= var11;
            arg1 = field5214;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field5215) {
            int var12 = arg1 + arg3 - field5215;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6971(Statics.field5211, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("pk.bp([I[BIIIIIII)V")
    public static void method6971(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("pk.bt([BIIIIII)V")
    public static void method6975(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field5207 * arg2 + arg1;
        int var8 = Statics.field5207 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field5213) {
            int var11 = field5213 - arg2;
            arg4 -= var11;
            arg2 = field5213;
            var10 += arg3 * var11;
            var7 += Statics.field5207 * var11;
        }
        if (arg2 + arg4 > field5208) {
            arg4 -= arg2 + arg4 - field5208;
        }
        if (arg1 < field5214) {
            int var12 = field5214 - arg1;
            arg3 -= var12;
            arg1 = field5214;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field5215) {
            int var13 = arg1 + arg3 - field5215;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6976(Statics.field5211, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("pk.bm([I[BIIIIIIII)V")
    public static void method6976(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("pk.al([BIIIIII)V")
    public abstract void method6791(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("pk.ac([BIIIII)V")
    public abstract void method6790(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
