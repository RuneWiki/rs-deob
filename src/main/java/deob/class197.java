package deob;

import java.util.Iterator;

@ObfuscatedName("gw")
public class class197 implements Iterator {

    @ObfuscatedName("gw.o")
    public class191 field3010;

    @ObfuscatedName("gw.l")
    public class195 field3009;

    @ObfuscatedName("gw.g")
    public class195 field3008 = null;

    public class197(class191 arg0) {
        this.field3010 = arg0;
        this.field3009 = this.field3010.field2999.field3004;
        this.field3008 = null;
    }

    public Object next() {
        class195 var1 = this.field3009;
        if (this.field3010.field2999 == var1) {
            var1 = null;
            this.field3009 = null;
        } else {
            this.field3009 = var1.field3004;
        }
        this.field3008 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3010.field2999 != this.field3009;
    }

    public void remove() {
        if (this.field3008 == null) {
            throw new IllegalStateException();
        }
        this.field3008.method3545();
        this.field3008 = null;
    }
}
