package deob;

import java.util.Random;

@ObfuscatedName("mw")
public abstract class class350 extends class452 {

    @ObfuscatedName("mw.c")
    public byte[][] field4183 = new byte[256][];

    @ObfuscatedName("mw.v")
    public int[] field4173;

    @ObfuscatedName("mw.q")
    public int[] field4174;

    @ObfuscatedName("mw.f")
    public int[] field4175;

    @ObfuscatedName("mw.j")
    public int[] field4176;

    @ObfuscatedName("mw.e")
    public int[] field4177;

    @ObfuscatedName("mw.g")
    public int field4182 = 0;

    @ObfuscatedName("mw.w")
    public int field4179;

    @ObfuscatedName("mw.y")
    public int field4180;

    @ObfuscatedName("mw.s")
    public byte[] field4188;

    @ObfuscatedName("mw.t")
    public static int field4172 = -1;

    @ObfuscatedName("mw.z")
    public static int field4184 = -1;

    @ObfuscatedName("mw.r")
    public static int field4185 = -1;

    @ObfuscatedName("mw.u")
    public static int field4186 = -1;

    @ObfuscatedName("mw.k")
    public static int field4187 = 0;

    @ObfuscatedName("mw.h")
    public static int field4190 = 0;

    @ObfuscatedName("mw.x")
    public static int field4189 = 256;

    @ObfuscatedName("mw.l")
    public static int field4191 = 0;

    @ObfuscatedName("mw.a")
    public static int field4178 = 0;

    @ObfuscatedName("mw.p")
    public static Random field4192 = new Random();

    @ObfuscatedName("mw.b")
    public static String[] field4193 = new String[100];

    public class350(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field4176 = arg1;
        this.field4177 = arg2;
        this.field4174 = arg3;
        this.field4175 = arg4;
        this.method5864(arg0);
        this.field4183 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field4177[var10] < var8 && this.field4175[var10] != 0) {
                var8 = this.field4177[var10];
            }
            if (this.field4177[var10] + this.field4175[var10] > var9) {
                var9 = this.field4177[var10] + this.field4175[var10];
            }
        }
        this.field4179 = this.field4182 - var8;
        this.field4180 = var9 - this.field4182;
    }

    public class350(byte[] arg0) {
        this.method5864(arg0);
    }

    @ObfuscatedName("mw.e([B)V")
    public void method5864(byte[] arg0) {
        this.field4173 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field4173.length; var2++) {
                this.field4173[var2] = arg0[var2] & 0xFF;
            }
            this.field4182 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field4173[var4] = arg0[var3++] & 0xFF;
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
        this.field4188 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field4188[(var17 << 8) + var18] = (byte) method5872(var9, var13, var6, this.field4173, var5, var17, var18);
                    }
                }
            }
        }
        this.field4182 = var5[32] + var6[32];
    }

    @ObfuscatedName("mw.g([[B[[B[I[I[III)I")
    public static int method5872(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("mw.w(C)I")
    public int method5799(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field4173[class341.method5208(arg0) & 0xFF];
    }

    @ObfuscatedName("mw.y(Ljava/lang/String;)I")
    public int method5800(String arg0) {
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
                                    int var8 = class343.method4010(var7.substring(4));
                                    var4 += Statics.field4181[var8].field4787;
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
                    var4 += this.field4173[(char) (class341.method5208(var6) & 0xFF)];
                    if (this.field4188 != null && var3 != -1) {
                        var4 += this.field4188[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("mw.i(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method5801(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method5799('<');
                        if (this.field4188 != null && var11 != -1) {
                            var4 += this.field4188[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method5799('>');
                        if (this.field4188 != null && var11 != -1) {
                            var4 += this.field4188[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            int var17 = class343.method4010(var16.substring(4));
                            var4 += Statics.field4181[var17].field4787;
                            var11 = 0;
                        } catch (Exception var20) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method5799(var15);
                        if (this.field4188 != null && var11 != -1) {
                            var4 += this.field4188[(var11 << 8) + var15];
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

    @ObfuscatedName("mw.s(Ljava/lang/String;I)I")
    public int method5828(String arg0, int arg1) {
        int var3 = this.method5801(arg0, new int[] { arg1 }, field4193);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method5800(field4193[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("mw.t(Ljava/lang/String;I)I")
    public int method5832(String arg0, int arg1) {
        return this.method5801(arg0, new int[] { arg1 }, field4193);
    }

    @ObfuscatedName("mw.z(Ljava/lang/String;)Ljava/lang/String;")
    public static String method5804(String arg0) {
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

    @ObfuscatedName("mw.r(IILjava/lang/String;II)Lns;")
    public class384 method5805(int arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg2 == null || arg2.length() < arg0 + arg1) {
            return new class384(arg3, arg4, 0, 0);
        }
        int var6 = arg3 - this.method5800(arg2) / 2;
        int var7 = var6 + this.method5800(arg2.substring(0, arg0));
        int var8 = arg4 - this.field4179;
        int var9 = this.method5800(arg2.substring(arg0, arg0 + arg1));
        int var10 = this.field4180 + this.field4179;
        return new class384(var7, var8, var9, var10);
    }

    @ObfuscatedName("mw.u(Ljava/lang/String;IIII)V")
    public void method5806(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5815(arg3, arg4);
            this.method5818(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("mw.k(Ljava/lang/String;IIIII)V")
    public void method5884(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != null) {
            this.method5815(arg3, arg4);
            field4189 = arg5;
            this.method5818(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("mw.h(Ljava/lang/String;IIII)V")
    public void method5808(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5815(arg3, arg4);
            this.method5818(arg0, arg1 - this.method5800(arg0), arg2);
        }
    }

    @ObfuscatedName("mw.x(Ljava/lang/String;IIII)V")
    public void method5867(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method5815(arg3, arg4);
            this.method5818(arg0, arg1 - this.method5800(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("mw.l(Ljava/lang/String;IIIIIIIII)I")
    public int method5810(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method5815(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field4182;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field4180 + this.field4179 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method5801(arg0, var11, field4193);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field4179 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field4179 - this.field4180 - (var12 - 1) * arg9) / 2 + this.field4179 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field4180 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field4179 - this.field4180 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field4179 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method5818(field4193[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method5818(field4193[var15], arg1 + (arg3 - this.method5800(field4193[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method5818(field4193[var15], arg1 + arg3 - this.method5800(field4193[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method5818(field4193[var15], arg1, var13);
            } else {
                this.method5827(field4193[var15], arg3);
                this.method5818(field4193[var15], arg1, var13);
                field4191 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("mw.a(Ljava/lang/String;IIIII)V")
    public void method5812(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5815(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method5819(arg0, arg1 - this.method5800(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("mw.p(Ljava/lang/String;IIIII)V")
    public void method5870(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5815(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method5819(arg0, arg1 - this.method5800(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("mw.b(Ljava/lang/String;IIIIII)V")
    public void method5813(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method5815(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method5819(arg0, arg1 - this.method5800(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("mw.n(Ljava/lang/String;IIIII)V")
    public void method5814(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method5815(arg3, arg4);
        field4192.setSeed((long) arg5);
        field4189 = 192 + (field4192.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field4192.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method5819(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("mw.o(II)V")
    public void method5815(int arg0, int arg1) {
        field4172 = -1;
        field4184 = -1;
        field4185 = arg1;
        field4186 = arg1;
        field4187 = arg0;
        field4190 = arg0;
        field4189 = 256;
        field4191 = 0;
        field4178 = 0;
    }

    @ObfuscatedName("mw.m(Ljava/lang/String;)V")
    public void method5846(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field4190 = class343.method4705(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field4190 = field4187;
            } else if (arg0.startsWith("str=")) {
                field4172 = class343.method4705(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field4172 = 8388608;
            } else if (arg0.equals("/str")) {
                field4172 = -1;
            } else if (arg0.startsWith("u=")) {
                field4184 = class343.method4705(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field4184 = 0;
            } else if (arg0.equals("/u")) {
                field4184 = -1;
            } else if (arg0.startsWith("shad=")) {
                field4186 = class343.method4705(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field4186 = 0;
            } else if (arg0.equals("/shad")) {
                field4186 = field4185;
            } else if (arg0.equals("br")) {
                this.method5815(field4187, field4185);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("mw.d(Ljava/lang/String;I)V")
    public void method5827(String arg0, int arg1) {
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
            field4191 = (arg1 - this.method5800(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("mw.ad(Ljava/lang/String;II)V")
    public void method5818(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4182;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class341.method5208(arg0.charAt(var7)) & 0xFF);
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
                                        int var10 = class343.method4010(var9.substring(4));
                                        class455 var11 = Statics.field4181[var10];
                                        var11.method7431(arg1, this.field4182 + var4 - var11.field4794);
                                        arg1 += var11.field4787;
                                        var6 = -1;
                                    } catch (Exception var16) {
                                    }
                                } else {
                                    this.method5846(var9);
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
                        if (this.field4188 != null && var6 != -1) {
                            arg1 += this.field4188[(var6 << 8) + var8];
                        }
                        int var13 = this.field4174[var8];
                        int var14 = this.field4175[var8];
                        if (var8 == ' ') {
                            if (field4191 > 0) {
                                field4178 += field4191;
                                arg1 += field4178 >> 8;
                                field4178 &= 0xFF;
                            }
                        } else if (field4189 == 256) {
                            if (field4186 != -1) {
                                method5796(this.field4183[var8], this.field4176[var8] + arg1 + 1, this.field4177[var8] + var4 + 1, var13, var14, field4186);
                            }
                            this.method5792(this.field4183[var8], this.field4176[var8] + arg1, this.field4177[var8] + var4, var13, var14, field4190);
                        } else {
                            if (field4186 != -1) {
                                method5822(this.field4183[var8], this.field4176[var8] + arg1 + 1, this.field4177[var8] + var4 + 1, var13, var14, field4186, field4189);
                            }
                            this.method5791(this.field4183[var8], this.field4176[var8] + arg1, this.field4177[var8] + var4, var13, var14, field4190, field4189);
                        }
                        int var15 = this.field4173[var8];
                        if (field4172 != -1) {
                            method7357(arg1, (int) ((double) this.field4182 * 0.7D) + var4, var15, field4172);
                        }
                        if (field4184 != -1) {
                            method7357(arg1, this.field4182 + var4 + 1, var15, field4184);
                        }
                        arg1 += var15;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("mw.ak(Ljava/lang/String;II[I[I)V")
    public void method5819(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field4182;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class341.method5208(arg0.charAt(var10)) & 0xFF);
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
                                        int var15 = class343.method4010(var12.substring(4));
                                        class455 var16 = Statics.field4181[var15];
                                        var16.method7431(arg1 + var13, this.field4182 + var6 - var16.field4794 + var14);
                                        arg1 += var16.field4787;
                                        var8 = -1;
                                    } catch (Exception var23) {
                                    }
                                } else {
                                    this.method5846(var12);
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
                        if (this.field4188 != null && var8 != -1) {
                            arg1 += this.field4188[(var8 << 8) + var11];
                        }
                        int var18 = this.field4174[var11];
                        int var19 = this.field4175[var11];
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
                            if (field4191 > 0) {
                                field4178 += field4191;
                                arg1 += field4178 >> 8;
                                field4178 &= 0xFF;
                            }
                        } else if (field4189 == 256) {
                            if (field4186 != -1) {
                                method5796(this.field4183[var11], this.field4176[var11] + arg1 + 1 + var20, this.field4177[var11] + var6 + 1 + var21, var18, var19, field4186);
                            }
                            this.method5792(this.field4183[var11], this.field4176[var11] + arg1 + var20, this.field4177[var11] + var6 + var21, var18, var19, field4190);
                        } else {
                            if (field4186 != -1) {
                                method5822(this.field4183[var11], this.field4176[var11] + arg1 + 1 + var20, this.field4177[var11] + var6 + 1 + var21, var18, var19, field4186, field4189);
                            }
                            this.method5791(this.field4183[var11], this.field4176[var11] + arg1 + var20, this.field4177[var11] + var6 + var21, var18, var19, field4190, field4189);
                        }
                        int var22 = this.field4173[var11];
                        if (field4172 != -1) {
                            method7357(arg1, (int) ((double) this.field4182 * 0.7D) + var6, var22, field4172);
                        }
                        if (field4184 != -1) {
                            method7357(arg1, this.field4182 + var6, var22, field4184);
                        }
                        arg1 += var22;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("mw.al([BIIIII)V")
    public static void method5796(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field4773 * arg2 + arg1;
        int var7 = Statics.field4773 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field4771) {
            int var10 = field4771 - arg2;
            arg4 -= var10;
            arg2 = field4771;
            var9 += arg3 * var10;
            var6 += Statics.field4773 * var10;
        }
        if (arg2 + arg4 > field4772) {
            arg4 -= arg2 + arg4 - field4772;
        }
        if (arg1 < field4768) {
            int var11 = field4768 - arg1;
            arg3 -= var11;
            arg1 = field4768;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field4774) {
            int var12 = arg1 + arg3 - field4774;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5821(Statics.field4770, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("mw.ao([I[BIIIIIII)V")
    public static void method5821(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("mw.ab([BIIIIII)V")
    public static void method5822(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field4773 * arg2 + arg1;
        int var8 = Statics.field4773 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4771) {
            int var11 = field4771 - arg2;
            arg4 -= var11;
            arg2 = field4771;
            var10 += arg3 * var11;
            var7 += Statics.field4773 * var11;
        }
        if (arg2 + arg4 > field4772) {
            arg4 -= arg2 + arg4 - field4772;
        }
        if (arg1 < field4768) {
            int var12 = field4768 - arg1;
            arg3 -= var12;
            arg1 = field4768;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4774) {
            int var13 = arg1 + arg3 - field4774;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5823(Statics.field4770, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("mw.ap([I[BIIIIIIII)V")
    public static void method5823(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("mw.c([BIIIII)V")
    public abstract void method5792(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("mw.v([BIIIIII)V")
    public abstract void method5791(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
