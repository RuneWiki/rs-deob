package deob;

import java.util.Iterator;

@ObfuscatedName("gv")
public class class198 implements Iterator {

    @ObfuscatedName("gv.e")
    public class187 field2466;

    @ObfuscatedName("gv.o")
    public class193 field2464;

    @ObfuscatedName("gv.m")
    public int field2465;

    @ObfuscatedName("gv.g")
    public class193 field2463 = null;

    public class198(class187 arg0) {
        this.field2466 = arg0;
        this.method3372();
    }

    @ObfuscatedName("gv.q()V")
    public void method3372() {
        this.field2464 = this.field2466.field2432[0].field2453;
        this.field2465 = 1;
        this.field2463 = null;
    }

    public Object next() {
        if (this.field2466.field2432[this.field2465 - 1] != this.field2464) {
            class193 var1 = this.field2464;
            this.field2464 = var1.field2453;
            this.field2463 = var1;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2465 >= this.field2466.field2434) {
                return null;
            }
            var2 = this.field2466.field2432[this.field2465++].field2453;
        } while (this.field2466.field2432[this.field2465 - 1] == var2);
        this.field2464 = var2.field2453;
        this.field2463 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2466.field2432[this.field2465 - 1] != this.field2464) {
            return true;
        }
        while (this.field2465 < this.field2466.field2434) {
            if (this.field2466.field2432[this.field2465++].field2453 != this.field2466.field2432[this.field2465 - 1]) {
                this.field2464 = this.field2466.field2432[this.field2465 - 1].field2453;
                return true;
            }
            this.field2464 = this.field2466.field2432[this.field2465 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2463 == null) {
            throw new IllegalStateException();
        }
        this.field2463.method3304();
        this.field2463 = null;
    }
}
