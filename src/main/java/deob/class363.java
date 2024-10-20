package deob;

import java.util.Iterator;

@ObfuscatedName("nn")
public class class363 implements Iterator {

    @ObfuscatedName("nn.aj")
    public class364 field4328;

    @ObfuscatedName("nn.al")
    public class439 field4329;

    @ObfuscatedName("nn.ac")
    public class439 field4327 = null;

    public class363(class364 arg0) {
        this.field4328 = arg0;
        this.field4329 = this.field4328.field4331.field4666;
        this.field4327 = null;
    }

    public Object next() {
        class439 var1 = this.field4329;
        if (this.field4328.field4331 == var1) {
            var1 = null;
            this.field4329 = null;
        } else {
            this.field4329 = var1.field4666;
        }
        this.field4327 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4328.field4331 != this.field4329;
    }

    public void remove() {
        if (this.field4327 == null) {
            throw new IllegalStateException();
        }
        this.field4327.method7331();
        this.field4327 = null;
    }
}
