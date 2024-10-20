package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("uh")
public class class539 extends class501 {

    @ObfuscatedName("uh.ak")
    public class535[] field5299;

    @ObfuscatedName("uh.ap")
    public List field5303;

    public class539(class388 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method6539(arg1, arg2 + 1);
        this.method8624(new class547(var4));
    }

    public class539(class388 arg0, int arg1) {
        byte[] var3 = arg0.method6539(arg1, 0);
        this.method8624(new class547(var3));
    }

    @ObfuscatedName("uh.aq(Lvp;I)V")
    public void method8624(class547 arg0) {
        int var2 = arg0.method8750();
        this.field5299 = new class535[var2];
        this.field5303 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field5299[var3] = (class535) class402.method3799(class535.method8593(), arg0.method8804());
            int var4 = arg0.method8750();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field5299[var3].method8589(arg0);
                int var7 = arg0.method8750();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method8750();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field5303.add(var3, var5);
        }
    }

    @ObfuscatedName("uh.ad(Ljava/lang/Object;II)Ljava/util/List;")
    public List method8625(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field5303.get(arg1);
        return (List) var3.get(arg0);
    }
}
