package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class183 implements Iterator {

    @ObfuscatedName("gg.i")
    public class180 field2861;

    @ObfuscatedName("gg.c")
    public class186 field2862;

    @ObfuscatedName("gg.h")
    public class186 field2863 = null;

    public class183(class180 arg0) {
        this.field2861 = arg0;
        this.field2862 = this.field2861.field2857.field2870;
        this.field2863 = null;
    }

    public Object next() {
        class186 var1 = this.field2862;
        if (this.field2861.field2857 == var1) {
            var1 = null;
            this.field2862 = null;
        } else {
            this.field2862 = var1.field2870;
        }
        this.field2863 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2861.field2857 != this.field2862;
    }

    public void remove() {
        if (this.field2863 == null) {
            throw new IllegalStateException();
        }
        this.field2863.method3334();
        this.field2863 = null;
    }
}
