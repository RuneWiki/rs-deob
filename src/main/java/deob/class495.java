package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("tb")
public class class495 extends class457 {

    @ObfuscatedName("tb.as")
    public class491[] field4990;

    @ObfuscatedName("tb.ax")
    public List field4992;

    public class495(class357 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method6080(arg1, arg2 + 1);
        this.method8022(new class501(var4));
    }

    public class495(class357 arg0, int arg1) {
        byte[] var3 = arg0.method6080(arg1, 0);
        this.method8022(new class501(var3));
    }

    @ObfuscatedName("tb.at(Ltz;I)V")
    public void method8022(class501 arg0) {
        int var2 = arg0.method8150();
        this.field4990 = new class491[var2];
        this.field4992 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field4990[var3] = (class491) class371.method4632(class491.method7989(), arg0.method8129());
            int var4 = arg0.method8150();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field4990[var3].method7988(arg0);
                int var7 = arg0.method8150();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method8150();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field4992.add(var3, var5);
        }
    }

    @ObfuscatedName("tb.an(Ljava/lang/Object;II)Ljava/util/List;")
    public List method8023(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field4992.get(arg1);
        return (List) var3.get(arg0);
    }
}
