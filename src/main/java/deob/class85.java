package deob;

import java.io.EOFException;

@ObfuscatedName("cg")
public class class85 {

    @ObfuscatedName("cg.w")
    public boolean[] field1238 = new boolean[this.field1235.length];

    @ObfuscatedName("cg.s")
    public boolean[] field1234;

    @ObfuscatedName("cg.e")
    public int[] field1235 = new int[Statics.field1858.method4326(19)];

    @ObfuscatedName("cg.a")
    public String[] field1232 = new String[Statics.field1858.method4326(15)];

    @ObfuscatedName("cg.c")
    public boolean field1237 = false;

    @ObfuscatedName("cg.p")
    public long field1236;

    public class85() {
        for (int var1 = 0; var1 < this.field1235.length; var1++) {
            class259 var2 = class259.method4199(var1);
            this.field1238[var1] = var2.field3325;
        }
        this.field1234 = new boolean[this.field1232.length];
        for (int var3 = 0; var3 < this.field1232.length; var3++) {
            class260 var4 = class260.method185(var3);
            this.field1234[var3] = var4.field3328;
        }
        for (int var5 = 0; var5 < this.field1235.length; var5++) {
            this.field1235[var5] = -1;
        }
        this.method1888();
    }

    @ObfuscatedName("cg.f(III)V")
    public void method1863(int arg0, int arg1) {
        this.field1235[arg0] = arg1;
        if (this.field1238[arg0]) {
            this.field1237 = true;
        }
    }

    @ObfuscatedName("cg.l(II)I")
    public int method1864(int arg0) {
        return this.field1235[arg0];
    }

    @ObfuscatedName("cg.w(ILjava/lang/String;I)V")
    public void method1865(int arg0, String arg1) {
        this.field1232[arg0] = arg1;
        if (this.field1234[arg0]) {
            this.field1237 = true;
        }
    }

    @ObfuscatedName("cg.s(IB)Ljava/lang/String;")
    public String method1889(int arg0) {
        return this.field1232[arg0];
    }

    @ObfuscatedName("cg.e(I)V")
    public void method1891() {
        for (int var1 = 0; var1 < this.field1235.length; var1++) {
            if (!this.field1238[var1]) {
                this.field1235[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1232.length; var2++) {
            if (!this.field1234[var2]) {
                this.field1232[var2] = null;
            }
        }
    }

    @ObfuscatedName("cg.c(ZI)Lda;")
    public class113 method1883(boolean arg0) {
        return class158.method942("2", Statics.field334.field3211, arg0);
    }

    @ObfuscatedName("cg.p(I)V")
    public void method1869() {
        class113 var1 = this.method1883(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1235.length; var4++) {
                if (this.field1238[var4] && this.field1235[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1232.length; var6++) {
                if (this.field1234[var6] && this.field1232[var6] != null) {
                    var2 += 2 + class185.method3075(this.field1232[var6]);
                    var5++;
                }
            }
            class185 var7 = new class185(var2);
            var7.method3376(1);
            var7.method3330(var3);
            for (int var8 = 0; var8 < this.field1235.length; var8++) {
                if (this.field1238[var8] && this.field1235[var8] != -1) {
                    var7.method3330(var8);
                    var7.method3422(this.field1235[var8]);
                }
            }
            var7.method3330(var5);
            for (int var9 = 0; var9 < this.field1232.length; var9++) {
                if (this.field1234[var9] && this.field1232[var9] != null) {
                    var7.method3330(var9);
                    var7.method3446(this.field1232[var9]);
                }
            }
            var1.method2381(var7.field2415, 0, var7.field2414);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2393();
            } catch (Exception var20) {
            }
        }
        this.field1237 = false;
        this.field1236 = Statics.method1926();
    }

    @ObfuscatedName("cg.r(I)V")
    public void method1888() {
        class113 var1 = this.method1883(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method2384()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2385(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class185 var5 = new class185(var2);
                if (var5.field2415.length - var5.field2414 >= 1) {
                    int var7 = var5.method3344();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method3346();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method3346();
                            int var12 = var5.method3432();
                            if (this.field1238[var11]) {
                                this.field1235[var11] = var12;
                            }
                        }
                        int var13 = var5.method3346();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method3346();
                            String var16 = var5.method3353();
                            if (this.field1234[var15]) {
                                this.field1232[var15] = var16;
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
                    var1.method2393();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1237 = false;
    }

    @ObfuscatedName("cg.m(I)V")
    public void method1871() {
        if (this.field1237 && this.field1236 < Statics.method1926() - 60000L) {
            this.method1869();
        }
    }

    @ObfuscatedName("cg.d(I)Z")
    public boolean method1872() {
        return this.field1237;
    }
}
