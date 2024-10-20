package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("n")
public class class14 {

    @ObfuscatedName("n.o")
    public final List field287;

    @ObfuscatedName("n.k")
    public static Comparator field284 = new class20();

    @ObfuscatedName("n.t")
    public static Comparator field291;

    @ObfuscatedName("n.d")
    public static Comparator field286;

    @ObfuscatedName("n.h")
    public static Comparator field289;

    static {
        new class13();
        field291 = new class18();
        field286 = new class19();
        field289 = new class16();
    }

    public class14(class195 arg0, boolean arg1) {
        int var3 = arg0.method3207();
        boolean var4 = arg0.method3205() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3207();
        this.field287 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field287.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("n.o(Ljava/util/Comparator;ZI)V")
    public void method60(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field287, arg0);
        } else {
            Collections.sort(this.field287, Collections.reverseOrder(arg0));
        }
    }
}
