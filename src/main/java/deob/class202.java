package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("ga")
public class class202 {

    @ObfuscatedName("ga.f")
    public final List field2943;

    @ObfuscatedName("ga.k")
    public static Comparator field2948 = new class199();

    @ObfuscatedName("ga.y")
    public static Comparator field2944;

    @ObfuscatedName("ga.e")
    public static Comparator field2946;

    @ObfuscatedName("ga.r")
    public static Comparator field2947;

    static {
        new class200();
        field2944 = new class198();
        field2946 = new class194();
        field2947 = new class197();
    }

    public class202(class108 arg0, boolean arg1) {
        int var3 = arg0.method2160();
        boolean var4 = arg0.method2158() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2160();
        this.field2943 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field2943.add(new class195(arg0, var5, var3));
        }
    }

    @ObfuscatedName("ga.f(Ljava/util/Comparator;ZB)V")
    public void method3450(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field2943, arg0);
        } else {
            Collections.sort(this.field2943, Collections.reverseOrder(arg0));
        }
    }
}
