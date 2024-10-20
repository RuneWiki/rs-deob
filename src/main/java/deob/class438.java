package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("pz")
public class class438 extends class406 {

    @ObfuscatedName("pz.v")
    public class434[] field4673;

    @ObfuscatedName("pz.c")
    public List field4677;

    public class438(class316 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method5179(arg1, arg2 + 1);
        this.method6829(new class444(var4));
    }

    public class438(class316 arg0, int arg1) {
        byte[] var3 = arg0.method5179(arg1, 0);
        this.method6829(new class444(var3));
    }

    @ObfuscatedName("pz.s(Lqr;I)V")
    public void method6829(class444 arg0) {
        int var2 = arg0.method6971();
        this.field4673 = new class434[var2];
        this.field4677 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field4673[var3] = (class434) class330.method525(Statics.method6797(), arg0.method6929());
            int var4 = arg0.method6971();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field4673[var3].method6796(arg0);
                int var7 = arg0.method6971();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method6971();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field4677.add(var3, var5);
        }
    }

    @ObfuscatedName("pz.h(Ljava/lang/Object;IB)Ljava/util/List;")
    public List method6830(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field4677.get(arg1);
        return (List) var3.get(arg0);
    }
}
