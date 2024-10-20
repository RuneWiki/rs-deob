package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hs")
public class class221 {

    @ObfuscatedName("hs.k")
    public final List field3166;

    @ObfuscatedName("hs.h")
    public static Comparator field3163 = new class218();

    @ObfuscatedName("hs.o")
    public static Comparator field3164;

    @ObfuscatedName("hs.z")
    public static Comparator field3165;

    @ObfuscatedName("hs.c")
    public static Comparator field3162;

    static {
        new class219();
        field3164 = new class217();
        field3165 = new class213();
        field3162 = new class216();
    }

    public class221(class119 arg0, boolean arg1) {
        int var3 = arg0.method2332();
        boolean var4 = arg0.method2330() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2332();
        this.field3166 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3166.add(new class214(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hs.k(Ljava/util/Comparator;ZI)V")
    public void method3766(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3166, arg0);
        } else {
            Collections.sort(this.field3166, Collections.reverseOrder(arg0));
        }
    }
}
