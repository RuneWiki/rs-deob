package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("ht")
public class class221 {

    @ObfuscatedName("ht.c")
    public final List field3150;

    @ObfuscatedName("ht.h")
    public static Comparator field3156 = new class218();

    @ObfuscatedName("ht.k")
    public static Comparator field3152;

    @ObfuscatedName("ht.t")
    public static Comparator field3153;

    @ObfuscatedName("ht.g")
    public static Comparator field3154;

    static {
        new class219();
        field3152 = new class217();
        field3153 = new class213();
        field3154 = new class216();
    }

    public class221(class119 arg0, boolean arg1) {
        int var3 = arg0.method2293();
        boolean var4 = arg0.method2291() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2293();
        this.field3150 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3150.add(new class214(arg0, var5, var3));
        }
    }

    @ObfuscatedName("ht.c(Ljava/util/Comparator;ZI)V")
    public void method3724(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3150, arg0);
        } else {
            Collections.sort(this.field3150, Collections.reverseOrder(arg0));
        }
    }
}
