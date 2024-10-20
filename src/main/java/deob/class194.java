package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public class class194 implements Iterator {

    @ObfuscatedName("gl.n")
    public class198 field3081;

    @ObfuscatedName("gl.q")
    public class208 field3080;

    @ObfuscatedName("gl.c")
    public int field3082;

    @ObfuscatedName("gl.l")
    public class208 field3079 = null;

    public class194(class198 arg0) {
        this.field3081 = arg0;
        this.method3497();
    }

    @ObfuscatedName("gl.n()V")
    public void method3497() {
        this.field3080 = this.field3081.field3093[0].field3110;
        this.field3082 = 1;
        this.field3079 = null;
    }

    public Object next() {
        if (this.field3081.field3093[this.field3082 - 1] != this.field3080) {
            class208 var1 = this.field3080;
            this.field3080 = var1.field3110;
            this.field3079 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3082 >= this.field3081.field3092) {
                return null;
            }
            var2 = this.field3081.field3093[this.field3082++].field3110;
        } while (this.field3081.field3093[this.field3082 - 1] == var2);
        this.field3080 = var2.field3110;
        this.field3079 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3081.field3093[this.field3082 - 1] != this.field3080) {
            return true;
        }
        while (this.field3082 < this.field3081.field3092) {
            if (this.field3081.field3093[this.field3082++].field3110 != this.field3081.field3093[this.field3082 - 1]) {
                this.field3080 = this.field3081.field3093[this.field3082 - 1].field3110;
                return true;
            }
            this.field3080 = this.field3081.field3093[this.field3082 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3079 == null) {
            throw new IllegalStateException();
        }
        this.field3079.method3651();
        this.field3079 = null;
    }
}
