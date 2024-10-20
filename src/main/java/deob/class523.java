package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("uq")
public class class523 extends class485 {

    @ObfuscatedName("uq.aj")
    public class519[] field5123;

    @ObfuscatedName("uq.aq")
    public List field5120;

    public class523(class375 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method6396(arg1, arg2 + 1);
        this.method8456(new class531(var4));
    }

    public class523(class375 arg0, int arg1) {
        byte[] var3 = arg0.method6396(arg1, 0);
        this.method8456(new class531(var3));
    }

    @ObfuscatedName("uq.am(Luk;B)V")
    public void method8456(class531 arg0) {
        int var2 = arg0.method8703();
        this.field5123 = new class519[var2];
        this.field5120 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field5123[var3] = (class519) class389.method6514(class519.method8439(), arg0.method8561());
            int var4 = arg0.method8703();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field5123[var3].method8428(arg0);
                int var7 = arg0.method8703();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method8703();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field5120.add(var3, var5);
        }
    }

    @ObfuscatedName("uq.ap(Ljava/lang/Object;II)Ljava/util/List;")
    public List method8458(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field5120.get(arg1);
        return (List) var3.get(arg0);
    }
}
