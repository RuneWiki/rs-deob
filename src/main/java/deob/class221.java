package deob;

import java.util.Iterator;

@ObfuscatedName("hn")
public class class221 implements Iterator {

    @ObfuscatedName("hn.b")
    public class222 field2629;

    @ObfuscatedName("hn.q")
    public class215 field2630;

    @ObfuscatedName("hn.o")
    public class215 field2628 = null;

    public class221(class222 arg0) {
        this.field2629 = arg0;
        this.field2630 = this.field2629.field2631.field2616;
        this.field2628 = null;
    }

    public Object next() {
        class215 var1 = this.field2630;
        if (this.field2629.field2631 == var1) {
            var1 = null;
            this.field2630 = null;
        } else {
            this.field2630 = var1.field2616;
        }
        this.field2628 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2629.field2631 != this.field2630;
    }

    public void remove() {
        if (this.field2628 == null) {
            throw new IllegalStateException();
        }
        this.field2628.method3766();
        this.field2628 = null;
    }
}
