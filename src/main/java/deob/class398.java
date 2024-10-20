package deob;

import java.util.Iterator;

@ObfuscatedName("pn")
public class class398 implements Iterator {

    @ObfuscatedName("pn.aq")
    public class399 field4521;

    @ObfuscatedName("pn.aw")
    public class492 field4519;

    @ObfuscatedName("pn.al")
    public class492 field4520 = null;

    public class398(class399 arg0) {
        this.method6734(arg0);
    }

    @ObfuscatedName("pn.aq(Lpo;)V")
    public void method6734(class399 arg0) {
        this.field4521 = arg0;
        this.method6722();
    }

    @ObfuscatedName("pn.aw()V")
    public void method6722() {
        this.field4519 = this.field4521 == null ? null : this.field4521.field4523.field4918;
        this.field4520 = null;
    }

    public Object next() {
        class492 var1 = this.field4519;
        if (this.field4521.field4523 == var1) {
            var1 = null;
            this.field4519 = null;
        } else {
            this.field4519 = var1.field4918;
        }
        this.field4520 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4521.field4523 != this.field4519 && this.field4519 != null;
    }

    public void remove() {
        if (this.field4520 == null) {
            throw new IllegalStateException();
        }
        this.field4520.method7996();
        this.field4520 = null;
    }
}
