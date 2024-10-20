package deob;

@ObfuscatedName("gb")
public final class class185 {

    @ObfuscatedName("gb.a")
    public class195 field2442 = new class195();

    public class185() {
        this.field2442.field2471 = this.field2442;
        this.field2442.field2470 = this.field2442;
    }

    @ObfuscatedName("gb.a(Lgn;)V")
    public void method3188(class195 arg0) {
        if (arg0.field2470 != null) {
            arg0.method3348();
        }
        arg0.field2470 = this.field2442.field2470;
        arg0.field2471 = this.field2442;
        arg0.field2470.field2471 = arg0;
        arg0.field2471.field2470 = arg0;
    }

    @ObfuscatedName("gb.j(Lgn;)V")
    public void method3189(class195 arg0) {
        if (arg0.field2470 != null) {
            arg0.method3348();
        }
        arg0.field2470 = this.field2442;
        arg0.field2471 = this.field2442.field2471;
        arg0.field2470.field2471 = arg0;
        arg0.field2471.field2470 = arg0;
    }

    @ObfuscatedName("gb.n()Lgn;")
    public class195 method3190() {
        class195 var1 = this.field2442.field2471;
        if (this.field2442 == var1) {
            return null;
        } else {
            var1.method3348();
            return var1;
        }
    }

    @ObfuscatedName("gb.r()Lgn;")
    public class195 method3191() {
        class195 var1 = this.field2442.field2471;
        return this.field2442 == var1 ? null : var1;
    }

    @ObfuscatedName("gb.v()V")
    public void method3203() {
        while (true) {
            class195 var1 = this.field2442.field2471;
            if (this.field2442 == var1) {
                return;
            }
            var1.method3348();
        }
    }
}
