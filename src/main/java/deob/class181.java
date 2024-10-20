package deob;

import java.util.Iterator;

@ObfuscatedName("fe")
public class class181 implements Iterator {

    @ObfuscatedName("fe.y")
    public class177 field2824;

    @ObfuscatedName("fe.u")
    public class180 field2825;

    @ObfuscatedName("fe.k")
    public class180 field2826 = null;

    public class181(class177 arg0) {
        this.field2824 = arg0;
        this.field2825 = this.field2824.field2819.field2822;
        this.field2826 = null;
    }

    public Object next() {
        class180 var1 = this.field2825;
        if (this.field2824.field2819 == var1) {
            var1 = null;
            this.field2825 = null;
        } else {
            this.field2825 = var1.field2822;
        }
        this.field2826 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2824.field2819 != this.field2825;
    }

    public void remove() {
        if (this.field2826 == null) {
            throw new IllegalStateException();
        }
        this.field2826.method3260();
        this.field2826 = null;
    }
}
