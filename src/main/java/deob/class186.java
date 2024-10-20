package deob;

import java.util.Iterator;

@ObfuscatedName("gh")
public class class186 implements Iterator {

    @ObfuscatedName("gh.c")
    public class183 field2878;

    @ObfuscatedName("gh.j")
    public class189 field2879;

    @ObfuscatedName("gh.y")
    public class189 field2877 = null;

    public class186(class183 arg0) {
        this.field2878 = arg0;
        this.field2879 = this.field2878.field2873.field2885;
        this.field2877 = null;
    }

    public Object next() {
        class189 var1 = this.field2879;
        if (this.field2878.field2873 == var1) {
            var1 = null;
            this.field2879 = null;
        } else {
            this.field2879 = var1.field2885;
        }
        this.field2877 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2878.field2873 != this.field2879;
    }

    public void remove() {
        if (this.field2877 == null) {
            throw new IllegalStateException();
        }
        this.field2877.method3334();
        this.field2877 = null;
    }
}
