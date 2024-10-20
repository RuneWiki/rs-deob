package deob;

import java.io.EOFException;

@ObfuscatedName("cb")
public class class95 {

    @ObfuscatedName("cb.b")
    public boolean[] field1421 = new boolean[this.field1423.length];

    @ObfuscatedName("cb.z")
    public boolean[] field1427;

    @ObfuscatedName("cb.n")
    public int[] field1423 = new int[Statics.field885.method4279(19)];

    @ObfuscatedName("cb.l")
    public String[] field1424 = new String[Statics.field885.method4279(15)];

    @ObfuscatedName("cb.s")
    public boolean field1422 = false;

    @ObfuscatedName("cb.y")
    public long field1426;

    public class95() {
        for (int var1 = 0; var1 < this.field1423.length; var1++) {
            class271 var2 = Statics.method2190(var1);
            this.field1421[var1] = var2.field3474;
        }
        this.field1427 = new boolean[this.field1424.length];
        for (int var3 = 0; var3 < this.field1424.length; var3++) {
            class272 var4 = class272.method3270(var3);
            this.field1427[var3] = var4.field3480;
        }
        for (int var5 = 0; var5 < this.field1423.length; var5++) {
            this.field1423[var5] = -1;
        }
        this.method1906();
    }

    @ObfuscatedName("cb.g(III)V")
    public void method1904(int arg0, int arg1) {
        this.field1423[arg0] = arg1;
        if (this.field1421[arg0]) {
            this.field1422 = true;
        }
    }

    @ObfuscatedName("cb.e(IB)I")
    public int method1905(int arg0) {
        return this.field1423[arg0];
    }

    @ObfuscatedName("cb.b(ILjava/lang/String;I)V")
    public void method1931(int arg0, String arg1) {
        this.field1424[arg0] = arg1;
        if (this.field1427[arg0]) {
            this.field1422 = true;
        }
    }

    @ObfuscatedName("cb.z(II)Ljava/lang/String;")
    public String method1909(int arg0) {
        return this.field1424[arg0];
    }

    @ObfuscatedName("cb.n(I)V")
    public void method1907() {
        for (int var1 = 0; var1 < this.field1423.length; var1++) {
            if (!this.field1421[var1]) {
                this.field1423[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1424.length; var2++) {
            if (!this.field1427[var2]) {
                this.field1424[var2] = null;
            }
        }
    }

    @ObfuscatedName("cb.l(ZB)Ldb;")
    public class123 method1937(boolean arg0) {
        return class168.method9("2", Statics.field297.field3357, arg0);
    }

    @ObfuscatedName("cb.s(I)V")
    public void method1914() {
        class123 var1 = this.method1937(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1423.length; var4++) {
                if (this.field1421[var4] && this.field1423[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1424.length; var6++) {
                if (this.field1427[var6] && this.field1424[var6] != null) {
                    var2 += 2 + class195.method1963(this.field1424[var6]);
                    var5++;
                }
            }
            class195 var7 = new class195(var2);
            var7.method3363(1);
            var7.method3476(var3);
            for (int var8 = 0; var8 < this.field1423.length; var8++) {
                if (this.field1421[var8] && this.field1423[var8] != -1) {
                    var7.method3476(var8);
                    var7.method3319(this.field1423[var8]);
                }
            }
            var7.method3476(var5);
            for (int var9 = 0; var9 < this.field1424.length; var9++) {
                if (this.field1427[var9] && this.field1424[var9] != null) {
                    var7.method3476(var9);
                    var7.method3300(this.field1424[var9]);
                }
            }
            var1.method2429(var7.field2563, 0, var7.field2562);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2444();
            } catch (Exception var20) {
            }
        }
        this.field1422 = false;
        this.field1426 = class197.method4873();
    }

    @ObfuscatedName("cb.y(B)V")
    public void method1906() {
        class123 var1 = this.method1937(false);
        label182: {
            try {
                byte[] var2 = new byte[(int) var1.method2441()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2432(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class195 var5 = new class195(var2);
                if (var5.field2563.length - var5.field2562 < 1) {
                    return;
                }
                int var7 = var5.method3332();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method3310();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method3310();
                        int var12 = var5.method3472();
                        if (this.field1421[var11]) {
                            this.field1423[var11] = var12;
                        }
                    }
                    int var13 = var5.method3310();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label182;
                        }
                        int var15 = var5.method3310();
                        String var16 = var5.method3429();
                        if (this.field1427[var15]) {
                            this.field1424[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label182;
            } finally {
                try {
                    var1.method2444();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1422 = false;
    }

    @ObfuscatedName("cb.c(S)V")
    public void method1911() {
        if (this.field1422 && this.field1426 < class197.method4873() - 60000L) {
            this.method1914();
        }
    }

    @ObfuscatedName("cb.o(B)Z")
    public boolean method1912() {
        return this.field1422;
    }
}
