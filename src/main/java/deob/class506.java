package deob;

import java.util.Iterator;

@ObfuscatedName("tj")
public class class506 implements Iterator {

    @ObfuscatedName("tj.aq")
    public class507 field5067;

    @ObfuscatedName("tj.aw")
    public class492 field5068;

    @ObfuscatedName("tj.al")
    public int field5070;

    @ObfuscatedName("tj.ai")
    public class492 field5069 = null;

    public class506(class507 arg0) {
        this.field5067 = arg0;
        this.method8292();
    }

    @ObfuscatedName("tj.aq()V")
    public void method8292() {
        this.field5068 = this.field5067.field5072[0].field4918;
        this.field5070 = 1;
        this.field5069 = null;
    }

    @ObfuscatedName("tj.aw()Lse;")
    public class492 method8285() {
        this.method8292();
        return (class492) this.next();
    }

    public Object next() {
        if (this.field5067.field5072[this.field5070 - 1] != this.field5068) {
            class492 var1 = this.field5068;
            this.field5068 = var1.field4918;
            this.field5069 = var1;
            return var1;
        }
        class492 var2;
        do {
            if (this.field5070 >= this.field5067.field5075) {
                return null;
            }
            var2 = this.field5067.field5072[this.field5070++].field4918;
        } while (this.field5067.field5072[this.field5070 - 1] == var2);
        this.field5068 = var2.field4918;
        this.field5069 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field5067.field5072[this.field5070 - 1] != this.field5068) {
            return true;
        }
        while (this.field5070 < this.field5067.field5075) {
            if (this.field5067.field5072[this.field5070++].field4918 != this.field5067.field5072[this.field5070 - 1]) {
                this.field5068 = this.field5067.field5072[this.field5070 - 1].field4918;
                return true;
            }
            this.field5068 = this.field5067.field5072[this.field5070 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field5069 == null) {
            throw new IllegalStateException();
        }
        this.field5069.method7996();
        this.field5069 = null;
    }
}
