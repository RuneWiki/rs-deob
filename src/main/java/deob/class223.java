package deob;

import java.util.Iterator;

@ObfuscatedName("hh")
public class class223 implements Iterator {

    @ObfuscatedName("hh.c")
    public class210 field2657;

    @ObfuscatedName("hh.i")
    public class217 field2658;

    @ObfuscatedName("hh.o")
    public int field2656;

    @ObfuscatedName("hh.j")
    public class217 field2659 = null;

    public class223(class210 arg0) {
        this.field2657 = arg0;
        this.method3772();
    }

    @ObfuscatedName("hh.z()V")
    public void method3772() {
        this.field2658 = this.field2657.field2619[0].field2643;
        this.field2656 = 1;
        this.field2659 = null;
    }

    public Object next() {
        if (this.field2657.field2619[this.field2656 - 1] != this.field2658) {
            class217 var1 = this.field2658;
            this.field2658 = var1.field2643;
            this.field2659 = var1;
            return var1;
        }
        class217 var2;
        do {
            if (this.field2656 >= this.field2657.field2622) {
                return null;
            }
            var2 = this.field2657.field2619[this.field2656++].field2643;
        } while (this.field2657.field2619[this.field2656 - 1] == var2);
        this.field2658 = var2.field2643;
        this.field2659 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2657.field2619[this.field2656 - 1] != this.field2658) {
            return true;
        }
        while (this.field2656 < this.field2657.field2622) {
            if (this.field2657.field2619[this.field2656++].field2643 != this.field2657.field2619[this.field2656 - 1]) {
                this.field2658 = this.field2657.field2619[this.field2656 - 1].field2643;
                return true;
            }
            this.field2658 = this.field2657.field2619[this.field2656 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2659 == null) {
            throw new IllegalStateException();
        }
        this.field2659.method3710();
        this.field2659 = null;
    }
}
