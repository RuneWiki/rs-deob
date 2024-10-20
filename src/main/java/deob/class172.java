package deob;

import java.util.Iterator;

@ObfuscatedName("fc")
public class class172 implements Iterator {

    @ObfuscatedName("fc.g")
    public class176 field2847;

    @ObfuscatedName("fc.v")
    public class186 field2845;

    @ObfuscatedName("fc.z")
    public int field2846;

    @ObfuscatedName("fc.h")
    public class186 field2844 = null;

    public class172(class176 arg0) {
        this.field2847 = arg0;
        this.method3181();
    }

    @ObfuscatedName("fc.g()V")
    public void method3181() {
        this.field2845 = this.field2847.field2856[0].field2876;
        this.field2846 = 1;
        this.field2844 = null;
    }

    public Object next() {
        if (this.field2847.field2856[this.field2846 - 1] != this.field2845) {
            class186 var1 = this.field2845;
            this.field2845 = var1.field2876;
            this.field2844 = var1;
            return var1;
        }
        class186 var2;
        do {
            if (this.field2846 >= this.field2847.field2858) {
                return null;
            }
            var2 = this.field2847.field2856[this.field2846++].field2876;
        } while (this.field2847.field2856[this.field2846 - 1] == var2);
        this.field2845 = var2.field2876;
        this.field2844 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2847.field2856[this.field2846 - 1] != this.field2845) {
            return true;
        }
        while (this.field2846 < this.field2847.field2858) {
            if (this.field2847.field2856[this.field2846++].field2876 != this.field2847.field2856[this.field2846 - 1]) {
                this.field2845 = this.field2847.field2856[this.field2846 - 1].field2876;
                return true;
            }
            this.field2845 = this.field2847.field2856[this.field2846 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2844 == null) {
            throw new IllegalStateException();
        }
        this.field2844.method3322();
        this.field2844 = null;
    }
}
