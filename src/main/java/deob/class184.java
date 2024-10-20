package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class184 implements Iterator {

    @ObfuscatedName("go.q")
    public class188 field2926;

    @ObfuscatedName("go.s")
    public class198 field2927;

    @ObfuscatedName("go.h")
    public int field2929;

    @ObfuscatedName("go.e")
    public class198 field2928 = null;

    public class184(class188 arg0) {
        this.field2926 = arg0;
        this.method3258();
    }

    @ObfuscatedName("go.q()V")
    public void method3258() {
        this.field2927 = this.field2926.field2940[0].field2959;
        this.field2929 = 1;
        this.field2928 = null;
    }

    public Object next() {
        if (this.field2926.field2940[this.field2929 - 1] != this.field2927) {
            class198 var1 = this.field2927;
            this.field2927 = var1.field2959;
            this.field2928 = var1;
            return var1;
        }
        class198 var2;
        do {
            if (this.field2929 >= this.field2926.field2939) {
                return null;
            }
            var2 = this.field2926.field2940[this.field2929++].field2959;
        } while (this.field2926.field2940[this.field2929 - 1] == var2);
        this.field2927 = var2.field2959;
        this.field2928 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2926.field2940[this.field2929 - 1] != this.field2927) {
            return true;
        }
        while (this.field2929 < this.field2926.field2939) {
            if (this.field2926.field2940[this.field2929++].field2959 != this.field2926.field2940[this.field2929 - 1]) {
                this.field2927 = this.field2926.field2940[this.field2929 - 1].field2959;
                return true;
            }
            this.field2927 = this.field2926.field2940[this.field2929 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2928 == null) {
            throw new IllegalStateException();
        }
        this.field2928.method3404();
        this.field2928 = null;
    }
}
