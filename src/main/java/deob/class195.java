package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class195 implements Iterator {

    @ObfuscatedName("gk.a")
    public class199 field3095;

    @ObfuscatedName("gk.w")
    public class209 field3094;

    @ObfuscatedName("gk.d")
    public int field3093;

    @ObfuscatedName("gk.c")
    public class209 field3096 = null;

    public class195(class199 arg0) {
        this.field3095 = arg0;
        this.method3592();
    }

    @ObfuscatedName("gk.a()V")
    public void method3592() {
        this.field3094 = this.field3095.field3105[0].field3125;
        this.field3093 = 1;
        this.field3096 = null;
    }

    public Object next() {
        if (this.field3095.field3105[this.field3093 - 1] != this.field3094) {
            class209 var1 = this.field3094;
            this.field3094 = var1.field3125;
            this.field3096 = var1;
            return var1;
        }
        class209 var2;
        do {
            if (this.field3093 >= this.field3095.field3107) {
                return null;
            }
            var2 = this.field3095.field3105[this.field3093++].field3125;
        } while (this.field3095.field3105[this.field3093 - 1] == var2);
        this.field3094 = var2.field3125;
        this.field3096 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3095.field3105[this.field3093 - 1] != this.field3094) {
            return true;
        }
        while (this.field3093 < this.field3095.field3107) {
            if (this.field3095.field3105[this.field3093++].field3125 != this.field3095.field3105[this.field3093 - 1]) {
                this.field3094 = this.field3095.field3105[this.field3093 - 1].field3125;
                return true;
            }
            this.field3094 = this.field3095.field3105[this.field3093 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3096 == null) {
            throw new IllegalStateException();
        }
        this.field3096.method3737();
        this.field3096 = null;
    }
}
