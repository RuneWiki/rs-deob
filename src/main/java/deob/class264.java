package deob;

import java.util.Iterator;

@ObfuscatedName("jw")
public class class264 implements Iterator {

    @ObfuscatedName("jw.u")
    public class266 field3543;

    @ObfuscatedName("jw.f")
    public class176 field3544;

    @ObfuscatedName("jw.b")
    public class176 field3545 = null;

    public class264(class266 arg0) {
        this.field3543 = arg0;
        this.field3544 = this.field3543.field3549.field2119;
        this.field3545 = null;
    }

    public Object next() {
        class176 var1 = this.field3544;
        if (this.field3543.field3549 == var1) {
            var1 = null;
            this.field3544 = null;
        } else {
            this.field3544 = var1.field2119;
        }
        this.field3545 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3543.field3549 != this.field3544;
    }

    public void remove() {
        if (this.field3545 == null) {
            throw new IllegalStateException();
        }
        this.field3545.method3319();
        this.field3545 = null;
    }
}
