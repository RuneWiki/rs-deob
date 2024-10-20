package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class184 implements Iterator {

    @ObfuscatedName("gq.e")
    public class188 field2932;

    @ObfuscatedName("gq.a")
    public class198 field2933;

    @ObfuscatedName("gq.l")
    public int field2934;

    @ObfuscatedName("gq.c")
    public class198 field2931 = null;

    public class184(class188 arg0) {
        this.field2932 = arg0;
        this.method3318();
    }

    @ObfuscatedName("gq.e()V")
    public void method3318() {
        this.field2933 = this.field2932.field2944[0].field2962;
        this.field2934 = 1;
        this.field2931 = null;
    }

    public Object next() {
        if (this.field2932.field2944[this.field2934 - 1] != this.field2933) {
            class198 var1 = this.field2933;
            this.field2933 = var1.field2962;
            this.field2931 = var1;
            return var1;
        }
        class198 var2;
        do {
            if (this.field2934 >= this.field2932.field2943) {
                return null;
            }
            var2 = this.field2932.field2944[this.field2934++].field2962;
        } while (this.field2932.field2944[this.field2934 - 1] == var2);
        this.field2933 = var2.field2962;
        this.field2931 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2932.field2944[this.field2934 - 1] != this.field2933) {
            return true;
        }
        while (this.field2934 < this.field2932.field2943) {
            if (this.field2932.field2944[this.field2934++].field2962 != this.field2932.field2944[this.field2934 - 1]) {
                this.field2933 = this.field2932.field2944[this.field2934 - 1].field2962;
                return true;
            }
            this.field2933 = this.field2932.field2944[this.field2934 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2931 == null) {
            throw new IllegalStateException();
        }
        this.field2931.method3463();
        this.field2931 = null;
    }
}
