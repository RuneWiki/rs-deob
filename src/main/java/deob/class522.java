package deob;

import java.util.Iterator;

@ObfuscatedName("us")
public class class522 implements Iterator {

    @ObfuscatedName("us.ac")
    public class523 field5268;

    @ObfuscatedName("us.ae")
    public class508 field5267;

    @ObfuscatedName("us.ag")
    public int field5269;

    @ObfuscatedName("us.am")
    public class508 field5270 = null;

    public class522(class523 arg0) {
        this.field5268 = arg0;
        this.method8646();
    }

    @ObfuscatedName("us.ac()V")
    public void method8646() {
        this.field5267 = this.field5268.field5272[0].field5123;
        this.field5269 = 1;
        this.field5270 = null;
    }

    @ObfuscatedName("us.ae()Lto;")
    public class508 method8652() {
        this.method8646();
        return (class508) this.next();
    }

    public Object next() {
        if (this.field5268.field5272[this.field5269 - 1] != this.field5267) {
            class508 var1 = this.field5267;
            this.field5267 = var1.field5123;
            this.field5270 = var1;
            return var1;
        }
        class508 var2;
        do {
            if (this.field5269 >= this.field5268.field5273) {
                return null;
            }
            var2 = this.field5268.field5272[this.field5269++].field5123;
        } while (this.field5268.field5272[this.field5269 - 1] == var2);
        this.field5267 = var2.field5123;
        this.field5270 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field5268.field5272[this.field5269 - 1] != this.field5267) {
            return true;
        }
        while (this.field5269 < this.field5268.field5273) {
            if (this.field5268.field5272[this.field5269++].field5123 != this.field5268.field5272[this.field5269 - 1]) {
                this.field5267 = this.field5268.field5272[this.field5269 - 1].field5123;
                return true;
            }
            this.field5267 = this.field5268.field5272[this.field5269 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field5270 == null) {
            throw new IllegalStateException();
        }
        this.field5270.method8362();
        this.field5270 = null;
    }
}
