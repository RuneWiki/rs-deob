package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class202 implements Iterable {

    @ObfuscatedName("gg.v")
    public class208 field3102 = new class208();

    public class202() {
        this.field3102.field3116 = this.field3102;
        this.field3102.field3114 = this.field3102;
    }

    @ObfuscatedName("gg.v(Lgq;)V")
    public void method3606(class208 arg0) {
        if (arg0.field3114 != null) {
            arg0.method3645();
        }
        arg0.field3114 = this.field3102.field3114;
        arg0.field3116 = this.field3102;
        arg0.field3114.field3116 = arg0;
        arg0.field3116.field3114 = arg0;
    }

    @ObfuscatedName("gg.f()Lgq;")
    public class208 method3598() {
        return this.method3595((class208) null);
    }

    @ObfuscatedName("gg.i(Lgq;)Lgq;")
    public class208 method3595(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3102.field3116;
        } else {
            var2 = arg0;
        }
        return this.field3102 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
