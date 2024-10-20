package deob;

import java.util.Iterator;

@ObfuscatedName("hn")
public class class213 implements Iterator {

    @ObfuscatedName("hn.f")
    public class200 field2510;

    @ObfuscatedName("hn.l")
    public class207 field2508;

    @ObfuscatedName("hn.w")
    public int field2511;

    @ObfuscatedName("hn.s")
    public class207 field2509 = null;

    public class213(class200 arg0) {
        this.field2510 = arg0;
        this.method3873();
    }

    @ObfuscatedName("hn.z()V")
    public void method3873() {
        this.field2508 = this.field2510.field2471[0].field2495;
        this.field2511 = 1;
        this.field2509 = null;
    }

    public Object next() {
        if (this.field2510.field2471[this.field2511 - 1] != this.field2508) {
            class207 var1 = this.field2508;
            this.field2508 = var1.field2495;
            this.field2509 = var1;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2511 >= this.field2510.field2473) {
                return null;
            }
            var2 = this.field2510.field2471[this.field2511++].field2495;
        } while (this.field2510.field2471[this.field2511 - 1] == var2);
        this.field2508 = var2.field2495;
        this.field2509 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2510.field2471[this.field2511 - 1] != this.field2508) {
            return true;
        }
        while (this.field2511 < this.field2510.field2473) {
            if (this.field2510.field2471[this.field2511++].field2495 != this.field2510.field2471[this.field2511 - 1]) {
                this.field2508 = this.field2510.field2471[this.field2511 - 1].field2495;
                return true;
            }
            this.field2508 = this.field2510.field2471[this.field2511 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2509 == null) {
            throw new IllegalStateException();
        }
        this.field2509.method3818();
        this.field2509 = null;
    }
}
