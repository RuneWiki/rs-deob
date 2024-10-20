package deob;

import java.util.Iterator;

@ObfuscatedName("mq")
public class class359 implements Iterator {

    @ObfuscatedName("mq.f")
    public class360 field4066;

    @ObfuscatedName("mq.o")
    public class351 field4067;

    @ObfuscatedName("mq.u")
    public int field4068;

    @ObfuscatedName("mq.p")
    public class351 field4069 = null;

    public class359(class360 arg0) {
        this.field4066 = arg0;
        this.method5618();
    }

    @ObfuscatedName("mq.f()V")
    public void method5618() {
        this.field4067 = this.field4066.field4071[0].field3942;
        this.field4068 = 1;
        this.field4069 = null;
    }

    public Object next() {
        if (this.field4066.field4071[this.field4068 - 1] != this.field4067) {
            class351 var1 = this.field4067;
            this.field4067 = var1.field3942;
            this.field4069 = var1;
            return var1;
        }
        class351 var2;
        do {
            if (this.field4068 >= this.field4066.field4073) {
                return null;
            }
            var2 = this.field4066.field4071[this.field4068++].field3942;
        } while (this.field4066.field4071[this.field4068 - 1] == var2);
        this.field4067 = var2.field3942;
        this.field4069 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4066.field4071[this.field4068 - 1] != this.field4067) {
            return true;
        }
        while (this.field4068 < this.field4066.field4073) {
            if (this.field4066.field4071[this.field4068++].field3942 != this.field4066.field4071[this.field4068 - 1]) {
                this.field4067 = this.field4066.field4071[this.field4068 - 1].field3942;
                return true;
            }
            this.field4067 = this.field4066.field4071[this.field4068 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4069 == null) {
            throw new IllegalStateException();
        }
        this.field4069.method5354();
        this.field4069 = null;
    }
}
