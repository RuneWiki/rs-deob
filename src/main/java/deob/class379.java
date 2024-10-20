package deob;

import java.util.Iterator;

@ObfuscatedName("ot")
public class class379 implements Iterator {

    @ObfuscatedName("ot.au")
    public class380 field4411;

    @ObfuscatedName("ot.ae")
    public class473 field4412;

    @ObfuscatedName("ot.ao")
    public class473 field4413 = null;

    public class379(class380 arg0) {
        this.method6429(arg0);
    }

    @ObfuscatedName("ot.au(Loc;)V")
    public void method6429(class380 arg0) {
        this.field4411 = arg0;
        this.method6425();
    }

    @ObfuscatedName("ot.ae()V")
    public void method6425() {
        this.field4412 = this.field4411 == null ? null : this.field4411.field4414.field4813;
        this.field4413 = null;
    }

    public Object next() {
        class473 var1 = this.field4412;
        if (this.field4411.field4414 == var1) {
            var1 = null;
            this.field4412 = null;
        } else {
            this.field4412 = var1.field4813;
        }
        this.field4413 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4411.field4414 != this.field4412 && this.field4412 != null;
    }

    public void remove() {
        if (this.field4413 == null) {
            throw new IllegalStateException();
        }
        this.field4413.method7700();
        this.field4413 = null;
    }
}
