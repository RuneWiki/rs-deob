package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class197 implements Iterator {

    @ObfuscatedName("gk.t")
    public class191 field3009;

    @ObfuscatedName("gk.b")
    public class195 field3010;

    @ObfuscatedName("gk.p")
    public class195 field3011 = null;

    public class197(class191 arg0) {
        this.field3009 = arg0;
        this.field3010 = this.field3009.field3000.field3005;
        this.field3011 = null;
    }

    public Object next() {
        class195 var1 = this.field3010;
        if (this.field3009.field3000 == var1) {
            var1 = null;
            this.field3010 = null;
        } else {
            this.field3010 = var1.field3005;
        }
        this.field3011 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3009.field3000 != this.field3010;
    }

    public void remove() {
        if (this.field3011 == null) {
            throw new IllegalStateException();
        }
        this.field3011.method3484();
        this.field3011 = null;
    }
}
