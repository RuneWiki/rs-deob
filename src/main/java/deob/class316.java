package deob;

import java.util.Random;

@ObfuscatedName("ll")
public abstract class class316 extends class409 {

    @ObfuscatedName("ll.n")
    public byte[][] field3844 = new byte[256][];

    @ObfuscatedName("ll.c")
    public int[] field3838;

    @ObfuscatedName("ll.m")
    public int[] field3833;

    @ObfuscatedName("ll.k")
    public int[] field3834;

    @ObfuscatedName("ll.o")
    public int[] field3835;

    @ObfuscatedName("ll.g")
    public int[] field3850;

    @ObfuscatedName("ll.z")
    public int field3837 = 0;

    @ObfuscatedName("ll.a")
    public int field3847;

    @ObfuscatedName("ll.u")
    public int field3839;

    @ObfuscatedName("ll.l")
    public byte[] field3841;

    @ObfuscatedName("ll.y")
    public static int field3842 = -1;

    @ObfuscatedName("ll.v")
    public static int field3843 = -1;

    @ObfuscatedName("ll.f")
    public static int field3840 = -1;

    @ObfuscatedName("ll.s")
    public static int field3845 = -1;

    @ObfuscatedName("ll.h")
    public static int field3849 = 0;

    @ObfuscatedName("ll.d")
    public static int field3832 = 0;

    @ObfuscatedName("ll.q")
    public static int field3848 = 256;

    @ObfuscatedName("ll.j")
    public static int field3836 = 0;

    @ObfuscatedName("ll.x")
    public static int field3846 = 0;

    @ObfuscatedName("ll.b")
    public static Random field3831 = new Random();

    @ObfuscatedName("ll.t")
    public static String[] field3852 = new String[100];

    public class316(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3835 = arg1;
        this.field3850 = arg2;
        this.field3833 = arg3;
        this.field3834 = arg4;
        this.method5125(arg0);
        this.field3844 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3850[var10] < var8 && this.field3834[var10] != 0) {
                var8 = this.field3850[var10];
            }
            if (this.field3850[var10] + this.field3834[var10] > var9) {
                var9 = this.field3850[var10] + this.field3834[var10];
            }
        }
        this.field3847 = this.field3837 - var8;
        this.field3839 = var9 - this.field3837;
    }

    public class316(byte[] arg0) {
        this.method5125(arg0);
    }

    @ObfuscatedName("ll.a([B)V")
    public void method5125(byte[] arg0) {
        this.field3838 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3838.length; var2++) {
                this.field3838[var2] = arg0[var2] & 0xFF;
            }
            this.field3837 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3838[var4] = arg0[var3++] & 0xFF;
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
        this.field3841 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3841[(var17 << 8) + var18] = (byte) method5164(var9, var13, var6, this.field3838, var5, var17, var18);
                    }
                }
            }
        }
        this.field3837 = var5[32] + var6[32];
    }

    @ObfuscatedName("ll.u([[B[[B[I[I[III)I")
    public static int method5164(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("ll.e(C)I")
    public int method5127(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3838[class317.method3181(arg0) & 0xFF];
    }

    @ObfuscatedName("ll.l(Ljava/lang/String;)I")
    public int method5128(String arg0) {
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
                                    int var8 = class319.method4849(var7.substring(4));
                                    var4 += Statics.field3851[var8].field4365;
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
                    var4 += this.field3838[(char) (class317.method3181(var6) & 0xFF)];
                    if (this.field3841 != null && var3 != -1) {
                        var4 += this.field3841[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("ll.y(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method5129(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method5127('<');
                        if (this.field3841 != null && var11 != -1) {
                            var4 += this.field3841[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method5127('>');
                        if (this.field3841 != null && var11 != -1) {
                            var4 += this.field3841[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class319.method4849(var16.substring(4));
                            var4 += Statics.field3851[var17].field4365;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method5127(var15);
                        if (this.field3841 != null && var11 != -1) {
                            var4 += this.field3841[(var11 << 8) + var15];
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

    @ObfuscatedName("ll.v(Ljava/lang/String;I)I")
    public int method5130(String arg0, int arg1) {
        int var3 = this.method5129(arg0, new int[] { arg1 }, field3852);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method5128(field3852[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("ll.f(Ljava/lang/String;I)I")
    public int method5131(String arg0, int arg1) {
        return this.method5129(arg0, new int[] { arg1 }, field3852);
    }

    @ObfuscatedName("ll.s(Ljava/lang/String;)Ljava/lang/String;")
    public static String method5207(String arg0) {
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

    @ObfuscatedName("ll.h(IILjava/lang/String;II)Lmt;")
    public class350 method5186(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class350(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method5128(arg2) / 2;
        int var7 = var6 + this.method5128(arg2.substring(0, arg0));
        int var8 = arg4 - this.field3847;
        int var9 = this.method5128(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field3847 + this.field3839;
        return new class350(var7, var8, var9, var10);
    }

    @ObfuscatedName("ll.d(Ljava/lang/String;IIII)V")
    public void method5174(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5143(arg3, arg4);
            this.method5146(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ll.q(Ljava/lang/String;IIIII)V")
    public void method5135(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method5143(arg3, arg4);
            field3848 = arg5;
            this.method5146(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ll.j(Ljava/lang/String;IIII)V")
    public void method5136(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5143(arg3, arg4);
            this.method5146(arg0, arg1 - this.method5128(arg0), arg2);
        }
    }

    @ObfuscatedName("ll.x(Ljava/lang/String;IIII)V")
    public void method5137(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5143(arg3, arg4);
            this.method5146(arg0, arg1 - this.method5128(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("ll.b(Ljava/lang/String;IIIIIIIII)I")
    public int method5138(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method5143(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3837;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3847 + this.field3839 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method5129(arg0, var11, field3852);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3847 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3847 - this.field3839 - (var12 - 1) * arg9) / 2 + this.field3847 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3839 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3847 - this.field3839 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3847 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method5146(field3852[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method5146(field3852[var15], arg1 + (arg3 - this.method5128(field3852[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method5146(field3852[var15], arg1 + arg3 - this.method5128(field3852[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method5146(field3852[var15], arg1, var13);
            } else {
                this.method5195(field3852[var15], arg3);
                this.method5146(field3852[var15], arg1, var13);
                field3836 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("ll.t(Ljava/lang/String;IIIII)V")
    public void method5139(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5143(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method5220(arg0, arg1 - this.method5128(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("ll.r(Ljava/lang/String;IIIII)V")
    public void method5140(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5143(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method5220(arg0, arg1 - this.method5128(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("ll.p(Ljava/lang/String;IIIIII)V")
    public void method5141(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method5143(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method5220(arg0, arg1 - this.method5128(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("ll.w(Ljava/lang/String;IIIII)V")
    public void method5142(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5143(arg3, arg4);
        field3831.setSeed((long) arg5);
        field3848 = 192 + (field3831.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3831.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method5220(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("ll.i(II)V")
    public void method5143(int arg0, int arg1) {
        field3842 = -1;
        field3843 = -1;
        field3840 = arg1;
        field3845 = arg1;
        field3849 = arg0;
        field3832 = arg0;
        field3848 = 256;
        field3836 = 0;
        field3846 = 0;
    }

    @ObfuscatedName("ll.aq(Ljava/lang/String;)V")
    public void method5144(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field3832 = class319.method2350(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field3832 = field3849;
            } else if (arg0.startsWith("str=")) {
                field3842 = class319.method2350(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field3842 = 8388608;
            } else if (arg0.equals("/str")) {
                field3842 = -1;
            } else if (arg0.startsWith("u=")) {
                field3843 = class319.method2350(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field3843 = 0;
            } else if (arg0.equals("/u")) {
                field3843 = -1;
            } else if (arg0.startsWith("shad=")) {
                field3845 = class319.method2350(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field3845 = 0;
            } else if (arg0.equals("/shad")) {
                field3845 = field3840;
            } else if (arg0.equals("br")) {
                this.method5143(field3849, field3840);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ll.ad(Ljava/lang/String;I)V")
    public void method5195(String arg0, int arg1) {
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
            field3836 = (arg1 - this.method5128(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("ll.al(Ljava/lang/String;II)V")
    public void method5146(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3837;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class317.method3181(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class319.method4849(var9.substring(4));
                                        class412 var11 = Statics.field3851[var10];
                                        var11.method6601(arg1, this.field3837 + var4 - var11.field4363);
                                        arg1 += var11.field4365;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method5144(var9);
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
                        if (this.field3841 != null && var6 != -1) {
                            arg1 += this.field3841[(var6 << 8) + var8];
                        }
                        int var13 = this.field3833[var8];
                        int var14 = this.field3834[var8];
                        if (var8 == ' ') {
                            if (field3836 > 0) {
                                field3846 += field3836;
                                arg1 += field3846 >> 8;
                                field3846 &= 0xFF;
                            }
                        } else if (field3848 == 256) {
                            if (field3845 != -1) {
                                method5148(this.field3844[var8], this.field3835[var8] + arg1 + 1, this.field3850[var8] + var4 + 1, var13, var14, field3845);
                            }
                            this.method5117(this.field3844[var8], this.field3835[var8] + arg1, this.field3850[var8] + var4, var13, var14, field3832);
                        } else {
                            if (field3845 != -1) {
                                method5150(this.field3844[var8], this.field3835[var8] + arg1 + 1, this.field3850[var8] + var4 + 1, var13, var14, field3845, field3848);
                            }
                            this.method5118(this.field3844[var8], this.field3835[var8] + arg1, this.field3850[var8] + var4, var13, var14, field3832, field3848);
                        }
                        int var15 = this.field3838[var8];
                        if (field3842 != -1) {
                            method6578(arg1, (int) ((double) this.field3837 * 0.7D) + var4, var15, field3842);
                        }
                        if (field3843 != -1) {
                            method6578(arg1, this.field3837 + var4 + 1, var15, field3843);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ll.aa(Ljava/lang/String;II[I[I)V")
    public void method5220(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3837;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class317.method3181(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class319.method4849(var12.substring(4));
                                        class412 var16 = Statics.field3851[var15];
                                        var16.method6601(arg1 + var13, this.field3837 + var6 - var16.field4363 + var14);
                                        arg1 += var16.field4365;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method5144(var12);
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
                        if (this.field3841 != null && var8 != -1) {
                            arg1 += this.field3841[(var8 << 8) + var11];
                        }
                        int var18 = this.field3833[var11];
                        int var19 = this.field3834[var11];
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
                            if (field3836 > 0) {
                                field3846 += field3836;
                                arg1 += field3846 >> 8;
                                field3846 &= 0xFF;
                            }
                        } else if (field3848 == 256) {
                            if (field3845 != -1) {
                                method5148(this.field3844[var11], this.field3835[var11] + arg1 + 1 + var20, this.field3850[var11] + var6 + 1 + var21, var18, var19, field3845);
                            }
                            this.method5117(this.field3844[var11], this.field3835[var11] + arg1 + var20, this.field3850[var11] + var6 + var21, var18, var19, field3832);
                        } else {
                            if (field3845 != -1) {
                                method5150(this.field3844[var11], this.field3835[var11] + arg1 + 1 + var20, this.field3850[var11] + var6 + 1 + var21, var18, var19, field3845, field3848);
                            }
                            this.method5118(this.field3844[var11], this.field3835[var11] + arg1 + var20, this.field3850[var11] + var6 + var21, var18, var19, field3832, field3848);
                        }
                        int var22 = this.field3838[var11];
                        if (field3842 != -1) {
                            method6578(arg1, (int) ((double) this.field3837 * 0.7D) + var6, var22, field3842);
                        }
                        if (field3843 != -1) {
                            method6578(arg1, this.field3837 + var6, var22, field3843);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ll.aw([BIIIII)V")
    public static void method5148(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field4343 * arg2 + arg1;
        int var7 = Statics.field4343 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field4344) {
            int var10 = field4344 - arg2;
            arg4 -= var10;
            arg2 = field4344;
            var9 += arg3 * var10;
            var6 += Statics.field4343 * var10;
        }
        if (arg2 + arg4 > field4347) {
            arg4 -= arg2 + arg4 - field4347;
        }
        if (arg1 < field4348) {
            int var11 = field4348 - arg1;
            arg3 -= var11;
            arg1 = field4348;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field4349) {
            int var12 = arg1 + arg3 - field4349;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5183(Statics.field4346, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("ll.at([I[BIIIIIII)V")
    public static void method5183(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("ll.as([BIIIIII)V")
    public static void method5150(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field4343 * arg2 + arg1;
        int var8 = Statics.field4343 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4344) {
            int var11 = field4344 - arg2;
            arg4 -= var11;
            arg2 = field4344;
            var10 += arg3 * var11;
            var7 += Statics.field4343 * var11;
        }
        if (arg2 + arg4 > field4347) {
            arg4 -= arg2 + arg4 - field4347;
        }
        if (arg1 < field4348) {
            int var12 = field4348 - arg1;
            arg3 -= var12;
            arg1 = field4348;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4349) {
            int var13 = arg1 + arg3 - field4349;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5151(Statics.field4346, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("ll.ae([I[BIIIIIIII)V")
    public static void method5151(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("ll.n([BIIIII)V")
    public abstract void method5117(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("ll.c([BIIIIII)V")
    public abstract void method5118(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
