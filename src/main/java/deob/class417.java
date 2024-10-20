package deob;

import java.util.Iterator;

@ObfuscatedName("pu")
public class class417 implements Iterator {

    @ObfuscatedName("pu.v")
    public class418 field4532;

    @ObfuscatedName("pu.c")
    public class409 field4533;

    @ObfuscatedName("pu.i")
    public int field4534;

    @ObfuscatedName("pu.f")
    public class409 field4535 = null;

    public class417(class418 arg0) {
        this.field4532 = arg0;
        this.method6746();
    }

    @ObfuscatedName("pu.v()V")
    public void method6746() {
        this.field4533 = this.field4532.field4539[0].field4411;
        this.field4534 = 1;
        this.field4535 = null;
    }

    public Object next() {
        if (this.field4532.field4539[this.field4534 - 1] != this.field4533) {
            class409 var1 = this.field4533;
            this.field4533 = var1.field4411;
            this.field4535 = var1;
            return var1;
        }
        class409 var2;
        do {
            if (this.field4534 >= this.field4532.field4538) {
                return null;
            }
            var2 = this.field4532.field4539[this.field4534++].field4411;
        } while (this.field4532.field4539[this.field4534 - 1] == var2);
        this.field4533 = var2.field4411;
        this.field4535 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4532.field4539[this.field4534 - 1] != this.field4533) {
            return true;
        }
        while (this.field4534 < this.field4532.field4538) {
            if (this.field4532.field4539[this.field4534++].field4411 != this.field4532.field4539[this.field4534 - 1]) {
                this.field4533 = this.field4532.field4539[this.field4534 - 1].field4411;
                return true;
            }
            this.field4533 = this.field4532.field4539[this.field4534 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4535 == null) {
            throw new IllegalStateException();
        }
        this.field4535.method6503();
        this.field4535 = null;
    }
}
