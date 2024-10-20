package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("no")
public class class366 implements class365 {

    @ObfuscatedName("no.s")
    public Map field4113;

    @ObfuscatedName("no.t")
    public final class392 field4111;

    public class366(class392 arg0) {
        this.field4111 = arg0;
    }

    @ObfuscatedName("no.s(II)I")
    public int method5761(int arg0) {
        if (this.field4113 != null) {
            class393 var2 = (class393) this.field4113.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4242;
            }
        }
        return (Integer) this.field4111.method5415(arg0);
    }

    @ObfuscatedName("no.t(ILjava/lang/Object;I)V")
    public void method5760(int arg0, Object arg1) {
        if (this.field4113 == null) {
            this.field4113 = new HashMap();
            this.field4113.put(arg0, new class393(arg0, arg1));
            return;
        }
        class393 var3 = (class393) this.field4113.get(arg0);
        if (var3 == null) {
            this.field4113.put(arg0, new class393(arg0, arg1));
        } else {
            var3.field4242 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4113 == null ? Collections.emptyList().iterator() : this.field4113.values().iterator();
    }
}
