package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("qq")
public class class458 extends class425 {

    @ObfuscatedName("qq.x")
    public class454[] field4845;

    @ObfuscatedName("qq.h")
    public List field4844;

    public class458(class330 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method5859(arg1, arg2 + 1);
        this.method7607(new class464(var4));
    }

    public class458(class330 arg0, int arg1) {
        byte[] var3 = arg0.method5859(arg1, 0);
        this.method7607(new class464(var3));
    }

    @ObfuscatedName("qq.a(Lqr;I)V")
    public void method7607(class464 arg0) {
        int var2 = arg0.method7736();
        this.field4845 = new class454[var2];
        this.field4844 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field4845[var3] = (class454) class344.method4292(class454.method7587(), arg0.method7735());
            int var4 = arg0.method7736();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field4845[var3].method7577(arg0);
                int var7 = arg0.method7736();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method7736();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field4844.add(var3, var5);
        }
    }

    @ObfuscatedName("qq.f(Ljava/lang/Object;II)Ljava/util/List;")
    public List method7613(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field4844.get(arg1);
        return (List) var3.get(arg0);
    }
}
