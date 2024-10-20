package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("g")
public class class16 {

    @ObfuscatedName("g.x")
    public final List field68;

    @ObfuscatedName("g.m")
    public static Comparator field67 = new class22();

    @ObfuscatedName("g.k")
    public static Comparator field70;

    @ObfuscatedName("g.d")
    public static Comparator field69;

    @ObfuscatedName("g.w")
    public static Comparator field73;

    static {
        new class15();
        field70 = new class20();
        field69 = new class21();
        field73 = new class18();
    }

    public class16(class310 arg0, boolean arg1) {
        int var3 = arg0.method5139();
        boolean var4 = arg0.method5137() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method5139();
        this.field68 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field68.add(new class17(arg0, var5, var3));
        }
    }

    @ObfuscatedName("g.x(Ljava/util/Comparator;ZI)V")
    public void method122(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field68, arg0);
        } else {
            Collections.sort(this.field68, Collections.reverseOrder(arg0));
        }
    }
}
