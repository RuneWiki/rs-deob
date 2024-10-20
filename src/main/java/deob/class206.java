package deob;

import java.util.Iterator;

@ObfuscatedName("ga")
public class class206 implements Iterator {

    @ObfuscatedName("ga.k")
    public class200 field3105;

    @ObfuscatedName("ga.h")
    public class204 field3104;

    @ObfuscatedName("ga.o")
    public class204 field3106 = null;

    public class206(class200 arg0) {
        this.field3105 = arg0;
        this.field3104 = this.field3105.field3095.field3099;
        this.field3106 = null;
    }

    public Object next() {
        class204 var1 = this.field3104;
        if (this.field3105.field3095 == var1) {
            var1 = null;
            this.field3104 = null;
        } else {
            this.field3104 = var1.field3099;
        }
        this.field3106 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3105.field3095 != this.field3104;
    }

    public void remove() {
        if (this.field3106 == null) {
            throw new IllegalStateException();
        }
        this.field3106.method3649();
        this.field3106 = null;
    }
}
