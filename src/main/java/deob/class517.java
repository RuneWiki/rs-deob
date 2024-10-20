package deob;

import java.util.Iterator;

@ObfuscatedName("tb")
public class class517 implements Iterator {

    // $FF: synthetic field
    public final class518 this$0;

    @ObfuscatedName("tb.az")
    public int field5147;

    public class517(class518 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field5147 < this.this$0.method7779();
    }

    public Object next() {
        int var1 = ++this.field5147 - 1;
        class477 var2 = (class477) this.this$0.field5149.method5301((long) var1);
        return var2 == null ? this.this$0.method8294(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
