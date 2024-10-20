package deob;

import java.util.Random;

@ObfuscatedName("qi")
public abstract class class417 extends class544 {

    @ObfuscatedName("qi.aw")
    public byte[][] field4588 = new byte[256][];

    @ObfuscatedName("qi.al")
    public int[] field4607;

    @ObfuscatedName("qi.ai")
    public int[] field4590;

    @ObfuscatedName("qi.ar")
    public int[] field4589;

    @ObfuscatedName("qi.as")
    public int[] field4592;

    @ObfuscatedName("qi.aa")
    public int[] field4593;

    @ObfuscatedName("qi.az")
    public int field4594 = 0;

    @ObfuscatedName("qi.ao")
    public int field4595;

    @ObfuscatedName("qi.au")
    public int field4599;

    @ObfuscatedName("qi.ah")
    public byte[] field4591;

    @ObfuscatedName("qi.aj")
    public static int field4587 = -1;

    @ObfuscatedName("qi.af")
    public static int field4596 = -1;

    @ObfuscatedName("qi.ax")
    public static int field4601 = -1;

    @ObfuscatedName("qi.an")
    public static int field4600 = -1;

    @ObfuscatedName("qi.ag")
    public static int field4603 = 0;

    @ObfuscatedName("qi.am")
    public static int field4604 = 0;

    @ObfuscatedName("qi.ad")
    public static int field4605 = 256;

    @ObfuscatedName("qi.at")
    public static int field4606 = 0;

    @ObfuscatedName("qi.ay")
    public static int field4609 = 0;

    @ObfuscatedName("qi.ae")
    public static Random field4608 = new Random();

    @ObfuscatedName("qi.ac")
    public static String[] field4598 = new String[100];

    public class417(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field4592 = arg1;
        this.field4593 = arg2;
        this.field4590 = arg3;
        this.field4589 = arg4;
        this.method7125(arg0);
        this.field4588 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field4593[var10] < var8 && this.field4589[var10] != 0) {
                var8 = this.field4593[var10];
            }
            if (this.field4593[var10] + this.field4589[var10] > var9) {
                var9 = this.field4593[var10] + this.field4589[var10];
            }
        }
        this.field4595 = this.field4594 - var8;
        this.field4599 = var9 - this.field4594;
    }

    public class417(byte[] arg0) {
        this.method7125(arg0);
    }

    @ObfuscatedName("qi.ao([B)V")
    public void method7125(byte[] arg0) {
        this.field4607 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4607.length; var2++) {
                this.field4607[var2] = arg0[var2] & 0xFF;
            }
            this.field4594 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4607[var4] = arg0[var3++] & 0xFF;
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
        this.field4591 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4591[(var17 << 8) + var18] = (byte) method7234(var9, var13, var6, this.field4607, var5, var17, var18);
                    }
                }
            }
        }
        this.field4594 = var5[32] + var6[32];
    }

    @ObfuscatedName("qi.au([[B[[B[I[I[III)I")
    public static int method7234(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("qi.ak(C)I")
    public int method7127(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4607[Statics.method4036(arg0) & 0xFF];
    }

    @ObfuscatedName("qi.ah(Ljava/lang/String;)I")
    public int method7128(String arg0) {
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
                                    int var8 = class406.method2922(var7.substring(4));
                                    var4 += Statics.field4597[var8].field5294;
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
                    var4 += this.field4607[(char) (Statics.method4036(var6) & 0xFF)];
                    if (this.field4591 != null && var3 != -1) {
                        var4 += this.field4591[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("qi.aj(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method7129(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method7127('<');
                        if (this.field4591 != null && var11 != -1) {
                            var4 += this.field4591[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method7127('>');
                        if (this.field4591 != null && var11 != -1) {
                            var4 += this.field4591[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class406.method2922(var16.substring(4));
                            var4 += Statics.field4597[var17].field5294;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method7127(var15);
                        if (this.field4591 != null && var11 != -1) {
                            var4 += this.field4591[(var11 << 8) + var15];
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

    @ObfuscatedName("qi.af(Ljava/lang/String;I)I")
    public int method7157(String arg0, int arg1) {
        int var3 = this.method7129(arg0, new int[] { arg1 }, field4598);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method7128(field4598[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("qi.ax(Ljava/lang/String;I)I")
    public int method7182(String arg0, int arg1) {
        return this.method7129(arg0, new int[] { arg1 }, field4598);
    }

    @ObfuscatedName("qi.an(Ljava/lang/String;)Ljava/lang/String;")
    public static String method7131(String arg0) {
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

    @ObfuscatedName("qi.ag(IILjava/lang/String;II)Lrc;")
    public class465 method7166(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class465(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method7128(arg2) / 2;
        int var7 = var6 + this.method7128(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4595;
        int var9 = this.method7128(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4599 + this.field4595;
        return new class465(var7, var8, var9, var10);
    }

    @ObfuscatedName("qi.am(Ljava/lang/String;IIII)V")
    public void method7170(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method7147(arg3, arg4);
            this.method7228(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("qi.ad(Ljava/lang/String;IIIII)V")
    public void method7134(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method7147(arg3, arg4);
            field4605 = arg5;
            this.method7228(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("qi.at(Ljava/lang/String;IIII)V")
    public void method7164(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method7147(arg3, arg4);
            this.method7228(arg0, arg1 - this.method7128(arg0), arg2);
        }
    }

    @ObfuscatedName("qi.ay(Ljava/lang/String;IIII)V")
    public void method7130(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method7147(arg3, arg4);
            this.method7228(arg0, arg1 - this.method7128(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("qi.ae(Ljava/lang/String;IIIIIIIII)I")
    public int method7208(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method7156(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @ObfuscatedName("qi.ac(Ljava/lang/String;IIIIIIIIII)I")
    public int method7156(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        if (arg7 == 255) {
            arg7 = 256;
        }
        this.method7147(arg5, arg6);
        field4605 = arg7;
        if (arg10 == 0) {
            arg10 = this.field4594;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field4599 + this.field4595 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method7129(arg0, var12, field4598);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field4595 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field4595 - this.field4599 - (var13 - 1) * arg10) / 2 + this.field4595 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field4599 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field4595 - this.field4599 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field4595 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method7228(field4598[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method7228(field4598[var16], arg1 + (arg3 - this.method7128(field4598[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method7228(field4598[var16], arg1 + arg3 - this.method7128(field4598[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method7228(field4598[var16], arg1, var14);
            } else {
                this.method7149(field4598[var16], arg3);
                this.method7228(field4598[var16], arg1, var14);
                field4606 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @ObfuscatedName("qi.ab(Lqz;IIIII)Lth;")
    public class505 method7139(class418 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0.method7238()) {
            this.method7147(arg3, arg4);
            int var7 = arg2 - this.field4594;
            for (int var8 = 0; var8 < arg0.method7239(); var8++) {
                class416 var9 = arg0.method7253(var8);
                if (arg5 != -1 && var9.field4586 > arg5) {
                    return new class505(var9.field4585, var9.field4586);
                }
                char var10 = var9.field4584;
                if (var10 != '\n') {
                    if (arg0.method7237(var8)) {
                        var10 = '*';
                    }
                    if (var10 != '\t') {
                        if (var10 == 160) {
                            var10 = ' ';
                        }
                        int var11 = var9.field4585 + arg1;
                        int var12 = var9.field4586 + var7;
                        int var13 = this.field4590[var10];
                        int var14 = this.field4589[var10];
                        if (field4600 != -1) {
                            this.method6981(this.field4588[var10], this.field4592[var10] + var11 + 1, this.field4593[var10] + var12 + 1, var13, var14, field4600);
                        }
                        this.method6981(this.field4588[var10], this.field4592[var10] + var11, this.field4593[var10] + var12, var13, var14, field4604);
                    }
                }
            }
        }
        return arg0.method7245();
    }

    @ObfuscatedName("qi.av(Ljava/lang/String;IIIII[I)V")
    public void method7140(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg0 == null) {
            return;
        }
        this.method7147(arg3, arg4);
        int[] var8 = null;
        if (arg6 != null) {
            var8 = this.method7181(arg6, arg0.length());
        }
        int[] var9 = new int[arg0.length()];
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method7219(arg0, arg1 - this.method7128(arg0) / 2, arg2, var8, (int[]) null, var9);
    }

    @ObfuscatedName("qi.ap(Ljava/lang/String;IIIII[I)V")
    public void method7167(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg0 == null) {
            return;
        }
        this.method7147(arg3, arg4);
        int[] var8 = null;
        if (arg6 != null) {
            var8 = this.method7181(arg6, arg0.length());
        }
        int[] var9 = new int[arg0.length()];
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method7219(arg0, arg1 - this.method7128(arg0) / 2, arg2, var8, var9, var10);
    }

    @ObfuscatedName("qi.bu(Ljava/lang/String;IIIIII[I)V")
    public void method7142(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        if (arg0 == null) {
            return;
        }
        this.method7147(arg3, arg4);
        int[] var9 = null;
        if (arg7 != null) {
            var9 = this.method7181(arg7, arg0.length());
        }
        double var10 = 7.0D - (double) arg6 / 8.0D;
        if (var10 < 0.0D) {
            var10 = 0.0D;
        }
        int[] var12 = new int[arg0.length()];
        for (int var13 = 0; var13 < arg0.length(); var13++) {
            var12[var13] = (int) (Math.sin((double) arg5 / 1.0D + (double) var13 / 1.5D) * var10);
        }
        this.method7219(arg0, arg1 - this.method7128(arg0) / 2, arg2, var9, (int[]) null, var12);
    }

    @ObfuscatedName("qi.bo(Ljava/lang/String;IIII[I)V")
    public void method7201(String arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg0 == null) {
            return;
        }
        this.method7147(arg3, arg4);
        int[] var7 = null;
        if (arg5 != null) {
            var7 = this.method7181(arg5, arg0.length());
        }
        this.method7219(arg0, arg1 - this.method7128(arg0) / 2, arg2, var7, (int[]) null, (int[]) null);
    }

    @ObfuscatedName("qi.bd(Ljava/lang/String;IIII[I)V")
    public void method7144(String arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg0 == null) {
            return;
        }
        this.method7147(arg3, arg4);
        int[] var7 = null;
        if (arg5 != null) {
            var7 = this.method7181(arg5, arg0.length());
        }
        this.method7219(arg0, arg1, arg2, var7, (int[]) null, (int[]) null);
    }

    @ObfuscatedName("qi.bi([II)[I")
    public int[] method7181(int[] arg0, int arg1) {
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

    @ObfuscatedName("qi.bq(Ljava/lang/String;IIIII)V")
    public void method7150(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method7147(arg3, arg4);
        field4608.setSeed((long) arg5);
        field4605 = 192 + (field4608.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4608.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method7219(arg0, arg1, arg2, (int[]) null, var7, (int[]) null);
    }

    @ObfuscatedName("qi.ba(II)V")
    public void method7147(int arg0, int arg1) {
        field4587 = -1;
        field4596 = -1;
        field4601 = arg1;
        field4600 = arg1;
        field4603 = arg0;
        field4604 = arg0;
        field4605 = 256;
        field4606 = 0;
        field4609 = 0;
    }

    @ObfuscatedName("qi.bt(Ljava/lang/String;)V")
    public void method7148(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field4604 = class406.method4567(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field4604 = field4603;
            } else if (arg0.startsWith("str=")) {
                field4587 = class406.method4567(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field4587 = 8388608;
            } else if (arg0.equals("/str")) {
                field4587 = -1;
            } else if (arg0.startsWith("u=")) {
                field4596 = class406.method4567(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field4596 = 0;
            } else if (arg0.equals("/u")) {
                field4596 = -1;
            } else if (arg0.startsWith("shad=")) {
                field4600 = class406.method4567(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field4600 = 0;
            } else if (arg0.equals("/shad")) {
                field4600 = field4601;
            } else if (arg0.equals("br")) {
                this.method7147(field4603, field4601);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("qi.bk(Ljava/lang/String;I)V")
    public void method7149(String arg0, int arg1) {
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
            field4606 = (arg1 - this.method7128(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("qi.bm(Ljava/lang/String;II)V")
    public void method7228(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4594;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (Statics.method4036(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class406.method2922(var9.substring(4));
                                        class547 var11 = Statics.field4597[var10];
                                        var11.method8984(arg1, this.field4594 + var4 - var11.field5291);
                                        arg1 += var11.field5294;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method7148(var9);
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
                        if (this.field4591 != null && var6 != -1) {
                            arg1 += this.field4591[(var6 << 8) + var8];
                        }
                        int var13 = this.field4590[var8];
                        int var14 = this.field4589[var8];
                        if (var8 == ' ') {
                            if (field4606 > 0) {
                                field4609 += field4606;
                                arg1 += field4609 >> 8;
                                field4609 &= 0xFF;
                            }
                        } else if (field4605 == 256) {
                            if (field4600 != -1) {
                                method7152(this.field4588[var8], this.field4592[var8] + arg1 + 1, this.field4593[var8] + var4 + 1, var13, var14, field4600);
                            }
                            this.method6981(this.field4588[var8], this.field4592[var8] + arg1, this.field4593[var8] + var4, var13, var14, field4604);
                        } else {
                            if (field4600 != -1) {
                                method7154(this.field4588[var8], this.field4592[var8] + arg1 + 1, this.field4593[var8] + var4 + 1, var13, var14, field4600, field4605);
                            }
                            this.method6977(this.field4588[var8], this.field4592[var8] + arg1, this.field4593[var8] + var4, var13, var14, field4604, field4605);
                        }
                        int var15 = this.field4607[var8];
                        if (field4587 != -1) {
                            method8906(arg1, (int) ((double) this.field4594 * 0.7D) + var4, var15, field4587);
                        }
                        if (field4596 != -1) {
                            method8906(arg1, this.field4594 + var4 + 1, var15, field4596);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("qi.bw(Ljava/lang/String;II[I[I[I)V")
    public void method7219(String arg0, int arg1, int arg2, int[] arg3, int[] arg4, int[] arg5) {
        int var7 = arg2 - this.field4594;
        int var8 = -1;
        int var9 = -1;
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            if (arg0.charAt(var11) != 0) {
                char var12 = (char) (Statics.method4036(arg0.charAt(var11)) & 0xFF);
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
                                        int var16 = class406.method2922(var13.substring(4));
                                        class547 var17 = Statics.field4597[var16];
                                        var17.method8984(arg1 + var14, this.field4594 + var7 - var17.field5291 + var15);
                                        arg1 += var17.field5294;
                                        var9 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method7148(var13);
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
                        if (this.field4591 != null && var9 != -1) {
                            arg1 += this.field4591[(var9 << 8) + var12];
                        }
                        int var19 = this.field4590[var12];
                        int var20 = this.field4589[var12];
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
                            var23 = field4604;
                        } else {
                            var23 = arg3[var10];
                        }
                        var10++;
                        if (var12 == ' ') {
                            if (field4606 > 0) {
                                field4609 += field4606;
                                arg1 += field4609 >> 8;
                                field4609 &= 0xFF;
                            }
                        } else if (field4605 == 256) {
                            if (field4600 != -1) {
                                method7152(this.field4588[var12], this.field4592[var12] + arg1 + 1 + var21, this.field4593[var12] + var7 + 1 + var22, var19, var20, field4600);
                            }
                            this.method6981(this.field4588[var12], this.field4592[var12] + arg1 + var21, this.field4593[var12] + var7 + var22, var19, var20, var23);
                        } else {
                            if (field4600 != -1) {
                                method7154(this.field4588[var12], this.field4592[var12] + arg1 + 1 + var21, this.field4593[var12] + var7 + 1 + var22, var19, var20, field4600, field4605);
                            }
                            this.method6977(this.field4588[var12], this.field4592[var12] + arg1 + var21, this.field4593[var12] + var7 + var22, var19, var20, var23, field4605);
                        }
                        int var24 = this.field4607[var12];
                        if (field4587 != -1) {
                            method8906(arg1, (int) ((double) this.field4594 * 0.7D) + var7, var24, field4587);
                        }
                        if (field4596 != -1) {
                            method8906(arg1, this.field4594 + var7, var24, field4596);
                        }
                        arg1 += var24;
                        var9 = var12;
                    }
                }
            }
        }
    }

    @ObfuscatedName("qi.bv([BIIIII)V")
    public static void method7152(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field5271 * arg2 + arg1;
        int var7 = Statics.field5271 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field5277) {
            int var10 = field5277 - arg2;
            arg4 -= var10;
            arg2 = field5277;
            var9 += arg3 * var10;
            var6 += Statics.field5271 * var10;
        }
        if (arg2 + arg4 > field5274) {
            arg4 -= arg2 + arg4 - field5274;
        }
        if (arg1 < field5273) {
            int var11 = field5273 - arg1;
            arg3 -= var11;
            arg1 = field5273;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field5278) {
            int var12 = arg1 + arg3 - field5278;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method7153(Statics.field5276, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("qi.by([I[BIIIIIII)V")
    public static void method7153(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("qi.bb([BIIIIII)V")
    public static void method7154(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field5271 * arg2 + arg1;
        int var8 = Statics.field5271 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field5277) {
            int var11 = field5277 - arg2;
            arg4 -= var11;
            arg2 = field5277;
            var10 += arg3 * var11;
            var7 += Statics.field5271 * var11;
        }
        if (arg2 + arg4 > field5274) {
            arg4 -= arg2 + arg4 - field5274;
        }
        if (arg1 < field5273) {
            int var12 = field5273 - arg1;
            arg3 -= var12;
            arg1 = field5273;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field5278) {
            int var13 = arg1 + arg3 - field5278;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method7155(Statics.field5276, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("qi.bn([I[BIIIIIIII)V")
    public static void method7155(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("qi.aq([BIIIII)V")
    public abstract void method6981(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("qi.aw([BIIIIII)V")
    public abstract void method6977(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
