package deob;

import java.util.Iterator;

@ObfuscatedName("fl")
public class class175 implements Iterator {

    @ObfuscatedName("fl.l")
    public class179 field2855;

    @ObfuscatedName("fl.y")
    public class189 field2854;

    @ObfuscatedName("fl.g")
    public int field2856;

    @ObfuscatedName("fl.j")
    public class189 field2857 = null;

    public class175(class179 arg0) {
        this.field2855 = arg0;
        this.method3229();
    }

    @ObfuscatedName("fl.l()V")
    public void method3229() {
        this.field2854 = this.field2855.field2866[0].field2885;
        this.field2856 = 1;
        this.field2857 = null;
    }

    public Object next() {
        if (this.field2855.field2866[this.field2856 - 1] != this.field2854) {
            class189 var1 = this.field2854;
            this.field2854 = var1.field2885;
            this.field2857 = var1;
            return var1;
        }
        class189 var2;
        do {
            if (this.field2856 >= this.field2855.field2867) {
                return null;
            }
            var2 = this.field2855.field2866[this.field2856++].field2885;
        } while (this.field2855.field2866[this.field2856 - 1] == var2);
        this.field2854 = var2.field2885;
        this.field2857 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2855.field2866[this.field2856 - 1] != this.field2854) {
            return true;
        }
        while (this.field2856 < this.field2855.field2867) {
            if (this.field2855.field2866[this.field2856++].field2885 != this.field2855.field2866[this.field2856 - 1]) {
                this.field2854 = this.field2855.field2866[this.field2856 - 1].field2885;
                return true;
            }
            this.field2854 = this.field2855.field2866[this.field2856 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2857 == null) {
            throw new IllegalStateException();
        }
        this.field2857.method3375();
        this.field2857 = null;
    }
}
