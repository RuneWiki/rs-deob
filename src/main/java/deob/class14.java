package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("v")
public class class14 {

    @ObfuscatedName("v.b")
    public final List field266;

    @ObfuscatedName("v.q")
    public static Comparator field261 = new class20();

    @ObfuscatedName("v.o")
    public static Comparator field263;

    @ObfuscatedName("v.p")
    public static Comparator field264;

    @ObfuscatedName("v.a")
    public static Comparator field262;

    static {
        new class13();
        field263 = new class18();
        field264 = new class19();
        field262 = new class16();
    }

    public class14(class194 arg0, boolean arg1) {
        int var3 = arg0.method3249();
        boolean var4 = arg0.method3247() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3249();
        this.field266 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field266.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("v.b(Ljava/util/Comparator;ZI)V")
    public void method63(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field266, arg0);
        } else {
            Collections.sort(this.field266, Collections.reverseOrder(arg0));
        }
    }
}
