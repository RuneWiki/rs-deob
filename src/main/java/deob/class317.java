package deob;

import java.util.Iterator;

@ObfuscatedName("lo")
public class class317 implements Iterator {

    @ObfuscatedName("lo.s")
    public class316 field3834;

    @ObfuscatedName("lo.j")
    public class181 field3831;

    @ObfuscatedName("lo.i")
    public int field3832;

    @ObfuscatedName("lo.k")
    public class181 field3833 = null;

    public class317(class316 arg0) {
        this.field3834 = arg0;
        this.method5427();
    }

    @ObfuscatedName("lo.r()V")
    public void method5427() {
        this.field3831 = this.field3834.field3827[0].field2097;
        this.field3832 = 1;
        this.field3833 = null;
    }

    public Object next() {
        if (this.field3834.field3827[this.field3832 - 1] != this.field3831) {
            class181 var1 = this.field3831;
            this.field3831 = var1.field2097;
            this.field3833 = var1;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3832 >= this.field3834.field3828) {
                return null;
            }
            var2 = this.field3834.field3827[this.field3832++].field2097;
        } while (this.field3834.field3827[this.field3832 - 1] == var2);
        this.field3831 = var2.field2097;
        this.field3833 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3834.field3827[this.field3832 - 1] != this.field3831) {
            return true;
        }
        while (this.field3832 < this.field3834.field3828) {
            if (this.field3834.field3827[this.field3832++].field2097 != this.field3834.field3827[this.field3832 - 1]) {
                this.field3831 = this.field3834.field3827[this.field3832 - 1].field2097;
                return true;
            }
            this.field3831 = this.field3834.field3827[this.field3832 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3833 == null) {
            throw new IllegalStateException();
        }
        this.field3833.method3304();
        this.field3833 = null;
    }
}
