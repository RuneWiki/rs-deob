package deob;

@ObfuscatedName("fg")
public abstract class class158 {

    @ObfuscatedName("fg.o")
    public int field2558;

    @ObfuscatedName("fg.l")
    public int[] field2555;

    @ObfuscatedName("fg.g")
    public int[] field2565;

    @ObfuscatedName("fg.u")
    public class183 field2557;

    @ObfuscatedName("fg.q")
    public int[] field2563;

    @ObfuscatedName("fg.r")
    public int[] field2559;

    @ObfuscatedName("fg.v")
    public int[] field2554;

    @ObfuscatedName("fg.y")
    public int[][] field2561;

    @ObfuscatedName("fg.k")
    public int[][] field2562;

    @ObfuscatedName("fg.c")
    public class183[] field2556;

    @ObfuscatedName("fg.j")
    public Object[] field2560;

    @ObfuscatedName("fg.m")
    public Object[][] field2564;

    @ObfuscatedName("fg.a")
    public static class108 field2566 = new class108();

    @ObfuscatedName("fg.f")
    public int field2567;

    @ObfuscatedName("fg.i")
    public boolean field2568;

    @ObfuscatedName("fg.n")
    public boolean field2569;

    @ObfuscatedName("fg.x")
    public static int field2570 = 0;

    public class158(boolean arg0, boolean arg1) {
        this.field2568 = arg0;
        this.field2569 = arg1;
    }

    @ObfuscatedName("fg.o([BI)V")
    public void method2966(byte[] arg0) {
        this.field2567 = class111.method173(arg0, arg0.length);
        class111 var2 = new class111(method1481(arg0));
        int var3 = var2.method2219();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2273();
        }
        int var4 = var2.method2219();
        if (var3 >= 7) {
            this.field2558 = var2.method2233();
        } else {
            this.field2558 = var2.method2397();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2555 = new int[this.field2558];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2558; var7++) {
                this.field2555[var7] = var5 += var2.method2233();
                if (this.field2555[var7] > var6) {
                    var6 = this.field2555[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2558; var8++) {
                this.field2555[var8] = var5 += var2.method2397();
                if (this.field2555[var8] > var6) {
                    var6 = this.field2555[var8];
                }
            }
        }
        this.field2563 = new int[var6 + 1];
        this.field2559 = new int[var6 + 1];
        this.field2554 = new int[var6 + 1];
        this.field2561 = new int[var6 + 1][];
        this.field2560 = new Object[var6 + 1];
        this.field2564 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2565 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2558; var9++) {
                this.field2565[this.field2555[var9]] = var2.method2273();
            }
            this.field2557 = new class183(this.field2565);
        }
        for (int var10 = 0; var10 < this.field2558; var10++) {
            this.field2563[this.field2555[var10]] = var2.method2273();
        }
        for (int var11 = 0; var11 < this.field2558; var11++) {
            this.field2559[this.field2555[var11]] = var2.method2273();
        }
        for (int var12 = 0; var12 < this.field2558; var12++) {
            this.field2554[this.field2555[var12]] = var2.method2397();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2558; var13++) {
                int var14 = this.field2555[var13];
                int var15 = this.field2554[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2561[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2561[var14][var18] = var16 += var2.method2233();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2564[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2558; var20++) {
                int var21 = this.field2555[var20];
                int var22 = this.field2554[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2561[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2561[var21][var25] = var23 += var2.method2397();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2564[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2562 = new int[var6 + 1][];
        this.field2556 = new class183[var6 + 1];
        for (int var27 = 0; var27 < this.field2558; var27++) {
            int var28 = this.field2555[var27];
            int var29 = this.field2554[var28];
            this.field2562[var28] = new int[this.field2564[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2562[var28][this.field2561[var28][var30]] = var2.method2273();
            }
            this.field2556[var28] = new class183(this.field2562[var28]);
        }
    }

    @ObfuscatedName("fg.l(II)V")
    public void method2939(int arg0) {
    }

    @ObfuscatedName("fg.g(III)[B")
    public byte[] method2940(int arg0, int arg1) {
        return this.method2941(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fg.u(II[II)[B")
    public byte[] method2941(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2564.length || this.field2564[arg0] == null || arg1 < 0 || arg1 >= this.field2564[arg0].length) {
            return null;
        }
        if (this.field2564[arg0][arg1] == null) {
            boolean var4 = this.method3000(arg0, arg2);
            if (!var4) {
                this.method2983(arg0);
                boolean var5 = this.method3000(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class117.method2023(this.field2564[arg0][arg1], false);
        if (this.field2569) {
            this.field2564[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fg.q(III)Z")
    public boolean method2978(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2564.length || this.field2564[arg0] == null || arg1 < 0 || arg1 >= this.field2564[arg0].length) {
            return false;
        } else if (this.field2564[arg0][arg1] != null) {
            return true;
        } else if (this.field2560[arg0] == null) {
            this.method2983(arg0);
            return this.field2560[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fg.r(IB)Z")
    public boolean method2943(int arg0) {
        if (this.field2560[arg0] == null) {
            this.method2983(arg0);
            return this.field2560[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fg.v(B)Z")
    public boolean method2944() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2555.length; var2++) {
            int var3 = this.field2555[var2];
            if (this.field2560[var3] == null) {
                this.method2983(var3);
                if (this.field2560[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fg.y(II)[B")
    public byte[] method2957(int arg0) {
        if (this.field2564.length == 1) {
            return this.method2940(0, arg0);
        } else if (this.field2564[arg0].length == 1) {
            return this.method2940(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fg.k(IIB)[B")
    public byte[] method2946(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2564.length || this.field2564[arg0] == null || arg1 < 0 || arg1 >= this.field2564[arg0].length) {
            return null;
        }
        if (this.field2564[arg0][arg1] == null) {
            boolean var3 = this.method3000(arg0, (int[]) null);
            if (!var3) {
                this.method2983(arg0);
                boolean var4 = this.method3000(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class117.method2023(this.field2564[arg0][arg1], false);
    }

    @ObfuscatedName("fg.c(II)[B")
    public byte[] method2947(int arg0) {
        if (this.field2564.length == 1) {
            return this.method2946(0, arg0);
        } else if (this.field2564[arg0].length == 1) {
            return this.method2946(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fg.j(II)V")
    public void method2983(int arg0) {
    }

    @ObfuscatedName("fg.m(II)[I")
    public int[] method2949(int arg0) {
        return this.field2561[arg0];
    }

    @ObfuscatedName("fg.a(II)I")
    public int method2950(int arg0) {
        return this.field2564[arg0].length;
    }

    @ObfuscatedName("fg.f(B)I")
    public int method2998() {
        return this.field2564.length;
    }

    @ObfuscatedName("fg.i(II)V")
    public void method2954(int arg0) {
        for (int var2 = 0; var2 < this.field2564[arg0].length; var2++) {
            this.field2564[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fg.n(I)V")
    public void method2948() {
        for (int var1 = 0; var1 < this.field2564.length; var1++) {
            if (this.field2564[var1] != null) {
                for (int var2 = 0; var2 < this.field2564[var1].length; var2++) {
                    this.field2564[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fg.x(I[IB)Z")
    public boolean method3000(int arg0, int[] arg1) {
        if (this.field2560[arg0] == null) {
            return false;
        }
        int var3 = this.field2554[arg0];
        int[] var4 = this.field2561[arg0];
        Object[] var5 = this.field2564[arg0];
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
            var8 = class117.method2023(this.field2560[arg0], true);
            class111 var9 = new class111(var8);
            var9.method2238(arg1, 5, var9.field1860.length);
        } else {
            var8 = class117.method2023(this.field2560[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1481(var8);
        } catch (RuntimeException var27) {
            throw class140.method148(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class111.method173(var8, var8.length) + "," + class111.method173(var8, var8.length - 2) + "," + this.field2563[arg0] + "," + this.field2567);
        }
        if (this.field2568) {
            this.field2560[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class111 var15 = new class111(var10);
            int[] var16 = new int[var3];
            var15.field1861 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2273();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1861 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2273();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2569) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class117.method1846(var20[var26], false);
                }
            }
        } else if (this.field2569) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class117.method1846(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fg.h(Ljava/lang/String;B)I")
    public int method3008(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2557.method3396(class154.method147(var2));
    }

    @ObfuscatedName("fg.t(ILjava/lang/String;B)I")
    public int method2956(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2556[arg0].method3396(class154.method147(var3));
    }

    @ObfuscatedName("fg.w(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method2951(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2557.method3396(class154.method147(var3));
        int var6 = this.field2556[var5].method3396(class154.method147(var4));
        return this.method2940(var5, var6);
    }

    @ObfuscatedName("fg.p(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2958(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2557.method3396(class154.method147(var3));
        int var6 = this.field2556[var5].method3396(class154.method147(var4));
        return this.method2978(var5, var6);
    }

    @ObfuscatedName("fg.z(Ljava/lang/String;I)Z")
    public boolean method3001(String arg0) {
        int var2 = this.method3008("");
        return var2 == -1 ? this.method2958(arg0, "") : this.method2958("", arg0);
    }

    @ObfuscatedName("fg.s(Ljava/lang/String;I)V")
    public void method2960(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2557.method3396(class154.method147(var2));
        if (var3 >= 0) {
            this.method2939(var3);
        }
    }

    @ObfuscatedName("bp.d([BB)[B")
    public static final byte[] method1481(byte[] arg0) {
        class111 var1 = new class111(arg0);
        int var2 = var1.method2219();
        int var3 = var1.method2273();
        if (var3 < 0 || !(field2570 == 0 || var3 <= field2570)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2230(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2273();
            if (var5 < 0 || field2570 != 0 && var5 > field2570) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class109.method2163(var6, var5, arg0, var3, 9);
            } else {
                field2566.method2160(var1, var6);
            }
            return var6;
        }
    }
}
