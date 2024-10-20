package deob;

import java.util.Iterator;

@ObfuscatedName("ha")
public class class213 implements Iterator {

    @ObfuscatedName("ha.g")
    public class200 field2509;

    @ObfuscatedName("ha.r")
    public class207 field2510;

    @ObfuscatedName("ha.e")
    public int field2511;

    @ObfuscatedName("ha.q")
    public class207 field2512 = null;

    public class213(class200 arg0) {
        this.field2509 = arg0;
        this.method4002();
    }

    @ObfuscatedName("ha.m()V")
    public void method4002() {
        this.field2510 = this.field2509.field2473[0].field2496;
        this.field2511 = 1;
        this.field2512 = null;
    }

    public Object next() {
        if (this.field2509.field2473[this.field2511 - 1] != this.field2510) {
            class207 var1 = this.field2510;
            this.field2510 = var1.field2496;
            this.field2512 = var1;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2511 >= this.field2509.field2471) {
                return null;
            }
            var2 = this.field2509.field2473[this.field2511++].field2496;
        } while (this.field2509.field2473[this.field2511 - 1] == var2);
        this.field2510 = var2.field2496;
        this.field2512 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2509.field2473[this.field2511 - 1] != this.field2510) {
            return true;
        }
        while (this.field2511 < this.field2509.field2471) {
            if (this.field2509.field2473[this.field2511++].field2496 != this.field2509.field2473[this.field2511 - 1]) {
                this.field2510 = this.field2509.field2473[this.field2511 - 1].field2496;
                return true;
            }
            this.field2510 = this.field2509.field2473[this.field2511 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2512 == null) {
            throw new IllegalStateException();
        }
        this.field2512.method3952();
        this.field2512 = null;
    }
}
