package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class196 implements Iterator {

    @ObfuscatedName("go.o")
    public class193 field3007;

    @ObfuscatedName("go.l")
    public class199 field3005;

    @ObfuscatedName("go.g")
    public class199 field3006 = null;

    public class196(class193 arg0) {
        this.field3007 = arg0;
        this.field3005 = this.field3007.field3001.field3013;
        this.field3006 = null;
    }

    public Object next() {
        class199 var1 = this.field3005;
        if (this.field3007.field3001 == var1) {
            var1 = null;
            this.field3005 = null;
        } else {
            this.field3005 = var1.field3013;
        }
        this.field3006 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3007.field3001 != this.field3005;
    }

    public void remove() {
        if (this.field3006 == null) {
            throw new IllegalStateException();
        }
        this.field3006.method3564();
        this.field3006 = null;
    }
}
