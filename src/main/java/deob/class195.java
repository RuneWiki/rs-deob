package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public class class195 implements Iterator {

    @ObfuscatedName("gl.w")
    public class199 field3094;

    @ObfuscatedName("gl.x")
    public class209 field3095;

    @ObfuscatedName("gl.t")
    public int field3093;

    @ObfuscatedName("gl.p")
    public class209 field3096 = null;

    public class195(class199 arg0) {
        this.field3094 = arg0;
        this.method3535();
    }

    @ObfuscatedName("gl.w()V")
    public void method3535() {
        this.field3095 = this.field3094.field3106[0].field3125;
        this.field3093 = 1;
        this.field3096 = null;
    }

    public Object next() {
        if (this.field3094.field3106[this.field3093 - 1] != this.field3095) {
            class209 var1 = this.field3095;
            this.field3095 = var1.field3125;
            this.field3096 = var1;
            return var1;
        }
        class209 var2;
        do {
            if (this.field3093 >= this.field3094.field3105) {
                return null;
            }
            var2 = this.field3094.field3106[this.field3093++].field3125;
        } while (this.field3094.field3106[this.field3093 - 1] == var2);
        this.field3095 = var2.field3125;
        this.field3096 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3094.field3106[this.field3093 - 1] != this.field3095) {
            return true;
        }
        while (this.field3093 < this.field3094.field3105) {
            if (this.field3094.field3106[this.field3093++].field3125 != this.field3094.field3106[this.field3093 - 1]) {
                this.field3095 = this.field3094.field3106[this.field3093 - 1].field3125;
                return true;
            }
            this.field3095 = this.field3094.field3106[this.field3093 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3096 == null) {
            throw new IllegalStateException();
        }
        this.field3096.method3684();
        this.field3096 = null;
    }
}
