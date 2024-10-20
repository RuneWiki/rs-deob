package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("gb")
public class class202 {

    @ObfuscatedName("gb.e")
    public final List field2948;

    @ObfuscatedName("gb.v")
    public static Comparator field2946 = new class199();

    @ObfuscatedName("gb.k")
    public static Comparator field2947;

    @ObfuscatedName("gb.g")
    public static Comparator field2949;

    @ObfuscatedName("gb.q")
    public static Comparator field2950;

    static {
        new class200();
        field2947 = new class198();
        field2949 = new class194();
        field2950 = new class197();
    }

    public class202(class108 arg0, boolean arg1) {
        int var3 = arg0.method2124();
        boolean var4 = arg0.method2122() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2124();
        this.field2948 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field2948.add(new class195(arg0, var5, var3));
        }
    }

    @ObfuscatedName("gb.e(Ljava/util/Comparator;ZI)V")
    public void method3405(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field2948, arg0);
        } else {
            Collections.sort(this.field2948, Collections.reverseOrder(arg0));
        }
    }
}
