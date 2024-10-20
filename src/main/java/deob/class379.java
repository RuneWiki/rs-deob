package deob;

import java.util.Random;

@ObfuscatedName("ou")
public abstract class class379 extends class488 {

    @ObfuscatedName("ou.aj")
    public byte[][] field4393 = new byte[256][];

    @ObfuscatedName("ou.al")
    public int[] field4384;

    @ObfuscatedName("ou.ac")
    public int[] field4385;

    @ObfuscatedName("ou.ab")
    public int[] field4386;

    @ObfuscatedName("ou.an")
    public int[] field4387;

    @ObfuscatedName("ou.ao")
    public int[] field4388;

    @ObfuscatedName("ou.av")
    public int field4389 = 0;

    @ObfuscatedName("ou.aq")
    public int field4395;

    @ObfuscatedName("ou.ap")
    public int field4391;

    @ObfuscatedName("ou.ak")
    public byte[] field4390;

    @ObfuscatedName("ou.ax")
    public static int field4396 = -1;

    @ObfuscatedName("ou.as")
    public static int field4397 = -1;

    @ObfuscatedName("ou.ay")
    public static int field4394 = -1;

    @ObfuscatedName("ou.am")
    public static int field4400 = -1;

    @ObfuscatedName("ou.az")
    public static int field4403 = 0;

    @ObfuscatedName("ou.ae")
    public static int field4399 = 0;

    @ObfuscatedName("ou.au")
    public static int field4383 = 256;

    @ObfuscatedName("ou.ag")
    public static int field4401 = 0;

    @ObfuscatedName("ou.at")
    public static int field4402 = 0;

    @ObfuscatedName("ou.af")
    public static Random field4398 = new Random();

    @ObfuscatedName("ou.ai")
    public static String[] field4404 = new String[100];

    public class379(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field4387 = arg1;
        this.field4388 = arg2;
        this.field4385 = arg3;
        this.field4386 = arg4;
        this.method6614(arg0);
        this.field4393 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field4388[var10] < var8 && this.field4386[var10] != 0) {
                var8 = this.field4388[var10];
            }
            if (this.field4388[var10] + this.field4386[var10] > var9) {
                var9 = this.field4388[var10] + this.field4386[var10];
            }
        }
        this.field4395 = this.field4389 - var8;
        this.field4391 = var9 - this.field4389;
    }

    public class379(byte[] arg0) {
        this.method6614(arg0);
    }

    @ObfuscatedName("ou.ap([B)V")
    public void method6614(byte[] arg0) {
        this.field4384 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4384.length; var2++) {
                this.field4384[var2] = arg0[var2] & 0xFF;
            }
            this.field4389 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4384[var4] = arg0[var3++] & 0xFF;
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
        this.field4390 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4390[(var17 << 8) + var18] = (byte) method6549(var9, var13, var6, this.field4384, var5, var17, var18);
                    }
                }
            }
        }
        this.field4389 = var5[32] + var6[32];
    }

    @ObfuscatedName("ou.ar([[B[[B[I[I[III)I")
    public static int method6549(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("ou.ak(C)I")
    public int method6550(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4384[class366.method268(arg0) & 0xFF];
    }

    @ObfuscatedName("ou.ax(Ljava/lang/String;)I")
    public int method6551(String arg0) {
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
                                    int var8 = class368.method5989(var7.substring(4));
                                    var4 += Statics.field4392[var8].field4993;
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
                    var4 += this.field4384[(char) (class366.method268(var6) & 0xFF)];
                    if (this.field4390 != null && var3 != -1) {
                        var4 += this.field4390[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("ou.as(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method6624(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method6550('<');
                        if (this.field4390 != null && var11 != -1) {
                            var4 += this.field4390[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method6550('>');
                        if (this.field4390 != null && var11 != -1) {
                            var4 += this.field4390[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class368.method5989(var16.substring(4));
                            var4 += Statics.field4392[var17].field4993;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method6550(var15);
                        if (this.field4390 != null && var11 != -1) {
                            var4 += this.field4390[(var11 << 8) + var15];
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

    @ObfuscatedName("ou.ay(Ljava/lang/String;I)I")
    public int method6553(String arg0, int arg1) {
        int var3 = this.method6624(arg0, new int[] { arg1 }, field4404);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method6551(field4404[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("ou.am(Ljava/lang/String;I)I")
    public int method6622(String arg0, int arg1) {
        return this.method6624(arg0, new int[] { arg1 }, field4404);
    }

    @ObfuscatedName("ou.az(Ljava/lang/String;)Ljava/lang/String;")
    public static String method6555(String arg0) {
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

    @ObfuscatedName("ou.ae(IILjava/lang/String;II)Lqy;")
    public class417 method6556(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class417(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method6551(arg2) / 2;
        int var7 = var6 + this.method6551(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4395;
        int var9 = this.method6551(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4395 + this.field4391;
        return new class417(var7, var8, var9, var10);
    }

    @ObfuscatedName("ou.au(Ljava/lang/String;IIII)V")
    public void method6578(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6567(arg3, arg4);
            this.method6611(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ou.ag(Ljava/lang/String;IIIII)V")
    public void method6558(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method6567(arg3, arg4);
            field4383 = arg5;
            this.method6611(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ou.at(Ljava/lang/String;IIII)V")
    public void method6559(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6567(arg3, arg4);
            this.method6611(arg0, arg1 - this.method6551(arg0), arg2);
        }
    }

    @ObfuscatedName("ou.af(Ljava/lang/String;IIII)V")
    public void method6560(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method6567(arg3, arg4);
            this.method6611(arg0, arg1 - this.method6551(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("ou.ai(Ljava/lang/String;IIIIIIIII)I")
    public int method6575(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method6567(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field4389;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field4395 + this.field4391 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method6624(arg0, var11, field4404);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field4395 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field4395 - this.field4391 - (var12 - 1) * arg9) / 2 + this.field4395 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field4391 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field4395 - this.field4391 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field4395 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method6611(field4404[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method6611(field4404[var15], arg1 + (arg3 - this.method6551(field4404[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method6611(field4404[var15], arg1 + arg3 - this.method6551(field4404[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method6611(field4404[var15], arg1, var13);
            } else {
                this.method6589(field4404[var15], arg3);
                this.method6611(field4404[var15], arg1, var13);
                field4401 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("ou.aw(Lon;IIIII)Lrv;")
    public class452 method6562(class380 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0.method6645()) {
            this.method6567(arg3, arg4);
            int var7 = arg2 - this.field4389;
            for (int var8 = 0; var8 < arg0.method6646(); var8++) {
                class378 var9 = arg0.method6650(var8);
                if (arg5 != -1 && var9.field4379 > arg5) {
                    return new class452(var9.field4380, var9.field4379);
                }
                char var10 = var9.field4381;
                if (var10 != '\n') {
                    if (arg0.method6644(var8)) {
                        var10 = '*';
                    }
                    if (var10 != '\t') {
                        if (var10 == 160) {
                            var10 = ' ';
                        }
                        int var11 = var9.field4380 + arg1;
                        int var12 = var9.field4379 + var7;
                        int var13 = this.field4385[var10];
                        int var14 = this.field4386[var10];
                        if (field4400 != -1) {
                            this.method6393(this.field4393[var10], this.field4387[var10] + var11 + 1, this.field4388[var10] + var12 + 1, var13, var14, field4400);
                        }
                        this.method6393(this.field4393[var10], this.field4387[var10] + var11, this.field4388[var10] + var12, var13, var14, field4399);
                    }
                }
            }
        }
        return arg0.method6667();
    }

    @ObfuscatedName("ou.aa(Ljava/lang/String;IIIII)V")
    public void method6563(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6567(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method6577(arg0, arg1 - this.method6551(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("ou.ah(Ljava/lang/String;IIIII)V")
    public void method6564(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6567(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method6577(arg0, arg1 - this.method6551(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("ou.ad(Ljava/lang/String;IIIIII)V")
    public void method6565(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method6567(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method6577(arg0, arg1 - this.method6551(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("ou.bm(Ljava/lang/String;IIIII)V")
    public void method6566(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method6567(arg3, arg4);
        field4398.setSeed((long) arg5);
        field4383 = 192 + (field4398.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4398.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method6577(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("ou.bv(II)V")
    public void method6567(int arg0, int arg1) {
        field4396 = -1;
        field4397 = -1;
        field4394 = arg1;
        field4400 = arg1;
        field4403 = arg0;
        field4399 = arg0;
        field4383 = 256;
        field4401 = 0;
        field4402 = 0;
    }

    @ObfuscatedName("ou.bo(Ljava/lang/String;)V")
    public void method6568(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field4399 = class368.method5742(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field4399 = field4403;
            } else if (arg0.startsWith("str=")) {
                field4396 = class368.method5742(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field4396 = 8388608;
            } else if (arg0.equals("/str")) {
                field4396 = -1;
            } else if (arg0.startsWith("u=")) {
                field4397 = class368.method5742(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field4397 = 0;
            } else if (arg0.equals("/u")) {
                field4397 = -1;
            } else if (arg0.startsWith("shad=")) {
                field4400 = class368.method5742(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field4400 = 0;
            } else if (arg0.equals("/shad")) {
                field4400 = field4394;
            } else if (arg0.equals("br")) {
                this.method6567(field4403, field4394);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ou.bs(Ljava/lang/String;I)V")
    public void method6589(String arg0, int arg1) {
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
            field4401 = (arg1 - this.method6551(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("ou.bg(Ljava/lang/String;II)V")
    public void method6611(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4389;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class366.method268(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class368.method5989(var9.substring(4));
                                        class491 var11 = Statics.field4392[var10];
                                        var11.method8308(arg1, this.field4389 + var4 - var11.field4989);
                                        arg1 += var11.field4993;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method6568(var9);
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
                        if (this.field4390 != null && var6 != -1) {
                            arg1 += this.field4390[(var6 << 8) + var8];
                        }
                        int var13 = this.field4385[var8];
                        int var14 = this.field4386[var8];
                        if (var8 == ' ') {
                            if (field4401 > 0) {
                                field4402 += field4401;
                                arg1 += field4402 >> 8;
                                field4402 &= 0xFF;
                            }
                        } else if (field4383 == 256) {
                            if (field4400 != -1) {
                                method6571(this.field4393[var8], this.field4387[var8] + arg1 + 1, this.field4388[var8] + var4 + 1, var13, var14, field4400);
                            }
                            this.method6393(this.field4393[var8], this.field4387[var8] + arg1, this.field4388[var8] + var4, var13, var14, field4399);
                        } else {
                            if (field4400 != -1) {
                                method6557(this.field4393[var8], this.field4387[var8] + arg1 + 1, this.field4388[var8] + var4 + 1, var13, var14, field4400, field4383);
                            }
                            this.method6394(this.field4393[var8], this.field4387[var8] + arg1, this.field4388[var8] + var4, var13, var14, field4399, field4383);
                        }
                        int var15 = this.field4384[var8];
                        if (field4396 != -1) {
                            method8264(arg1, (int) ((double) this.field4389 * 0.7D) + var4, var15, field4396);
                        }
                        if (field4397 != -1) {
                            method8264(arg1, this.field4389 + var4 + 1, var15, field4397);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ou.bh(Ljava/lang/String;II[I[I)V")
    public void method6577(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field4389;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class366.method268(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class368.method5989(var12.substring(4));
                                        class491 var16 = Statics.field4392[var15];
                                        var16.method8308(arg1 + var13, this.field4389 + var6 - var16.field4989 + var14);
                                        arg1 += var16.field4993;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method6568(var12);
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
                        if (this.field4390 != null && var8 != -1) {
                            arg1 += this.field4390[(var8 << 8) + var11];
                        }
                        int var18 = this.field4385[var11];
                        int var19 = this.field4386[var11];
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
                            if (field4401 > 0) {
                                field4402 += field4401;
                                arg1 += field4402 >> 8;
                                field4402 &= 0xFF;
                            }
                        } else if (field4383 == 256) {
                            if (field4400 != -1) {
                                method6571(this.field4393[var11], this.field4387[var11] + arg1 + 1 + var20, this.field4388[var11] + var6 + 1 + var21, var18, var19, field4400);
                            }
                            this.method6393(this.field4393[var11], this.field4387[var11] + arg1 + var20, this.field4388[var11] + var6 + var21, var18, var19, field4399);
                        } else {
                            if (field4400 != -1) {
                                method6557(this.field4393[var11], this.field4387[var11] + arg1 + 1 + var20, this.field4388[var11] + var6 + 1 + var21, var18, var19, field4400, field4383);
                            }
                            this.method6394(this.field4393[var11], this.field4387[var11] + arg1 + var20, this.field4388[var11] + var6 + var21, var18, var19, field4399, field4383);
                        }
                        int var22 = this.field4384[var11];
                        if (field4396 != -1) {
                            method8264(arg1, (int) ((double) this.field4389 * 0.7D) + var6, var22, field4396);
                        }
                        if (field4397 != -1) {
                            method8264(arg1, this.field4389 + var6, var22, field4397);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ou.bl([BIIIII)V")
    public static void method6571(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field4970 * arg2 + arg1;
        int var7 = Statics.field4970 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field4972) {
            int var10 = field4972 - arg2;
            arg4 -= var10;
            arg2 = field4972;
            var9 += arg3 * var10;
            var6 += Statics.field4970 * var10;
        }
        if (arg2 + arg4 > field4971) {
            arg4 -= arg2 + arg4 - field4971;
        }
        if (arg1 < field4974) {
            int var11 = field4974 - arg1;
            arg3 -= var11;
            arg1 = field4974;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field4969) {
            int var12 = arg1 + arg3 - field4969;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6625(Statics.field4975, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("ou.bk([I[BIIIIIII)V")
    public static void method6625(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("ou.br([BIIIIII)V")
    public static void method6557(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field4970 * arg2 + arg1;
        int var8 = Statics.field4970 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4972) {
            int var11 = field4972 - arg2;
            arg4 -= var11;
            arg2 = field4972;
            var10 += arg3 * var11;
            var7 += Statics.field4970 * var11;
        }
        if (arg2 + arg4 > field4971) {
            arg4 -= arg2 + arg4 - field4971;
        }
        if (arg1 < field4974) {
            int var12 = field4974 - arg1;
            arg3 -= var12;
            arg1 = field4974;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4969) {
            int var13 = arg1 + arg3 - field4969;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6574(Statics.field4975, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("ou.ba([I[BIIIIIIII)V")
    public static void method6574(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("ou.al([BIIIIII)V")
    public abstract void method6394(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("ou.aj([BIIIII)V")
    public abstract void method6393(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
