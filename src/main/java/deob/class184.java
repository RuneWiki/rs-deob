package deob;

import java.util.Iterator;

@ObfuscatedName("ge")
public class class184 implements Iterator {

    @ObfuscatedName("ge.t")
    public class178 field2859;

    @ObfuscatedName("ge.s")
    public class182 field2858;

    @ObfuscatedName("ge.f")
    public class182 field2860 = null;

    public class184(class178 arg0) {
        this.field2859 = arg0;
        this.field2858 = this.field2859.field2849.field2853;
        this.field2860 = null;
    }

    public Object next() {
        class182 var1 = this.field2858;
        if (this.field2859.field2849 == var1) {
            var1 = null;
            this.field2858 = null;
        } else {
            this.field2858 = var1.field2853;
        }
        this.field2860 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2859.field2849 != this.field2858;
    }

    public void remove() {
        if (this.field2860 == null) {
            throw new IllegalStateException();
        }
        this.field2860.method3299();
        this.field2860 = null;
    }
}
