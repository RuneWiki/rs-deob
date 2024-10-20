package deob;

import java.util.Iterator;

@ObfuscatedName("pn")
public class class419 implements Iterator {

    @ObfuscatedName("pn.o")
    public class420 field4594;

    @ObfuscatedName("pn.q")
    public class411 field4596;

    @ObfuscatedName("pn.l")
    public int field4595;

    @ObfuscatedName("pn.k")
    public class411 field4593 = null;

    public class419(class420 arg0) {
        this.field4594 = arg0;
        this.method6649();
    }

    @ObfuscatedName("pn.o()V")
    public void method6649() {
        this.field4596 = this.field4594.field4599[0].field4467;
        this.field4595 = 1;
        this.field4593 = null;
    }

    public Object next() {
        if (this.field4594.field4599[this.field4595 - 1] != this.field4596) {
            class411 var1 = this.field4596;
            this.field4596 = var1.field4467;
            this.field4593 = var1;
            return var1;
        }
        class411 var2;
        do {
            if (this.field4595 >= this.field4594.field4600) {
                return null;
            }
            var2 = this.field4594.field4599[this.field4595++].field4467;
        } while (this.field4594.field4599[this.field4595 - 1] == var2);
        this.field4596 = var2.field4467;
        this.field4593 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4594.field4599[this.field4595 - 1] != this.field4596) {
            return true;
        }
        while (this.field4595 < this.field4594.field4600) {
            if (this.field4594.field4599[this.field4595++].field4467 != this.field4594.field4599[this.field4595 - 1]) {
                this.field4596 = this.field4594.field4599[this.field4595 - 1].field4467;
                return true;
            }
            this.field4596 = this.field4594.field4599[this.field4595 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4593 == null) {
            throw new IllegalStateException();
        }
        this.field4593.method6399();
        this.field4593 = null;
    }
}
