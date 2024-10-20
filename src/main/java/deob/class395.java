package deob;

import java.util.Iterator;

@ObfuscatedName("or")
public class class395 implements Iterator {

    @ObfuscatedName("or.c")
    public class396 field4383;

    @ObfuscatedName("or.b")
    public class387 field4381;

    @ObfuscatedName("or.p")
    public int field4382;

    @ObfuscatedName("or.m")
    public class387 field4380 = null;

    public class395(class396 arg0) {
        this.field4383 = arg0;
        this.method6423();
    }

    @ObfuscatedName("or.c()V")
    public void method6423() {
        this.field4381 = this.field4383.field4385[0].field4258;
        this.field4382 = 1;
        this.field4380 = null;
    }

    public Object next() {
        if (this.field4383.field4385[this.field4382 - 1] != this.field4381) {
            class387 var1 = this.field4381;
            this.field4381 = var1.field4258;
            this.field4380 = var1;
            return var1;
        }
        class387 var2;
        do {
            if (this.field4382 >= this.field4383.field4388) {
                return null;
            }
            var2 = this.field4383.field4385[this.field4382++].field4258;
        } while (this.field4383.field4385[this.field4382 - 1] == var2);
        this.field4381 = var2.field4258;
        this.field4380 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4383.field4385[this.field4382 - 1] != this.field4381) {
            return true;
        }
        while (this.field4382 < this.field4383.field4388) {
            if (this.field4383.field4385[this.field4382++].field4258 != this.field4383.field4385[this.field4382 - 1]) {
                this.field4381 = this.field4383.field4385[this.field4382 - 1].field4258;
                return true;
            }
            this.field4381 = this.field4383.field4385[this.field4382 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4380 == null) {
            throw new IllegalStateException();
        }
        this.field4380.method6163();
        this.field4380 = null;
    }
}
