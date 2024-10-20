package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("k")
public class class14 {

    @ObfuscatedName("k.s")
    public final List field285;

    @ObfuscatedName("k.c")
    public static Comparator field288 = new class20();

    @ObfuscatedName("k.f")
    public static Comparator field286;

    @ObfuscatedName("k.m")
    public static Comparator field287;

    @ObfuscatedName("k.h")
    public static Comparator field290;

    static {
        new class13();
        field286 = new class18();
        field287 = new class19();
        field290 = new class16();
    }

    public class14(class177 arg0, boolean arg1) {
        int var3 = arg0.method2967();
        boolean var4 = arg0.method2965() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2967();
        this.field285 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field285.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("k.s(Ljava/util/Comparator;ZI)V")
    public void method65(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field285, arg0);
        } else {
            Collections.sort(this.field285, Collections.reverseOrder(arg0));
        }
    }
}
