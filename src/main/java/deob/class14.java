package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("f")
public class class14 {

    @ObfuscatedName("f.s")
    public final List field275;

    @ObfuscatedName("f.g")
    public static Comparator field271 = new class20();

    @ObfuscatedName("f.m")
    public static Comparator field272;

    @ObfuscatedName("f.h")
    public static Comparator field273;

    @ObfuscatedName("f.i")
    public static Comparator field274;

    static {
        new class13();
        field272 = new class18();
        field273 = new class19();
        field274 = new class16();
    }

    public class14(class185 arg0, boolean arg1) {
        int var3 = arg0.method3241();
        boolean var4 = arg0.method3239() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3241();
        this.field275 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field275.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("f.s(Ljava/util/Comparator;ZI)V")
    public void method69(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field275, arg0);
        } else {
            Collections.sort(this.field275, Collections.reverseOrder(arg0));
        }
    }
}
