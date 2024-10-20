package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class185 implements Iterator {

    @ObfuscatedName("gp.b")
    public class189 field2977;

    @ObfuscatedName("gp.e")
    public class199 field2974;

    @ObfuscatedName("gp.a")
    public int field2975;

    @ObfuscatedName("gp.k")
    public class199 field2976 = null;

    public class185(class189 arg0) {
        this.field2977 = arg0;
        this.method3273();
    }

    @ObfuscatedName("gp.b()V")
    public void method3273() {
        this.field2974 = this.field2977.field2987[0].field3005;
        this.field2975 = 1;
        this.field2976 = null;
    }

    public Object next() {
        if (this.field2977.field2987[this.field2975 - 1] != this.field2974) {
            class199 var1 = this.field2974;
            this.field2974 = var1.field3005;
            this.field2976 = var1;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2975 >= this.field2977.field2986) {
                return null;
            }
            var2 = this.field2977.field2987[this.field2975++].field3005;
        } while (this.field2977.field2987[this.field2975 - 1] == var2);
        this.field2974 = var2.field3005;
        this.field2976 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2977.field2987[this.field2975 - 1] != this.field2974) {
            return true;
        }
        while (this.field2975 < this.field2977.field2986) {
            if (this.field2977.field2987[this.field2975++].field3005 != this.field2977.field2987[this.field2975 - 1]) {
                this.field2974 = this.field2977.field2987[this.field2975 - 1].field3005;
                return true;
            }
            this.field2974 = this.field2977.field2987[this.field2975 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2976 == null) {
            throw new IllegalStateException();
        }
        this.field2976.method3414();
        this.field2976 = null;
    }
}
