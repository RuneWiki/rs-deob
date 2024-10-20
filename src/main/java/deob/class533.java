package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("uv")
public class class533 implements class532 {

    @ObfuscatedName("uv.ap")
    public Map field5333;

    @ObfuscatedName("uv.aw")
    public final class566 field5334;

    public class533(class566 arg0) {
        this.field5334 = arg0;
    }

    @ObfuscatedName("uv.ap(II)I")
    public int method9007(int arg0) {
        if (this.field5333 != null) {
            class567 var2 = (class567) this.field5333.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field5530;
            }
        }
        return (Integer) this.field5334.method8578(arg0);
    }

    @ObfuscatedName("uv.aw(ILjava/lang/Object;I)V")
    public void method9008(int arg0, Object arg1) {
        if (this.field5333 == null) {
            this.field5333 = new HashMap();
            this.field5333.put(arg0, new class567(arg0, arg1));
            return;
        }
        class567 var3 = (class567) this.field5333.get(arg0);
        if (var3 == null) {
            this.field5333.put(arg0, new class567(arg0, arg1));
        } else {
            var3.field5530 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field5333 == null ? Collections.emptyList().iterator() : this.field5333.values().iterator();
    }
}
