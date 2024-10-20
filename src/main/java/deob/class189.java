package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class189 implements Iterator {

    @ObfuscatedName("gk.a")
    public class183 field2903;

    @ObfuscatedName("gk.v")
    public class187 field2902;

    @ObfuscatedName("gk.i")
    public class187 field2904 = null;

    public class189(class183 arg0) {
        this.field2903 = arg0;
        this.field2902 = this.field2903.field2893.field2897;
        this.field2904 = null;
    }

    public Object next() {
        class187 var1 = this.field2902;
        if (this.field2903.field2893 == var1) {
            var1 = null;
            this.field2902 = null;
        } else {
            this.field2902 = var1.field2897;
        }
        this.field2904 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2903.field2893 != this.field2902;
    }

    public void remove() {
        if (this.field2904 == null) {
            throw new IllegalStateException();
        }
        this.field2904.method3320();
        this.field2904 = null;
    }
}
