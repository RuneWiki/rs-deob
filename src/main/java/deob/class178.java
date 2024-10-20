package deob;

@ObfuscatedName("fk")
public class class178 {

    @ObfuscatedName("fk.v")
    public class190 field2885 = new class190();

    @ObfuscatedName("fk.t")
    public class190 field2884;

    public class178() {
        this.field2885.field2909 = this.field2885;
        this.field2885.field2910 = this.field2885;
    }

    @ObfuscatedName("fk.v(Lge;)V")
    public void method3261(class190 arg0) {
        if (arg0.field2910 != null) {
            arg0.method3391();
        }
        arg0.field2910 = this.field2885.field2910;
        arg0.field2909 = this.field2885;
        arg0.field2910.field2909 = arg0;
        arg0.field2909.field2910 = arg0;
    }

    @ObfuscatedName("fk.t()Lge;")
    public class190 method3255() {
        class190 var1 = this.field2885.field2909;
        if (this.field2885 == var1) {
            this.field2884 = null;
            return null;
        } else {
            this.field2884 = var1.field2909;
            return var1;
        }
    }

    @ObfuscatedName("fk.f()Lge;")
    public class190 method3253() {
        class190 var1 = this.field2884;
        if (this.field2885 == var1) {
            this.field2884 = null;
            return null;
        } else {
            this.field2884 = var1.field2909;
            return var1;
        }
    }
}
