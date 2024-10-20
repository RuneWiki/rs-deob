package deob;

import java.util.Iterator;

@ObfuscatedName("ga")
public class class200 implements Iterator {

    @ObfuscatedName("ga.a")
    public class203 field2576;

    @ObfuscatedName("ga.w")
    public class204 field2575;

    @ObfuscatedName("ga.e")
    public class204 field2574 = null;

    public class200(class203 arg0) {
        this.field2576 = arg0;
        this.field2575 = this.field2576.field2588.field2590;
        this.field2574 = null;
    }

    public Object next() {
        class204 var1 = this.field2575;
        if (this.field2576.field2588 == var1) {
            var1 = null;
            this.field2575 = null;
        } else {
            this.field2575 = var1.field2590;
        }
        this.field2574 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2576.field2588 != this.field2575;
    }

    public void remove() {
        if (this.field2574 == null) {
            throw new IllegalStateException();
        }
        this.field2574.method3427();
        this.field2574 = null;
    }
}
