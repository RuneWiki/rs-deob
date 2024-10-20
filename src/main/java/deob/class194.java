package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class194 implements Iterator {

    @ObfuscatedName("gk.h")
    public class198 field3069;

    @ObfuscatedName("gk.m")
    public class208 field3070;

    @ObfuscatedName("gk.i")
    public int field3071;

    @ObfuscatedName("gk.q")
    public class208 field3072 = null;

    public class194(class198 arg0) {
        this.field3069 = arg0;
        this.method3487();
    }

    @ObfuscatedName("gk.h()V")
    public void method3487() {
        this.field3070 = this.field3069.field3082[0].field3101;
        this.field3071 = 1;
        this.field3072 = null;
    }

    public Object next() {
        if (this.field3069.field3082[this.field3071 - 1] != this.field3070) {
            class208 var1 = this.field3070;
            this.field3070 = var1.field3101;
            this.field3072 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3071 >= this.field3069.field3081) {
                return null;
            }
            var2 = this.field3069.field3082[this.field3071++].field3101;
        } while (this.field3069.field3082[this.field3071 - 1] == var2);
        this.field3070 = var2.field3101;
        this.field3072 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3069.field3082[this.field3071 - 1] != this.field3070) {
            return true;
        }
        while (this.field3071 < this.field3069.field3081) {
            if (this.field3069.field3082[this.field3071++].field3101 != this.field3069.field3082[this.field3071 - 1]) {
                this.field3070 = this.field3069.field3082[this.field3071 - 1].field3101;
                return true;
            }
            this.field3070 = this.field3069.field3082[this.field3071 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3072 == null) {
            throw new IllegalStateException();
        }
        this.field3072.method3625();
        this.field3072 = null;
    }
}
