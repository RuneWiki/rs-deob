package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("tq")
public class class503 implements class502 {

    @ObfuscatedName("tq.at")
    public Map field5014;

    @ObfuscatedName("tq.ah")
    public final class535 field5015;

    public class503(class535 arg0) {
        this.field5015 = arg0;
    }

    @ObfuscatedName("tq.at(IB)I")
    public int method8177(int arg0) {
        if (this.field5014 != null) {
            class536 var2 = (class536) this.field5014.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field5206;
            }
        }
        return (Integer) this.field5015.method7760(arg0);
    }

    @ObfuscatedName("tq.ah(ILjava/lang/Object;B)V")
    public void method8176(int arg0, Object arg1) {
        if (this.field5014 == null) {
            this.field5014 = new HashMap();
            this.field5014.put(arg0, new class536(arg0, arg1));
            return;
        }
        class536 var3 = (class536) this.field5014.get(arg0);
        if (var3 == null) {
            this.field5014.put(arg0, new class536(arg0, arg1));
        } else {
            var3.field5206 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field5014 == null ? Collections.emptyList().iterator() : this.field5014.values().iterator();
    }
}
