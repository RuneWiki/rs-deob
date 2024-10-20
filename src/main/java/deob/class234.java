package deob;

@ObfuscatedName("hq")
public abstract class class234 {

    @ObfuscatedName("hq.t")
    public int field3115;

    @ObfuscatedName("hq.n")
    public int[] field3128;

    @ObfuscatedName("hq.q")
    public int[] field3125;

    @ObfuscatedName("hq.v")
    public class335 field3116;

    @ObfuscatedName("hq.l")
    public int[] field3113;

    @ObfuscatedName("hq.c")
    public int[] field3118;

    @ObfuscatedName("hq.o")
    public int[] field3119;

    @ObfuscatedName("hq.i")
    public int[][] field3117;

    @ObfuscatedName("hq.d")
    public int[][] field3121;

    @ObfuscatedName("hq.m")
    public class335[] field3122;

    @ObfuscatedName("hq.p")
    public Object[] field3123;

    @ObfuscatedName("hq.h")
    public Object[][] field3124;

    @ObfuscatedName("hq.k")
    public static class334 field3114 = new class334();

    @ObfuscatedName("hq.x")
    public int field3126;

    @ObfuscatedName("hq.j")
    public boolean field3112;

    @ObfuscatedName("hq.r")
    public boolean field3127;

    @ObfuscatedName("hq.e")
    public static int field3129 = 0;

    public class234(boolean arg0, boolean arg1) {
        this.field3112 = arg0;
        this.field3127 = arg1;
    }

    @ObfuscatedName("hq.a([BI)V")
    public void method3871(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class300.method29(arg0, 0, var2);
        this.field3126 = var3;
        class300 var4 = new class300(method1069(arg0));
        int var5 = var4.method5123();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method5155();
        }
        int var6 = var4.method5123();
        if (var5 >= 7) {
            this.field3115 = var4.method5138();
        } else {
            this.field3115 = var4.method5166();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3128 = new int[this.field3115];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3115; var9++) {
                this.field3128[var9] = var7 += var4.method5138();
                if (this.field3128[var9] > var8) {
                    var8 = this.field3128[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3115; var10++) {
                this.field3128[var10] = var7 += var4.method5166();
                if (this.field3128[var10] > var8) {
                    var8 = this.field3128[var10];
                }
            }
        }
        this.field3113 = new int[var8 + 1];
        this.field3118 = new int[var8 + 1];
        this.field3119 = new int[var8 + 1];
        this.field3117 = new int[var8 + 1][];
        this.field3123 = new Object[var8 + 1];
        this.field3124 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3125 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3115; var11++) {
                this.field3125[this.field3128[var11]] = var4.method5155();
            }
            this.field3116 = new class335(this.field3125);
        }
        for (int var12 = 0; var12 < this.field3115; var12++) {
            this.field3113[this.field3128[var12]] = var4.method5155();
        }
        for (int var13 = 0; var13 < this.field3115; var13++) {
            this.field3118[this.field3128[var13]] = var4.method5155();
        }
        for (int var14 = 0; var14 < this.field3115; var14++) {
            this.field3119[this.field3128[var14]] = var4.method5166();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3115; var15++) {
                int var16 = this.field3128[var15];
                int var17 = this.field3119[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3117[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3117[var16][var20] = var18 += var4.method5138();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3124[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3115; var22++) {
                int var23 = this.field3128[var22];
                int var24 = this.field3119[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3117[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3117[var23][var27] = var25 += var4.method5166();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3124[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3121 = new int[var8 + 1][];
        this.field3122 = new class335[var8 + 1];
        for (int var29 = 0; var29 < this.field3115; var29++) {
            int var30 = this.field3128[var29];
            int var31 = this.field3119[var30];
            this.field3121[var30] = new int[this.field3124[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3121[var30][this.field3117[var30][var32]] = var4.method5155();
            }
            this.field3122[var30] = new class335(this.field3121[var30]);
        }
    }

    @ObfuscatedName("hq.t(IB)V")
    public void method3949(int arg0) {
    }

    @ObfuscatedName("hq.n(III)[B")
    public byte[] method3873(int arg0, int arg1) {
        return this.method3874(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("hq.q(II[IB)[B")
    public byte[] method3874(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3124.length || this.field3124[arg0] == null || arg1 < 0 || arg1 >= this.field3124[arg0].length) {
            return null;
        }
        if (this.field3124[arg0][arg1] == null) {
            boolean var4 = this.method3890(arg0, arg2);
            if (!var4) {
                this.method3883(arg0);
                boolean var5 = this.method3890(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = Statics.method2437(this.field3124[arg0][arg1], false);
        if (this.field3127) {
            this.field3124[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("hq.v(III)Z")
    public boolean method3875(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3124.length || this.field3124[arg0] == null || arg1 < 0 || arg1 >= this.field3124[arg0].length) {
            return false;
        } else if (this.field3124[arg0][arg1] != null) {
            return true;
        } else if (this.field3123[arg0] == null) {
            this.method3883(arg0);
            return this.field3123[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hq.l(IS)Z")
    public boolean method3898(int arg0) {
        if (this.field3124.length == 1) {
            return this.method3875(0, arg0);
        } else if (this.field3124[arg0].length == 1) {
            return this.method3875(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hq.c(II)Z")
    public boolean method3877(int arg0) {
        if (this.field3123[arg0] == null) {
            this.method3883(arg0);
            return this.field3123[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hq.o(I)Z")
    public boolean method3948() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3128.length; var2++) {
            int var3 = this.field3128[var2];
            if (this.field3123[var3] == null) {
                this.method3883(var3);
                if (this.field3123[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("hq.i(II)I")
    public int method3879(int arg0) {
        return this.field3123[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("hq.d(IB)[B")
    public byte[] method3880(int arg0) {
        if (this.field3124.length == 1) {
            return this.method3873(0, arg0);
        } else if (this.field3124[arg0].length == 1) {
            return this.method3873(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hq.m(III)[B")
    public byte[] method3881(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3124.length || this.field3124[arg0] == null || arg1 < 0 || arg1 >= this.field3124[arg0].length) {
            return null;
        }
        if (this.field3124[arg0][arg1] == null) {
            boolean var3 = this.method3890(arg0, (int[]) null);
            if (!var3) {
                this.method3883(arg0);
                boolean var4 = this.method3890(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return Statics.method2437(this.field3124[arg0][arg1], false);
    }

    @ObfuscatedName("hq.p(II)[B")
    public byte[] method3952(int arg0) {
        if (this.field3124.length == 1) {
            return this.method3881(0, arg0);
        } else if (this.field3124[arg0].length == 1) {
            return this.method3881(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hq.h(II)V")
    public void method3883(int arg0) {
    }

    @ObfuscatedName("hq.k(II)[I")
    public int[] method3887(int arg0) {
        return arg0 >= 0 && arg0 < this.field3117.length ? this.field3117[arg0] : null;
    }

    @ObfuscatedName("hq.x(II)I")
    public int method3953(int arg0) {
        return this.field3124[arg0].length;
    }

    @ObfuscatedName("hq.j(B)I")
    public int method3886() {
        return this.field3124.length;
    }

    @ObfuscatedName("hq.r(I)V")
    public void method3960() {
        for (int var1 = 0; var1 < this.field3123.length; var1++) {
            this.field3123[var1] = null;
        }
    }

    @ObfuscatedName("hq.e(IB)V")
    public void method3892(int arg0) {
        for (int var2 = 0; var2 < this.field3124[arg0].length; var2++) {
            this.field3124[arg0][var2] = null;
        }
    }

    @ObfuscatedName("hq.s(I)V")
    public void method3889() {
        for (int var1 = 0; var1 < this.field3124.length; var1++) {
            if (this.field3124[var1] != null) {
                for (int var2 = 0; var2 < this.field3124[var1].length; var2++) {
                    this.field3124[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("hq.b(I[II)Z")
    public boolean method3890(int arg0, int[] arg1) {
        if (this.field3123[arg0] == null) {
            return false;
        }
        int var3 = this.field3119[arg0];
        int[] var4 = this.field3117[arg0];
        Object[] var5 = this.field3124[arg0];
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
            var8 = Statics.method2437(this.field3123[arg0], true);
            class300 var9 = new class300(var8);
            var9.method5144(arg1, 5, var9.field3699.length);
        } else {
            var8 = Statics.method2437(this.field3123[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1069(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class300.method29(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class300.method29(var8, 0, var17);
            throw class341.method5388(var34, var16 + var18 + "," + this.field3113[arg0] + "," + this.field3126);
        }
        if (this.field3112) {
            this.field3123[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class300 var22 = new class300(var10);
            int[] var23 = new int[var3];
            var22.field3694 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method5155();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field3694 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method5155();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field3127) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class206.method3654(var27[var33], false);
                }
            }
        } else if (this.field3127) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class206.method3654(var10, false);
        }
        return true;
    }

    @ObfuscatedName("hq.w(Ljava/lang/String;I)I")
    public int method3891(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3116.method6101(class291.method222(var2));
    }

    @ObfuscatedName("hq.u(ILjava/lang/String;B)I")
    public int method3870(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3122[arg0].method6101(class291.method222(var3));
    }

    @ObfuscatedName("hq.ad(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3893(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3116.method6101(class291.method222(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3122[var5].method6101(class291.method222(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("hq.ag(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3878(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3116.method6101(class291.method222(var3));
        int var6 = this.field3122[var5].method6101(class291.method222(var4));
        return this.method3873(var5, var6);
    }

    @ObfuscatedName("hq.ak(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3895(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3116.method6101(class291.method222(var3));
        int var6 = this.field3122[var5].method6101(class291.method222(var4));
        return this.method3875(var5, var6);
    }

    @ObfuscatedName("hq.av(Ljava/lang/String;I)Z")
    public boolean method3885(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3116.method6101(class291.method222(var2));
        return this.method3877(var3);
    }

    @ObfuscatedName("hq.am(Ljava/lang/String;B)V")
    public void method3897(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3116.method6101(class291.method222(var2));
        if (var3 >= 0) {
            this.method3949(var3);
        }
    }

    @ObfuscatedName("hq.ab(Ljava/lang/String;B)I")
    public int method3888(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3116.method6101(class291.method222(var2));
        return this.method3879(var3);
    }

    @ObfuscatedName("bh.ax([BI)[B")
    public static final byte[] method1069(byte[] arg0) {
        class300 var1 = new class300(arg0);
        int var2 = var1.method5123();
        int var3 = var1.method5155();
        if (var3 < 0 || !(field3129 == 0 || var3 <= field3129)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5210(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5155();
            if (var5 < 0 || field3129 != 0 && var5 > field3129) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class304.method5395(var6, var5, arg0, var3, 9);
            } else {
                field3114.method6098(var1, var6);
            }
            return var6;
        }
    }
}
