package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("mk")
public class class339 {

    @ObfuscatedName("mk.f")
    public final List field4263;

    @ObfuscatedName("mk.w")
    public static Comparator field4262 = new class342();

    @ObfuscatedName("mk.v")
    public static Comparator field4264;

    @ObfuscatedName("mk.s")
    public static Comparator field4265;

    @ObfuscatedName("mk.z")
    public static Comparator field4266;

    static {
        new class344();
        field4264 = new class347();
        field4265 = new class341();
        field4266 = new class340();
    }

    public class339(class474 arg0, boolean arg1) {
        int var3 = arg0.method8032();
        boolean var4 = arg0.method7964() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method8032();
        this.field4263 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4263.add(new class345(arg0, var5, var3));
        }
    }

    @ObfuscatedName("mk.f(Ljava/util/Comparator;ZI)V")
    public void method6087(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4263, arg0);
        } else {
            Collections.sort(this.field4263, Collections.reverseOrder(arg0));
        }
    }
}
