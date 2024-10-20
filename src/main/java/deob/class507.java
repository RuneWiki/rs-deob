package deob;

import java.util.Iterator;

@ObfuscatedName("tn")
public class class507 implements Iterator {

    @ObfuscatedName("tn.az")
    public class508 field5093;

    @ObfuscatedName("tn.ah")
    public class493 field5095;

    @ObfuscatedName("tn.af")
    public int field5094;

    @ObfuscatedName("tn.at")
    public class493 field5092 = null;

    public class507(class508 arg0) {
        this.field5093 = arg0;
        this.method8163();
    }

    @ObfuscatedName("tn.az()V")
    public void method8163() {
        this.field5095 = this.field5093.field5097[0].field4950;
        this.field5094 = 1;
        this.field5092 = null;
    }

    @ObfuscatedName("tn.ah()Lsu;")
    public class493 method8175() {
        this.method8163();
        return (class493) this.next();
    }

    public Object next() {
        if (this.field5093.field5097[this.field5094 - 1] != this.field5095) {
            class493 var1 = this.field5095;
            this.field5095 = var1.field4950;
            this.field5092 = var1;
            return var1;
        }
        class493 var2;
        do {
            if (this.field5094 >= this.field5093.field5100) {
                return null;
            }
            var2 = this.field5093.field5097[this.field5094++].field4950;
        } while (this.field5093.field5097[this.field5094 - 1] == var2);
        this.field5095 = var2.field4950;
        this.field5092 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field5093.field5097[this.field5094 - 1] != this.field5095) {
            return true;
        }
        while (this.field5094 < this.field5093.field5100) {
            if (this.field5093.field5097[this.field5094++].field4950 != this.field5093.field5097[this.field5094 - 1]) {
                this.field5095 = this.field5093.field5097[this.field5094 - 1].field4950;
                return true;
            }
            this.field5095 = this.field5093.field5097[this.field5094 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field5092 == null) {
            throw new IllegalStateException();
        }
        this.field5092.method7855();
        this.field5092 = null;
    }
}
