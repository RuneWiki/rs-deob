package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public class class203 implements Iterable {

    @ObfuscatedName("gb.t")
    public class209 field3113 = new class209();

    public class203() {
        this.field3113.field3127 = this.field3113;
        this.field3113.field3125 = this.field3113;
    }

    @ObfuscatedName("gb.t(Lhe;)V")
    public void method3552(class209 arg0) {
        if (arg0.field3125 != null) {
            arg0.method3607();
        }
        arg0.field3125 = this.field3113.field3125;
        arg0.field3127 = this.field3113;
        arg0.field3125.field3127 = arg0;
        arg0.field3127.field3125 = arg0;
    }

    @ObfuscatedName("gb.i()Lhe;")
    public class209 method3556() {
        return this.method3559((class209) null);
    }

    @ObfuscatedName("gb.g(Lhe;)Lhe;")
    public class209 method3559(class209 arg0) {
        class209 var2;
        if (arg0 == null) {
            var2 = this.field3113.field3127;
        } else {
            var2 = arg0;
        }
        return this.field3113 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
