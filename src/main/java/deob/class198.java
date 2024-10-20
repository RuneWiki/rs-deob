package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public class class198 implements Iterator {

    @ObfuscatedName("gr.m")
    public class202 field3138;

    @ObfuscatedName("gr.w")
    public class212 field3136;

    @ObfuscatedName("gr.e")
    public int field3137;

    @ObfuscatedName("gr.o")
    public class212 field3135 = null;

    public class198(class202 arg0) {
        this.field3138 = arg0;
        this.method3566();
    }

    @ObfuscatedName("gr.m()V")
    public void method3566() {
        this.field3136 = this.field3138.field3148[0].field3169;
        this.field3137 = 1;
        this.field3135 = null;
    }

    public Object next() {
        if (this.field3138.field3148[this.field3137 - 1] != this.field3136) {
            class212 var1 = this.field3136;
            this.field3136 = var1.field3169;
            this.field3135 = var1;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3137 >= this.field3138.field3147) {
                return null;
            }
            var2 = this.field3138.field3148[this.field3137++].field3169;
        } while (this.field3138.field3148[this.field3137 - 1] == var2);
        this.field3136 = var2.field3169;
        this.field3135 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3138.field3148[this.field3137 - 1] != this.field3136) {
            return true;
        }
        while (this.field3137 < this.field3138.field3147) {
            if (this.field3138.field3148[this.field3137++].field3169 != this.field3138.field3148[this.field3137 - 1]) {
                this.field3136 = this.field3138.field3148[this.field3137 - 1].field3169;
                return true;
            }
            this.field3136 = this.field3138.field3148[this.field3137 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3135 == null) {
            throw new IllegalStateException();
        }
        this.field3135.method3729();
        this.field3135 = null;
    }
}
