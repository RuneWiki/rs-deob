package deob;

import java.util.Iterator;

@ObfuscatedName("fd")
public class class175 implements Iterator {

    @ObfuscatedName("fd.f")
    public class179 field2853;

    @ObfuscatedName("fd.k")
    public class189 field2851;

    @ObfuscatedName("fd.y")
    public int field2854;

    @ObfuscatedName("fd.e")
    public class189 field2852 = null;

    public class175(class179 arg0) {
        this.field2853 = arg0;
        this.method3224();
    }

    @ObfuscatedName("fd.f()V")
    public void method3224() {
        this.field2851 = this.field2853.field2863[0].field2883;
        this.field2854 = 1;
        this.field2852 = null;
    }

    public Object next() {
        if (this.field2853.field2863[this.field2854 - 1] != this.field2851) {
            class189 var1 = this.field2851;
            this.field2851 = var1.field2883;
            this.field2852 = var1;
            return var1;
        }
        class189 var2;
        do {
            if (this.field2854 >= this.field2853.field2864) {
                return null;
            }
            var2 = this.field2853.field2863[this.field2854++].field2883;
        } while (this.field2853.field2863[this.field2854 - 1] == var2);
        this.field2851 = var2.field2883;
        this.field2852 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2853.field2863[this.field2854 - 1] != this.field2851) {
            return true;
        }
        while (this.field2854 < this.field2853.field2864) {
            if (this.field2853.field2863[this.field2854++].field2883 != this.field2853.field2863[this.field2854 - 1]) {
                this.field2851 = this.field2853.field2863[this.field2854 - 1].field2883;
                return true;
            }
            this.field2851 = this.field2853.field2863[this.field2854 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2852 == null) {
            throw new IllegalStateException();
        }
        this.field2852.method3367();
        this.field2852 = null;
    }
}
