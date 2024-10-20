package deob;

import java.util.Iterator;

@ObfuscatedName("fo")
public class class171 implements Iterator {

    @ObfuscatedName("fo.e")
    public class175 field2818;

    @ObfuscatedName("fo.p")
    public class183 field2816;

    @ObfuscatedName("fo.a")
    public int field2817;

    @ObfuscatedName("fo.g")
    public class183 field2819 = null;

    public class171(class175 arg0) {
        this.field2818 = arg0;
        this.method3170();
    }

    @ObfuscatedName("fo.e()V")
    public void method3170() {
        this.field2816 = this.field2818.field2828[0].field2844;
        this.field2817 = 1;
        this.field2819 = null;
    }

    public Object next() {
        if (this.field2818.field2828[this.field2817 - 1] != this.field2816) {
            class183 var1 = this.field2816;
            this.field2816 = var1.field2844;
            this.field2819 = var1;
            return var1;
        }
        class183 var2;
        do {
            if (this.field2817 >= this.field2818.field2829) {
                return null;
            }
            var2 = this.field2818.field2828[this.field2817++].field2844;
        } while (this.field2818.field2828[this.field2817 - 1] == var2);
        this.field2816 = var2.field2844;
        this.field2819 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2818.field2828[this.field2817 - 1] != this.field2816) {
            return true;
        }
        while (this.field2817 < this.field2818.field2829) {
            if (this.field2818.field2828[this.field2817++].field2844 != this.field2818.field2828[this.field2817 - 1]) {
                this.field2816 = this.field2818.field2828[this.field2817 - 1].field2844;
                return true;
            }
            this.field2816 = this.field2818.field2828[this.field2817 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2819 == null) {
            throw new IllegalStateException();
        }
        this.field2819.method3307();
        this.field2819 = null;
    }
}
