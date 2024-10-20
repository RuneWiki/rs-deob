package deob;

import java.util.Iterator;

@ObfuscatedName("fi")
public class class177 implements Iterator {

    @ObfuscatedName("fi.b")
    public class181 field2874;

    @ObfuscatedName("fi.e")
    public class191 field2876;

    @ObfuscatedName("fi.i")
    public int field2873;

    @ObfuscatedName("fi.k")
    public class191 field2875 = null;

    public class177(class181 arg0) {
        this.field2874 = arg0;
        this.method3234();
    }

    @ObfuscatedName("fi.b()V")
    public void method3234() {
        this.field2876 = this.field2874.field2887[0].field2904;
        this.field2873 = 1;
        this.field2875 = null;
    }

    public Object next() {
        if (this.field2874.field2887[this.field2873 - 1] != this.field2876) {
            class191 var1 = this.field2876;
            this.field2876 = var1.field2904;
            this.field2875 = var1;
            return var1;
        }
        class191 var2;
        do {
            if (this.field2873 >= this.field2874.field2886) {
                return null;
            }
            var2 = this.field2874.field2887[this.field2873++].field2904;
        } while (this.field2874.field2887[this.field2873 - 1] == var2);
        this.field2876 = var2.field2904;
        this.field2875 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2874.field2887[this.field2873 - 1] != this.field2876) {
            return true;
        }
        while (this.field2873 < this.field2874.field2886) {
            if (this.field2874.field2887[this.field2873++].field2904 != this.field2874.field2887[this.field2873 - 1]) {
                this.field2876 = this.field2874.field2887[this.field2873 - 1].field2904;
                return true;
            }
            this.field2876 = this.field2874.field2887[this.field2873 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2875 == null) {
            throw new IllegalStateException();
        }
        this.field2875.method3392();
        this.field2875 = null;
    }
}
