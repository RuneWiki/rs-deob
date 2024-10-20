package deob;

import java.io.EOFException;

@ObfuscatedName("cc")
public class class96 {

    @ObfuscatedName("cc.e")
    public boolean[] field1408 = new boolean[this.field1406.length];

    @ObfuscatedName("cc.k")
    public boolean[] field1407;

    @ObfuscatedName("cc.u")
    public int[] field1406 = new int[Statics.field3701.method3907(19)];

    @ObfuscatedName("cc.z")
    public String[] field1405 = new String[Statics.field3701.method3907(15)];

    @ObfuscatedName("cc.t")
    public boolean field1409 = false;

    @ObfuscatedName("cc.f")
    public long field1411;

    public class96() {
        for (int var1 = 0; var1 < this.field1406.length; var1++) {
            class255 var2 = (class255) class255.field3402.method3373((long) var1);
            class255 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3401.method3897(19, var1);
                class255 var5 = new class255();
                if (var4 != null) {
                    var5.method4090(new class185(var4));
                }
                class255.field3402.method3375(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1408[var1] = var3.field3403;
        }
        this.field1407 = new boolean[this.field1405.length];
        for (int var7 = 0; var7 < this.field1405.length; var7++) {
            class256 var8 = (class256) class256.field3404.method3373((long) var7);
            class256 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field3406.method3897(15, var7);
                class256 var11 = new class256();
                if (var10 != null) {
                    var11.method4097(new class185(var10));
                }
                class256.field3404.method3375(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field1407[var7] = var9.field3405;
        }
        for (int var13 = 0; var13 < this.field1406.length; var13++) {
            this.field1406[var13] = -1;
        }
        this.method1623();
    }

    @ObfuscatedName("cc.a(IIB)V")
    public void method1617(int arg0, int arg1) {
        this.field1406[arg0] = arg1;
        if (this.field1408[arg0]) {
            this.field1409 = true;
        }
    }

    @ObfuscatedName("cc.w(IB)I")
    public int method1618(int arg0) {
        return this.field1406[arg0];
    }

    @ObfuscatedName("cc.e(ILjava/lang/String;B)V")
    public void method1619(int arg0, String arg1) {
        this.field1405[arg0] = arg1;
        if (this.field1407[arg0]) {
            this.field1409 = true;
        }
    }

    @ObfuscatedName("cc.k(II)Ljava/lang/String;")
    public String method1616(int arg0) {
        return this.field1405[arg0];
    }

    @ObfuscatedName("cc.u(I)V")
    public void method1638() {
        for (int var1 = 0; var1 < this.field1406.length; var1++) {
            if (!this.field1408[var1]) {
                this.field1406[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1405.length; var2++) {
            if (!this.field1407[var2]) {
                this.field1405[var2] = null;
            }
        }
    }

    @ObfuscatedName("cc.z(ZB)Lda;")
    public class124 method1626(boolean arg0) {
        return class158.method1693("2", Statics.field722.field3296, arg0);
    }

    @ObfuscatedName("cc.t(B)V")
    public void method1622() {
        class124 var1 = this.method1626(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1406.length; var4++) {
                if (this.field1408[var4] && this.field1406[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1405.length; var6++) {
                if (this.field1407[var6] && this.field1405[var6] != null) {
                    var2 += 2 + class185.method960(this.field1405[var6]);
                    var5++;
                }
            }
            class185 var7 = new class185(var2);
            var7.method2946(1);
            var7.method2944(var3);
            for (int var8 = 0; var8 < this.field1406.length; var8++) {
                if (this.field1408[var8] && this.field1406[var8] != -1) {
                    var7.method2944(var8);
                    var7.method2949(this.field1406[var8]);
                }
            }
            var7.method2944(var5);
            for (int var9 = 0; var9 < this.field1405.length; var9++) {
                if (this.field1407[var9] && this.field1405[var9] != null) {
                    var7.method2944(var9);
                    var7.method3106(this.field1405[var9]);
                }
            }
            var1.method2146(var7.field2512, 0, var7.field2509);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2147();
            } catch (Exception var20) {
            }
        }
        this.field1409 = false;
        this.field1411 = class187.method1411();
    }

    @ObfuscatedName("cc.f(I)V")
    public void method1623() {
        class124 var1 = this.method1626(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method2149()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2169(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class185 var5 = new class185(var2);
                if (var5.field2512.length - var5.field2509 >= 1) {
                    int var7 = var5.method2962();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method3194();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method3194();
                            int var12 = var5.method2967();
                            if (this.field1408[var11]) {
                                this.field1406[var11] = var12;
                            }
                        }
                        int var13 = var5.method3194();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method3194();
                            String var16 = var5.method3168();
                            if (this.field1407[var15]) {
                                this.field1405[var15] = var16;
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
                    var1.method2147();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1409 = false;
    }

    @ObfuscatedName("cc.g(S)V")
    public void method1627() {
        if (this.field1409 && this.field1411 < class187.method1411() - 60000L) {
            this.method1622();
        }
    }

    @ObfuscatedName("cc.x(I)Z")
    public boolean method1620() {
        return this.field1409;
    }
}
