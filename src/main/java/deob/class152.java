package deob;

@ObfuscatedName("ej")
public abstract class class152 {

    @ObfuscatedName("ej.d")
    public int field2520;

    @ObfuscatedName("ej.g")
    public int[] field2511;

    @ObfuscatedName("ej.a")
    public int[] field2509;

    @ObfuscatedName("ej.t")
    public class169 field2524;

    @ObfuscatedName("ej.f")
    public int[] field2530;

    @ObfuscatedName("ej.c")
    public int[] field2514;

    @ObfuscatedName("ej.p")
    public int[] field2515;

    @ObfuscatedName("ej.s")
    public int[][] field2516;

    @ObfuscatedName("ej.k")
    public int[][] field2517;

    @ObfuscatedName("ej.m")
    public class169[] field2513;

    @ObfuscatedName("ej.y")
    public Object[] field2512;

    @ObfuscatedName("ej.b")
    public Object[][] field2519;

    @ObfuscatedName("ej.l")
    public static class122 field2521 = new class122();

    @ObfuscatedName("ej.x")
    public int field2522;

    @ObfuscatedName("ej.z")
    public boolean field2523;

    @ObfuscatedName("ej.r")
    public boolean field2510;

    @ObfuscatedName("ej.h")
    public static int field2525 = 0;

    public class152(boolean arg0, boolean arg1) {
        this.field2523 = arg0;
        this.field2510 = arg1;
    }

    @ObfuscatedName("ej.d([BI)V")
    public void method2932(byte[] arg0) {
        this.field2522 = class127.method2323(arg0, arg0.length);
        class127 var2 = new class127(method2637(arg0));
        int var3 = var2.method2509();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2405();
        }
        int var4 = var2.method2509();
        if (var3 >= 7) {
            this.field2520 = var2.method2414();
        } else {
            this.field2520 = var2.method2512();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2511 = new int[this.field2520];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2520; var7++) {
                this.field2511[var7] = var5 += var2.method2414();
                if (this.field2511[var7] > var6) {
                    var6 = this.field2511[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2520; var8++) {
                this.field2511[var8] = var5 += var2.method2512();
                if (this.field2511[var8] > var6) {
                    var6 = this.field2511[var8];
                }
            }
        }
        this.field2530 = new int[var6 + 1];
        this.field2514 = new int[var6 + 1];
        this.field2515 = new int[var6 + 1];
        this.field2516 = new int[var6 + 1][];
        this.field2512 = new Object[var6 + 1];
        this.field2519 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2509 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2520; var9++) {
                this.field2509[this.field2511[var9]] = var2.method2405();
            }
            this.field2524 = new class169(this.field2509);
        }
        for (int var10 = 0; var10 < this.field2520; var10++) {
            this.field2530[this.field2511[var10]] = var2.method2405();
        }
        for (int var11 = 0; var11 < this.field2520; var11++) {
            this.field2514[this.field2511[var11]] = var2.method2405();
        }
        for (int var12 = 0; var12 < this.field2520; var12++) {
            this.field2515[this.field2511[var12]] = var2.method2512();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2520; var13++) {
                int var14 = this.field2511[var13];
                int var15 = this.field2515[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2516[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2516[var14][var18] = var16 += var2.method2414();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2519[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2520; var20++) {
                int var21 = this.field2511[var20];
                int var22 = this.field2515[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2516[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2516[var21][var25] = var23 += var2.method2512();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2519[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2517 = new int[var6 + 1][];
        this.field2513 = new class169[var6 + 1];
        for (int var27 = 0; var27 < this.field2520; var27++) {
            int var28 = this.field2511[var27];
            int var29 = this.field2515[var28];
            this.field2517[var28] = new int[this.field2519[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2517[var28][this.field2516[var28][var30]] = var2.method2405();
            }
            this.field2513[var28] = new class169(this.field2517[var28]);
        }
    }

    @ObfuscatedName("ej.g(IB)V")
    public void method2969(int arg0) {
    }

    @ObfuscatedName("ej.a(IIB)[B")
    public byte[] method2958(int arg0, int arg1) {
        return this.method2959(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ej.t(II[II)[B")
    public byte[] method2959(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2519.length || this.field2519[arg0] == null || arg1 < 0 || arg1 >= this.field2519[arg0].length) {
            return null;
        }
        if (this.field2519[arg0][arg1] == null) {
            boolean var4 = this.method2947(arg0, arg2);
            if (!var4) {
                this.method2942(arg0);
                boolean var5 = this.method2947(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = Statics.method235(this.field2519[arg0][arg1], false);
        if (this.field2510) {
            this.field2519[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ej.f(III)Z")
    public boolean method2999(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2519.length || this.field2519[arg0] == null || arg1 < 0 || arg1 >= this.field2519[arg0].length) {
            return false;
        } else if (this.field2519[arg0][arg1] != null) {
            return true;
        } else if (this.field2512[arg0] == null) {
            this.method2942(arg0);
            return this.field2512[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ej.c(II)Z")
    public boolean method2937(int arg0) {
        if (this.field2512[arg0] == null) {
            this.method2942(arg0);
            return this.field2512[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ej.p(S)Z")
    public boolean method2985() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2511.length; var2++) {
            int var3 = this.field2511[var2];
            if (this.field2512[var3] == null) {
                this.method2942(var3);
                if (this.field2512[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ej.s(IB)[B")
    public byte[] method2939(int arg0) {
        if (this.field2519.length == 1) {
            return this.method2958(0, arg0);
        } else if (this.field2519[arg0].length == 1) {
            return this.method2958(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ej.k(III)[B")
    public byte[] method2940(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2519.length || this.field2519[arg0] == null || arg1 < 0 || arg1 >= this.field2519[arg0].length) {
            return null;
        }
        if (this.field2519[arg0][arg1] == null) {
            boolean var3 = this.method2947(arg0, (int[]) null);
            if (!var3) {
                this.method2942(arg0);
                boolean var4 = this.method2947(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return Statics.method235(this.field2519[arg0][arg1], false);
    }

    @ObfuscatedName("ej.m(II)[B")
    public byte[] method2953(int arg0) {
        if (this.field2519.length == 1) {
            return this.method2940(0, arg0);
        } else if (this.field2519[arg0].length == 1) {
            return this.method2940(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ej.y(IB)V")
    public void method2942(int arg0) {
    }

    @ObfuscatedName("ej.b(II)[I")
    public int[] method2951(int arg0) {
        return this.field2516[arg0];
    }

    @ObfuscatedName("ej.l(II)I")
    public int method2943(int arg0) {
        return this.field2519[arg0].length;
    }

    @ObfuscatedName("ej.x(B)I")
    public int method2987() {
        return this.field2519.length;
    }

    @ObfuscatedName("ej.z(II)V")
    public void method2945(int arg0) {
        for (int var2 = 0; var2 < this.field2519[arg0].length; var2++) {
            this.field2519[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ej.r(I)V")
    public void method2946() {
        for (int var1 = 0; var1 < this.field2519.length; var1++) {
            if (this.field2519[var1] != null) {
                for (int var2 = 0; var2 < this.field2519[var1].length; var2++) {
                    this.field2519[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ej.h(I[IB)Z")
    public boolean method2947(int arg0, int[] arg1) {
        if (this.field2512[arg0] == null) {
            return false;
        }
        int var3 = this.field2515[arg0];
        int[] var4 = this.field2516[arg0];
        Object[] var5 = this.field2519[arg0];
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            if (var5[var4[var7]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var8;
        if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
            var8 = Statics.method235(this.field2512[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2417(arg1, 5, var9.field2035.length);
        } else {
            var8 = Statics.method235(this.field2512[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2637(var8);
        } catch (RuntimeException var27) {
            throw class80.method2314(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class127.method2323(var8, var8.length) + "," + class127.method2323(var8, var8.length - 2) + "," + this.field2530[arg0] + "," + this.field2522);
        }
        if (this.field2523) {
            this.field2512[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class127 var15 = new class127(var10);
            int[] var16 = new int[var3];
            var15.field2042 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2405();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2042 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2405();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2510) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class119.method40(var20[var26], false);
                }
            }
        } else if (this.field2510) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method40(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ej.v(Ljava/lang/String;I)I")
    public int method2948(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2524.method3205(class147.method1621(var2));
    }

    @ObfuscatedName("ej.u(ILjava/lang/String;I)I")
    public int method3007(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2513[arg0].method3205(class147.method1621(var3));
    }

    @ObfuscatedName("ej.i(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method2950(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2524.method3205(class147.method1621(var3));
        int var6 = this.field2513[var5].method3205(class147.method1621(var4));
        return this.method2958(var5, var6);
    }

    @ObfuscatedName("ej.e(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3009(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2524.method3205(class147.method1621(var3));
        int var6 = this.field2513[var5].method3205(class147.method1621(var4));
        return this.method2999(var5, var6);
    }

    @ObfuscatedName("ej.n(Ljava/lang/String;I)V")
    public void method2952(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2524.method3205(class147.method1621(var2));
        if (var3 >= 0) {
            this.method2969(var3);
        }
    }

    @ObfuscatedName("ef.q([BB)[B")
    public static final byte[] method2637(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2509();
        int var3 = var1.method2405();
        if (var3 < 0 || !(field2525 == 0 || var3 <= field2525)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2388(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2405();
            if (var5 < 0 || field2525 != 0 && var5 > field2525) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2334(var6, var5, arg0, var3, 9);
            } else {
                field2521.method2329(var1, var6);
            }
            return var6;
        }
    }
}
