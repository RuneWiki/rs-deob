package deob;

import java.util.Iterator;

@ObfuscatedName("ga")
public class class194 implements Iterator {

    @ObfuscatedName("ga.o")
    public class198 field3083;

    @ObfuscatedName("ga.e")
    public class208 field3082;

    @ObfuscatedName("ga.u")
    public int field3080;

    @ObfuscatedName("ga.b")
    public class208 field3081 = null;

    public class194(class198 arg0) {
        this.field3083 = arg0;
        this.method3532();
    }

    @ObfuscatedName("ga.o()V")
    public void method3532() {
        this.field3082 = this.field3083.field3093[0].field3112;
        this.field3080 = 1;
        this.field3081 = null;
    }

    public Object next() {
        if (this.field3083.field3093[this.field3080 - 1] != this.field3082) {
            class208 var1 = this.field3082;
            this.field3082 = var1.field3112;
            this.field3081 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3080 >= this.field3083.field3092) {
                return null;
            }
            var2 = this.field3083.field3093[this.field3080++].field3112;
        } while (this.field3083.field3093[this.field3080 - 1] == var2);
        this.field3082 = var2.field3112;
        this.field3081 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3083.field3093[this.field3080 - 1] != this.field3082) {
            return true;
        }
        while (this.field3080 < this.field3083.field3092) {
            if (this.field3083.field3093[this.field3080++].field3112 != this.field3083.field3093[this.field3080 - 1]) {
                this.field3082 = this.field3083.field3093[this.field3080 - 1].field3112;
                return true;
            }
            this.field3082 = this.field3083.field3093[this.field3080 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3081 == null) {
            throw new IllegalStateException();
        }
        this.field3081.method3670();
        this.field3081 = null;
    }
}
