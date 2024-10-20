package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("r")
public class class16 {

    @ObfuscatedName("r.m")
    public final List field61;

    @ObfuscatedName("r.o")
    public static Comparator field62 = new class22();

    @ObfuscatedName("r.q")
    public static Comparator field63;

    @ObfuscatedName("r.j")
    public static Comparator field64;

    @ObfuscatedName("r.p")
    public static Comparator field65;

    static {
        new class15();
        field63 = new class20();
        field64 = new class21();
        field65 = new class18();
    }

    public class16(class310 arg0, boolean arg1) {
        int var3 = arg0.method5283();
        boolean var4 = arg0.method5227() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method5283();
        this.field61 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field61.add(new class17(arg0, var5, var3));
        }
    }

    @ObfuscatedName("r.m(Ljava/util/Comparator;ZI)V")
    public void method116(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field61, arg0);
        } else {
            Collections.sort(this.field61, Collections.reverseOrder(arg0));
        }
    }
}
