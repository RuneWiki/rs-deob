package deob;

import java.util.Iterator;

@ObfuscatedName("la")
public class class317 implements Iterator {

    @ObfuscatedName("la.f")
    public class316 field3826;

    @ObfuscatedName("la.i")
    public class188 field3827;

    @ObfuscatedName("la.y")
    public int field3828;

    @ObfuscatedName("la.w")
    public class188 field3829 = null;

    public class317(class316 arg0) {
        this.field3826 = arg0;
        this.method5484();
    }

    @ObfuscatedName("la.c()V")
    public void method5484() {
        this.field3827 = this.field3826.field3822[0].field2323;
        this.field3828 = 1;
        this.field3829 = null;
    }

    public Object next() {
        if (this.field3826.field3822[this.field3828 - 1] != this.field3827) {
            class188 var1 = this.field3827;
            this.field3827 = var1.field2323;
            this.field3829 = var1;
            return var1;
        }
        class188 var2;
        do {
            if (this.field3828 >= this.field3826.field3823) {
                return null;
            }
            var2 = this.field3826.field3822[this.field3828++].field2323;
        } while (this.field3826.field3822[this.field3828 - 1] == var2);
        this.field3827 = var2.field2323;
        this.field3829 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3826.field3822[this.field3828 - 1] != this.field3827) {
            return true;
        }
        while (this.field3828 < this.field3826.field3823) {
            if (this.field3826.field3822[this.field3828++].field2323 != this.field3826.field3822[this.field3828 - 1]) {
                this.field3827 = this.field3826.field3822[this.field3828 - 1].field2323;
                return true;
            }
            this.field3827 = this.field3826.field3822[this.field3828 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3829 == null) {
            throw new IllegalStateException();
        }
        this.field3829.method3292();
        this.field3829 = null;
    }
}
