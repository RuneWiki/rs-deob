package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("sy")
public class class479 implements class478 {

    @ObfuscatedName("sy.at")
    public Map field4922;

    @ObfuscatedName("sy.an")
    public final class509 field4920;

    public class479(class509 arg0) {
        this.field4920 = arg0;
    }

    @ObfuscatedName("sy.at(IB)I")
    public int method7887(int arg0) {
        if (this.field4922 != null) {
            class510 var2 = (class510) this.field4922.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field5084;
            }
        }
        return (Integer) this.field4920.method7492(arg0);
    }

    @ObfuscatedName("sy.an(ILjava/lang/Object;I)V")
    public void method7886(int arg0, Object arg1) {
        if (this.field4922 == null) {
            this.field4922 = new HashMap();
            this.field4922.put(arg0, new class510(arg0, arg1));
            return;
        }
        class510 var3 = (class510) this.field4922.get(arg0);
        if (var3 == null) {
            this.field4922.put(arg0, new class510(arg0, arg1));
        } else {
            var3.field5084 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4922 == null ? Collections.emptyList().iterator() : this.field4922.values().iterator();
    }
}
