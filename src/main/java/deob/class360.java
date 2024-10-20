package deob;

import java.util.Iterator;

@ObfuscatedName("mj")
public class class360 implements Iterator {

    @ObfuscatedName("mj.f")
    public class361 field4354;

    @ObfuscatedName("mj.w")
    public class435 field4353;

    @ObfuscatedName("mj.v")
    public class435 field4355 = null;

    public class360(class361 arg0) {
        this.field4354 = arg0;
        this.field4353 = this.field4354.field4356.field4702;
        this.field4355 = null;
    }

    public Object next() {
        class435 var1 = this.field4353;
        if (this.field4354.field4356 == var1) {
            var1 = null;
            this.field4353 = null;
        } else {
            this.field4353 = var1.field4702;
        }
        this.field4355 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4354.field4356 != this.field4353;
    }

    public void remove() {
        if (this.field4355 == null) {
            throw new IllegalStateException();
        }
        this.field4355.method7429();
        this.field4355 = null;
    }
}
