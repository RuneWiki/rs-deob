package deob;

import java.util.Iterator;

@ObfuscatedName("sa")
public class class487 implements Iterator {

    @ObfuscatedName("sa.au")
    public class488 field4968;

    @ObfuscatedName("sa.ae")
    public class473 field4969;

    @ObfuscatedName("sa.ao")
    public int field4970;

    @ObfuscatedName("sa.at")
    public class473 field4971 = null;

    public class487(class488 arg0) {
        this.field4968 = arg0;
        this.method7990();
    }

    @ObfuscatedName("sa.au()V")
    public void method7990() {
        this.field4969 = this.field4968.field4973[0].field4813;
        this.field4970 = 1;
        this.field4971 = null;
    }

    @ObfuscatedName("sa.ae()Lsj;")
    public class473 method7991() {
        this.method7990();
        return (class473) this.next();
    }

    public Object next() {
        if (this.field4968.field4973[this.field4970 - 1] != this.field4969) {
            class473 var1 = this.field4969;
            this.field4969 = var1.field4813;
            this.field4971 = var1;
            return var1;
        }
        class473 var2;
        do {
            if (this.field4970 >= this.field4968.field4972) {
                return null;
            }
            var2 = this.field4968.field4973[this.field4970++].field4813;
        } while (this.field4968.field4973[this.field4970 - 1] == var2);
        this.field4969 = var2.field4813;
        this.field4971 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4968.field4973[this.field4970 - 1] != this.field4969) {
            return true;
        }
        while (this.field4970 < this.field4968.field4972) {
            if (this.field4968.field4973[this.field4970++].field4813 != this.field4968.field4973[this.field4970 - 1]) {
                this.field4969 = this.field4968.field4973[this.field4970 - 1].field4813;
                return true;
            }
            this.field4969 = this.field4968.field4973[this.field4970 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4971 == null) {
            throw new IllegalStateException();
        }
        this.field4971.method7700();
        this.field4971 = null;
    }
}
