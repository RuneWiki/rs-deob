package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("gj")
public class class202 {

    @ObfuscatedName("gj.x")
    public final List field2943;

    @ObfuscatedName("gj.v")
    public static Comparator field2944 = new class199();

    @ObfuscatedName("gj.m")
    public static Comparator field2942;

    @ObfuscatedName("gj.e")
    public static Comparator field2945;

    @ObfuscatedName("gj.h")
    public static Comparator field2946;

    static {
        new class200();
        field2942 = new class198();
        field2945 = new class194();
        field2946 = new class197();
    }

    public class202(class108 arg0, boolean arg1) {
        int var3 = arg0.method2129();
        boolean var4 = arg0.method2299() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2129();
        this.field2943 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field2943.add(new class195(arg0, var5, var3));
        }
    }

    @ObfuscatedName("gj.x(Ljava/util/Comparator;ZI)V")
    public void method3463(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field2943, arg0);
        } else {
            Collections.sort(this.field2943, Collections.reverseOrder(arg0));
        }
    }
}
