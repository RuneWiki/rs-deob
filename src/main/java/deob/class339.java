package deob;

import java.util.Iterator;

@ObfuscatedName("mn")
public class class339 implements Iterator {

    @ObfuscatedName("mn.s")
    public class340 field4135;

    @ObfuscatedName("mn.h")
    public class406 field4134;

    @ObfuscatedName("mn.w")
    public class406 field4136 = null;

    public class339(class340 arg0) {
        this.field4135 = arg0;
        this.field4134 = this.field4135.field4137.field4461;
        this.field4136 = null;
    }

    public Object next() {
        class406 var1 = this.field4134;
        if (this.field4135.field4137 == var1) {
            var1 = null;
            this.field4134 = null;
        } else {
            this.field4134 = var1.field4461;
        }
        this.field4136 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4135.field4137 != this.field4134;
    }

    public void remove() {
        if (this.field4136 == null) {
            throw new IllegalStateException();
        }
        this.field4136.method6406();
        this.field4136 = null;
    }
}
