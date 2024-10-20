package deob;

import java.util.Iterator;

@ObfuscatedName("jc")
public class class277 implements Iterable {

    @ObfuscatedName("jc.m")
    public class181 field3614 = new class181();

    @ObfuscatedName("jc.f")
    public class181 field3615;

    public class277() {
        this.field3614.field2132 = this.field3614;
        this.field3614.field2131 = this.field3614;
    }

    @ObfuscatedName("jc.m()V")
    public void method4917() {
        while (this.field3614.field2132 != this.field3614) {
            this.field3614.field2132.method3294();
        }
    }

    @ObfuscatedName("jc.f(Lfn;)V")
    public void method4918(class181 arg0) {
        if (arg0.field2131 != null) {
            arg0.method3294();
        }
        arg0.field2131 = this.field3614.field2131;
        arg0.field2132 = this.field3614;
        arg0.field2131.field2132 = arg0;
        arg0.field2132.field2131 = arg0;
    }

    @ObfuscatedName("jc.q()Lfn;")
    public class181 method4919() {
        class181 var1 = this.field3614.field2132;
        if (this.field3614 == var1) {
            return null;
        } else {
            var1.method3294();
            return var1;
        }
    }

    @ObfuscatedName("jc.w()Lfn;")
    public class181 method4928() {
        return this.method4925((class181) null);
    }

    @ObfuscatedName("jc.o(Lfn;)Lfn;")
    public class181 method4925(class181 arg0) {
        class181 var2;
        if (arg0 == null) {
            var2 = this.field3614.field2132;
        } else {
            var2 = arg0;
        }
        if (this.field3614 == var2) {
            this.field3615 = null;
            return null;
        } else {
            this.field3615 = var2.field2132;
            return var2;
        }
    }

    @ObfuscatedName("jc.u()Lfn;")
    public class181 method4916() {
        class181 var1 = this.field3615;
        if (this.field3614 == var1) {
            this.field3615 = null;
            return null;
        } else {
            this.field3615 = var1.field2132;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class275(this);
    }
}
