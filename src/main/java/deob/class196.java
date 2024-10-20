package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public class class196 implements Iterator {

    @ObfuscatedName("gr.d")
    public class199 field2551;

    @ObfuscatedName("gr.x")
    public class200 field2550;

    @ObfuscatedName("gr.k")
    public class200 field2549 = null;

    public class196(class199 arg0) {
        this.field2551 = arg0;
        this.field2550 = this.field2551.field2562.field2565;
        this.field2549 = null;
    }

    public Object next() {
        class200 var1 = this.field2550;
        if (this.field2551.field2562 == var1) {
            var1 = null;
            this.field2550 = null;
        } else {
            this.field2550 = var1.field2565;
        }
        this.field2549 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2551.field2562 != this.field2550;
    }

    public void remove() {
        if (this.field2549 == null) {
            throw new IllegalStateException();
        }
        this.field2549.method3475();
        this.field2549 = null;
    }
}
