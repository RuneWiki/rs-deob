package deob;

import java.util.Iterator;

@ObfuscatedName("gn")
public class class198 implements Iterator {

    @ObfuscatedName("gn.l")
    public class202 field3145;

    @ObfuscatedName("gn.g")
    public class212 field3143;

    @ObfuscatedName("gn.r")
    public int field3142;

    @ObfuscatedName("gn.e")
    public class212 field3144 = null;

    public class198(class202 arg0) {
        this.field3145 = arg0;
        this.method3664();
    }

    @ObfuscatedName("gn.l()V")
    public void method3664() {
        this.field3143 = this.field3145.field3155[0].field3174;
        this.field3142 = 1;
        this.field3144 = null;
    }

    public Object next() {
        if (this.field3145.field3155[this.field3142 - 1] != this.field3143) {
            class212 var1 = this.field3143;
            this.field3143 = var1.field3174;
            this.field3144 = var1;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3142 >= this.field3145.field3156) {
                return null;
            }
            var2 = this.field3145.field3155[this.field3142++].field3174;
        } while (this.field3145.field3155[this.field3142 - 1] == var2);
        this.field3143 = var2.field3174;
        this.field3144 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3145.field3155[this.field3142 - 1] != this.field3143) {
            return true;
        }
        while (this.field3142 < this.field3145.field3156) {
            if (this.field3145.field3155[this.field3142++].field3174 != this.field3145.field3155[this.field3142 - 1]) {
                this.field3143 = this.field3145.field3155[this.field3142 - 1].field3174;
                return true;
            }
            this.field3143 = this.field3145.field3155[this.field3142 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3144 == null) {
            throw new IllegalStateException();
        }
        this.field3144.method3815();
        this.field3144 = null;
    }
}
