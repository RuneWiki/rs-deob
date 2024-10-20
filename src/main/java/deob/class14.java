package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("n")
public class class14 {

    @ObfuscatedName("n.e")
    public final List field273;

    @ObfuscatedName("n.o")
    public static Comparator field274 = new class20();

    @ObfuscatedName("n.m")
    public static Comparator field280;

    @ObfuscatedName("n.g")
    public static Comparator field275;

    @ObfuscatedName("n.d")
    public static Comparator field276;

    static {
        new class13();
        field280 = new class18();
        field275 = new class19();
        field276 = new class16();
    }

    public class14(class174 arg0, boolean arg1) {
        int var3 = arg0.method2930();
        boolean var4 = arg0.method2891() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2930();
        this.field273 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field273.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("n.e(Ljava/util/Comparator;ZI)V")
    public void method49(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field273, arg0);
        } else {
            Collections.sort(this.field273, Collections.reverseOrder(arg0));
        }
    }
}
