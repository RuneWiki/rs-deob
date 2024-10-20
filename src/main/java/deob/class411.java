package deob;

import java.util.Iterator;

@ObfuscatedName("pa")
public class class411 implements Iterator {

    @ObfuscatedName("pa.ac")
    public class412 field4680;

    @ObfuscatedName("pa.ae")
    public class508 field4678;

    @ObfuscatedName("pa.ag")
    public class508 field4679 = null;

    public class411(class412 arg0) {
        this.method7058(arg0);
    }

    @ObfuscatedName("pa.ac(Lpr;)V")
    public void method7058(class412 arg0) {
        this.field4680 = arg0;
        this.method7059();
    }

    @ObfuscatedName("pa.ae()V")
    public void method7059() {
        this.field4678 = this.field4680 == null ? null : this.field4680.field4681.field5123;
        this.field4679 = null;
    }

    public Object next() {
        class508 var1 = this.field4678;
        if (this.field4680.field4681 == var1) {
            var1 = null;
            this.field4678 = null;
        } else {
            this.field4678 = var1.field5123;
        }
        this.field4679 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4680.field4681 != this.field4678 && this.field4678 != null;
    }

    public void remove() {
        if (this.field4679 == null) {
            throw new IllegalStateException();
        }
        this.field4679.method8362();
        this.field4679 = null;
    }
}
