package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("qc")
public class class468 extends class435 {

    @ObfuscatedName("qc.s")
    public class464[] field4915;

    @ObfuscatedName("qc.z")
    public List field4914;

    public class468(class337 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method5990(arg1, arg2 + 1);
        this.method7873(new class474(var4));
    }

    public class468(class337 arg0, int arg1) {
        byte[] var3 = arg0.method5990(arg1, 0);
        this.method7873(new class474(var3));
    }

    @ObfuscatedName("qc.f(Lrd;I)V")
    public void method7873(class474 arg0) {
        int var2 = arg0.method7985();
        this.field4915 = new class464[var2];
        this.field4914 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field4915[var3] = (class464) class351.method19(class464.method7831(), arg0.method7964());
            int var4 = arg0.method7985();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field4915[var3].method7833(arg0);
                int var7 = arg0.method7985();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method7985();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field4914.add(var3, var5);
        }
    }

    @ObfuscatedName("qc.w(Ljava/lang/Object;II)Ljava/util/List;")
    public List method7868(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field4914.get(arg1);
        return (List) var3.get(arg0);
    }
}
