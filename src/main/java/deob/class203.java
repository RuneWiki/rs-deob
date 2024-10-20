package deob;

import java.util.Iterator;

@ObfuscatedName("ge")
public class class203 implements Iterable {

    @ObfuscatedName("ge.e")
    public class209 field3103 = new class209();

    public class203() {
        this.field3103.field3115 = this.field3103;
        this.field3103.field3117 = this.field3103;
    }

    @ObfuscatedName("ge.e(Lhd;)V")
    public void method3584(class209 arg0) {
        if (arg0.field3117 != null) {
            arg0.method3632();
        }
        arg0.field3117 = this.field3103.field3117;
        arg0.field3115 = this.field3103;
        arg0.field3117.field3115 = arg0;
        arg0.field3115.field3117 = arg0;
    }

    @ObfuscatedName("ge.w()Lhd;")
    public class209 method3585() {
        return this.method3586((class209) null);
    }

    @ObfuscatedName("ge.f(Lhd;)Lhd;")
    public class209 method3586(class209 arg0) {
        class209 var2;
        if (arg0 == null) {
            var2 = this.field3103.field3115;
        } else {
            var2 = arg0;
        }
        return this.field3103 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
