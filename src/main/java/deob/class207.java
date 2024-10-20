package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class207 implements Iterator {

    @ObfuscatedName("gp.a")
    public class201 field3120;

    @ObfuscatedName("gp.w")
    public class205 field3121;

    @ObfuscatedName("gp.d")
    public class205 field3119 = null;

    public class207(class201 arg0) {
        this.field3120 = arg0;
        this.field3121 = this.field3120.field3110.field3115;
        this.field3119 = null;
    }

    public Object next() {
        class205 var1 = this.field3121;
        if (this.field3120.field3110 == var1) {
            var1 = null;
            this.field3121 = null;
        } else {
            this.field3121 = var1.field3115;
        }
        this.field3119 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3120.field3110 != this.field3121;
    }

    public void remove() {
        if (this.field3119 == null) {
            throw new IllegalStateException();
        }
        this.field3119.method3718();
        this.field3119 = null;
    }
}
