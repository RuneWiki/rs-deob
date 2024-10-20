package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("uh")
public class class527 extends class489 {

    @ObfuscatedName("uh.at")
    public class523[] field5172;

    @ObfuscatedName("uh.an")
    public List field5171;

    public class527(class379 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method6328(arg1, arg2 + 1);
        this.method8362(new class535(var4));
    }

    public class527(class379 arg0, int arg1) {
        byte[] var3 = arg0.method6328(arg1, 0);
        this.method8362(new class535(var3));
    }

    @ObfuscatedName("uh.az(Lur;I)V")
    public void method8362(class535 arg0) {
        int var2 = arg0.method8468();
        this.field5172 = new class523[var2];
        this.field5171 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field5172[var3] = (class523) class393.method3484(class523.method8332(), arg0.method8462());
            int var4 = arg0.method8468();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field5172[var3].method8321(arg0);
                int var7 = arg0.method8468();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method8468();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field5171.add(var3, var5);
        }
    }

    @ObfuscatedName("uh.ah(Ljava/lang/Object;II)Ljava/util/List;")
    public List method8364(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field5171.get(arg1);
        return (List) var3.get(arg0);
    }
}
