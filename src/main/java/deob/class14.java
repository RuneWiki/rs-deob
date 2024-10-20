package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("v")
public class class14 {

    @ObfuscatedName("v.t")
    public final List field266;

    @ObfuscatedName("v.q")
    public static Comparator field267 = new class20();

    @ObfuscatedName("v.i")
    public static Comparator field273;

    @ObfuscatedName("v.a")
    public static Comparator field269;

    @ObfuscatedName("v.l")
    public static Comparator field265;

    static {
        new class13();
        field273 = new class18();
        field269 = new class19();
        field265 = new class16();
    }

    public class14(class195 arg0, boolean arg1) {
        int var3 = arg0.method3238();
        boolean var4 = arg0.method3236() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3238();
        this.field266 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field266.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("v.t(Ljava/util/Comparator;ZI)V")
    public void method63(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field266, arg0);
        } else {
            Collections.sort(this.field266, Collections.reverseOrder(arg0));
        }
    }
}
