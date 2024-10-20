package deob;

import java.util.Iterator;

@ObfuscatedName("gn")
public class class196 implements Iterator {

    @ObfuscatedName("gn.p")
    public class193 field3008;

    @ObfuscatedName("gn.k")
    public class199 field3007;

    @ObfuscatedName("gn.e")
    public class199 field3006 = null;

    public class196(class193 arg0) {
        this.field3008 = arg0;
        this.field3007 = this.field3008.field3002.field3014;
        this.field3006 = null;
    }

    public Object next() {
        class199 var1 = this.field3007;
        if (this.field3008.field3002 == var1) {
            var1 = null;
            this.field3007 = null;
        } else {
            this.field3007 = var1.field3014;
        }
        this.field3006 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3008.field3002 != this.field3007;
    }

    public void remove() {
        if (this.field3006 == null) {
            throw new IllegalStateException();
        }
        this.field3006.method3533();
        this.field3006 = null;
    }
}
