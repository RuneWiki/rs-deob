package deob;

import java.util.Iterator;

@ObfuscatedName("ga")
public class class195 implements Iterator {

    @ObfuscatedName("ga.j")
    public class199 field3093;

    @ObfuscatedName("ga.h")
    public class209 field3092;

    @ObfuscatedName("ga.m")
    public int field3094;

    @ObfuscatedName("ga.z")
    public class209 field3095 = null;

    public class195(class199 arg0) {
        this.field3093 = arg0;
        this.method3476();
    }

    @ObfuscatedName("ga.j()V")
    public void method3476() {
        this.field3092 = this.field3093.field3105[0].field3124;
        this.field3094 = 1;
        this.field3095 = null;
    }

    public Object next() {
        if (this.field3093.field3105[this.field3094 - 1] != this.field3092) {
            class209 var1 = this.field3092;
            this.field3092 = var1.field3124;
            this.field3095 = var1;
            return var1;
        }
        class209 var2;
        do {
            if (this.field3094 >= this.field3093.field3106) {
                return null;
            }
            var2 = this.field3093.field3105[this.field3094++].field3124;
        } while (this.field3093.field3105[this.field3094 - 1] == var2);
        this.field3092 = var2.field3124;
        this.field3095 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3093.field3105[this.field3094 - 1] != this.field3092) {
            return true;
        }
        while (this.field3094 < this.field3093.field3106) {
            if (this.field3093.field3105[this.field3094++].field3124 != this.field3093.field3105[this.field3094 - 1]) {
                this.field3092 = this.field3093.field3105[this.field3094 - 1].field3124;
                return true;
            }
            this.field3092 = this.field3093.field3105[this.field3094 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3095 == null) {
            throw new IllegalStateException();
        }
        this.field3095.method3639();
        this.field3095 = null;
    }
}
