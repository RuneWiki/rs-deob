package deob;

import java.util.Iterator;

@ObfuscatedName("lk")
public class class318 implements Iterator {

    @ObfuscatedName("lk.m")
    public class317 field3846;

    @ObfuscatedName("lk.f")
    public class186 field3847;

    @ObfuscatedName("lk.q")
    public int field3845;

    @ObfuscatedName("lk.w")
    public class186 field3844 = null;

    public class318(class317 arg0) {
        this.field3846 = arg0;
        this.method5404();
    }

    @ObfuscatedName("lk.u()V")
    public void method5404() {
        this.field3847 = this.field3846.field3840[0].field2140;
        this.field3845 = 1;
        this.field3844 = null;
    }

    public Object next() {
        if (this.field3846.field3840[this.field3845 - 1] != this.field3847) {
            class186 var1 = this.field3847;
            this.field3847 = var1.field2140;
            this.field3844 = var1;
            return var1;
        }
        class186 var2;
        do {
            if (this.field3845 >= this.field3846.field3842) {
                return null;
            }
            var2 = this.field3846.field3840[this.field3845++].field2140;
        } while (this.field3846.field3840[this.field3845 - 1] == var2);
        this.field3847 = var2.field2140;
        this.field3844 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3846.field3840[this.field3845 - 1] != this.field3847) {
            return true;
        }
        while (this.field3845 < this.field3846.field3842) {
            if (this.field3846.field3840[this.field3845++].field2140 != this.field3846.field3840[this.field3845 - 1]) {
                this.field3847 = this.field3846.field3840[this.field3845 - 1].field2140;
                return true;
            }
            this.field3847 = this.field3846.field3840[this.field3845 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3844 == null) {
            throw new IllegalStateException();
        }
        this.field3844.method3306();
        this.field3844 = null;
    }
}
