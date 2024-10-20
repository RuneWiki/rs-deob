package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public class class195 implements Iterator {

    @ObfuscatedName("gl.e")
    public class192 field2955;

    @ObfuscatedName("gl.a")
    public class198 field2954;

    @ObfuscatedName("gl.l")
    public class198 field2956 = null;

    public class195(class192 arg0) {
        this.field2955 = arg0;
        this.field2954 = this.field2955.field2950.field2962;
        this.field2956 = null;
    }

    public Object next() {
        class198 var1 = this.field2954;
        if (this.field2955.field2950 == var1) {
            var1 = null;
            this.field2954 = null;
        } else {
            this.field2954 = var1.field2962;
        }
        this.field2956 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2955.field2950 != this.field2954;
    }

    public void remove() {
        if (this.field2956 == null) {
            throw new IllegalStateException();
        }
        this.field2956.method3463();
        this.field2956 = null;
    }
}
