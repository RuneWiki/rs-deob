package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public class class194 implements Iterator {

    @ObfuscatedName("gi.a")
    public class198 field3079;

    @ObfuscatedName("gi.r")
    public class208 field3080;

    @ObfuscatedName("gi.f")
    public int field3081;

    @ObfuscatedName("gi.s")
    public class208 field3082 = null;

    public class194(class198 arg0) {
        this.field3079 = arg0;
        this.method3523();
    }

    @ObfuscatedName("gi.a()V")
    public void method3523() {
        this.field3080 = this.field3079.field3091[0].field3111;
        this.field3081 = 1;
        this.field3082 = null;
    }

    public Object next() {
        if (this.field3079.field3091[this.field3081 - 1] != this.field3080) {
            class208 var1 = this.field3080;
            this.field3080 = var1.field3111;
            this.field3082 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3081 >= this.field3079.field3093) {
                return null;
            }
            var2 = this.field3079.field3091[this.field3081++].field3111;
        } while (this.field3079.field3091[this.field3081 - 1] == var2);
        this.field3080 = var2.field3111;
        this.field3082 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3079.field3091[this.field3081 - 1] != this.field3080) {
            return true;
        }
        while (this.field3081 < this.field3079.field3093) {
            if (this.field3079.field3091[this.field3081++].field3111 != this.field3079.field3091[this.field3081 - 1]) {
                this.field3080 = this.field3079.field3091[this.field3081 - 1].field3111;
                return true;
            }
            this.field3080 = this.field3079.field3091[this.field3081 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3082 == null) {
            throw new IllegalStateException();
        }
        this.field3082.method3661();
        this.field3082 = null;
    }
}
