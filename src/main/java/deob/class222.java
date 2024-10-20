package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hz")
public class class222 {

    @ObfuscatedName("hz.a")
    public final List field3177;

    @ObfuscatedName("hz.w")
    public static Comparator field3178 = new class219();

    @ObfuscatedName("hz.d")
    public static Comparator field3179;

    @ObfuscatedName("hz.c")
    public static Comparator field3181;

    @ObfuscatedName("hz.y")
    public static Comparator field3180;

    static {
        new class220();
        field3179 = new class218();
        field3181 = new class214();
        field3180 = new class217();
    }

    public class222(class120 arg0, boolean arg1) {
        int var3 = arg0.method2464();
        boolean var4 = arg0.method2462() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2464();
        this.field3177 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3177.add(new class215(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hz.a(Ljava/util/Comparator;ZI)V")
    public void method3838(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3177, arg0);
        } else {
            Collections.sort(this.field3177, Collections.reverseOrder(arg0));
        }
    }
}
