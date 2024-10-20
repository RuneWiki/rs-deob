package deob;

import java.util.Iterator;

@ObfuscatedName("tn")
public class class512 implements Iterator {

    // $FF: synthetic field
    public final class513 this$0;

    @ObfuscatedName("tn.ac")
    public int field5059;

    public class512(class513 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field5059 < this.this$0.method7689();
    }

    public Object next() {
        int var1 = ++this.field5059 - 1;
        class472 var2 = (class472) this.this$0.field5060.method5255((long) var1);
        return var2 == null ? this.this$0.method8183(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
