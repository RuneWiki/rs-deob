package deob;

import java.util.Iterator;

@ObfuscatedName("ps")
public class class397 implements Iterator {

    @ObfuscatedName("ps.ac")
    public class398 field4468;

    @ObfuscatedName("ps.al")
    public class484 field4469;

    @ObfuscatedName("ps.ak")
    public class484 field4467 = null;

    public class397(class398 arg0) {
        this.field4468 = arg0;
        this.field4469 = this.field4468.field4470.field4850;
        this.field4467 = null;
    }

    public Object next() {
        class484 var1 = this.field4469;
        if (this.field4468.field4470 == var1) {
            var1 = null;
            this.field4469 = null;
        } else {
            this.field4469 = var1.field4850;
        }
        this.field4467 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4468.field4470 != this.field4469;
    }

    public void remove() {
        if (this.field4467 == null) {
            throw new IllegalStateException();
        }
        this.field4467.method7774();
        this.field4467 = null;
    }
}
