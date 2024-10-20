package deob;

import java.util.Iterator;

@ObfuscatedName("jb")
public class class275 implements Iterator {

    @ObfuscatedName("jb.f")
    public class277 field3563;

    @ObfuscatedName("jb.b")
    public class185 field3562;

    @ObfuscatedName("jb.l")
    public class185 field3561 = null;

    public class275(class277 arg0) {
        this.field3563 = arg0;
        this.field3562 = this.field3563.field3568.field2133;
        this.field3561 = null;
    }

    public Object next() {
        class185 var1 = this.field3562;
        if (this.field3563.field3568 == var1) {
            var1 = null;
            this.field3562 = null;
        } else {
            this.field3562 = var1.field2133;
        }
        this.field3561 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3563.field3568 != this.field3562;
    }

    public void remove() {
        if (this.field3561 == null) {
            throw new IllegalStateException();
        }
        this.field3561.method3400();
        this.field3561 = null;
    }
}
