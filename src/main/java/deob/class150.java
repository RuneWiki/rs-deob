package deob;

@ObfuscatedName("ez")
public abstract class class150 {

    @ObfuscatedName("ez.g")
    public int field2445;

    @ObfuscatedName("ez.e")
    public int[] field2440;

    @ObfuscatedName("ez.n")
    public int[] field2438;

    @ObfuscatedName("ez.j")
    public class167 field2439;

    @ObfuscatedName("ez.i")
    public int[] field2443;

    @ObfuscatedName("ez.o")
    public int[] field2441;

    @ObfuscatedName("ez.l")
    public int[] field2442;

    @ObfuscatedName("ez.p")
    public int[][] field2446;

    @ObfuscatedName("ez.t")
    public int[][] field2444;

    @ObfuscatedName("ez.w")
    public class167[] field2448;

    @ObfuscatedName("ez.r")
    public Object[] field2451;

    @ObfuscatedName("ez.a")
    public Object[][] field2447;

    @ObfuscatedName("ez.q")
    public static class121 field2437 = new class121();

    @ObfuscatedName("ez.z")
    public int field2449;

    @ObfuscatedName("ez.d")
    public boolean field2450;

    @ObfuscatedName("ez.x")
    public boolean field2436;

    @ObfuscatedName("ez.s")
    public static int field2452 = 0;

    public class150(boolean arg0, boolean arg1) {
        this.field2450 = arg0;
        this.field2436 = arg1;
    }

    @ObfuscatedName("ez.g([BI)V")
    public void method3037(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class126.method1609(arg0, 0, var2);
        this.field2449 = var3;
        class126 var4 = new class126(method3005(arg0));
        int var5 = var4.method2485();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2593();
        }
        int var6 = var4.method2485();
        if (var5 >= 7) {
            this.field2445 = var4.method2499();
        } else {
            this.field2445 = var4.method2487();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2440 = new int[this.field2445];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2445; var9++) {
                this.field2440[var9] = var7 += var4.method2499();
                if (this.field2440[var9] > var8) {
                    var8 = this.field2440[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2445; var10++) {
                this.field2440[var10] = var7 += var4.method2487();
                if (this.field2440[var10] > var8) {
                    var8 = this.field2440[var10];
                }
            }
        }
        this.field2443 = new int[var8 + 1];
        this.field2441 = new int[var8 + 1];
        this.field2442 = new int[var8 + 1];
        this.field2446 = new int[var8 + 1][];
        this.field2451 = new Object[var8 + 1];
        this.field2447 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2438 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2445; var11++) {
                this.field2438[this.field2440[var11]] = var4.method2593();
            }
            this.field2439 = new class167(this.field2438);
        }
        for (int var12 = 0; var12 < this.field2445; var12++) {
            this.field2443[this.field2440[var12]] = var4.method2593();
        }
        for (int var13 = 0; var13 < this.field2445; var13++) {
            this.field2441[this.field2440[var13]] = var4.method2593();
        }
        for (int var14 = 0; var14 < this.field2445; var14++) {
            this.field2442[this.field2440[var14]] = var4.method2487();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2445; var15++) {
                int var16 = this.field2440[var15];
                int var17 = this.field2442[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2446[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2446[var16][var20] = var18 += var4.method2499();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2447[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2445; var22++) {
                int var23 = this.field2440[var22];
                int var24 = this.field2442[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2446[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2446[var23][var27] = var25 += var4.method2487();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2447[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2444 = new int[var8 + 1][];
        this.field2448 = new class167[var8 + 1];
        for (int var29 = 0; var29 < this.field2445; var29++) {
            int var30 = this.field2440[var29];
            int var31 = this.field2442[var30];
            this.field2444[var30] = new int[this.field2447[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2444[var30][this.field2446[var30][var32]] = var4.method2593();
            }
            this.field2448[var30] = new class167(this.field2444[var30]);
        }
    }

    @ObfuscatedName("ez.e(II)V")
    public void method3013(int arg0) {
    }

    @ObfuscatedName("ez.n(IIB)[B")
    public byte[] method3012(int arg0, int arg1) {
        return this.method3072(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ez.j(II[II)[B")
    public byte[] method3072(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2447.length || this.field2447[arg0] == null || arg1 < 0 || arg1 >= this.field2447[arg0].length) {
            return null;
        }
        if (this.field2447[arg0][arg1] == null) {
            boolean var4 = this.method3025(arg0, arg2);
            if (!var4) {
                this.method3020(arg0);
                boolean var5 = this.method3025(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class118.method681(this.field2447[arg0][arg1], false);
        if (this.field2436) {
            this.field2447[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ez.i(IIB)Z")
    public boolean method3014(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2447.length || this.field2447[arg0] == null || arg1 < 0 || arg1 >= this.field2447[arg0].length) {
            return false;
        } else if (this.field2447[arg0][arg1] != null) {
            return true;
        } else if (this.field2451[arg0] == null) {
            this.method3020(arg0);
            return this.field2451[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ez.o(II)Z")
    public boolean method3015(int arg0) {
        if (this.field2451[arg0] == null) {
            this.method3020(arg0);
            return this.field2451[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ez.l(B)Z")
    public boolean method3016() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2440.length; var2++) {
            int var3 = this.field2440[var2];
            if (this.field2451[var3] == null) {
                this.method3020(var3);
                if (this.field2451[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ez.p(II)[B")
    public byte[] method3017(int arg0) {
        if (this.field2447.length == 1) {
            return this.method3012(0, arg0);
        } else if (this.field2447[arg0].length == 1) {
            return this.method3012(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ez.t(III)[B")
    public byte[] method3018(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2447.length || this.field2447[arg0] == null || arg1 < 0 || arg1 >= this.field2447[arg0].length) {
            return null;
        }
        if (this.field2447[arg0][arg1] == null) {
            boolean var3 = this.method3025(arg0, (int[]) null);
            if (!var3) {
                this.method3020(arg0);
                boolean var4 = this.method3025(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class118.method681(this.field2447[arg0][arg1], false);
    }

    @ObfuscatedName("ez.w(IB)[B")
    public byte[] method3019(int arg0) {
        if (this.field2447.length == 1) {
            return this.method3018(0, arg0);
        } else if (this.field2447[arg0].length == 1) {
            return this.method3018(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ez.r(II)V")
    public void method3020(int arg0) {
    }

    @ObfuscatedName("ez.a(IB)[I")
    public int[] method3031(int arg0) {
        return this.field2446[arg0];
    }

    @ObfuscatedName("ez.q(II)I")
    public int method3033(int arg0) {
        return this.field2447[arg0].length;
    }

    @ObfuscatedName("ez.z(I)I")
    public int method3022() {
        return this.field2447.length;
    }

    @ObfuscatedName("ez.d(II)V")
    public void method3045(int arg0) {
        for (int var2 = 0; var2 < this.field2447[arg0].length; var2++) {
            this.field2447[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ez.x(B)V")
    public void method3053() {
        for (int var1 = 0; var1 < this.field2447.length; var1++) {
            if (this.field2447[var1] != null) {
                for (int var2 = 0; var2 < this.field2447[var1].length; var2++) {
                    this.field2447[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ez.s(I[II)Z")
    public boolean method3025(int arg0, int[] arg1) {
        if (this.field2451[arg0] == null) {
            return false;
        }
        int var3 = this.field2442[arg0];
        int[] var4 = this.field2446[arg0];
        Object[] var5 = this.field2447[arg0];
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
            var8 = class118.method681(this.field2451[arg0], true);
            class126 var9 = new class126(var8);
            var9.method2502(arg1, 5, var9.field2013.length);
        } else {
            var8 = class118.method681(this.field2451[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method3005(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class126.method1609(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class126.method1609(var8, 0, var17);
            throw class79.method2062(var34, var16 + var18 + "," + this.field2443[arg0] + "," + this.field2449);
        }
        if (this.field2450) {
            this.field2451[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class126 var22 = new class126(var10);
            int[] var23 = new int[var3];
            var22.field2016 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2593();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field2016 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2593();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2436) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class118.method1562(var27[var33], false);
                }
            }
        } else if (this.field2436) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class118.method1562(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ez.m(Ljava/lang/String;I)I")
    public int method3021(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2439.method3306(class146.method2059(var2));
    }

    @ObfuscatedName("ez.y(ILjava/lang/String;S)I")
    public int method3038(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2448[arg0].method3306(class146.method2059(var3));
    }

    @ObfuscatedName("ez.b(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3028(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2439.method3306(class146.method2059(var3));
        int var6 = this.field2448[var5].method3306(class146.method2059(var4));
        return this.method3012(var5, var6);
    }

    @ObfuscatedName("ez.h(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3040(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2439.method3306(class146.method2059(var3));
        int var6 = this.field2448[var5].method3306(class146.method2059(var4));
        return this.method3014(var5, var6);
    }

    @ObfuscatedName("ez.f(Ljava/lang/String;B)V")
    public void method3030(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2439.method3306(class146.method2059(var2));
        if (var3 >= 0) {
            this.method3013(var3);
        }
    }

    @ObfuscatedName("ex.v([BB)[B")
    public static final byte[] method3005(byte[] arg0) {
        class126 var1 = new class126(arg0);
        int var2 = var1.method2485();
        int var3 = var1.method2593();
        if (var3 < 0 || !(field2452 == 0 || var3 <= field2452)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2651(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2593();
            if (var5 < 0 || field2452 != 0 && var5 > field2452) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class122.method2431(var6, var5, arg0, var3, 9);
            } else {
                field2437.method2426(var1, var6);
            }
            return var6;
        }
    }
}
