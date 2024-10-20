package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("gb")
public class class204 {

    @ObfuscatedName("gb.a")
    public final List field2969;

    @ObfuscatedName("gb.v")
    public static Comparator field2966 = new class201();

    @ObfuscatedName("gb.i")
    public static Comparator field2968;

    @ObfuscatedName("gb.b")
    public static Comparator field2971;

    @ObfuscatedName("gb.l")
    public static Comparator field2970;

    static {
        new class202();
        field2968 = new class200();
        field2971 = new class196();
        field2970 = new class199();
    }

    public class204(class110 arg0, boolean arg1) {
        int var3 = arg0.method2282();
        boolean var4 = arg0.method2199() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2282();
        this.field2969 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field2969.add(new class197(arg0, var5, var3));
        }
    }

    @ObfuscatedName("gb.a(Ljava/util/Comparator;ZI)V")
    public void method3433(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field2969, arg0);
        } else {
            Collections.sort(this.field2969, Collections.reverseOrder(arg0));
        }
    }
}
