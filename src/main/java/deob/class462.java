package deob;

import java.util.Iterator;

@ObfuscatedName("rr")
public class class462 implements Iterator {

    // $FF: synthetic field
    public final class463 this$0;

    @ObfuscatedName("rr.aj")
    public int field4848;

    public class462(class463 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4848 < this.this$0.method7274();
    }

    public Object next() {
        int var1 = ++this.field4848 - 1;
        class428 var2 = (class428) this.this$0.field4851.method4891((long) var1);
        return var2 == null ? this.this$0.method7733(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
