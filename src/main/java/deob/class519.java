package deob;

import java.util.Iterator;

@ObfuscatedName("to")
public class class519 implements Iterator {

    @ObfuscatedName("to.aq")
    public class520 field5230;

    @ObfuscatedName("to.ad")
    public class505 field5228;

    @ObfuscatedName("to.ag")
    public int field5227;

    @ObfuscatedName("to.ak")
    public class505 field5229 = null;

    public class519(class520 arg0) {
        this.field5230 = arg0;
        this.method8431();
    }

    @ObfuscatedName("to.aq()V")
    public void method8431() {
        this.field5228 = this.field5230.field5232[0].field5083;
        this.field5227 = 1;
        this.field5229 = null;
    }

    @ObfuscatedName("to.ad()Ltz;")
    public class505 method8430() {
        this.method8431();
        return (class505) this.next();
    }

    public Object next() {
        if (this.field5230.field5232[this.field5227 - 1] != this.field5228) {
            class505 var1 = this.field5228;
            this.field5228 = var1.field5083;
            this.field5229 = var1;
            return var1;
        }
        class505 var2;
        do {
            if (this.field5227 >= this.field5230.field5234) {
                return null;
            }
            var2 = this.field5230.field5232[this.field5227++].field5083;
        } while (this.field5230.field5232[this.field5227 - 1] == var2);
        this.field5228 = var2.field5083;
        this.field5229 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field5230.field5232[this.field5227 - 1] != this.field5228) {
            return true;
        }
        while (this.field5227 < this.field5230.field5234) {
            if (this.field5230.field5232[this.field5227++].field5083 != this.field5230.field5232[this.field5227 - 1]) {
                this.field5228 = this.field5230.field5232[this.field5227 - 1].field5083;
                return true;
            }
            this.field5228 = this.field5230.field5232[this.field5227 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field5229 == null) {
            throw new IllegalStateException();
        }
        this.field5229.method8130();
        this.field5229 = null;
    }
}
