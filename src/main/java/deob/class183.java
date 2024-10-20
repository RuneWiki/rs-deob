package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class183 implements Iterator {

    @ObfuscatedName("gm.g")
    public class180 field2867;

    @ObfuscatedName("gm.v")
    public class186 field2868;

    @ObfuscatedName("gm.z")
    public class186 field2869 = null;

    public class183(class180 arg0) {
        this.field2867 = arg0;
        this.field2868 = this.field2867.field2863.field2876;
        this.field2869 = null;
    }

    public Object next() {
        class186 var1 = this.field2868;
        if (this.field2867.field2863 == var1) {
            var1 = null;
            this.field2868 = null;
        } else {
            this.field2868 = var1.field2876;
        }
        this.field2869 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2867.field2863 != this.field2868;
    }

    public void remove() {
        if (this.field2869 == null) {
            throw new IllegalStateException();
        }
        this.field2869.method3322();
        this.field2869 = null;
    }
}
