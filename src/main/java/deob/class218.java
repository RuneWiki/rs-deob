package deob;

import java.util.Iterator;

@ObfuscatedName("hw")
public class class218 implements Iterable {

    @ObfuscatedName("hw.f")
    public class209 field2509 = new class209();

    @ObfuscatedName("hw.h")
    public class209 field2508;

    public class218() {
        this.field2509.field2491 = this.field2509;
        this.field2509.field2492 = this.field2509;
    }

    @ObfuscatedName("hw.f()V")
    public void method3884() {
        while (this.field2509.field2491 != this.field2509) {
            this.field2509.field2491.method3845();
        }
    }

    @ObfuscatedName("hw.h(Lhp;)V")
    public void method3878(class209 arg0) {
        if (arg0.field2492 != null) {
            arg0.method3845();
        }
        arg0.field2492 = this.field2509.field2492;
        arg0.field2491 = this.field2509;
        arg0.field2492.field2491 = arg0;
        arg0.field2491.field2492 = arg0;
    }

    @ObfuscatedName("hw.e()Lhp;")
    public class209 method3877() {
        class209 var1 = this.field2509.field2491;
        if (this.field2509 == var1) {
            return null;
        } else {
            var1.method3845();
            return var1;
        }
    }

    @ObfuscatedName("hw.b()Lhp;")
    public class209 method3879() {
        return this.method3880((class209) null);
    }

    @ObfuscatedName("hw.l(Lhp;)Lhp;")
    public class209 method3880(class209 arg0) {
        class209 var2;
        if (arg0 == null) {
            var2 = this.field2509.field2491;
        } else {
            var2 = arg0;
        }
        if (this.field2509 == var2) {
            this.field2508 = null;
            return null;
        } else {
            this.field2508 = var2.field2491;
            return var2;
        }
    }

    @ObfuscatedName("hw.w()Lhp;")
    public class209 method3881() {
        class209 var1 = this.field2508;
        if (this.field2509 == var1) {
            this.field2508 = null;
            return null;
        } else {
            this.field2508 = var1.field2491;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class217(this);
    }
}
