package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("sk")
public class class483 extends class444 {

    @ObfuscatedName("sk.ac")
    public class479[] field4965;

    @ObfuscatedName("sk.au")
    public List field4963;

    public class483(class344 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method6090(arg1, arg2 + 1);
        this.method8140(new class489(var4));
    }

    public class483(class344 arg0, int arg1) {
        byte[] var3 = arg0.method6090(arg1, 0);
        this.method8140(new class489(var3));
    }

    @ObfuscatedName("sk.af(Lsg;I)V")
    public void method8140(class489 arg0) {
        int var2 = arg0.method8270();
        this.field4965 = new class479[var2];
        this.field4963 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field4965[var3] = (class479) Statics.method3600(class479.method8097(), arg0.method8248());
            int var4 = arg0.method8270();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field4965[var3].method8100(arg0);
                int var7 = arg0.method8270();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method8270();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field4963.add(var3, var5);
        }
    }

    @ObfuscatedName("sk.an(Ljava/lang/Object;II)Ljava/util/List;")
    public List method8141(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field4963.get(arg1);
        return (List) var3.get(arg0);
    }
}
