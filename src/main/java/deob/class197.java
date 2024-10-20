package deob;

import java.util.Iterator;

@ObfuscatedName("gh")
public class class197 implements Iterator {

    @ObfuscatedName("gh.n")
    public class191 field3007;

    @ObfuscatedName("gh.w")
    public class195 field3008;

    @ObfuscatedName("gh.i")
    public class195 field3009 = null;

    public class197(class191 arg0) {
        this.field3007 = arg0;
        this.field3008 = this.field3007.field2998.field3002;
        this.field3009 = null;
    }

    public Object next() {
        class195 var1 = this.field3008;
        if (this.field3007.field2998 == var1) {
            var1 = null;
            this.field3008 = null;
        } else {
            this.field3008 = var1.field3002;
        }
        this.field3009 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3007.field2998 != this.field3008;
    }

    public void remove() {
        if (this.field3009 == null) {
            throw new IllegalStateException();
        }
        this.field3009.method3450();
        this.field3009 = null;
    }
}
