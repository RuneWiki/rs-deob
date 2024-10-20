package deob;

import java.util.Random;

@ObfuscatedName("pn")
public abstract class class396 extends class511 {

    @ObfuscatedName("pn.an")
    public byte[][] field4446 = new byte[256][];

    @ObfuscatedName("pn.av")
    public int[] field4458;

    @ObfuscatedName("pn.as")
    public int[] field4448;

    @ObfuscatedName("pn.ax")
    public int[] field4461;

    @ObfuscatedName("pn.ap")
    public int[] field4450;

    @ObfuscatedName("pn.ab")
    public int[] field4451;

    @ObfuscatedName("pn.ak")
    public int field4447 = 0;

    @ObfuscatedName("pn.ae")
    public int field4453;

    @ObfuscatedName("pn.af")
    public int field4454;

    @ObfuscatedName("pn.aa")
    public byte[] field4456;

    @ObfuscatedName("pn.aj")
    public static int field4457 = -1;

    @ObfuscatedName("pn.ad")
    public static int field4445 = -1;

    @ObfuscatedName("pn.ac")
    public static int field4459 = -1;

    @ObfuscatedName("pn.ag")
    public static int field4460 = -1;

    @ObfuscatedName("pn.ar")
    public static int field4462 = 0;

    @ObfuscatedName("pn.ah")
    public static int field4467 = 0;

    @ObfuscatedName("pn.az")
    public static int field4463 = 256;

    @ObfuscatedName("pn.au")
    public static int field4464 = 0;

    @ObfuscatedName("pn.ai")
    public static int field4465 = 0;

    @ObfuscatedName("pn.aq")
    public static Random field4466 = new Random();

    @ObfuscatedName("pn.aw")
    public static String[] field4449 = new String[100];

    public class396(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field4450 = arg1;
        this.field4451 = arg2;
        this.field4448 = arg3;
        this.field4461 = arg4;
        this.method6773(arg0);
        this.field4446 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field4451[var10] < var8 && this.field4461[var10] != 0) {
                var8 = this.field4451[var10];
            }
            if (this.field4461[var10] + this.field4451[var10] > var9) {
                var9 = this.field4461[var10] + this.field4451[var10];
            }
        }
        this.field4453 = this.field4447 - var8;
        this.field4454 = var9 - this.field4447;
    }

    public class396(byte[] arg0) {
        this.method6773(arg0);
    }

    @ObfuscatedName("pn.aa([B)V")
    public void method6773(byte[] arg0) {
        this.field4458 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4458.length; var2++) {
                this.field4458[var2] = arg0[var2] & 0xFF;
            }
            this.field4447 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4458[var4] = arg0[var3++] & 0xFF;
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
        this.field4456 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4456[(var17 << 8) + var18] = (byte) method6836(var9, var13, var6, this.field4458, var5, var17, var18);
                    }
                }
            }
        }
        this.field4447 = var5[32] + var6[32];
    }

    @ObfuscatedName("pn.aj([[B[[B[I[I[III)I")
    public static int method6836(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("pn.ad(C)I")
    public int method6774(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4458[class383.method4759(arg0) & 0xFF];
    }

    @ObfuscatedName("pn.ac(Ljava/lang/String;)I")
    public int method6775(String arg0) {
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
                                    int var8 = class385.method4380(var7.substring(4));
                                    var4 += Statics.field4455[var8].field5112;
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
                    var4 += this.field4458[(char) (class383.method4759(var6) & 0xFF)];
                    if (this.field4456 != null && var3 != -1) {
                        var4 += this.field4456[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("pn.ag(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method6816(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method6774('<');
                        if (this.field4456 != null && var11 != -1) {
                            var4 += this.field4456[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method6774('>');
                        if (this.field4456 != null && var11 != -1) {
                            var4 += this.field4456[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class385.method4380(var16.substring(4));
                            var4 += Statics.field4455[var17].field5112;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method6774(var15);
                        if (this.field4456 != null && var11 != -1) {
                            var4 += this.field4456[(var11 << 8) + var15];
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

    @ObfuscatedName("pn.ar(Ljava/lang/String;I)I")
    public int method6798(String arg0, int arg1) {
        int var3 = this.method6816(arg0, new int[] { arg1 }, field4449);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method6775(field4449[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("pn.ah(Ljava/lang/String;I)I")
    public int method6778(String arg0, int arg1) {
        return this.method6816(arg0, new int[] { arg1 }, field4449);
    }

    @ObfuscatedName("pn.az(Ljava/lang/String;)Ljava/lang/String;")
    public static String method6779(String arg0) {
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

    @ObfuscatedName("pn.au(IILjava/lang/String;II)Lqs;")
    public class434 method6780(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class434(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method6775(arg2) / 2;
        int var7 = var6 + this.method6775(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4453;
        int var9 = this.method6775(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4454 + this.field4453;
        return new class434(var7, var8, var9, var10);
    }

    @ObfuscatedName("pn.ai(Ljava/lang/String;IIII)V")
    public void method6828(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6794(arg3, arg4);
            this.method6797(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("pn.aq(Ljava/lang/String;IIIII)V")
    public void method6795(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method6794(arg3, arg4);
            field4463 = arg5;
            this.method6797(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("pn.aw(Ljava/lang/String;IIII)V")
    public void method6804(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6794(arg3, arg4);
            this.method6797(arg0, arg1 - this.method6775(arg0), arg2);
        }
    }

    @ObfuscatedName("pn.ay(Ljava/lang/String;IIII)V")
    public void method6784(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6794(arg3, arg4);
            this.method6797(arg0, arg1 - this.method6775(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("pn.al(Ljava/lang/String;IIIIIIIII)I")
    public int method6785(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method6786(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @ObfuscatedName("pn.am(Ljava/lang/String;IIIIIIIIII)I")
    public int method6786(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        if (arg7 == 255) {
            arg7 = 256;
        }
        this.method6794(arg5, arg6);
        field4463 = arg7;
        if (arg10 == 0) {
            arg10 = this.field4447;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field4454 + this.field4453 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method6816(arg0, var12, field4449);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field4453 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field4453 - this.field4454 - (var13 - 1) * arg10) / 2 + this.field4453 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field4454 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field4453 - this.field4454 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field4453 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method6797(field4449[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method6797(field4449[var16], arg1 + (arg3 - this.method6775(field4449[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method6797(field4449[var16], arg1 + arg3 - this.method6775(field4449[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method6797(field4449[var16], arg1, var14);
            } else {
                this.method6796(field4449[var16], arg3);
                this.method6797(field4449[var16], arg1, var14);
                field4464 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @ObfuscatedName("pn.bs(Lpw;IIIII)Lsf;")
    public class474 method6787(class397 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0.method6876()) {
            this.method6794(arg3, arg4);
            int var7 = arg2 - this.field4447;
            for (int var8 = 0; var8 < arg0.method6894(); var8++) {
                class395 var9 = arg0.method6881(var8);
                if (arg5 != -1 && var9.field4441 > arg5) {
                    return new class474(var9.field4442, var9.field4441);
                }
                char var10 = var9.field4439;
                if (var10 != '\n') {
                    if (arg0.method6887(var8)) {
                        var10 = '*';
                    }
                    if (var10 != '\t') {
                        if (var10 == 160) {
                            var10 = ' ';
                        }
                        int var11 = var9.field4442 + arg1;
                        int var12 = var9.field4441 + var7;
                        int var13 = this.field4448[var10];
                        int var14 = this.field4461[var10];
                        if (field4460 != -1) {
                            this.method6606(this.field4446[var10], this.field4450[var10] + var11 + 1, this.field4451[var10] + var12 + 1, var13, var14, field4460);
                        }
                        this.method6606(this.field4446[var10], this.field4450[var10] + var11, this.field4451[var10] + var12, var13, var14, field4467);
                    }
                }
            }
        }
        return arg0.method6886();
    }

    @ObfuscatedName("pn.bc(Ljava/lang/String;IIIII[I)V")
    public void method6788(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg0 == null) {
            return;
        }
        this.method6794(arg3, arg4);
        int[] var8 = null;
        if (arg6 != null) {
            var8 = this.method6792(arg6, arg0.length());
        }
        int[] var9 = new int[arg0.length()];
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method6870(arg0, arg1 - this.method6775(arg0) / 2, arg2, var8, (int[]) null, var9);
    }

    @ObfuscatedName("pn.bj(Ljava/lang/String;IIIII[I)V")
    public void method6789(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg0 == null) {
            return;
        }
        this.method6794(arg3, arg4);
        int[] var8 = null;
        if (arg6 != null) {
            var8 = this.method6792(arg6, arg0.length());
        }
        int[] var9 = new int[arg0.length()];
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method6870(arg0, arg1 - this.method6775(arg0) / 2, arg2, var8, var9, var10);
    }

    @ObfuscatedName("pn.bo(Ljava/lang/String;IIIIII[I)V")
    public void method6834(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        if (arg0 == null) {
            return;
        }
        this.method6794(arg3, arg4);
        int[] var9 = null;
        if (arg7 != null) {
            var9 = this.method6792(arg7, arg0.length());
        }
        double var10 = 7.0D - (double) arg6 / 8.0D;
        if (var10 < 0.0D) {
            var10 = 0.0D;
        }
        int[] var12 = new int[arg0.length()];
        for (int var13 = 0; var13 < arg0.length(); var13++) {
            var12[var13] = (int) (Math.sin((double) arg5 / 1.0D + (double) var13 / 1.5D) * var10);
        }
        this.method6870(arg0, arg1 - this.method6775(arg0) / 2, arg2, var9, (int[]) null, var12);
    }

    @ObfuscatedName("pn.bq(Ljava/lang/String;IIII[I)V")
    public void method6772(String arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6794(arg3, arg4);
        int[] var7 = null;
        if (arg5 != null) {
            var7 = this.method6792(arg5, arg0.length());
        }
        this.method6870(arg0, arg1 - this.method6775(arg0) / 2, arg2, var7, (int[]) null, (int[]) null);
    }

    @ObfuscatedName("pn.bg(Ljava/lang/String;IIII[I)V")
    public void method6790(String arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6794(arg3, arg4);
        int[] var7 = null;
        if (arg5 != null) {
            var7 = this.method6792(arg5, arg0.length());
        }
        this.method6870(arg0, arg1, arg2, var7, (int[]) null, (int[]) null);
    }

    @ObfuscatedName("pn.bf([II)[I")
    public int[] method6792(int[] arg0, int arg1) {
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

    @ObfuscatedName("pn.bd(Ljava/lang/String;IIIII)V")
    public void method6783(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6794(arg3, arg4);
        field4466.setSeed((long) arg5);
        field4463 = 192 + (field4466.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4466.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method6870(arg0, arg1, arg2, (int[]) null, var7, (int[]) null);
    }

    @ObfuscatedName("pn.ba(II)V")
    public void method6794(int arg0, int arg1) {
        field4457 = -1;
        field4445 = -1;
        field4459 = arg1;
        field4460 = arg1;
        field4462 = arg0;
        field4467 = arg0;
        field4463 = 256;
        field4464 = 0;
        field4465 = 0;
    }

    @ObfuscatedName("pn.bn(Ljava/lang/String;)V")
    public void method6791(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field4467 = class385.method2962(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field4467 = field4462;
            } else if (arg0.startsWith("str=")) {
                field4457 = class385.method2962(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field4457 = 8388608;
            } else if (arg0.equals("/str")) {
                field4457 = -1;
            } else if (arg0.startsWith("u=")) {
                field4445 = class385.method2962(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field4445 = 0;
            } else if (arg0.equals("/u")) {
                field4445 = -1;
            } else if (arg0.startsWith("shad=")) {
                field4460 = class385.method2962(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field4460 = 0;
            } else if (arg0.equals("/shad")) {
                field4460 = field4459;
            } else if (arg0.equals("br")) {
                this.method6794(field4462, field4459);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("pn.bb(Ljava/lang/String;I)V")
    public void method6796(String arg0, int arg1) {
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
            field4464 = (arg1 - this.method6775(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("pn.bx(Ljava/lang/String;II)V")
    public void method6797(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4447;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class383.method4759(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class385.method4380(var9.substring(4));
                                        class514 var11 = Statics.field4455[var10];
                                        var11.method8564(arg1, this.field4447 + var4 - var11.field5113);
                                        arg1 += var11.field5112;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method6791(var9);
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
                        if (this.field4456 != null && var6 != -1) {
                            arg1 += this.field4456[(var6 << 8) + var8];
                        }
                        int var13 = this.field4448[var8];
                        int var14 = this.field4461[var8];
                        if (var8 == ' ') {
                            if (field4464 > 0) {
                                field4465 += field4464;
                                arg1 += field4465 >> 8;
                                field4465 &= 0xFF;
                            }
                        } else if (field4463 == 256) {
                            if (field4460 != -1) {
                                method6800(this.field4446[var8], this.field4450[var8] + arg1 + 1, this.field4451[var8] + var4 + 1, var13, var14, field4460);
                            }
                            this.method6606(this.field4446[var8], this.field4450[var8] + arg1, this.field4451[var8] + var4, var13, var14, field4467);
                        } else {
                            if (field4460 != -1) {
                                method6838(this.field4446[var8], this.field4450[var8] + arg1 + 1, this.field4451[var8] + var4 + 1, var13, var14, field4460, field4463);
                            }
                            this.method6614(this.field4446[var8], this.field4450[var8] + arg1, this.field4451[var8] + var4, var13, var14, field4467, field4463);
                        }
                        int var15 = this.field4458[var8];
                        if (field4457 != -1) {
                            method8474(arg1, (int) ((double) this.field4447 * 0.7D) + var4, var15, field4457);
                        }
                        if (field4445 != -1) {
                            method8474(arg1, this.field4447 + var4 + 1, var15, field4445);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("pn.be(Ljava/lang/String;II[I[I[I)V")
    public void method6870(String arg0, int arg1, int arg2, int[] arg3, int[] arg4, int[] arg5) {
        int var7 = arg2 - this.field4447;
        int var8 = -1;
        int var9 = -1;
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            if (arg0.charAt(var11) != 0) {
                char var12 = (char) (class383.method4759(arg0.charAt(var11)) & 0xFF);
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
                                        int var16 = class385.method4380(var13.substring(4));
                                        class514 var17 = Statics.field4455[var16];
                                        var17.method8564(arg1 + var14, this.field4447 + var7 - var17.field5113 + var15);
                                        arg1 += var17.field5112;
                                        var9 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method6791(var13);
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
                        if (this.field4456 != null && var9 != -1) {
                            arg1 += this.field4456[(var9 << 8) + var12];
                        }
                        int var19 = this.field4448[var12];
                        int var20 = this.field4461[var12];
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
                            var23 = field4467;
                        } else {
                            var23 = arg3[var10];
                        }
                        var10++;
                        if (var12 == ' ') {
                            if (field4464 > 0) {
                                field4465 += field4464;
                                arg1 += field4465 >> 8;
                                field4465 &= 0xFF;
                            }
                        } else if (field4463 == 256) {
                            if (field4460 != -1) {
                                method6800(this.field4446[var12], this.field4450[var12] + arg1 + 1 + var21, this.field4451[var12] + var7 + 1 + var22, var19, var20, field4460);
                            }
                            this.method6606(this.field4446[var12], this.field4450[var12] + arg1 + var21, this.field4451[var12] + var7 + var22, var19, var20, var23);
                        } else {
                            if (field4460 != -1) {
                                method6838(this.field4446[var12], this.field4450[var12] + arg1 + 1 + var21, this.field4451[var12] + var7 + 1 + var22, var19, var20, field4460, field4463);
                            }
                            this.method6614(this.field4446[var12], this.field4450[var12] + arg1 + var21, this.field4451[var12] + var7 + var22, var19, var20, var23, field4463);
                        }
                        int var24 = this.field4458[var12];
                        if (field4457 != -1) {
                            method8474(arg1, (int) ((double) this.field4447 * 0.7D) + var7, var24, field4457);
                        }
                        if (field4445 != -1) {
                            method8474(arg1, this.field4447 + var7, var24, field4445);
                        }
                        arg1 += var24;
                        var9 = var12;
                    }
                }
            }
        }
    }

    @ObfuscatedName("pn.bh([BIIIII)V")
    public static void method6800(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field5086 * arg2 + arg1;
        int var7 = Statics.field5086 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field5087) {
            int var10 = field5087 - arg2;
            arg4 -= var10;
            arg2 = field5087;
            var9 += arg3 * var10;
            var6 += Statics.field5086 * var10;
        }
        if (arg2 + arg4 > field5092) {
            arg4 -= arg2 + arg4 - field5092;
        }
        if (arg1 < field5093) {
            int var11 = field5093 - arg1;
            arg3 -= var11;
            arg1 = field5093;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field5094) {
            int var12 = arg1 + arg3 - field5094;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6801(Statics.field5091, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("pn.bp([I[BIIIIIII)V")
    public static void method6801(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("pn.bw([BIIIIII)V")
    public static void method6838(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field5086 * arg2 + arg1;
        int var8 = Statics.field5086 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field5087) {
            int var11 = field5087 - arg2;
            arg4 -= var11;
            arg2 = field5087;
            var10 += arg3 * var11;
            var7 += Statics.field5086 * var11;
        }
        if (arg2 + arg4 > field5092) {
            arg4 -= arg2 + arg4 - field5092;
        }
        if (arg1 < field5093) {
            int var12 = field5093 - arg1;
            arg3 -= var12;
            arg1 = field5093;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field5094) {
            int var13 = arg1 + arg3 - field5094;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6843(Statics.field5091, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("pn.bi([I[BIIIIIIII)V")
    public static void method6843(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("pn.an([BIIIIII)V")
    public abstract void method6614(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("pn.at([BIIIII)V")
    public abstract void method6606(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
