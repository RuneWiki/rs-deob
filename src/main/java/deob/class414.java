package deob;

import java.util.Random;

@ObfuscatedName("pw")
public abstract class class414 extends class541 {

    @ObfuscatedName("pw.ap")
    public byte[][] field4550 = new byte[256][];

    @ObfuscatedName("pw.af")
    public int[] field4566;

    @ObfuscatedName("pw.aj")
    public int[] field4552;

    @ObfuscatedName("pw.aq")
    public int[] field4549;

    @ObfuscatedName("pw.ar")
    public int[] field4564;

    @ObfuscatedName("pw.ag")
    public int[] field4554;

    @ObfuscatedName("pw.ao")
    public int field4556 = 0;

    @ObfuscatedName("pw.ae")
    public int field4557;

    @ObfuscatedName("pw.aa")
    public int field4558;

    @ObfuscatedName("pw.an")
    public byte[] field4567;

    @ObfuscatedName("pw.ad")
    public static int field4561 = -1;

    @ObfuscatedName("pw.ax")
    public static int field4562 = -1;

    @ObfuscatedName("pw.aw")
    public static int field4563 = -1;

    @ObfuscatedName("pw.az")
    public static int field4560 = -1;

    @ObfuscatedName("pw.av")
    public static int field4565 = 0;

    @ObfuscatedName("pw.ak")
    public static int field4555 = 0;

    @ObfuscatedName("pw.ay")
    public static int field4553 = 256;

    @ObfuscatedName("pw.as")
    public static int field4568 = 0;

    @ObfuscatedName("pw.ab")
    public static int field4569 = 0;

    @ObfuscatedName("pw.ah")
    public static Random field4570 = new Random();

    @ObfuscatedName("pw.ai")
    public static String[] field4571 = new String[100];

    public class414(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field4564 = arg1;
        this.field4554 = arg2;
        this.field4552 = arg3;
        this.field4549 = arg4;
        this.method7212(arg0);
        this.field4550 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field4554[var10] < var8 && this.field4549[var10] != 0) {
                var8 = this.field4554[var10];
            }
            if (this.field4554[var10] + this.field4549[var10] > var9) {
                var9 = this.field4554[var10] + this.field4549[var10];
            }
        }
        this.field4557 = this.field4556 - var8;
        this.field4558 = var9 - this.field4556;
    }

    public class414(byte[] arg0) {
        this.method7212(arg0);
    }

    @ObfuscatedName("pw.ae([B)V")
    public void method7212(byte[] arg0) {
        this.field4566 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4566.length; var2++) {
                this.field4566[var2] = arg0[var2] & 0xFF;
            }
            this.field4556 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4566[var4] = arg0[var3++] & 0xFF;
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
        this.field4567 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4567[(var17 << 8) + var18] = (byte) method7101(var9, var13, var6, this.field4566, var5, var17, var18);
                    }
                }
            }
        }
        this.field4556 = var5[32] + var6[32];
    }

    @ObfuscatedName("pw.aa([[B[[B[I[I[III)I")
    public static int method7101(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("pw.au(C)I")
    public int method7102(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4566[class401.method3088(arg0) & 0xFF];
    }

    @ObfuscatedName("pw.an(Ljava/lang/String;)I")
    public int method7103(String arg0) {
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
                                    int var8 = class403.method2543(var7.substring(4));
                                    var4 += Statics.field4559[var8].field5272;
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
                    var4 += this.field4566[(char) (class401.method3088(var6) & 0xFF)];
                    if (this.field4567 != null && var3 != -1) {
                        var4 += this.field4567[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("pw.ad(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method7203(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method7102('<');
                        if (this.field4567 != null && var11 != -1) {
                            var4 += this.field4567[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method7102('>');
                        if (this.field4567 != null && var11 != -1) {
                            var4 += this.field4567[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class403.method2543(var16.substring(4));
                            var4 += Statics.field4559[var17].field5272;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method7102(var15);
                        if (this.field4567 != null && var11 != -1) {
                            var4 += this.field4567[(var11 << 8) + var15];
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

    @ObfuscatedName("pw.ax(Ljava/lang/String;I)I")
    public int method7105(String arg0, int arg1) {
        int var3 = this.method7203(arg0, new int[] { arg1 }, field4571);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method7103(field4571[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("pw.aw(Ljava/lang/String;I)I")
    public int method7106(String arg0, int arg1) {
        return this.method7203(arg0, new int[] { arg1 }, field4571);
    }

    @ObfuscatedName("pw.az(Ljava/lang/String;)Ljava/lang/String;")
    public static String method7167(String arg0) {
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

    @ObfuscatedName("pw.av(IILjava/lang/String;II)Lry;")
    public class462 method7108(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class462(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method7103(arg2) / 2;
        int var7 = var6 + this.method7103(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4557;
        int var9 = this.method7103(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4558 + this.field4557;
        return new class462(var7, var8, var9, var10);
    }

    @ObfuscatedName("pw.ak(Ljava/lang/String;IIII)V")
    public void method7109(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method7122(arg3, arg4);
            this.method7174(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("pw.ay(Ljava/lang/String;IIIII)V")
    public void method7110(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method7122(arg3, arg4);
            field4553 = arg5;
            this.method7174(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("pw.as(Ljava/lang/String;IIII)V")
    public void method7111(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method7122(arg3, arg4);
            this.method7174(arg0, arg1 - this.method7103(arg0), arg2);
        }
    }

    @ObfuscatedName("pw.ab(Ljava/lang/String;IIII)V")
    public void method7112(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method7122(arg3, arg4);
            this.method7174(arg0, arg1 - this.method7103(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("pw.ah(Ljava/lang/String;IIIIIIIII)I")
    public int method7113(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method7198(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @ObfuscatedName("pw.ai(Ljava/lang/String;IIIIIIIIII)I")
    public int method7198(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        if (arg7 == 255) {
            arg7 = 256;
        }
        this.method7122(arg5, arg6);
        field4553 = arg7;
        if (arg10 == 0) {
            arg10 = this.field4556;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field4558 + this.field4557 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method7203(arg0, var12, field4571);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field4557 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field4557 - this.field4558 - (var13 - 1) * arg10) / 2 + this.field4557 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field4558 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field4557 - this.field4558 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field4557 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method7174(field4571[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method7174(field4571[var16], arg1 + (arg3 - this.method7103(field4571[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method7174(field4571[var16], arg1 + arg3 - this.method7103(field4571[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method7174(field4571[var16], arg1, var14);
            } else {
                this.method7124(field4571[var16], arg3);
                this.method7174(field4571[var16], arg1, var14);
                field4568 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @ObfuscatedName("pw.ac(Lpo;IIIII)Ltg;")
    public class502 method7114(class415 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0.method7221()) {
            this.method7122(arg3, arg4);
            int var7 = arg2 - this.field4556;
            for (int var8 = 0; var8 < arg0.method7234(); var8++) {
                class413 var9 = arg0.method7241(var8);
                if (arg5 != -1 && var9.field4547 > arg5) {
                    return new class502(var9.field4545, var9.field4547);
                }
                char var10 = var9.field4546;
                if (var10 != '\n') {
                    if (arg0.method7220(var8)) {
                        var10 = '*';
                    }
                    if (var10 != '\t') {
                        if (var10 == 160) {
                            var10 = ' ';
                        }
                        int var11 = var9.field4545 + arg1;
                        int var12 = var9.field4547 + var7;
                        int var13 = this.field4552[var10];
                        int var14 = this.field4549[var10];
                        if (field4560 != -1) {
                            this.method6946(this.field4550[var10], this.field4564[var10] + var11 + 1, this.field4554[var10] + var12 + 1, var13, var14, field4560);
                        }
                        this.method6946(this.field4550[var10], this.field4564[var10] + var11, this.field4554[var10] + var12, var13, var14, field4555);
                    }
                }
            }
        }
        return arg0.method7225();
    }

    @ObfuscatedName("pw.al(Ljava/lang/String;IIIII[I)V")
    public void method7115(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg0 == null) {
            return;
        }
        this.method7122(arg3, arg4);
        int[] var8 = null;
        if (arg6 != null) {
            var8 = this.method7120(arg6, arg0.length());
        }
        int[] var9 = new int[arg0.length()];
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method7126(arg0, arg1 - this.method7103(arg0) / 2, arg2, var8, (int[]) null, var9);
    }

    @ObfuscatedName("pw.at(Ljava/lang/String;IIIII[I)V")
    public void method7116(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg0 == null) {
            return;
        }
        this.method7122(arg3, arg4);
        int[] var8 = null;
        if (arg6 != null) {
            var8 = this.method7120(arg6, arg0.length());
        }
        int[] var9 = new int[arg0.length()];
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method7126(arg0, arg1 - this.method7103(arg0) / 2, arg2, var8, var9, var10);
    }

    @ObfuscatedName("pw.bj(Ljava/lang/String;IIIIII[I)V")
    public void method7117(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        if (arg0 == null) {
            return;
        }
        this.method7122(arg3, arg4);
        int[] var9 = null;
        if (arg7 != null) {
            var9 = this.method7120(arg7, arg0.length());
        }
        double var10 = 7.0D - (double) arg6 / 8.0D;
        if (var10 < 0.0D) {
            var10 = 0.0D;
        }
        int[] var12 = new int[arg0.length()];
        for (int var13 = 0; var13 < arg0.length(); var13++) {
            var12[var13] = (int) (Math.sin((double) arg5 / 1.0D + (double) var13 / 1.5D) * var10);
        }
        this.method7126(arg0, arg1 - this.method7103(arg0) / 2, arg2, var9, (int[]) null, var12);
    }

    @ObfuscatedName("pw.bd(Ljava/lang/String;IIII[I)V")
    public void method7193(String arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg0 == null) {
            return;
        }
        this.method7122(arg3, arg4);
        int[] var7 = null;
        if (arg5 != null) {
            var7 = this.method7120(arg5, arg0.length());
        }
        this.method7126(arg0, arg1 - this.method7103(arg0) / 2, arg2, var7, (int[]) null, (int[]) null);
    }

    @ObfuscatedName("pw.bg(Ljava/lang/String;IIII[I)V")
    public void method7119(String arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg0 == null) {
            return;
        }
        this.method7122(arg3, arg4);
        int[] var7 = null;
        if (arg5 != null) {
            var7 = this.method7120(arg5, arg0.length());
        }
        this.method7126(arg0, arg1, arg2, var7, (int[]) null, (int[]) null);
    }

    @ObfuscatedName("pw.bt([II)[I")
    public int[] method7120(int[] arg0, int arg1) {
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

    @ObfuscatedName("pw.br(Ljava/lang/String;IIIII)V")
    public void method7104(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method7122(arg3, arg4);
        field4570.setSeed((long) arg5);
        field4553 = 192 + (field4570.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4570.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method7126(arg0, arg1, arg2, (int[]) null, var7, (int[]) null);
    }

    @ObfuscatedName("pw.ba(II)V")
    public void method7122(int arg0, int arg1) {
        field4561 = -1;
        field4562 = -1;
        field4563 = arg1;
        field4560 = arg1;
        field4565 = arg0;
        field4555 = arg0;
        field4553 = 256;
        field4568 = 0;
        field4569 = 0;
    }

    @ObfuscatedName("pw.bk(Ljava/lang/String;)V")
    public void method7121(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class403.method3350(var2, 16, true);
                field4555 = var3;
            } else if (arg0.equals("/col")) {
                field4555 = field4565;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class403.method3350(var4, 16, true);
                field4561 = var5;
            } else if (arg0.equals("str")) {
                field4561 = 8388608;
            } else if (arg0.equals("/str")) {
                field4561 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class403.method3350(var6, 16, true);
                field4562 = var7;
            } else if (arg0.equals("u")) {
                field4562 = 0;
            } else if (arg0.equals("/u")) {
                field4562 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class403.method3350(var8, 16, true);
                field4560 = var9;
            } else if (arg0.equals("shad")) {
                field4560 = 0;
            } else if (arg0.equals("/shad")) {
                field4560 = field4563;
            } else if (arg0.equals("br")) {
                this.method7122(field4565, field4563);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("pw.bn(Ljava/lang/String;I)V")
    public void method7124(String arg0, int arg1) {
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
            field4568 = (arg1 - this.method7103(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("pw.by(Ljava/lang/String;II)V")
    public void method7174(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4556;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class401.method3088(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class403.method2543(var9.substring(4));
                                        class544 var11 = Statics.field4559[var10];
                                        var11.method8966(arg1, this.field4556 + var4 - var11.field5274);
                                        arg1 += var11.field5272;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method7121(var9);
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
                        if (this.field4567 != null && var6 != -1) {
                            arg1 += this.field4567[(var6 << 8) + var8];
                        }
                        int var13 = this.field4552[var8];
                        int var14 = this.field4549[var8];
                        if (var8 == ' ') {
                            if (field4568 > 0) {
                                field4569 += field4568;
                                arg1 += field4569 >> 8;
                                field4569 &= 0xFF;
                            }
                        } else if (field4553 == 256) {
                            if (field4560 != -1) {
                                method7196(this.field4550[var8], this.field4564[var8] + arg1 + 1, this.field4554[var8] + var4 + 1, var13, var14, field4560);
                            }
                            this.method6946(this.field4550[var8], this.field4564[var8] + arg1, this.field4554[var8] + var4, var13, var14, field4555);
                        } else {
                            if (field4560 != -1) {
                                method7130(this.field4550[var8], this.field4564[var8] + arg1 + 1, this.field4554[var8] + var4 + 1, var13, var14, field4560, field4553);
                            }
                            this.method6942(this.field4550[var8], this.field4564[var8] + arg1, this.field4554[var8] + var4, var13, var14, field4555, field4553);
                        }
                        int var15 = this.field4566[var8];
                        if (field4561 != -1) {
                            method8916(arg1, (int) ((double) this.field4556 * 0.7D) + var4, var15, field4561);
                        }
                        if (field4562 != -1) {
                            method8916(arg1, this.field4556 + var4 + 1, var15, field4562);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("pw.bc(Ljava/lang/String;II[I[I[I)V")
    public void method7126(String arg0, int arg1, int arg2, int[] arg3, int[] arg4, int[] arg5) {
        int var7 = arg2 - this.field4556;
        int var8 = -1;
        int var9 = -1;
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            if (arg0.charAt(var11) != 0) {
                char var12 = (char) (class401.method3088(arg0.charAt(var11)) & 0xFF);
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
                                        int var16 = class403.method2543(var13.substring(4));
                                        class544 var17 = Statics.field4559[var16];
                                        var17.method8966(arg1 + var14, this.field4556 + var7 - var17.field5274 + var15);
                                        arg1 += var17.field5272;
                                        var9 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method7121(var13);
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
                        if (this.field4567 != null && var9 != -1) {
                            arg1 += this.field4567[(var9 << 8) + var12];
                        }
                        int var19 = this.field4552[var12];
                        int var20 = this.field4549[var12];
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
                            var23 = field4555;
                        } else {
                            var23 = arg3[var10];
                        }
                        var10++;
                        if (var12 == ' ') {
                            if (field4568 > 0) {
                                field4569 += field4568;
                                arg1 += field4569 >> 8;
                                field4569 &= 0xFF;
                            }
                        } else if (field4553 == 256) {
                            if (field4560 != -1) {
                                method7196(this.field4550[var12], this.field4564[var12] + arg1 + 1 + var21, this.field4554[var12] + var7 + 1 + var22, var19, var20, field4560);
                            }
                            this.method6946(this.field4550[var12], this.field4564[var12] + arg1 + var21, this.field4554[var12] + var7 + var22, var19, var20, var23);
                        } else {
                            if (field4560 != -1) {
                                method7130(this.field4550[var12], this.field4564[var12] + arg1 + 1 + var21, this.field4554[var12] + var7 + 1 + var22, var19, var20, field4560, field4553);
                            }
                            this.method6942(this.field4550[var12], this.field4564[var12] + arg1 + var21, this.field4554[var12] + var7 + var22, var19, var20, var23, field4553);
                        }
                        int var24 = this.field4566[var12];
                        if (field4561 != -1) {
                            method8916(arg1, (int) ((double) this.field4556 * 0.7D) + var7, var24, field4561);
                        }
                        if (field4562 != -1) {
                            method8916(arg1, this.field4556 + var7, var24, field4562);
                        }
                        arg1 += var24;
                        var9 = var12;
                    }
                }
            }
        }
    }

    @ObfuscatedName("pw.bx([BIIIII)V")
    public static void method7196(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field5249 * arg2 + arg1;
        int var7 = Statics.field5249 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field5253) {
            int var10 = field5253 - arg2;
            arg4 -= var10;
            arg2 = field5253;
            var9 += arg3 * var10;
            var6 += Statics.field5249 * var10;
        }
        if (arg2 + arg4 > field5248) {
            arg4 -= arg2 + arg4 - field5248;
        }
        if (arg1 < field5251) {
            int var11 = field5251 - arg1;
            arg3 -= var11;
            arg1 = field5251;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field5256) {
            int var12 = arg1 + arg3 - field5256;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method7129(Statics.field5250, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("pw.bf([I[BIIIIIII)V")
    public static void method7129(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("pw.bp([BIIIIII)V")
    public static void method7130(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field5249 * arg2 + arg1;
        int var8 = Statics.field5249 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field5253) {
            int var11 = field5253 - arg2;
            arg4 -= var11;
            arg2 = field5253;
            var10 += arg3 * var11;
            var7 += Statics.field5249 * var11;
        }
        if (arg2 + arg4 > field5248) {
            arg4 -= arg2 + arg4 - field5248;
        }
        if (arg1 < field5251) {
            int var12 = field5251 - arg1;
            arg3 -= var12;
            arg1 = field5251;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field5256) {
            int var13 = arg1 + arg3 - field5256;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method7131(Statics.field5250, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("pw.bv([I[BIIIIIIII)V")
    public static void method7131(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("pw.ap([BIIIIII)V")
    public abstract void method6942(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("pw.am([BIIIII)V")
    public abstract void method6946(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
