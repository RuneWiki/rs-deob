package deob;

import java.util.Iterator;

@ObfuscatedName("ll")
public class class317 implements Iterator {

    @ObfuscatedName("ll.a")
    public class316 field3820;

    @ObfuscatedName("ll.t")
    public class181 field3818;

    @ObfuscatedName("ll.n")
    public int field3819;

    @ObfuscatedName("ll.q")
    public class181 field3817 = null;

    public class317(class316 arg0) {
        this.field3820 = arg0;
        this.method5516();
    }

    @ObfuscatedName("ll.d()V")
    public void method5516() {
        this.field3818 = this.field3820.field3813[0].field2090;
        this.field3819 = 1;
        this.field3817 = null;
    }

    public Object next() {
        if (this.field3820.field3813[this.field3819 - 1] != this.field3818) {
            class181 var1 = this.field3818;
            this.field3818 = var1.field2090;
            this.field3817 = var1;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3819 >= this.field3820.field3816) {
                return null;
            }
            var2 = this.field3820.field3813[this.field3819++].field2090;
        } while (this.field3820.field3813[this.field3819 - 1] == var2);
        this.field3818 = var2.field2090;
        this.field3817 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3820.field3813[this.field3819 - 1] != this.field3818) {
            return true;
        }
        while (this.field3819 < this.field3820.field3816) {
            if (this.field3820.field3813[this.field3819++].field2090 != this.field3820.field3813[this.field3819 - 1]) {
                this.field3818 = this.field3820.field3813[this.field3819 - 1].field2090;
                return true;
            }
            this.field3818 = this.field3820.field3813[this.field3819 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3817 == null) {
            throw new IllegalStateException();
        }
        this.field3817.method3386();
        this.field3817 = null;
    }
}
