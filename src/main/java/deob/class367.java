package deob;

import java.util.Iterator;

@ObfuscatedName("ok")
public class class367 implements Iterator {

    @ObfuscatedName("ok.af")
    public class368 field4365;

    @ObfuscatedName("ok.an")
    public class444 field4364;

    @ObfuscatedName("ok.aw")
    public class444 field4366 = null;

    public class367(class368 arg0) {
        this.field4365 = arg0;
        this.field4364 = this.field4365.field4368.field4739;
        this.field4366 = null;
    }

    public Object next() {
        class444 var1 = this.field4364;
        if (this.field4365.field4368 == var1) {
            var1 = null;
            this.field4364 = null;
        } else {
            this.field4364 = var1.field4739;
        }
        this.field4366 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4365.field4368 != this.field4364;
    }

    public void remove() {
        if (this.field4366 == null) {
            throw new IllegalStateException();
        }
        this.field4366.method7640();
        this.field4366 = null;
    }
}
