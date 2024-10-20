package deob;

import java.util.Iterator;

@ObfuscatedName("pk")
public class class412 implements Iterator {

    @ObfuscatedName("pk.ab")
    public class413 field4636;

    @ObfuscatedName("pk.ay")
    public class502 field4635;

    @ObfuscatedName("pk.an")
    public class502 field4634 = null;

    public class412(class413 arg0) {
        this.field4636 = arg0;
        this.field4635 = this.field4636.field4638.field5068;
        this.field4634 = null;
    }

    public Object next() {
        class502 var1 = this.field4635;
        if (this.field4636.field4638 == var1) {
            var1 = null;
            this.field4635 = null;
        } else {
            this.field4635 = var1.field5068;
        }
        this.field4634 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4636.field4638 != this.field4635;
    }

    public void remove() {
        if (this.field4634 == null) {
            throw new IllegalStateException();
        }
        this.field4634.method8217();
        this.field4634 = null;
    }
}
