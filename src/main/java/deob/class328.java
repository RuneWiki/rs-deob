package deob;

import java.util.Iterator;

@ObfuscatedName("lj")
public class class328 implements Iterator {

    @ObfuscatedName("lj.n")
    public class327 field3871;

    @ObfuscatedName("lj.v")
    public class190 field3869;

    @ObfuscatedName("lj.d")
    public int field3870;

    @ObfuscatedName("lj.c")
    public class190 field3868 = null;

    public class328(class327 arg0) {
        this.field3871 = arg0;
        this.method5673();
    }

    @ObfuscatedName("lj.e()V")
    public void method5673() {
        this.field3869 = this.field3871.field3864[0].field2140;
        this.field3870 = 1;
        this.field3868 = null;
    }

    public Object next() {
        if (this.field3871.field3864[this.field3870 - 1] != this.field3869) {
            class190 var1 = this.field3869;
            this.field3869 = var1.field2140;
            this.field3868 = var1;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3870 >= this.field3871.field3863) {
                return null;
            }
            var2 = this.field3871.field3864[this.field3870++].field2140;
        } while (this.field3871.field3864[this.field3870 - 1] == var2);
        this.field3869 = var2.field2140;
        this.field3868 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3871.field3864[this.field3870 - 1] != this.field3869) {
            return true;
        }
        while (this.field3870 < this.field3871.field3863) {
            if (this.field3871.field3864[this.field3870++].field2140 != this.field3871.field3864[this.field3870 - 1]) {
                this.field3869 = this.field3871.field3864[this.field3870 - 1].field2140;
                return true;
            }
            this.field3869 = this.field3871.field3864[this.field3870 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3868 == null) {
            throw new IllegalStateException();
        }
        this.field3868.method3486();
        this.field3868 = null;
    }
}
