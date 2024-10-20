package deob;

import java.util.Iterator;

@ObfuscatedName("nq")
public class class364 implements Iterator {

    @ObfuscatedName("nq.af")
    public class365 field4358;

    @ObfuscatedName("nq.an")
    public class449 field4359;

    @ObfuscatedName("nq.aw")
    public class449 field4357 = null;

    public class364(class365 arg0) {
        this.method6358(arg0);
    }

    @ObfuscatedName("nq.af(Loi;)V")
    public void method6358(class365 arg0) {
        this.field4358 = arg0;
        this.method6355();
    }

    @ObfuscatedName("nq.an()V")
    public void method6355() {
        this.field4359 = this.field4358 == null ? null : this.field4358.field4360.field4746;
        this.field4357 = null;
    }

    public Object next() {
        class449 var1 = this.field4359;
        if (this.field4358.field4360 == var1) {
            var1 = null;
            this.field4359 = null;
        } else {
            this.field4359 = var1.field4746;
        }
        this.field4357 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4358.field4360 != this.field4359 && this.field4359 != null;
    }

    public void remove() {
        if (this.field4357 == null) {
            throw new IllegalStateException();
        }
        this.field4357.method7651();
        this.field4357 = null;
    }
}
