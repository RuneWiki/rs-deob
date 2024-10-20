package deob;

import java.util.Iterator;

@ObfuscatedName("ln")
public class class327 implements Iterator {

    @ObfuscatedName("ln.m")
    public class326 field3857;

    @ObfuscatedName("ln.o")
    public class190 field3856;

    @ObfuscatedName("ln.q")
    public int field3855;

    @ObfuscatedName("ln.j")
    public class190 field3858 = null;

    public class327(class326 arg0) {
        this.field3857 = arg0;
        this.method5636();
    }

    @ObfuscatedName("ln.g()V")
    public void method5636() {
        this.field3856 = this.field3857.field3853[0].field2153;
        this.field3855 = 1;
        this.field3858 = null;
    }

    public Object next() {
        if (this.field3857.field3853[this.field3855 - 1] != this.field3856) {
            class190 var1 = this.field3856;
            this.field3856 = var1.field2153;
            this.field3858 = var1;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3855 >= this.field3857.field3851) {
                return null;
            }
            var2 = this.field3857.field3853[this.field3855++].field2153;
        } while (this.field3857.field3853[this.field3855 - 1] == var2);
        this.field3856 = var2.field2153;
        this.field3858 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3857.field3853[this.field3855 - 1] != this.field3856) {
            return true;
        }
        while (this.field3855 < this.field3857.field3851) {
            if (this.field3857.field3853[this.field3855++].field2153 != this.field3857.field3853[this.field3855 - 1]) {
                this.field3856 = this.field3857.field3853[this.field3855 - 1].field2153;
                return true;
            }
            this.field3856 = this.field3857.field3853[this.field3855 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3858 == null) {
            throw new IllegalStateException();
        }
        this.field3858.method3388();
        this.field3858 = null;
    }
}
