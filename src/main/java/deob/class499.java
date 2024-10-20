package deob;

import java.util.Iterator;

@ObfuscatedName("tp")
public class class499 implements Iterator {

    @ObfuscatedName("tp.at")
    public class500 field5001;

    @ObfuscatedName("tp.ah")
    public class485 field5000;

    @ObfuscatedName("tp.ar")
    public int field4999;

    @ObfuscatedName("tp.ao")
    public class485 field5002 = null;

    public class499(class500 arg0) {
        this.field5001 = arg0;
        this.method8120();
    }

    @ObfuscatedName("tp.at()V")
    public void method8120() {
        this.field5000 = this.field5001.field5004[0].field4850;
        this.field4999 = 1;
        this.field5002 = null;
    }

    @ObfuscatedName("tp.ah()Lsh;")
    public class485 method8121() {
        this.method8120();
        return (class485) this.next();
    }

    public Object next() {
        if (this.field5001.field5004[this.field4999 - 1] != this.field5000) {
            class485 var1 = this.field5000;
            this.field5000 = var1.field4850;
            this.field5002 = var1;
            return var1;
        }
        class485 var2;
        do {
            if (this.field4999 >= this.field5001.field5006) {
                return null;
            }
            var2 = this.field5001.field5004[this.field4999++].field4850;
        } while (this.field5001.field5004[this.field4999 - 1] == var2);
        this.field5000 = var2.field4850;
        this.field5002 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field5001.field5004[this.field4999 - 1] != this.field5000) {
            return true;
        }
        while (this.field4999 < this.field5001.field5006) {
            if (this.field5001.field5004[this.field4999++].field4850 != this.field5001.field5004[this.field4999 - 1]) {
                this.field5000 = this.field5001.field5004[this.field4999 - 1].field4850;
                return true;
            }
            this.field5000 = this.field5001.field5004[this.field4999 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field5002 == null) {
            throw new IllegalStateException();
        }
        this.field5002.method7828();
        this.field5002 = null;
    }
}
