package deob;

import java.util.Iterator;

@ObfuscatedName("gj")
public class class207 implements Iterator {

    @ObfuscatedName("gj.j")
    public class201 field3118;

    @ObfuscatedName("gj.h")
    public class205 field3119;

    @ObfuscatedName("gj.m")
    public class205 field3120 = null;

    public class207(class201 arg0) {
        this.field3118 = arg0;
        this.field3119 = this.field3118.field3109.field3113;
        this.field3120 = null;
    }

    public Object next() {
        class205 var1 = this.field3119;
        if (this.field3118.field3109 == var1) {
            var1 = null;
            this.field3119 = null;
        } else {
            this.field3119 = var1.field3113;
        }
        this.field3120 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3118.field3109 != this.field3119;
    }

    public void remove() {
        if (this.field3120 == null) {
            throw new IllegalStateException();
        }
        this.field3120.method3619();
        this.field3120 = null;
    }
}
