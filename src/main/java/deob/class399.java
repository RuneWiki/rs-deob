package deob;

import java.util.Iterator;

@ObfuscatedName("py")
public class class399 implements Iterator {

    @ObfuscatedName("py.az")
    public class400 field4544;

    @ObfuscatedName("py.ah")
    public class493 field4543;

    @ObfuscatedName("py.af")
    public class493 field4542 = null;

    public class399(class400 arg0) {
        this.method6628(arg0);
    }

    @ObfuscatedName("py.az(Lpr;)V")
    public void method6628(class400 arg0) {
        this.field4544 = arg0;
        this.method6629();
    }

    @ObfuscatedName("py.ah()V")
    public void method6629() {
        this.field4543 = this.field4544 == null ? null : this.field4544.field4546.field4950;
        this.field4542 = null;
    }

    public Object next() {
        class493 var1 = this.field4543;
        if (this.field4544.field4546 == var1) {
            var1 = null;
            this.field4543 = null;
        } else {
            this.field4543 = var1.field4950;
        }
        this.field4542 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4544.field4546 != this.field4543 && this.field4543 != null;
    }

    public void remove() {
        if (this.field4542 == null) {
            throw new IllegalStateException();
        }
        this.field4542.method7855();
        this.field4542 = null;
    }
}
