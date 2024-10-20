package deob;

import java.util.Iterator;

@ObfuscatedName("pv")
public class class429 implements Iterator {

    // $FF: synthetic field
    public final class430 this$0;

    @ObfuscatedName("pv.c")
    public int field4679;

    public class429(class430 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4679 < this.this$0.method6593();
    }

    public Object next() {
        int var1 = ++this.field4679 - 1;
        class396 var2 = (class396) this.this$0.field4680.method4743((long) var1);
        return var2 == null ? this.this$0.method7032(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
