package deob;

import java.util.Iterator;

@ObfuscatedName("pn")
public class class426 implements Iterator {

    // $FF: synthetic field
    public final class427 this$0;

    @ObfuscatedName("pn.v")
    public int field4582;

    public class426(class427 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4582 < this.this$0.method6449();
    }

    public Object next() {
        int var1 = ++this.field4582 - 1;
        class394 var2 = (class394) this.this$0.field4584.method4615((long) var1);
        return var2 == null ? this.this$0.method6863(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
