package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("tx")
public class class507 extends class469 {

    @ObfuscatedName("tx.at")
    public class503[] field5048;

    @ObfuscatedName("tx.ac")
    public List field5051;

    public class507(class359 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method6128(arg1, arg2 + 1);
        this.method8194(new class515(var4));
    }

    public class507(class359 arg0, int arg1) {
        byte[] var3 = arg0.method6128(arg1, 0);
        this.method8194(new class515(var3));
    }

    @ObfuscatedName("tx.au(Ltm;I)V")
    public void method8194(class515 arg0) {
        int var2 = arg0.method8322();
        this.field5048 = new class503[var2];
        this.field5051 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field5048[var3] = (class503) class373.method371(class503.method8172(), arg0.method8300());
            int var4 = arg0.method8322();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field5048[var3].method8169(arg0);
                int var7 = arg0.method8322();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method8322();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field5051.add(var3, var5);
        }
    }

    @ObfuscatedName("tx.ae(Ljava/lang/Object;IB)Ljava/util/List;")
    public List method8195(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field5051.get(arg1);
        return (List) var3.get(arg0);
    }
}
