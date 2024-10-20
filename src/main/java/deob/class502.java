package deob;

import java.util.Iterator;

@ObfuscatedName("tm")
public class class502 implements Iterator {

    @ObfuscatedName("tm.ac")
    public class503 field5011;

    @ObfuscatedName("tm.al")
    public class488 field5008;

    @ObfuscatedName("tm.ak")
    public int field5009;

    @ObfuscatedName("tm.ax")
    public class488 field5010 = null;

    public class502(class503 arg0) {
        this.field5011 = arg0;
        this.method8056();
    }

    @ObfuscatedName("tm.ac()V")
    public void method8056() {
        this.field5008 = this.field5011.field5013[0].field4856;
        this.field5009 = 1;
        this.field5010 = null;
    }

    @ObfuscatedName("tm.al()Lsj;")
    public class488 method8057() {
        this.method8056();
        return (class488) this.next();
    }

    public Object next() {
        if (this.field5011.field5013[this.field5009 - 1] != this.field5008) {
            class488 var1 = this.field5008;
            this.field5008 = var1.field4856;
            this.field5010 = var1;
            return var1;
        }
        class488 var2;
        do {
            if (this.field5009 >= this.field5011.field5016) {
                return null;
            }
            var2 = this.field5011.field5013[this.field5009++].field4856;
        } while (this.field5011.field5013[this.field5009 - 1] == var2);
        this.field5008 = var2.field4856;
        this.field5010 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field5011.field5013[this.field5009 - 1] != this.field5008) {
            return true;
        }
        while (this.field5009 < this.field5011.field5016) {
            if (this.field5011.field5013[this.field5009++].field4856 != this.field5011.field5013[this.field5009 - 1]) {
                this.field5008 = this.field5011.field5013[this.field5009 - 1].field4856;
                return true;
            }
            this.field5008 = this.field5011.field5013[this.field5009 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field5010 == null) {
            throw new IllegalStateException();
        }
        this.field5010.method7776();
        this.field5010 = null;
    }
}
