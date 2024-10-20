package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class199 implements Iterator {

    @ObfuscatedName("gm.j")
    public class196 field3035;

    @ObfuscatedName("gm.y")
    public class202 field3036;

    @ObfuscatedName("gm.z")
    public class202 field3037 = null;

    public class199(class196 arg0) {
        this.field3035 = arg0;
        this.field3036 = this.field3035.field3031.field3044;
        this.field3037 = null;
    }

    public Object next() {
        class202 var1 = this.field3036;
        if (this.field3035.field3031 == var1) {
            var1 = null;
            this.field3036 = null;
        } else {
            this.field3036 = var1.field3044;
        }
        this.field3037 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3035.field3031 != this.field3036;
    }

    public void remove() {
        if (this.field3037 == null) {
            throw new IllegalStateException();
        }
        this.field3037.method3563();
        this.field3037 = null;
    }
}
