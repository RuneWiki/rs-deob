package deob;

@ObfuscatedName("gz")
public class class186 {

    @ObfuscatedName("gz.n")
    public class198 field2990 = new class198();

    @ObfuscatedName("gz.g")
    public class198 field2991;

    public class186() {
        this.field2990.field3015 = this.field2990;
        this.field2990.field3016 = this.field2990;
    }

    @ObfuscatedName("gz.n(Lgu;)V")
    public void method3421(class198 arg0) {
        if (arg0.field3016 != null) {
            arg0.method3550();
        }
        arg0.field3016 = this.field2990.field3016;
        arg0.field3015 = this.field2990;
        arg0.field3016.field3015 = arg0;
        arg0.field3015.field3016 = arg0;
    }

    @ObfuscatedName("gz.g()Lgu;")
    public class198 method3417() {
        class198 var1 = this.field2990.field3015;
        if (this.field2990 == var1) {
            this.field2991 = null;
            return null;
        } else {
            this.field2991 = var1.field3015;
            return var1;
        }
    }

    @ObfuscatedName("gz.a()Lgu;")
    public class198 method3418() {
        class198 var1 = this.field2991;
        if (this.field2990 == var1) {
            this.field2991 = null;
            return null;
        } else {
            this.field2991 = var1.field3015;
            return var1;
        }
    }
}
