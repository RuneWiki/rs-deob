package deob;

import java.util.Iterator;

@ObfuscatedName("ls")
public class class328 implements Iterator {

    @ObfuscatedName("ls.f")
    public class327 field3868;

    @ObfuscatedName("ls.b")
    public class190 field3869;

    @ObfuscatedName("ls.l")
    public int field3870;

    @ObfuscatedName("ls.m")
    public class190 field3871 = null;

    public class328(class327 arg0) {
        this.field3868 = arg0;
        this.method5582();
    }

    @ObfuscatedName("ls.e()V")
    public void method5582() {
        this.field3869 = this.field3868.field3863[0].field2141;
        this.field3870 = 1;
        this.field3871 = null;
    }

    public Object next() {
        if (this.field3868.field3863[this.field3870 - 1] != this.field3869) {
            class190 var1 = this.field3869;
            this.field3869 = var1.field2141;
            this.field3871 = var1;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3870 >= this.field3868.field3865) {
                return null;
            }
            var2 = this.field3868.field3863[this.field3870++].field2141;
        } while (this.field3868.field3863[this.field3870 - 1] == var2);
        this.field3869 = var2.field2141;
        this.field3871 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3868.field3863[this.field3870 - 1] != this.field3869) {
            return true;
        }
        while (this.field3870 < this.field3868.field3865) {
            if (this.field3868.field3863[this.field3870++].field2141 != this.field3868.field3863[this.field3870 - 1]) {
                this.field3869 = this.field3868.field3863[this.field3870 - 1].field2141;
                return true;
            }
            this.field3869 = this.field3868.field3863[this.field3870 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3871 == null) {
            throw new IllegalStateException();
        }
        this.field3871.method3407();
        this.field3871 = null;
    }
}
