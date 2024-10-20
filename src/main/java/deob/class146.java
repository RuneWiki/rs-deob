package deob;

@ObfuscatedName("ey")
public abstract class class146 {

    @ObfuscatedName("ey.t")
    public int field2440;

    @ObfuscatedName("ey.o")
    public int[] field2427;

    @ObfuscatedName("ey.i")
    public int[] field2429;

    @ObfuscatedName("ey.p")
    public class170 field2430;

    @ObfuscatedName("ey.c")
    public int[] field2436;

    @ObfuscatedName("ey.y")
    public int[] field2426;

    @ObfuscatedName("ey.g")
    public int[] field2432;

    @ObfuscatedName("ey.l")
    public int[][] field2433;

    @ObfuscatedName("ey.h")
    public int[][] field2431;

    @ObfuscatedName("ey.n")
    public class170[] field2438;

    @ObfuscatedName("ey.w")
    public Object[] field2428;

    @ObfuscatedName("ey.m")
    public Object[][] field2437;

    @ObfuscatedName("ey.x")
    public static class104 field2434 = new class104();

    @ObfuscatedName("ey.b")
    public int field2435;

    @ObfuscatedName("ey.u")
    public boolean field2439;

    @ObfuscatedName("ey.r")
    public boolean field2441;

    @ObfuscatedName("ey.z")
    public static int field2442 = 0;

    public class146(boolean arg0, boolean arg1) {
        this.field2439 = arg0;
        this.field2441 = arg1;
    }

    @ObfuscatedName("ey.t([BI)V")
    public void method2694(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class107.method1578(arg0, 0, var2);
        this.field2435 = var3;
        class107 var4 = new class107(method783(arg0));
        int var5 = var4.method2118();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2152();
        }
        int var6 = var4.method2118();
        if (var5 >= 7) {
            this.field2440 = var4.method2132();
        } else {
            this.field2440 = var4.method2120();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2427 = new int[this.field2440];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2440; var9++) {
                this.field2427[var9] = var7 += var4.method2132();
                if (this.field2427[var9] > var8) {
                    var8 = this.field2427[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2440; var10++) {
                this.field2427[var10] = var7 += var4.method2120();
                if (this.field2427[var10] > var8) {
                    var8 = this.field2427[var10];
                }
            }
        }
        this.field2436 = new int[var8 + 1];
        this.field2426 = new int[var8 + 1];
        this.field2432 = new int[var8 + 1];
        this.field2433 = new int[var8 + 1][];
        this.field2428 = new Object[var8 + 1];
        this.field2437 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2429 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2440; var11++) {
                this.field2429[this.field2427[var11]] = var4.method2152();
            }
            this.field2430 = new class170(this.field2429);
        }
        for (int var12 = 0; var12 < this.field2440; var12++) {
            this.field2436[this.field2427[var12]] = var4.method2152();
        }
        for (int var13 = 0; var13 < this.field2440; var13++) {
            this.field2426[this.field2427[var13]] = var4.method2152();
        }
        for (int var14 = 0; var14 < this.field2440; var14++) {
            this.field2432[this.field2427[var14]] = var4.method2120();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2440; var15++) {
                int var16 = this.field2427[var15];
                int var17 = this.field2432[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2433[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2433[var16][var20] = var18 += var4.method2132();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2437[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2440; var22++) {
                int var23 = this.field2427[var22];
                int var24 = this.field2432[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2433[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2433[var23][var27] = var25 += var4.method2120();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2437[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2431 = new int[var8 + 1][];
        this.field2438 = new class170[var8 + 1];
        for (int var29 = 0; var29 < this.field2440; var29++) {
            int var30 = this.field2427[var29];
            int var31 = this.field2432[var30];
            this.field2431[var30] = new int[this.field2437[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2431[var30][this.field2433[var30][var32]] = var4.method2152();
            }
            this.field2438[var30] = new class170(this.field2431[var30]);
        }
    }

    @ObfuscatedName("ey.o(IS)V")
    public void method2667(int arg0) {
    }

    @ObfuscatedName("ey.i(IIB)[B")
    public byte[] method2668(int arg0, int arg1) {
        return this.method2669(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ey.p(II[II)[B")
    public byte[] method2669(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2437.length || this.field2437[arg0] == null || arg1 < 0 || arg1 >= this.field2437[arg0].length) {
            return null;
        }
        if (this.field2437[arg0][arg1] == null) {
            boolean var4 = this.method2676(arg0, arg2);
            if (!var4) {
                this.method2678(arg0);
                boolean var5 = this.method2676(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class112.method986(this.field2437[arg0][arg1], false);
        if (this.field2441) {
            this.field2437[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ey.c(IIB)Z")
    public boolean method2670(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2437.length || this.field2437[arg0] == null || arg1 < 0 || arg1 >= this.field2437[arg0].length) {
            return false;
        } else if (this.field2437[arg0][arg1] != null) {
            return true;
        } else if (this.field2428[arg0] == null) {
            this.method2678(arg0);
            return this.field2428[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ey.y(II)Z")
    public boolean method2671(int arg0) {
        if (this.field2428[arg0] == null) {
            this.method2678(arg0);
            return this.field2428[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ey.g(B)Z")
    public boolean method2672() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2427.length; var2++) {
            int var3 = this.field2427[var2];
            if (this.field2428[var3] == null) {
                this.method2678(var3);
                if (this.field2428[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ey.l(II)[B")
    public byte[] method2673(int arg0) {
        if (this.field2437.length == 1) {
            return this.method2668(0, arg0);
        } else if (this.field2437[arg0].length == 1) {
            return this.method2668(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ey.h(III)[B")
    public byte[] method2674(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2437.length || this.field2437[arg0] == null || arg1 < 0 || arg1 >= this.field2437[arg0].length) {
            return null;
        }
        if (this.field2437[arg0][arg1] == null) {
            boolean var3 = this.method2676(arg0, (int[]) null);
            if (!var3) {
                this.method2678(arg0);
                boolean var4 = this.method2676(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class112.method986(this.field2437[arg0][arg1], false);
    }

    @ObfuscatedName("ey.n(II)[B")
    public byte[] method2675(int arg0) {
        if (this.field2437.length == 1) {
            return this.method2674(0, arg0);
        } else if (this.field2437[arg0].length == 1) {
            return this.method2674(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ey.w(II)V")
    public void method2678(int arg0) {
    }

    @ObfuscatedName("ey.m(IB)[I")
    public int[] method2677(int arg0) {
        return this.field2433[arg0];
    }

    @ObfuscatedName("ey.x(IB)I")
    public int method2740(int arg0) {
        return this.field2437[arg0].length;
    }

    @ObfuscatedName("ey.b(I)I")
    public int method2679() {
        return this.field2437.length;
    }

    @ObfuscatedName("ey.u(IS)V")
    public void method2680(int arg0) {
        for (int var2 = 0; var2 < this.field2437[arg0].length; var2++) {
            this.field2437[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ey.r(I)V")
    public void method2742() {
        for (int var1 = 0; var1 < this.field2437.length; var1++) {
            if (this.field2437[var1] != null) {
                for (int var2 = 0; var2 < this.field2437[var1].length; var2++) {
                    this.field2437[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ey.z(I[IB)Z")
    public boolean method2676(int arg0, int[] arg1) {
        if (this.field2428[arg0] == null) {
            return false;
        }
        int var3 = this.field2432[arg0];
        int[] var4 = this.field2433[arg0];
        Object[] var5 = this.field2437[arg0];
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
            var8 = class112.method986(this.field2428[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2135(arg1, 5, var9.field1826.length);
        } else {
            var8 = class112.method986(this.field2428[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method783(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class107.method1578(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class107.method1578(var8, 0, var18);
            throw class135.method827(var35, var17 + var19 + "," + this.field2436[arg0] + "," + this.field2435);
        }
        if (this.field2439) {
            this.field2428[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class107 var23 = new class107(var10);
            int[] var24 = new int[var3];
            var23.field1827 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2152();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field1827 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2152();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2441) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class112.method2335(var28[var34], false);
                }
            }
        } else if (this.field2441) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method2335(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ey.v(Ljava/lang/String;I)I")
    public int method2711(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2430.method3095(class199.method2409(var2));
    }

    @ObfuscatedName("ey.k(ILjava/lang/String;B)I")
    public int method2739(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2438[arg0].method3095(class199.method2409(var3));
    }

    @ObfuscatedName("ey.a(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2684(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2430.method3095(class199.method2409(var3));
        int var6 = this.field2438[var5].method3095(class199.method2409(var4));
        return this.method2668(var5, var6);
    }

    @ObfuscatedName("ey.d(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method2685(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2430.method3095(class199.method2409(var3));
        int var6 = this.field2438[var5].method3095(class199.method2409(var4));
        return this.method2670(var5, var6);
    }

    @ObfuscatedName("ey.j(Ljava/lang/String;I)Z")
    public boolean method2686(String arg0) {
        int var2 = this.method2711("");
        return var2 == -1 ? this.method2685(arg0, "") : this.method2685("", arg0);
    }

    @ObfuscatedName("ey.s(Ljava/lang/String;I)V")
    public void method2687(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2430.method3095(class199.method2409(var2));
        if (var3 >= 0) {
            this.method2667(var3);
        }
    }

    @ObfuscatedName("an.f([BI)[B")
    public static final byte[] method783(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2118();
        int var3 = var1.method2152();
        if (var3 < 0 || !(field2442 == 0 || var3 <= field2442)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2129(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2152();
            if (var5 < 0 || field2442 != 0 && var5 > field2442) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2076(var6, var5, arg0, var3, 9);
            } else {
                field2434.method2068(var1, var6);
            }
            return var6;
        }
    }
}
