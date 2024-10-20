package deob;

import java.util.Random;

@ObfuscatedName("qt")
public abstract class class435 extends class556 {

    @ObfuscatedName("qt.al")
    public byte[][] field4754 = new byte[256][];

    @ObfuscatedName("qt.aj")
    public int[] field4755;

    @ObfuscatedName("qt.az")
    public int[] field4756;

    @ObfuscatedName("qt.af")
    public int[] field4757;

    @ObfuscatedName("qt.aa")
    public int[] field4771;

    @ObfuscatedName("qt.at")
    public int[] field4759;

    @ObfuscatedName("qt.ab")
    public int field4760 = 0;

    @ObfuscatedName("qt.ac")
    public int field4762;

    @ObfuscatedName("qt.ao")
    public int field4764;

    @ObfuscatedName("qt.av")
    public byte[] field4758;

    @ObfuscatedName("qt.aq")
    public static int field4765 = -1;

    @ObfuscatedName("qt.ap")
    public static int field4761 = -1;

    @ObfuscatedName("qt.ae")
    public static int field4767 = -1;

    @ObfuscatedName("qt.ax")
    public static int field4768 = -1;

    @ObfuscatedName("qt.ay")
    public static int field4753 = 0;

    @ObfuscatedName("qt.au")
    public static int field4769 = 0;

    @ObfuscatedName("qt.as")
    public static int field4766 = 256;

    @ObfuscatedName("qt.aw")
    public static int field4772 = 0;

    @ObfuscatedName("qt.ad")
    public static int field4773 = 0;

    @ObfuscatedName("qt.ai")
    public static Random field4770 = new Random();

    @ObfuscatedName("qt.an")
    public static String[] field4775 = new String[100];

    public class435(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field4771 = arg1;
        this.field4759 = arg2;
        this.field4756 = arg3;
        this.field4757 = arg4;
        this.method7457(arg0);
        this.field4754 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field4759[var10] < var8 && this.field4757[var10] != 0) {
                var8 = this.field4759[var10];
            }
            if (this.field4759[var10] + this.field4757[var10] > var9) {
                var9 = this.field4759[var10] + this.field4757[var10];
            }
        }
        this.field4762 = this.field4760 - var8;
        this.field4764 = var9 - this.field4760;
    }

    public class435(byte[] arg0) {
        this.method7457(arg0);
    }

    @ObfuscatedName("qt.at([B)V")
    public void method7457(byte[] arg0) {
        this.field4755 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4755.length; var2++) {
                this.field4755[var2] = arg0[var2] & 0xFF;
            }
            this.field4760 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4755[var4] = arg0[var3++] & 0xFF;
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
        this.field4758 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4758[(var17 << 8) + var18] = (byte) method7458(var9, var13, var6, this.field4755, var5, var17, var18);
                    }
                }
            }
        }
        this.field4760 = var5[32] + var6[32];
    }

    @ObfuscatedName("qt.ab([[B[[B[I[I[III)I")
    public static int method7458(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("qt.ac(C)I")
    public int method7459(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4755[class413.method2808(arg0) & 0xFF];
    }

    @ObfuscatedName("qt.ao(Ljava/lang/String;)I")
    public int method7547(String arg0) {
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
                                    int var8 = class415.method3328(var7.substring(4));
                                    var4 += Statics.field4763[var8].field5436;
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
                    var4 += this.field4755[(char) (class413.method2808(var6) & 0xFF)];
                    if (this.field4758 != null && var3 != -1) {
                        var4 += this.field4758[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("qt.ah(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method7554(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method7459('<');
                        if (this.field4758 != null && var11 != -1) {
                            var4 += this.field4758[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method7459('>');
                        if (this.field4758 != null && var11 != -1) {
                            var4 += this.field4758[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class415.method3328(var16.substring(4));
                            var4 += Statics.field4763[var17].field5436;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method7459(var15);
                        if (this.field4758 != null && var11 != -1) {
                            var4 += this.field4758[(var11 << 8) + var15];
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

    @ObfuscatedName("qt.av(Ljava/lang/String;I)I")
    public int method7540(String arg0, int arg1) {
        int var3 = this.method7554(arg0, new int[] { arg1 }, field4775);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method7547(field4775[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("qt.aq(Ljava/lang/String;I)I")
    public int method7463(String arg0, int arg1) {
        return this.method7554(arg0, new int[] { arg1 }, field4775);
    }

    @ObfuscatedName("qt.ap(Ljava/lang/String;)Ljava/lang/String;")
    public static String method7464(String arg0) {
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

    @ObfuscatedName("qt.ae(IILjava/lang/String;II)Lqi;")
    public class419 method7462(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class419(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method7547(arg2) / 2;
        int var7 = var6 + this.method7547(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4762;
        int var9 = this.method7547(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4764 + this.field4762;
        return new class419(var7, var8, var9, var10);
    }

    @ObfuscatedName("qt.ax(Ljava/lang/String;IIII)V")
    public void method7488(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method7479(arg3, arg4);
            this.method7482(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("qt.ay(Ljava/lang/String;IIIII)V")
    public void method7466(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method7479(arg3, arg4);
            field4766 = arg5;
            this.method7482(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("qt.au(Ljava/lang/String;IIII)V")
    public void method7467(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method7479(arg3, arg4);
            this.method7482(arg0, arg1 - this.method7547(arg0), arg2);
        }
    }

    @ObfuscatedName("qt.as(Ljava/lang/String;IIII)V")
    public void method7468(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method7479(arg3, arg4);
            this.method7482(arg0, arg1 - this.method7547(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("qt.aw(Ljava/lang/String;IIIIIIIII)I")
    public int method7483(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method7470(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @ObfuscatedName("qt.ad(Ljava/lang/String;IIIIIIIIII)I")
    public int method7470(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        if (arg7 == 255) {
            arg7 = 256;
        }
        this.method7479(arg5, arg6);
        field4766 = arg7;
        if (arg10 == 0) {
            arg10 = this.field4760;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field4764 + this.field4762 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method7554(arg0, var12, field4775);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field4762 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field4762 - this.field4764 - (var13 - 1) * arg10) / 2 + this.field4762 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field4764 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field4762 - this.field4764 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field4762 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method7482(field4775[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method7482(field4775[var16], arg1 + (arg3 - this.method7547(field4775[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method7482(field4775[var16], arg1 + arg3 - this.method7547(field4775[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method7482(field4775[var16], arg1, var14);
            } else {
                this.method7481(field4775[var16], arg3);
                this.method7482(field4775[var16], arg1, var14);
                field4772 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @ObfuscatedName("qt.ai(Lqv;IIIII)Lto;")
    public class517 method7471(class436 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0.method7562()) {
            this.method7479(arg3, arg4);
            int var7 = arg2 - this.field4760;
            for (int var8 = 0; var8 < arg0.method7563(); var8++) {
                class434 var9 = arg0.method7567(var8);
                if (arg5 != -1 && var9.field4752 > arg5) {
                    return new class517(var9.field4751, var9.field4752);
                }
                char var10 = var9.field4750;
                if (var10 != '\n') {
                    if (arg0.method7561(var8)) {
                        var10 = '*';
                    }
                    if (var10 != '\t') {
                        if (var10 == 160) {
                            var10 = ' ';
                        }
                        int var11 = var9.field4751 + arg1;
                        int var12 = var9.field4752 + var7;
                        int var13 = this.field4756[var10];
                        int var14 = this.field4757[var10];
                        if (field4768 != -1) {
                            this.method7314(this.field4754[var10], this.field4771[var10] + var11 + 1, this.field4759[var10] + var12 + 1, var13, var14, field4768);
                        }
                        this.method7314(this.field4754[var10], this.field4771[var10] + var11, this.field4759[var10] + var12, var13, var14, field4769);
                    }
                }
            }
        }
        return arg0.method7566();
    }

    @ObfuscatedName("qt.an(Ljava/lang/String;IIIII[I)V")
    public void method7528(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg0 == null) {
            return;
        }
        this.method7479(arg3, arg4);
        int[] var8 = null;
        if (arg6 != null) {
            var8 = this.method7477(arg6, arg0.length());
        }
        int[] var9 = new int[arg0.length()];
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method7469(arg0, arg1 - this.method7547(arg0) / 2, arg2, var8, (int[]) null, var9);
    }

    @ObfuscatedName("qt.am(Ljava/lang/String;IIIII[I)V")
    public void method7510(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg0 == null) {
            return;
        }
        this.method7479(arg3, arg4);
        int[] var8 = null;
        if (arg6 != null) {
            var8 = this.method7477(arg6, arg0.length());
        }
        int[] var9 = new int[arg0.length()];
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method7469(arg0, arg1 - this.method7547(arg0) / 2, arg2, var8, var9, var10);
    }

    @ObfuscatedName("qt.ar(Ljava/lang/String;IIIIII[I)V")
    public void method7474(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        if (arg0 == null) {
            return;
        }
        this.method7479(arg3, arg4);
        int[] var9 = null;
        if (arg7 != null) {
            var9 = this.method7477(arg7, arg0.length());
        }
        double var10 = 7.0D - (double) arg6 / 8.0D;
        if (var10 < 0.0D) {
            var10 = 0.0D;
        }
        int[] var12 = new int[arg0.length()];
        for (int var13 = 0; var13 < arg0.length(); var13++) {
            var12[var13] = (int) (Math.sin((double) arg5 / 1.0D + (double) var13 / 1.5D) * var10);
        }
        this.method7469(arg0, arg1 - this.method7547(arg0) / 2, arg2, var9, (int[]) null, var12);
    }

    @ObfuscatedName("qt.ag(Ljava/lang/String;IIII[I)V")
    public void method7475(String arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg0 == null) {
            return;
        }
        this.method7479(arg3, arg4);
        int[] var7 = null;
        if (arg5 != null) {
            var7 = this.method7477(arg5, arg0.length());
        }
        this.method7469(arg0, arg1 - this.method7547(arg0) / 2, arg2, var7, (int[]) null, (int[]) null);
    }

    @ObfuscatedName("qt.bs(Ljava/lang/String;IIII[I)V")
    public void method7476(String arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg0 == null) {
            return;
        }
        this.method7479(arg3, arg4);
        int[] var7 = null;
        if (arg5 != null) {
            var7 = this.method7477(arg5, arg0.length());
        }
        this.method7469(arg0, arg1, arg2, var7, (int[]) null, (int[]) null);
    }

    @ObfuscatedName("qt.bf([II)[I")
    public int[] method7477(int[] arg0, int arg1) {
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

    @ObfuscatedName("qt.bo(Ljava/lang/String;IIIII)V")
    public void method7478(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method7479(arg3, arg4);
        field4770.setSeed((long) arg5);
        field4766 = 192 + (field4770.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4770.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method7469(arg0, arg1, arg2, (int[]) null, var7, (int[]) null);
    }

    @ObfuscatedName("qt.bi(II)V")
    public void method7479(int arg0, int arg1) {
        field4765 = -1;
        field4761 = -1;
        field4767 = arg1;
        field4768 = arg1;
        field4753 = arg0;
        field4769 = arg0;
        field4766 = 256;
        field4772 = 0;
        field4773 = 0;
    }

    @ObfuscatedName("qt.bt(Ljava/lang/String;)V")
    public void method7480(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class415.method5390(var2, 16, true);
                field4769 = var3;
            } else if (arg0.equals("/col")) {
                field4769 = field4753;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class415.method5390(var4, 16, true);
                field4765 = var5;
            } else if (arg0.equals("str")) {
                field4765 = 8388608;
            } else if (arg0.equals("/str")) {
                field4765 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class415.method5390(var6, 16, true);
                field4761 = var7;
            } else if (arg0.equals("u")) {
                field4761 = 0;
            } else if (arg0.equals("/u")) {
                field4761 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class415.method5390(var8, 16, true);
                field4768 = var9;
            } else if (arg0.equals("shad")) {
                field4768 = 0;
            } else if (arg0.equals("/shad")) {
                field4768 = field4767;
            } else if (arg0.equals("br")) {
                this.method7479(field4753, field4767);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("qt.bn(Ljava/lang/String;I)V")
    public void method7481(String arg0, int arg1) {
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
            field4772 = (arg1 - this.method7547(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("qt.bw(Ljava/lang/String;II)V")
    public void method7482(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4760;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class413.method2808(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class415.method3328(var9.substring(4));
                                        class559 var11 = Statics.field4763[var10];
                                        var11.method9196(arg1, this.field4760 + var4 - var11.field5439);
                                        arg1 += var11.field5436;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method7480(var9);
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
                        if (this.field4758 != null && var6 != -1) {
                            arg1 += this.field4758[(var6 << 8) + var8];
                        }
                        int var13 = this.field4756[var8];
                        int var14 = this.field4757[var8];
                        if (var8 == ' ') {
                            if (field4772 > 0) {
                                field4773 += field4772;
                                arg1 += field4773 >> 8;
                                field4773 &= 0xFF;
                            }
                        } else if (field4766 == 256) {
                            if (field4768 != -1) {
                                method7485(this.field4754[var8], this.field4771[var8] + arg1 + 1, this.field4759[var8] + var4 + 1, var13, var14, field4768);
                            }
                            this.method7314(this.field4754[var8], this.field4771[var8] + arg1, this.field4759[var8] + var4, var13, var14, field4769);
                        } else {
                            if (field4768 != -1) {
                                method7487(this.field4754[var8], this.field4771[var8] + arg1 + 1, this.field4759[var8] + var4 + 1, var13, var14, field4768, field4766);
                            }
                            this.method7317(this.field4754[var8], this.field4771[var8] + arg1, this.field4759[var8] + var4, var13, var14, field4769, field4766);
                        }
                        int var15 = this.field4755[var8];
                        if (field4765 != -1) {
                            method9160(arg1, (int) ((double) this.field4760 * 0.7D) + var4, var15, field4765);
                        }
                        if (field4761 != -1) {
                            method9160(arg1, this.field4760 + var4 + 1, var15, field4761);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("qt.bl(Ljava/lang/String;II[I[I[I)V")
    public void method7469(String arg0, int arg1, int arg2, int[] arg3, int[] arg4, int[] arg5) {
        int var7 = arg2 - this.field4760;
        int var8 = -1;
        int var9 = -1;
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            if (arg0.charAt(var11) != 0) {
                char var12 = (char) (class413.method2808(arg0.charAt(var11)) & 0xFF);
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
                                        int var16 = class415.method3328(var13.substring(4));
                                        class559 var17 = Statics.field4763[var16];
                                        var17.method9196(arg1 + var14, this.field4760 + var7 - var17.field5439 + var15);
                                        arg1 += var17.field5436;
                                        var9 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method7480(var13);
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
                        if (this.field4758 != null && var9 != -1) {
                            arg1 += this.field4758[(var9 << 8) + var12];
                        }
                        int var19 = this.field4756[var12];
                        int var20 = this.field4757[var12];
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
                            var23 = field4769;
                        } else {
                            var23 = arg3[var10];
                        }
                        var10++;
                        if (var12 == ' ') {
                            if (field4772 > 0) {
                                field4773 += field4772;
                                arg1 += field4773 >> 8;
                                field4773 &= 0xFF;
                            }
                        } else if (field4766 == 256) {
                            if (field4768 != -1) {
                                method7485(this.field4754[var12], this.field4771[var12] + arg1 + 1 + var21, this.field4759[var12] + var7 + 1 + var22, var19, var20, field4768);
                            }
                            this.method7314(this.field4754[var12], this.field4771[var12] + arg1 + var21, this.field4759[var12] + var7 + var22, var19, var20, var23);
                        } else {
                            if (field4768 != -1) {
                                method7487(this.field4754[var12], this.field4771[var12] + arg1 + 1 + var21, this.field4759[var12] + var7 + 1 + var22, var19, var20, field4768, field4766);
                            }
                            this.method7317(this.field4754[var12], this.field4771[var12] + arg1 + var21, this.field4759[var12] + var7 + var22, var19, var20, var23, field4766);
                        }
                        int var24 = this.field4755[var12];
                        if (field4765 != -1) {
                            method9160(arg1, (int) ((double) this.field4760 * 0.7D) + var7, var24, field4765);
                        }
                        if (field4761 != -1) {
                            method9160(arg1, this.field4760 + var7, var24, field4761);
                        }
                        arg1 += var24;
                        var9 = var12;
                    }
                }
            }
        }
    }

    @ObfuscatedName("qt.be([BIIIII)V")
    public static void method7485(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field5418 * arg2 + arg1;
        int var7 = Statics.field5418 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field5417) {
            int var10 = field5417 - arg2;
            arg4 -= var10;
            arg2 = field5417;
            var9 += arg3 * var10;
            var6 += Statics.field5418 * var10;
        }
        if (arg2 + arg4 > field5414) {
            arg4 -= arg2 + arg4 - field5414;
        }
        if (arg1 < field5419) {
            int var11 = field5419 - arg1;
            arg3 -= var11;
            arg1 = field5419;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field5420) {
            int var12 = arg1 + arg3 - field5420;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method7500(Statics.field5413, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("qt.bg([I[BIIIIIII)V")
    public static void method7500(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("qt.bu([BIIIIII)V")
    public static void method7487(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field5418 * arg2 + arg1;
        int var8 = Statics.field5418 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field5417) {
            int var11 = field5417 - arg2;
            arg4 -= var11;
            arg2 = field5417;
            var10 += arg3 * var11;
            var7 += Statics.field5418 * var11;
        }
        if (arg2 + arg4 > field5414) {
            arg4 -= arg2 + arg4 - field5414;
        }
        if (arg1 < field5419) {
            int var12 = field5419 - arg1;
            arg3 -= var12;
            arg1 = field5419;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field5420) {
            int var13 = arg1 + arg3 - field5420;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method7530(Statics.field5413, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("qt.bh([I[BIIIIIIII)V")
    public static void method7530(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("qt.ak([BIIIII)V")
    public abstract void method7314(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("qt.al([BIIIIII)V")
    public abstract void method7317(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
