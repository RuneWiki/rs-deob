package deob;

import java.io.EOFException;

@ObfuscatedName("cj")
public class class94 {

    @ObfuscatedName("cj.o")
    public boolean[] field1389 = new boolean[this.field1391.length];

    @ObfuscatedName("cj.p")
    public boolean[] field1395;

    @ObfuscatedName("cj.a")
    public int[] field1391 = new int[Statics.field1551.method4172(19)];

    @ObfuscatedName("cj.h")
    public String[] field1392 = new String[Statics.field1551.method4172(15)];

    @ObfuscatedName("cj.l")
    public boolean field1393 = false;

    @ObfuscatedName("cj.y")
    public long field1394;

    public class94() {
        for (int var1 = 0; var1 < this.field1391.length; var1++) {
            class264 var2 = class264.method4015(var1);
            this.field1389[var1] = var2.field3414;
        }
        this.field1395 = new boolean[this.field1392.length];
        for (int var3 = 0; var3 < this.field1392.length; var3++) {
            class265 var4 = (class265) class265.field3418.method3658((long) var3);
            class265 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field3416.method4158(15, var3);
                class265 var7 = new class265();
                if (var6 != null) {
                    var7.method4379(new class194(var6));
                }
                class265.field3418.method3659(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field1395[var3] = var5.field3417;
        }
        for (int var9 = 0; var9 < this.field1391.length; var9++) {
            this.field1391[var9] = -1;
        }
        this.method1807();
    }

    @ObfuscatedName("cj.b(III)V")
    public void method1800(int arg0, int arg1) {
        this.field1391[arg0] = arg1;
        if (this.field1389[arg0]) {
            this.field1393 = true;
        }
    }

    @ObfuscatedName("cj.q(II)I")
    public int method1826(int arg0) {
        return this.field1391[arg0];
    }

    @ObfuscatedName("cj.o(ILjava/lang/String;I)V")
    public void method1820(int arg0, String arg1) {
        this.field1392[arg0] = arg1;
        if (this.field1395[arg0]) {
            this.field1393 = true;
        }
    }

    @ObfuscatedName("cj.p(IB)Ljava/lang/String;")
    public String method1803(int arg0) {
        return this.field1392[arg0];
    }

    @ObfuscatedName("cj.a(I)V")
    public void method1804() {
        for (int var1 = 0; var1 < this.field1391.length; var1++) {
            if (!this.field1389[var1]) {
                this.field1391[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1392.length; var2++) {
            if (!this.field1395[var2]) {
                this.field1392[var2] = null;
            }
        }
    }

    @ObfuscatedName("cj.h(ZI)Ldx;")
    public class122 method1805(boolean arg0) {
        return class167.method57("2", Statics.field457.field3311, arg0);
    }

    @ObfuscatedName("cj.l(I)V")
    public void method1837() {
        class122 var1 = this.method1805(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1391.length; var4++) {
                if (this.field1389[var4] && this.field1391[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1392.length; var6++) {
                if (this.field1395[var6] && this.field1392[var6] != null) {
                    var2 += 2 + class194.method564(this.field1392[var6]);
                    var5++;
                }
            }
            class194 var7 = new class194(var2);
            var7.method3232(1);
            var7.method3233(var3);
            for (int var8 = 0; var8 < this.field1391.length; var8++) {
                if (this.field1389[var8] && this.field1391[var8] != -1) {
                    var7.method3233(var8);
                    var7.method3235(this.field1391[var8]);
                }
            }
            var7.method3233(var5);
            for (int var9 = 0; var9 < this.field1392.length; var9++) {
                if (this.field1395[var9] && this.field1392[var9] != null) {
                    var7.method3233(var9);
                    var7.method3239(this.field1392[var9]);
                }
            }
            var1.method2336(var7.field2541, 0, var7.field2538);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2335();
            } catch (Exception var20) {
            }
        }
        this.field1393 = false;
        this.field1394 = class196.method3211();
    }

    @ObfuscatedName("cj.y(I)V")
    public void method1807() {
        class122 var1 = this.method1805(false);
        try {
            byte[] var2 = new byte[(int) var1.method2359()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method2340(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class194 var5 = new class194(var2);
            if (var5.field2541.length - var5.field2538 < 1) {
                return;
            }
            int var7 = var5.method3247();
            if (var7 < 0 || var7 > 1) {
                return;
            }
            int var9 = var5.method3249();
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method3249();
                int var12 = var5.method3261();
                if (this.field1389[var11]) {
                    this.field1391[var11] = var12;
                }
            }
            int var13 = var5.method3249();
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = var5.method3249();
                String var16 = var5.method3256();
                if (this.field1395[var15]) {
                    this.field1392[var15] = var16;
                }
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method2335();
            } catch (Exception var29) {
            }
        }
        this.field1393 = false;
    }

    @ObfuscatedName("cj.g(I)V")
    public void method1808() {
        if (this.field1393 && this.field1394 < class196.method3211() - 60000L) {
            this.method1837();
        }
    }

    @ObfuscatedName("cj.c(B)Z")
    public boolean method1833() {
        return this.field1393;
    }
}
