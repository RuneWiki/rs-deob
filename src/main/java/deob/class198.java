package deob;

import java.util.Iterator;

@ObfuscatedName("gy")
public class class198 implements Iterator {

    @ObfuscatedName("gy.e")
    public class202 field3130;

    @ObfuscatedName("gy.l")
    public class212 field3131;

    @ObfuscatedName("gy.c")
    public int field3132;

    @ObfuscatedName("gy.h")
    public class212 field3133 = null;

    public class198(class202 arg0) {
        this.field3130 = arg0;
        this.method3598();
    }

    @ObfuscatedName("gy.e()V")
    public void method3598() {
        this.field3131 = this.field3130.field3143[0].field3163;
        this.field3132 = 1;
        this.field3133 = null;
    }

    public Object next() {
        if (this.field3130.field3143[this.field3132 - 1] != this.field3131) {
            class212 var1 = this.field3131;
            this.field3131 = var1.field3163;
            this.field3133 = var1;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3132 >= this.field3130.field3142) {
                return null;
            }
            var2 = this.field3130.field3143[this.field3132++].field3163;
        } while (this.field3130.field3143[this.field3132 - 1] == var2);
        this.field3131 = var2.field3163;
        this.field3133 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3130.field3143[this.field3132 - 1] != this.field3131) {
            return true;
        }
        while (this.field3132 < this.field3130.field3142) {
            if (this.field3130.field3143[this.field3132++].field3163 != this.field3130.field3143[this.field3132 - 1]) {
                this.field3131 = this.field3130.field3143[this.field3132 - 1].field3163;
                return true;
            }
            this.field3131 = this.field3130.field3143[this.field3132 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3133 == null) {
            throw new IllegalStateException();
        }
        this.field3133.method3755();
        this.field3133 = null;
    }
}
