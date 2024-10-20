package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ou")
public class class404 implements class403 {

    @ObfuscatedName("ou.c")
    public Map field4447;

    @ObfuscatedName("ou.l")
    public final class428 field4445;

    public class404(class428 arg0) {
        this.field4445 = arg0;
    }

    @ObfuscatedName("ou.c(II)I")
    public int method6465(int arg0) {
        if (this.field4447 != null) {
            class429 var2 = (class429) this.field4447.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field4576;
            }
        }
        return (Integer) this.field4445.method6120(arg0);
    }

    @ObfuscatedName("ou.l(ILjava/lang/Object;B)V")
    public void method6466(int arg0, Object arg1) {
        if (this.field4447 == null) {
            this.field4447 = new HashMap();
            this.field4447.put(arg0, new class429(arg0, arg1));
            return;
        }
        class429 var3 = (class429) this.field4447.get(arg0);
        if (var3 == null) {
            this.field4447.put(arg0, new class429(arg0, arg1));
        } else {
            var3.field4576 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4447 == null ? Collections.emptyList().iterator() : this.field4447.values().iterator();
    }
}
