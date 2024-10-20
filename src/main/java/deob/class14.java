package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("t")
public class class14 {

    @ObfuscatedName("t.w")
    public final List field291;

    @ObfuscatedName("t.s")
    public static Comparator field286 = new class20();

    @ObfuscatedName("t.q")
    public static Comparator field287;

    @ObfuscatedName("t.o")
    public static Comparator field290;

    @ObfuscatedName("t.g")
    public static Comparator field289;

    static {
        new class13();
        field287 = new class18();
        field290 = new class19();
        field289 = new class16();
    }

    public class14(class174 arg0, boolean arg1) {
        int var3 = arg0.method3178();
        boolean var4 = arg0.method2971() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3178();
        this.field291 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field291.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("t.w(Ljava/util/Comparator;ZI)V")
    public void method64(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field291, arg0);
        } else {
            Collections.sort(this.field291, Collections.reverseOrder(arg0));
        }
    }
}
