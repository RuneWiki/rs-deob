package deob;

import java.util.Iterator;

@ObfuscatedName("fq")
public class class181 implements Iterator {

    @ObfuscatedName("fq.e")
    public class177 field2840;

    @ObfuscatedName("fq.p")
    public class180 field2839;

    @ObfuscatedName("fq.a")
    public class180 field2838 = null;

    public class181(class177 arg0) {
        this.field2840 = arg0;
        this.field2839 = this.field2840.field2833.field2836;
        this.field2838 = null;
    }

    public Object next() {
        class180 var1 = this.field2839;
        if (this.field2840.field2833 == var1) {
            var1 = null;
            this.field2839 = null;
        } else {
            this.field2839 = var1.field2836;
        }
        this.field2838 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2840.field2833 != this.field2839;
    }

    public void remove() {
        if (this.field2838 == null) {
            throw new IllegalStateException();
        }
        this.field2838.method3287();
        this.field2838 = null;
    }
}
