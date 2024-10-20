package deob;

import java.util.Iterator;

@ObfuscatedName("ou")
public class class383 implements Iterable {

    @ObfuscatedName("ou.au")
    public class469 field4422 = new class469();

    @ObfuscatedName("ou.ae")
    public class469 field4421;

    public class383() {
        this.field4422.field4807 = this.field4422;
        this.field4422.field4808 = this.field4422;
    }

    @ObfuscatedName("ou.au()V")
    public void method6557() {
        while (this.field4422.field4807 != this.field4422) {
            this.field4422.field4807.method7697();
        }
    }

    @ObfuscatedName("ou.ae(Lsq;)V")
    public void method6532(class469 arg0) {
        if (arg0.field4808 != null) {
            arg0.method7697();
        }
        arg0.field4808 = this.field4422.field4808;
        arg0.field4807 = this.field4422;
        arg0.field4808.field4807 = arg0;
        arg0.field4807.field4808 = arg0;
    }

    @ObfuscatedName("ou.ao(Lsq;Lsq;)V")
    public static void method6533(class469 arg0, class469 arg1) {
        if (arg0.field4808 != null) {
            arg0.method7697();
        }
        arg0.field4808 = arg1;
        arg0.field4807 = arg1.field4807;
        arg0.field4808.field4807 = arg0;
        arg0.field4807.field4808 = arg0;
    }

    @ObfuscatedName("ou.at()Lsq;")
    public class469 method6534() {
        class469 var1 = this.field4422.field4807;
        if (this.field4422 == var1) {
            return null;
        } else {
            var1.method7697();
            return var1;
        }
    }

    @ObfuscatedName("ou.ac()Lsq;")
    public class469 method6535() {
        return this.method6536((class469) null);
    }

    @ObfuscatedName("ou.ai(Lsq;)Lsq;")
    public class469 method6536(class469 arg0) {
        class469 var2;
        if (arg0 == null) {
            var2 = this.field4422.field4807;
        } else {
            var2 = arg0;
        }
        if (this.field4422 == var2) {
            this.field4421 = null;
            return null;
        } else {
            this.field4421 = var2.field4807;
            return var2;
        }
    }

    @ObfuscatedName("ou.az()Lsq;")
    public class469 method6541() {
        class469 var1 = this.field4421;
        if (this.field4422 == var1) {
            this.field4421 = null;
            return null;
        } else {
            this.field4421 = var1.field4807;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class382(this);
    }
}
