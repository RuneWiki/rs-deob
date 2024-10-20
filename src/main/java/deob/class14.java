package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("x")
public class class14 {

    @ObfuscatedName("x.i")
    public final List field278;

    @ObfuscatedName("x.h")
    public static Comparator field279 = new class20();

    @ObfuscatedName("x.u")
    public static Comparator field283;

    @ObfuscatedName("x.q")
    public static Comparator field281;

    @ObfuscatedName("x.g")
    public static Comparator field282;

    static {
        new class13();
        field283 = new class18();
        field281 = new class19();
        field282 = new class16();
    }

    public class14(class174 arg0, boolean arg1) {
        int var3 = arg0.method2932();
        boolean var4 = arg0.method2930() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2932();
        this.field278 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field278.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("x.i(Ljava/util/Comparator;ZI)V")
    public void method56(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field278, arg0);
        } else {
            Collections.sort(this.field278, Collections.reverseOrder(arg0));
        }
    }
}
