package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("l")
public class class14 {

    @ObfuscatedName("l.i")
    public final List field284;

    @ObfuscatedName("l.w")
    public static Comparator field278 = new class20();

    @ObfuscatedName("l.a")
    public static Comparator field279;

    @ObfuscatedName("l.t")
    public static Comparator field280;

    @ObfuscatedName("l.s")
    public static Comparator field281;

    static {
        new class13();
        field279 = new class18();
        field280 = new class19();
        field281 = new class16();
    }

    public class14(class174 arg0, boolean arg1) {
        int var3 = arg0.method2882();
        boolean var4 = arg0.method3061() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2882();
        this.field284 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field284.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("l.i(Ljava/util/Comparator;ZI)V")
    public void method53(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field284, arg0);
        } else {
            Collections.sort(this.field284, Collections.reverseOrder(arg0));
        }
    }
}
