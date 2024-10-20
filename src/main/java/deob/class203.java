package deob;

@ObfuscatedName("ge")
public class class203 {

    @ObfuscatedName("ge.p")
    public class117[] field2399;

    @ObfuscatedName("ge.f")
    public int field2400;

    public class203(class445 arg0, int arg1) {
        this.field2399 = new class117[arg1];
        this.field2400 = arg0.method7196();
        for (int var3 = 0; var3 < this.field2399.length; var3++) {
            class117 var4 = new class117(this.field2400, arg0, false);
            this.field2399[var3] = var4;
        }
        this.method3874();
    }

    @ObfuscatedName("ge.c(S)V")
    public void method3874() {
        class117[] var1 = this.field2399;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class117 var3 = var1[var2];
            if (var3.field1436 >= 0) {
                var3.field1430 = this.field2399[var3.field1436];
            }
        }
    }

    @ObfuscatedName("ge.p(B)I")
    public int method3859() {
        return this.field2399.length;
    }

    @ObfuscatedName("ge.f(IB)Ldj;")
    public class117 method3860(int arg0) {
        return arg0 >= this.method3859() ? null : this.field2399[arg0];
    }

    @ObfuscatedName("ge.n(I)[Ldj;")
    public class117[] method3869() {
        return this.field2399;
    }

    @ObfuscatedName("ge.k(Ldy;II)V")
    public void method3858(class124 arg0, int arg1) {
        this.method3863(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("ge.w(Ldy;I[ZZI)V")
    public void method3863(class124 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2812();
        int var6 = 0;
        class117[] var7 = this.method3869();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class117 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2797(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
