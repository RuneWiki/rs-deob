package deob;

import java.util.Iterator;

@ObfuscatedName("gn")
public class class206 implements Iterator {

    @ObfuscatedName("gn.l")
    public class200 field3101;

    @ObfuscatedName("gn.e")
    public class204 field3100;

    @ObfuscatedName("gn.q")
    public class204 field3102 = null;

    public class206(class200 arg0) {
        this.field3101 = arg0;
        this.field3100 = this.field3101.field3091.field3096;
        this.field3102 = null;
    }

    public Object next() {
        class204 var1 = this.field3100;
        if (this.field3101.field3091 == var1) {
            var1 = null;
            this.field3100 = null;
        } else {
            this.field3100 = var1.field3096;
        }
        this.field3102 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3101.field3091 != this.field3100;
    }

    public void remove() {
        if (this.field3102 == null) {
            throw new IllegalStateException();
        }
        this.field3102.method3603();
        this.field3102 = null;
    }
}
