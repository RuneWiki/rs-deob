package deob;

import java.util.Iterator;

@ObfuscatedName("hw")
public class class227 implements Iterator {

    @ObfuscatedName("hw.g")
    public class228 field2680;

    @ObfuscatedName("hw.e")
    public class219 field2679;

    @ObfuscatedName("hw.b")
    public class219 field2678 = null;

    public class227(class228 arg0) {
        this.field2680 = arg0;
        this.field2679 = this.field2680.field2682.field2664;
        this.field2678 = null;
    }

    public Object next() {
        class219 var1 = this.field2679;
        if (this.field2680.field2682 == var1) {
            var1 = null;
            this.field2679 = null;
        } else {
            this.field2679 = var1.field2664;
        }
        this.field2678 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2680.field2682 != this.field2679;
    }

    public void remove() {
        if (this.field2678 == null) {
            throw new IllegalStateException();
        }
        this.field2678.method3840();
        this.field2678 = null;
    }
}
