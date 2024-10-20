package deob;

import java.io.EOFException;

@ObfuscatedName("cj")
public class class96 {

    @ObfuscatedName("cj.e")
    public boolean[] field1500 = new boolean[this.field1495.length];

    @ObfuscatedName("cj.p")
    public boolean[] field1506;

    @ObfuscatedName("cj.q")
    public int[] field1495 = new int[Statics.field2134.method3889(19)];

    @ObfuscatedName("cj.s")
    public String[] field1497 = new String[Statics.field2134.method3889(15)];

    @ObfuscatedName("cj.r")
    public boolean field1504 = false;

    @ObfuscatedName("cj.g")
    public long field1501;

    public class96() {
        for (int var1 = 0; var1 < this.field1495.length; var1++) {
            class244 var2 = (class244) class244.field3311.method3341((long) var1);
            class244 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3312.method3875(19, var1);
                class244 var5 = new class244();
                if (var4 != null) {
                    var5.method4061(new class174(var4));
                }
                class244.field3311.method3343(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1500[var1] = var3.field3313;
        }
        this.field1506 = new boolean[this.field1497.length];
        for (int var7 = 0; var7 < this.field1497.length; var7++) {
            class245 var8 = (class245) class245.field3317.method3341((long) var7);
            class245 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field3320.method3875(15, var7);
                class245 var11 = new class245();
                if (var10 != null) {
                    var11.method4069(new class174(var10));
                }
                class245.field3317.method3343(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field1506[var7] = var9.field3318;
        }
        for (int var13 = 0; var13 < this.field1495.length; var13++) {
            this.field1495[var13] = -1;
        }
        this.method1725();
    }

    @ObfuscatedName("cj.d(III)V")
    public void method1707(int arg0, int arg1) {
        this.field1495[arg0] = arg1;
        if (this.field1500[arg0]) {
            this.field1504 = true;
        }
    }

    @ObfuscatedName("cj.k(II)I")
    public int method1708(int arg0) {
        return this.field1495[arg0];
    }

    @ObfuscatedName("cj.e(ILjava/lang/String;B)V")
    public void method1709(int arg0, String arg1) {
        this.field1497[arg0] = arg1;
        if (this.field1506[arg0]) {
            this.field1504 = true;
        }
    }

    @ObfuscatedName("cj.p(II)Ljava/lang/String;")
    public String method1710(int arg0) {
        return this.field1497[arg0];
    }

    @ObfuscatedName("cj.q(B)V")
    public void method1711() {
        for (int var1 = 0; var1 < this.field1495.length; var1++) {
            if (!this.field1500[var1]) {
                this.field1495[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1497.length; var2++) {
            if (!this.field1506[var2]) {
                this.field1497[var2] = null;
            }
        }
    }

    @ObfuscatedName("cj.s(ZI)Ldw;")
    public class123 method1712(boolean arg0) {
        return class156.method1580("2", Statics.field924.field3199, arg0);
    }

    @ObfuscatedName("cj.r(I)V")
    public void method1729() {
        class123 var1 = this.method1712(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1495.length; var4++) {
                if (this.field1500[var4] && this.field1495[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1497.length; var6++) {
                if (this.field1506[var6] && this.field1497[var6] != null) {
                    var2 += 2 + class174.method2869(this.field1497[var6]);
                    var5++;
                }
            }
            class174 var7 = new class174(var2);
            var7.method2970(1);
            var7.method2940(var3);
            for (int var8 = 0; var8 < this.field1495.length; var8++) {
                if (this.field1500[var8] && this.field1495[var8] != -1) {
                    var7.method2940(var8);
                    var7.method2942(this.field1495[var8]);
                }
            }
            var7.method2940(var5);
            for (int var9 = 0; var9 < this.field1497.length; var9++) {
                if (this.field1506[var9] && this.field1497[var9] != null) {
                    var7.method2940(var9);
                    var7.method3041(this.field1497[var9]);
                }
            }
            var1.method2213(var7.field2409, 0, var7.field2405);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2234();
            } catch (Exception var20) {
            }
        }
        this.field1504 = false;
        this.field1501 = class176.method2725();
    }

    @ObfuscatedName("cj.g(I)V")
    public void method1725() {
        class123 var1 = this.method1712(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method2216()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2224(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class174 var5 = new class174(var2);
                if (var5.field2409.length - var5.field2405 >= 1) {
                    int var7 = var5.method2955();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method3035();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method3035();
                        int var12 = var5.method2960();
                        if (this.field1500[var11]) {
                            this.field1495[var11] = var12;
                        }
                    }
                    int var13 = var5.method3035();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method3035();
                        String var16 = var5.method2964();
                        if (this.field1506[var15]) {
                            this.field1497[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method2234();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1504 = false;
    }

    @ObfuscatedName("cj.v(S)V")
    public void method1715() {
        if (this.field1504 && this.field1501 < class176.method2725() - 60000L) {
            this.method1729();
        }
    }

    @ObfuscatedName("cj.t(I)Z")
    public boolean method1706() {
        return this.field1504;
    }
}
