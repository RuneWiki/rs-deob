package deob;

import java.util.Iterator;

@ObfuscatedName("no")
public class class387 implements Iterator {

    // $FF: synthetic field
    public final class388 this$0;

    @ObfuscatedName("no.l")
    public int field4252;

    public class387(class388 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4252 < this.this$0.method5717();
    }

    public Object next() {
        int var1 = ++this.field4252 - 1;
        class356 var2 = (class356) this.this$0.field4254.method4201((long) var1);
        return var2 == null ? this.this$0.method6158(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
