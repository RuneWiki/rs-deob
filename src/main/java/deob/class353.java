package deob;

import java.util.Iterator;

@ObfuscatedName("mz")
public class class353 implements Iterator {

    @ObfuscatedName("mz.a")
    public class354 field4285;

    @ObfuscatedName("mz.f")
    public class425 field4286;

    @ObfuscatedName("mz.c")
    public class425 field4284 = null;

    public class353(class354 arg0) {
        this.field4285 = arg0;
        this.field4286 = this.field4285.field4287.field4629;
        this.field4284 = null;
    }

    public Object next() {
        class425 var1 = this.field4286;
        if (this.field4285.field4287 == var1) {
            var1 = null;
            this.field4286 = null;
        } else {
            this.field4286 = var1.field4629;
        }
        this.field4284 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4285.field4287 != this.field4286;
    }

    public void remove() {
        if (this.field4284 == null) {
            throw new IllegalStateException();
        }
        this.field4284.method7169();
        this.field4284 = null;
    }
}
