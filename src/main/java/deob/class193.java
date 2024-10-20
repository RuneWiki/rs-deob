package deob;

import java.util.Iterator;

@ObfuscatedName("gn")
public class class193 implements Iterable {

    @ObfuscatedName("gn.n")
    public class199 field3006 = new class199();

    public class193() {
        this.field3006.field3019 = this.field3006;
        this.field3006.field3020 = this.field3006;
    }

    @ObfuscatedName("gn.n(Lga;)V")
    public void method3490(class199 arg0) {
        if (arg0.field3020 != null) {
            arg0.method3540();
        }
        arg0.field3020 = this.field3006.field3020;
        arg0.field3019 = this.field3006;
        arg0.field3020.field3019 = arg0;
        arg0.field3019.field3020 = arg0;
    }

    @ObfuscatedName("gn.o()Lga;")
    public class199 method3493() {
        return this.method3496((class199) null);
    }

    @ObfuscatedName("gn.a(Lga;)Lga;")
    public class199 method3496(class199 arg0) {
        class199 var2;
        if (arg0 == null) {
            var2 = this.field3006.field3019;
        } else {
            var2 = arg0;
        }
        return this.field3006 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class196(this);
    }
}
