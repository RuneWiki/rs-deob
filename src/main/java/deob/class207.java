package deob;

@ObfuscatedName("gi")
public final class class207 {

    @ObfuscatedName("gi.o")
    public class219 field2624 = new class219();

    public class207() {
        this.field2624.field2658 = this.field2624;
        this.field2624.field2657 = this.field2624;
    }

    @ObfuscatedName("gi.o(Lht;)V")
    public void method3558(class219 arg0) {
        if (arg0.field2657 != null) {
            arg0.method3721();
        }
        arg0.field2657 = this.field2624.field2657;
        arg0.field2658 = this.field2624;
        arg0.field2657.field2658 = arg0;
        arg0.field2658.field2657 = arg0;
    }

    @ObfuscatedName("gi.k(Lht;)V")
    public void method3544(class219 arg0) {
        if (arg0.field2657 != null) {
            arg0.method3721();
        }
        arg0.field2657 = this.field2624;
        arg0.field2658 = this.field2624.field2658;
        arg0.field2657.field2658 = arg0;
        arg0.field2658.field2657 = arg0;
    }

    @ObfuscatedName("gi.t(Lht;Lht;)V")
    public static void method3541(class219 arg0, class219 arg1) {
        if (arg0.field2657 != null) {
            arg0.method3721();
        }
        arg0.field2657 = arg1;
        arg0.field2658 = arg1.field2658;
        arg0.field2657.field2658 = arg0;
        arg0.field2658.field2657 = arg0;
    }

    @ObfuscatedName("gi.d()Lht;")
    public class219 method3542() {
        class219 var1 = this.field2624.field2658;
        if (this.field2624 == var1) {
            return null;
        } else {
            var1.method3721();
            return var1;
        }
    }

    @ObfuscatedName("gi.h()Lht;")
    public class219 method3555() {
        class219 var1 = this.field2624.field2658;
        return this.field2624 == var1 ? null : var1;
    }

    @ObfuscatedName("gi.m()V")
    public void method3546() {
        while (true) {
            class219 var1 = this.field2624.field2658;
            if (this.field2624 == var1) {
                return;
            }
            var1.method3721();
        }
    }
}
