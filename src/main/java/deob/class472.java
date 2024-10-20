package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("st")
public class class472 extends class439 {

    @ObfuscatedName("st.ab")
    public class468[] field4876;

    @ObfuscatedName("st.an")
    public List field4877;

    public class472(class340 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method5860(arg1, arg2 + 1);
        this.method7797(new class478(var4));
    }

    public class472(class340 arg0, int arg1) {
        byte[] var3 = arg0.method5860(arg1, 0);
        this.method7797(new class478(var3));
    }

    @ObfuscatedName("st.aj(Lsy;I)V")
    public void method7797(class478 arg0) {
        int var2 = arg0.method8082();
        this.field4876 = new class468[var2];
        this.field4877 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field4876[var3] = (class468) class354.method5197(class468.method7769(), arg0.method7909());
            int var4 = arg0.method8082();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field4876[var3].method7756(arg0);
                int var7 = arg0.method8082();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method8082();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field4877.add(var3, var5);
        }
    }

    @ObfuscatedName("st.al(Ljava/lang/Object;II)Ljava/util/List;")
    public List method7796(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field4877.get(arg1);
        return (List) var3.get(arg0);
    }
}
