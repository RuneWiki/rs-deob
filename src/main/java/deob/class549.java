package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("vd")
public class class549 extends class511 {

    @ObfuscatedName("vd.aj")
    public class545[] field5403;

    @ObfuscatedName("vd.ai")
    public List field5402;

    public class549(class392 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method7009(arg1, arg2 + 1);
        this.method9149(new class558(var4));
    }

    public class549(class392 arg0, int arg1) {
        byte[] var3 = arg0.method7009(arg1, 0);
        this.method9149(new class558(var3));
    }

    @ObfuscatedName("vd.ap(Lvl;B)V")
    public void method9149(class558 arg0) {
        int var2 = arg0.method9280();
        this.field5403 = new class545[var2];
        this.field5402 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field5403[var3] = (class545) class406.method3580(class545.method9116(), arg0.method9258());
            int var4 = arg0.method9280();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field5403[var3].method9112(arg0);
                int var7 = arg0.method9280();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method9280();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field5402.add(var3, var5);
        }
    }

    @ObfuscatedName("vd.aw(Ljava/lang/Object;II)Ljava/util/List;")
    public List method9150(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field5402.get(arg1);
        return (List) var3.get(arg0);
    }
}
