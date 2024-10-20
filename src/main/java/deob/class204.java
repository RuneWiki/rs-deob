package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("go")
public class class204 {

    @ObfuscatedName("go.v")
    public final List field2971;

    @ObfuscatedName("go.t")
    public static Comparator field2968 = new class201();

    @ObfuscatedName("go.f")
    public static Comparator field2972;

    @ObfuscatedName("go.j")
    public static Comparator field2970;

    @ObfuscatedName("go.l")
    public static Comparator field2969;

    static {
        new class202();
        field2972 = new class200();
        field2970 = new class196();
        field2969 = new class199();
    }

    public class204(class110 arg0, boolean arg1) {
        int var3 = arg0.method2194();
        boolean var4 = arg0.method2257() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2194();
        this.field2971 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field2971.add(new class197(arg0, var5, var3));
        }
    }

    @ObfuscatedName("go.v(Ljava/util/Comparator;ZI)V")
    public void method3479(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field2971, arg0);
        } else {
            Collections.sort(this.field2971, Collections.reverseOrder(arg0));
        }
    }
}
