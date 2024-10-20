package deob;

import java.util.Iterator;

@ObfuscatedName("jf")
public class class264 implements Iterator {

    @ObfuscatedName("jf.c")
    public class266 field3514;

    @ObfuscatedName("jf.x")
    public class176 field3515;

    @ObfuscatedName("jf.t")
    public class176 field3513 = null;

    public class264(class266 arg0) {
        this.field3514 = arg0;
        this.field3515 = this.field3514.field3519.field2087;
        this.field3513 = null;
    }

    public Object next() {
        class176 var1 = this.field3515;
        if (this.field3514.field3519 == var1) {
            var1 = null;
            this.field3515 = null;
        } else {
            this.field3515 = var1.field2087;
        }
        this.field3513 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3514.field3519 != this.field3515;
    }

    public void remove() {
        if (this.field3513 == null) {
            throw new IllegalStateException();
        }
        this.field3513.method3320();
        this.field3513 = null;
    }
}
