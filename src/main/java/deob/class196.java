package deob;

@ObfuscatedName("gn")
public class class196 {

    @ObfuscatedName("gn.i")
    public class197 field2487 = new class197();

    @ObfuscatedName("gn.c")
    public class197 field2488;

    public class196() {
        this.field2487.field2490 = this.field2487;
        this.field2487.field2489 = this.field2487;
    }

    @ObfuscatedName("gn.i(Lgj;)V")
    public void method3326(class197 arg0) {
        if (arg0.field2489 != null) {
            arg0.method3333();
        }
        arg0.field2489 = this.field2487.field2489;
        arg0.field2490 = this.field2487;
        arg0.field2489.field2490 = arg0;
        arg0.field2490.field2489 = arg0;
    }

    @ObfuscatedName("gn.c()Lgj;")
    public class197 method3321() {
        class197 var1 = this.field2487.field2490;
        if (this.field2487 == var1) {
            this.field2488 = null;
            return null;
        } else {
            this.field2488 = var1.field2490;
            return var1;
        }
    }

    @ObfuscatedName("gn.e()Lgj;")
    public class197 method3323() {
        class197 var1 = this.field2488;
        if (this.field2487 == var1) {
            this.field2488 = null;
            return null;
        } else {
            this.field2488 = var1.field2490;
            return var1;
        }
    }
}
