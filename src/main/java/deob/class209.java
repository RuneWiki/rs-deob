package deob;

import java.util.Iterator;

@ObfuscatedName("he")
public class class209 implements Iterator {

    @ObfuscatedName("he.a")
    public class198 field2600;

    @ObfuscatedName("he.w")
    public class204 field2603;

    @ObfuscatedName("he.e")
    public int field2602;

    @ObfuscatedName("he.k")
    public class204 field2601 = null;

    public class209(class198 arg0) {
        this.field2600 = arg0;
        this.method3504();
    }

    @ObfuscatedName("he.f()V")
    public void method3504() {
        this.field2603 = this.field2600.field2570[0].field2590;
        this.field2602 = 1;
        this.field2601 = null;
    }

    public Object next() {
        if (this.field2600.field2570[this.field2602 - 1] != this.field2603) {
            class204 var1 = this.field2603;
            this.field2603 = var1.field2590;
            this.field2601 = var1;
            return var1;
        }
        class204 var2;
        do {
            if (this.field2602 >= this.field2600.field2568) {
                return null;
            }
            var2 = this.field2600.field2570[this.field2602++].field2590;
        } while (this.field2600.field2570[this.field2602 - 1] == var2);
        this.field2603 = var2.field2590;
        this.field2601 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2600.field2570[this.field2602 - 1] != this.field2603) {
            return true;
        }
        while (this.field2602 < this.field2600.field2568) {
            if (this.field2600.field2570[this.field2602++].field2590 != this.field2600.field2570[this.field2602 - 1]) {
                this.field2603 = this.field2600.field2570[this.field2602 - 1].field2590;
                return true;
            }
            this.field2603 = this.field2600.field2570[this.field2602 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2601 == null) {
            throw new IllegalStateException();
        }
        this.field2601.method3427();
        this.field2601 = null;
    }
}
