package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class196 implements Iterator {

    @ObfuscatedName("gp.q")
    public class190 field2953;

    @ObfuscatedName("gp.s")
    public class194 field2952;

    @ObfuscatedName("gp.h")
    public class194 field2954 = null;

    public class196(class190 arg0) {
        this.field2953 = arg0;
        this.field2952 = this.field2953.field2943.field2947;
        this.field2954 = null;
    }

    public Object next() {
        class194 var1 = this.field2952;
        if (this.field2953.field2943 == var1) {
            var1 = null;
            this.field2952 = null;
        } else {
            this.field2952 = var1.field2947;
        }
        this.field2954 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2953.field2943 != this.field2952;
    }

    public void remove() {
        if (this.field2954 == null) {
            throw new IllegalStateException();
        }
        this.field2954.method3386();
        this.field2954 = null;
    }
}
