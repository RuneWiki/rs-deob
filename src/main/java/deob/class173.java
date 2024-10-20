package deob;

import java.util.Iterator;

@ObfuscatedName("fn")
public class class173 implements Iterator {

    @ObfuscatedName("fn.g")
    public class177 field2854;

    @ObfuscatedName("fn.i")
    public class187 field2857;

    @ObfuscatedName("fn.k")
    public int field2856;

    @ObfuscatedName("fn.e")
    public class187 field2855 = null;

    public class173(class177 arg0) {
        this.field2854 = arg0;
        this.method3150();
    }

    @ObfuscatedName("fn.g()V")
    public void method3150() {
        this.field2857 = this.field2854.field2867[0].field2886;
        this.field2856 = 1;
        this.field2855 = null;
    }

    public Object next() {
        if (this.field2854.field2867[this.field2856 - 1] != this.field2857) {
            class187 var1 = this.field2857;
            this.field2857 = var1.field2886;
            this.field2855 = var1;
            return var1;
        }
        class187 var2;
        do {
            if (this.field2856 >= this.field2854.field2868) {
                return null;
            }
            var2 = this.field2854.field2867[this.field2856++].field2886;
        } while (this.field2854.field2867[this.field2856 - 1] == var2);
        this.field2857 = var2.field2886;
        this.field2855 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2854.field2867[this.field2856 - 1] != this.field2857) {
            return true;
        }
        while (this.field2856 < this.field2854.field2868) {
            if (this.field2854.field2867[this.field2856++].field2886 != this.field2854.field2867[this.field2856 - 1]) {
                this.field2857 = this.field2854.field2867[this.field2856 - 1].field2886;
                return true;
            }
            this.field2857 = this.field2854.field2867[this.field2856 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2855 == null) {
            throw new IllegalStateException();
        }
        this.field2855.method3304();
        this.field2855 = null;
    }
}
