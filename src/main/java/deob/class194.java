package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public class class194 implements Iterator {

    @ObfuscatedName("gl.m")
    public class198 field3064;

    @ObfuscatedName("gl.l")
    public class208 field3062;

    @ObfuscatedName("gl.y")
    public int field3063;

    @ObfuscatedName("gl.u")
    public class208 field3065 = null;

    public class194(class198 arg0) {
        this.field3064 = arg0;
        this.method3551();
    }

    @ObfuscatedName("gl.m()V")
    public void method3551() {
        this.field3062 = this.field3064.field3075[0].field3094;
        this.field3063 = 1;
        this.field3065 = null;
    }

    public Object next() {
        if (this.field3064.field3075[this.field3063 - 1] != this.field3062) {
            class208 var1 = this.field3062;
            this.field3062 = var1.field3094;
            this.field3065 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3063 >= this.field3064.field3076) {
                return null;
            }
            var2 = this.field3064.field3075[this.field3063++].field3094;
        } while (this.field3064.field3075[this.field3063 - 1] == var2);
        this.field3062 = var2.field3094;
        this.field3065 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3064.field3075[this.field3063 - 1] != this.field3062) {
            return true;
        }
        while (this.field3063 < this.field3064.field3076) {
            if (this.field3064.field3075[this.field3063++].field3094 != this.field3064.field3075[this.field3063 - 1]) {
                this.field3062 = this.field3064.field3075[this.field3063 - 1].field3094;
                return true;
            }
            this.field3062 = this.field3064.field3075[this.field3063 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3065 == null) {
            throw new IllegalStateException();
        }
        this.field3065.method3702();
        this.field3065 = null;
    }
}
