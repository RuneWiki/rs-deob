package deob;

import java.util.Iterator;

@ObfuscatedName("tm")
public class class513 implements Iterator {

    // $FF: synthetic field
    public final class514 this$0;

    @ObfuscatedName("tm.am")
    public int field5093;

    public class513(class514 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field5093 < this.this$0.method7905();
    }

    public Object next() {
        int var1 = ++this.field5093 - 1;
        class473 var2 = (class473) this.this$0.field5095.method5361((long) var1);
        return var2 == null ? this.this$0.method8402(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
