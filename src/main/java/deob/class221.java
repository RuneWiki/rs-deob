package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hq")
public class class221 {

    @ObfuscatedName("hq.a")
    public final List field3170;

    @ObfuscatedName("hq.r")
    public static Comparator field3171 = new class218();

    @ObfuscatedName("hq.f")
    public static Comparator field3173;

    @ObfuscatedName("hq.s")
    public static Comparator field3172;

    @ObfuscatedName("hq.y")
    public static Comparator field3174;

    static {
        new class219();
        field3173 = new class217();
        field3172 = new class213();
        field3174 = new class216();
    }

    public class221(class119 arg0, boolean arg1) {
        int var3 = arg0.method2347();
        boolean var4 = arg0.method2412() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2347();
        this.field3170 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3170.add(new class214(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hq.a(Ljava/util/Comparator;ZB)V")
    public void method3760(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3170, arg0);
        } else {
            Collections.sort(this.field3170, Collections.reverseOrder(arg0));
        }
    }
}
