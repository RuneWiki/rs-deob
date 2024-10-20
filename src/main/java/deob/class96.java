package deob;

import java.io.EOFException;

@ObfuscatedName("cf")
public class class96 {

    @ObfuscatedName("cf.r")
    public boolean[] field1421 = new boolean[this.field1417.length];

    @ObfuscatedName("cf.g")
    public boolean[] field1414;

    @ObfuscatedName("cf.x")
    public int[] field1417 = new int[Statics.field2898.method3883(19)];

    @ObfuscatedName("cf.f")
    public String[] field1416 = new String[Statics.field2898.method3883(15)];

    @ObfuscatedName("cf.u")
    public boolean field1411 = false;

    @ObfuscatedName("cf.t")
    public long field1415;

    public class96() {
        for (int var1 = 0; var1 < this.field1417.length; var1++) {
            class251 var2 = class251.method939(var1);
            this.field1421[var1] = var2.field3369;
        }
        this.field1414 = new boolean[this.field1416.length];
        for (int var3 = 0; var3 < this.field1416.length; var3++) {
            class252 var4 = (class252) class252.field3372.method3330((long) var3);
            class252 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field3373.method3887(15, var3);
                class252 var7 = new class252();
                if (var6 != null) {
                    var7.method4012(new class181(var6));
                }
                class252.field3372.method3332(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field1414[var3] = var5.field3371;
        }
        for (int var9 = 0; var9 < this.field1417.length; var9++) {
            this.field1417[var9] = -1;
        }
        this.method1637();
    }

    @ObfuscatedName("cf.b(IIB)V")
    public void method1630(int arg0, int arg1) {
        this.field1417[arg0] = arg1;
        if (this.field1421[arg0]) {
            this.field1411 = true;
        }
    }

    @ObfuscatedName("cf.s(IB)I")
    public int method1647(int arg0) {
        return this.field1417[arg0];
    }

    @ObfuscatedName("cf.r(ILjava/lang/String;I)V")
    public void method1632(int arg0, String arg1) {
        this.field1416[arg0] = arg1;
        if (this.field1414[arg0]) {
            this.field1411 = true;
        }
    }

    @ObfuscatedName("cf.g(II)Ljava/lang/String;")
    public String method1633(int arg0) {
        return this.field1416[arg0];
    }

    @ObfuscatedName("cf.x(I)V")
    public void method1634() {
        for (int var1 = 0; var1 < this.field1417.length; var1++) {
            if (!this.field1421[var1]) {
                this.field1417[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1416.length; var2++) {
            if (!this.field1414[var2]) {
                this.field1416[var2] = null;
            }
        }
    }

    @ObfuscatedName("cf.f(ZB)Ldx;")
    public class124 method1635(boolean arg0) {
        return class157.method2296("2", Statics.field3263.field3257, arg0);
    }

    @ObfuscatedName("cf.u(I)V")
    public void method1636() {
        class124 var1 = this.method1635(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1417.length; var4++) {
                if (this.field1421[var4] && this.field1417[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1416.length; var6++) {
                if (this.field1414[var6] && this.field1416[var6] != null) {
                    var2 += 2 + class181.method157(this.field1416[var6]);
                    var5++;
                }
            }
            class181 var7 = new class181(var2);
            var7.method2929(1);
            var7.method2930(var3);
            for (int var8 = 0; var8 < this.field1417.length; var8++) {
                if (this.field1421[var8] && this.field1417[var8] != -1) {
                    var7.method2930(var8);
                    var7.method2977(this.field1417[var8]);
                }
            }
            var7.method2930(var5);
            for (int var9 = 0; var9 < this.field1416.length; var9++) {
                if (this.field1414[var9] && this.field1416[var9] != null) {
                    var7.method2930(var9);
                    var7.method2936(this.field1416[var9]);
                }
            }
            var1.method2167(var7.field2495, 0, var7.field2488);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2180();
            } catch (Exception var20) {
            }
        }
        this.field1411 = false;
        this.field1415 = class183.method1711();
    }

    @ObfuscatedName("cf.t(I)V")
    public void method1637() {
        class124 var1 = this.method1635(false);
        label182: {
            try {
                byte[] var2 = new byte[(int) var1.method2174()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2171(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class181 var5 = new class181(var2);
                if (var5.field2495.length - var5.field2488 < 1) {
                    return;
                }
                int var7 = var5.method2945();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method3081();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method3081();
                        int var12 = var5.method2996();
                        if (this.field1421[var11]) {
                            this.field1417[var11] = var12;
                        }
                    }
                    int var13 = var5.method3081();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label182;
                        }
                        int var15 = var5.method3081();
                        String var16 = var5.method2953();
                        if (this.field1414[var15]) {
                            this.field1416[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label182;
            } finally {
                try {
                    var1.method2180();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1411 = false;
    }

    @ObfuscatedName("cf.k(B)V")
    public void method1638() {
        if (this.field1411 && this.field1415 < class183.method1711() - 60000L) {
            this.method1636();
        }
    }

    @ObfuscatedName("cf.n(I)Z")
    public boolean method1631() {
        return this.field1411;
    }
}
