package deob;

import java.util.Iterator;

@ObfuscatedName("hl")
public class class213 implements Iterator {

    @ObfuscatedName("hl.y")
    public class200 field2483;

    @ObfuscatedName("hl.c")
    public class207 field2484;

    @ObfuscatedName("hl.n")
    public int field2485;

    @ObfuscatedName("hl.u")
    public class207 field2486 = null;

    public class213(class200 arg0) {
        this.field2483 = arg0;
        this.method3823();
    }

    @ObfuscatedName("hl.k()V")
    public void method3823() {
        this.field2484 = this.field2483.field2446[0].field2471;
        this.field2485 = 1;
        this.field2486 = null;
    }

    public Object next() {
        if (this.field2483.field2446[this.field2485 - 1] != this.field2484) {
            class207 var1 = this.field2484;
            this.field2484 = var1.field2471;
            this.field2486 = var1;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2485 >= this.field2483.field2445) {
                return null;
            }
            var2 = this.field2483.field2446[this.field2485++].field2471;
        } while (this.field2483.field2446[this.field2485 - 1] == var2);
        this.field2484 = var2.field2471;
        this.field2486 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2483.field2446[this.field2485 - 1] != this.field2484) {
            return true;
        }
        while (this.field2485 < this.field2483.field2445) {
            if (this.field2483.field2446[this.field2485++].field2471 != this.field2483.field2446[this.field2485 - 1]) {
                this.field2484 = this.field2483.field2446[this.field2485 - 1].field2471;
                return true;
            }
            this.field2484 = this.field2483.field2446[this.field2485 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2486 == null) {
            throw new IllegalStateException();
        }
        this.field2486.method3766();
        this.field2486 = null;
    }
}
