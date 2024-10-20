package deob;

import java.util.Iterator;

@ObfuscatedName("fe")
public class class173 implements Iterator {

    @ObfuscatedName("fe.n")
    public class177 field2858;

    @ObfuscatedName("fe.x")
    public class187 field2856;

    @ObfuscatedName("fe.k")
    public int field2855;

    @ObfuscatedName("fe.i")
    public class187 field2857 = null;

    public class173(class177 arg0) {
        this.field2858 = arg0;
        this.method3127();
    }

    @ObfuscatedName("fe.n()V")
    public void method3127() {
        this.field2856 = this.field2858.field2868[0].field2887;
        this.field2855 = 1;
        this.field2857 = null;
    }

    public Object next() {
        if (this.field2858.field2868[this.field2855 - 1] != this.field2856) {
            class187 var1 = this.field2856;
            this.field2856 = var1.field2887;
            this.field2857 = var1;
            return var1;
        }
        class187 var2;
        do {
            if (this.field2855 >= this.field2858.field2867) {
                return null;
            }
            var2 = this.field2858.field2868[this.field2855++].field2887;
        } while (this.field2858.field2868[this.field2855 - 1] == var2);
        this.field2856 = var2.field2887;
        this.field2857 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2858.field2868[this.field2855 - 1] != this.field2856) {
            return true;
        }
        while (this.field2855 < this.field2858.field2867) {
            if (this.field2858.field2868[this.field2855++].field2887 != this.field2858.field2868[this.field2855 - 1]) {
                this.field2856 = this.field2858.field2868[this.field2855 - 1].field2887;
                return true;
            }
            this.field2856 = this.field2858.field2868[this.field2855 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2857 == null) {
            throw new IllegalStateException();
        }
        this.field2857.method3277();
        this.field2857 = null;
    }
}
