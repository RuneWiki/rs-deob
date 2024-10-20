package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("qe")
public class class453 implements class452 {

    @ObfuscatedName("qe.f")
    public Map field4850;

    @ObfuscatedName("qe.w")
    public final class482 field4849;

    public class453(class482 arg0) {
        this.field4849 = arg0;
    }

    @ObfuscatedName("qe.f(IB)I")
    public int method7717(int arg0) {
        if (this.field4850 != null) {
            class483 var2 = (class483) this.field4850.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field5005;
            }
        }
        return (Integer) this.field4849.method7372(arg0);
    }

    @ObfuscatedName("qe.w(ILjava/lang/Object;I)V")
    public void method7718(int arg0, Object arg1) {
        if (this.field4850 == null) {
            this.field4850 = new HashMap();
            this.field4850.put(arg0, new class483(arg0, arg1));
            return;
        }
        class483 var3 = (class483) this.field4850.get(arg0);
        if (var3 == null) {
            this.field4850.put(arg0, new class483(arg0, arg1));
        } else {
            var3.field5005 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4850 == null ? Collections.emptyList().iterator() : this.field4850.values().iterator();
    }
}
