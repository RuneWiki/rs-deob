package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("km")
public class class292 {

    @ObfuscatedName("km.n")
    public final List field3745;

    @ObfuscatedName("km.c")
    public static Comparator field3741 = new class295();

    @ObfuscatedName("km.m")
    public static Comparator field3743;

    @ObfuscatedName("km.k")
    public static Comparator field3740;

    @ObfuscatedName("km.o")
    public static Comparator field3744;

    static {
        new class297();
        field3743 = new class300();
        field3740 = new class294();
        field3744 = new class293();
    }

    public class292(class400 arg0, boolean arg1) {
        int var3 = arg0.method6219();
        boolean var4 = arg0.method6217() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method6219();
        this.field3745 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3745.add(new class298(arg0, var5, var3));
        }
    }

    @ObfuscatedName("km.n(Ljava/util/Comparator;ZB)V")
    public void method4808(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3745, arg0);
        } else {
            Collections.sort(this.field3745, Collections.reverseOrder(arg0));
        }
    }
}
