package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("ps")
public class class437 extends class405 {

    @ObfuscatedName("ps.f")
    public class433[] field4671;

    @ObfuscatedName("ps.j")
    public List field4674;

    public class437(class315 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method5305(arg1, arg2 + 1);
        this.method6932(new class443(var4));
    }

    public class437(class315 arg0, int arg1) {
        byte[] var3 = arg0.method5305(arg1, 0);
        this.method6932(new class443(var3));
    }

    @ObfuscatedName("ps.c(Lqt;I)V")
    public void method6932(class443 arg0) {
        int var2 = arg0.method7068();
        this.field4671 = new class433[var2];
        this.field4674 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field4671[var3] = (class433) class329.method2087(class433.method6888(), arg0.method7047());
            int var4 = arg0.method7068();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field4671[var3].method6887(arg0);
                int var7 = arg0.method7068();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method7068();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field4674.add(var3, var5);
        }
    }

    @ObfuscatedName("ps.v(Ljava/lang/Object;II)Ljava/util/List;")
    public List method6933(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field4674.get(arg1);
        return (List) var3.get(arg0);
    }
}
