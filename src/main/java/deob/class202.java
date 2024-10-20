package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public class class202 implements Iterator {

    @ObfuscatedName("gb.c")
    public class206 field2448;

    @ObfuscatedName("gb.q")
    public class207 field2447;

    @ObfuscatedName("gb.m")
    public class207 field2446 = null;

    public class202(class206 arg0) {
        this.field2448 = arg0;
        this.field2447 = this.field2448.field2464.field2465;
        this.field2446 = null;
    }

    public Object next() {
        class207 var1 = this.field2447;
        if (this.field2448.field2464 == var1) {
            var1 = null;
            this.field2447 = null;
        } else {
            this.field2447 = var1.field2465;
        }
        this.field2446 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2448.field2464 != this.field2447;
    }

    public void remove() {
        if (this.field2446 == null) {
            throw new IllegalStateException();
        }
        this.field2446.method3733();
        this.field2446 = null;
    }
}
