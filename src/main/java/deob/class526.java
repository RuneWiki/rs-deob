package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("uh")
public class class526 implements class525 {

    @ObfuscatedName("uh.ac")
    public Map field5281;

    @ObfuscatedName("uh.ae")
    public final class559 field5282;

    public class526(class559 arg0) {
        this.field5282 = arg0;
    }

    @ObfuscatedName("uh.ac(II)I")
    public int method8703(int arg0) {
        if (this.field5281 != null) {
            class560 var2 = (class560) this.field5281.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field5481;
            }
        }
        return (Integer) this.field5282.method8283(arg0);
    }

    @ObfuscatedName("uh.ae(ILjava/lang/Object;I)V")
    public void method8702(int arg0, Object arg1) {
        if (this.field5281 == null) {
            this.field5281 = new HashMap();
            this.field5281.put(arg0, new class560(arg0, arg1));
            return;
        }
        class560 var3 = (class560) this.field5281.get(arg0);
        if (var3 == null) {
            this.field5281.put(arg0, new class560(arg0, arg1));
        } else {
            var3.field5481 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field5281 == null ? Collections.emptyList().iterator() : this.field5281.values().iterator();
    }
}
