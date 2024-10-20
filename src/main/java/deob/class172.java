package deob;

import java.util.Iterator;

@ObfuscatedName("ff")
public class class172 implements Iterator {

    @ObfuscatedName("ff.k")
    public class176 field2836;

    @ObfuscatedName("ff.b")
    public class186 field2837;

    @ObfuscatedName("ff.e")
    public int field2835;

    @ObfuscatedName("ff.i")
    public class186 field2838 = null;

    public class172(class176 arg0) {
        this.field2836 = arg0;
        this.method3171();
    }

    @ObfuscatedName("ff.k()V")
    public void method3171() {
        this.field2837 = this.field2836.field2848[0].field2866;
        this.field2835 = 1;
        this.field2838 = null;
    }

    public Object next() {
        if (this.field2836.field2848[this.field2835 - 1] != this.field2837) {
            class186 var1 = this.field2837;
            this.field2837 = var1.field2866;
            this.field2838 = var1;
            return var1;
        }
        class186 var2;
        do {
            if (this.field2835 >= this.field2836.field2847) {
                return null;
            }
            var2 = this.field2836.field2848[this.field2835++].field2866;
        } while (this.field2836.field2848[this.field2835 - 1] == var2);
        this.field2837 = var2.field2866;
        this.field2838 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2836.field2848[this.field2835 - 1] != this.field2837) {
            return true;
        }
        while (this.field2835 < this.field2836.field2847) {
            if (this.field2836.field2848[this.field2835++].field2866 != this.field2836.field2848[this.field2835 - 1]) {
                this.field2837 = this.field2836.field2848[this.field2835 - 1].field2866;
                return true;
            }
            this.field2837 = this.field2836.field2848[this.field2835 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2838 == null) {
            throw new IllegalStateException();
        }
        this.field2838.method3321();
        this.field2838 = null;
    }
}
