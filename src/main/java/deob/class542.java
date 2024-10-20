package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("uv")
public class class542 extends class504 {

    @ObfuscatedName("uv.am")
    public class538[] field5352;

    @ObfuscatedName("uv.ax")
    public List field5353;

    public class542(class391 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method6782(arg1, arg2 + 1);
        this.method8858(new class551(var4));
    }

    public class542(class391 arg0, int arg1) {
        byte[] var3 = arg0.method6782(arg1, 0);
        this.method8858(new class551(var3));
    }

    @ObfuscatedName("uv.ac(Lvf;I)V")
    public void method8858(class551 arg0) {
        int var2 = arg0.method8995();
        this.field5352 = new class538[var2];
        this.field5353 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field5352[var3] = (class538) class405.method6719(class538.method8833(), arg0.method8955());
            int var4 = arg0.method8995();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field5352[var3].method8823(arg0);
                int var7 = arg0.method8995();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method8995();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field5353.add(var3, var5);
        }
    }

    @ObfuscatedName("uv.ae(Ljava/lang/Object;IB)Ljava/util/List;")
    public List method8862(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field5353.get(arg1);
        return (List) var3.get(arg0);
    }
}
