package deob;

@ObfuscatedName("eu")
public abstract class class153 {

    @ObfuscatedName("eu.g")
    public int field2545;

    @ObfuscatedName("eu.h")
    public int[] field2531;

    @ObfuscatedName("eu.s")
    public int[] field2532;

    @ObfuscatedName("eu.o")
    public class169 field2533;

    @ObfuscatedName("eu.p")
    public int[] field2534;

    @ObfuscatedName("eu.x")
    public int[] field2535;

    @ObfuscatedName("eu.k")
    public int[] field2536;

    @ObfuscatedName("eu.r")
    public int[][] field2537;

    @ObfuscatedName("eu.z")
    public int[][] field2538;

    @ObfuscatedName("eu.n")
    public class169[] field2546;

    @ObfuscatedName("eu.j")
    public Object[] field2540;

    @ObfuscatedName("eu.b")
    public Object[][] field2541;

    @ObfuscatedName("eu.t")
    public static class122 field2542 = new class122();

    @ObfuscatedName("eu.q")
    public int field2539;

    @ObfuscatedName("eu.e")
    public boolean field2544;

    @ObfuscatedName("eu.l")
    public boolean field2543;

    @ObfuscatedName("eu.u")
    public static int field2547 = 0;

    public class153(boolean arg0, boolean arg1) {
        this.field2544 = arg0;
        this.field2543 = arg1;
    }

    @ObfuscatedName("eu.g([BI)V")
    public void method3079(byte[] arg0) {
        this.field2539 = class127.method3061(arg0, arg0.length);
        class127 var2 = new class127(method2761(arg0));
        int var3 = var2.method2499();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2548();
        }
        int var4 = var2.method2499();
        if (var3 >= 7) {
            this.field2545 = var2.method2513();
        } else {
            this.field2545 = var2.method2501();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2531 = new int[this.field2545];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2545; var7++) {
                this.field2531[var7] = var5 += var2.method2513();
                if (this.field2531[var7] > var6) {
                    var6 = this.field2531[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2545; var8++) {
                this.field2531[var8] = var5 += var2.method2501();
                if (this.field2531[var8] > var6) {
                    var6 = this.field2531[var8];
                }
            }
        }
        this.field2534 = new int[var6 + 1];
        this.field2535 = new int[var6 + 1];
        this.field2536 = new int[var6 + 1];
        this.field2537 = new int[var6 + 1][];
        this.field2540 = new Object[var6 + 1];
        this.field2541 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2532 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2545; var9++) {
                this.field2532[this.field2531[var9]] = var2.method2548();
            }
            this.field2533 = new class169(this.field2532);
        }
        for (int var10 = 0; var10 < this.field2545; var10++) {
            this.field2534[this.field2531[var10]] = var2.method2548();
        }
        for (int var11 = 0; var11 < this.field2545; var11++) {
            this.field2535[this.field2531[var11]] = var2.method2548();
        }
        for (int var12 = 0; var12 < this.field2545; var12++) {
            this.field2536[this.field2531[var12]] = var2.method2501();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2545; var13++) {
                int var14 = this.field2531[var13];
                int var15 = this.field2536[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2537[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2537[var14][var18] = var16 += var2.method2513();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2541[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2545; var20++) {
                int var21 = this.field2531[var20];
                int var22 = this.field2536[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2537[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2537[var21][var25] = var23 += var2.method2501();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2541[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2538 = new int[var6 + 1][];
        this.field2546 = new class169[var6 + 1];
        for (int var27 = 0; var27 < this.field2545; var27++) {
            int var28 = this.field2531[var27];
            int var29 = this.field2536[var28];
            this.field2538[var28] = new int[this.field2541[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2538[var28][this.field2537[var28][var30]] = var2.method2548();
            }
            this.field2546[var28] = new class169(this.field2538[var28]);
        }
    }

    @ObfuscatedName("eu.h(II)V")
    public void method3081(int arg0) {
    }

    @ObfuscatedName("eu.s(III)[B")
    public byte[] method3080(int arg0, int arg1) {
        return this.method3083(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eu.o(II[II)[B")
    public byte[] method3083(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2541.length || this.field2541[arg0] == null || arg1 < 0 || arg1 >= this.field2541[arg0].length) {
            return null;
        }
        if (this.field2541[arg0][arg1] == null) {
            boolean var4 = this.method3096(arg0, arg2);
            if (!var4) {
                this.method3090(arg0);
                boolean var5 = this.method3096(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method797(this.field2541[arg0][arg1], false);
        if (this.field2543) {
            this.field2541[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eu.p(III)Z")
    public boolean method3084(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2541.length || this.field2541[arg0] == null || arg1 < 0 || arg1 >= this.field2541[arg0].length) {
            return false;
        } else if (this.field2541[arg0][arg1] != null) {
            return true;
        } else if (this.field2540[arg0] == null) {
            this.method3090(arg0);
            return this.field2540[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eu.x(II)Z")
    public boolean method3085(int arg0) {
        if (this.field2540[arg0] == null) {
            this.method3090(arg0);
            return this.field2540[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eu.k(I)Z")
    public boolean method3105() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2531.length; var2++) {
            int var3 = this.field2531[var2];
            if (this.field2540[var3] == null) {
                this.method3090(var3);
                if (this.field2540[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eu.r(II)[B")
    public byte[] method3087(int arg0) {
        if (this.field2541.length == 1) {
            return this.method3080(0, arg0);
        } else if (this.field2541[arg0].length == 1) {
            return this.method3080(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eu.z(III)[B")
    public byte[] method3115(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2541.length || this.field2541[arg0] == null || arg1 < 0 || arg1 >= this.field2541[arg0].length) {
            return null;
        }
        if (this.field2541[arg0][arg1] == null) {
            boolean var3 = this.method3096(arg0, (int[]) null);
            if (!var3) {
                this.method3090(arg0);
                boolean var4 = this.method3096(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method797(this.field2541[arg0][arg1], false);
    }

    @ObfuscatedName("eu.n(IS)[B")
    public byte[] method3089(int arg0) {
        if (this.field2541.length == 1) {
            return this.method3115(0, arg0);
        } else if (this.field2541[arg0].length == 1) {
            return this.method3115(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eu.j(II)V")
    public void method3090(int arg0) {
    }

    @ObfuscatedName("eu.b(IB)[I")
    public int[] method3091(int arg0) {
        return this.field2537[arg0];
    }

    @ObfuscatedName("eu.t(IB)I")
    public int method3100(int arg0) {
        return this.field2541[arg0].length;
    }

    @ObfuscatedName("eu.q(I)I")
    public int method3144() {
        return this.field2541.length;
    }

    @ObfuscatedName("eu.e(II)V")
    public void method3094(int arg0) {
        for (int var2 = 0; var2 < this.field2541[arg0].length; var2++) {
            this.field2541[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eu.l(I)V")
    public void method3122() {
        for (int var1 = 0; var1 < this.field2541.length; var1++) {
            if (this.field2541[var1] != null) {
                for (int var2 = 0; var2 < this.field2541[var1].length; var2++) {
                    this.field2541[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eu.u(I[IB)Z")
    public boolean method3096(int arg0, int[] arg1) {
        if (this.field2540[arg0] == null) {
            return false;
        }
        int var3 = this.field2536[arg0];
        int[] var4 = this.field2537[arg0];
        Object[] var5 = this.field2541[arg0];
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
            var8 = class119.method797(this.field2540[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2516(arg1, 5, var9.field2030.length);
        } else {
            var8 = class119.method797(this.field2540[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2761(var8);
        } catch (RuntimeException var27) {
            throw Statics.method1382(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class127.method3061(var8, var8.length) + "," + class127.method3061(var8, var8.length - 2) + "," + this.field2534[arg0] + "," + this.field2539);
        }
        if (this.field2544) {
            this.field2540[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class127 var15 = new class127(var10);
            int[] var16 = new int[var3];
            var15.field2027 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2548();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2027 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2548();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2543) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class119.method802(var20[var26], false);
                }
            }
        } else if (this.field2543) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method802(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eu.m(Ljava/lang/String;B)I")
    public int method3092(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2533.method3300(class148.method41(var2));
    }

    @ObfuscatedName("eu.a(ILjava/lang/String;B)I")
    public int method3086(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2546[arg0].method3300(class148.method41(var3));
    }

    @ObfuscatedName("eu.f(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3099(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2533.method3300(class148.method41(var3));
        int var6 = this.field2546[var5].method3300(class148.method41(var4));
        return this.method3080(var5, var6);
    }

    @ObfuscatedName("eu.y(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3093(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2533.method3300(class148.method41(var3));
        int var6 = this.field2546[var5].method3300(class148.method41(var4));
        return this.method3084(var5, var6);
    }

    @ObfuscatedName("eu.v(Ljava/lang/String;I)V")
    public void method3143(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2533.method3300(class148.method41(var2));
        if (var3 >= 0) {
            this.method3081(var3);
        }
    }

    @ObfuscatedName("ec.w([BI)[B")
    public static final byte[] method2761(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2499();
        int var3 = var1.method2548();
        if (var3 < 0 || !(field2547 == 0 || var3 <= field2547)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2510(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2548();
            if (var5 < 0 || field2547 != 0 && var5 > field2547) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2447(var6, var5, arg0, var3, 9);
            } else {
                field2542.method2427(var1, var6);
            }
            return var6;
        }
    }
}
