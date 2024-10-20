package deob;

import java.io.EOFException;

@ObfuscatedName("cq")
public class class98 {

    @ObfuscatedName("cq.e")
    public boolean[] field1520 = new boolean[this.field1523.length];

    @ObfuscatedName("cq.v")
    public boolean[] field1522;

    @ObfuscatedName("cq.b")
    public int[] field1523 = new int[Statics.field3595.method3847(19)];

    @ObfuscatedName("cq.y")
    public String[] field1524 = new String[Statics.field3595.method3847(15)];

    @ObfuscatedName("cq.h")
    public boolean field1525 = false;

    @ObfuscatedName("cq.x")
    public long field1526;

    public class98() {
        for (int var1 = 0; var1 < this.field1523.length; var1++) {
            class244 var2 = (class244) class244.field3313.method3220((long) var1);
            class244 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3317.method3769(19, var1);
                class244 var5 = new class244();
                if (var4 != null) {
                    var5.method3965(new class174(var4));
                }
                class244.field3313.method3222(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1520[var1] = var3.field3315;
        }
        this.field1522 = new boolean[this.field1524.length];
        for (int var7 = 0; var7 < this.field1524.length; var7++) {
            class245 var8 = (class245) class245.field3321.method3220((long) var7);
            class245 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field3320.method3769(15, var7);
                class245 var11 = new class245();
                if (var10 != null) {
                    var11.method3979(new class174(var10));
                }
                class245.field3321.method3222(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field1522[var7] = var9.field3319;
        }
        for (int var13 = 0; var13 < this.field1523.length; var13++) {
            this.field1523[var13] = -1;
        }
        this.method1654();
    }

    @ObfuscatedName("cq.i(III)V")
    public void method1669(int arg0, int arg1) {
        this.field1523[arg0] = arg1;
        if (this.field1520[arg0]) {
            this.field1525 = true;
        }
    }

    @ObfuscatedName("cq.c(IB)I")
    public int method1643(int arg0) {
        return this.field1523[arg0];
    }

    @ObfuscatedName("cq.e(ILjava/lang/String;I)V")
    public void method1644(int arg0, String arg1) {
        this.field1524[arg0] = arg1;
        if (this.field1522[arg0]) {
            this.field1525 = true;
        }
    }

    @ObfuscatedName("cq.v(II)Ljava/lang/String;")
    public String method1645(int arg0) {
        return this.field1524[arg0];
    }

    @ObfuscatedName("cq.b(I)V")
    public void method1646() {
        for (int var1 = 0; var1 < this.field1523.length; var1++) {
            if (!this.field1520[var1]) {
                this.field1523[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1524.length; var2++) {
            if (!this.field1522[var2]) {
                this.field1524[var2] = null;
            }
        }
    }

    @ObfuscatedName("cq.y(ZI)Ldz;")
    public class125 method1649(boolean arg0) {
        return class156.method2666("2", Statics.field401.field3193, arg0);
    }

    @ObfuscatedName("cq.h(I)V")
    public void method1648() {
        class125 var1 = this.method1649(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1523.length; var4++) {
                if (this.field1520[var4] && this.field1523[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1524.length; var6++) {
                if (this.field1522[var6] && this.field1524[var6] != null) {
                    var2 += 2 + class174.method12(this.field1524[var6]);
                    var5++;
                }
            }
            class174 var7 = new class174(var2);
            var7.method2865(1);
            var7.method2856(var3);
            for (int var8 = 0; var8 < this.field1523.length; var8++) {
                if (this.field1520[var8] && this.field1523[var8] != -1) {
                    var7.method2856(var8);
                    var7.method2871(this.field1523[var8]);
                }
            }
            var7.method2856(var5);
            for (int var9 = 0; var9 < this.field1524.length; var9++) {
                if (this.field1522[var9] && this.field1524[var9] != null) {
                    var7.method2856(var9);
                    var7.method2879(this.field1524[var9]);
                }
            }
            var1.method2145(var7.field2415, 0, var7.field2407);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2129();
            } catch (Exception var20) {
            }
        }
        this.field1525 = false;
        this.field1526 = class176.method89();
    }

    @ObfuscatedName("cq.x(I)V")
    public void method1654() {
        class125 var1 = this.method1649(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method2125()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2124(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class174 var5 = new class174(var2);
                if (var5.field2415.length - var5.field2407 < 1) {
                    return;
                }
                int var7 = var5.method2870();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2872();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2872();
                        int var12 = var5.method2875();
                        if (this.field1520[var11]) {
                            this.field1523[var11] = var12;
                        }
                    }
                    int var13 = var5.method2872();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2872();
                        String var16 = var5.method2878();
                        if (this.field1522[var15]) {
                            this.field1524[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method2129();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1525 = false;
    }

    @ObfuscatedName("cq.f(I)V")
    public void method1650() {
        if (this.field1525 && this.field1526 < class176.method89() - 60000L) {
            this.method1648();
        }
    }

    @ObfuscatedName("cq.n(I)Z")
    public boolean method1666() {
        return this.field1525;
    }
}
