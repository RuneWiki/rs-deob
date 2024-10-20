package deob;

@ObfuscatedName("gf")
public class class186 {

    @ObfuscatedName("gf.o")
    public class198 field2986 = new class198();

    @ObfuscatedName("gf.l")
    public class198 field2987;

    public class186() {
        this.field2986.field3012 = this.field2986;
        this.field2986.field3011 = this.field2986;
    }

    @ObfuscatedName("gf.o(Lgn;)V")
    public void method3423(class198 arg0) {
        if (arg0.field3011 != null) {
            arg0.method3562();
        }
        arg0.field3011 = this.field2986.field3011;
        arg0.field3012 = this.field2986;
        arg0.field3011.field3012 = arg0;
        arg0.field3012.field3011 = arg0;
    }

    @ObfuscatedName("gf.l()Lgn;")
    public class198 method3424() {
        class198 var1 = this.field2986.field3012;
        if (this.field2986 == var1) {
            this.field2987 = null;
            return null;
        } else {
            this.field2987 = var1.field3012;
            return var1;
        }
    }

    @ObfuscatedName("gf.g()Lgn;")
    public class198 method3422() {
        class198 var1 = this.field2987;
        if (this.field2986 == var1) {
            this.field2987 = null;
            return null;
        } else {
            this.field2987 = var1.field3012;
            return var1;
        }
    }
}
