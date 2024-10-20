package deob;

import java.util.Iterator;

@ObfuscatedName("oe")
public class class404 implements Iterator {

    // $FF: synthetic field
    public final class405 this$0;

    @ObfuscatedName("oe.c")
    public int field4433;

    public class404(class405 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4433 < this.this$0.method6111();
    }

    public Object next() {
        int var1 = ++this.field4433 - 1;
        class373 var2 = (class373) this.this$0.field4437.method4487((long) var1);
        return var2 == null ? this.this$0.method6547(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
