package deob;

import java.util.Iterator;

@ObfuscatedName("pi")
public class class442 implements Iterator {

    @ObfuscatedName("pi.h")
    public class443 field4813;

    @ObfuscatedName("pi.e")
    public class433 field4814;

    @ObfuscatedName("pi.v")
    public int field4815;

    @ObfuscatedName("pi.x")
    public class433 field4816 = null;

    public class442(class443 arg0) {
        this.field4813 = arg0;
        this.method7504();
    }

    @ObfuscatedName("pi.h()V")
    public void method7504() {
        this.field4814 = this.field4813.field4818[0].field4684;
        this.field4815 = 1;
        this.field4816 = null;
    }

    public Object next() {
        if (this.field4813.field4818[this.field4815 - 1] != this.field4814) {
            class433 var1 = this.field4814;
            this.field4814 = var1.field4684;
            this.field4816 = var1;
            return var1;
        }
        class433 var2;
        do {
            if (this.field4815 >= this.field4813.field4821) {
                return null;
            }
            var2 = this.field4813.field4818[this.field4815++].field4684;
        } while (this.field4813.field4818[this.field4815 - 1] == var2);
        this.field4814 = var2.field4684;
        this.field4816 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4813.field4818[this.field4815 - 1] != this.field4814) {
            return true;
        }
        while (this.field4815 < this.field4813.field4821) {
            if (this.field4813.field4818[this.field4815++].field4684 != this.field4813.field4818[this.field4815 - 1]) {
                this.field4814 = this.field4813.field4818[this.field4815 - 1].field4684;
                return true;
            }
            this.field4814 = this.field4813.field4818[this.field4815 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4816 == null) {
            throw new IllegalStateException();
        }
        this.field4816.method7230();
        this.field4816 = null;
    }
}
