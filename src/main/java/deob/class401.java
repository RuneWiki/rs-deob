package deob;

import java.util.Iterator;

@ObfuscatedName("pq")
public class class401 implements Iterator {

    @ObfuscatedName("pq.aq")
    public class402 field4527;

    @ObfuscatedName("pq.aw")
    public class488 field4526;

    @ObfuscatedName("pq.al")
    public class488 field4528 = null;

    public class401(class402 arg0) {
        this.field4527 = arg0;
        this.field4526 = this.field4527.field4529.field4913;
        this.field4528 = null;
    }

    public Object next() {
        class488 var1 = this.field4526;
        if (this.field4527.field4529 == var1) {
            var1 = null;
            this.field4526 = null;
        } else {
            this.field4526 = var1.field4913;
        }
        this.field4528 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4527.field4529 != this.field4526;
    }

    public void remove() {
        if (this.field4528 == null) {
            throw new IllegalStateException();
        }
        this.field4528.method7989();
        this.field4528 = null;
    }
}
