package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("gn")
public class class204 {

    @ObfuscatedName("gn.p")
    public final List field2969;

    @ObfuscatedName("gn.y")
    public static Comparator field2970 = new class201();

    @ObfuscatedName("gn.d")
    public static Comparator field2971;

    @ObfuscatedName("gn.c")
    public static Comparator field2972;

    @ObfuscatedName("gn.r")
    public static Comparator field2973;

    static {
        new class202();
        field2971 = new class200();
        field2972 = new class196();
        field2973 = new class199();
    }

    public class204(class110 arg0, boolean arg1) {
        int var3 = arg0.method2243();
        boolean var4 = arg0.method2309() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2243();
        this.field2969 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field2969.add(new class197(arg0, var5, var3));
        }
    }

    @ObfuscatedName("gn.p(Ljava/util/Comparator;ZI)V")
    public void method3446(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field2969, arg0);
        } else {
            Collections.sort(this.field2969, Collections.reverseOrder(arg0));
        }
    }
}
