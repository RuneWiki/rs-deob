package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("ho")
public class class221 {

    @ObfuscatedName("ho.o")
    public final List field3167;

    @ObfuscatedName("ho.f")
    public static Comparator field3163 = new class218();

    @ObfuscatedName("ho.i")
    public static Comparator field3164;

    @ObfuscatedName("ho.h")
    public static Comparator field3166;

    @ObfuscatedName("ho.q")
    public static Comparator field3165;

    static {
        new class219();
        field3164 = new class217();
        field3166 = new class213();
        field3165 = new class216();
    }

    public class221(class119 arg0, boolean arg1) {
        int var3 = arg0.method2292();
        boolean var4 = arg0.method2290() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2292();
        this.field3167 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3167.add(new class214(arg0, var5, var3));
        }
    }

    @ObfuscatedName("ho.o(Ljava/util/Comparator;ZI)V")
    public void method3702(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3167, arg0);
        } else {
            Collections.sort(this.field3167, Collections.reverseOrder(arg0));
        }
    }
}
