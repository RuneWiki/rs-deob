package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class196 implements Iterator {

    @ObfuscatedName("gz.e")
    public class190 field2959;

    @ObfuscatedName("gz.a")
    public class194 field2957;

    @ObfuscatedName("gz.l")
    public class194 field2958 = null;

    public class196(class190 arg0) {
        this.field2959 = arg0;
        this.field2957 = this.field2959.field2948.field2952;
        this.field2958 = null;
    }

    public Object next() {
        class194 var1 = this.field2957;
        if (this.field2959.field2948 == var1) {
            var1 = null;
            this.field2957 = null;
        } else {
            this.field2957 = var1.field2952;
        }
        this.field2958 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2959.field2948 != this.field2957;
    }

    public void remove() {
        if (this.field2958 == null) {
            throw new IllegalStateException();
        }
        this.field2958.method3440();
        this.field2958 = null;
    }
}
