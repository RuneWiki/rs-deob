package deob;

import java.io.EOFException;

@ObfuscatedName("cn")
public class class98 {

    @ObfuscatedName("cn.i")
    public boolean[] field1485 = new boolean[this.field1487.length];

    @ObfuscatedName("cn.u")
    public boolean[] field1486;

    @ObfuscatedName("cn.g")
    public int[] field1487 = new int[Statics.field946.method3739(19)];

    @ObfuscatedName("cn.m")
    public String[] field1488 = new String[Statics.field946.method3739(15)];

    @ObfuscatedName("cn.s")
    public boolean field1491 = false;

    @ObfuscatedName("cn.x")
    public long field1490;

    public class98() {
        for (int var1 = 0; var1 < this.field1487.length; var1++) {
            class244 var2 = class244.method950(var1);
            this.field1485[var1] = var2.field3290;
        }
        this.field1486 = new boolean[this.field1488.length];
        for (int var3 = 0; var3 < this.field1488.length; var3++) {
            class245 var4 = (class245) class245.field3293.method3220((long) var3);
            class245 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field3294.method3741(15, var3);
                class245 var7 = new class245();
                if (var6 != null) {
                    var7.method3909(new class174(var6));
                }
                class245.field3293.method3233(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field1486[var3] = var5.field3295;
        }
        for (int var9 = 0; var9 < this.field1487.length; var9++) {
            this.field1487[var9] = -1;
        }
        this.method1608();
    }

    @ObfuscatedName("cn.c(III)V")
    public void method1601(int arg0, int arg1) {
        this.field1487[arg0] = arg1;
        if (this.field1485[arg0]) {
            this.field1491 = true;
        }
    }

    @ObfuscatedName("cn.o(IB)I")
    public int method1602(int arg0) {
        return this.field1487[arg0];
    }

    @ObfuscatedName("cn.i(ILjava/lang/String;I)V")
    public void method1609(int arg0, String arg1) {
        this.field1488[arg0] = arg1;
        if (this.field1486[arg0]) {
            this.field1491 = true;
        }
    }

    @ObfuscatedName("cn.u(II)Ljava/lang/String;")
    public String method1604(int arg0) {
        return this.field1488[arg0];
    }

    @ObfuscatedName("cn.g(B)V")
    public void method1605() {
        for (int var1 = 0; var1 < this.field1487.length; var1++) {
            if (!this.field1485[var1]) {
                this.field1487[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1488.length; var2++) {
            if (!this.field1486[var2]) {
                this.field1488[var2] = null;
            }
        }
    }

    @ObfuscatedName("cn.m(ZB)Ldx;")
    public class125 method1600(boolean arg0) {
        return class156.method2605("2", Statics.field1498.field3160, arg0);
    }

    @ObfuscatedName("cn.s(I)V")
    public void method1607() {
        class125 var1 = this.method1600(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1487.length; var4++) {
                if (this.field1485[var4] && this.field1487[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1488.length; var6++) {
                if (this.field1486[var6] && this.field1488[var6] != null) {
                    var2 += 2 + class174.method84(this.field1488[var6]);
                    var5++;
                }
            }
            class174 var7 = new class174(var2);
            var7.method2922(1);
            var7.method2846(var3);
            for (int var8 = 0; var8 < this.field1487.length; var8++) {
                if (this.field1485[var8] && this.field1487[var8] != -1) {
                    var7.method2846(var8);
                    var7.method3024(this.field1487[var8]);
                }
            }
            var7.method2846(var5);
            for (int var9 = 0; var9 < this.field1488.length; var9++) {
                if (this.field1486[var9] && this.field1488[var9] != null) {
                    var7.method2846(var9);
                    var7.method2851(this.field1488[var9]);
                }
            }
            var1.method2093(var7.field2355, 0, var7.field2357);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2094();
            } catch (Exception var20) {
            }
        }
        this.field1491 = false;
        this.field1490 = class176.method2679();
    }

    @ObfuscatedName("cn.x(B)V")
    public void method1608() {
        class125 var1 = this.method1600(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method2105()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2095(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class174 var5 = new class174(var2);
                if (var5.field2355.length - var5.field2357 < 1) {
                    return;
                }
                int var7 = var5.method2843();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2861();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2861();
                        int var12 = var5.method2987();
                        if (this.field1485[var11]) {
                            this.field1487[var11] = var12;
                        }
                    }
                    int var13 = var5.method2861();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2861();
                        String var16 = var5.method2867();
                        if (this.field1486[var15]) {
                            this.field1488[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method2094();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1491 = false;
    }

    @ObfuscatedName("cn.p(I)V")
    public void method1603() {
        if (this.field1491 && this.field1490 < class176.method2679() - 60000L) {
            this.method1607();
        }
    }

    @ObfuscatedName("cn.k(B)Z")
    public boolean method1610() {
        return this.field1491;
    }
}
