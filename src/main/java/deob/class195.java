package deob;

@ObfuscatedName("gq")
public class class195 {

    @ObfuscatedName("gq.b")
    public class114[] field2279;

    @ObfuscatedName("gq.p")
    public int field2280;

    public class195(class419 arg0, int arg1) {
        this.field2279 = new class114[arg1];
        this.field2280 = arg0.method6781();
        for (int var3 = 0; var3 < this.field2279.length; var3++) {
            class114 var4 = new class114(this.field2280, arg0, false);
            this.field2279[var3] = var4;
        }
        this.method3605();
    }

    @ObfuscatedName("gq.c(I)V")
    public void method3605() {
        class114[] var1 = this.field2279;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class114 var3 = var1[var2];
            if (var3.field1378 >= 0) {
                var3.field1367 = this.field2279[var3.field1378];
            }
        }
    }

    @ObfuscatedName("gq.b(S)I")
    public int method3619() {
        return this.field2279.length;
    }

    @ObfuscatedName("gq.p(II)Ldf;")
    public class114 method3607(int arg0) {
        return this.field2279[arg0];
    }

    @ObfuscatedName("gq.m(B)[Ldf;")
    public class114[] method3608() {
        return this.field2279;
    }

    @ObfuscatedName("gq.t(Ldb;II)V")
    public void method3623(class121 arg0, int arg1) {
        this.method3624(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("gq.s(Ldb;I[ZZI)V")
    public void method3624(class121 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2556();
        int var6 = 0;
        class114[] var7 = this.method3608();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class114 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2562(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
