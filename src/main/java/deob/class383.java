package deob;

import java.util.Iterator;

@ObfuscatedName("oj")
public class class383 implements Iterator {

    @ObfuscatedName("oj.aw")
    public class384 field4422;

    @ObfuscatedName("oj.ay")
    public class470 field4423;

    @ObfuscatedName("oj.ar")
    public class470 field4424 = null;

    public class383(class384 arg0) {
        this.field4422 = arg0;
        this.field4423 = this.field4422.field4426.field4813;
        this.field4424 = null;
    }

    public Object next() {
        class470 var1 = this.field4423;
        if (this.field4422.field4426 == var1) {
            var1 = null;
            this.field4423 = null;
        } else {
            this.field4423 = var1.field4813;
        }
        this.field4424 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4422.field4426 != this.field4423;
    }

    public void remove() {
        if (this.field4424 == null) {
            throw new IllegalStateException();
        }
        this.field4424.method7660();
        this.field4424 = null;
    }
}
