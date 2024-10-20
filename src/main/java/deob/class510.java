package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ti")
public class class510 implements class509 {

    @ObfuscatedName("ti.aq")
    public Map field5081;

    @ObfuscatedName("ti.aw")
    public final class542 field5082;

    public class510(class542 arg0) {
        this.field5082 = arg0;
    }

    @ObfuscatedName("ti.aq(II)I")
    public int method8336(int arg0) {
        if (this.field5081 != null) {
            class543 var2 = (class543) this.field5081.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field5269;
            }
        }
        return (Integer) this.field5082.method7913(arg0);
    }

    @ObfuscatedName("ti.aw(ILjava/lang/Object;I)V")
    public void method8340(int arg0, Object arg1) {
        if (this.field5081 == null) {
            this.field5081 = new HashMap();
            this.field5081.put(arg0, new class543(arg0, arg1));
            return;
        }
        class543 var3 = (class543) this.field5081.get(arg0);
        if (var3 == null) {
            this.field5081.put(arg0, new class543(arg0, arg1));
        } else {
            var3.field5269 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field5081 == null ? Collections.emptyList().iterator() : this.field5081.values().iterator();
    }
}
