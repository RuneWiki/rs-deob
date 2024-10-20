package deob;

@ObfuscatedName("ga")
public final class class186 {

    @ObfuscatedName("ga.e")
    public class196 field2428 = new class196();

    public class186() {
        this.field2428.field2456 = this.field2428;
        this.field2428.field2457 = this.field2428;
    }

    @ObfuscatedName("ga.e(Lgz;)V")
    public void method3229(class196 arg0) {
        if (arg0.field2457 != null) {
            arg0.method3380();
        }
        arg0.field2457 = this.field2428.field2457;
        arg0.field2456 = this.field2428;
        arg0.field2457.field2456 = arg0;
        arg0.field2456.field2457 = arg0;
    }

    @ObfuscatedName("ga.n(Lgz;)V")
    public void method3230(class196 arg0) {
        if (arg0.field2457 != null) {
            arg0.method3380();
        }
        arg0.field2457 = this.field2428;
        arg0.field2456 = this.field2428.field2456;
        arg0.field2457.field2456 = arg0;
        arg0.field2456.field2457 = arg0;
    }

    @ObfuscatedName("ga.g()Lgz;")
    public class196 method3234() {
        class196 var1 = this.field2428.field2456;
        if (this.field2428 == var1) {
            return null;
        } else {
            var1.method3380();
            return var1;
        }
    }

    @ObfuscatedName("ga.y()Lgz;")
    public class196 method3232() {
        class196 var1 = this.field2428.field2456;
        return this.field2428 == var1 ? null : var1;
    }

    @ObfuscatedName("ga.w()V")
    public void method3233() {
        while (true) {
            class196 var1 = this.field2428.field2456;
            if (this.field2428 == var1) {
                return;
            }
            var1.method3380();
        }
    }
}
