package deob;

import java.util.Random;

@ObfuscatedName("hn")
public abstract class class214 extends class75 {

    @ObfuscatedName("hn.b")
    public byte[][] field3099 = new byte[256][];

    @ObfuscatedName("hn.e")
    public int[] field3083;

    @ObfuscatedName("hn.a")
    public int[] field3097;

    @ObfuscatedName("hn.k")
    public int[] field3085;

    @ObfuscatedName("hn.p")
    public int[] field3086;

    @ObfuscatedName("hn.l")
    public int[] field3084;

    @ObfuscatedName("hn.u")
    public int field3088 = 0;

    @ObfuscatedName("hn.o")
    public int field3089;

    @ObfuscatedName("hn.m")
    public int field3082;

    @ObfuscatedName("hn.v")
    public byte[] field3092;

    @ObfuscatedName("hn.n")
    public static int field3095 = -1;

    @ObfuscatedName("hn.w")
    public static int field3094 = -1;

    @ObfuscatedName("hn.g")
    public static int field3090 = -1;

    @ObfuscatedName("hn.f")
    public static int field3096 = -1;

    @ObfuscatedName("hn.y")
    public static int field3093 = 0;

    @ObfuscatedName("hn.j")
    public static int field3091 = 0;

    @ObfuscatedName("hn.x")
    public static int field3087 = 256;

    @ObfuscatedName("hn.d")
    public static int field3100 = 0;

    @ObfuscatedName("hn.ax")
    public static int field3101 = 0;

    @ObfuscatedName("hn.ag")
    public static Random field3102 = new Random();

    @ObfuscatedName("hn.ai")
    public static String[] field3103 = new String[100];

    public class214(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field3086 = arg1;
        this.field3084 = arg2;
        this.field3097 = arg3;
        this.field3085 = arg4;
        this.method3533(arg0);
        this.field3099 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field3084[var10] < var8 && this.field3085[var10] != 0) {
                var8 = this.field3084[var10];
            }
            if (this.field3085[var10] + this.field3084[var10] > var9) {
                var9 = this.field3085[var10] + this.field3084[var10];
            }
        }
        this.field3089 = this.field3088 - var8;
        this.field3082 = var9 - this.field3088;
    }

    public class214(byte[] arg0) {
        this.method3533(arg0);
    }

    @ObfuscatedName("hn.b([B)V")
    public void method3533(byte[] arg0) {
        this.field3083 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field3083.length; var2++) {
                this.field3083[var2] = arg0[var2] & 0xFF;
            }
            this.field3088 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field3083[var4] = arg0[var3++] & 0xFF;
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
        this.field3092 = new byte[65536];
        for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
                for (int var18 = 0; var18 < 256; var18++) {
                    if (var18 != 32 && var18 != 160) {
                        this.field3092[(var17 << 8) + var18] = (byte) method3611(var9, var13, var6, this.field3083, var5, var17, var18);
                    }
                }
            }
        }
        this.field3088 = var5[32] + var6[32];
    }

    @ObfuscatedName("hn.e([[B[[B[I[I[III)I")
    public static int method3611(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

    @ObfuscatedName("hn.a(C)I")
    public int method3535(char arg0) {
        if (arg0 == 160) {
            arg0 = ' ';
        }
        return this.field3083[class156.method146(arg0) & 0xFF];
    }

    @ObfuscatedName("hn.k(Ljava/lang/String;)I")
    public int method3536(String arg0) {
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
                                    String var8 = var7.substring(4);
                                    int var9 = class154.method2535(var8, 10, true);
                                    var4 += Statics.field3098[var9].field1356;
                                    var3 = -1;
                                } catch (Exception var12) {
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
                    var4 += this.field3083[(char) (class156.method146(var6) & 0xFF)];
                    if (this.field3092 != null && var3 != -1) {
                        var4 += this.field3092[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("hn.p(Ljava/lang/String;[I[Ljava/lang/String;)I")
    public int method3577(String arg0, int[] arg1, String[] arg2) {
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
                        var4 += this.method3535('<');
                        if (this.field3092 != null && var11 != -1) {
                            var4 += this.field3092[(var11 << 8) + 60];
                        }
                        var11 = '<';
                    } else if (var16.equals("gt")) {
                        var4 += this.method3535('>');
                        if (this.field3092 != null && var11 != -1) {
                            var4 += this.field3092[(var11 << 8) + 62];
                        }
                        var11 = '>';
                    } else if (var16.startsWith("img=")) {
                        try {
                            String var17 = var16.substring(4);
                            int var18 = class154.method2535(var17, 10, true);
                            var4 += Statics.field3098[var18].field1356;
                            var11 = 0;
                        } catch (Exception var22) {
                        }
                    }
                    var15 = 0;
                }
                if (var10 == -1) {
                    if (var15 != 0) {
                        var6.append(var15);
                        var4 += this.method3535(var15);
                        if (this.field3092 != null && var11 != -1) {
                            var4 += this.field3092[(var11 << 8) + var15];
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
        String var21 = var6.toString();
        if (var21.length() > var5) {
            arg2[var12++] = var21.substring(var5, var21.length());
        }
        return var12;
    }

    @ObfuscatedName("hn.l(Ljava/lang/String;I)I")
    public int method3538(String arg0, int arg1) {
        int var3 = this.method3577(arg0, new int[] { arg1 }, field3103);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method3536(field3103[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @ObfuscatedName("hn.u(Ljava/lang/String;I)I")
    public int method3532(String arg0, int arg1) {
        return this.method3577(arg0, new int[] { arg1 }, field3103);
    }

    @ObfuscatedName("hn.o(Ljava/lang/String;)Ljava/lang/String;")
    public static String method3616(String arg0) {
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

    @ObfuscatedName("hn.m(Ljava/lang/String;IIII)V")
    public void method3588(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3590(arg3, arg4);
            this.method3551(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("hn.q(Ljava/lang/String;IIII)V")
    public void method3542(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3590(arg3, arg4);
            this.method3551(arg0, arg1 - this.method3536(arg0), arg2);
        }
    }

    @ObfuscatedName("hn.v(Ljava/lang/String;IIII)V")
    public void method3568(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method3590(arg3, arg4);
            this.method3551(arg0, arg1 - this.method3536(arg0) / 2, arg2);
        }
    }

    @ObfuscatedName("hn.n(Ljava/lang/String;IIIIIIIII)I")
    public int method3544(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method3590(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field3088;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field3089 + this.field3082 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method3577(arg0, var11, field3103);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field3089 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field3089 - this.field3082 - (var12 - 1) * arg9) / 2 + this.field3089 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field3082 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field3089 - this.field3082 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field3089 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method3551(field3103[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method3551(field3103[var15], arg1 + (arg3 - this.method3536(field3103[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method3551(field3103[var15], arg1 + arg3 - this.method3536(field3103[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method3551(field3103[var15], arg1, var13);
            } else {
                this.method3550(field3103[var15], arg3);
                this.method3551(field3103[var15], arg1, var13);
                field3100 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @ObfuscatedName("hn.z(Ljava/lang/String;IIIII)V")
    public void method3545(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3590(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        for (int var8 = 0; var8 < arg0.length(); var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method3534(arg0, arg1 - this.method3536(arg0) / 2, arg2, (int[]) null, var7);
    }

    @ObfuscatedName("hn.r(Ljava/lang/String;IIIII)V")
    public void method3546(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3590(arg3, arg4);
        int[] var7 = new int[arg0.length()];
        int[] var8 = new int[arg0.length()];
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method3534(arg0, arg1 - this.method3536(arg0) / 2, arg2, var7, var8);
    }

    @ObfuscatedName("hn.i(Ljava/lang/String;IIIIII)V")
    public void method3547(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method3590(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.length()];
        for (int var11 = 0; var11 < arg0.length(); var11++) {
            var10[var11] = (int) (Math.sin((double) arg5 / 1.0D + (double) var11 / 1.5D) * var8);
        }
        this.method3534(arg0, arg1 - this.method3536(arg0) / 2, arg2, (int[]) null, var10);
    }

    @ObfuscatedName("hn.s(Ljava/lang/String;IIIII)V")
    public void method3621(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method3590(arg3, arg4);
        field3102.setSeed((long) arg5);
        field3087 = 192 + (field3102.nextInt() & 0x1F);
        int[] var7 = new int[arg0.length()];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.length(); var9++) {
            var7[var9] = var8;
            if ((field3102.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method3534(arg0, arg1, arg2, var7, (int[]) null);
    }

    @ObfuscatedName("hn.c(II)V")
    public void method3590(int arg0, int arg1) {
        field3095 = -1;
        field3094 = -1;
        field3090 = arg1;
        field3096 = arg1;
        field3093 = arg0;
        field3091 = arg0;
        field3087 = 256;
        field3100 = 0;
        field3101 = 0;
    }

    @ObfuscatedName("hn.t(Ljava/lang/String;)V")
    public void method3615(String arg0) {
        try {
            if (arg0.startsWith("col=")) {
                field3091 = class154.method695(arg0.substring(4), 16);
            } else if (arg0.equals("/col")) {
                field3091 = field3093;
            } else if (arg0.startsWith("str=")) {
                field3095 = class154.method695(arg0.substring(4), 16);
            } else if (arg0.equals("str")) {
                field3095 = 8388608;
            } else if (arg0.equals("/str")) {
                field3095 = -1;
            } else if (arg0.startsWith("u=")) {
                field3094 = class154.method695(arg0.substring(2), 16);
            } else if (arg0.equals("u")) {
                field3094 = 0;
            } else if (arg0.equals("/u")) {
                field3094 = -1;
            } else if (arg0.startsWith("shad=")) {
                field3096 = class154.method695(arg0.substring(5), 16);
            } else if (arg0.equals("shad")) {
                field3096 = 0;
            } else if (arg0.equals("/shad")) {
                field3096 = field3090;
            } else if (arg0.equals("br")) {
                this.method3590(field3093, field3090);
            }
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("hn.h(Ljava/lang/String;I)V")
    public void method3550(String arg0, int arg1) {
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
            field3100 = (arg1 - this.method3536(arg0) << 8) / var3;
        }
    }

    @ObfuscatedName("hn.w(Ljava/lang/String;II)V")
    public void method3551(String arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3088;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.length(); var7++) {
            if (arg0.charAt(var7) != 0) {
                char var8 = (char) (class156.method146(arg0.charAt(var7)) & 0xFF);
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
                                        String var10 = var9.substring(4);
                                        int var11 = class154.method2535(var10, 10, true);
                                        class76 var13 = Statics.field3098[var11];
                                        var13.method1561(arg1, this.field3088 + var4 - var13.field1354);
                                        arg1 += var13.field1356;
                                        var6 = -1;
                                    } catch (Exception var18) {
                                    }
                                } else {
                                    this.method3615(var9);
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
                        if (this.field3092 != null && var6 != -1) {
                            arg1 += this.field3092[(var6 << 8) + var8];
                        }
                        int var15 = this.field3097[var8];
                        int var16 = this.field3085[var8];
                        if (var8 == ' ') {
                            if (field3100 > 0) {
                                field3101 += field3100;
                                arg1 += field3101 >> 8;
                                field3101 &= 0xFF;
                            }
                        } else if (field3087 == 256) {
                            if (field3096 != -1) {
                                method3565(this.field3099[var8], this.field3086[var8] + arg1 + 1, this.field3084[var8] + var4 + 1, var15, var16, field3096);
                            }
                            this.method3553(this.field3099[var8], this.field3086[var8] + arg1, this.field3084[var8] + var4, var15, var16, field3091);
                        } else {
                            if (field3096 != -1) {
                                method3557(this.field3099[var8], this.field3086[var8] + arg1 + 1, this.field3084[var8] + var4 + 1, var15, var16, field3096, field3087);
                            }
                            this.method3554(this.field3099[var8], this.field3086[var8] + arg1, this.field3084[var8] + var4, var15, var16, field3091, field3087);
                        }
                        int var17 = this.field3083[var8];
                        if (field3095 != -1) {
                            method1509(arg1, (int) ((double) this.field3088 * 0.7D) + var4, var17, field3095);
                        }
                        if (field3094 != -1) {
                            method1509(arg1, this.field3088 + var4 + 1, var17, field3094);
                        }
                        arg1 += var17;
                        var6 = var8;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hn.g(Ljava/lang/String;II[I[I)V")
    public void method3534(String arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field3088;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.length(); var10++) {
            if (arg0.charAt(var10) != 0) {
                char var11 = (char) (class156.method146(arg0.charAt(var10)) & 0xFF);
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
                                        String var15 = var12.substring(4);
                                        int var16 = class154.method2535(var15, 10, true);
                                        class76 var18 = Statics.field3098[var16];
                                        var18.method1561(arg1 + var13, this.field3088 + var6 - var18.field1354 + var14);
                                        arg1 += var18.field1356;
                                        var8 = -1;
                                    } catch (Exception var25) {
                                    }
                                } else {
                                    this.method3615(var12);
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
                        if (this.field3092 != null && var8 != -1) {
                            arg1 += this.field3092[(var8 << 8) + var11];
                        }
                        int var20 = this.field3097[var11];
                        int var21 = this.field3085[var11];
                        int var22;
                        if (arg3 == null) {
                            var22 = 0;
                        } else {
                            var22 = arg3[var9];
                        }
                        int var23;
                        if (arg4 == null) {
                            var23 = 0;
                        } else {
                            var23 = arg4[var9];
                        }
                        var9++;
                        if (var11 == ' ') {
                            if (field3100 > 0) {
                                field3101 += field3100;
                                arg1 += field3101 >> 8;
                                field3101 &= 0xFF;
                            }
                        } else if (field3087 == 256) {
                            if (field3096 != -1) {
                                method3565(this.field3099[var11], this.field3086[var11] + arg1 + 1 + var22, this.field3084[var11] + var6 + 1 + var23, var20, var21, field3096);
                            }
                            this.method3553(this.field3099[var11], this.field3086[var11] + arg1 + var22, this.field3084[var11] + var6 + var23, var20, var21, field3091);
                        } else {
                            if (field3096 != -1) {
                                method3557(this.field3099[var11], this.field3086[var11] + arg1 + 1 + var22, this.field3084[var11] + var6 + 1 + var23, var20, var21, field3096, field3087);
                            }
                            this.method3554(this.field3099[var11], this.field3086[var11] + arg1 + var22, this.field3084[var11] + var6 + var23, var20, var21, field3091, field3087);
                        }
                        int var24 = this.field3083[var11];
                        if (field3095 != -1) {
                            method1509(arg1, (int) ((double) this.field3088 * 0.7D) + var6, var24, field3095);
                        }
                        if (field3094 != -1) {
                            method1509(arg1, this.field3088 + var6, var24, field3094);
                        }
                        arg1 += var24;
                        var8 = var11;
                    }
                }
            }
        }
    }

    @ObfuscatedName("hn.j([BIIIII)V")
    public static void method3565(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = Statics.field1343 * arg2 + arg1;
        int var7 = Statics.field1343 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < field1346) {
            int var10 = field1346 - arg2;
            arg4 -= var10;
            arg2 = field1346;
            var9 += arg3 * var10;
            var6 += Statics.field1343 * var10;
        }
        if (arg2 + arg4 > field1347) {
            arg4 -= arg2 + arg4 - field1347;
        }
        if (arg1 < field1348) {
            int var11 = field1348 - arg1;
            arg3 -= var11;
            arg1 = field1348;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > field1344) {
            int var12 = arg1 + arg3 - field1344;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3556(Statics.field1349, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @ObfuscatedName("hn.x([I[BIIIIIII)V")
    public static void method3556(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("hn.d([BIIIIII)V")
    public static void method3557(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Statics.field1343 * arg2 + arg1;
        int var8 = Statics.field1343 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1346) {
            int var11 = field1346 - arg2;
            arg4 -= var11;
            arg2 = field1346;
            var10 += arg3 * var11;
            var7 += Statics.field1343 * var11;
        }
        if (arg2 + arg4 > field1347) {
            arg4 -= arg2 + arg4 - field1347;
        }
        if (arg1 < field1348) {
            int var12 = field1348 - arg1;
            arg3 -= var12;
            arg1 = field1348;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field1344) {
            int var13 = arg1 + arg3 - field1344;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3558(Statics.field1349, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @ObfuscatedName("hn.ax([I[BIIIIIIII)V")
    public static void method3558(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("hn.f([BIIIII)V")
    public abstract void method3553(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @ObfuscatedName("hn.y([BIIIIII)V")
    public abstract void method3554(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
