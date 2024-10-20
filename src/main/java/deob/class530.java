package deob;

import java.util.Iterator;

@ObfuscatedName("ug")
public class class530 implements Iterator {

    // $FF: synthetic field
    public final class531 this$0;

    @ObfuscatedName("ug.ab")
    public int field5283;

    public class530(class531 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field5283 < this.this$0.method8153();
    }

    public Object next() {
        int var1 = ++this.field5283 - 1;
        class490 var2 = (class490) this.this$0.field5284.method5562((long) var1);
        return var2 == null ? this.this$0.method8629(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
