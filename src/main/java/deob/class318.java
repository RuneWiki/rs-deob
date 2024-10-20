package deob;

import java.util.Iterator;

@ObfuscatedName("lg")
public class class318 implements Iterator {

    @ObfuscatedName("lg.q")
    public class317 field3858;

    @ObfuscatedName("lg.w")
    public class181 field3856;

    @ObfuscatedName("lg.e")
    public int field3857;

    @ObfuscatedName("lg.p")
    public class181 field3855 = null;

    public class318(class317 arg0) {
        this.field3858 = arg0;
        this.method5476();
    }

    @ObfuscatedName("lg.b()V")
    public void method5476() {
        this.field3856 = this.field3858.field3851[0].field2115;
        this.field3857 = 1;
        this.field3855 = null;
    }

    public Object next() {
        if (this.field3858.field3851[this.field3857 - 1] != this.field3856) {
            class181 var1 = this.field3856;
            this.field3856 = var1.field2115;
            this.field3855 = var1;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3857 >= this.field3858.field3852) {
                return null;
            }
            var2 = this.field3858.field3851[this.field3857++].field2115;
        } while (this.field3858.field3851[this.field3857 - 1] == var2);
        this.field3856 = var2.field2115;
        this.field3855 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3858.field3851[this.field3857 - 1] != this.field3856) {
            return true;
        }
        while (this.field3857 < this.field3858.field3852) {
            if (this.field3858.field3851[this.field3857++].field2115 != this.field3858.field3851[this.field3857 - 1]) {
                this.field3856 = this.field3858.field3851[this.field3857 - 1].field2115;
                return true;
            }
            this.field3856 = this.field3858.field3851[this.field3857 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3855 == null) {
            throw new IllegalStateException();
        }
        this.field3855.method3286();
        this.field3855 = null;
    }
}
