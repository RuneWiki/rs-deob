package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public class class199 implements Iterator {

    @ObfuscatedName("gs.e")
    public class188 field2463;

    @ObfuscatedName("gs.n")
    public class194 field2462;

    @ObfuscatedName("gs.g")
    public int field2464;

    @ObfuscatedName("gs.y")
    public class194 field2465 = null;

    public class199(class188 arg0) {
        this.field2463 = arg0;
        this.method3395();
    }

    @ObfuscatedName("gs.d()V")
    public void method3395() {
        this.field2462 = this.field2463.field2431[0].field2452;
        this.field2464 = 1;
        this.field2465 = null;
    }

    public Object next() {
        if (this.field2463.field2431[this.field2464 - 1] != this.field2462) {
            class194 var1 = this.field2462;
            this.field2462 = var1.field2452;
            this.field2465 = var1;
            return var1;
        }
        class194 var2;
        do {
            if (this.field2464 >= this.field2463.field2434) {
                return null;
            }
            var2 = this.field2463.field2431[this.field2464++].field2452;
        } while (this.field2463.field2431[this.field2464 - 1] == var2);
        this.field2462 = var2.field2452;
        this.field2465 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2463.field2431[this.field2464 - 1] != this.field2462) {
            return true;
        }
        while (this.field2464 < this.field2463.field2434) {
            if (this.field2463.field2431[this.field2464++].field2452 != this.field2463.field2431[this.field2464 - 1]) {
                this.field2462 = this.field2463.field2431[this.field2464 - 1].field2452;
                return true;
            }
            this.field2462 = this.field2463.field2431[this.field2464 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2465 == null) {
            throw new IllegalStateException();
        }
        this.field2465.method3333();
        this.field2465 = null;
    }
}
