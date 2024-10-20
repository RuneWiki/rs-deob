package deob;

import java.util.Iterator;

@ObfuscatedName("jg")
public class class265 implements Iterator {

    @ObfuscatedName("jg.c")
    public class267 field3535;

    @ObfuscatedName("jg.t")
    public class176 field3536;

    @ObfuscatedName("jg.o")
    public class176 field3537 = null;

    public class265(class267 arg0) {
        this.field3535 = arg0;
        this.field3536 = this.field3535.field3541.field2106;
        this.field3537 = null;
    }

    public Object next() {
        class176 var1 = this.field3536;
        if (this.field3535.field3541 == var1) {
            var1 = null;
            this.field3536 = null;
        } else {
            this.field3536 = var1.field2106;
        }
        this.field3537 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3535.field3541 != this.field3536;
    }

    public void remove() {
        if (this.field3537 == null) {
            throw new IllegalStateException();
        }
        this.field3537.method3342();
        this.field3537 = null;
    }
}
