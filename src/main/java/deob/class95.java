package deob;

import java.io.EOFException;

@ObfuscatedName("cr")
public class class95 {

    @ObfuscatedName("cr.n")
    public boolean[] field1423 = new boolean[this.field1426.length];

    @ObfuscatedName("cr.r")
    public boolean[] field1424;

    @ObfuscatedName("cr.e")
    public int[] field1426 = new int[Statics.field244.method4285(19)];

    @ObfuscatedName("cr.y")
    public String[] field1422 = new String[Statics.field244.method4285(15)];

    @ObfuscatedName("cr.k")
    public boolean field1427 = false;

    @ObfuscatedName("cr.s")
    public long field1428;

    public class95() {
        for (int var1 = 0; var1 < this.field1426.length; var1++) {
            class271 var2 = class271.method1795(var1);
            this.field1423[var1] = var2.field3473;
        }
        this.field1424 = new boolean[this.field1422.length];
        for (int var3 = 0; var3 < this.field1422.length; var3++) {
            class272 var4 = class272.method4441(var3);
            this.field1424[var3] = var4.field3478;
        }
        for (int var5 = 0; var5 < this.field1426.length; var5++) {
            this.field1426[var5] = -1;
        }
        this.method1856();
    }

    @ObfuscatedName("cr.d(IIB)V")
    public void method1860(int arg0, int arg1) {
        this.field1426[arg0] = arg1;
        if (this.field1423[arg0]) {
            this.field1427 = true;
        }
    }

    @ObfuscatedName("cr.z(II)I")
    public int method1835(int arg0) {
        return this.field1426[arg0];
    }

    @ObfuscatedName("cr.n(ILjava/lang/String;B)V")
    public void method1836(int arg0, String arg1) {
        this.field1422[arg0] = arg1;
        if (this.field1424[arg0]) {
            this.field1427 = true;
        }
    }

    @ObfuscatedName("cr.r(II)Ljava/lang/String;")
    public String method1837(int arg0) {
        return this.field1422[arg0];
    }

    @ObfuscatedName("cr.e(B)V")
    public void method1838() {
        for (int var1 = 0; var1 < this.field1426.length; var1++) {
            if (!this.field1423[var1]) {
                this.field1426[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1422.length; var2++) {
            if (!this.field1424[var2]) {
                this.field1422[var2] = null;
            }
        }
    }

    @ObfuscatedName("cr.y(ZI)Ldi;")
    public class123 method1846(boolean arg0) {
        return class168.method1806("2", Statics.field2119.field3357, arg0);
    }

    @ObfuscatedName("cr.k(I)V")
    public void method1840() {
        class123 var1 = this.method1846(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1426.length; var4++) {
                if (this.field1423[var4] && this.field1426[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1422.length; var6++) {
                if (this.field1424[var6] && this.field1422[var6] != null) {
                    var2 += 2 + class195.method240(this.field1422[var6]);
                    var5++;
                }
            }
            class195 var7 = new class195(var2);
            var7.method3243(1);
            var7.method3360(var3);
            for (int var8 = 0; var8 < this.field1426.length; var8++) {
                if (this.field1423[var8] && this.field1426[var8] != -1) {
                    var7.method3360(var8);
                    var7.method3326(this.field1426[var8]);
                }
            }
            var7.method3360(var5);
            for (int var9 = 0; var9 < this.field1422.length; var9++) {
                if (this.field1424[var9] && this.field1422[var9] != null) {
                    var7.method3360(var9);
                    var7.method3250(this.field1422[var9]);
                }
            }
            var1.method2384(var7.field2569, 0, var7.field2568);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2367();
            } catch (Exception var20) {
            }
        }
        this.field1427 = false;
        this.field1428 = class197.method1501();
    }

    @ObfuscatedName("cr.s(B)V")
    public void method1856() {
        class123 var1 = this.method1846(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method2364()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2374(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class195 var5 = new class195(var2);
                if (var5.field2569.length - var5.field2568 >= 1) {
                    int var7 = var5.method3330();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method3269();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method3269();
                            int var12 = var5.method3264();
                            if (this.field1423[var11]) {
                                this.field1426[var11] = var12;
                            }
                        }
                        int var13 = var5.method3269();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method3269();
                            String var16 = var5.method3268();
                            if (this.field1424[var15]) {
                                this.field1422[var15] = var16;
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
                    var1.method2367();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1427 = false;
    }

    @ObfuscatedName("cr.x(B)V")
    public void method1842() {
        if (this.field1427 && this.field1428 < class197.method1501() - 60000L) {
            this.method1840();
        }
    }

    @ObfuscatedName("cr.h(I)Z")
    public boolean method1843() {
        return this.field1427;
    }
}
