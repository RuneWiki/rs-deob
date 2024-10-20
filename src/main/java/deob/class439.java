package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("pb")
public class class439 extends class407 {

    @ObfuscatedName("pb.n")
    public class435[] field4712;

    @ObfuscatedName("pb.k")
    public List field4711;

    public class439(class317 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.method5499(arg1, arg2 + 1);
        this.method7096(new class445(var4));
    }

    public class439(class317 arg0, int arg1) {
        byte[] var3 = arg0.method5499(arg1, 0);
        this.method7096(new class445(var3));
    }

    @ObfuscatedName("pb.c(Lqq;B)V")
    public void method7096(class445 arg0) {
        int var2 = arg0.method7217();
        this.field4712 = new class435[var2];
        this.field4711 = new ArrayList(var2);
        for (int var3 = 0; var3 < var2; var3++) {
            this.field4712[var3] = (class435) class331.method5118(class435.method7062(), arg0.method7196());
            int var4 = arg0.method7217();
            HashMap var5 = new HashMap(var4);
            while (var4-- > 0) {
                Object var6 = this.field4712[var3].method7060(arg0);
                int var7 = arg0.method7217();
                ArrayList var8 = new ArrayList();
                while (var7-- > 0) {
                    int var9 = arg0.method7217();
                    var8.add(var9);
                }
                var5.put(var6, var8);
            }
            this.field4711.add(var3, var5);
        }
    }

    @ObfuscatedName("pb.p(Ljava/lang/Object;II)Ljava/util/List;")
    public List method7097(Object arg0, int arg1) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        Map var3 = (Map) this.field4711.get(arg1);
        return (List) var3.get(arg0);
    }
}
