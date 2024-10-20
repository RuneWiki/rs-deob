package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("tx")
public class class508 extends class470 {

    @ObfuscatedName("tx.am")
    public class504[] field5047;

    @ObfuscatedName("tx.as")
    public List field5045;

    public class508(class360 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method6117(arg1, arg2 + 1);
        this.method8146(new class514(var4));
    }

    public class508(class360 arg0, int arg1) {
        byte[] var3 = arg0.method6117(arg1, 0);
        this.method8146(new class514(var3));
    }

    @ObfuscatedName("tx.aw(Lty;I)V")
    public void method8146(class514 arg0) {
        int var2 = arg0.method8489();
        this.field5047 = new class504[var2];
        this.field5045 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field5047[var3] = (class504) class374.method2465(class504.method8111(), arg0.method8244());
            int var4 = arg0.method8489();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field5047[var3].method8108(arg0);
                int var7 = arg0.method8489();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method8489();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field5045.add(var3, var5);
        }
    }

    @ObfuscatedName("tx.ay(Ljava/lang/Object;IB)Ljava/util/List;")
    public List method8147(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field5045.get(arg1);
        return (List) var3.get(arg0);
    }
}
