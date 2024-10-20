package deob;

import java.io.EOFException;

@ObfuscatedName("cb")
public class class94 {

    @ObfuscatedName("cb.w")
    public boolean[] field1393 = new boolean[this.field1390.length];

    @ObfuscatedName("cb.s")
    public boolean[] field1394;

    @ObfuscatedName("cb.j")
    public int[] field1390 = new int[Statics.field3776.method4044(19)];

    @ObfuscatedName("cb.a")
    public String[] field1392 = new String[Statics.field3776.method4044(15)];

    @ObfuscatedName("cb.t")
    public boolean field1396 = false;

    @ObfuscatedName("cb.r")
    public long field1397;

    public class94() {
        for (int var1 = 0; var1 < this.field1390.length; var1++) {
            class255 var2 = class255.method551(var1);
            this.field1393[var1] = var2.field3378;
        }
        this.field1394 = new boolean[this.field1392.length];
        for (int var3 = 0; var3 < this.field1392.length; var3++) {
            class256 var4 = (class256) class256.field3380.method3504((long) var3);
            class256 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field3381.method4032(15, var3);
                class256 var7 = new class256();
                if (var6 != null) {
                    var7.method4242(new class185(var6));
                }
                class256.field3380.method3506(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field1394[var3] = var5.field3379;
        }
        for (int var9 = 0; var9 < this.field1390.length; var9++) {
            this.field1390[var9] = -1;
        }
        this.method1809();
    }

    @ObfuscatedName("cb.p(III)V")
    public void method1806(int arg0, int arg1) {
        this.field1390[arg0] = arg1;
        if (this.field1393[arg0]) {
            this.field1396 = true;
        }
    }

    @ObfuscatedName("cb.i(II)I")
    public int method1807(int arg0) {
        return this.field1390[arg0];
    }

    @ObfuscatedName("cb.w(ILjava/lang/String;I)V")
    public void method1808(int arg0, String arg1) {
        this.field1392[arg0] = arg1;
        if (this.field1394[arg0]) {
            this.field1396 = true;
        }
    }

    @ObfuscatedName("cb.s(IB)Ljava/lang/String;")
    public String method1823(int arg0) {
        return this.field1392[arg0];
    }

    @ObfuscatedName("cb.j(I)V")
    public void method1810() {
        for (int var1 = 0; var1 < this.field1390.length; var1++) {
            if (!this.field1393[var1]) {
                this.field1390[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1392.length; var2++) {
            if (!this.field1394[var2]) {
                this.field1392[var2] = null;
            }
        }
    }

    @ObfuscatedName("cb.a(ZB)Ldc;")
    public class122 method1805(boolean arg0) {
        return class158.method2819("2", Statics.field262.field3271, arg0);
    }

    @ObfuscatedName("cb.t(B)V")
    public void method1812() {
        class122 var1 = this.method1805(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1390.length; var4++) {
                if (this.field1393[var4] && this.field1390[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1392.length; var6++) {
                if (this.field1394[var6] && this.field1392[var6] != null) {
                    var2 += 2 + class185.method1722(this.field1392[var6]);
                    var5++;
                }
            }
            class185 var7 = new class185(var2);
            var7.method3107(1);
            var7.method3250(var3);
            for (int var8 = 0; var8 < this.field1390.length; var8++) {
                if (this.field1393[var8] && this.field1390[var8] != -1) {
                    var7.method3250(var8);
                    var7.method3110(this.field1390[var8]);
                }
            }
            var7.method3250(var5);
            for (int var9 = 0; var9 < this.field1392.length; var9++) {
                if (this.field1394[var9] && this.field1392[var9] != null) {
                    var7.method3250(var9);
                    var7.method3189(this.field1392[var9]);
                }
            }
            var1.method2311(var7.field2491, 0, var7.field2488);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2312();
            } catch (Exception var20) {
            }
        }
        this.field1396 = false;
        this.field1397 = class187.method35();
    }

    @ObfuscatedName("cb.r(B)V")
    public void method1809() {
        class122 var1 = this.method1805(false);
        label182: {
            try {
                byte[] var2 = new byte[(int) var1.method2309()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2315(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class185 var5 = new class185(var2);
                if (var5.field2491.length - var5.field2488 < 1) {
                    return;
                }
                int var7 = var5.method3197();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method3124();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method3124();
                        int var12 = var5.method3127();
                        if (this.field1393[var11]) {
                            this.field1390[var11] = var12;
                        }
                    }
                    int var13 = var5.method3124();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label182;
                        }
                        int var15 = var5.method3124();
                        String var16 = var5.method3131();
                        if (this.field1394[var15]) {
                            this.field1392[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label182;
            } finally {
                try {
                    var1.method2312();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1396 = false;
    }

    @ObfuscatedName("cb.m(I)V")
    public void method1816() {
        if (this.field1396 && this.field1397 < class187.method35() - 60000L) {
            this.method1812();
        }
    }

    @ObfuscatedName("cb.h(I)Z")
    public boolean method1815() {
        return this.field1396;
    }
}
