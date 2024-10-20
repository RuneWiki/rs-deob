package deob;

import java.util.Iterator;

@ObfuscatedName("ts")
public class class520 implements Iterator {

    @ObfuscatedName("ts.ab")
    public class521 field5233;

    @ObfuscatedName("ts.ay")
    public class506 field5231;

    @ObfuscatedName("ts.an")
    public int field5232;

    @ObfuscatedName("ts.au")
    public class506 field5234 = null;

    public class520(class521 arg0) {
        this.field5233 = arg0;
        this.method8503();
    }

    @ObfuscatedName("ts.ab()V")
    public void method8503() {
        this.field5231 = this.field5233.field5236[0].field5074;
        this.field5232 = 1;
        this.field5234 = null;
    }

    @ObfuscatedName("ts.ay()Ltp;")
    public class506 method8504() {
        this.method8503();
        return (class506) this.next();
    }

    public Object next() {
        if (this.field5233.field5236[this.field5232 - 1] != this.field5231) {
            class506 var1 = this.field5231;
            this.field5231 = var1.field5074;
            this.field5234 = var1;
            return var1;
        }
        class506 var2;
        do {
            if (this.field5232 >= this.field5233.field5239) {
                return null;
            }
            var2 = this.field5233.field5236[this.field5232++].field5074;
        } while (this.field5233.field5236[this.field5232 - 1] == var2);
        this.field5231 = var2.field5074;
        this.field5234 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field5233.field5236[this.field5232 - 1] != this.field5231) {
            return true;
        }
        while (this.field5232 < this.field5233.field5239) {
            if (this.field5233.field5236[this.field5232++].field5074 != this.field5233.field5236[this.field5232 - 1]) {
                this.field5231 = this.field5233.field5236[this.field5232 - 1].field5074;
                return true;
            }
            this.field5231 = this.field5233.field5236[this.field5232 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field5234 == null) {
            throw new IllegalStateException();
        }
        this.field5234.method8218();
        this.field5234 = null;
    }
}
