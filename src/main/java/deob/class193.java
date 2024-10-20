package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public class class193 implements Iterable {

    @ObfuscatedName("gu.n")
    public class199 field3000 = new class199();

    public class193() {
        this.field3000.field3014 = this.field3000;
        this.field3000.field3012 = this.field3000;
    }

    @ObfuscatedName("gu.n(Lgn;)V")
    public void method3425(class199 arg0) {
        if (arg0.field3012 != null) {
            arg0.method3474();
        }
        arg0.field3012 = this.field3000.field3012;
        arg0.field3014 = this.field3000;
        arg0.field3012.field3014 = arg0;
        arg0.field3014.field3012 = arg0;
    }

    @ObfuscatedName("gu.w()Lgn;")
    public class199 method3426() {
        return this.method3427((class199) null);
    }

    @ObfuscatedName("gu.i(Lgn;)Lgn;")
    public class199 method3427(class199 arg0) {
        class199 var2;
        if (arg0 == null) {
            var2 = this.field3000.field3014;
        } else {
            var2 = arg0;
        }
        return this.field3000 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class196(this);
    }
}
