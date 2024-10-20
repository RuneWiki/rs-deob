package deob;

import java.util.Iterator;

@ObfuscatedName("pf")
public class class414 implements Iterator {

    @ObfuscatedName("pf.ac")
    public class415 field4687;

    @ObfuscatedName("pf.ae")
    public class504 field4686;

    @ObfuscatedName("pf.ag")
    public class504 field4685 = null;

    public class414(class415 arg0) {
        this.field4687 = arg0;
        this.field4686 = this.field4687.field4689.field5115;
        this.field4685 = null;
    }

    public Object next() {
        class504 var1 = this.field4686;
        if (this.field4687.field4689 == var1) {
            var1 = null;
            this.field4686 = null;
        } else {
            this.field4686 = var1.field5115;
        }
        this.field4685 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4687.field4689 != this.field4686;
    }

    public void remove() {
        if (this.field4685 == null) {
            throw new IllegalStateException();
        }
        this.field4685.method8359();
        this.field4685 = null;
    }
}
