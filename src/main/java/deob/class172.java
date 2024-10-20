package deob;

@ObfuscatedName("fo")
public final class class172 {

    @ObfuscatedName("fo.p")
    public class174 field2797 = new class174();

    public class172() {
        this.field2797.field2801 = this.field2797;
        this.field2797.field2800 = this.field2797;
    }

    @ObfuscatedName("fo.p(Lfu;)V")
    public void method3278(class174 arg0) {
        if (arg0.field2800 != null) {
            arg0.method3305();
        }
        arg0.field2800 = this.field2797.field2800;
        arg0.field2801 = this.field2797;
        arg0.field2800.field2801 = arg0;
        arg0.field2801.field2800 = arg0;
    }

    @ObfuscatedName("fo.e(Lfu;)V")
    public void method3279(class174 arg0) {
        if (arg0.field2800 != null) {
            arg0.method3305();
        }
        arg0.field2800 = this.field2797;
        arg0.field2801 = this.field2797.field2801;
        arg0.field2800.field2801 = arg0;
        arg0.field2801.field2800 = arg0;
    }

    @ObfuscatedName("fo.a()Lfu;")
    public class174 method3280() {
        class174 var1 = this.field2797.field2801;
        if (this.field2797 == var1) {
            return null;
        } else {
            var1.method3305();
            return var1;
        }
    }

    @ObfuscatedName("fo.h()Lfu;")
    public class174 method3281() {
        class174 var1 = this.field2797.field2801;
        return this.field2797 == var1 ? null : var1;
    }

    @ObfuscatedName("fo.y()V")
    public void method3282() {
        while (true) {
            class174 var1 = this.field2797.field2801;
            if (this.field2797 == var1) {
                return;
            }
            var1.method3305();
        }
    }
}
