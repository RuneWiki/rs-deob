package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("b")
public class class7 {

    @ObfuscatedName("b.q")
    public final List field37;

    @ObfuscatedName("b.w")
    public static Comparator field30 = new class13();

    @ObfuscatedName("b.e")
    public static Comparator field31;

    @ObfuscatedName("b.p")
    public static Comparator field29;

    @ObfuscatedName("b.k")
    public static Comparator field33;

    static {
        new class6();
        field31 = new class11();
        field29 = new class12();
        field33 = new class9();
    }

    public class7(class301 arg0, boolean arg1) {
        int var3 = arg0.method5069();
        boolean var4 = arg0.method5077() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method5069();
        this.field37 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field37.add(new class8(arg0, var5, var3));
        }
    }

    @ObfuscatedName("b.q(Ljava/util/Comparator;ZS)V")
    public void method51(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field37, arg0);
        } else {
            Collections.sort(this.field37, Collections.reverseOrder(arg0));
        }
    }
}
