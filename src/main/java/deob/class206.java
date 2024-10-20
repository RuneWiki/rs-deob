package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public class class206 implements Iterator {

    @ObfuscatedName("gx.n")
    public class200 field3105;

    @ObfuscatedName("gx.q")
    public class204 field3106;

    @ObfuscatedName("gx.c")
    public class204 field3107 = null;

    public class206(class200 arg0) {
        this.field3105 = arg0;
        this.field3106 = this.field3105.field3096.field3101;
        this.field3107 = null;
    }

    public Object next() {
        class204 var1 = this.field3106;
        if (this.field3105.field3096 == var1) {
            var1 = null;
            this.field3106 = null;
        } else {
            this.field3106 = var1.field3101;
        }
        this.field3107 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3105.field3096 != this.field3106;
    }

    public void remove() {
        if (this.field3107 == null) {
            throw new IllegalStateException();
        }
        this.field3107.method3618();
        this.field3107 = null;
    }
}
