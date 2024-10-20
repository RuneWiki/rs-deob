package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public class class197 implements Iterator {

    @ObfuscatedName("gu.y")
    public class191 field3021;

    @ObfuscatedName("gu.k")
    public class195 field3020;

    @ObfuscatedName("gu.g")
    public class195 field3019 = null;

    public class197(class191 arg0) {
        this.field3021 = arg0;
        this.field3020 = this.field3021.field3010.field3014;
        this.field3019 = null;
    }

    public Object next() {
        class195 var1 = this.field3020;
        if (this.field3021.field3010 == var1) {
            var1 = null;
            this.field3020 = null;
        } else {
            this.field3020 = var1.field3014;
        }
        this.field3019 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3021.field3010 != this.field3020;
    }

    public void remove() {
        if (this.field3019 == null) {
            throw new IllegalStateException();
        }
        this.field3019.method3461();
        this.field3019 = null;
    }
}
