package deob;

import java.util.Iterator;

@ObfuscatedName("jm")
public class class266 implements Iterable {

    @ObfuscatedName("jm.s")
    public class176 field3525 = new class176();

    @ObfuscatedName("jm.j")
    public class176 field3524;

    public class266() {
        this.field3525.field2088 = this.field3525;
        this.field3525.field2089 = this.field3525;
    }

    @ObfuscatedName("jm.s()V")
    public void method4558() {
        while (this.field3525.field2088 != this.field3525) {
            this.field3525.field2088.method3297();
        }
    }

    @ObfuscatedName("jm.j(Lfe;)V")
    public void method4552(class176 arg0) {
        if (arg0.field2089 != null) {
            arg0.method3297();
        }
        arg0.field2089 = this.field3525.field2089;
        arg0.field2088 = this.field3525;
        arg0.field2089.field2088 = arg0;
        arg0.field2088.field2089 = arg0;
    }

    @ObfuscatedName("jm.i(Lfe;Lfe;)V")
    public static void method4553(class176 arg0, class176 arg1) {
        if (arg0.field2089 != null) {
            arg0.method3297();
        }
        arg0.field2089 = arg1;
        arg0.field2088 = arg1.field2088;
        arg0.field2089.field2088 = arg0;
        arg0.field2088.field2089 = arg0;
    }

    @ObfuscatedName("jm.k()Lfe;")
    public class176 method4550() {
        class176 var1 = this.field3525.field2088;
        if (this.field3525 == var1) {
            return null;
        } else {
            var1.method3297();
            return var1;
        }
    }

    @ObfuscatedName("jm.u()Lfe;")
    public class176 method4555() {
        return this.method4556((class176) null);
    }

    @ObfuscatedName("jm.n(Lfe;)Lfe;")
    public class176 method4556(class176 arg0) {
        class176 var2;
        if (arg0 == null) {
            var2 = this.field3525.field2088;
        } else {
            var2 = arg0;
        }
        if (this.field3525 == var2) {
            this.field3524 = null;
            return null;
        } else {
            this.field3524 = var2.field2088;
            return var2;
        }
    }

    @ObfuscatedName("jm.t()Lfe;")
    public class176 method4557() {
        class176 var1 = this.field3524;
        if (this.field3525 == var1) {
            this.field3524 = null;
            return null;
        } else {
            this.field3524 = var1.field2088;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class264(this);
    }
}
