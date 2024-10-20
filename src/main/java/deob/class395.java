package deob;

import java.util.Iterator;

@ObfuscatedName("pa")
public class class395 implements Iterator {

    @ObfuscatedName("pa.am")
    public class396 field4478;

    @ObfuscatedName("pa.ap")
    public class489 field4477;

    @ObfuscatedName("pa.af")
    public class489 field4479 = null;

    public class395(class396 arg0) {
        this.method6702(arg0);
    }

    @ObfuscatedName("pa.am(Lph;)V")
    public void method6702(class396 arg0) {
        this.field4478 = arg0;
        this.method6697();
    }

    @ObfuscatedName("pa.ap()V")
    public void method6697() {
        this.field4477 = this.field4478 == null ? null : this.field4478.field4481.field4888;
        this.field4479 = null;
    }

    public Object next() {
        class489 var1 = this.field4477;
        if (this.field4478.field4481 == var1) {
            var1 = null;
            this.field4477 = null;
        } else {
            this.field4477 = var1.field4888;
        }
        this.field4479 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4478.field4481 != this.field4477 && this.field4477 != null;
    }

    public void remove() {
        if (this.field4479 == null) {
            throw new IllegalStateException();
        }
        this.field4479.method7988();
        this.field4479 = null;
    }
}
