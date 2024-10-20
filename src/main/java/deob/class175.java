package deob;

import java.util.Iterator;

@ObfuscatedName("fw")
public class class175 implements Iterator {

    @ObfuscatedName("fw.x")
    public class179 field2849;

    @ObfuscatedName("fw.v")
    public class189 field2850;

    @ObfuscatedName("fw.m")
    public int field2851;

    @ObfuscatedName("fw.e")
    public class189 field2852 = null;

    public class175(class179 arg0) {
        this.field2849 = arg0;
        this.method3191();
    }

    @ObfuscatedName("fw.x()V")
    public void method3191() {
        this.field2850 = this.field2849.field2861[0].field2881;
        this.field2851 = 1;
        this.field2852 = null;
    }

    public Object next() {
        if (this.field2849.field2861[this.field2851 - 1] != this.field2850) {
            class189 var1 = this.field2850;
            this.field2850 = var1.field2881;
            this.field2852 = var1;
            return var1;
        }
        class189 var2;
        do {
            if (this.field2851 >= this.field2849.field2862) {
                return null;
            }
            var2 = this.field2849.field2861[this.field2851++].field2881;
        } while (this.field2849.field2861[this.field2851 - 1] == var2);
        this.field2850 = var2.field2881;
        this.field2852 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2849.field2861[this.field2851 - 1] != this.field2850) {
            return true;
        }
        while (this.field2851 < this.field2849.field2862) {
            if (this.field2849.field2861[this.field2851++].field2881 != this.field2849.field2861[this.field2851 - 1]) {
                this.field2850 = this.field2849.field2861[this.field2851 - 1].field2881;
                return true;
            }
            this.field2850 = this.field2849.field2861[this.field2851 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2852 == null) {
            throw new IllegalStateException();
        }
        this.field2852.method3352();
        this.field2852 = null;
    }
}
