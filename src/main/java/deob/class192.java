package deob;

@ObfuscatedName("gy")
public final class class192 {

    @ObfuscatedName("gy.d")
    public class202 field2541 = new class202();

    public class192() {
        this.field2541.field2569 = this.field2541;
        this.field2541.field2570 = this.field2541;
    }

    @ObfuscatedName("gy.d(Lgt;)V")
    public void method3373(class202 arg0) {
        if (arg0.field2570 != null) {
            arg0.method3514();
        }
        arg0.field2570 = this.field2541.field2570;
        arg0.field2569 = this.field2541;
        arg0.field2570.field2569 = arg0;
        arg0.field2569.field2570 = arg0;
    }

    @ObfuscatedName("gy.x(Lgt;)V")
    public void method3378(class202 arg0) {
        if (arg0.field2570 != null) {
            arg0.method3514();
        }
        arg0.field2570 = this.field2541;
        arg0.field2569 = this.field2541.field2569;
        arg0.field2570.field2569 = arg0;
        arg0.field2569.field2570 = arg0;
    }

    @ObfuscatedName("gy.k()Lgt;")
    public class202 method3375() {
        class202 var1 = this.field2541.field2569;
        if (this.field2541 == var1) {
            return null;
        } else {
            var1.method3514();
            return var1;
        }
    }

    @ObfuscatedName("gy.z()Lgt;")
    public class202 method3376() {
        class202 var1 = this.field2541.field2569;
        return this.field2541 == var1 ? null : var1;
    }

    @ObfuscatedName("gy.v()V")
    public void method3386() {
        while (true) {
            class202 var1 = this.field2541.field2569;
            if (this.field2541 == var1) {
                return;
            }
            var1.method3514();
        }
    }
}
