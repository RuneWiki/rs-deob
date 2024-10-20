package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("e")
public class class7 {

    @ObfuscatedName("e.f")
    public final List field31;

    @ObfuscatedName("e.i")
    public static Comparator field27 = new class13();

    @ObfuscatedName("e.y")
    public static Comparator field30;

    @ObfuscatedName("e.w")
    public static Comparator field29;

    @ObfuscatedName("e.p")
    public static Comparator field28;

    static {
        new class6();
        field30 = new class11();
        field29 = new class12();
        field28 = new class9();
    }

    public class7(class300 arg0, boolean arg1) {
        int var3 = arg0.method5112();
        boolean var4 = arg0.method5110() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method5112();
        this.field31 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field31.add(new class8(arg0, var5, var3));
        }
    }

    @ObfuscatedName("e.f(Ljava/util/Comparator;ZB)V")
    public void method57(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field31, arg0);
        } else {
            Collections.sort(this.field31, Collections.reverseOrder(arg0));
        }
    }
}
