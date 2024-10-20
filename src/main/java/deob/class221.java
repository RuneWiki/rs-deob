package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hk")
public class class221 {

    @ObfuscatedName("hk.n")
    public final List field3154;

    @ObfuscatedName("hk.d")
    public static Comparator field3153 = new class218();

    @ObfuscatedName("hk.s")
    public static Comparator field3152;

    @ObfuscatedName("hk.q")
    public static Comparator field3155;

    @ObfuscatedName("hk.j")
    public static Comparator field3156;

    static {
        new class219();
        field3152 = new class217();
        field3155 = new class213();
        field3156 = new class216();
    }

    public class221(class119 arg0, boolean arg1) {
        int var3 = arg0.method2377();
        boolean var4 = arg0.method2338() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2377();
        this.field3154 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3154.add(new class214(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hk.n(Ljava/util/Comparator;ZI)V")
    public void method3750(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3154, arg0);
        } else {
            Collections.sort(this.field3154, Collections.reverseOrder(arg0));
        }
    }
}
