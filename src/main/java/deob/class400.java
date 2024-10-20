package deob;

import java.util.Iterator;

@ObfuscatedName("oc")
public class class400 implements Iterator {

    @ObfuscatedName("oc.c")
    public class401 field4432;

    @ObfuscatedName("oc.l")
    public class392 field4431;

    @ObfuscatedName("oc.s")
    public int field4433;

    @ObfuscatedName("oc.e")
    public class392 field4430 = null;

    public class400(class401 arg0) {
        this.field4432 = arg0;
        this.method6419();
    }

    @ObfuscatedName("oc.c()V")
    public void method6419() {
        this.field4431 = this.field4432.field4435[0].field4300;
        this.field4433 = 1;
        this.field4430 = null;
    }

    public Object next() {
        if (this.field4432.field4435[this.field4433 - 1] != this.field4431) {
            class392 var1 = this.field4431;
            this.field4431 = var1.field4300;
            this.field4430 = var1;
            return var1;
        }
        class392 var2;
        do {
            if (this.field4433 >= this.field4432.field4436) {
                return null;
            }
            var2 = this.field4432.field4435[this.field4433++].field4300;
        } while (this.field4432.field4435[this.field4433 - 1] == var2);
        this.field4431 = var2.field4300;
        this.field4430 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4432.field4435[this.field4433 - 1] != this.field4431) {
            return true;
        }
        while (this.field4433 < this.field4432.field4436) {
            if (this.field4432.field4435[this.field4433++].field4300 != this.field4432.field4435[this.field4433 - 1]) {
                this.field4431 = this.field4432.field4435[this.field4433 - 1].field4300;
                return true;
            }
            this.field4431 = this.field4432.field4435[this.field4433 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4430 == null) {
            throw new IllegalStateException();
        }
        this.field4430.method6167();
        this.field4430 = null;
    }
}
