package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class206 implements Iterator {

    @ObfuscatedName("gt.f")
    public class200 field3102;

    @ObfuscatedName("gt.s")
    public class204 field3101;

    @ObfuscatedName("gt.q")
    public class204 field3100 = null;

    public class206(class200 arg0) {
        this.field3102 = arg0;
        this.field3101 = this.field3102.field3091.field3096;
        this.field3100 = null;
    }

    public Object next() {
        class204 var1 = this.field3101;
        if (this.field3102.field3091 == var1) {
            var1 = null;
            this.field3101 = null;
        } else {
            this.field3101 = var1.field3096;
        }
        this.field3100 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3102.field3091 != this.field3101;
    }

    public void remove() {
        if (this.field3100 == null) {
            throw new IllegalStateException();
        }
        this.field3100.method3636();
        this.field3100 = null;
    }
}
