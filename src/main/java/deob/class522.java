package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("uq")
public class class522 implements class521 {

    @ObfuscatedName("uq.ak")
    public Map field5216;

    @ObfuscatedName("uq.al")
    public final class554 field5215;

    public class522(class554 arg0) {
        this.field5215 = arg0;
    }

    @ObfuscatedName("uq.ak(II)I")
    public int method8544(int arg0) {
        if (this.field5216 != null) {
            class555 var2 = (class555) this.field5216.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field5411;
            }
        }
        return (Integer) this.field5215.method8112(arg0);
    }

    @ObfuscatedName("uq.al(ILjava/lang/Object;I)V")
    public void method8547(int arg0, Object arg1) {
        if (this.field5216 == null) {
            this.field5216 = new HashMap();
            this.field5216.put(arg0, new class555(arg0, arg1));
            return;
        }
        class555 var3 = (class555) this.field5216.get(arg0);
        if (var3 == null) {
            this.field5216.put(arg0, new class555(arg0, arg1));
        } else {
            var3.field5411 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field5216 == null ? Collections.emptyList().iterator() : this.field5216.values().iterator();
    }
}
