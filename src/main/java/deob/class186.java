package deob;

@ObfuscatedName("gd")
public final class class186 {

    @ObfuscatedName("gd.i")
    public class196 field2450 = new class196();

    public class186() {
        this.field2450.field2478 = this.field2450;
        this.field2450.field2479 = this.field2450;
    }

    @ObfuscatedName("gd.i(Lgo;)V")
    public void method3308(class196 arg0) {
        if (arg0.field2479 != null) {
            arg0.method3445();
        }
        arg0.field2479 = this.field2450.field2479;
        arg0.field2478 = this.field2450;
        arg0.field2479.field2478 = arg0;
        arg0.field2478.field2479 = arg0;
    }

    @ObfuscatedName("gd.j(Lgo;)V")
    public void method3303(class196 arg0) {
        if (arg0.field2479 != null) {
            arg0.method3445();
        }
        arg0.field2479 = this.field2450;
        arg0.field2478 = this.field2450.field2478;
        arg0.field2479.field2478 = arg0;
        arg0.field2478.field2479 = arg0;
    }

    @ObfuscatedName("gd.a()Lgo;")
    public class196 method3304() {
        class196 var1 = this.field2450.field2478;
        if (this.field2450 == var1) {
            return null;
        } else {
            var1.method3445();
            return var1;
        }
    }

    @ObfuscatedName("gd.r()Lgo;")
    public class196 method3312() {
        class196 var1 = this.field2450.field2478;
        return this.field2450 == var1 ? null : var1;
    }

    @ObfuscatedName("gd.o()V")
    public void method3306() {
        while (true) {
            class196 var1 = this.field2450.field2478;
            if (this.field2450 == var1) {
                return;
            }
            var1.method3445();
        }
    }
}
