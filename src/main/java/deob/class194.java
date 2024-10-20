package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public class class194 implements Iterator {

    @ObfuscatedName("gd.h")
    public class198 field3065;

    @ObfuscatedName("gd.q")
    public class208 field3063;

    @ObfuscatedName("gd.v")
    public int field3062;

    @ObfuscatedName("gd.n")
    public class208 field3064 = null;

    public class194(class198 arg0) {
        this.field3065 = arg0;
        this.method3554();
    }

    @ObfuscatedName("gd.h()V")
    public void method3554() {
        this.field3063 = this.field3065.field3076[0].field3094;
        this.field3062 = 1;
        this.field3064 = null;
    }

    public Object next() {
        if (this.field3065.field3076[this.field3062 - 1] != this.field3063) {
            class208 var1 = this.field3063;
            this.field3063 = var1.field3094;
            this.field3064 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3062 >= this.field3065.field3075) {
                return null;
            }
            var2 = this.field3065.field3076[this.field3062++].field3094;
        } while (this.field3065.field3076[this.field3062 - 1] == var2);
        this.field3063 = var2.field3094;
        this.field3064 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3065.field3076[this.field3062 - 1] != this.field3063) {
            return true;
        }
        while (this.field3062 < this.field3065.field3075) {
            if (this.field3065.field3076[this.field3062++].field3094 != this.field3065.field3076[this.field3062 - 1]) {
                this.field3063 = this.field3065.field3076[this.field3062 - 1].field3094;
                return true;
            }
            this.field3063 = this.field3065.field3076[this.field3062 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3064 == null) {
            throw new IllegalStateException();
        }
        this.field3064.method3711();
        this.field3064 = null;
    }
}
