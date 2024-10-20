package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("uz")
public class class526 extends class488 {

    @ObfuscatedName("uz.ai")
    public class522[] field5142;

    @ObfuscatedName("uz.ar")
    public List field5146;

    public class526(class378 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method6489(arg1, arg2 + 1);
        this.method8490(new class534(var4));
    }

    public class526(class378 arg0, int arg1) {
        byte[] var3 = arg0.method6489(arg1, 0);
        this.method8490(new class534(var3));
    }

    @ObfuscatedName("uz.aq(Luq;I)V")
    public void method8490(class534 arg0) {
        int var2 = arg0.method8657();
        this.field5142 = new class522[var2];
        this.field5146 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field5142[var3] = (class522) class392.method6317(class522.method8464(), arg0.method8591());
            int var4 = arg0.method8657();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field5142[var3].method8455(arg0);
                int var7 = arg0.method8657();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method8657();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field5146.add(var3, var5);
        }
    }

    @ObfuscatedName("uz.aw(Ljava/lang/Object;IB)Ljava/util/List;")
    public List method8492(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field5146.get(arg1);
        return (List) var3.get(arg0);
    }
}
