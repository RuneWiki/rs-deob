package deob;

import java.util.Iterator;

@ObfuscatedName("fx")
public class class175 implements Iterator {

    @ObfuscatedName("fx.g")
    public class179 field2855;

    @ObfuscatedName("fx.j")
    public class189 field2857;

    @ObfuscatedName("fx.z")
    public int field2854;

    @ObfuscatedName("fx.b")
    public class189 field2856 = null;

    public class175(class179 arg0) {
        this.field2855 = arg0;
        this.method3111();
    }

    @ObfuscatedName("fx.g()V")
    public void method3111() {
        this.field2857 = this.field2855.field2867[0].field2886;
        this.field2854 = 1;
        this.field2856 = null;
    }

    public Object next() {
        if (this.field2855.field2867[this.field2854 - 1] != this.field2857) {
            class189 var1 = this.field2857;
            this.field2857 = var1.field2886;
            this.field2856 = var1;
            return var1;
        }
        class189 var2;
        do {
            if (this.field2854 >= this.field2855.field2866) {
                return null;
            }
            var2 = this.field2855.field2867[this.field2854++].field2886;
        } while (this.field2855.field2867[this.field2854 - 1] == var2);
        this.field2857 = var2.field2886;
        this.field2856 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2855.field2867[this.field2854 - 1] != this.field2857) {
            return true;
        }
        while (this.field2854 < this.field2855.field2866) {
            if (this.field2855.field2867[this.field2854++].field2886 != this.field2855.field2867[this.field2854 - 1]) {
                this.field2857 = this.field2855.field2867[this.field2854 - 1].field2886;
                return true;
            }
            this.field2857 = this.field2855.field2867[this.field2854 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2856 == null) {
            throw new IllegalStateException();
        }
        this.field2856.method3259();
        this.field2856 = null;
    }
}
