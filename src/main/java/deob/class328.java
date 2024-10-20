package deob;

import java.util.Iterator;

@ObfuscatedName("lb")
public class class328 implements Iterator {

    @ObfuscatedName("lb.h")
    public class327 field3872;

    @ObfuscatedName("lb.v")
    public class190 field3870;

    @ObfuscatedName("lb.x")
    public int field3871;

    @ObfuscatedName("lb.w")
    public class190 field3869 = null;

    public class328(class327 arg0) {
        this.field3872 = arg0;
        this.method5523();
    }

    @ObfuscatedName("lb.z()V")
    public void method5523() {
        this.field3870 = this.field3872.field3865[0].field2137;
        this.field3871 = 1;
        this.field3869 = null;
    }

    public Object next() {
        if (this.field3872.field3865[this.field3871 - 1] != this.field3870) {
            class190 var1 = this.field3870;
            this.field3870 = var1.field2137;
            this.field3869 = var1;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3871 >= this.field3872.field3868) {
                return null;
            }
            var2 = this.field3872.field3865[this.field3871++].field2137;
        } while (this.field3872.field3865[this.field3871 - 1] == var2);
        this.field3870 = var2.field2137;
        this.field3869 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3872.field3865[this.field3871 - 1] != this.field3870) {
            return true;
        }
        while (this.field3871 < this.field3872.field3868) {
            if (this.field3872.field3865[this.field3871++].field2137 != this.field3872.field3865[this.field3871 - 1]) {
                this.field3870 = this.field3872.field3865[this.field3871 - 1].field2137;
                return true;
            }
            this.field3870 = this.field3872.field3865[this.field3871 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3869 == null) {
            throw new IllegalStateException();
        }
        this.field3869.method3359();
        this.field3869 = null;
    }
}
