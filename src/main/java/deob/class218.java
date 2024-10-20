package deob;

import java.util.Iterator;

@ObfuscatedName("hu")
public class class218 implements Iterator {

    @ObfuscatedName("hu.n")
    public class205 field2515;

    @ObfuscatedName("hu.h")
    public class212 field2514;

    @ObfuscatedName("hu.l")
    public int field2516;

    @ObfuscatedName("hu.g")
    public class212 field2513 = null;

    public class218(class205 arg0) {
        this.field2515 = arg0;
        this.method4040();
    }

    @ObfuscatedName("hu.j()V")
    public void method4040() {
        this.field2514 = this.field2515.field2476[0].field2500;
        this.field2516 = 1;
        this.field2513 = null;
    }

    public Object next() {
        if (this.field2515.field2476[this.field2516 - 1] != this.field2514) {
            class212 var1 = this.field2514;
            this.field2514 = var1.field2500;
            this.field2513 = var1;
            return var1;
        }
        class212 var2;
        do {
            if (this.field2516 >= this.field2515.field2479) {
                return null;
            }
            var2 = this.field2515.field2476[this.field2516++].field2500;
        } while (this.field2515.field2476[this.field2516 - 1] == var2);
        this.field2514 = var2.field2500;
        this.field2513 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2515.field2476[this.field2516 - 1] != this.field2514) {
            return true;
        }
        while (this.field2516 < this.field2515.field2479) {
            if (this.field2515.field2476[this.field2516++].field2500 != this.field2515.field2476[this.field2516 - 1]) {
                this.field2514 = this.field2515.field2476[this.field2516 - 1].field2500;
                return true;
            }
            this.field2514 = this.field2515.field2476[this.field2516 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2513 == null) {
            throw new IllegalStateException();
        }
        this.field2513.method3973();
        this.field2513 = null;
    }
}
