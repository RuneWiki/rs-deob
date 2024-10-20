package deob;

import java.util.Iterator;

@ObfuscatedName("qi")
public class class449 implements Iterator {

    @ObfuscatedName("qi.f")
    public class450 field4835;

    @ObfuscatedName("qi.w")
    public class440 field4836;

    @ObfuscatedName("qi.v")
    public int field4837;

    @ObfuscatedName("qi.s")
    public class440 field4838 = null;

    public class449(class450 arg0) {
        this.field4835 = arg0;
        this.method7679();
    }

    @ObfuscatedName("qi.f()V")
    public void method7679() {
        this.field4836 = this.field4835.field4840[0].field4710;
        this.field4837 = 1;
        this.field4838 = null;
    }

    public Object next() {
        if (this.field4835.field4840[this.field4837 - 1] != this.field4836) {
            class440 var1 = this.field4836;
            this.field4836 = var1.field4710;
            this.field4838 = var1;
            return var1;
        }
        class440 var2;
        do {
            if (this.field4837 >= this.field4835.field4843) {
                return null;
            }
            var2 = this.field4835.field4840[this.field4837++].field4710;
        } while (this.field4835.field4840[this.field4837 - 1] == var2);
        this.field4836 = var2.field4710;
        this.field4838 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4835.field4840[this.field4837 - 1] != this.field4836) {
            return true;
        }
        while (this.field4837 < this.field4835.field4843) {
            if (this.field4835.field4840[this.field4837++].field4710 != this.field4835.field4840[this.field4837 - 1]) {
                this.field4836 = this.field4835.field4840[this.field4837 - 1].field4710;
                return true;
            }
            this.field4836 = this.field4835.field4840[this.field4837 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4838 == null) {
            throw new IllegalStateException();
        }
        this.field4838.method7431();
        this.field4838 = null;
    }
}
