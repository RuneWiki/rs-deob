package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hp")
public class class212 {

    @ObfuscatedName("hp.y")
    public final List field3077;

    @ObfuscatedName("hp.k")
    public static Comparator field3078 = new class209();

    @ObfuscatedName("hp.g")
    public static Comparator field3079;

    @ObfuscatedName("hp.n")
    public static Comparator field3080;

    @ObfuscatedName("hp.t")
    public static Comparator field3081;

    static {
        new class210();
        field3079 = new class208();
        field3080 = new class204();
        field3081 = new class207();
    }

    public class212(class111 arg0, boolean arg1) {
        int var3 = arg0.method2339();
        boolean var4 = arg0.method2205() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2339();
        this.field3077 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3077.add(new class205(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hp.y(Ljava/util/Comparator;ZI)V")
    public void method3597(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3077, arg0);
        } else {
            Collections.sort(this.field3077, Collections.reverseOrder(arg0));
        }
    }
}
