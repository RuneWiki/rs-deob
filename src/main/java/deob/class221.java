package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hn")
public class class221 {

    @ObfuscatedName("hn.v")
    public final List field3170;

    @ObfuscatedName("hn.f")
    public static Comparator field3168 = new class218();

    @ObfuscatedName("hn.i")
    public static Comparator field3169;

    @ObfuscatedName("hn.d")
    public static Comparator field3171;

    @ObfuscatedName("hn.o")
    public static Comparator field3172;

    static {
        new class219();
        field3169 = new class217();
        field3171 = new class213();
        field3172 = new class216();
    }

    public class221(class119 arg0, boolean arg1) {
        int var3 = arg0.method2334();
        boolean var4 = arg0.method2400() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2334();
        this.field3170 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3170.add(new class214(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hn.v(Ljava/util/Comparator;ZB)V")
    public void method3747(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3170, arg0);
        } else {
            Collections.sort(this.field3170, Collections.reverseOrder(arg0));
        }
    }
}
