package deob;

import java.util.Iterator;

@ObfuscatedName("gw")
public class class184 implements Iterator {

    @ObfuscatedName("gw.k")
    public class178 field2871;

    @ObfuscatedName("gw.r")
    public class182 field2872;

    @ObfuscatedName("gw.y")
    public class182 field2870 = null;

    public class184(class178 arg0) {
        this.field2871 = arg0;
        this.field2872 = this.field2871.field2861.field2866;
        this.field2870 = null;
    }

    public Object next() {
        class182 var1 = this.field2872;
        if (this.field2871.field2861 == var1) {
            var1 = null;
            this.field2872 = null;
        } else {
            this.field2872 = var1.field2866;
        }
        this.field2870 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2871.field2861 != this.field2872;
    }

    public void remove() {
        if (this.field2870 == null) {
            throw new IllegalStateException();
        }
        this.field2870.method3256();
        this.field2870 = null;
    }
}
