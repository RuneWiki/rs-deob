package deob;

import java.util.Iterator;

@ObfuscatedName("gh")
public class class184 implements Iterator {

    @ObfuscatedName("gh.e")
    public class178 field2862;

    @ObfuscatedName("gh.v")
    public class182 field2861;

    @ObfuscatedName("gh.i")
    public class182 field2860 = null;

    public class184(class178 arg0) {
        this.field2862 = arg0;
        this.field2861 = this.field2862.field2851.field2855;
        this.field2860 = null;
    }

    public Object next() {
        class182 var1 = this.field2861;
        if (this.field2862.field2851 == var1) {
            var1 = null;
            this.field2861 = null;
        } else {
            this.field2861 = var1.field2855;
        }
        this.field2860 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2862.field2851 != this.field2861;
    }

    public void remove() {
        if (this.field2860 == null) {
            throw new IllegalStateException();
        }
        this.field2860.method3254();
        this.field2860 = null;
    }
}
