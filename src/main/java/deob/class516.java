package deob;

import java.util.Iterator;

@ObfuscatedName("tz")
public class class516 implements Iterator {

    // $FF: synthetic field
    public final class517 this$0;

    @ObfuscatedName("tz.aq")
    public int field5113;

    public class516(class517 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field5113 < this.this$0.method7912();
    }

    public Object next() {
        int var1 = ++this.field5113 - 1;
        class476 var2 = (class476) this.this$0.field5116.method5384((long) var1);
        return var2 == null ? this.this$0.method8423(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
