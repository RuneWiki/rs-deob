package deob;

import java.util.HashMap;

@ObfuscatedName("pq")
public class class436 {

    @ObfuscatedName("pq.a")
    public class330 field4749;

    @ObfuscatedName("pq.f")
    public class330 field4748;

    @ObfuscatedName("pq.c")
    public HashMap field4750;

    public class436(class330 arg0, class330 arg1) {
        this.field4749 = arg0;
        this.field4748 = arg1;
        this.field4750 = new HashMap();
    }

    @ObfuscatedName("pq.a([Lpz;I)Ljava/util/HashMap;")
    public HashMap method7417(class437[] arg0) {
        HashMap var2 = new HashMap();
        class437[] var3 = arg0;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class437 var5 = var3[var4];
            if (this.field4750.containsKey(var5)) {
                var2.put(var5, this.field4750.get(var5));
            } else {
                class365 var6 = Statics.method2671(this.field4749, this.field4748, var5.field4757, "");
                if (var6 != null) {
                    this.field4750.put(var5, var6);
                    var2.put(var5, var6);
                }
            }
        }
        return var2;
    }
}
