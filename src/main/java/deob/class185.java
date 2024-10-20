package deob;

@ObfuscatedName("gi")
public final class class185 {

    @ObfuscatedName("gi.i")
    public class195 field2443 = new class195();

    public class185() {
        this.field2443.field2472 = this.field2443;
        this.field2443.field2471 = this.field2443;
    }

    @ObfuscatedName("gi.i(Lga;)V")
    public void method3255(class195 arg0) {
        if (arg0.field2471 != null) {
            arg0.method3403();
        }
        arg0.field2471 = this.field2443.field2471;
        arg0.field2472 = this.field2443;
        arg0.field2471.field2472 = arg0;
        arg0.field2472.field2471 = arg0;
    }

    @ObfuscatedName("gi.h(Lga;)V")
    public void method3256(class195 arg0) {
        if (arg0.field2471 != null) {
            arg0.method3403();
        }
        arg0.field2471 = this.field2443;
        arg0.field2472 = this.field2443.field2472;
        arg0.field2471.field2472 = arg0;
        arg0.field2472.field2471 = arg0;
    }

    @ObfuscatedName("gi.u()Lga;")
    public class195 method3257() {
        class195 var1 = this.field2443.field2472;
        if (this.field2443 == var1) {
            return null;
        } else {
            var1.method3403();
            return var1;
        }
    }

    @ObfuscatedName("gi.q()Lga;")
    public class195 method3258() {
        class195 var1 = this.field2443.field2472;
        return this.field2443 == var1 ? null : var1;
    }

    @ObfuscatedName("gi.g()V")
    public void method3259() {
        while (true) {
            class195 var1 = this.field2443.field2472;
            if (this.field2443 == var1) {
                return;
            }
            var1.method3403();
        }
    }
}
