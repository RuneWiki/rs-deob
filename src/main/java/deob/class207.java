package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public class class207 implements Iterator {

    @ObfuscatedName("gu.w")
    public class201 field3121;

    @ObfuscatedName("gu.x")
    public class205 field3120;

    @ObfuscatedName("gu.t")
    public class205 field3119 = null;

    public class207(class201 arg0) {
        this.field3121 = arg0;
        this.field3120 = this.field3121.field3110.field3115;
        this.field3119 = null;
    }

    public Object next() {
        class205 var1 = this.field3120;
        if (this.field3121.field3110 == var1) {
            var1 = null;
            this.field3120 = null;
        } else {
            this.field3120 = var1.field3115;
        }
        this.field3119 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3121.field3110 != this.field3120;
    }

    public void remove() {
        if (this.field3119 == null) {
            throw new IllegalStateException();
        }
        this.field3119.method3658();
        this.field3119 = null;
    }
}
