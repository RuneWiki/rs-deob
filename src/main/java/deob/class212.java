package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hc")
public class class212 {

    @ObfuscatedName("hc.p")
    public final List field3084;

    @ObfuscatedName("hc.k")
    public static Comparator field3079 = new class209();

    @ObfuscatedName("hc.e")
    public static Comparator field3080;

    @ObfuscatedName("hc.f")
    public static Comparator field3081;

    @ObfuscatedName("hc.w")
    public static Comparator field3082;

    static {
        new class210();
        field3080 = new class208();
        field3081 = new class204();
        field3082 = new class207();
    }

    public class212(class111 arg0, boolean arg1) {
        int var3 = arg0.method2177();
        boolean var4 = arg0.method2314() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2177();
        this.field3084 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3084.add(new class205(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hc.p(Ljava/util/Comparator;ZI)V")
    public void method3618(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3084, arg0);
        } else {
            Collections.sort(this.field3084, Collections.reverseOrder(arg0));
        }
    }
}
