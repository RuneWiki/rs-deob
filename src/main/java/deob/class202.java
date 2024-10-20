package deob;

@ObfuscatedName("gq")
public class class202 {

    @ObfuscatedName("gq.v")
    public class116[] field2366;

    @ObfuscatedName("gq.q")
    public int field2367;

    public class202(class443 arg0, int arg1) {
        this.field2366 = new class116[arg1];
        this.field2367 = arg0.method7047();
        for (int var3 = 0; var3 < this.field2366.length; var3++) {
            class116 var4 = new class116(this.field2367, arg0, false);
            this.field2366[var3] = var4;
        }
        this.method3800();
    }

    @ObfuscatedName("gq.c(I)V")
    public void method3800() {
        class116[] var1 = this.field2366;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class116 var3 = var1[var2];
            if (var3.field1449 >= 0) {
                var3.field1441 = this.field2366[var3.field1449];
            }
        }
    }

    @ObfuscatedName("gq.v(B)I")
    public int method3799() {
        return this.field2366.length;
    }

    @ObfuscatedName("gq.q(IB)Ldc;")
    public class116 method3792(int arg0) {
        return this.field2366[arg0];
    }

    @ObfuscatedName("gq.f(I)[Ldc;")
    public class116[] method3793() {
        return this.field2366;
    }

    @ObfuscatedName("gq.j(Lda;II)V")
    public void method3815(class123 arg0, int arg1) {
        this.method3795(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("gq.e(Lda;I[ZZI)V")
    public void method3795(class123 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2632();
        int var6 = 0;
        class116[] var7 = this.method3793();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class116 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2656(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
