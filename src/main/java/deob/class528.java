package deob;

import java.util.Iterator;

@ObfuscatedName("ud")
public class class528 implements Iterator {

    // $FF: synthetic field
    public final class529 this$0;

    @ObfuscatedName("ud.ak")
    public int field5255;

    public class528(class529 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field5255 < this.this$0.method8111();
    }

    public Object next() {
        int var1 = ++this.field5255 - 1;
        class488 var2 = (class488) this.this$0.field5257.method5526((long) var1);
        return var2 == null ? this.this$0.method8633(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
