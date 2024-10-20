package deob;

import java.util.Iterator;

@ObfuscatedName("hr")
public class class213 implements Iterator {

    @ObfuscatedName("hr.f")
    public class200 field2498;

    @ObfuscatedName("hr.h")
    public class207 field2501;

    @ObfuscatedName("hr.e")
    public int field2500;

    @ObfuscatedName("hr.b")
    public class207 field2499 = null;

    public class213(class200 arg0) {
        this.field2498 = arg0;
        this.method3862();
    }

    @ObfuscatedName("hr.w()V")
    public void method3862() {
        this.field2501 = this.field2498.field2461[0].field2487;
        this.field2500 = 1;
        this.field2499 = null;
    }

    public Object next() {
        if (this.field2498.field2461[this.field2500 - 1] != this.field2501) {
            class207 var1 = this.field2501;
            this.field2501 = var1.field2487;
            this.field2499 = var1;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2500 >= this.field2498.field2460) {
                return null;
            }
            var2 = this.field2498.field2461[this.field2500++].field2487;
        } while (this.field2498.field2461[this.field2500 - 1] == var2);
        this.field2501 = var2.field2487;
        this.field2499 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2498.field2461[this.field2500 - 1] != this.field2501) {
            return true;
        }
        while (this.field2500 < this.field2498.field2460) {
            if (this.field2498.field2461[this.field2500++].field2487 != this.field2498.field2461[this.field2500 - 1]) {
                this.field2501 = this.field2498.field2461[this.field2500 - 1].field2487;
                return true;
            }
            this.field2501 = this.field2498.field2461[this.field2500 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2499 == null) {
            throw new IllegalStateException();
        }
        this.field2499.method3812();
        this.field2499 = null;
    }
}
