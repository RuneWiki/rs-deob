package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class183 implements Iterator {

    @ObfuscatedName("gz.e")
    public class180 field2865;

    @ObfuscatedName("gz.o")
    public class186 field2864;

    @ObfuscatedName("gz.y")
    public class186 field2866 = null;

    public class183(class180 arg0) {
        this.field2865 = arg0;
        this.field2864 = this.field2865.field2860.field2873;
        this.field2866 = null;
    }

    public Object next() {
        class186 var1 = this.field2864;
        if (this.field2865.field2860 == var1) {
            var1 = null;
            this.field2864 = null;
        } else {
            this.field2864 = var1.field2873;
        }
        this.field2866 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2865.field2860 != this.field2864;
    }

    public void remove() {
        if (this.field2866 == null) {
            throw new IllegalStateException();
        }
        this.field2866.method3204();
        this.field2866 = null;
    }
}
