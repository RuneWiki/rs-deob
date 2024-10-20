package deob;

import java.util.Iterator;

@ObfuscatedName("nb")
public class class371 implements Iterator {

    // $FF: synthetic field
    public final class372 this$0;

    @ObfuscatedName("nb.s")
    public int field4148;

    public class371(class372 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4148 < this.this$0.method5404();
    }

    public Object next() {
        int var1 = ++this.field4148 - 1;
        class342 var2 = (class342) this.this$0.field4152.method3896((long) var1);
        return var2 == null ? this.this$0.method5841(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
