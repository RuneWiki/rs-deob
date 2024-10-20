package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public class class196 implements Iterator {

    @ObfuscatedName("gc.b")
    public class193 field2997;

    @ObfuscatedName("gc.e")
    public class199 field2998;

    @ObfuscatedName("gc.a")
    public class199 field2999 = null;

    public class196(class193 arg0) {
        this.field2997 = arg0;
        this.field2998 = this.field2997.field2993.field3005;
        this.field2999 = null;
    }

    public Object next() {
        class199 var1 = this.field2998;
        if (this.field2997.field2993 == var1) {
            var1 = null;
            this.field2998 = null;
        } else {
            this.field2998 = var1.field3005;
        }
        this.field2999 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2997.field2993 != this.field2998;
    }

    public void remove() {
        if (this.field2999 == null) {
            throw new IllegalStateException();
        }
        this.field2999.method3414();
        this.field2999 = null;
    }
}
