package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("g")
public class class7 {

    @ObfuscatedName("g.m")
    public final List field37;

    @ObfuscatedName("g.f")
    public static Comparator field30 = new class13();

    @ObfuscatedName("g.q")
    public static Comparator field31;

    @ObfuscatedName("g.w")
    public static Comparator field32;

    @ObfuscatedName("g.o")
    public static Comparator field33;

    static {
        new class6();
        field31 = new class11();
        field32 = new class12();
        field33 = new class9();
    }

    public class7(class202 arg0, boolean arg1) {
        int var3 = arg0.method3530();
        boolean var4 = arg0.method3551() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3530();
        this.field37 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field37.add(new class8(arg0, var5, var3));
        }
    }

    @ObfuscatedName("g.m(Ljava/util/Comparator;ZI)V")
    public void method53(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field37, arg0);
        } else {
            Collections.sort(this.field37, Collections.reverseOrder(arg0));
        }
    }
}
