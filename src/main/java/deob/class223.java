package deob;

import java.util.Iterator;

@ObfuscatedName("hp")
public class class223 implements Iterator {

    @ObfuscatedName("hp.g")
    public class210 field2671;

    @ObfuscatedName("hp.e")
    public class217 field2672;

    @ObfuscatedName("hp.b")
    public int field2673;

    @ObfuscatedName("hp.z")
    public class217 field2674 = null;

    public class223(class210 arg0) {
        this.field2671 = arg0;
        this.method3860();
    }

    @ObfuscatedName("hp.y()V")
    public void method3860() {
        this.field2672 = this.field2671.field2634[0].field2659;
        this.field2673 = 1;
        this.field2674 = null;
    }

    public Object next() {
        if (this.field2671.field2634[this.field2673 - 1] != this.field2672) {
            class217 var1 = this.field2672;
            this.field2672 = var1.field2659;
            this.field2674 = var1;
            return var1;
        }
        class217 var2;
        do {
            if (this.field2673 >= this.field2671.field2637) {
                return null;
            }
            var2 = this.field2671.field2634[this.field2673++].field2659;
        } while (this.field2671.field2634[this.field2673 - 1] == var2);
        this.field2672 = var2.field2659;
        this.field2674 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2671.field2634[this.field2673 - 1] != this.field2672) {
            return true;
        }
        while (this.field2673 < this.field2671.field2637) {
            if (this.field2671.field2634[this.field2673++].field2659 != this.field2671.field2634[this.field2673 - 1]) {
                this.field2672 = this.field2671.field2634[this.field2673 - 1].field2659;
                return true;
            }
            this.field2672 = this.field2671.field2634[this.field2673 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2674 == null) {
            throw new IllegalStateException();
        }
        this.field2674.method3796();
        this.field2674 = null;
    }
}
