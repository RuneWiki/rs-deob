package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public class class203 implements Iterable {

    @ObfuscatedName("gx.w")
    public class209 field3112 = new class209();

    public class203() {
        this.field3112.field3125 = this.field3112;
        this.field3112.field3126 = this.field3112;
    }

    @ObfuscatedName("gx.w(Lhl;)V")
    public void method3626(class209 arg0) {
        if (arg0.field3126 != null) {
            arg0.method3684();
        }
        arg0.field3126 = this.field3112.field3126;
        arg0.field3125 = this.field3112;
        arg0.field3126.field3125 = arg0;
        arg0.field3125.field3126 = arg0;
    }

    @ObfuscatedName("gx.x()Lhl;")
    public class209 method3628() {
        return this.method3625((class209) null);
    }

    @ObfuscatedName("gx.t(Lhl;)Lhl;")
    public class209 method3625(class209 arg0) {
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
