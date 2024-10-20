package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hh")
public class class225 {

    @ObfuscatedName("hh.k")
    public final List field3228;

    @ObfuscatedName("hh.q")
    public static Comparator field3229 = new class222();

    @ObfuscatedName("hh.f")
    public static Comparator field3230;

    @ObfuscatedName("hh.c")
    public static Comparator field3231;

    @ObfuscatedName("hh.v")
    public static Comparator field3232;

    static {
        new class223();
        field3230 = new class221();
        field3231 = new class217();
        field3232 = new class220();
    }

    public class225(class123 arg0, boolean arg1) {
        int var3 = arg0.method2547();
        boolean var4 = arg0.method2427() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2547();
        this.field3228 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3228.add(new class218(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hh.k(Ljava/util/Comparator;ZI)V")
    public void method3786(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3228, arg0);
        } else {
            Collections.sort(this.field3228, Collections.reverseOrder(arg0));
        }
    }
}
