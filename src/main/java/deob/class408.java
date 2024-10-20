package deob;

import java.util.Iterator;

@ObfuscatedName("pg")
public class class408 implements Iterator {

    @ObfuscatedName("pg.aq")
    public class409 field4657;

    @ObfuscatedName("pg.ad")
    public class505 field4658;

    @ObfuscatedName("pg.ag")
    public class505 field4656 = null;

    public class408(class409 arg0) {
        this.method6827(arg0);
    }

    @ObfuscatedName("pg.aq(Lpi;)V")
    public void method6827(class409 arg0) {
        this.field4657 = arg0;
        this.method6828();
    }

    @ObfuscatedName("pg.ad()V")
    public void method6828() {
        this.field4658 = this.field4657 == null ? null : this.field4657.field4660.field5083;
        this.field4656 = null;
    }

    public Object next() {
        class505 var1 = this.field4658;
        if (this.field4657.field4660 == var1) {
            var1 = null;
            this.field4658 = null;
        } else {
            this.field4658 = var1.field5083;
        }
        this.field4656 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4657.field4660 != this.field4658 && this.field4658 != null;
    }

    public void remove() {
        if (this.field4656 == null) {
            throw new IllegalStateException();
        }
        this.field4656.method8130();
        this.field4656 = null;
    }
}
