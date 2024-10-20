package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("t")
public class class7 {

    @ObfuscatedName("t.s")
    public final List field44;

    @ObfuscatedName("t.j")
    public static Comparator field41 = new class13();

    @ObfuscatedName("t.i")
    public static Comparator field43;

    @ObfuscatedName("t.k")
    public static Comparator field42;

    @ObfuscatedName("t.u")
    public static Comparator field40;

    static {
        new class6();
        field43 = new class11();
        field42 = new class12();
        field40 = new class9();
    }

    public class7(class300 arg0, boolean arg1) {
        int var3 = arg0.method5054();
        boolean var4 = arg0.method5179() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method5054();
        this.field44 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field44.add(new class8(arg0, var5, var3));
        }
    }

    @ObfuscatedName("t.s(Ljava/util/Comparator;ZB)V")
    public void method60(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field44, arg0);
        } else {
            Collections.sort(this.field44, Collections.reverseOrder(arg0));
        }
    }
}
