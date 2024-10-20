package deob;

import java.util.Iterator;

@ObfuscatedName("jw")
public class class275 implements Iterator {

    @ObfuscatedName("jw.h")
    public class277 field3573;

    @ObfuscatedName("jw.v")
    public class185 field3574;

    @ObfuscatedName("jw.x")
    public class185 field3575 = null;

    public class275(class277 arg0) {
        this.field3573 = arg0;
        this.field3574 = this.field3573.field3580.field2130;
        this.field3575 = null;
    }

    public Object next() {
        class185 var1 = this.field3574;
        if (this.field3573.field3580 == var1) {
            var1 = null;
            this.field3574 = null;
        } else {
            this.field3574 = var1.field2130;
        }
        this.field3575 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3573.field3580 != this.field3574;
    }

    public void remove() {
        if (this.field3575 == null) {
            throw new IllegalStateException();
        }
        this.field3575.method3353();
        this.field3575 = null;
    }
}
