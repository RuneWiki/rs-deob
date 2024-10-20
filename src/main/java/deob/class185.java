package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public class class185 implements Iterator {

    @ObfuscatedName("gb.g")
    public class179 field2868;

    @ObfuscatedName("gb.s")
    public class183 field2869;

    @ObfuscatedName("gb.h")
    public class183 field2867 = null;

    public class185(class179 arg0) {
        this.field2868 = arg0;
        this.field2869 = this.field2868.field2858.field2863;
        this.field2867 = null;
    }

    public Object next() {
        class183 var1 = this.field2869;
        if (this.field2868.field2858 == var1) {
            var1 = null;
            this.field2869 = null;
        } else {
            this.field2869 = var1.field2863;
        }
        this.field2867 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2868.field2858 != this.field2869;
    }

    public void remove() {
        if (this.field2867 == null) {
            throw new IllegalStateException();
        }
        this.field2867.method3260();
        this.field2867 = null;
    }
}
