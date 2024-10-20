package deob;

import java.util.Iterator;

@ObfuscatedName("hv")
public class class228 implements Iterable {

    @ObfuscatedName("hv.t")
    public class219 field2660 = new class219();

    @ObfuscatedName("hv.q")
    public class219 field2659;

    public class228() {
        this.field2660.field2643 = this.field2660;
        this.field2660.field2641 = this.field2660;
    }

    @ObfuscatedName("hv.t()V")
    public void method3793() {
        while (this.field2660.field2643 != this.field2660) {
            this.field2660.field2643.method3761();
        }
    }

    @ObfuscatedName("hv.q(Lhh;)V")
    public void method3794(class219 arg0) {
        if (arg0.field2641 != null) {
            arg0.method3761();
        }
        arg0.field2641 = this.field2660.field2641;
        arg0.field2643 = this.field2660;
        arg0.field2641.field2643 = arg0;
        arg0.field2643.field2641 = arg0;
    }

    @ObfuscatedName("hv.i()Lhh;")
    public class219 method3795() {
        class219 var1 = this.field2660.field2643;
        if (this.field2660 == var1) {
            return null;
        } else {
            var1.method3761();
            return var1;
        }
    }

    @ObfuscatedName("hv.a()Lhh;")
    public class219 method3796() {
        return this.method3797((class219) null);
    }

    @ObfuscatedName("hv.l(Lhh;)Lhh;")
    public class219 method3797(class219 arg0) {
        class219 var2;
        if (arg0 == null) {
            var2 = this.field2660.field2643;
        } else {
            var2 = arg0;
        }
        if (this.field2660 == var2) {
            this.field2659 = null;
            return null;
        } else {
            this.field2659 = var2.field2643;
            return var2;
        }
    }

    @ObfuscatedName("hv.b()Lhh;")
    public class219 method3813() {
        class219 var1 = this.field2659;
        if (this.field2660 == var1) {
            this.field2659 = null;
            return null;
        } else {
            this.field2659 = var1.field2643;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class227(this);
    }
}
