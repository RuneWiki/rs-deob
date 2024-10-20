package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public class class183 implements Iterator {

    @ObfuscatedName("gl.t")
    public class180 field2856;

    @ObfuscatedName("gl.o")
    public class186 field2857;

    @ObfuscatedName("gl.i")
    public class186 field2858 = null;

    public class183(class180 arg0) {
        this.field2856 = arg0;
        this.field2857 = this.field2856.field2852.field2864;
        this.field2858 = null;
    }

    public Object next() {
        class186 var1 = this.field2857;
        if (this.field2856.field2852 == var1) {
            var1 = null;
            this.field2857 = null;
        } else {
            this.field2857 = var1.field2864;
        }
        this.field2858 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2856.field2852 != this.field2857;
    }

    public void remove() {
        if (this.field2858 == null) {
            throw new IllegalStateException();
        }
        this.field2858.method3261();
        this.field2858 = null;
    }
}
