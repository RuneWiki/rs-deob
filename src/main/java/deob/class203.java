package deob;

import java.util.Iterator;

@ObfuscatedName("gh")
public class class203 implements Iterable {

    @ObfuscatedName("gh.s")
    public class209 field3113 = new class209();

    public class203() {
        this.field3113.field3125 = this.field3113;
        this.field3113.field3127 = this.field3113;
    }

    @ObfuscatedName("gh.s(Lhd;)V")
    public void method3590(class209 arg0) {
        if (arg0.field3127 != null) {
            arg0.method3639();
        }
        arg0.field3127 = this.field3113.field3127;
        arg0.field3125 = this.field3113;
        arg0.field3127.field3125 = arg0;
        arg0.field3125.field3127 = arg0;
    }

    @ObfuscatedName("gh.j()Lhd;")
    public class209 method3597() {
        return this.method3592((class209) null);
    }

    @ObfuscatedName("gh.p(Lhd;)Lhd;")
    public class209 method3592(class209 arg0) {
        class209 var2;
        if (arg0 == null) {
            var2 = this.field3113.field3125;
        } else {
            var2 = arg0;
        }
        return this.field3113 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
