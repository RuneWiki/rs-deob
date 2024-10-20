package deob;

import java.util.Iterator;

@ObfuscatedName("fc")
public class class182 implements Iterator {

    @ObfuscatedName("fc.z")
    public class178 field2850;

    @ObfuscatedName("fc.j")
    public class181 field2851;

    @ObfuscatedName("fc.a")
    public class181 field2852 = null;

    public class182(class178 arg0) {
        this.field2850 = arg0;
        this.field2851 = this.field2850.field2845.field2849;
        this.field2852 = null;
    }

    public Object next() {
        class181 var1 = this.field2851;
        if (this.field2850.field2845 == var1) {
            var1 = null;
            this.field2851 = null;
        } else {
            this.field2851 = var1.field2849;
        }
        this.field2852 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2850.field2845 != this.field2851;
    }

    public void remove() {
        if (this.field2852 == null) {
            throw new IllegalStateException();
        }
        this.field2852.method3294();
        this.field2852 = null;
    }
}
