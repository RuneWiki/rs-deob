package deob;

import java.util.Iterator;

@ObfuscatedName("jf")
public class class277 implements Iterable {

    @ObfuscatedName("jf.h")
    public class185 field3580 = new class185();

    @ObfuscatedName("jf.v")
    public class185 field3579;

    public class277() {
        this.field3580.field2130 = this.field3580;
        this.field3580.field2129 = this.field3580;
    }

    @ObfuscatedName("jf.h()V")
    public void method4629() {
        while (this.field3580.field2130 != this.field3580) {
            this.field3580.field2130.method3353();
        }
    }

    @ObfuscatedName("jf.v(Lgj;)V")
    public void method4624(class185 arg0) {
        if (arg0.field2129 != null) {
            arg0.method3353();
        }
        arg0.field2129 = this.field3580.field2129;
        arg0.field2130 = this.field3580;
        arg0.field2129.field2130 = arg0;
        arg0.field2130.field2129 = arg0;
    }

    @ObfuscatedName("jf.x(Lgj;Lgj;)V")
    public static void method4604(class185 arg0, class185 arg1) {
        if (arg0.field2129 != null) {
            arg0.method3353();
        }
        arg0.field2129 = arg1;
        arg0.field2130 = arg1.field2130;
        arg0.field2129.field2130 = arg0;
        arg0.field2130.field2129 = arg0;
    }

    @ObfuscatedName("jf.w()Lgj;")
    public class185 method4605() {
        class185 var1 = this.field3580.field2130;
        if (this.field3580 == var1) {
            return null;
        } else {
            var1.method3353();
            return var1;
        }
    }

    @ObfuscatedName("jf.t()Lgj;")
    public class185 method4606() {
        return this.method4608((class185) null);
    }

    @ObfuscatedName("jf.j(Lgj;)Lgj;")
    public class185 method4608(class185 arg0) {
        class185 var2;
        if (arg0 == null) {
            var2 = this.field3580.field2130;
        } else {
            var2 = arg0;
        }
        if (this.field3580 == var2) {
            this.field3579 = null;
            return null;
        } else {
            this.field3579 = var2.field2130;
            return var2;
        }
    }

    @ObfuscatedName("jf.n()Lgj;")
    public class185 method4630() {
        class185 var1 = this.field3579;
        if (this.field3580 == var1) {
            this.field3579 = null;
            return null;
        } else {
            this.field3579 = var1.field2130;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class275(this);
    }
}
