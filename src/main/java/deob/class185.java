package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class185 implements Iterator {

    @ObfuscatedName("gt.p")
    public class179 field2874;

    @ObfuscatedName("gt.g")
    public class183 field2875;

    @ObfuscatedName("gt.x")
    public class183 field2876 = null;

    public class185(class179 arg0) {
        this.field2874 = arg0;
        this.field2875 = this.field2874.field2865.field2870;
        this.field2876 = null;
    }

    public Object next() {
        class183 var1 = this.field2875;
        if (this.field2874.field2865 == var1) {
            var1 = null;
            this.field2875 = null;
        } else {
            this.field2875 = var1.field2870;
        }
        this.field2876 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2874.field2865 != this.field2875;
    }

    public void remove() {
        if (this.field2876 == null) {
            throw new IllegalStateException();
        }
        this.field2876.method3356();
        this.field2876 = null;
    }
}
