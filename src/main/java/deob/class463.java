package deob;

import java.util.Iterator;

@ObfuscatedName("rj")
public class class463 implements Iterator {

    @ObfuscatedName("rj.af")
    public class464 field4891;

    @ObfuscatedName("rj.an")
    public class449 field4892;

    @ObfuscatedName("rj.aw")
    public int field4893;

    @ObfuscatedName("rj.ac")
    public class449 field4894 = null;

    public class463(class464 arg0) {
        this.field4891 = arg0;
        this.method7932();
    }

    @ObfuscatedName("rj.af()V")
    public void method7932() {
        this.field4892 = this.field4891.field4895[0].field4746;
        this.field4893 = 1;
        this.field4894 = null;
    }

    @ObfuscatedName("rj.an()Lrp;")
    public class449 method7934() {
        this.method7932();
        return (class449) this.next();
    }

    public Object next() {
        if (this.field4891.field4895[this.field4893 - 1] != this.field4892) {
            class449 var1 = this.field4892;
            this.field4892 = var1.field4746;
            this.field4894 = var1;
            return var1;
        }
        class449 var2;
        do {
            if (this.field4893 >= this.field4891.field4896) {
                return null;
            }
            var2 = this.field4891.field4895[this.field4893++].field4746;
        } while (this.field4891.field4895[this.field4893 - 1] == var2);
        this.field4892 = var2.field4746;
        this.field4894 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4891.field4895[this.field4893 - 1] != this.field4892) {
            return true;
        }
        while (this.field4893 < this.field4891.field4896) {
            if (this.field4891.field4895[this.field4893++].field4746 != this.field4891.field4895[this.field4893 - 1]) {
                this.field4892 = this.field4891.field4895[this.field4893 - 1].field4746;
                return true;
            }
            this.field4892 = this.field4891.field4895[this.field4893 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4894 == null) {
            throw new IllegalStateException();
        }
        this.field4894.method7651();
        this.field4894 = null;
    }
}
