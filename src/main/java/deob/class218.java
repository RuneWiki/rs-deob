package deob;

import java.util.Iterator;

@ObfuscatedName("hd")
public class class218 implements Iterator {

    @ObfuscatedName("hd.b")
    public class207 field2623;

    @ObfuscatedName("hd.q")
    public class213 field2622;

    @ObfuscatedName("hd.o")
    public int field2624;

    @ObfuscatedName("hd.p")
    public class213 field2625 = null;

    public class218(class207 arg0) {
        this.field2623 = arg0;
        this.method3784();
    }

    @ObfuscatedName("hd.l()V")
    public void method3784() {
        this.field2622 = this.field2623.field2593[0].field2612;
        this.field2624 = 1;
        this.field2625 = null;
    }

    public Object next() {
        if (this.field2623.field2593[this.field2624 - 1] != this.field2622) {
            class213 var1 = this.field2622;
            this.field2622 = var1.field2612;
            this.field2625 = var1;
            return var1;
        }
        class213 var2;
        do {
            if (this.field2624 >= this.field2623.field2591) {
                return null;
            }
            var2 = this.field2623.field2593[this.field2624++].field2612;
        } while (this.field2623.field2593[this.field2624 - 1] == var2);
        this.field2622 = var2.field2612;
        this.field2625 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2623.field2593[this.field2624 - 1] != this.field2622) {
            return true;
        }
        while (this.field2624 < this.field2623.field2591) {
            if (this.field2623.field2593[this.field2624++].field2612 != this.field2623.field2593[this.field2624 - 1]) {
                this.field2622 = this.field2623.field2593[this.field2624 - 1].field2612;
                return true;
            }
            this.field2622 = this.field2623.field2593[this.field2624 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2625 == null) {
            throw new IllegalStateException();
        }
        this.field2625.method3726();
        this.field2625 = null;
    }
}
