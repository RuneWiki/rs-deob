package deob;

import java.util.Iterator;

@ObfuscatedName("fr")
public class class175 implements Iterator {

    @ObfuscatedName("fr.e")
    public class179 field2865;

    @ObfuscatedName("fr.v")
    public class189 field2864;

    @ObfuscatedName("fr.k")
    public int field2866;

    @ObfuscatedName("fr.g")
    public class189 field2863 = null;

    public class175(class179 arg0) {
        this.field2865 = arg0;
        this.method3171();
    }

    @ObfuscatedName("fr.e()V")
    public void method3171() {
        this.field2864 = this.field2865.field2876[0].field2895;
        this.field2866 = 1;
        this.field2863 = null;
    }

    public Object next() {
        if (this.field2865.field2876[this.field2866 - 1] != this.field2864) {
            class189 var1 = this.field2864;
            this.field2864 = var1.field2895;
            this.field2863 = var1;
            return var1;
        }
        class189 var2;
        do {
            if (this.field2866 >= this.field2865.field2877) {
                return null;
            }
            var2 = this.field2865.field2876[this.field2866++].field2895;
        } while (this.field2865.field2876[this.field2866 - 1] == var2);
        this.field2864 = var2.field2895;
        this.field2863 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2865.field2876[this.field2866 - 1] != this.field2864) {
            return true;
        }
        while (this.field2866 < this.field2865.field2877) {
            if (this.field2865.field2876[this.field2866++].field2895 != this.field2865.field2876[this.field2866 - 1]) {
                this.field2864 = this.field2865.field2876[this.field2866 - 1].field2895;
                return true;
            }
            this.field2864 = this.field2865.field2876[this.field2866 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2863 == null) {
            throw new IllegalStateException();
        }
        this.field2863.method3324();
        this.field2863 = null;
    }
}
