package deob;

import java.util.Iterator;

@ObfuscatedName("pb")
public class class419 implements Iterator {

    @ObfuscatedName("pb.s")
    public class420 field4592;

    @ObfuscatedName("pb.h")
    public class411 field4593;

    @ObfuscatedName("pb.w")
    public int field4595;

    @ObfuscatedName("pb.v")
    public class411 field4594 = null;

    public class419(class420 arg0) {
        this.field4592 = arg0;
        this.method6654();
    }

    @ObfuscatedName("pb.s()V")
    public void method6654() {
        this.field4593 = this.field4592.field4597[0].field4469;
        this.field4595 = 1;
        this.field4594 = null;
    }

    public Object next() {
        if (this.field4592.field4597[this.field4595 - 1] != this.field4593) {
            class411 var1 = this.field4593;
            this.field4593 = var1.field4469;
            this.field4594 = var1;
            return var1;
        }
        class411 var2;
        do {
            if (this.field4595 >= this.field4592.field4600) {
                return null;
            }
            var2 = this.field4592.field4597[this.field4595++].field4469;
        } while (this.field4592.field4597[this.field4595 - 1] == var2);
        this.field4593 = var2.field4469;
        this.field4594 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4592.field4597[this.field4595 - 1] != this.field4593) {
            return true;
        }
        while (this.field4595 < this.field4592.field4600) {
            if (this.field4592.field4597[this.field4595++].field4469 != this.field4592.field4597[this.field4595 - 1]) {
                this.field4593 = this.field4592.field4597[this.field4595 - 1].field4469;
                return true;
            }
            this.field4593 = this.field4592.field4597[this.field4595 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4594 == null) {
            throw new IllegalStateException();
        }
        this.field4594.method6409();
        this.field4594 = null;
    }
}
