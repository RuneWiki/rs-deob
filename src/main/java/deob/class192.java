package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class192 implements Iterable {

    @ObfuscatedName("gm.q")
    public class198 field2945 = new class198();

    public class192() {
        this.field2945.field2959 = this.field2945;
        this.field2945.field2957 = this.field2945;
    }

    @ObfuscatedName("gm.q(Lgw;)V")
    public void method3354(class198 arg0) {
        if (arg0.field2957 != null) {
            arg0.method3404();
        }
        arg0.field2957 = this.field2945.field2957;
        arg0.field2959 = this.field2945;
        arg0.field2957.field2959 = arg0;
        arg0.field2959.field2957 = arg0;
    }

    @ObfuscatedName("gm.s()Lgw;")
    public class198 method3355() {
        return this.method3356((class198) null);
    }

    @ObfuscatedName("gm.h(Lgw;)Lgw;")
    public class198 method3356(class198 arg0) {
        class198 var2;
        if (arg0 == null) {
            var2 = this.field2945.field2959;
        } else {
            var2 = arg0;
        }
        return this.field2945 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class195(this);
    }
}
