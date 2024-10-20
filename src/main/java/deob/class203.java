package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class203 implements Iterable {

    @ObfuscatedName("gz.j")
    public class209 field3111 = new class209();

    public class203() {
        this.field3111.field3124 = this.field3111;
        this.field3111.field3125 = this.field3111;
    }

    @ObfuscatedName("gz.j(Lhc;)V")
    public void method3581(class209 arg0) {
        if (arg0.field3125 != null) {
            arg0.method3639();
        }
        arg0.field3125 = this.field3111.field3125;
        arg0.field3124 = this.field3111;
        arg0.field3125.field3124 = arg0;
        arg0.field3124.field3125 = arg0;
    }

    @ObfuscatedName("gz.h()Lhc;")
    public class209 method3582() {
        return this.method3583((class209) null);
    }

    @ObfuscatedName("gz.m(Lhc;)Lhc;")
    public class209 method3583(class209 arg0) {
        class209 var2;
        if (arg0 == null) {
            var2 = this.field3111.field3124;
        } else {
            var2 = arg0;
        }
        return this.field3111 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
