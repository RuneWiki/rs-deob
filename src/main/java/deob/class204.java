package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class204 implements Iterator {

    @ObfuscatedName("gt.w")
    public class205 field2506;

    @ObfuscatedName("gt.o")
    public class198 field2507;

    @ObfuscatedName("gt.x")
    public class198 field2505 = null;

    public class204(class205 arg0) {
        this.field2506 = arg0;
        this.field2507 = this.field2506.field2508.field2493;
        this.field2505 = null;
    }

    public Object next() {
        class198 var1 = this.field2507;
        if (this.field2506.field2508 == var1) {
            var1 = null;
            this.field2507 = null;
        } else {
            this.field2507 = var1.field2493;
        }
        this.field2505 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2506.field2508 != this.field2507;
    }

    public void remove() {
        if (this.field2505 == null) {
            throw new IllegalStateException();
        }
        this.field2505.method3331();
        this.field2505 = null;
    }
}
