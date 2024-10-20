package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class184 implements Iterator {

    @ObfuscatedName("gt.k")
    public class178 field2863;

    @ObfuscatedName("gt.b")
    public class182 field2862;

    @ObfuscatedName("gt.e")
    public class182 field2861 = null;

    public class184(class178 arg0) {
        this.field2863 = arg0;
        this.field2862 = this.field2863.field2852.field2856;
        this.field2861 = null;
    }

    public Object next() {
        class182 var1 = this.field2862;
        if (this.field2863.field2852 == var1) {
            var1 = null;
            this.field2862 = null;
        } else {
            this.field2862 = var1.field2856;
        }
        this.field2861 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2863.field2852 != this.field2862;
    }

    public void remove() {
        if (this.field2861 == null) {
            throw new IllegalStateException();
        }
        this.field2861.method3302();
        this.field2861 = null;
    }
}
