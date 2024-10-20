package deob;

import java.util.Iterator;

@ObfuscatedName("ol")
public class class382 implements Iterator {

    @ObfuscatedName("ol.au")
    public class383 field4418;

    @ObfuscatedName("ol.ae")
    public class469 field4419;

    @ObfuscatedName("ol.ao")
    public class469 field4420 = null;

    public class382(class383 arg0) {
        this.field4418 = arg0;
        this.field4419 = this.field4418.field4422.field4807;
        this.field4420 = null;
    }

    public Object next() {
        class469 var1 = this.field4419;
        if (this.field4418.field4422 == var1) {
            var1 = null;
            this.field4419 = null;
        } else {
            this.field4419 = var1.field4807;
        }
        this.field4420 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4418.field4422 != this.field4419;
    }

    public void remove() {
        if (this.field4420 == null) {
            throw new IllegalStateException();
        }
        this.field4420.method7697();
        this.field4420 = null;
    }
}
