package deob;

import java.io.EOFException;

@ObfuscatedName("ca")
public class class96 {

    @ObfuscatedName("ca.q")
    public boolean[] field1504 = new boolean[this.field1506.length];

    @ObfuscatedName("ca.o")
    public boolean[] field1505;

    @ObfuscatedName("ca.g")
    public int[] field1506 = new int[Statics.field258.method3908(19)];

    @ObfuscatedName("ca.v")
    public String[] field1502 = new String[Statics.field258.method3908(15)];

    @ObfuscatedName("ca.p")
    public boolean field1508 = false;

    @ObfuscatedName("ca.e")
    public long field1509;

    public class96() {
        for (int var1 = 0; var1 < this.field1506.length; var1++) {
            class244 var2 = (class244) class244.field3314.method3357((long) var1);
            class244 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3311.method3876(19, var1);
                class244 var5 = new class244();
                if (var4 != null) {
                    var5.method4055(new class174(var4));
                }
                class244.field3314.method3371(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1504[var1] = var3.field3312;
        }
        this.field1505 = new boolean[this.field1502.length];
        for (int var7 = 0; var7 < this.field1502.length; var7++) {
            class245 var8 = class245.method1491(var7);
            this.field1505[var7] = var8.field3320;
        }
        for (int var9 = 0; var9 < this.field1506.length; var9++) {
            this.field1506[var9] = -1;
        }
        this.method1696();
    }

    @ObfuscatedName("ca.w(III)V")
    public void method1689(int arg0, int arg1) {
        this.field1506[arg0] = arg1;
        if (this.field1504[arg0]) {
            this.field1508 = true;
        }
    }

    @ObfuscatedName("ca.s(II)I")
    public int method1690(int arg0) {
        return this.field1506[arg0];
    }

    @ObfuscatedName("ca.q(ILjava/lang/String;I)V")
    public void method1691(int arg0, String arg1) {
        this.field1502[arg0] = arg1;
        if (this.field1505[arg0]) {
            this.field1508 = true;
        }
    }

    @ObfuscatedName("ca.o(II)Ljava/lang/String;")
    public String method1701(int arg0) {
        return this.field1502[arg0];
    }

    @ObfuscatedName("ca.g(I)V")
    public void method1693() {
        for (int var1 = 0; var1 < this.field1506.length; var1++) {
            if (!this.field1504[var1]) {
                this.field1506[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1502.length; var2++) {
            if (!this.field1505[var2]) {
                this.field1502[var2] = null;
            }
        }
    }

    @ObfuscatedName("ca.v(ZB)Ldw;")
    public class123 method1694(boolean arg0) {
        return class156.method2350("2", Statics.field453.field3193, arg0);
    }

    @ObfuscatedName("ca.p(B)V")
    public void method1710() {
        class123 var1 = this.method1694(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1506.length; var4++) {
                if (this.field1504[var4] && this.field1506[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1502.length; var6++) {
                if (this.field1505[var6] && this.field1502[var6] != null) {
                    var2 += 2 + class174.method1591(this.field1502[var6]);
                    var5++;
                }
            }
            class174 var7 = new class174(var2);
            var7.method2955(1);
            var7.method2956(var3);
            for (int var8 = 0; var8 < this.field1506.length; var8++) {
                if (this.field1504[var8] && this.field1506[var8] != -1) {
                    var7.method2956(var8);
                    var7.method3072(this.field1506[var8]);
                }
            }
            var7.method2956(var5);
            for (int var9 = 0; var9 < this.field1502.length; var9++) {
                if (this.field1505[var9] && this.field1502[var9] != null) {
                    var7.method2956(var9);
                    var7.method3117(this.field1502[var9]);
                }
            }
            var1.method2204(var7.field2389, 0, var7.field2390);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2222();
            } catch (Exception var20) {
            }
        }
        this.field1508 = false;
        this.field1509 = class176.method3200();
    }

    @ObfuscatedName("ca.e(I)V")
    public void method1696() {
        class123 var1 = this.method1694(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method2207()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2208(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class174 var5 = new class174(var2);
                if (var5.field2389.length - var5.field2390 < 1) {
                    return;
                }
                int var7 = var5.method2971();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method3178();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method3178();
                        int var12 = var5.method3131();
                        if (this.field1504[var11]) {
                            this.field1506[var11] = var12;
                        }
                    }
                    int var13 = var5.method3178();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method3178();
                        String var16 = var5.method3111();
                        if (this.field1505[var15]) {
                            this.field1502[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method2222();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1508 = false;
    }

    @ObfuscatedName("ca.d(I)V")
    public void method1697() {
        if (this.field1508 && this.field1509 < class176.method3200() - 60000L) {
            this.method1710();
        }
    }

    @ObfuscatedName("ca.x(B)Z")
    public boolean method1698() {
        return this.field1508;
    }
}
