package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class193 implements Iterable {

    @ObfuscatedName("gq.n")
    public class199 field3005 = new class199();

    public class193() {
        this.field3005.field3017 = this.field3005;
        this.field3005.field3019 = this.field3005;
    }

    @ObfuscatedName("gq.n(Lgg;)V")
    public void method3505(class199 arg0) {
        if (arg0.field3019 != null) {
            arg0.method3554();
        }
        arg0.field3019 = this.field3005.field3019;
        arg0.field3017 = this.field3005;
        arg0.field3019.field3017 = arg0;
        arg0.field3017.field3019 = arg0;
    }

    @ObfuscatedName("gq.g()Lgg;")
    public class199 method3506() {
        return this.method3508((class199) null);
    }

    @ObfuscatedName("gq.a(Lgg;)Lgg;")
    public class199 method3508(class199 arg0) {
        class199 var2;
        if (arg0 == null) {
            var2 = this.field3005.field3017;
        } else {
            var2 = arg0;
        }
        return this.field3005 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class196(this);
    }
}
