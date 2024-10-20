package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public class class185 implements Iterator {

    @ObfuscatedName("gx.n")
    public class189 field2976;

    @ObfuscatedName("gx.d")
    public class199 field2979;

    @ObfuscatedName("gx.z")
    public int field2978;

    @ObfuscatedName("gx.y")
    public class199 field2977 = null;

    public class185(class189 arg0) {
        this.field2976 = arg0;
        this.method3425();
    }

    @ObfuscatedName("gx.n()V")
    public void method3425() {
        this.field2979 = this.field2976.field2989[0].field3008;
        this.field2978 = 1;
        this.field2977 = null;
    }

    public Object next() {
        if (this.field2976.field2989[this.field2978 - 1] != this.field2979) {
            class199 var1 = this.field2979;
            this.field2979 = var1.field3008;
            this.field2977 = var1;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2978 >= this.field2976.field2990) {
                return null;
            }
            var2 = this.field2976.field2989[this.field2978++].field3008;
        } while (this.field2976.field2989[this.field2978 - 1] == var2);
        this.field2979 = var2.field3008;
        this.field2977 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2976.field2989[this.field2978 - 1] != this.field2979) {
            return true;
        }
        while (this.field2978 < this.field2976.field2990) {
            if (this.field2976.field2989[this.field2978++].field3008 != this.field2976.field2989[this.field2978 - 1]) {
                this.field2979 = this.field2976.field2989[this.field2978 - 1].field3008;
                return true;
            }
            this.field2979 = this.field2976.field2989[this.field2978 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2977 == null) {
            throw new IllegalStateException();
        }
        this.field2977.method3562();
        this.field2977 = null;
    }
}
