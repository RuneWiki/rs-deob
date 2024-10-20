package deob;

import java.util.Iterator;

@ObfuscatedName("hr")
public class class218 implements Iterator {

    @ObfuscatedName("hr.a")
    public class205 field2524;

    @ObfuscatedName("hr.s")
    public class212 field2526;

    @ObfuscatedName("hr.g")
    public int field2523;

    @ObfuscatedName("hr.x")
    public class212 field2525 = null;

    public class218(class205 arg0) {
        this.field2524 = arg0;
        this.method4014();
    }

    @ObfuscatedName("hr.h()V")
    public void method4014() {
        this.field2526 = this.field2524.field2485[0].field2511;
        this.field2523 = 1;
        this.field2525 = null;
    }

    public Object next() {
        if (this.field2524.field2485[this.field2523 - 1] != this.field2526) {
            class212 var1 = this.field2526;
            this.field2526 = var1.field2511;
            this.field2525 = var1;
            return var1;
        }
        class212 var2;
        do {
            if (this.field2523 >= this.field2524.field2486) {
                return null;
            }
            var2 = this.field2524.field2485[this.field2523++].field2511;
        } while (this.field2524.field2485[this.field2523 - 1] == var2);
        this.field2526 = var2.field2511;
        this.field2525 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2524.field2485[this.field2523 - 1] != this.field2526) {
            return true;
        }
        while (this.field2523 < this.field2524.field2486) {
            if (this.field2524.field2485[this.field2523++].field2511 != this.field2524.field2485[this.field2523 - 1]) {
                this.field2526 = this.field2524.field2485[this.field2523 - 1].field2511;
                return true;
            }
            this.field2526 = this.field2524.field2485[this.field2523 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2525 == null) {
            throw new IllegalStateException();
        }
        this.field2525.method3960();
        this.field2525 = null;
    }
}
