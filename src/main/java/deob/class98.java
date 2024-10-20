package deob;

import java.io.EOFException;

@ObfuscatedName("cp")
public class class98 {

    @ObfuscatedName("cp.x")
    public boolean[] field1527 = new boolean[this.field1524.length];

    @ObfuscatedName("cp.k")
    public boolean[] field1523;

    @ObfuscatedName("cp.f")
    public int[] field1524 = new int[Statics.field326.method3798(19)];

    @ObfuscatedName("cp.i")
    public String[] field1522 = new String[Statics.field326.method3798(15)];

    @ObfuscatedName("cp.j")
    public boolean field1528 = false;

    @ObfuscatedName("cp.m")
    public long field1529;

    public class98() {
        for (int var1 = 0; var1 < this.field1524.length; var1++) {
            class247 var2 = (class247) class247.field3317.method3239((long) var1);
            class247 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3320.method3754(19, var1);
                class247 var5 = new class247();
                if (var4 != null) {
                    var5.method3917(new class177(var4));
                }
                class247.field3317.method3241(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1527[var1] = var3.field3318;
        }
        this.field1523 = new boolean[this.field1522.length];
        for (int var7 = 0; var7 < this.field1522.length; var7++) {
            class248 var8 = (class248) class248.field3324.method3239((long) var7);
            class248 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field3323.method3754(15, var7);
                class248 var11 = new class248();
                if (var10 != null) {
                    var11.method3929(new class177(var10));
                }
                class248.field3324.method3241(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field1523[var7] = var9.field3326;
        }
        for (int var13 = 0; var13 < this.field1524.length; var13++) {
            this.field1524[var13] = -1;
        }
        this.method1649();
    }

    @ObfuscatedName("cp.w(IIS)V")
    public void method1622(int arg0, int arg1) {
        this.field1524[arg0] = arg1;
        if (this.field1527[arg0]) {
            this.field1528 = true;
        }
    }

    @ObfuscatedName("cp.o(II)I")
    public int method1630(int arg0) {
        return this.field1524[arg0];
    }

    @ObfuscatedName("cp.x(ILjava/lang/String;B)V")
    public void method1625(int arg0, String arg1) {
        this.field1522[arg0] = arg1;
        if (this.field1523[arg0]) {
            this.field1528 = true;
        }
    }

    @ObfuscatedName("cp.k(IB)Ljava/lang/String;")
    public String method1626(int arg0) {
        return this.field1522[arg0];
    }

    @ObfuscatedName("cp.f(I)V")
    public void method1627() {
        for (int var1 = 0; var1 < this.field1524.length; var1++) {
            if (!this.field1527[var1]) {
                this.field1524[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1522.length; var2++) {
            if (!this.field1523[var2]) {
                this.field1522[var2] = null;
            }
        }
    }

    @ObfuscatedName("cp.i(ZI)Ldw;")
    public class125 method1628(boolean arg0) {
        return class157.method909("2", Statics.field3424.field3197, arg0);
    }

    @ObfuscatedName("cp.j(I)V")
    public void method1629() {
        class125 var1 = this.method1628(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1524.length; var4++) {
                if (this.field1527[var4] && this.field1524[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1522.length; var6++) {
                if (this.field1523[var6] && this.field1522[var6] != null) {
                    var2 += 2 + class177.method117(this.field1522[var6]);
                    var5++;
                }
            }
            class177 var7 = new class177(var2);
            var7.method3075(1);
            var7.method2903(var3);
            for (int var8 = 0; var8 < this.field1524.length; var8++) {
                if (this.field1527[var8] && this.field1524[var8] != -1) {
                    var7.method2903(var8);
                    var7.method2872(this.field1524[var8]);
                }
            }
            var7.method2903(var5);
            for (int var9 = 0; var9 < this.field1522.length; var9++) {
                if (this.field1523[var9] && this.field1522[var9] != null) {
                    var7.method2903(var9);
                    var7.method2875(this.field1522[var9]);
                }
            }
            var1.method2112(var7.field2419, 0, var7.field2412);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2113();
            } catch (Exception var20) {
            }
        }
        this.field1528 = false;
        this.field1529 = class179.method1665();
    }

    @ObfuscatedName("cp.m(B)V")
    public void method1649() {
        class125 var1 = this.method1628(false);
        label182: {
            try {
                byte[] var2 = new byte[(int) var1.method2114()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2115(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class177 var5 = new class177(var2);
                if (var5.field2419.length - var5.field2412 < 1) {
                    return;
                }
                int var7 = var5.method2931();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2886();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2886();
                        int var12 = var5.method2904();
                        if (this.field1527[var11]) {
                            this.field1524[var11] = var12;
                        }
                    }
                    int var13 = var5.method2886();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label182;
                        }
                        int var15 = var5.method2886();
                        String var16 = var5.method2892();
                        if (this.field1523[var15]) {
                            this.field1522[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label182;
            } finally {
                try {
                    var1.method2113();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1528 = false;
    }

    @ObfuscatedName("cp.u(B)V")
    public void method1650() {
        if (this.field1528 && this.field1529 < class179.method1665() - 60000L) {
            this.method1629();
        }
    }

    @ObfuscatedName("cp.h(B)Z")
    public boolean method1632() {
        return this.field1528;
    }
}
