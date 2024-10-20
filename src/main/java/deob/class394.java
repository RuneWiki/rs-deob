package deob;

import java.util.Iterator;

@ObfuscatedName("ph")
public class class394 implements Iterator {

    @ObfuscatedName("ph.at")
    public class395 field4447;

    @ObfuscatedName("ph.ah")
    public class481 field4445;

    @ObfuscatedName("ph.ar")
    public class481 field4446 = null;

    public class394(class395 arg0) {
        this.field4447 = arg0;
        this.field4445 = this.field4447.field4449.field4842;
        this.field4446 = null;
    }

    public Object next() {
        class481 var1 = this.field4445;
        if (this.field4447.field4449 == var1) {
            var1 = null;
            this.field4445 = null;
        } else {
            this.field4445 = var1.field4842;
        }
        this.field4446 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4447.field4449 != this.field4445;
    }

    public void remove() {
        if (this.field4446 == null) {
            throw new IllegalStateException();
        }
        this.field4446.method7825();
        this.field4446 = null;
    }
}
