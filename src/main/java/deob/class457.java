package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("rn")
public class class457 implements class456 {

    @ObfuscatedName("rn.aj")
    public Map field4816;

    @ObfuscatedName("rn.al")
    public final class486 field4817;

    public class457(class486 arg0) {
        this.field4817 = arg0;
    }

    @ObfuscatedName("rn.aj(II)I")
    public int method7629(int arg0) {
        if (this.field4816 != null) {
            class487 var2 = (class487) this.field4816.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4967;
            }
        }
        return (Integer) this.field4817.method7272(arg0);
    }

    @ObfuscatedName("rn.al(ILjava/lang/Object;I)V")
    public void method7627(int arg0, Object arg1) {
        if (this.field4816 == null) {
            this.field4816 = new HashMap();
            this.field4816.put(arg0, new class487(arg0, arg1));
            return;
        }
        class487 var3 = (class487) this.field4816.get(arg0);
        if (var3 == null) {
            this.field4816.put(arg0, new class487(arg0, arg1));
        } else {
            var3.field4967 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4816 == null ? Collections.emptyList().iterator() : this.field4816.values().iterator();
    }
}
