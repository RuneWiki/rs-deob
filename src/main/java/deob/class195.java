package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public class class195 implements Iterator {

    @ObfuscatedName("gu.b")
    public class199 field3086;

    @ObfuscatedName("gu.g")
    public class209 field3083;

    @ObfuscatedName("gu.j")
    public int field3085;

    @ObfuscatedName("gu.d")
    public class209 field3084 = null;

    public class195(class199 arg0) {
        this.field3086 = arg0;
        this.method3506();
    }

    @ObfuscatedName("gu.b()V")
    public void method3506() {
        this.field3083 = this.field3086.field3095[0].field3115;
        this.field3085 = 1;
        this.field3084 = null;
    }

    public Object next() {
        if (this.field3086.field3095[this.field3085 - 1] != this.field3083) {
            class209 var1 = this.field3083;
            this.field3083 = var1.field3115;
            this.field3084 = var1;
            return var1;
        }
        class209 var2;
        do {
            if (this.field3085 >= this.field3086.field3097) {
                return null;
            }
            var2 = this.field3086.field3095[this.field3085++].field3115;
        } while (this.field3086.field3095[this.field3085 - 1] == var2);
        this.field3083 = var2.field3115;
        this.field3084 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3086.field3095[this.field3085 - 1] != this.field3083) {
            return true;
        }
        while (this.field3085 < this.field3086.field3097) {
            if (this.field3086.field3095[this.field3085++].field3115 != this.field3086.field3095[this.field3085 - 1]) {
                this.field3083 = this.field3086.field3095[this.field3085 - 1].field3115;
                return true;
            }
            this.field3083 = this.field3086.field3095[this.field3085 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3084 == null) {
            throw new IllegalStateException();
        }
        this.field3084.method3647();
        this.field3084 = null;
    }
}
