package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class194 implements Iterator {

    @ObfuscatedName("gg.j")
    public class198 field3083;

    @ObfuscatedName("gg.l")
    public class208 field3080;

    @ObfuscatedName("gg.a")
    public int field3082;

    @ObfuscatedName("gg.i")
    public class208 field3081 = null;

    public class194(class198 arg0) {
        this.field3083 = arg0;
        this.method3481();
    }

    @ObfuscatedName("gg.j()V")
    public void method3481() {
        this.field3080 = this.field3083.field3093[0].field3112;
        this.field3082 = 1;
        this.field3081 = null;
    }

    public Object next() {
        if (this.field3083.field3093[this.field3082 - 1] != this.field3080) {
            class208 var1 = this.field3080;
            this.field3080 = var1.field3112;
            this.field3081 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3082 >= this.field3083.field3092) {
                return null;
            }
            var2 = this.field3083.field3093[this.field3082++].field3112;
        } while (this.field3083.field3093[this.field3082 - 1] == var2);
        this.field3080 = var2.field3112;
        this.field3081 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3083.field3093[this.field3082 - 1] != this.field3080) {
            return true;
        }
        while (this.field3082 < this.field3083.field3092) {
            if (this.field3083.field3093[this.field3082++].field3112 != this.field3083.field3093[this.field3082 - 1]) {
                this.field3080 = this.field3083.field3093[this.field3082 - 1].field3112;
                return true;
            }
            this.field3080 = this.field3083.field3093[this.field3082 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3081 == null) {
            throw new IllegalStateException();
        }
        this.field3081.method3608();
        this.field3081 = null;
    }
}
