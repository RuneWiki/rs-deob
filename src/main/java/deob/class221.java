package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hk")
public class class221 {

    @ObfuscatedName("hk.y")
    public final List field3156;

    @ObfuscatedName("hk.d")
    public static Comparator field3152 = new class218();

    @ObfuscatedName("hk.g")
    public static Comparator field3153;

    @ObfuscatedName("hk.w")
    public static Comparator field3151;

    @ObfuscatedName("hk.e")
    public static Comparator field3155;

    static {
        new class219();
        field3153 = new class217();
        field3151 = new class213();
        field3155 = new class216();
    }

    public class221(class119 arg0, boolean arg1) {
        int var3 = arg0.method2525();
        boolean var4 = arg0.method2326() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2525();
        this.field3156 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3156.add(new class214(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hk.y(Ljava/util/Comparator;ZI)V")
    public void method3687(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3156, arg0);
        } else {
            Collections.sort(this.field3156, Collections.reverseOrder(arg0));
        }
    }
}
