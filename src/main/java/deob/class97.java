package deob;

import java.io.EOFException;

@ObfuscatedName("cy")
public class class97 {

    @ObfuscatedName("cy.a")
    public boolean[] field1530 = new boolean[this.field1524.length];

    @ObfuscatedName("cy.r")
    public boolean[] field1521;

    @ObfuscatedName("cy.o")
    public int[] field1524 = new int[Statics.field736.method3835(19)];

    @ObfuscatedName("cy.n")
    public String[] field1523 = new String[Statics.field736.method3835(15)];

    @ObfuscatedName("cy.q")
    public boolean field1526 = false;

    @ObfuscatedName("cy.b")
    public long field1520;

    public class97() {
        for (int var1 = 0; var1 < this.field1524.length; var1++) {
            class245 var2 = (class245) class245.field3316.method3347((long) var1);
            class245 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3318.method3824(19, var1);
                class245 var5 = new class245();
                if (var4 != null) {
                    var5.method3994(new class175(var4));
                }
                class245.field3316.method3346(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1530[var1] = var3.field3317;
        }
        this.field1521 = new boolean[this.field1523.length];
        for (int var7 = 0; var7 < this.field1523.length; var7++) {
            class246 var8 = class246.method253(var7);
            this.field1521[var7] = var8.field3323;
        }
        for (int var9 = 0; var9 < this.field1524.length; var9++) {
            this.field1524[var9] = -1;
        }
        this.method1679();
    }

    @ObfuscatedName("cy.i(III)V")
    public void method1663(int arg0, int arg1) {
        this.field1524[arg0] = arg1;
        if (this.field1530[arg0]) {
            this.field1526 = true;
        }
    }

    @ObfuscatedName("cy.j(II)I")
    public int method1671(int arg0) {
        return this.field1524[arg0];
    }

    @ObfuscatedName("cy.a(ILjava/lang/String;I)V")
    public void method1696(int arg0, String arg1) {
        this.field1523[arg0] = arg1;
        if (this.field1521[arg0]) {
            this.field1526 = true;
        }
    }

    @ObfuscatedName("cy.r(II)Ljava/lang/String;")
    public String method1667(int arg0) {
        return this.field1523[arg0];
    }

    @ObfuscatedName("cy.o(I)V")
    public void method1668() {
        for (int var1 = 0; var1 < this.field1524.length; var1++) {
            if (!this.field1530[var1]) {
                this.field1524[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1523.length; var2++) {
            if (!this.field1521[var2]) {
                this.field1523[var2] = null;
            }
        }
    }

    @ObfuscatedName("cy.n(ZB)Ldc;")
    public class124 method1669(boolean arg0) {
        return class157.method2894("2", Statics.field696.field3200, arg0);
    }

    @ObfuscatedName("cy.q(B)V")
    public void method1664() {
        class124 var1 = this.method1669(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1524.length; var4++) {
                if (this.field1530[var4] && this.field1524[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1523.length; var6++) {
                if (this.field1521[var6] && this.field1523[var6] != null) {
                    var2 += 2 + class175.method1055(this.field1523[var6]);
                    var5++;
                }
            }
            class175 var7 = new class175(var2);
            var7.method3102(1);
            var7.method2978(var3);
            for (int var8 = 0; var8 < this.field1524.length; var8++) {
                if (this.field1530[var8] && this.field1524[var8] != -1) {
                    var7.method2978(var8);
                    var7.method3136(this.field1524[var8]);
                }
            }
            var7.method2978(var5);
            for (int var9 = 0; var9 < this.field1523.length; var9++) {
                if (this.field1521[var9] && this.field1523[var9] != null) {
                    var7.method2978(var9);
                    var7.method2984(this.field1523[var9]);
                }
            }
            var1.method2162(var7.field2392, 0, var7.field2395);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2163();
            } catch (Exception var20) {
            }
        }
        this.field1526 = false;
        this.field1520 = class177.method608();
    }

    @ObfuscatedName("cy.b(S)V")
    public void method1679() {
        class124 var1 = this.method1669(false);
        label182: {
            try {
                byte[] var2 = new byte[(int) var1.method2165()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2166(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class175 var5 = new class175(var2);
                if (var5.field2392.length - var5.field2395 < 1) {
                    return;
                }
                int var7 = var5.method2999();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2995();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2995();
                        int var12 = var5.method2998();
                        if (this.field1530[var11]) {
                            this.field1524[var11] = var12;
                        }
                    }
                    int var13 = var5.method2995();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label182;
                        }
                        int var15 = var5.method2995();
                        String var16 = var5.method3002();
                        if (this.field1521[var15]) {
                            this.field1523[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label182;
            } finally {
                try {
                    var1.method2163();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1526 = false;
    }

    @ObfuscatedName("cy.k(B)V")
    public void method1672() {
        if (this.field1526 && this.field1520 < class177.method608() - 60000L) {
            this.method1664();
        }
    }

    @ObfuscatedName("cy.s(I)Z")
    public boolean method1673() {
        return this.field1526;
    }
}
