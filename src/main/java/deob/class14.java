package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("a")
public class class14 {

    @ObfuscatedName("a.n")
    public final List field285;

    @ObfuscatedName("a.p")
    public static Comparator field279 = new class20();

    @ObfuscatedName("a.i")
    public static Comparator field280;

    @ObfuscatedName("a.j")
    public static Comparator field281;

    @ObfuscatedName("a.f")
    public static Comparator field284;

    static {
        new class13();
        field280 = new class18();
        field281 = new class19();
        field284 = new class16();
    }

    public class14(class174 arg0, boolean arg1) {
        int var3 = arg0.method3065();
        boolean var4 = arg0.method2925() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3065();
        this.field285 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field285.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("a.n(Ljava/util/Comparator;ZI)V")
    public void method73(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field285, arg0);
        } else {
            Collections.sort(this.field285, Collections.reverseOrder(arg0));
        }
    }
}
