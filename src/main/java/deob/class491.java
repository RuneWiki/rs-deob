package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("sx")
public class class491 implements class490 {

    @ObfuscatedName("sx.au")
    public Map field4983;

    @ObfuscatedName("sx.ae")
    public final class523 field4982;

    public class491(class523 arg0) {
        this.field4982 = arg0;
    }

    @ObfuscatedName("sx.au(IS)I")
    public int method8045(int arg0) {
        if (this.field4983 != null) {
            class524 var2 = (class524) this.field4983.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field5178;
            }
        }
        return (Integer) this.field4982.method7618(arg0);
    }

    @ObfuscatedName("sx.ae(ILjava/lang/Object;I)V")
    public void method8042(int arg0, Object arg1) {
        if (this.field4983 == null) {
            this.field4983 = new HashMap();
            this.field4983.put(arg0, new class524(arg0, arg1));
            return;
        }
        class524 var3 = (class524) this.field4983.get(arg0);
        if (var3 == null) {
            this.field4983.put(arg0, new class524(arg0, arg1));
        } else {
            var3.field5178 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field4983 == null ? Collections.emptyList().iterator() : this.field4983.values().iterator();
    }
}
