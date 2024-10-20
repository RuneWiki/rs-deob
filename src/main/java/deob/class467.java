package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ry")
public class class467 implements class466 {

    @ObfuscatedName("ry.af")
    public Map field4906;

    @ObfuscatedName("ry.an")
    public final class497 field4905;

    public class467(class497 arg0) {
        this.field4905 = arg0;
    }

    @ObfuscatedName("ry.af(IB)I")
    public int method7987(int arg0) {
        if (this.field4906 != null) {
            class498 var2 = (class498) this.field4906.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field5058;
            }
        }
        return (Integer) this.field4905.method7572(arg0);
    }

    @ObfuscatedName("ry.an(ILjava/lang/Object;I)V")
    public void method7984(int arg0, Object arg1) {
        if (this.field4906 == null) {
            this.field4906 = new HashMap();
            this.field4906.put(arg0, new class498(arg0, arg1));
            return;
        }
        class498 var3 = (class498) this.field4906.get(arg0);
        if (var3 == null) {
            this.field4906.put(arg0, new class498(arg0, arg1));
        } else {
            var3.field5058 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4906 == null ? Collections.emptyList().iterator() : this.field4906.values().iterator();
    }
}
