package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("kx")
public class class292 {

    @ObfuscatedName("kx.i")
    public final List field3728;

    @ObfuscatedName("kx.w")
    public static Comparator field3724 = new class295();

    @ObfuscatedName("kx.s")
    public static Comparator field3723;

    @ObfuscatedName("kx.a")
    public static Comparator field3726;

    @ObfuscatedName("kx.o")
    public static Comparator field3727;

    static {
        new class297();
        field3723 = new class300();
        field3726 = new class294();
        field3727 = new class293();
    }

    public class292(class401 arg0, boolean arg1) {
        int var3 = arg0.method6242();
        boolean var4 = arg0.method6240() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method6242();
        this.field3728 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3728.add(new class298(arg0, var5, var3));
        }
    }

    @ObfuscatedName("kx.i(Ljava/util/Comparator;ZB)V")
    public void method4840(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3728, arg0);
        } else {
            Collections.sort(this.field3728, Collections.reverseOrder(arg0));
        }
    }
}
