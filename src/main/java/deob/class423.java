package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("pw")
public class class423 implements class422 {

    @ObfuscatedName("pw.o")
    public Map field4607;

    @ObfuscatedName("pw.q")
    public final class447 field4608;

    public class423(class447 arg0) {
        this.field4608 = arg0;
    }

    @ObfuscatedName("pw.o(IB)I")
    public int method6703(int arg0) {
        if (this.field4607 != null) {
            class448 var2 = (class448) this.field4607.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4743;
            }
        }
        return (Integer) this.field4608.method6339(arg0);
    }

    @ObfuscatedName("pw.q(ILjava/lang/Object;B)V")
    public void method6702(int arg0, Object arg1) {
        if (this.field4607 == null) {
            this.field4607 = new HashMap();
            this.field4607.put(arg0, new class448(arg0, arg1));
            return;
        }
        class448 var3 = (class448) this.field4607.get(arg0);
        if (var3 == null) {
            this.field4607.put(arg0, new class448(arg0, arg1));
        } else {
            var3.field4743 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4607 == null ? Collections.emptyList().iterator() : this.field4607.values().iterator();
    }
}
