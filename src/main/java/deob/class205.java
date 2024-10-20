package deob;

import java.util.Iterator;

@ObfuscatedName("gw")
public class class205 implements Iterator {

    @ObfuscatedName("gw.b")
    public class194 field2567;

    @ObfuscatedName("gw.s")
    public class200 field2568;

    @ObfuscatedName("gw.r")
    public int field2569;

    @ObfuscatedName("gw.g")
    public class200 field2566 = null;

    public class205(class194 arg0) {
        this.field2567 = arg0;
        this.method3442();
    }

    @ObfuscatedName("gw.t()V")
    public void method3442() {
        this.field2568 = this.field2567.field2534[0].field2556;
        this.field2569 = 1;
        this.field2566 = null;
    }

    public Object next() {
        if (this.field2567.field2534[this.field2569 - 1] != this.field2568) {
            class200 var1 = this.field2568;
            this.field2568 = var1.field2556;
            this.field2566 = var1;
            return var1;
        }
        class200 var2;
        do {
            if (this.field2569 >= this.field2567.field2537) {
                return null;
            }
            var2 = this.field2567.field2534[this.field2569++].field2556;
        } while (this.field2567.field2534[this.field2569 - 1] == var2);
        this.field2568 = var2.field2556;
        this.field2566 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2567.field2534[this.field2569 - 1] != this.field2568) {
            return true;
        }
        while (this.field2569 < this.field2567.field2537) {
            if (this.field2567.field2534[this.field2569++].field2556 != this.field2567.field2534[this.field2569 - 1]) {
                this.field2568 = this.field2567.field2534[this.field2569 - 1].field2556;
                return true;
            }
            this.field2568 = this.field2567.field2534[this.field2569 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2566 == null) {
            throw new IllegalStateException();
        }
        this.field2566.method3392();
        this.field2566 = null;
    }
}
