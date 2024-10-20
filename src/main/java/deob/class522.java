package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("uq")
public class class522 extends class484 {

    @ObfuscatedName("uq.ax")
    public class518[] field5086;

    @ObfuscatedName("uq.ao")
    public List field5084;

    public class522(class374 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method6342(arg1, arg2 + 1);
        this.method8256(new class530(var4));
    }

    public class522(class374 arg0, int arg1) {
        byte[] var3 = arg0.method6342(arg1, 0);
        this.method8256(new class530(var3));
    }

    @ObfuscatedName("uq.ac(Lul;I)V")
    public void method8256(class530 arg0) {
        int var2 = arg0.method8387();
        this.field5086 = new class518[var2];
        this.field5084 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field5086[var3] = (class518) class388.method3894(class518.method8221(), arg0.method8365());
            int var4 = arg0.method8387();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field5086[var3].method8209(arg0);
                int var7 = arg0.method8387();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method8387();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field5084.add(var3, var5);
        }
    }

    @ObfuscatedName("uq.al(Ljava/lang/Object;II)Ljava/util/List;")
    public List method8257(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field5084.get(arg1);
        return (List) var3.get(arg0);
    }
}
