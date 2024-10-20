package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public class class206 implements Iterator {

    @ObfuscatedName("gb.j")
    public class200 field3106;

    @ObfuscatedName("gb.l")
    public class204 field3107;

    @ObfuscatedName("gb.a")
    public class204 field3108 = null;

    public class206(class200 arg0) {
        this.field3106 = arg0;
        this.field3107 = this.field3106.field3097.field3101;
        this.field3108 = null;
    }

    public Object next() {
        class204 var1 = this.field3107;
        if (this.field3106.field3097 == var1) {
            var1 = null;
            this.field3107 = null;
        } else {
            this.field3107 = var1.field3101;
        }
        this.field3108 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3106.field3097 != this.field3107;
    }

    public void remove() {
        if (this.field3108 == null) {
            throw new IllegalStateException();
        }
        this.field3108.method3590();
        this.field3108 = null;
    }
}
