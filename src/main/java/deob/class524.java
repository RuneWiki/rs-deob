package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ui")
public class class524 implements class523 {

    @ObfuscatedName("ui.ab")
    public Map field5245;

    @ObfuscatedName("ui.ay")
    public final class557 field5246;

    public class524(class557 arg0) {
        this.field5246 = arg0;
    }

    @ObfuscatedName("ui.ab(II)I")
    public int method8559(int arg0) {
        if (this.field5245 != null) {
            class558 var2 = (class558) this.field5245.get(arg0);
            if (var2 != null) {
                return (Integer) var2.field5446;
            }
        }
        return (Integer) this.field5246.method8141(arg0);
    }

    @ObfuscatedName("ui.ay(ILjava/lang/Object;B)V")
    public void method8554(int arg0, Object arg1) {
        if (this.field5245 == null) {
            this.field5245 = new HashMap();
            this.field5245.put(arg0, new class558(arg0, arg1));
            return;
        }
        class558 var3 = (class558) this.field5245.get(arg0);
        if (var3 == null) {
            this.field5245.put(arg0, new class558(arg0, arg1));
        } else {
            var3.field5446 = arg1;
        }
    }

    public Iterator iterator() {
        return this.field5245 == null ? Collections.emptyList().iterator() : this.field5245.values().iterator();
    }
}
