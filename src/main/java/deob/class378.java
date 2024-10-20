package deob;

import java.util.Iterator;

@ObfuscatedName("nf")
public class class378 implements Iterator {

    @ObfuscatedName("nf.l")
    public class379 field4203;

    @ObfuscatedName("nf.q")
    public class370 field4205;

    @ObfuscatedName("nf.f")
    public int field4202;

    @ObfuscatedName("nf.j")
    public class370 field4204 = null;

    public class378(class379 arg0) {
        this.field4203 = arg0;
        this.method6036();
    }

    @ObfuscatedName("nf.l()V")
    public void method6036() {
        this.field4205 = this.field4203.field4209[0].field4076;
        this.field4202 = 1;
        this.field4204 = null;
    }

    public Object next() {
        if (this.field4203.field4209[this.field4202 - 1] != this.field4205) {
            class370 var1 = this.field4205;
            this.field4205 = var1.field4076;
            this.field4204 = var1;
            return var1;
        }
        class370 var2;
        do {
            if (this.field4202 >= this.field4203.field4210) {
                return null;
            }
            var2 = this.field4203.field4209[this.field4202++].field4076;
        } while (this.field4203.field4209[this.field4202 - 1] == var2);
        this.field4205 = var2.field4076;
        this.field4204 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4203.field4209[this.field4202 - 1] != this.field4205) {
            return true;
        }
        while (this.field4202 < this.field4203.field4210) {
            if (this.field4203.field4209[this.field4202++].field4076 != this.field4203.field4209[this.field4202 - 1]) {
                this.field4205 = this.field4203.field4209[this.field4202 - 1].field4076;
                return true;
            }
            this.field4205 = this.field4203.field4209[this.field4202 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4204 == null) {
            throw new IllegalStateException();
        }
        this.field4204.method5775();
        this.field4204 = null;
    }
}
