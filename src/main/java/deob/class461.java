package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("qf")
public class class461 extends class428 {

    @ObfuscatedName("qf.x")
    public class457[] field4887;

    @ObfuscatedName("qf.m")
    public List field4888;

    public class461(class333 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method5909(arg1, arg2 + 1);
        this.method7692(new class467(var4));
    }

    public class461(class333 arg0, int arg1) {
        byte[] var3 = arg0.method5909(arg1, 0);
        this.method7692(new class467(var3));
    }

    @ObfuscatedName("qf.h(Lqy;B)V")
    public void method7692(class467 arg0) {
        int var2 = arg0.method7812();
        this.field4887 = new class457[var2];
        this.field4888 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field4887[var3] = (class457) class347.method1688(class457.method7658(), arg0.method7792());
            int var4 = arg0.method7812();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field4887[var3].method7650(arg0);
                int var7 = arg0.method7812();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method7812();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field4888.add(var3, var5);
        }
    }

    @ObfuscatedName("qf.e(Ljava/lang/Object;II)Ljava/util/List;")
    public List method7693(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field4888.get(arg1);
        return (List) var3.get(arg0);
    }
}
