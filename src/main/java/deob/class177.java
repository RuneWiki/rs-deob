package deob;

import java.util.Iterator;

@ObfuscatedName("fz")
public class class177 implements Iterator {

    @ObfuscatedName("fz.p")
    public class181 field2873;

    @ObfuscatedName("fz.y")
    public class191 field2870;

    @ObfuscatedName("fz.d")
    public int field2872;

    @ObfuscatedName("fz.c")
    public class191 field2871 = null;

    public class177(class181 arg0) {
        this.field2873 = arg0;
        this.method3203();
    }

    @ObfuscatedName("fz.p()V")
    public void method3203() {
        this.field2870 = this.field2873.field2882[0].field2902;
        this.field2872 = 1;
        this.field2871 = null;
    }

    public Object next() {
        if (this.field2873.field2882[this.field2872 - 1] != this.field2870) {
            class191 var1 = this.field2870;
            this.field2870 = var1.field2902;
            this.field2871 = var1;
            return var1;
        }
        class191 var2;
        do {
            if (this.field2872 >= this.field2873.field2883) {
                return null;
            }
            var2 = this.field2873.field2882[this.field2872++].field2902;
        } while (this.field2873.field2882[this.field2872 - 1] == var2);
        this.field2870 = var2.field2902;
        this.field2871 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2873.field2882[this.field2872 - 1] != this.field2870) {
            return true;
        }
        while (this.field2872 < this.field2873.field2883) {
            if (this.field2873.field2882[this.field2872++].field2902 != this.field2873.field2882[this.field2872 - 1]) {
                this.field2870 = this.field2873.field2882[this.field2872 - 1].field2902;
                return true;
            }
            this.field2870 = this.field2873.field2882[this.field2872 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2871 == null) {
            throw new IllegalStateException();
        }
        this.field2871.method3358();
        this.field2871 = null;
    }
}
