package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("c")
public class class7 {

    @ObfuscatedName("c.n")
    public final List field42;

    @ObfuscatedName("c.h")
    public static Comparator field37 = new class13();

    @ObfuscatedName("c.l")
    public static Comparator field38;

    @ObfuscatedName("c.g")
    public static Comparator field43;

    @ObfuscatedName("c.b")
    public static Comparator field36;

    static {
        new class6();
        field38 = new class11();
        field43 = new class12();
        field36 = new class9();
    }

    public class7(class190 arg0, boolean arg1) {
        int var3 = arg0.method3513();
        boolean var4 = arg0.method3511() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3513();
        this.field42 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field42.add(new class8(arg0, var5, var3));
        }
    }

    @ObfuscatedName("c.n(Ljava/util/Comparator;ZI)V")
    public void method50(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field42, arg0);
        } else {
            Collections.sort(this.field42, Collections.reverseOrder(arg0));
        }
    }
}
