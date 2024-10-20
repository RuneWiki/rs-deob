package deob;

import java.util.Iterator;

@ObfuscatedName("ls")
public class class317 implements Iterator {

    @ObfuscatedName("ls.c")
    public class316 field3824;

    @ObfuscatedName("ls.x")
    public class181 field3825;

    @ObfuscatedName("ls.t")
    public int field3826;

    @ObfuscatedName("ls.g")
    public class181 field3827 = null;

    public class317(class316 arg0) {
        this.field3824 = arg0;
        this.method5508();
    }

    @ObfuscatedName("ls.j()V")
    public void method5508() {
        this.field3825 = this.field3824.field3819[0].field2095;
        this.field3826 = 1;
        this.field3827 = null;
    }

    public Object next() {
        if (this.field3824.field3819[this.field3826 - 1] != this.field3825) {
            class181 var1 = this.field3825;
            this.field3825 = var1.field2095;
            this.field3827 = var1;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3826 >= this.field3824.field3820) {
                return null;
            }
            var2 = this.field3824.field3819[this.field3826++].field2095;
        } while (this.field3824.field3819[this.field3826 - 1] == var2);
        this.field3825 = var2.field2095;
        this.field3827 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3824.field3819[this.field3826 - 1] != this.field3825) {
            return true;
        }
        while (this.field3826 < this.field3824.field3820) {
            if (this.field3824.field3819[this.field3826++].field2095 != this.field3824.field3819[this.field3826 - 1]) {
                this.field3825 = this.field3824.field3819[this.field3826 - 1].field2095;
                return true;
            }
            this.field3825 = this.field3824.field3819[this.field3826 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3827 == null) {
            throw new IllegalStateException();
        }
        this.field3827.method3326();
        this.field3827 = null;
    }
}
