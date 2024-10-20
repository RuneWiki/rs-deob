package deob;

import java.util.Iterator;

@ObfuscatedName("mp")
public class class361 implements Iterator {

    @ObfuscatedName("mp.f")
    public class362 field4067;

    @ObfuscatedName("mp.e")
    public class353 field4065;

    @ObfuscatedName("mp.v")
    public int field4068;

    @ObfuscatedName("mp.y")
    public class353 field4066 = null;

    public class361(class362 arg0) {
        this.field4067 = arg0;
        this.method5662();
    }

    @ObfuscatedName("mp.f()V")
    public void method5662() {
        this.field4065 = this.field4067.field4070[0].field3935;
        this.field4068 = 1;
        this.field4066 = null;
    }

    public Object next() {
        if (this.field4067.field4070[this.field4068 - 1] != this.field4065) {
            class353 var1 = this.field4065;
            this.field4065 = var1.field3935;
            this.field4066 = var1;
            return var1;
        }
        class353 var2;
        do {
            if (this.field4068 >= this.field4067.field4071) {
                return null;
            }
            var2 = this.field4067.field4070[this.field4068++].field3935;
        } while (this.field4067.field4070[this.field4068 - 1] == var2);
        this.field4065 = var2.field3935;
        this.field4066 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4067.field4070[this.field4068 - 1] != this.field4065) {
            return true;
        }
        while (this.field4068 < this.field4067.field4071) {
            if (this.field4067.field4070[this.field4068++].field3935 != this.field4067.field4070[this.field4068 - 1]) {
                this.field4065 = this.field4067.field4070[this.field4068 - 1].field3935;
                return true;
            }
            this.field4065 = this.field4067.field4070[this.field4068 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4066 == null) {
            throw new IllegalStateException();
        }
        this.field4066.method5407();
        this.field4066 = null;
    }
}
