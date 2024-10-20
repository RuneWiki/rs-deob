package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public class class206 implements Iterator {

    @ObfuscatedName("gc.f")
    public class203 field3109;

    @ObfuscatedName("gc.u")
    public class209 field3110;

    @ObfuscatedName("gc.x")
    public class209 field3108 = null;

    public class206(class203 arg0) {
        this.field3109 = arg0;
        this.field3110 = this.field3109.field3104.field3117;
        this.field3108 = null;
    }

    public Object next() {
        class209 var1 = this.field3110;
        if (this.field3109.field3104 == var1) {
            var1 = null;
            this.field3110 = null;
        } else {
            this.field3110 = var1.field3117;
        }
        this.field3108 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3109.field3104 != this.field3110;
    }

    public void remove() {
        if (this.field3108 == null) {
            throw new IllegalStateException();
        }
        this.field3108.method3679();
        this.field3108 = null;
    }
}
