package deob;

@ObfuscatedName("gb")
public class class186 {

    @ObfuscatedName("gb.n")
    public class198 field2986 = new class198();

    @ObfuscatedName("gb.w")
    public class198 field2985;

    public class186() {
        this.field2986.field3010 = this.field2986;
        this.field2986.field3011 = this.field2986;
    }

    @ObfuscatedName("gb.n(Lgx;)V")
    public void method3335(class198 arg0) {
        if (arg0.field3011 != null) {
            arg0.method3466();
        }
        arg0.field3011 = this.field2986.field3011;
        arg0.field3010 = this.field2986;
        arg0.field3011.field3010 = arg0;
        arg0.field3010.field3011 = arg0;
    }

    @ObfuscatedName("gb.w()Lgx;")
    public class198 method3344() {
        class198 var1 = this.field2986.field3010;
        if (this.field2986 == var1) {
            this.field2985 = null;
            return null;
        } else {
            this.field2985 = var1.field3010;
            return var1;
        }
    }

    @ObfuscatedName("gb.i()Lgx;")
    public class198 method3336() {
        class198 var1 = this.field2985;
        if (this.field2986 == var1) {
            this.field2985 = null;
            return null;
        } else {
            this.field2985 = var1.field3010;
            return var1;
        }
    }
}
