package deob;

@ObfuscatedName("gv")
public final class class185 {

    @ObfuscatedName("gv.c")
    public class195 field2414 = new class195();

    public class185() {
        this.field2414.field2442 = this.field2414;
        this.field2414.field2443 = this.field2414;
    }

    @ObfuscatedName("gv.c(Lgc;)V")
    public void method3186(class195 arg0) {
        if (arg0.field2443 != null) {
            arg0.method3320();
        }
        arg0.field2443 = this.field2414.field2443;
        arg0.field2442 = this.field2414;
        arg0.field2443.field2442 = arg0;
        arg0.field2442.field2443 = arg0;
    }

    @ObfuscatedName("gv.o(Lgc;)V")
    public void method3178(class195 arg0) {
        if (arg0.field2443 != null) {
            arg0.method3320();
        }
        arg0.field2443 = this.field2414;
        arg0.field2442 = this.field2414.field2442;
        arg0.field2443.field2442 = arg0;
        arg0.field2442.field2443 = arg0;
    }

    @ObfuscatedName("gv.i()Lgc;")
    public class195 method3174() {
        class195 var1 = this.field2414.field2442;
        if (this.field2414 == var1) {
            return null;
        } else {
            var1.method3320();
            return var1;
        }
    }

    @ObfuscatedName("gv.u()Lgc;")
    public class195 method3175() {
        class195 var1 = this.field2414.field2442;
        return this.field2414 == var1 ? null : var1;
    }

    @ObfuscatedName("gv.g()V")
    public void method3176() {
        while (true) {
            class195 var1 = this.field2414.field2442;
            if (this.field2414 == var1) {
                return;
            }
            var1.method3320();
        }
    }
}
