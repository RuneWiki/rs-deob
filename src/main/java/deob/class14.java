package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("h")
public class class14 {

    @ObfuscatedName("h.e")
    public final List field280;

    @ObfuscatedName("h.n")
    public static Comparator field281 = new class20();

    @ObfuscatedName("h.g")
    public static Comparator field279;

    @ObfuscatedName("h.y")
    public static Comparator field278;

    @ObfuscatedName("h.w")
    public static Comparator field286;

    static {
        new class13();
        field279 = new class18();
        field278 = new class19();
        field286 = new class16();
    }

    public class14(class175 arg0, boolean arg1) {
        int var3 = arg0.method3091();
        boolean var4 = arg0.method2928() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3091();
        this.field280 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field280.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("h.e(Ljava/util/Comparator;ZI)V")
    public void method58(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field280, arg0);
        } else {
            Collections.sort(this.field280, Collections.reverseOrder(arg0));
        }
    }
}
