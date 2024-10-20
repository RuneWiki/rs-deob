package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("gz")
public class class204 {

    @ObfuscatedName("gz.b")
    public final List field2961;

    @ObfuscatedName("gz.e")
    public static Comparator field2960 = new class201();

    @ObfuscatedName("gz.i")
    public static Comparator field2959;

    @ObfuscatedName("gz.k")
    public static Comparator field2962;

    @ObfuscatedName("gz.h")
    public static Comparator field2963;

    static {
        new class202();
        field2959 = new class200();
        field2962 = new class196();
        field2963 = new class199();
    }

    public class204(class110 arg0, boolean arg1) {
        int var3 = arg0.method2292();
        boolean var4 = arg0.method2142() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2292();
        this.field2961 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field2961.add(new class197(arg0, var5, var3));
        }
    }

    @ObfuscatedName("gz.b(Ljava/util/Comparator;ZI)V")
    public void method3483(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field2961, arg0);
        } else {
            Collections.sort(this.field2961, Collections.reverseOrder(arg0));
        }
    }
}
