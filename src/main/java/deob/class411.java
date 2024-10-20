package deob;

import java.util.Iterator;

@ObfuscatedName("pf")
public class class411 implements Iterator {

    @ObfuscatedName("pf.aq")
    public class412 field4663;

    @ObfuscatedName("pf.ad")
    public class501 field4664;

    @ObfuscatedName("pf.ag")
    public class501 field4665 = null;

    public class411(class412 arg0) {
        this.field4663 = arg0;
        this.field4664 = this.field4663.field4667.field5077;
        this.field4665 = null;
    }

    public Object next() {
        class501 var1 = this.field4664;
        if (this.field4663.field4667 == var1) {
            var1 = null;
            this.field4664 = null;
        } else {
            this.field4664 = var1.field5077;
        }
        this.field4665 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4663.field4667 != this.field4664;
    }

    public void remove() {
        if (this.field4665 == null) {
            throw new IllegalStateException();
        }
        this.field4665.method8125();
        this.field4665 = null;
    }
}
