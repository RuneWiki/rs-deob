package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class192 implements Iterable {

    @ObfuscatedName("gk.e")
    public class198 field2950 = new class198();

    public class192() {
        this.field2950.field2962 = this.field2950;
        this.field2950.field2964 = this.field2950;
    }

    @ObfuscatedName("gk.e(Lgm;)V")
    public void method3415(class198 arg0) {
        if (arg0.field2964 != null) {
            arg0.method3463();
        }
        arg0.field2964 = this.field2950.field2964;
        arg0.field2962 = this.field2950;
        arg0.field2964.field2962 = arg0;
        arg0.field2962.field2964 = arg0;
    }

    @ObfuscatedName("gk.a()Lgm;")
    public class198 method3412() {
        return this.method3414((class198) null);
    }

    @ObfuscatedName("gk.l(Lgm;)Lgm;")
    public class198 method3414(class198 arg0) {
        class198 var2;
        if (arg0 == null) {
            var2 = this.field2950.field2962;
        } else {
            var2 = arg0;
        }
        return this.field2950 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class195(this);
    }
}
