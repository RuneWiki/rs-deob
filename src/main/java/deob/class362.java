package deob;

import java.util.Iterator;

@ObfuscatedName("mx")
public class class362 implements Iterator {

    @ObfuscatedName("mx.s")
    public class363 field4099;

    @ObfuscatedName("mx.t")
    public class354 field4098;

    @ObfuscatedName("mx.v")
    public int field4097;

    @ObfuscatedName("mx.j")
    public class354 field4100 = null;

    public class362(class363 arg0) {
        this.field4099 = arg0;
        this.method5723();
    }

    @ObfuscatedName("mx.s()V")
    public void method5723() {
        this.field4098 = this.field4099.field4102[0].field3965;
        this.field4097 = 1;
        this.field4100 = null;
    }

    public Object next() {
        if (this.field4099.field4102[this.field4097 - 1] != this.field4098) {
            class354 var1 = this.field4098;
            this.field4098 = var1.field3965;
            this.field4100 = var1;
            return var1;
        }
        class354 var2;
        do {
            if (this.field4097 >= this.field4099.field4104) {
                return null;
            }
            var2 = this.field4099.field4102[this.field4097++].field3965;
        } while (this.field4099.field4102[this.field4097 - 1] == var2);
        this.field4098 = var2.field3965;
        this.field4100 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4099.field4102[this.field4097 - 1] != this.field4098) {
            return true;
        }
        while (this.field4097 < this.field4099.field4104) {
            if (this.field4099.field4102[this.field4097++].field3965 != this.field4099.field4102[this.field4097 - 1]) {
                this.field4098 = this.field4099.field4102[this.field4097 - 1].field3965;
                return true;
            }
            this.field4098 = this.field4099.field4102[this.field4097 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4100 == null) {
            throw new IllegalStateException();
        }
        this.field4100.method5447();
        this.field4100 = null;
    }
}
