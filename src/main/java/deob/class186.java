package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class186 implements Iterator {

    @ObfuscatedName("gq.g")
    public class183 field2877;

    @ObfuscatedName("gq.j")
    public class189 field2878;

    @ObfuscatedName("gq.z")
    public class189 field2879 = null;

    public class186(class183 arg0) {
        this.field2877 = arg0;
        this.field2878 = this.field2877.field2873.field2886;
        this.field2879 = null;
    }

    public Object next() {
        class189 var1 = this.field2878;
        if (this.field2877.field2873 == var1) {
            var1 = null;
            this.field2878 = null;
        } else {
            this.field2878 = var1.field2886;
        }
        this.field2879 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2877.field2873 != this.field2878;
    }

    public void remove() {
        if (this.field2879 == null) {
            throw new IllegalStateException();
        }
        this.field2879.method3259();
        this.field2879 = null;
    }
}
