package deob;

import java.io.EOFException;

@ObfuscatedName("cm")
public class class94 {

    @ObfuscatedName("cm.m")
    public boolean[] field1405 = new boolean[this.field1407.length];

    @ObfuscatedName("cm.h")
    public boolean[] field1409;

    @ObfuscatedName("cm.i")
    public int[] field1407 = new int[Statics.field2020.method4209(19)];

    @ObfuscatedName("cm.w")
    public String[] field1406 = new String[Statics.field2020.method4209(15)];

    @ObfuscatedName("cm.t")
    public boolean field1410 = false;

    @ObfuscatedName("cm.d")
    public long field1404;

    public class94() {
        for (int var1 = 0; var1 < this.field1407.length; var1++) {
            class255 var2 = class255.method4327(var1);
            this.field1405[var1] = var2.field3399;
        }
        this.field1409 = new boolean[this.field1406.length];
        for (int var3 = 0; var3 < this.field1406.length; var3++) {
            class256 var4 = class256.method4298(var3);
            this.field1409[var3] = var4.field3404;
        }
        for (int var5 = 0; var5 < this.field1407.length; var5++) {
            this.field1407[var5] = -1;
        }
        this.method1839();
    }

    @ObfuscatedName("cm.s(IIS)V")
    public void method1835(int arg0, int arg1) {
        this.field1407[arg0] = arg1;
        if (this.field1405[arg0]) {
            this.field1410 = true;
        }
    }

    @ObfuscatedName("cm.g(II)I")
    public int method1836(int arg0) {
        return this.field1407[arg0];
    }

    @ObfuscatedName("cm.m(ILjava/lang/String;I)V")
    public void method1837(int arg0, String arg1) {
        this.field1406[arg0] = arg1;
        if (this.field1409[arg0]) {
            this.field1410 = true;
        }
    }

    @ObfuscatedName("cm.h(IS)Ljava/lang/String;")
    public String method1845(int arg0) {
        return this.field1406[arg0];
    }

    @ObfuscatedName("cm.i(B)V")
    public void method1838() {
        for (int var1 = 0; var1 < this.field1407.length; var1++) {
            if (!this.field1405[var1]) {
                this.field1407[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1406.length; var2++) {
            if (!this.field1409[var2]) {
                this.field1406[var2] = null;
            }
        }
    }

    @ObfuscatedName("cm.w(ZI)Lcs;")
    public class101 method1855(boolean arg0) {
        return class158.method2623("2", Statics.field1554.field3286, arg0);
    }

    @ObfuscatedName("cm.t(I)V")
    public void method1841() {
        class101 var1 = this.method1855(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1407.length; var4++) {
                if (this.field1405[var4] && this.field1407[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1406.length; var6++) {
                if (this.field1409[var6] && this.field1406[var6] != null) {
                    var2 += 2 + class185.method2709(this.field1406[var6]);
                    var5++;
                }
            }
            class185 var7 = new class185(var2);
            var7.method3223(1);
            var7.method3403(var3);
            for (int var8 = 0; var8 < this.field1407.length; var8++) {
                if (this.field1405[var8] && this.field1407[var8] != -1) {
                    var7.method3403(var8);
                    var7.method3242(this.field1407[var8]);
                }
            }
            var7.method3403(var5);
            for (int var9 = 0; var9 < this.field1406.length; var9++) {
                if (this.field1409[var9] && this.field1406[var9] != null) {
                    var7.method3403(var9);
                    var7.method3230(this.field1406[var9]);
                }
            }
            var1.method1957(var7.field2512, 0, var7.field2514);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method1958();
            } catch (Exception var20) {
            }
        }
        this.field1410 = false;
        this.field1404 = class187.method2705();
    }

    @ObfuscatedName("cm.d(B)V")
    public void method1839() {
        class101 var1 = this.method1855(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method1959()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method1966(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class185 var5 = new class185(var2);
                if (var5.field2512.length - var5.field2514 >= 1) {
                    int var7 = var5.method3239();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method3241();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method3241();
                        int var12 = var5.method3292();
                        if (this.field1405[var11]) {
                            this.field1407[var11] = var12;
                        }
                    }
                    int var13 = var5.method3241();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method3241();
                        String var16 = var5.method3248();
                        if (this.field1409[var15]) {
                            this.field1406[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method1958();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1410 = false;
    }

    @ObfuscatedName("cm.z(B)V")
    public void method1843() {
        if (this.field1410 && this.field1404 < class187.method2705() - 60000L) {
            this.method1841();
        }
    }

    @ObfuscatedName("cm.k(I)Z")
    public boolean method1844() {
        return this.field1410;
    }
}
