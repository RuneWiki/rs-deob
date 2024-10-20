package deob;

@ObfuscatedName("hk")
public class class232 {

    @ObfuscatedName("hk.c")
    public class116[] field2579;

    @ObfuscatedName("hk.i")
    public int field2578;

    public class232(class438 arg0, int arg1) {
        this.field2579 = new class116[arg1];
        this.field2578 = arg0.method6971();
        for (int var3 = 0; var3 < this.field2579.length; var3++) {
            class116 var4 = new class116(this.field2578, arg0, false);
            this.field2579[var3] = var4;
        }
        this.method4219();
    }

    @ObfuscatedName("hk.v(I)V")
    public void method4219() {
        class116[] var1 = this.field2579;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class116 var3 = var1[var2];
            if (var3.field1396 >= 0) {
                var3.field1389 = this.field2579[var3.field1396];
            }
        }
    }

    @ObfuscatedName("hk.c(I)I")
    public int method4220() {
        return this.field2579.length;
    }

    @ObfuscatedName("hk.i(II)Lda;")
    public class116 method4240(int arg0) {
        return this.field2579[arg0];
    }

    @ObfuscatedName("hk.f(I)[Lda;")
    public class116[] method4222() {
        return this.field2579;
    }

    @ObfuscatedName("hk.b(Ldo;II)V")
    public void method4239(class123 arg0, int arg1) {
        this.method4223(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("hk.n(Ldo;I[ZZI)V")
    public void method4223(class123 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2635();
        int var6 = 0;
        class116[] var7 = this.method4222();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class116 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2665(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
