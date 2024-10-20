package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("um")
public class class538 extends class500 {

    @ObfuscatedName("um.az")
    public class534[] field5284;

    @ObfuscatedName("um.af")
    public List field5285;

    public class538(class387 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method6573(arg1, arg2 + 1);
        this.method8692(new class546(var4));
    }

    public class538(class387 arg0, int arg1) {
        byte[] var3 = arg0.method6573(arg1, 0);
        this.method8692(new class546(var3));
    }

    @ObfuscatedName("um.ak(Lua;I)V")
    public void method8692(class546 arg0) {
        int var2 = arg0.method8816();
        this.field5284 = new class534[var2];
        this.field5285 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field5284[var3] = (class534) class401.method2027(class534.method8663(), arg0.method8796());
            int var4 = arg0.method8816();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field5284[var3].method8659(arg0);
                int var7 = arg0.method8816();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method8816();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field5285.add(var3, var5);
        }
    }

    @ObfuscatedName("um.al(Ljava/lang/Object;II)Ljava/util/List;")
    public List method8693(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field5285.get(arg1);
        return (List) var3.get(arg0);
    }
}
