package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public class class197 implements Iterator {

    @ObfuscatedName("gd.b")
    public class191 field3002;

    @ObfuscatedName("gd.e")
    public class195 field3000;

    @ObfuscatedName("gd.a")
    public class195 field3001 = null;

    public class197(class191 arg0) {
        this.field3002 = arg0;
        this.field3000 = this.field3002.field2991.field2996;
        this.field3001 = null;
    }

    public Object next() {
        class195 var1 = this.field3000;
        if (this.field3002.field2991 == var1) {
            var1 = null;
            this.field3000 = null;
        } else {
            this.field3000 = var1.field2996;
        }
        this.field3001 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3002.field2991 != this.field3000;
    }

    public void remove() {
        if (this.field3001 == null) {
            throw new IllegalStateException();
        }
        this.field3001.method3396();
        this.field3001 = null;
    }
}
