package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("y")
public class class14 {

    @ObfuscatedName("y.i")
    public final List field290;

    @ObfuscatedName("y.j")
    public static Comparator field284 = new class20();

    @ObfuscatedName("y.a")
    public static Comparator field285;

    @ObfuscatedName("y.r")
    public static Comparator field286;

    @ObfuscatedName("y.o")
    public static Comparator field292;

    static {
        new class13();
        field285 = new class18();
        field286 = new class19();
        field292 = new class16();
    }

    public class14(class175 arg0, boolean arg1) {
        int var3 = arg0.method2995();
        boolean var4 = arg0.method2999() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2995();
        this.field290 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field290.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("y.i(Ljava/util/Comparator;ZI)V")
    public void method64(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field290, arg0);
        } else {
            Collections.sort(this.field290, Collections.reverseOrder(arg0));
        }
    }
}
