package deob;

import java.util.Iterator;

@ObfuscatedName("ni")
public class class369 implements Iterator {

    // $FF: synthetic field
    public final class370 this$0;

    @ObfuscatedName("ni.v")
    public int field4116;

    public class369(class370 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4116 < this.this$0.method5457();
    }

    public Object next() {
        int var1 = ++this.field4116 - 1;
        class342 var2 = (class342) this.this$0.field4119.method3911((long) var1);
        return var2 == null ? this.this$0.method5859(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
