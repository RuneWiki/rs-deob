package deob;

import java.util.Iterator;

@ObfuscatedName("fu")
public class class171 implements Iterator {

    @ObfuscatedName("fu.y")
    public class175 field2805;

    @ObfuscatedName("fu.u")
    public class183 field2803;

    @ObfuscatedName("fu.k")
    public int field2804;

    @ObfuscatedName("fu.v")
    public class183 field2802 = null;

    public class171(class175 arg0) {
        this.field2805 = arg0;
        this.method3154();
    }

    @ObfuscatedName("fu.y()V")
    public void method3154() {
        this.field2803 = this.field2805.field2815[0].field2829;
        this.field2804 = 1;
        this.field2802 = null;
    }

    public Object next() {
        if (this.field2805.field2815[this.field2804 - 1] != this.field2803) {
            class183 var1 = this.field2803;
            this.field2803 = var1.field2829;
            this.field2802 = var1;
            return var1;
        }
        class183 var2;
        do {
            if (this.field2804 >= this.field2805.field2814) {
                return null;
            }
            var2 = this.field2805.field2815[this.field2804++].field2829;
        } while (this.field2805.field2815[this.field2804 - 1] == var2);
        this.field2803 = var2.field2829;
        this.field2802 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2805.field2815[this.field2804 - 1] != this.field2803) {
            return true;
        }
        while (this.field2804 < this.field2805.field2814) {
            if (this.field2805.field2815[this.field2804++].field2829 != this.field2805.field2815[this.field2804 - 1]) {
                this.field2803 = this.field2805.field2815[this.field2804 - 1].field2829;
                return true;
            }
            this.field2803 = this.field2805.field2815[this.field2804 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2802 == null) {
            throw new IllegalStateException();
        }
        this.field2802.method3268();
        this.field2802 = null;
    }
}
