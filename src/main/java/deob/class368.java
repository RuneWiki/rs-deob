package deob;

import java.util.Iterator;

@ObfuscatedName("na")
public class class368 implements Iterator {

    // $FF: synthetic field
    public final class369 this$0;

    @ObfuscatedName("na.f")
    public int field4116;

    public class368(class369 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4116 < this.this$0.method5323();
    }

    public Object next() {
        int var1 = ++this.field4116 - 1;
        class341 var2 = (class341) this.this$0.field4120.method3353((long) var1);
        return var2 == null ? this.this$0.method5745(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
