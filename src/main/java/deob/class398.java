package deob;

import java.util.Iterator;

@ObfuscatedName("pq")
public class class398 implements Iterator {

    @ObfuscatedName("pq.am")
    public class399 field4484;

    @ObfuscatedName("pq.ap")
    public class485 field4485;

    @ObfuscatedName("pq.af")
    public class485 field4486 = null;

    public class398(class399 arg0) {
        this.field4484 = arg0;
        this.field4485 = this.field4484.field4488.field4883;
        this.field4486 = null;
    }

    public Object next() {
        class485 var1 = this.field4485;
        if (this.field4484.field4488 == var1) {
            var1 = null;
            this.field4485 = null;
        } else {
            this.field4485 = var1.field4883;
        }
        this.field4486 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4484.field4488 != this.field4485;
    }

    public void remove() {
        if (this.field4486 == null) {
            throw new IllegalStateException();
        }
        this.field4486.method7986();
        this.field4486 = null;
    }
}
