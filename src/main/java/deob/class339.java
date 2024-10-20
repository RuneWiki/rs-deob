package deob;

import java.util.Iterator;

@ObfuscatedName("ms")
public class class339 implements Iterator {

    @ObfuscatedName("ms.v")
    public class340 field4093;

    @ObfuscatedName("ms.c")
    public class404 field4091;

    @ObfuscatedName("ms.i")
    public class404 field4092 = null;

    public class339(class340 arg0) {
        this.field4093 = arg0;
        this.field4091 = this.field4093.field4094.field4403;
        this.field4092 = null;
    }

    public Object next() {
        class404 var1 = this.field4091;
        if (this.field4093.field4094 == var1) {
            var1 = null;
            this.field4091 = null;
        } else {
            this.field4091 = var1.field4403;
        }
        this.field4092 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4093.field4094 != this.field4091;
    }

    public void remove() {
        if (this.field4092 == null) {
            throw new IllegalStateException();
        }
        this.field4092.method6500();
        this.field4092 = null;
    }
}
