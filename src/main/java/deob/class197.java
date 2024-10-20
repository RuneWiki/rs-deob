package deob;

import java.util.Iterator;

@ObfuscatedName("gh")
public class class197 implements Iterator {

    @ObfuscatedName("gh.p")
    public class191 field3011;

    @ObfuscatedName("gh.k")
    public class195 field3010;

    @ObfuscatedName("gh.e")
    public class195 field3009 = null;

    public class197(class191 arg0) {
        this.field3011 = arg0;
        this.field3010 = this.field3011.field3000.field3005;
        this.field3009 = null;
    }

    public Object next() {
        class195 var1 = this.field3010;
        if (this.field3011.field3000 == var1) {
            var1 = null;
            this.field3010 = null;
        } else {
            this.field3010 = var1.field3005;
        }
        this.field3009 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3011.field3000 != this.field3010;
    }

    public void remove() {
        if (this.field3009 == null) {
            throw new IllegalStateException();
        }
        this.field3009.method3519();
        this.field3009 = null;
    }
}
