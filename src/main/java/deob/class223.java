package deob;

import java.util.Iterator;

@ObfuscatedName("hx")
public class class223 implements Iterator {

    @ObfuscatedName("hx.d")
    public class210 field2668;

    @ObfuscatedName("hx.z")
    public class217 field2667;

    @ObfuscatedName("hx.n")
    public int field2666;

    @ObfuscatedName("hx.r")
    public class217 field2669 = null;

    public class223(class210 arg0) {
        this.field2668 = arg0;
        this.method3845();
    }

    @ObfuscatedName("hx.t()V")
    public void method3845() {
        this.field2667 = this.field2668.field2629[0].field2654;
        this.field2666 = 1;
        this.field2669 = null;
    }

    public Object next() {
        if (this.field2668.field2629[this.field2666 - 1] != this.field2667) {
            class217 var1 = this.field2667;
            this.field2667 = var1.field2654;
            this.field2669 = var1;
            return var1;
        }
        class217 var2;
        do {
            if (this.field2666 >= this.field2668.field2628) {
                return null;
            }
            var2 = this.field2668.field2629[this.field2666++].field2654;
        } while (this.field2668.field2629[this.field2666 - 1] == var2);
        this.field2667 = var2.field2654;
        this.field2669 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2668.field2629[this.field2666 - 1] != this.field2667) {
            return true;
        }
        while (this.field2666 < this.field2668.field2628) {
            if (this.field2668.field2629[this.field2666++].field2654 != this.field2668.field2629[this.field2666 - 1]) {
                this.field2667 = this.field2668.field2629[this.field2666 - 1].field2654;
                return true;
            }
            this.field2667 = this.field2668.field2629[this.field2666 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2669 == null) {
            throw new IllegalStateException();
        }
        this.field2669.method3785();
        this.field2669 = null;
    }
}
