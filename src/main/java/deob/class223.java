package deob;

import java.util.Iterator;

@ObfuscatedName("hc")
public class class223 implements Iterator {

    @ObfuscatedName("hc.o")
    public class210 field2665;

    @ObfuscatedName("hc.k")
    public class217 field2666;

    @ObfuscatedName("hc.t")
    public int field2668;

    @ObfuscatedName("hc.d")
    public class217 field2667 = null;

    public class223(class210 arg0) {
        this.field2665 = arg0;
        this.method3744();
    }

    @ObfuscatedName("hc.a()V")
    public void method3744() {
        this.field2666 = this.field2665.field2628[0].field2653;
        this.field2668 = 1;
        this.field2667 = null;
    }

    public Object next() {
        if (this.field2665.field2628[this.field2668 - 1] != this.field2666) {
            class217 var1 = this.field2666;
            this.field2666 = var1.field2653;
            this.field2667 = var1;
            return var1;
        }
        class217 var2;
        do {
            if (this.field2668 >= this.field2665.field2631) {
                return null;
            }
            var2 = this.field2665.field2628[this.field2668++].field2653;
        } while (this.field2665.field2628[this.field2668 - 1] == var2);
        this.field2666 = var2.field2653;
        this.field2667 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2665.field2628[this.field2668 - 1] != this.field2666) {
            return true;
        }
        while (this.field2668 < this.field2665.field2631) {
            if (this.field2665.field2628[this.field2668++].field2653 != this.field2665.field2628[this.field2668 - 1]) {
                this.field2666 = this.field2665.field2628[this.field2668 - 1].field2653;
                return true;
            }
            this.field2666 = this.field2665.field2628[this.field2668 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2667 == null) {
            throw new IllegalStateException();
        }
        this.field2667.method3681();
        this.field2667 = null;
    }
}
