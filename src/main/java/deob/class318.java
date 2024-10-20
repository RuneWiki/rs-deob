package deob;

import java.util.Iterator;

@ObfuscatedName("lu")
public class class318 implements Iterator {

    @ObfuscatedName("lu.c")
    public class317 field3830;

    @ObfuscatedName("lu.t")
    public class181 field3828;

    @ObfuscatedName("lu.o")
    public int field3829;

    @ObfuscatedName("lu.e")
    public class181 field3827 = null;

    public class318(class317 arg0) {
        this.field3830 = arg0;
        this.method5521();
    }

    @ObfuscatedName("lu.j()V")
    public void method5521() {
        this.field3828 = this.field3830.field3822[0].field2114;
        this.field3829 = 1;
        this.field3827 = null;
    }

    public Object next() {
        if (this.field3830.field3822[this.field3829 - 1] != this.field3828) {
            class181 var1 = this.field3828;
            this.field3828 = var1.field2114;
            this.field3827 = var1;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3829 >= this.field3830.field3825) {
                return null;
            }
            var2 = this.field3830.field3822[this.field3829++].field2114;
        } while (this.field3830.field3822[this.field3829 - 1] == var2);
        this.field3828 = var2.field2114;
        this.field3827 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3830.field3822[this.field3829 - 1] != this.field3828) {
            return true;
        }
        while (this.field3829 < this.field3830.field3825) {
            if (this.field3830.field3822[this.field3829++].field2114 != this.field3830.field3822[this.field3829 - 1]) {
                this.field3828 = this.field3830.field3822[this.field3829 - 1].field2114;
                return true;
            }
            this.field3828 = this.field3830.field3822[this.field3829 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3827 == null) {
            throw new IllegalStateException();
        }
        this.field3827.method3351();
        this.field3827 = null;
    }
}
