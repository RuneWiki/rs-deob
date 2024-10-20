package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hq")
public class class221 {

    @ObfuscatedName("hq.h")
    public final List field3155;

    @ObfuscatedName("hq.q")
    public static Comparator field3160 = new class218();

    @ObfuscatedName("hq.v")
    public static Comparator field3156;

    @ObfuscatedName("hq.n")
    public static Comparator field3157;

    @ObfuscatedName("hq.f")
    public static Comparator field3154;

    static {
        new class219();
        field3156 = new class217();
        field3157 = new class213();
        field3154 = new class216();
    }

    public class221(class119 arg0, boolean arg1) {
        int var3 = arg0.method2385();
        boolean var4 = arg0.method2383() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2385();
        this.field3155 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3155.add(new class214(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hq.h(Ljava/util/Comparator;ZI)V")
    public void method3812(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3155, arg0);
        } else {
            Collections.sort(this.field3155, Collections.reverseOrder(arg0));
        }
    }
}
