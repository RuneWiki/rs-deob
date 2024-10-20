package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("tm")
public class class511 implements class510 {

    @ObfuscatedName("tm.az")
    public Map field5106;

    @ObfuscatedName("tm.ah")
    public final class543 field5107;

    public class511(class543 arg0) {
        this.field5107 = arg0;
    }

    @ObfuscatedName("tm.az(II)I")
    public int method8218(int arg0) {
        if (this.field5106 != null) {
            class544 var2 = (class544) this.field5106.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field5301;
            }
        }
        return (Integer) this.field5107.method7775(arg0);
    }

    @ObfuscatedName("tm.ah(ILjava/lang/Object;I)V")
    public void method8214(int arg0, Object arg1) {
        if (this.field5106 == null) {
            this.field5106 = new HashMap();
            this.field5106.put(arg0, new class544(arg0, arg1));
            return;
        }
        class544 var3 = (class544) this.field5106.get(arg0);
        if (var3 == null) {
            this.field5106.put(arg0, new class544(arg0, arg1));
        } else {
            var3.field5301 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field5106 == null ? Collections.emptyList().iterator() : this.field5106.values().iterator();
    }
}
