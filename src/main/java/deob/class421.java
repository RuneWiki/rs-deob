package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("pp")
public class class421 implements class420 {

    @ObfuscatedName("pp.v")
    public Map field4548;

    @ObfuscatedName("pp.c")
    public final class445 field4547;

    public class421(class445 arg0) {
        this.field4547 = arg0;
    }

    @ObfuscatedName("pp.v(IB)I")
    public int method6786(int arg0) {
        if (this.field4548 != null) {
            class446 var2 = (class446) this.field4548.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4682;
            }
        }
        return (Integer) this.field4547.method6459(arg0);
    }

    @ObfuscatedName("pp.c(ILjava/lang/Object;B)V")
    public void method6785(int arg0, Object arg1) {
        if (this.field4548 == null) {
            this.field4548 = new HashMap();
            this.field4548.put(arg0, new class446(arg0, arg1));
            return;
        }
        class446 var3 = (class446) this.field4548.get(arg0);
        if (var3 == null) {
            this.field4548.put(arg0, new class446(arg0, arg1));
        } else {
            var3.field4682 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4548 == null ? Collections.emptyList().iterator() : this.field4548.values().iterator();
    }
}
