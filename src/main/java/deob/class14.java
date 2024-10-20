package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("w")
public class class14 {

    @ObfuscatedName("w.m")
    public final List field276;

    @ObfuscatedName("w.p")
    public static Comparator field279 = new class20();

    @ObfuscatedName("w.i")
    public static Comparator field277;

    @ObfuscatedName("w.j")
    public static Comparator field278;

    @ObfuscatedName("w.v")
    public static Comparator field275;

    static {
        new class13();
        field277 = new class18();
        field278 = new class19();
        field275 = new class16();
    }

    public class14(class181 arg0, boolean arg1) {
        int var3 = arg0.method3009();
        boolean var4 = arg0.method3012() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3009();
        this.field276 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field276.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("w.m(Ljava/util/Comparator;ZI)V")
    public void method72(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field276, arg0);
        } else {
            Collections.sort(this.field276, Collections.reverseOrder(arg0));
        }
    }
}
