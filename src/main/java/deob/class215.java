package deob;

import java.util.Iterator;

@ObfuscatedName("hc")
public class class215 implements Iterator {

    @ObfuscatedName("hc.z")
    public class216 field2443;

    @ObfuscatedName("hc.w")
    public class207 field2442;

    @ObfuscatedName("hc.s")
    public class207 field2444 = null;

    public class215(class216 arg0) {
        this.field2443 = arg0;
        this.field2442 = this.field2443.field2446.field2427;
        this.field2444 = null;
    }

    public Object next() {
        class207 var1 = this.field2442;
        if (this.field2443.field2446 == var1) {
            var1 = null;
            this.field2442 = null;
        } else {
            this.field2442 = var1.field2427;
        }
        this.field2444 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2443.field2446 != this.field2442;
    }

    public void remove() {
        if (this.field2444 == null) {
            throw new IllegalStateException();
        }
        this.field2444.method3793();
        this.field2444 = null;
    }
}
