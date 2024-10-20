package deob;

import java.util.Iterator;

@ObfuscatedName("nr")
public class class378 implements Iterator {

    @ObfuscatedName("nr.i")
    public class379 field4208;

    @ObfuscatedName("nr.w")
    public class370 field4206;

    @ObfuscatedName("nr.s")
    public int field4205;

    @ObfuscatedName("nr.a")
    public class370 field4207 = null;

    public class378(class379 arg0) {
        this.field4208 = arg0;
        this.method6007();
    }

    @ObfuscatedName("nr.i()V")
    public void method6007() {
        this.field4206 = this.field4208.field4210[0].field4074;
        this.field4205 = 1;
        this.field4207 = null;
    }

    public Object next() {
        if (this.field4208.field4210[this.field4205 - 1] != this.field4206) {
            class370 var1 = this.field4206;
            this.field4206 = var1.field4074;
            this.field4207 = var1;
            return var1;
        }
        class370 var2;
        do {
            if (this.field4205 >= this.field4208.field4209) {
                return null;
            }
            var2 = this.field4208.field4210[this.field4205++].field4074;
        } while (this.field4208.field4210[this.field4205 - 1] == var2);
        this.field4206 = var2.field4074;
        this.field4207 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4208.field4210[this.field4205 - 1] != this.field4206) {
            return true;
        }
        while (this.field4205 < this.field4208.field4209) {
            if (this.field4208.field4210[this.field4205++].field4074 != this.field4208.field4210[this.field4205 - 1]) {
                this.field4206 = this.field4208.field4210[this.field4205 - 1].field4074;
                return true;
            }
            this.field4206 = this.field4208.field4210[this.field4205 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4207 == null) {
            throw new IllegalStateException();
        }
        this.field4207.method5752();
        this.field4207 = null;
    }
}
