package deob;

import java.util.Iterator;

@ObfuscatedName("ph")
public class class420 implements Iterator {

    @ObfuscatedName("ph.c")
    public class421 field4628;

    @ObfuscatedName("ph.p")
    public class412 field4630;

    @ObfuscatedName("ph.f")
    public int field4629;

    @ObfuscatedName("ph.n")
    public class412 field4627 = null;

    public class420(class421 arg0) {
        this.field4628 = arg0;
        this.method6913();
    }

    @ObfuscatedName("ph.c()V")
    public void method6913() {
        this.field4630 = this.field4628.field4634[0].field4505;
        this.field4629 = 1;
        this.field4627 = null;
    }

    public Object next() {
        if (this.field4628.field4634[this.field4629 - 1] != this.field4630) {
            class412 var1 = this.field4630;
            this.field4630 = var1.field4505;
            this.field4627 = var1;
            return var1;
        }
        class412 var2;
        do {
            if (this.field4629 >= this.field4628.field4632) {
                return null;
            }
            var2 = this.field4628.field4634[this.field4629++].field4505;
        } while (this.field4628.field4634[this.field4629 - 1] == var2);
        this.field4630 = var2.field4505;
        this.field4627 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4628.field4634[this.field4629 - 1] != this.field4630) {
            return true;
        }
        while (this.field4629 < this.field4628.field4632) {
            if (this.field4628.field4634[this.field4629++].field4505 != this.field4628.field4634[this.field4629 - 1]) {
                this.field4630 = this.field4628.field4634[this.field4629 - 1].field4505;
                return true;
            }
            this.field4630 = this.field4628.field4634[this.field4629 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4627 == null) {
            throw new IllegalStateException();
        }
        this.field4627.method6657();
        this.field4627 = null;
    }
}
