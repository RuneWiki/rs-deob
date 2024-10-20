package deob;

import java.util.Iterator;

@ObfuscatedName("ll")
public class class317 implements Iterator {

    @ObfuscatedName("ll.u")
    public class316 field3831;

    @ObfuscatedName("ll.f")
    public class181 field3830;

    @ObfuscatedName("ll.b")
    public int field3829;

    @ObfuscatedName("ll.g")
    public class181 field3832 = null;

    public class317(class316 arg0) {
        this.field3831 = arg0;
        this.method5539();
    }

    @ObfuscatedName("ll.y()V")
    public void method5539() {
        this.field3830 = this.field3831.field3825[0].field2127;
        this.field3829 = 1;
        this.field3832 = null;
    }

    public Object next() {
        if (this.field3831.field3825[this.field3829 - 1] != this.field3830) {
            class181 var1 = this.field3830;
            this.field3830 = var1.field2127;
            this.field3832 = var1;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3829 >= this.field3831.field3824) {
                return null;
            }
            var2 = this.field3831.field3825[this.field3829++].field2127;
        } while (this.field3831.field3825[this.field3829 - 1] == var2);
        this.field3830 = var2.field2127;
        this.field3832 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3831.field3825[this.field3829 - 1] != this.field3830) {
            return true;
        }
        while (this.field3829 < this.field3831.field3824) {
            if (this.field3831.field3825[this.field3829++].field2127 != this.field3831.field3825[this.field3829 - 1]) {
                this.field3830 = this.field3831.field3825[this.field3829 - 1].field2127;
                return true;
            }
            this.field3830 = this.field3831.field3825[this.field3829 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3832 == null) {
            throw new IllegalStateException();
        }
        this.field3832.method3332();
        this.field3832 = null;
    }
}
