package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public class class183 implements Iterator {

    @ObfuscatedName("gb.t")
    public class180 field2856;

    @ObfuscatedName("gb.s")
    public class186 field2855;

    @ObfuscatedName("gb.f")
    public class186 field2857 = null;

    public class183(class180 arg0) {
        this.field2856 = arg0;
        this.field2855 = this.field2856.field2851.field2863;
        this.field2857 = null;
    }

    public Object next() {
        class186 var1 = this.field2855;
        if (this.field2856.field2851 == var1) {
            var1 = null;
            this.field2855 = null;
        } else {
            this.field2855 = var1.field2863;
        }
        this.field2857 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2856.field2851 != this.field2855;
    }

    public void remove() {
        if (this.field2857 == null) {
            throw new IllegalStateException();
        }
        this.field2857.method3316();
        this.field2857 = null;
    }
}
