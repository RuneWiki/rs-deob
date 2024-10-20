package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class196 implements Iterator {

    @ObfuscatedName("gg.t")
    public class193 field3008;

    @ObfuscatedName("gg.b")
    public class199 field3006;

    @ObfuscatedName("gg.p")
    public class199 field3007 = null;

    public class196(class193 arg0) {
        this.field3008 = arg0;
        this.field3006 = this.field3008.field3002.field3014;
        this.field3007 = null;
    }

    public Object next() {
        class199 var1 = this.field3006;
        if (this.field3008.field3002 == var1) {
            var1 = null;
            this.field3006 = null;
        } else {
            this.field3006 = var1.field3014;
        }
        this.field3007 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3008.field3002 != this.field3006;
    }

    public void remove() {
        if (this.field3007 == null) {
            throw new IllegalStateException();
        }
        this.field3007.method3506();
        this.field3007 = null;
    }
}
