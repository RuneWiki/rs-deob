package deob;

import java.util.Iterator;

@ObfuscatedName("ux")
public class class539 implements Iterator {

    // $FF: synthetic field
    public final class540 this$0;

    @ObfuscatedName("ux.ap")
    public int field5368;

    public class539(class540 arg0) {
        this.this$0 = arg0;
    }

    public boolean hasNext() {
        return this.field5368 < this.this$0.method8582();
    }

    public Object next() {
        int var1 = ++this.field5368 - 1;
        class499 var2 = (class499) this.this$0.field5371.method5901((long) var1);
        return var2 == null ? this.this$0.method9086(var1) : var2;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
