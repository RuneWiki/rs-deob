package deob;

import java.util.Iterator;

@ObfuscatedName("mo")
public class class356 implements Iterator {

    @ObfuscatedName("mo.h")
    public class357 field4339;

    @ObfuscatedName("mo.e")
    public class428 field4340;

    @ObfuscatedName("mo.v")
    public class428 field4341 = null;

    public class356(class357 arg0) {
        this.field4339 = arg0;
        this.field4340 = this.field4339.field4342.field4679;
        this.field4341 = null;
    }

    public Object next() {
        class428 var1 = this.field4340;
        if (this.field4339.field4342 == var1) {
            var1 = null;
            this.field4340 = null;
        } else {
            this.field4340 = var1.field4679;
        }
        this.field4341 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4339.field4342 != this.field4340;
    }

    public void remove() {
        if (this.field4341 == null) {
            throw new IllegalStateException();
        }
        this.field4341.method7225();
        this.field4341 = null;
    }
}
