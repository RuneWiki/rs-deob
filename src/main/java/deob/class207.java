package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class207 implements Iterator {

    @ObfuscatedName("gg.a")
    public class211 field2492;

    @ObfuscatedName("gg.s")
    public class212 field2493;

    @ObfuscatedName("gg.g")
    public class212 field2491 = null;

    public class207(class211 arg0) {
        this.field2492 = arg0;
        this.field2493 = this.field2492.field2508.field2511;
        this.field2491 = null;
    }

    public Object next() {
        class212 var1 = this.field2493;
        if (this.field2492.field2508 == var1) {
            var1 = null;
            this.field2493 = null;
        } else {
            this.field2493 = var1.field2511;
        }
        this.field2491 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2492.field2508 != this.field2493;
    }

    public void remove() {
        if (this.field2491 == null) {
            throw new IllegalStateException();
        }
        this.field2491.method3960();
        this.field2491 = null;
    }
}
