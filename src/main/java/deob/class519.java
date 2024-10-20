package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("te")
public class class519 extends class481 {

    @ObfuscatedName("te.ao")
    public class515[] field5077;

    @ObfuscatedName("te.ab")
    public List field5080;

    public class519(class371 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method6284(arg1, arg2 + 1);
        this.method8307(new class527(var4));
    }

    public class519(class371 arg0, int arg1) {
        byte[] var3 = arg0.method6284(arg1, 0);
        this.method8307(new class527(var3));
    }

    @ObfuscatedName("te.at(Luj;I)V")
    public void method8307(class527 arg0) {
        int var2 = arg0.method8491();
        this.field5077 = new class515[var2];
        this.field5080 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field5077[var3] = (class515) class385.method164(class515.method8280(), arg0.method8410());
            int var4 = arg0.method8491();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field5077[var3].method8278(arg0);
                int var7 = arg0.method8491();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method8491();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field5080.add(var3, var5);
        }
    }

    @ObfuscatedName("te.ah(Ljava/lang/Object;IB)Ljava/util/List;")
    public List method8308(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field5080.get(arg1);
        return (List) var3.get(arg0);
    }
}
