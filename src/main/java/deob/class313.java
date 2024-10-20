package deob;

import java.util.Random;

@ObfuscatedName("lj")
public abstract class class313 extends class328 {

    @ObfuscatedName("lj.t")
    public byte[][] field3907 = new byte[256][];

    @ObfuscatedName("lj.q")
    public int[] field3892;

    @ObfuscatedName("lj.i")
    public int[] field3894;

    @ObfuscatedName("lj.a")
    public int[] field3891;

    @ObfuscatedName("lj.l")
    public int[] field3903;

    @ObfuscatedName("lj.b")
    public int[] field3896;

    @ObfuscatedName("lj.e")
    public int field3893 = 0;

    @ObfuscatedName("lj.x")
    public int field3898;

    @ObfuscatedName("lj.p")
    public int field3899;

    @ObfuscatedName("lj.n")
    public byte[] field3901;

    @ObfuscatedName("lj.o")
    public static int field3902 = -1;

    @ObfuscatedName("lj.c")
    public static int field3908 = -1;

    @ObfuscatedName("lj.v")
    public static int field3904 = -1;

    @ObfuscatedName("lj.u")
    public static int field3905 = -1;

    @ObfuscatedName("lj.j")
    public static int field3906 = 0;

    @ObfuscatedName("lj.k")
    public static int field3897 = 0;

    @ObfuscatedName("lj.z")
    public static int field3900 = 256;

    @ObfuscatedName("lj.w")
    public static int field3895 = 0;

    @ObfuscatedName("lj.s")
    public static int field3910 = 0;

    @ObfuscatedName("lj.d")
    public static Random field3911 = new Random();

    @ObfuscatedName("lj.f")
    public static String[] field3912 = new String[100];

    public class313(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3903 = arg1;
        this.field3896 = arg2;
        this.field3894 = arg3;
        this.field3891 = arg4;
        this.method5065(arg0);
        this.field3907 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3896[var10] < var8 && this.field3891[var10] != 0) {
                var8 = this.field3896[var10];
            }
            if (this.field3896[var10] + this.field3891[var10] > var9) {
                var9 = this.field3896[var10] + this.field3891[var10];
            }
        }
        this.field3898 = this.field3893 - var8;
        this.field3899 = var9 - this.field3893;
    }

    public class313(byte[] arg0) {
        this.method5065(arg0);
    }

    @ObfuscatedName("lj.x([B)V")
    public void method5065(byte[] arg0) {
        this.field3892 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3892.length; var2++) {
                this.field3892[var2] = arg0[var2] & 0xFF;
            }
            this.field3893 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3892[var4] = arg0[var3++] & 0xFF;
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
        this.field3901 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3901[(var17 << 8) + var18] = (byte) method5098(var9, var13, var6, this.field3892, var5, var17, var18);
                    }
                }
            }
        }
        this.field3893 = var5[32] + var6[32];
    }

    @ObfuscatedName("lj.p([[B[[B[I[I[III)I")
    public static int method5098(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("lj.o(C)I")
    public int method5067(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3892[class315.method4805(arg0) & 0xFF];
    }

    @ObfuscatedName("lj.c(Ljava/lang/String;)I")
    public int method5068(String arg0) {
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
                                    int var8 = class319.method2933(var7.substring(4));
                                    var4 += Statics.field3909[var8].field3981;
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
                    var4 += this.field3892[(char) (class315.method4805(var6) & 0xFF)];
                    if (this.field3901 != null && var3 != -1) {
                        var4 += this.field3901[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("lj.u(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method5069(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method5067('<');
                        if (this.field3901 != null && var11 != -1) {
                            var4 += this.field3901[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method5067('>');
                        if (this.field3901 != null && var11 != -1) {
                            var4 += this.field3901[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class319.method2933(var16.substring(4));
                            var4 += Statics.field3909[var17].field3981;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method5067(var15);
                        if (this.field3901 != null && var11 != -1) {
                            var4 += this.field3901[(var11 << 8) + var15];
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

    @ObfuscatedName("lj.k(Ljava/lang/String;I)I")
    public int method5064(String arg0, int arg1) {
        int var3 = this.method5069(arg0, new int[] { arg1 }, field3912);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method5068(field3912[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("lj.z(Ljava/lang/String;I)I")
    public int method5071(String arg0, int arg1) {
        return this.method5069(arg0, new int[] { arg1 }, field3912);
    }

    @ObfuscatedName("lj.w(Ljava/lang/String;)Ljava/lang/String;")
    public static String method5072(String arg0) {
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

    @ObfuscatedName("lj.s(Ljava/lang/String;IIII)V")
    public void method5073(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5083(arg3, arg4);
            this.method5093(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lj.d(Ljava/lang/String;IIIII)V")
    public void method5074(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method5083(arg3, arg4);
            field3900 = arg5;
            this.method5093(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lj.f(Ljava/lang/String;IIII)V")
    public void method5075(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5083(arg3, arg4);
            this.method5093(arg0, arg1 - this.method5068(arg0), arg2);
        }
    }

    @ObfuscatedName("lj.r(Ljava/lang/String;IIII)V")
    public void method5076(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5083(arg3, arg4);
            this.method5093(arg0, arg1 - this.method5068(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("lj.y(Ljava/lang/String;IIIIIIIII)I")
    public int method5077(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method5083(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3893;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3899 + this.field3898 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method5069(arg0, var11, field3912);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3898 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3898 - this.field3899 - (var12 - 1) * arg9) / 2 + this.field3898 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3899 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3898 - this.field3899 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3898 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method5093(field3912[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method5093(field3912[var15], arg1 + (arg3 - this.method5068(field3912[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method5093(field3912[var15], arg1 + arg3 - this.method5068(field3912[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method5093(field3912[var15], arg1, var13);
            } else {
                this.method5133(field3912[var15], arg3);
                this.method5093(field3912[var15], arg1, var13);
                field3895 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("lj.h(Ljava/lang/String;IIIII)V")
    public void method5066(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5083(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method5086(arg0, arg1 - this.method5068(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("lj.av(Ljava/lang/String;IIIII)V")
    public void method5094(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5083(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method5086(arg0, arg1 - this.method5068(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("lj.aj(Ljava/lang/String;IIIIII)V")
    public void method5080(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method5083(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method5086(arg0, arg1 - this.method5068(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("lj.ae(Ljava/lang/String;IIIII)V")
    public void method5081(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5083(arg3, arg4);
        field3911.setSeed((long) arg5);
        field3900 = 192 + (field3911.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3911.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method5086(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("lj.am(II)V")
    public void method5083(int arg0, int arg1) {
        field3902 = -1;
        field3908 = -1;
        field3904 = arg1;
        field3905 = arg1;
        field3906 = arg0;
        field3897 = arg0;
        field3900 = 256;
        field3895 = 0;
        field3910 = 0;
    }

    @ObfuscatedName("lj.az(Ljava/lang/String;)V")
    public void method5085(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field3897 = class319.method4981(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field3897 = field3906;
            } else if (arg0.startsWith("str=")) {
                field3902 = class319.method4981(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field3902 = 8388608;
            } else if (arg0.equals("/str")) {
                field3902 = -1;
            } else if (arg0.startsWith("u=")) {
                field3908 = class319.method4981(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field3908 = 0;
            } else if (arg0.equals("/u")) {
                field3908 = -1;
            } else if (arg0.startsWith("shad=")) {
                field3905 = class319.method4981(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field3905 = 0;
            } else if (arg0.equals("/shad")) {
                field3905 = field3904;
            } else if (arg0.equals("br")) {
                this.method5083(field3906, field3904);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("lj.ap(Ljava/lang/String;I)V")
    public void method5133(String arg0, int arg1) {
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
            field3895 = (arg1 - this.method5068(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("lj.ah(Ljava/lang/String;II)V")
    public void method5093(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3893;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class315.method4805(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class319.method2933(var9.substring(4));
                                        class331 var11 = Statics.field3909[var10];
                                        var11.method5362(arg1, this.field3893 + var4 - var11.field3982);
                                        arg1 += var11.field3981;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method5085(var9);
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
                        if (this.field3901 != null && var6 != -1) {
                            arg1 += this.field3901[(var6 << 8) + var8];
                        }
                        int var13 = this.field3894[var8];
                        int var14 = this.field3891[var8];
                        if (var8 == ' ') {
                            if (field3895 > 0) {
                                field3910 += field3895;
                                arg1 += field3910 >> 8;
                                field3910 &= 0xFF;
                            }
                        } else if (field3900 == 256) {
                            if (field3905 != -1) {
                                method5088(this.field3907[var8], this.field3903[var8] + arg1 + 1, this.field3896[var8] + var4 + 1, var13, var14, field3905);
                            }
                            this.method5057(this.field3907[var8], this.field3903[var8] + arg1, this.field3896[var8] + var4, var13, var14, field3897);
                        } else {
                            if (field3905 != -1) {
                                method5090(this.field3907[var8], this.field3903[var8] + arg1 + 1, this.field3896[var8] + var4 + 1, var13, var14, field3905, field3900);
                            }
                            this.method5058(this.field3907[var8], this.field3903[var8] + arg1, this.field3896[var8] + var4, var13, var14, field3897, field3900);
                        }
                        int var15 = this.field3892[var8];
                        if (field3902 != -1) {
                            method5284(arg1, (int) ((double) this.field3893 * 0.7D) + var4, var15, field3902);
                        }
                        if (field3908 != -1) {
                            method5284(arg1, this.field3893 + var4 + 1, var15, field3908);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("lj.au(Ljava/lang/String;II[I[I)V")
    public void method5086(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3893;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class315.method4805(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class319.method2933(var12.substring(4));
                                        class331 var16 = Statics.field3909[var15];
                                        var16.method5362(arg1 + var13, this.field3893 + var6 - var16.field3982 + var14);
                                        arg1 += var16.field3981;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method5085(var12);
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
                        if (this.field3901 != null && var8 != -1) {
                            arg1 += this.field3901[(var8 << 8) + var11];
                        }
                        int var18 = this.field3894[var11];
                        int var19 = this.field3891[var11];
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
                            if (field3895 > 0) {
                                field3910 += field3895;
                                arg1 += field3910 >> 8;
                                field3910 &= 0xFF;
                            }
                        } else if (field3900 == 256) {
                            if (field3905 != -1) {
                                method5088(this.field3907[var11], this.field3903[var11] + arg1 + 1 + var20, this.field3896[var11] + var6 + 1 + var21, var18, var19, field3905);
                            }
                            this.method5057(this.field3907[var11], this.field3903[var11] + arg1 + var20, this.field3896[var11] + var6 + var21, var18, var19, field3897);
                        } else {
                            if (field3905 != -1) {
                                method5090(this.field3907[var11], this.field3903[var11] + arg1 + 1 + var20, this.field3896[var11] + var6 + 1 + var21, var18, var19, field3905, field3900);
                            }
                            this.method5058(this.field3907[var11], this.field3903[var11] + arg1 + var20, this.field3896[var11] + var6 + var21, var18, var19, field3897, field3900);
                        }
                        int var22 = this.field3892[var11];
                        if (field3902 != -1) {
                            method5284(arg1, (int) ((double) this.field3893 * 0.7D) + var6, var22, field3902);
                        }
                        if (field3908 != -1) {
                            method5284(arg1, this.field3893 + var6, var22, field3908);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("lj.ax([BIIIII)V")
    public static void method5088(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field3959 * arg2 + arg1;
        int var7 = Statics.field3959 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field3961) {
            int var10 = field3961 - arg2;
            arg4 -= var10;
            arg2 = field3961;
            var9 += arg3 * var10;
            var6 += Statics.field3959 * var10;
        }
        if (arg2 + arg4 > field3962) {
            arg4 -= arg2 + arg4 - field3962;
        }
        if (arg1 < field3960) {
            int var11 = field3960 - arg1;
            arg3 -= var11;
            arg1 = field3960;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field3963) {
            int var12 = arg1 + arg3 - field3963;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5089(Statics.field3964, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("lj.ar([I[BIIIIIII)V")
    public static void method5089(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("lj.an([BIIIIII)V")
    public static void method5090(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field3959 * arg2 + arg1;
        int var8 = Statics.field3959 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3961) {
            int var11 = field3961 - arg2;
            arg4 -= var11;
            arg2 = field3961;
            var10 += arg3 * var11;
            var7 += Statics.field3959 * var11;
        }
        if (arg2 + arg4 > field3962) {
            arg4 -= arg2 + arg4 - field3962;
        }
        if (arg1 < field3960) {
            int var12 = field3960 - arg1;
            arg3 -= var12;
            arg1 = field3960;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3963) {
            int var13 = arg1 + arg3 - field3963;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5091(Statics.field3964, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("lj.ai([I[BIIIIIIII)V")
    public static void method5091(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("lj.q([BIIIIII)V")
    public abstract void method5058(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @ObfuscatedName("lj.t([BIIIII)V")
    public abstract void method5057(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
