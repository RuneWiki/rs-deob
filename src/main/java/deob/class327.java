package deob;

import java.util.Iterator;

@ObfuscatedName("lw")
public class class327 implements Iterator {

    @ObfuscatedName("lw.x")
    public class326 field3847;

    @ObfuscatedName("lw.m")
    public class190 field3846;

    @ObfuscatedName("lw.k")
    public int field3845;

    @ObfuscatedName("lw.d")
    public class190 field3848 = null;

    public class327(class326 arg0) {
        this.field3847 = arg0;
        this.method5537();
    }

    @ObfuscatedName("lw.q()V")
    public void method5537() {
        this.field3846 = this.field3847.field3841[0].field2118;
        this.field3845 = 1;
        this.field3848 = null;
    }

    public Object next() {
        if (this.field3847.field3841[this.field3845 - 1] != this.field3846) {
            class190 var1 = this.field3846;
            this.field3846 = var1.field2118;
            this.field3848 = var1;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3845 >= this.field3847.field3840) {
                return null;
            }
            var2 = this.field3847.field3841[this.field3845++].field2118;
        } while (this.field3847.field3841[this.field3845 - 1] == var2);
        this.field3846 = var2.field2118;
        this.field3848 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3847.field3841[this.field3845 - 1] != this.field3846) {
            return true;
        }
        while (this.field3845 < this.field3847.field3840) {
            if (this.field3847.field3841[this.field3845++].field2118 != this.field3847.field3841[this.field3845 - 1]) {
                this.field3846 = this.field3847.field3841[this.field3845 - 1].field2118;
                return true;
            }
            this.field3846 = this.field3847.field3841[this.field3845 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3848 == null) {
            throw new IllegalStateException();
        }
        this.field3848.method3355();
        this.field3848 = null;
    }
}
