package deob;

import java.util.Iterator;

@ObfuscatedName("ls")
public class class317 implements Iterator {

    @ObfuscatedName("ls.z")
    public class316 field3830;

    @ObfuscatedName("ls.n")
    public class181 field3829;

    @ObfuscatedName("ls.v")
    public int field3831;

    @ObfuscatedName("ls.u")
    public class181 field3828 = null;

    public class317(class316 arg0) {
        this.field3830 = arg0;
        this.method5380();
    }

    @ObfuscatedName("ls.i()V")
    public void method5380() {
        this.field3829 = this.field3830.field3823[0].field2093;
        this.field3831 = 1;
        this.field3828 = null;
    }

    public Object next() {
        if (this.field3830.field3823[this.field3831 - 1] != this.field3829) {
            class181 var1 = this.field3829;
            this.field3829 = var1.field2093;
            this.field3828 = var1;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3831 >= this.field3830.field3826) {
                return null;
            }
            var2 = this.field3830.field3823[this.field3831++].field2093;
        } while (this.field3830.field3823[this.field3831 - 1] == var2);
        this.field3829 = var2.field2093;
        this.field3828 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3830.field3823[this.field3831 - 1] != this.field3829) {
            return true;
        }
        while (this.field3831 < this.field3830.field3826) {
            if (this.field3830.field3823[this.field3831++].field2093 != this.field3830.field3823[this.field3831 - 1]) {
                this.field3829 = this.field3830.field3823[this.field3831 - 1].field2093;
                return true;
            }
            this.field3829 = this.field3830.field3823[this.field3831 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3828 == null) {
            throw new IllegalStateException();
        }
        this.field3828.method3249();
        this.field3828 = null;
    }
}
