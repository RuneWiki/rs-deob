package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("ub")
public class class540 extends class502 {

    @ObfuscatedName("ub.au")
    public class536[] field5315;

    @ObfuscatedName("ub.ax")
    public List field5314;

    public class540(class389 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method6670(arg1, arg2 + 1);
        this.method8691(new class549(var4));
    }

    public class540(class389 arg0, int arg1) {
        byte[] var3 = arg0.method6670(arg1, 0);
        this.method8691(new class549(var3));
    }

    @ObfuscatedName("ub.ab(Lvg;B)V")
    public void method8691(class549 arg0) {
        int var2 = arg0.method8843();
        this.field5315 = new class536[var2];
        this.field5314 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field5315[var3] = (class536) class403.method3083(class536.method8659(), arg0.method9025());
            int var4 = arg0.method8843();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field5315[var3].method8662(arg0);
                int var7 = arg0.method8843();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method8843();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field5314.add(var3, var5);
        }
    }

    @ObfuscatedName("ub.ay(Ljava/lang/Object;II)Ljava/util/List;")
    public List method8690(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field5314.get(arg1);
        return (List) var3.get(arg0);
    }
}
