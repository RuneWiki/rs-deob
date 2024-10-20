package deob;

import java.util.Iterator;

@ObfuscatedName("pm")
public class class399 implements Iterable {

    @ObfuscatedName("pm.am")
    public class485 field4488 = new class485();

    @ObfuscatedName("pm.ap")
    public class485 field4487;

    public class399() {
        this.field4488.field4883 = this.field4488;
        this.field4488.field4882 = this.field4488;
    }

    @ObfuscatedName("pm.am()V")
    public void method6805() {
        while (this.field4488.field4883 != this.field4488) {
            this.field4488.field4883.method7986();
        }
    }

    @ObfuscatedName("pm.ap(Lsc;)V")
    public void method6815(class485 arg0) {
        if (arg0.field4882 != null) {
            arg0.method7986();
        }
        arg0.field4882 = this.field4488.field4882;
        arg0.field4883 = this.field4488;
        arg0.field4882.field4883 = arg0;
        arg0.field4883.field4882 = arg0;
    }

    @ObfuscatedName("pm.af(Lsc;Lsc;)V")
    public static void method6802(class485 arg0, class485 arg1) {
        if (arg0.field4882 != null) {
            arg0.method7986();
        }
        arg0.field4882 = arg1;
        arg0.field4883 = arg1.field4883;
        arg0.field4882.field4883 = arg0;
        arg0.field4883.field4882 = arg0;
    }

    @ObfuscatedName("pm.aj()Lsc;")
    public class485 method6806() {
        class485 var1 = this.field4488.field4883;
        if (this.field4488 == var1) {
            return null;
        } else {
            var1.method7986();
            return var1;
        }
    }

    @ObfuscatedName("pm.aq()Lsc;")
    public class485 method6823() {
        return this.method6820((class485) null);
    }

    @ObfuscatedName("pm.ar(Lsc;)Lsc;")
    public class485 method6820(class485 arg0) {
        class485 var2;
        if (arg0 == null) {
            var2 = this.field4488.field4883;
        } else {
            var2 = arg0;
        }
        if (this.field4488 == var2) {
            this.field4487 = null;
            return null;
        } else {
            this.field4487 = var2.field4883;
            return var2;
        }
    }

    @ObfuscatedName("pm.ag()Lsc;")
    public class485 method6808() {
        class485 var1 = this.field4487;
        if (this.field4488 == var1) {
            this.field4487 = null;
            return null;
        } else {
            this.field4487 = var1.field4883;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class398(this);
    }
}
