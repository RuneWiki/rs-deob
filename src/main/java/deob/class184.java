package deob;

import java.util.Iterator;

@ObfuscatedName("ga")
public class class184 implements Iterator {

    @ObfuscatedName("ga.g")
    public class178 field2870;

    @ObfuscatedName("ga.v")
    public class182 field2871;

    @ObfuscatedName("ga.z")
    public class182 field2872 = null;

    public class184(class178 arg0) {
        this.field2870 = arg0;
        this.field2871 = this.field2870.field2861.field2865;
        this.field2872 = null;
    }

    public Object next() {
        class182 var1 = this.field2871;
        if (this.field2870.field2861 == var1) {
            var1 = null;
            this.field2871 = null;
        } else {
            this.field2871 = var1.field2865;
        }
        this.field2872 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2870.field2861 != this.field2871;
    }

    public void remove() {
        if (this.field2872 == null) {
            throw new IllegalStateException();
        }
        this.field2872.method3299();
        this.field2872 = null;
    }
}
