package deob;

import java.util.Iterator;

@ObfuscatedName("fn")
public class class182 implements Iterator {

    @ObfuscatedName("fn.j")
    public class178 field2856;

    @ObfuscatedName("fn.z")
    public class181 field2855;

    @ObfuscatedName("fn.y")
    public class181 field2857 = null;

    public class182(class178 arg0) {
        this.field2856 = arg0;
        this.field2855 = this.field2856.field2850.field2853;
        this.field2857 = null;
    }

    public Object next() {
        class181 var1 = this.field2855;
        if (this.field2856.field2850 == var1) {
            var1 = null;
            this.field2855 = null;
        } else {
            this.field2855 = var1.field2853;
        }
        this.field2857 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2856.field2850 != this.field2855;
    }

    public void remove() {
        if (this.field2857 == null) {
            throw new IllegalStateException();
        }
        this.field2857.method3294();
        this.field2857 = null;
    }
}
