package deob;

import java.util.Iterator;

@ObfuscatedName("gh")
public class class184 implements Iterator {

    @ObfuscatedName("gh.p")
    public class181 field2871;

    @ObfuscatedName("gh.g")
    public class187 field2872;

    @ObfuscatedName("gh.x")
    public class187 field2873 = null;

    public class184(class181 arg0) {
        this.field2871 = arg0;
        this.field2872 = this.field2871.field2867.field2880;
        this.field2873 = null;
    }

    public Object next() {
        class187 var1 = this.field2872;
        if (this.field2871.field2867 == var1) {
            var1 = null;
            this.field2872 = null;
        } else {
            this.field2872 = var1.field2880;
        }
        this.field2873 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2871.field2867 != this.field2872;
    }

    public void remove() {
        if (this.field2873 == null) {
            throw new IllegalStateException();
        }
        this.field2873.method3378();
        this.field2873 = null;
    }
}
