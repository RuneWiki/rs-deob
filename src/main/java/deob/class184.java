package deob;

import java.util.Iterator;

@ObfuscatedName("gy")
public class class184 implements Iterator {

    @ObfuscatedName("gy.e")
    public class178 field2867;

    @ObfuscatedName("gy.o")
    public class182 field2868;

    @ObfuscatedName("gy.y")
    public class182 field2869 = null;

    public class184(class178 arg0) {
        this.field2867 = arg0;
        this.field2868 = this.field2867.field2858.field2862;
        this.field2869 = null;
    }

    public Object next() {
        class182 var1 = this.field2868;
        if (this.field2867.field2858 == var1) {
            var1 = null;
            this.field2868 = null;
        } else {
            this.field2868 = var1.field2862;
        }
        this.field2869 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2867.field2858 != this.field2868;
    }

    public void remove() {
        if (this.field2869 == null) {
            throw new IllegalStateException();
        }
        this.field2869.method3187();
        this.field2869 = null;
    }
}
