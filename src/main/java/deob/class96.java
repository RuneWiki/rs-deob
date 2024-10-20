package deob;

import java.io.EOFException;

@ObfuscatedName("cr")
public class class96 {

    @ObfuscatedName("cr.k")
    public boolean[] field1428 = new boolean[this.field1433.length];

    @ObfuscatedName("cr.z")
    public boolean[] field1429;

    @ObfuscatedName("cr.v")
    public int[] field1433 = new int[Statics.field863.method3946(19)];

    @ObfuscatedName("cr.m")
    public String[] field1426 = new String[Statics.field863.method3946(15)];

    @ObfuscatedName("cr.b")
    public boolean field1432 = false;

    @ObfuscatedName("cr.t")
    public long field1431;

    public class96() {
        for (int var1 = 0; var1 < this.field1433.length; var1++) {
            class251 var2 = (class251) class251.field3389.method3418((long) var1);
            class251 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3388.method3935(19, var1);
                class251 var5 = new class251();
                if (var4 != null) {
                    var5.method4125(new class181(var4));
                }
                class251.field3389.method3417(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1428[var1] = var3.field3390;
        }
        this.field1429 = new boolean[this.field1426.length];
        for (int var7 = 0; var7 < this.field1426.length; var7++) {
            class252 var8 = (class252) class252.field3392.method3418((long) var7);
            class252 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field3393.method3935(15, var7);
                class252 var11 = new class252();
                if (var10 != null) {
                    var11.method4143(new class181(var10));
                }
                class252.field3392.method3417(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field1429[var7] = var9.field3391;
        }
        for (int var13 = 0; var13 < this.field1433.length; var13++) {
            this.field1433[var13] = -1;
        }
        this.method1712();
    }

    @ObfuscatedName("cr.d(III)V")
    public void method1705(int arg0, int arg1) {
        this.field1433[arg0] = arg1;
        if (this.field1428[arg0]) {
            this.field1432 = true;
        }
    }

    @ObfuscatedName("cr.x(II)I")
    public int method1715(int arg0) {
        return this.field1433[arg0];
    }

    @ObfuscatedName("cr.k(ILjava/lang/String;S)V")
    public void method1722(int arg0, String arg1) {
        this.field1426[arg0] = arg1;
        if (this.field1429[arg0]) {
            this.field1432 = true;
        }
    }

    @ObfuscatedName("cr.z(II)Ljava/lang/String;")
    public String method1708(int arg0) {
        return this.field1426[arg0];
    }

    @ObfuscatedName("cr.v(I)V")
    public void method1729() {
        for (int var1 = 0; var1 < this.field1433.length; var1++) {
            if (!this.field1428[var1]) {
                this.field1433[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1426.length; var2++) {
            if (!this.field1429[var2]) {
                this.field1426[var2] = null;
            }
        }
    }

    @ObfuscatedName("cr.m(ZB)Ldt;")
    public class124 method1710(boolean arg0) {
        return class157.method609("2", Statics.field484.field3277, arg0);
    }

    @ObfuscatedName("cr.b(I)V")
    public void method1711() {
        class124 var1 = this.method1710(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1433.length; var4++) {
                if (this.field1428[var4] && this.field1433[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1426.length; var6++) {
                if (this.field1429[var6] && this.field1426[var6] != null) {
                    var2 += 2 + class181.method1954(this.field1426[var6]);
                    var5++;
                }
            }
            class181 var7 = new class181(var2);
            var7.method3020(1);
            var7.method3021(var3);
            for (int var8 = 0; var8 < this.field1433.length; var8++) {
                if (this.field1428[var8] && this.field1433[var8] != -1) {
                    var7.method3021(var8);
                    var7.method3149(this.field1433[var8]);
                }
            }
            var7.method3021(var5);
            for (int var9 = 0; var9 < this.field1426.length; var9++) {
                if (this.field1429[var9] && this.field1426[var9] != null) {
                    var7.method3021(var9);
                    var7.method3027(this.field1426[var9]);
                }
            }
            var1.method2241(var7.field2496, 0, var7.field2498);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2240();
            } catch (Exception var20) {
            }
        }
        this.field1432 = false;
        this.field1431 = class183.method2932();
    }

    @ObfuscatedName("cr.t(I)V")
    public void method1712() {
        class124 var1 = this.method1710(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method2242()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2243(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class181 var5 = new class181(var2);
                if (var5.field2496.length - var5.field2498 >= 1) {
                    int var7 = var5.method3204();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method3179();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method3179();
                            int var12 = var5.method3041();
                            if (this.field1428[var11]) {
                                this.field1433[var11] = var12;
                            }
                        }
                        int var13 = var5.method3179();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method3179();
                            String var16 = var5.method3045();
                            if (this.field1429[var15]) {
                                this.field1426[var15] = var16;
                            }
                            var14++;
                        }
                    }
                    return;
                }
            } catch (Exception var30) {
                break label197;
            } finally {
                try {
                    var1.method2240();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1432 = false;
    }

    @ObfuscatedName("cr.p(I)V")
    public void method1713() {
        if (this.field1432 && this.field1431 < class183.method2932() - 60000L) {
            this.method1711();
        }
    }

    @ObfuscatedName("cr.r(B)Z")
    public boolean method1719() {
        return this.field1432;
    }
}
