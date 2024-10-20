package deob;

import java.util.Iterator;

@ObfuscatedName("pj")
public class class410 implements Iterator {

    @ObfuscatedName("pj.ak")
    public class411 field4640;

    @ObfuscatedName("pj.al")
    public class500 field4638;

    @ObfuscatedName("pj.aj")
    public class500 field4639 = null;

    public class410(class411 arg0) {
        this.field4640 = arg0;
        this.field4638 = this.field4640.field4641.field5042;
        this.field4639 = null;
    }

    public Object next() {
        class500 var1 = this.field4638;
        if (this.field4640.field4641 == var1) {
            var1 = null;
            this.field4638 = null;
        } else {
            this.field4638 = var1.field5042;
        }
        this.field4639 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4640.field4641 != this.field4638;
    }

    public void remove() {
        if (this.field4639 == null) {
            throw new IllegalStateException();
        }
        this.field4639.method8183();
        this.field4639 = null;
    }
}
