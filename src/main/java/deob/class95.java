package deob;

import java.io.EOFException;

@ObfuscatedName("ch")
public class class95 {

    @ObfuscatedName("ch.t")
    public boolean[] field1443 = new boolean[this.field1446.length];

    @ObfuscatedName("ch.d")
    public boolean[] field1445;

    @ObfuscatedName("ch.h")
    public int[] field1446 = new int[Statics.field367.method4207(19)];

    @ObfuscatedName("ch.m")
    public String[] field1449 = new String[Statics.field367.method4207(15)];

    @ObfuscatedName("ch.z")
    public boolean field1448 = false;

    @ObfuscatedName("ch.i")
    public long field1447;

    public class95() {
        for (int var1 = 0; var1 < this.field1446.length; var1++) {
            class271 var2 = class271.method4053(var1);
            this.field1443[var1] = var2.field3475;
        }
        this.field1445 = new boolean[this.field1449.length];
        for (int var3 = 0; var3 < this.field1449.length; var3++) {
            class272 var4 = (class272) class272.field3481.method3601((long) var3);
            class272 var5;
            if (var4 == null) {
                byte[] var6 = Statics.field3482.method4241(15, var3);
                class272 var7 = new class272();
                if (var6 != null) {
                    var7.method4401(new class195(var6));
                }
                class272.field3481.method3603(var7, (long) var3);
                var5 = var7;
            } else {
                var5 = var4;
            }
            this.field1445[var3] = var5.field3480;
        }
        for (int var9 = 0; var9 < this.field1446.length; var9++) {
            this.field1446[var9] = -1;
        }
        this.method1803();
    }

    @ObfuscatedName("ch.o(IIB)V")
    public void method1798(int arg0, int arg1) {
        this.field1446[arg0] = arg1;
        if (this.field1443[arg0]) {
            this.field1448 = true;
        }
    }

    @ObfuscatedName("ch.k(II)I")
    public int method1796(int arg0) {
        return this.field1446[arg0];
    }

    @ObfuscatedName("ch.t(ILjava/lang/String;I)V")
    public void method1822(int arg0, String arg1) {
        this.field1449[arg0] = arg1;
        if (this.field1445[arg0]) {
            this.field1448 = true;
        }
    }

    @ObfuscatedName("ch.d(II)Ljava/lang/String;")
    public String method1799(int arg0) {
        return this.field1449[arg0];
    }

    @ObfuscatedName("ch.h(I)V")
    public void method1800() {
        for (int var1 = 0; var1 < this.field1446.length; var1++) {
            if (!this.field1443[var1]) {
                this.field1446[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1449.length; var2++) {
            if (!this.field1445[var2]) {
                this.field1449[var2] = null;
            }
        }
    }

    @ObfuscatedName("ch.m(ZI)Ldi;")
    public class123 method1801(boolean arg0) {
        return class168.method1723("2", Statics.field3436.field3366, arg0);
    }

    @ObfuscatedName("ch.z(B)V")
    public void method1802() {
        class123 var1 = this.method1801(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1446.length; var4++) {
                if (this.field1443[var4] && this.field1446[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1449.length; var6++) {
                if (this.field1445[var6] && this.field1449[var6] != null) {
                    var2 += 2 + class195.method451(this.field1449[var6]);
                    var5++;
                }
            }
            class195 var7 = new class195(var2);
            var7.method3189(1);
            var7.method3190(var3);
            for (int var8 = 0; var8 < this.field1446.length; var8++) {
                if (this.field1443[var8] && this.field1446[var8] != -1) {
                    var7.method3190(var8);
                    var7.method3405(this.field1446[var8]);
                }
            }
            var7.method3190(var5);
            for (int var9 = 0; var9 < this.field1449.length; var9++) {
                if (this.field1445[var9] && this.field1449[var9] != null) {
                    var7.method3190(var9);
                    var7.method3214(this.field1449[var9]);
                }
            }
            var1.method2319(var7.field2574, 0, var7.field2575);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2326();
            } catch (Exception var20) {
            }
        }
        this.field1448 = false;
        this.field1447 = class197.method1005();
    }

    @ObfuscatedName("ch.i(B)V")
    public void method1803() {
        class123 var1 = this.method1801(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method2324()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2325(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class195 var5 = new class195(var2);
                if (var5.field2574.length - var5.field2575 >= 1) {
                    int var7 = var5.method3205();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method3207();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method3207();
                            int var12 = var5.method3254();
                            if (this.field1443[var11]) {
                                this.field1446[var11] = var12;
                            }
                        }
                        int var13 = var5.method3207();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method3207();
                            String var16 = var5.method3284();
                            if (this.field1445[var15]) {
                                this.field1449[var15] = var16;
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
                    var1.method2326();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1448 = false;
    }

    @ObfuscatedName("ch.u(B)V")
    public void method1804() {
        if (this.field1448 && this.field1447 < class197.method1005() - 60000L) {
            this.method1802();
        }
    }

    @ObfuscatedName("ch.x(B)Z")
    public boolean method1805() {
        return this.field1448;
    }
}
