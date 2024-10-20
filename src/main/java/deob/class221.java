package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hu")
public class class221 {

    @ObfuscatedName("hu.n")
    public final List field3167;

    @ObfuscatedName("hu.q")
    public static Comparator field3166 = new class218();

    @ObfuscatedName("hu.c")
    public static Comparator field3165;

    @ObfuscatedName("hu.l")
    public static Comparator field3168;

    @ObfuscatedName("hu.r")
    public static Comparator field3169;

    static {
        new class219();
        field3165 = new class217();
        field3168 = new class213();
        field3169 = new class216();
    }

    public class221(class119 arg0, boolean arg1) {
        int var3 = arg0.method2430();
        boolean var4 = arg0.method2360() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2430();
        this.field3167 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3167.add(new class214(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hu.n(Ljava/util/Comparator;ZB)V")
    public void method3736(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3167, arg0);
        } else {
            Collections.sort(this.field3167, Collections.reverseOrder(arg0));
        }
    }
}
