package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class205 implements Iterator {

    @ObfuscatedName("gz.y")
    public class202 field3083;

    @ObfuscatedName("gz.d")
    public class208 field3084;

    @ObfuscatedName("gz.g")
    public class208 field3085 = null;

    public class205(class202 arg0) {
        this.field3083 = arg0;
        this.field3084 = this.field3083.field3079.field3092;
        this.field3085 = null;
    }

    public Object next() {
        class208 var1 = this.field3084;
        if (this.field3083.field3079 == var1) {
            var1 = null;
            this.field3084 = null;
        } else {
            this.field3084 = var1.field3092;
        }
        this.field3085 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3083.field3079 != this.field3084;
    }

    public void remove() {
        if (this.field3085 == null) {
            throw new IllegalStateException();
        }
        this.field3085.method3588();
        this.field3085 = null;
    }
}
