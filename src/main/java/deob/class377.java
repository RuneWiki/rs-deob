package deob;

import java.util.Iterator;

@ObfuscatedName("np")
public class class377 implements Iterator {

    @ObfuscatedName("np.n")
    public class378 field4182;

    @ObfuscatedName("np.c")
    public class369 field4183;

    @ObfuscatedName("np.m")
    public int field4184;

    @ObfuscatedName("np.k")
    public class369 field4185 = null;

    public class377(class378 arg0) {
        this.field4182 = arg0;
        this.method5990();
    }

    @ObfuscatedName("np.n()V")
    public void method5990() {
        this.field4183 = this.field4182.field4187[0].field4055;
        this.field4184 = 1;
        this.field4185 = null;
    }

    public Object next() {
        if (this.field4182.field4187[this.field4184 - 1] != this.field4183) {
            class369 var1 = this.field4183;
            this.field4183 = var1.field4055;
            this.field4185 = var1;
            return var1;
        }
        class369 var2;
        do {
            if (this.field4184 >= this.field4182.field4189) {
                return null;
            }
            var2 = this.field4182.field4187[this.field4184++].field4055;
        } while (this.field4182.field4187[this.field4184 - 1] == var2);
        this.field4183 = var2.field4055;
        this.field4185 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4182.field4187[this.field4184 - 1] != this.field4183) {
            return true;
        }
        while (this.field4184 < this.field4182.field4189) {
            if (this.field4182.field4187[this.field4184++].field4055 != this.field4182.field4187[this.field4184 - 1]) {
                this.field4183 = this.field4182.field4187[this.field4184 - 1].field4055;
                return true;
            }
            this.field4183 = this.field4182.field4187[this.field4184 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4185 == null) {
            throw new IllegalStateException();
        }
        this.field4185.method5732();
        this.field4185 = null;
    }
}
