package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("p")
public class class14 {

    @ObfuscatedName("p.w")
    public final List field295;

    @ObfuscatedName("p.o")
    public static Comparator field293 = new class20();

    @ObfuscatedName("p.x")
    public static Comparator field294;

    @ObfuscatedName("p.k")
    public static Comparator field296;

    @ObfuscatedName("p.f")
    public static Comparator field297;

    static {
        new class13();
        field294 = new class18();
        field296 = new class19();
        field297 = new class16();
    }

    public class14(class177 arg0, boolean arg1) {
        int var3 = arg0.method2886();
        boolean var4 = arg0.method2931() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2886();
        this.field295 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field295.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("p.w(Ljava/util/Comparator;ZS)V")
    public void method59(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field295, arg0);
        } else {
            Collections.sort(this.field295, Collections.reverseOrder(arg0));
        }
    }
}
