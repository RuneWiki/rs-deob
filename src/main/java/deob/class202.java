package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("go")
public class class202 {

    @ObfuscatedName("go.g")
    public final List field2950;

    @ObfuscatedName("go.j")
    public static Comparator field2947 = new class199();

    @ObfuscatedName("go.z")
    public static Comparator field2949;

    @ObfuscatedName("go.b")
    public static Comparator field2948;

    @ObfuscatedName("go.k")
    public static Comparator field2951;

    static {
        new class200();
        field2949 = new class198();
        field2948 = new class194();
        field2951 = new class197();
    }

    public class202(class108 arg0, boolean arg1) {
        int var3 = arg0.method2263();
        boolean var4 = arg0.method2083() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2263();
        this.field2950 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field2950.add(new class195(arg0, var5, var3));
        }
    }

    @ObfuscatedName("go.g(Ljava/util/Comparator;ZB)V")
    public void method3348(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field2950, arg0);
        } else {
            Collections.sort(this.field2950, Collections.reverseOrder(arg0));
        }
    }
}
