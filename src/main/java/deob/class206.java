package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class206 implements Iterator {

    @ObfuscatedName("gf.o")
    public class200 field3092;

    @ObfuscatedName("gf.f")
    public class204 field3093;

    @ObfuscatedName("gf.i")
    public class204 field3094 = null;

    public class206(class200 arg0) {
        this.field3092 = arg0;
        this.field3093 = this.field3092.field3083.field3088;
        this.field3094 = null;
    }

    public Object next() {
        class204 var1 = this.field3093;
        if (this.field3092.field3083 == var1) {
            var1 = null;
            this.field3093 = null;
        } else {
            this.field3093 = var1.field3088;
        }
        this.field3094 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3092.field3083 != this.field3093;
    }

    public void remove() {
        if (this.field3094 == null) {
            throw new IllegalStateException();
        }
        this.field3094.method3580();
        this.field3094 = null;
    }
}
