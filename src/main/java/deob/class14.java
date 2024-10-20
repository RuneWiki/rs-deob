package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("n")
public class class14 {

    @ObfuscatedName("n.a")
    public final List field270;

    @ObfuscatedName("n.w")
    public static Comparator field269 = new class20();

    @ObfuscatedName("n.e")
    public static Comparator field272;

    @ObfuscatedName("n.k")
    public static Comparator field271;

    @ObfuscatedName("n.u")
    public static Comparator field268;

    static {
        new class13();
        field272 = new class18();
        field271 = new class19();
        field268 = new class16();
    }

    public class14(class185 arg0, boolean arg1) {
        int var3 = arg0.method3194();
        boolean var4 = arg0.method2962() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3194();
        this.field270 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field270.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("n.a(Ljava/util/Comparator;ZB)V")
    public void method57(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field270, arg0);
        } else {
            Collections.sort(this.field270, Collections.reverseOrder(arg0));
        }
    }
}
