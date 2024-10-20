package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("r")
public class class14 {

    @ObfuscatedName("r.g")
    public final List field281;

    @ObfuscatedName("r.e")
    public static Comparator field284 = new class20();

    @ObfuscatedName("r.b")
    public static Comparator field282;

    @ObfuscatedName("r.z")
    public static Comparator field283;

    @ObfuscatedName("r.n")
    public static Comparator field280;

    static {
        new class13();
        field282 = new class18();
        field283 = new class19();
        field280 = new class16();
    }

    public class14(class195 arg0, boolean arg1) {
        int var3 = arg0.method3310();
        boolean var4 = arg0.method3332() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3310();
        this.field281 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field281.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("r.g(Ljava/util/Comparator;ZI)V")
    public void method68(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field281, arg0);
        } else {
            Collections.sort(this.field281, Collections.reverseOrder(arg0));
        }
    }
}
