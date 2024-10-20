package deob;

import java.util.Random;

@ObfuscatedName("qa")
public abstract class class440 extends class568 {

    @ObfuscatedName("qa.aw")
    public byte[][] field4844 = new byte[256][];

    @ObfuscatedName("qa.ak")
    public int[] field4845;

    @ObfuscatedName("qa.aj")
    public int[] field4853;

    @ObfuscatedName("qa.ai")
    public int[] field4847;

    @ObfuscatedName("qa.ay")
    public int[] field4848;

    @ObfuscatedName("qa.as")
    public int[] field4849;

    @ObfuscatedName("qa.ae")
    public int field4851 = 0;

    @ObfuscatedName("qa.am")
    public int field4843;

    @ObfuscatedName("qa.at")
    public int field4852;

    @ObfuscatedName("qa.an")
    public byte[] field4854;

    @ObfuscatedName("qa.ao")
    public static int field4855 = -1;

    @ObfuscatedName("qa.af")
    public static int field4856 = -1;

    @ObfuscatedName("qa.ar")
    public static int field4857 = -1;

    @ObfuscatedName("qa.ab")
    public static int field4858 = -1;

    @ObfuscatedName("qa.az")
    public static int field4859 = 0;

    @ObfuscatedName("qa.ag")
    public static int field4860 = 0;

    @ObfuscatedName("qa.ad")
    public static int field4861 = 256;

    @ObfuscatedName("qa.ac")
    public static int field4846 = 0;

    @ObfuscatedName("qa.av")
    public static int field4863 = 0;

    @ObfuscatedName("qa.ax")
    public static Random field4864 = new Random();

    @ObfuscatedName("qa.aq")
    public static String[] field4865 = new String[100];

    public class440(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        this.field4848 = arg1;
        this.field4849 = arg2;
        this.field4853 = arg3;
        this.field4847 = arg4;
        this.method7923(arg0);
        this.field4844 = arg5;
        int var7 = Integer.MAX_VALUE;
        int var8 = Integer.MIN_VALUE;
        for (int var9 = 0; var9 < 256; var9++) {
            if (this.field4849[var9] < var7 && this.field4847[var9] != 0) {
                var7 = this.field4849[var9];
            }
            if (this.field4849[var9] + this.field4847[var9] > var8) {
                var8 = this.field4849[var9] + this.field4847[var9];
            }
        }
        this.field4843 = this.field4851 - var7;
        this.field4852 = var8 - this.field4851;
    }

    public class440(byte[] arg0) {
        this.method7923(arg0);
    }

    @ObfuscatedName("qa.as([B)V")
    public void method7923(byte[] arg0) {
        this.field4845 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4845.length; var2++) {
                this.field4845[var2] = arg0[var2] & 0xFF;
            }
            this.field4851 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4845[var4] = arg0[var3++] & 0xFF;
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
        this.field4854 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4854[(var17 << 8) + var18] = (byte) method7922(var9, var13, var6, this.field4845, var5, var17, var18);
                    }
                }
            }
        }
        this.field4851 = var5[32] + var6[32];
    }

    @ObfuscatedName("qa.ae([[B[[B[I[I[III)I")
    public static int method7922(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("qa.am(C)I")
    public int method7929(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4845[class418.method813(arg0) & 0xFF];
    }

    @ObfuscatedName("qa.at(Ljava/lang/String;)I")
    public int method7933(String arg0) {
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
                                    int var8 = class420.method434(var7.substring(4));
                                    var4 += Statics.field4862[var8].field5555;
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
                    var4 += this.field4845[(char) (class418.method813(var6) & 0xFF)];
                    if (this.field4854 != null && var3 != -1) {
                        var4 += this.field4854[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("qa.au(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method7927(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method7929('<');
                        if (this.field4854 != null && var11 != -1) {
                            var4 += this.field4854[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method7929('>');
                        if (this.field4854 != null && var11 != -1) {
                            var4 += this.field4854[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class420.method434(var16.substring(4));
                            var4 += Statics.field4862[var17].field5555;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method7929(var15);
                        if (this.field4854 != null && var11 != -1) {
                            var4 += this.field4854[(var11 << 8) + var15];
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

    @ObfuscatedName("qa.an(Ljava/lang/String;I)I")
    public int method7928(String arg0, int arg1) {
        int var3 = this.method7927(arg0, new int[] { arg1 }, field4865);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method7933(field4865[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("qa.ao(Ljava/lang/String;I)I")
    public int method7931(String arg0, int arg1) {
        return this.method7927(arg0, new int[] { arg1 }, field4865);
    }

    @ObfuscatedName("qa.af(Ljava/lang/String;)Ljava/lang/String;")
    public static String method7930(String arg0) {
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

    @ObfuscatedName("qa.ar(IILjava/lang/String;II)Lqg;")
    public class424 method7959(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class424(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method7933(arg2) / 2;
        int var7 = var6 + this.method7933(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4843;
        int var9 = this.method7933(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4852 + this.field4843;
        return new class424(var7, var8, var9, var10);
    }

    @ObfuscatedName("qa.ab(Ljava/lang/String;IIII)V")
    public void method7932(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method7962(arg3, arg4);
            this.method8010(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("qa.az(Ljava/lang/String;IIIII)V")
    public void method7926(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method7962(arg3, arg4);
            field4861 = arg5;
            this.method8010(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("qa.ag(Ljava/lang/String;IIII)V")
    public void method7934(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method7962(arg3, arg4);
            this.method8010(arg0, arg1 - this.method7933(arg0), arg2);
        }
    }

    @ObfuscatedName("qa.ad(Ljava/lang/String;IIII)V")
    public void method7935(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method7962(arg3, arg4);
            this.method8010(arg0, arg1 - this.method7933(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("qa.ac(Ljava/lang/String;IIIIIIIII)I")
    public int method8009(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method7994(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @ObfuscatedName("qa.av(Ljava/lang/String;IIIIIIIIII)I")
    public int method7994(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        if (arg7 == 255) {
            arg7 = 256;
        }
        this.method7962(arg5, arg6);
        field4861 = arg7;
        if (arg10 == 0) {
            arg10 = this.field4851;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field4852 + this.field4843 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method7927(arg0, var12, field4865);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field4843 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field4843 - this.field4852 - (var13 - 1) * arg10) / 2 + this.field4843 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field4852 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field4843 - this.field4852 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field4843 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method8010(field4865[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method8010(field4865[var16], arg1 + (arg3 - this.method7933(field4865[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method8010(field4865[var16], arg1 + arg3 - this.method7933(field4865[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method8010(field4865[var16], arg1, var14);
            } else {
                this.method7949(field4865[var16], arg3);
                this.method8010(field4865[var16], arg1, var14);
                field4846 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @ObfuscatedName("qa.ax(Lqb;IIIII)Luy;")
    public class528 method7938(class441 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0.method8038()) {
            this.method7962(arg3, arg4);
            int var7 = arg2 - this.field4851;
            for (int var8 = 0; var8 < arg0.method8023(); var8++) {
                class439 var9 = arg0.method8027(var8);
                if (arg5 != -1 && var9.field4842 > arg5) {
                    return new class528(var9.field4841, var9.field4842);
                }
                char var10 = var9.field4840;
                if (var10 != '\n') {
                    if (arg0.method8021(var8)) {
                        var10 = '*';
                    }
                    if (var10 != '\t') {
                        if (var10 == 160) {
                            var10 = ' ';
                        }
                        int var11 = var9.field4841 + arg1;
                        int var12 = var9.field4842 + var7;
                        int var13 = this.field4853[var10];
                        int var14 = this.field4847[var10];
                        if (field4858 != -1) {
                            this.method7770(this.field4844[var10], this.field4848[var10] + var11 + 1, this.field4849[var10] + var12 + 1, var13, var14, field4858);
                        }
                        this.method7770(this.field4844[var10], this.field4848[var10] + var11, this.field4849[var10] + var12, var13, var14, field4860);
                    }
                }
            }
        }
        return arg0.method8026();
    }

    @ObfuscatedName("qa.aq(Ljava/lang/String;IIIII[I)V")
    public void method8018(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg0 == null) {
            return;
        }
        this.method7962(arg3, arg4);
        int[] var8 = null;
        if (arg6 != null) {
            var8 = this.method7944(arg6, arg0.length());
        }
        int[] var9 = new int[arg0.length()];
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method7951(arg0, arg1 - this.method7933(arg0) / 2, arg2, var8, (int[]) null, var9);
    }

    @ObfuscatedName("qa.al(Ljava/lang/String;IIIII[I)V")
    public void method7940(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg0 == null) {
            return;
        }
        this.method7962(arg3, arg4);
        int[] var8 = null;
        if (arg6 != null) {
            var8 = this.method7944(arg6, arg0.length());
        }
        int[] var9 = new int[arg0.length()];
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method7951(arg0, arg1 - this.method7933(arg0) / 2, arg2, var8, var9, var10);
    }

    @ObfuscatedName("qa.aa(Ljava/lang/String;IIIIII[I)V")
    public void method7941(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        if (arg0 == null) {
            return;
        }
        this.method7962(arg3, arg4);
        int[] var9 = null;
        if (arg7 != null) {
            var9 = this.method7944(arg7, arg0.length());
        }
        double var10 = 7.0D - (double) arg6 / 8.0D;
        if (var10 < 0.0D) {
            var10 = 0.0D;
        }
        int[] var12 = new int[arg0.length()];
        for (int var13 = 0; var13 < arg0.length(); var13++) {
            var12[var13] = (int) (Math.sin((double) arg5 / 1.0D + (double) var13 / 1.5D) * var10);
        }
        this.method7951(arg0, arg1 - this.method7933(arg0) / 2, arg2, var9, (int[]) null, var12);
    }

    @ObfuscatedName("qa.ah(Ljava/lang/String;IIII[I)V")
    public void method7967(String arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg0 == null) {
            return;
        }
        this.method7962(arg3, arg4);
        int[] var7 = null;
        if (arg5 != null) {
            var7 = this.method7944(arg5, arg0.length());
        }
        this.method7951(arg0, arg1 - this.method7933(arg0) / 2, arg2, var7, (int[]) null, (int[]) null);
    }

    @ObfuscatedName("qa.bh(Ljava/lang/String;IIII[I)V")
    public void method7943(String arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg0 == null) {
            return;
        }
        this.method7962(arg3, arg4);
        int[] var7 = null;
        if (arg5 != null) {
            var7 = this.method7944(arg5, arg0.length());
        }
        this.method7951(arg0, arg1, arg2, var7, (int[]) null, (int[]) null);
    }

    @ObfuscatedName("qa.bj([II)[I")
    public int[] method7944(int[] arg0, int arg1) {
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

    @ObfuscatedName("qa.bv(Ljava/lang/String;IIIII)V")
    public void method7945(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method7962(arg3, arg4);
        field4864.setSeed((long) arg5);
        field4861 = 192 + (field4864.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4864.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method7951(arg0, arg1, arg2, (int[]) null, var7, (int[]) null);
    }

    @ObfuscatedName("qa.bx(IIII)V")
    public void method7946(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 - this.field4851;
        int var6 = arg0 & 0xFF;
        if (var6 != 32) {
            this.method7770(this.field4844[var6], this.field4848[var6] + arg1, this.field4849[var6] + var5, this.field4853[var6], this.field4847[var6], arg3);
        }
    }

    @ObfuscatedName("qa.bk(II)V")
    public void method7962(int arg0, int arg1) {
        field4855 = -1;
        field4856 = -1;
        field4857 = arg1;
        field4858 = arg1;
        field4859 = arg0;
        field4860 = arg0;
        field4861 = 256;
        field4846 = 0;
        field4863 = 0;
    }

    @ObfuscatedName("qa.bb(Ljava/lang/String;)V")
    public void method7939(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field4860 = class420.method5894(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field4860 = field4859;
            } else if (arg0.startsWith("str=")) {
                field4855 = class420.method5894(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field4855 = 8388608;
            } else if (arg0.equals("/str")) {
                field4855 = -1;
            } else if (arg0.startsWith("u=")) {
                field4856 = class420.method5894(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field4856 = 0;
            } else if (arg0.equals("/u")) {
                field4856 = -1;
            } else if (arg0.startsWith("shad=")) {
                field4858 = class420.method5894(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field4858 = 0;
            } else if (arg0.equals("/shad")) {
                field4858 = field4857;
            } else if (arg0.equals("br")) {
                this.method7962(field4859, field4857);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("qa.bq(Ljava/lang/String;I)V")
    public void method7949(String arg0, int arg1) {
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
            field4846 = (arg1 - this.method7933(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("qa.bp(Ljava/lang/String;II)V")
    public void method8010(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4851;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class418.method813(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class420.method434(var9.substring(4));
                                        class571 var11 = Statics.field4862[var10];
                                        var11.method9720(arg1, this.field4851 + var4 - var11.field5556);
                                        arg1 += var11.field5555;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method7939(var9);
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
                        if (this.field4854 != null && var6 != -1) {
                            arg1 += this.field4854[(var6 << 8) + var8];
                        }
                        int var13 = this.field4853[var8];
                        int var14 = this.field4847[var8];
                        if (var8 == ' ') {
                            if (field4846 > 0) {
                                field4863 += field4846;
                                arg1 += field4863 >> 8;
                                field4863 &= 0xFF;
                            }
                        } else if (field4861 == 256) {
                            if (field4858 != -1) {
                                method7952(this.field4844[var8], this.field4848[var8] + arg1 + 1, this.field4849[var8] + var4 + 1, var13, var14, field4858);
                            }
                            this.method7770(this.field4844[var8], this.field4848[var8] + arg1, this.field4849[var8] + var4, var13, var14, field4860);
                        } else {
                            if (field4858 != -1) {
                                method7954(this.field4844[var8], this.field4848[var8] + arg1 + 1, this.field4849[var8] + var4 + 1, var13, var14, field4858, field4861);
                            }
                            this.method7769(this.field4844[var8], this.field4848[var8] + arg1, this.field4849[var8] + var4, var13, var14, field4860, field4861);
                        }
                        int var15 = this.field4845[var8];
                        if (field4855 != -1) {
                            method9622(arg1, (int) ((double) this.field4851 * 0.7D) + var4, var15, field4855);
                        }
                        if (field4856 != -1) {
                            method9622(arg1, this.field4851 + var4 + 1, var15, field4856);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("qa.bz(Ljava/lang/String;II[I[I[I)V")
    public void method7951(String arg0, int arg1, int arg2, int[] arg3, int[] arg4, int[] arg5) {
        int var7 = arg2 - this.field4851;
        int var8 = -1;
        int var9 = -1;
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            if (arg0.charAt(var11) != 0) {
                char var12 = (char) (class418.method813(arg0.charAt(var11)) & 0xFF);
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
                                        int var16 = class420.method434(var13.substring(4));
                                        class571 var17 = Statics.field4862[var16];
                                        var17.method9720(arg1 + var14, this.field4851 + var7 - var17.field5556 + var15);
                                        arg1 += var17.field5555;
                                        var9 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method7939(var13);
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
                        if (this.field4854 != null && var9 != -1) {
                            arg1 += this.field4854[(var9 << 8) + var12];
                        }
                        int var19 = this.field4853[var12];
                        int var20 = this.field4847[var12];
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
                            var23 = field4860;
                        } else {
                            var23 = arg3[var10];
                        }
                        var10++;
                        if (var12 == ' ') {
                            if (field4846 > 0) {
                                field4863 += field4846;
                                arg1 += field4863 >> 8;
                                field4863 &= 0xFF;
                            }
                        } else if (field4861 == 256) {
                            if (field4858 != -1) {
                                method7952(this.field4844[var12], this.field4848[var12] + arg1 + 1 + var21, this.field4849[var12] + var7 + 1 + var22, var19, var20, field4858);
                            }
                            this.method7770(this.field4844[var12], this.field4848[var12] + arg1 + var21, this.field4849[var12] + var7 + var22, var19, var20, var23);
                        } else {
                            if (field4858 != -1) {
                                method7954(this.field4844[var12], this.field4848[var12] + arg1 + 1 + var21, this.field4849[var12] + var7 + 1 + var22, var19, var20, field4858, field4861);
                            }
                            this.method7769(this.field4844[var12], this.field4848[var12] + arg1 + var21, this.field4849[var12] + var7 + var22, var19, var20, var23, field4861);
                        }
                        int var24 = this.field4845[var12];
                        if (field4855 != -1) {
                            method9622(arg1, (int) ((double) this.field4851 * 0.7D) + var7, var24, field4855);
                        }
                        if (field4856 != -1) {
                            method9622(arg1, this.field4851 + var7, var24, field4856);
                        }
                        arg1 += var24;
                        var9 = var12;
                    }
                }
            }
        }
    }

    @ObfuscatedName("qa.bc([BIIIII)V")
    public static void method7952(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field5532 * arg2 + arg1;
        int var7 = Statics.field5532 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field5536) {
            int var10 = field5536 - arg2;
            arg4 -= var10;
            arg2 = field5536;
            var9 += arg3 * var10;
            var6 += Statics.field5532 * var10;
        }
        if (arg2 + arg4 > field5537) {
            arg4 -= arg2 + arg4 - field5537;
        }
        if (arg1 < field5538) {
            int var11 = field5538 - arg1;
            arg3 -= var11;
            arg1 = field5538;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field5539) {
            int var12 = arg1 + arg3 - field5539;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method7953(Statics.field5533, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("qa.by([I[BIIIIIII)V")
    public static void method7953(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("qa.br([BIIIIII)V")
    public static void method7954(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field5532 * arg2 + arg1;
        int var8 = Statics.field5532 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field5536) {
            int var11 = field5536 - arg2;
            arg4 -= var11;
            arg2 = field5536;
            var10 += arg3 * var11;
            var7 += Statics.field5532 * var11;
        }
        if (arg2 + arg4 > field5537) {
            arg4 -= arg2 + arg4 - field5537;
        }
        if (arg1 < field5538) {
            int var12 = field5538 - arg1;
            arg3 -= var12;
            arg1 = field5538;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field5539) {
            int var13 = arg1 + arg3 - field5539;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method7955(Statics.field5533, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("qa.bn([I[BIIIIIIII)V")
    public static void method7955(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("qa.ap([BIIIII)V")
    public abstract void method7770(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("qa.aw([BIIIIII)V")
    public abstract void method7769(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
