package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public class class196 implements Iterator {

    @ObfuscatedName("gu.n")
    public class193 field3000;

    @ObfuscatedName("gu.d")
    public class199 field2999;

    @ObfuscatedName("gu.z")
    public class199 field3001 = null;

    public class196(class193 arg0) {
        this.field3000 = arg0;
        this.field2999 = this.field3000.field2995.field3008;
        this.field3001 = null;
    }

    public Object next() {
        class199 var1 = this.field2999;
        if (this.field3000.field2995 == var1) {
            var1 = null;
            this.field2999 = null;
        } else {
            this.field2999 = var1.field3008;
        }
        this.field3001 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3000.field2995 != this.field2999;
    }

    public void remove() {
        if (this.field3001 == null) {
            throw new IllegalStateException();
        }
        this.field3001.method3562();
        this.field3001 = null;
    }
}
