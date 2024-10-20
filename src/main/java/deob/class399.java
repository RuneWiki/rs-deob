package deob;

import java.util.Random;

@ObfuscatedName("pq")
public abstract class class399 extends class524 {

    @ObfuscatedName("pq.ay")
    public byte[][] field4484 = new byte[256][];

    @ObfuscatedName("pq.ar")
    public int[] field4504;

    @ObfuscatedName("pq.am")
    public int[] field4486;

    @ObfuscatedName("pq.as")
    public int[] field4490;

    @ObfuscatedName("pq.aj")
    public int[] field4492;

    @ObfuscatedName("pq.ag")
    public int[] field4489;

    @ObfuscatedName("pq.az")
    public int field4493 = 0;

    @ObfuscatedName("pq.av")
    public int field4491;

    @ObfuscatedName("pq.ap")
    public int field4488;

    @ObfuscatedName("pq.at")
    public byte[] field4494;

    @ObfuscatedName("pq.ah")
    public static int field4495 = -1;

    @ObfuscatedName("pq.ax")
    public static int field4496 = -1;

    @ObfuscatedName("pq.aa")
    public static int field4497 = -1;

    @ObfuscatedName("pq.au")
    public static int field4498 = -1;

    @ObfuscatedName("pq.ae")
    public static int field4499 = 0;

    @ObfuscatedName("pq.ab")
    public static int field4500 = 0;

    @ObfuscatedName("pq.ad")
    public static int field4483 = 256;

    @ObfuscatedName("pq.ao")
    public static int field4502 = 0;

    @ObfuscatedName("pq.ac")
    public static int field4503 = 0;

    @ObfuscatedName("pq.ak")
    public static Random field4501 = new Random();

    @ObfuscatedName("pq.an")
    public static String[] field4505 = new String[100];

    public class399(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field4492 = arg1;
        this.field4489 = arg2;
        this.field4486 = arg3;
        this.field4490 = arg4;
        this.method6801(arg0);
        this.field4484 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field4489[var10] < var8 && this.field4490[var10] != 0) {
                var8 = this.field4489[var10];
            }
            if (this.field4490[var10] + this.field4489[var10] > var9) {
                var9 = this.field4490[var10] + this.field4489[var10];
            }
        }
        this.field4491 = this.field4493 - var8;
        this.field4488 = var9 - this.field4493;
    }

    public class399(byte[] arg0) {
        this.method6801(arg0);
    }

    @ObfuscatedName("pq.av([B)V")
    public void method6801(byte[] arg0) {
        this.field4504 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4504.length; var2++) {
                this.field4504[var2] = arg0[var2] & 0xFF;
            }
            this.field4493 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4504[var4] = arg0[var3++] & 0xFF;
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
        this.field4494 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4494[(var17 << 8) + var18] = (byte) method6802(var9, var13, var6, this.field4504, var5, var17, var18);
                    }
                }
            }
        }
        this.field4493 = var5[32] + var6[32];
    }

    @ObfuscatedName("pq.ap([[B[[B[I[I[III)I")
    public static int method6802(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("pq.aq(C)I")
    public int method6880(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4504[class386.method5441(arg0) & 0xFF];
    }

    @ObfuscatedName("pq.at(Ljava/lang/String;)I")
    public int method6864(String arg0) {
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
                                    int var8 = class388.method5252(var7.substring(4));
                                    var4 += Statics.field4487[var8].field5162;
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
                    var4 += this.field4504[(char) (class386.method5441(var6) & 0xFF)];
                    if (this.field4494 != null && var3 != -1) {
                        var4 += this.field4494[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("pq.ah(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method6853(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method6880('<');
                        if (this.field4494 != null && var11 != -1) {
                            var4 += this.field4494[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method6880('>');
                        if (this.field4494 != null && var11 != -1) {
                            var4 += this.field4494[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class388.method5252(var16.substring(4));
                            var4 += Statics.field4487[var17].field5162;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method6880(var15);
                        if (this.field4494 != null && var11 != -1) {
                            var4 += this.field4494[(var11 << 8) + var15];
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

    @ObfuscatedName("pq.ax(Ljava/lang/String;I)I")
    public int method6902(String arg0, int arg1) {
        int var3 = this.method6853(arg0, new int[] { arg1 }, field4505);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method6864(field4505[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("pq.aa(Ljava/lang/String;I)I")
    public int method6807(String arg0, int arg1) {
        return this.method6853(arg0, new int[] { arg1 }, field4505);
    }

    @ObfuscatedName("pq.au(Ljava/lang/String;)Ljava/lang/String;")
    public static String method6808(String arg0) {
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

    @ObfuscatedName("pq.ae(IILjava/lang/String;II)Lrk;")
    public class447 method6809(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class447(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method6864(arg2) / 2;
        int var7 = var6 + this.method6864(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4491;
        int var9 = this.method6864(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4491 + this.field4488;
        return new class447(var7, var8, var9, var10);
    }

    @ObfuscatedName("pq.ab(Ljava/lang/String;IIII)V")
    public void method6810(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6824(arg3, arg4);
            this.method6893(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("pq.ad(Ljava/lang/String;IIIII)V")
    public void method6811(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method6824(arg3, arg4);
            field4483 = arg5;
            this.method6893(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("pq.ao(Ljava/lang/String;IIII)V")
    public void method6812(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6824(arg3, arg4);
            this.method6893(arg0, arg1 - this.method6864(arg0), arg2);
        }
    }

    @ObfuscatedName("pq.ac(Ljava/lang/String;IIII)V")
    public void method6813(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6824(arg3, arg4);
            this.method6893(arg0, arg1 - this.method6864(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("pq.ak(Ljava/lang/String;IIIIIIIII)I")
    public int method6877(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method6815(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @ObfuscatedName("pq.an(Ljava/lang/String;IIIIIIIIII)I")
    public int method6815(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        if (arg7 == 255) {
            arg7 = 256;
        }
        this.method6824(arg5, arg6);
        field4483 = arg7;
        if (arg10 == 0) {
            arg10 = this.field4493;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field4491 + this.field4488 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method6853(arg0, var12, field4505);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field4491 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field4491 - this.field4488 - (var13 - 1) * arg10) / 2 + this.field4491 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field4488 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field4491 - this.field4488 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field4491 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method6893(field4505[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method6893(field4505[var16], arg1 + (arg3 - this.method6864(field4505[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method6893(field4505[var16], arg1 + arg3 - this.method6864(field4505[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method6893(field4505[var16], arg1, var14);
            } else {
                this.method6825(field4505[var16], arg3);
                this.method6893(field4505[var16], arg1, var14);
                field4502 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @ObfuscatedName("pq.af(Lpo;IIIII)Lsf;")
    public class487 method6837(class400 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0.method6916()) {
            this.method6824(arg3, arg4);
            int var7 = arg2 - this.field4493;
            for (int var8 = 0; var8 < arg0.method6917(); var8++) {
                class398 var9 = arg0.method6921(var8);
                if (arg5 != -1 && var9.field4482 > arg5) {
                    return new class487(var9.field4480, var9.field4482);
                }
                char var10 = var9.field4481;
                if (var10 != '\n') {
                    if (arg0.method6936(var8)) {
                        var10 = '*';
                    }
                    if (var10 != '\t') {
                        if (var10 == 160) {
                            var10 = ' ';
                        }
                        int var11 = var9.field4480 + arg1;
                        int var12 = var9.field4482 + var7;
                        int var13 = this.field4486[var10];
                        int var14 = this.field4490[var10];
                        if (field4498 != -1) {
                            this.method6644(this.field4484[var10], this.field4492[var10] + var11 + 1, this.field4489[var10] + var12 + 1, var13, var14, field4498);
                        }
                        this.method6644(this.field4484[var10], this.field4492[var10] + var11, this.field4489[var10] + var12, var13, var14, field4500);
                    }
                }
            }
        }
        return arg0.method6920();
    }

    @ObfuscatedName("pq.ai(Ljava/lang/String;IIIII[I)V")
    public void method6817(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg0 == null) {
            return;
        }
        this.method6824(arg3, arg4);
        int[] var8 = null;
        if (arg6 != null) {
            var8 = this.method6822(arg6, arg0.length());
        }
        int[] var9 = new int[arg0.length()];
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            var9[var10] = (int) (Math.sin((double) arg5 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method6827(arg0, arg1 - this.method6864(arg0) / 2, arg2, var8, (int[]) null, var9);
    }

    @ObfuscatedName("pq.al(Ljava/lang/String;IIIII[I)V")
    public void method6818(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg0 == null) {
            return;
        }
        this.method6824(arg3, arg4);
        int[] var8 = null;
        if (arg6 != null) {
            var8 = this.method6822(arg6, arg0.length());
        }
        int[] var9 = new int[arg0.length()];
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var9[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg5 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        this.method6827(arg0, arg1 - this.method6864(arg0) / 2, arg2, var8, var9, var10);
    }

    @ObfuscatedName("pq.bd(Ljava/lang/String;IIIIII[I)V")
    public void method6819(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        if (arg0 == null) {
            return;
        }
        this.method6824(arg3, arg4);
        int[] var9 = null;
        if (arg7 != null) {
            var9 = this.method6822(arg7, arg0.length());
        }
        double var10 = 7.0D - (double) arg6 / 8.0D;
        if (var10 < 0.0D) {
            var10 = 0.0D;
        }
        int[] var12 = new int[arg0.length()];
        for (int var13 = 0; var13 < arg0.length(); var13++) {
            var12[var13] = (int) (Math.sin((double) arg5 / 1.0D + (double) var13 / 1.5D) * var10);
        }
        this.method6827(arg0, arg1 - this.method6864(arg0) / 2, arg2, var9, (int[]) null, var12);
    }

    @ObfuscatedName("pq.bb(Ljava/lang/String;IIII[I)V")
    public void method6849(String arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6824(arg3, arg4);
        int[] var7 = null;
        if (arg5 != null) {
            var7 = this.method6822(arg5, arg0.length());
        }
        this.method6827(arg0, arg1 - this.method6864(arg0) / 2, arg2, var7, (int[]) null, (int[]) null);
    }

    @ObfuscatedName("pq.bn(Ljava/lang/String;IIII[I)V")
    public void method6842(String arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6824(arg3, arg4);
        int[] var7 = null;
        if (arg5 != null) {
            var7 = this.method6822(arg5, arg0.length());
        }
        this.method6827(arg0, arg1, arg2, var7, (int[]) null, (int[]) null);
    }

    @ObfuscatedName("pq.ba([II)[I")
    public int[] method6822(int[] arg0, int arg1) {
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

    @ObfuscatedName("pq.bf(Ljava/lang/String;IIIII)V")
    public void method6823(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6824(arg3, arg4);
        field4501.setSeed((long) arg5);
        field4483 = 192 + (field4501.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4501.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method6827(arg0, arg1, arg2, (int[]) null, var7, (int[]) null);
    }

    @ObfuscatedName("pq.bs(II)V")
    public void method6824(int arg0, int arg1) {
        field4495 = -1;
        field4496 = -1;
        field4497 = arg1;
        field4498 = arg1;
        field4499 = arg0;
        field4500 = arg0;
        field4483 = 256;
        field4502 = 0;
        field4503 = 0;
    }

    @ObfuscatedName("pq.bp(Ljava/lang/String;)V")
    public void method6844(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                String var2 = arg0.substring(4);
                int var3 = class388.method3102(var2, 16, true);
                field4500 = var3;
            } else if (arg0.equals("/col")) {
                field4500 = field4499;
            } else if (arg0.startsWith("str=")) {
                String var4 = arg0.substring(4);
                int var5 = class388.method3102(var4, 16, true);
                field4495 = var5;
            } else if (arg0.equals("str")) {
                field4495 = 8388608;
            } else if (arg0.equals("/str")) {
                field4495 = -1;
            } else if (arg0.startsWith("u=")) {
                String var6 = arg0.substring(2);
                int var7 = class388.method3102(var6, 16, true);
                field4496 = var7;
            } else if (arg0.equals("u")) {
                field4496 = 0;
            } else if (arg0.equals("/u")) {
                field4496 = -1;
            } else if (arg0.startsWith("shad=")) {
                String var8 = arg0.substring(5);
                int var9 = class388.method3102(var8, 16, true);
                field4498 = var9;
            } else if (arg0.equals("shad")) {
                field4498 = 0;
            } else if (arg0.equals("/shad")) {
                field4498 = field4497;
            } else if (arg0.equals("br")) {
                this.method6824(field4499, field4497);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("pq.bv(Ljava/lang/String;I)V")
    public void method6825(String arg0, int arg1) {
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
            field4502 = (arg1 - this.method6864(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("pq.bq(Ljava/lang/String;II)V")
    public void method6893(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4493;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class386.method5441(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class388.method5252(var9.substring(4));
                                        class527 var11 = Statics.field4487[var10];
                                        var11.method8673(arg1, this.field4493 + var4 - var11.field5159);
                                        arg1 += var11.field5162;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method6844(var9);
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
                        if (this.field4494 != null && var6 != -1) {
                            arg1 += this.field4494[(var6 << 8) + var8];
                        }
                        int var13 = this.field4486[var8];
                        int var14 = this.field4490[var8];
                        if (var8 == ' ') {
                            if (field4502 > 0) {
                                field4503 += field4502;
                                arg1 += field4503 >> 8;
                                field4503 &= 0xFF;
                            }
                        } else if (field4483 == 256) {
                            if (field4498 != -1) {
                                method6828(this.field4484[var8], this.field4492[var8] + arg1 + 1, this.field4489[var8] + var4 + 1, var13, var14, field4498);
                            }
                            this.method6644(this.field4484[var8], this.field4492[var8] + arg1, this.field4489[var8] + var4, var13, var14, field4500);
                        } else {
                            if (field4498 != -1) {
                                method6830(this.field4484[var8], this.field4492[var8] + arg1 + 1, this.field4489[var8] + var4 + 1, var13, var14, field4498, field4483);
                            }
                            this.method6650(this.field4484[var8], this.field4492[var8] + arg1, this.field4489[var8] + var4, var13, var14, field4500, field4483);
                        }
                        int var15 = this.field4504[var8];
                        if (field4495 != -1) {
                            method8588(arg1, (int) ((double) this.field4493 * 0.7D) + var4, var15, field4495);
                        }
                        if (field4496 != -1) {
                            method8588(arg1, this.field4493 + var4 + 1, var15, field4496);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("pq.bo(Ljava/lang/String;II[I[I[I)V")
    public void method6827(String arg0, int arg1, int arg2, int[] arg3, int[] arg4, int[] arg5) {
        int var7 = arg2 - this.field4493;
        int var8 = -1;
        int var9 = -1;
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            if (arg0.charAt(var11) != 0) {
                char var12 = (char) (class386.method5441(arg0.charAt(var11)) & 0xFF);
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
                                        int var16 = class388.method5252(var13.substring(4));
                                        class527 var17 = Statics.field4487[var16];
                                        var17.method8673(arg1 + var14, this.field4493 + var7 - var17.field5159 + var15);
                                        arg1 += var17.field5162;
                                        var9 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method6844(var13);
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
                        if (this.field4494 != null && var9 != -1) {
                            arg1 += this.field4494[(var9 << 8) + var12];
                        }
                        int var19 = this.field4486[var12];
                        int var20 = this.field4490[var12];
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
                            var23 = field4500;
                        } else {
                            var23 = arg3[var10];
                        }
                        var10++;
                        if (var12 == ' ') {
                            if (field4502 > 0) {
                                field4503 += field4502;
                                arg1 += field4503 >> 8;
                                field4503 &= 0xFF;
                            }
                        } else if (field4483 == 256) {
                            if (field4498 != -1) {
                                method6828(this.field4484[var12], this.field4492[var12] + arg1 + 1 + var21, this.field4489[var12] + var7 + 1 + var22, var19, var20, field4498);
                            }
                            this.method6644(this.field4484[var12], this.field4492[var12] + arg1 + var21, this.field4489[var12] + var7 + var22, var19, var20, var23);
                        } else {
                            if (field4498 != -1) {
                                method6830(this.field4484[var12], this.field4492[var12] + arg1 + 1 + var21, this.field4489[var12] + var7 + 1 + var22, var19, var20, field4498, field4483);
                            }
                            this.method6650(this.field4484[var12], this.field4492[var12] + arg1 + var21, this.field4489[var12] + var7 + var22, var19, var20, var23, field4483);
                        }
                        int var24 = this.field4504[var12];
                        if (field4495 != -1) {
                            method8588(arg1, (int) ((double) this.field4493 * 0.7D) + var7, var24, field4495);
                        }
                        if (field4496 != -1) {
                            method8588(arg1, this.field4493 + var7, var24, field4496);
                        }
                        arg1 += var24;
                        var9 = var12;
                    }
                }
            }
        }
    }

    @ObfuscatedName("pq.br([BIIIII)V")
    public static void method6828(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field5138 * arg2 + arg1;
        int var7 = Statics.field5138 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field5142) {
            int var10 = field5142 - arg2;
            arg4 -= var10;
            arg2 = field5142;
            var9 += arg3 * var10;
            var6 += Statics.field5138 * var10;
        }
        if (arg2 + arg4 > field5143) {
            arg4 -= arg2 + arg4 - field5143;
        }
        if (arg1 < field5144) {
            int var11 = field5144 - arg1;
            arg3 -= var11;
            arg1 = field5144;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field5145) {
            int var12 = arg1 + arg3 - field5145;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6888(Statics.field5137, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("pq.bw([I[BIIIIIII)V")
    public static void method6888(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("pq.be([BIIIIII)V")
    public static void method6830(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field5138 * arg2 + arg1;
        int var8 = Statics.field5138 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field5142) {
            int var11 = field5142 - arg2;
            arg4 -= var11;
            arg2 = field5142;
            var10 += arg3 * var11;
            var7 += Statics.field5138 * var11;
        }
        if (arg2 + arg4 > field5143) {
            arg4 -= arg2 + arg4 - field5143;
        }
        if (arg1 < field5144) {
            int var12 = field5144 - arg1;
            arg3 -= var12;
            arg1 = field5144;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field5145) {
            int var13 = arg1 + arg3 - field5145;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6831(Statics.field5137, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("pq.bc([I[BIIIIIIII)V")
    public static void method6831(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("pq.aw([BIIIII)V")
    public abstract void method6644(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("pq.ay([BIIIIII)V")
    public abstract void method6650(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
