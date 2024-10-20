package deob;

import java.util.Iterator;

@ObfuscatedName("gv")
public class class203 implements Iterable {

    @ObfuscatedName("gv.b")
    public class209 field3102 = new class209();

    public class203() {
        this.field3102.field3115 = this.field3102;
        this.field3102.field3116 = this.field3102;
    }

    @ObfuscatedName("gv.b(Lhk;)V")
    public void method3594(class209 arg0) {
        if (arg0.field3116 != null) {
            arg0.method3647();
        }
        arg0.field3116 = this.field3102.field3116;
        arg0.field3115 = this.field3102;
        arg0.field3116.field3115 = arg0;
        arg0.field3115.field3116 = arg0;
    }

    @ObfuscatedName("gv.g()Lhk;")
    public class209 method3595() {
        return this.method3599((class209) null);
    }

    @ObfuscatedName("gv.j(Lhk;)Lhk;")
    public class209 method3599(class209 arg0) {
        class209 var2;
        if (arg0 == null) {
            var2 = this.field3102.field3115;
        } else {
            var2 = arg0;
        }
        return this.field3102 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
