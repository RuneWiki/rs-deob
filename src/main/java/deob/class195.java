package deob;

import java.util.Iterator;

@ObfuscatedName("gn")
public class class195 implements Iterator {

    @ObfuscatedName("gn.q")
    public class192 field2949;

    @ObfuscatedName("gn.s")
    public class198 field2950;

    @ObfuscatedName("gn.h")
    public class198 field2951 = null;

    public class195(class192 arg0) {
        this.field2949 = arg0;
        this.field2950 = this.field2949.field2945.field2959;
        this.field2951 = null;
    }

    public Object next() {
        class198 var1 = this.field2950;
        if (this.field2949.field2945 == var1) {
            var1 = null;
            this.field2950 = null;
        } else {
            this.field2950 = var1.field2959;
        }
        this.field2951 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2949.field2945 != this.field2950;
    }

    public void remove() {
        if (this.field2951 == null) {
            throw new IllegalStateException();
        }
        this.field2951.method3404();
        this.field2951 = null;
    }
}
