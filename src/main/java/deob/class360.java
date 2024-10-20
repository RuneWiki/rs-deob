package deob;

import java.util.Iterator;

@ObfuscatedName("mj")
public class class360 implements Iterator {

    @ObfuscatedName("mj.v")
    public class361 field4064;

    @ObfuscatedName("mj.n")
    public class352 field4065;

    @ObfuscatedName("mj.f")
    public int field4066;

    @ObfuscatedName("mj.y")
    public class352 field4067 = null;

    public class360(class361 arg0) {
        this.field4064 = arg0;
        this.method5735();
    }

    @ObfuscatedName("mj.v()V")
    public void method5735() {
        this.field4065 = this.field4064.field4069[0].field3939;
        this.field4066 = 1;
        this.field4067 = null;
    }

    public Object next() {
        if (this.field4064.field4069[this.field4066 - 1] != this.field4065) {
            class352 var1 = this.field4065;
            this.field4065 = var1.field3939;
            this.field4067 = var1;
            return var1;
        }
        class352 var2;
        do {
            if (this.field4066 >= this.field4064.field4070) {
                return null;
            }
            var2 = this.field4064.field4069[this.field4066++].field3939;
        } while (this.field4064.field4069[this.field4066 - 1] == var2);
        this.field4065 = var2.field3939;
        this.field4067 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4064.field4069[this.field4066 - 1] != this.field4065) {
            return true;
        }
        while (this.field4066 < this.field4064.field4070) {
            if (this.field4064.field4069[this.field4066++].field3939 != this.field4064.field4069[this.field4066 - 1]) {
                this.field4065 = this.field4064.field4069[this.field4066 - 1].field3939;
                return true;
            }
            this.field4065 = this.field4064.field4069[this.field4066 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4067 == null) {
            throw new IllegalStateException();
        }
        this.field4067.method5496();
        this.field4067 = null;
    }
}
