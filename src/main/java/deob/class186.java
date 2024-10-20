package deob;

@ObfuscatedName("gi")
public class class186 {

    @ObfuscatedName("gi.n")
    public class198 field2992 = new class198();

    @ObfuscatedName("gi.o")
    public class198 field2991;

    public class186() {
        this.field2992.field3016 = this.field2992;
        this.field2992.field3017 = this.field2992;
    }

    @ObfuscatedName("gi.n(Lgv;)V")
    public void method3400(class198 arg0) {
        if (arg0.field3017 != null) {
            arg0.method3535();
        }
        arg0.field3017 = this.field2992.field3017;
        arg0.field3016 = this.field2992;
        arg0.field3017.field3016 = arg0;
        arg0.field3016.field3017 = arg0;
    }

    @ObfuscatedName("gi.o()Lgv;")
    public class198 method3401() {
        class198 var1 = this.field2992.field3016;
        if (this.field2992 == var1) {
            this.field2991 = null;
            return null;
        } else {
            this.field2991 = var1.field3016;
            return var1;
        }
    }

    @ObfuscatedName("gi.a()Lgv;")
    public class198 method3405() {
        class198 var1 = this.field2991;
        if (this.field2992 == var1) {
            this.field2991 = null;
            return null;
        } else {
            this.field2991 = var1.field3016;
            return var1;
        }
    }
}
