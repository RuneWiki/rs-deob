package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("gs")
public class class202 {

    @ObfuscatedName("gs.c")
    public final List field2945;

    @ObfuscatedName("gs.j")
    public static Comparator field2946 = new class199();

    @ObfuscatedName("gs.y")
    public static Comparator field2949;

    @ObfuscatedName("gs.r")
    public static Comparator field2947;

    @ObfuscatedName("gs.f")
    public static Comparator field2948;

    static {
        new class200();
        field2949 = new class198();
        field2947 = new class194();
        field2948 = new class197();
    }

    public class202(class108 arg0, boolean arg1) {
        int var3 = arg0.method2136();
        boolean var4 = arg0.method2134() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2136();
        this.field2945 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field2945.add(new class195(arg0, var5, var3));
        }
    }

    @ObfuscatedName("gs.c(Ljava/util/Comparator;ZI)V")
    public void method3425(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field2945, arg0);
        } else {
            Collections.sort(this.field2945, Collections.reverseOrder(arg0));
        }
    }
}
