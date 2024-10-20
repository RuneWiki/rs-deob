package deob;

@ObfuscatedName("gg")
public class class186 {

    @ObfuscatedName("gg.b")
    public class198 field2978 = new class198();

    @ObfuscatedName("gg.e")
    public class198 field2979;

    public class186() {
        this.field2978.field3004 = this.field2978;
        this.field2978.field3003 = this.field2978;
    }

    @ObfuscatedName("gg.b(Lgx;)V")
    public void method3277(class198 arg0) {
        if (arg0.field3003 != null) {
            arg0.method3408();
        }
        arg0.field3003 = this.field2978.field3003;
        arg0.field3004 = this.field2978;
        arg0.field3003.field3004 = arg0;
        arg0.field3004.field3003 = arg0;
    }

    @ObfuscatedName("gg.e()Lgx;")
    public class198 method3278() {
        class198 var1 = this.field2978.field3004;
        if (this.field2978 == var1) {
            this.field2979 = null;
            return null;
        } else {
            this.field2979 = var1.field3004;
            return var1;
        }
    }

    @ObfuscatedName("gg.a()Lgx;")
    public class198 method3279() {
        class198 var1 = this.field2979;
        if (this.field2978 == var1) {
            this.field2979 = null;
            return null;
        } else {
            this.field2979 = var1.field3004;
            return var1;
        }
    }
}
