package deob;

import java.util.Iterator;

@ObfuscatedName("nm")
public class class370 implements Iterator {

    // $FF: synthetic field
    public final class371 this$0;

    @ObfuscatedName("nm.f")
    public int field4115;

    public class370(class371 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4115 < this.this$0.method5372();
    }

    public Object next() {
        int var1 = ++this.field4115 - 1;
        class343 var2 = (class343) this.this$0.field4121.method3970((long) var1);
        return var2 == null ? this.this$0.method5783(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
