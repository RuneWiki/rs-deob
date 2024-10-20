package deob;

import java.util.Iterator;

@ObfuscatedName("fq")
public class class172 implements Iterator {

    @ObfuscatedName("fq.z")
    public class176 field2828;

    @ObfuscatedName("fq.j")
    public class184 field2831;

    @ObfuscatedName("fq.a")
    public int field2830;

    @ObfuscatedName("fq.y")
    public class184 field2829 = null;

    public class172(class176 arg0) {
        this.field2828 = arg0;
        this.method3176();
    }

    @ObfuscatedName("fq.z()V")
    public void method3176() {
        this.field2831 = this.field2828.field2840[0].field2856;
        this.field2830 = 1;
        this.field2829 = null;
    }

    public Object next() {
        if (this.field2828.field2840[this.field2830 - 1] != this.field2831) {
            class184 var1 = this.field2831;
            this.field2831 = var1.field2856;
            this.field2829 = var1;
            return var1;
        }
        class184 var2;
        do {
            if (this.field2830 >= this.field2828.field2841) {
                return null;
            }
            var2 = this.field2828.field2840[this.field2830++].field2856;
        } while (this.field2828.field2840[this.field2830 - 1] == var2);
        this.field2831 = var2.field2856;
        this.field2829 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2828.field2840[this.field2830 - 1] != this.field2831) {
            return true;
        }
        while (this.field2830 < this.field2828.field2841) {
            if (this.field2828.field2840[this.field2830++].field2856 != this.field2828.field2840[this.field2830 - 1]) {
                this.field2831 = this.field2828.field2840[this.field2830 - 1].field2856;
                return true;
            }
            this.field2831 = this.field2828.field2840[this.field2830 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2829 == null) {
            throw new IllegalStateException();
        }
        this.field2829.method3311();
        this.field2829 = null;
    }
}
