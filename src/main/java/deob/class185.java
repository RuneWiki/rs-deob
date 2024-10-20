package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public class class185 implements Iterator {

    @ObfuscatedName("gd.n")
    public class189 field2983;

    @ObfuscatedName("gd.w")
    public class199 field2982;

    @ObfuscatedName("gd.i")
    public int field2981;

    @ObfuscatedName("gd.e")
    public class199 field2984 = null;

    public class185(class189 arg0) {
        this.field2983 = arg0;
        this.method3326();
    }

    @ObfuscatedName("gd.n()V")
    public void method3326() {
        this.field2982 = this.field2983.field2993[0].field3014;
        this.field2981 = 1;
        this.field2984 = null;
    }

    public Object next() {
        if (this.field2983.field2993[this.field2981 - 1] != this.field2982) {
            class199 var1 = this.field2982;
            this.field2982 = var1.field3014;
            this.field2984 = var1;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2981 >= this.field2983.field2994) {
                return null;
            }
            var2 = this.field2983.field2993[this.field2981++].field3014;
        } while (this.field2983.field2993[this.field2981 - 1] == var2);
        this.field2982 = var2.field3014;
        this.field2984 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2983.field2993[this.field2981 - 1] != this.field2982) {
            return true;
        }
        while (this.field2981 < this.field2983.field2994) {
            if (this.field2983.field2993[this.field2981++].field3014 != this.field2983.field2993[this.field2981 - 1]) {
                this.field2982 = this.field2983.field2993[this.field2981 - 1].field3014;
                return true;
            }
            this.field2982 = this.field2983.field2993[this.field2981 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2984 == null) {
            throw new IllegalStateException();
        }
        this.field2984.method3474();
        this.field2984 = null;
    }
}
