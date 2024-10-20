package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class195 implements Iterator {

    @ObfuscatedName("gq.s")
    public class199 field3096;

    @ObfuscatedName("gq.j")
    public class209 field3094;

    @ObfuscatedName("gq.p")
    public int field3095;

    @ObfuscatedName("gq.x")
    public class209 field3097 = null;

    public class195(class199 arg0) {
        this.field3096 = arg0;
        this.method3494();
    }

    @ObfuscatedName("gq.s()V")
    public void method3494() {
        this.field3094 = this.field3096.field3106[0].field3125;
        this.field3095 = 1;
        this.field3097 = null;
    }

    public Object next() {
        if (this.field3096.field3106[this.field3095 - 1] != this.field3094) {
            class209 var1 = this.field3094;
            this.field3094 = var1.field3125;
            this.field3097 = var1;
            return var1;
        }
        class209 var2;
        do {
            if (this.field3095 >= this.field3096.field3107) {
                return null;
            }
            var2 = this.field3096.field3106[this.field3095++].field3125;
        } while (this.field3096.field3106[this.field3095 - 1] == var2);
        this.field3094 = var2.field3125;
        this.field3097 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3096.field3106[this.field3095 - 1] != this.field3094) {
            return true;
        }
        while (this.field3095 < this.field3096.field3107) {
            if (this.field3096.field3106[this.field3095++].field3125 != this.field3096.field3106[this.field3095 - 1]) {
                this.field3094 = this.field3096.field3106[this.field3095 - 1].field3125;
                return true;
            }
            this.field3094 = this.field3096.field3106[this.field3095 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3097 == null) {
            throw new IllegalStateException();
        }
        this.field3097.method3639();
        this.field3097 = null;
    }
}
