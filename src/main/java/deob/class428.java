package deob;

import java.util.Iterator;

@ObfuscatedName("pe")
public class class428 implements Iterator {

    // $FF: synthetic field
    public final class429 this$0;

    @ObfuscatedName("pe.s")
    public int field4641;

    public class428(class429 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4641 < this.this$0.method6348();
    }

    public Object next() {
        int var1 = ++this.field4641 - 1;
        class395 var2 = (class395) this.this$0.field4646.method4578((long) var1);
        return var2 == null ? this.this$0.method6769(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
