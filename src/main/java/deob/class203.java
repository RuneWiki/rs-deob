package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class203 implements Iterable {

    @ObfuscatedName("gt.a")
    public class209 field3112 = new class209();

    public class203() {
        this.field3112.field3125 = this.field3112;
        this.field3112.field3124 = this.field3112;
    }

    @ObfuscatedName("gt.a(Lha;)V")
    public void method3695(class209 arg0) {
        if (arg0.field3124 != null) {
            arg0.method3737();
        }
        arg0.field3124 = this.field3112.field3124;
        arg0.field3125 = this.field3112;
        arg0.field3124.field3125 = arg0;
        arg0.field3125.field3124 = arg0;
    }

    @ObfuscatedName("gt.w()Lha;")
    public class209 method3689() {
        return this.method3691((class209) null);
    }

    @ObfuscatedName("gt.d(Lha;)Lha;")
    public class209 method3691(class209 arg0) {
        class209 var2;
        if (arg0 == null) {
            var2 = this.field3112.field3125;
        } else {
            var2 = arg0;
        }
        return this.field3112 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
