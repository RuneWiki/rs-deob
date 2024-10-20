package deob;

import java.util.Iterator;

@ObfuscatedName("pg")
public class class428 implements Iterator {

    // $FF: synthetic field
    public final class429 this$0;

    @ObfuscatedName("pg.o")
    public int field4644;

    public class428(class429 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field4644 < this.this$0.method6333();
    }

    public Object next() {
        int var1 = ++this.field4644 - 1;
        class395 var2 = (class395) this.this$0.field4647.method4532((long) var1);
        return var2 == null ? this.this$0.method6786(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
