package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("p")
public class class7 {

    @ObfuscatedName("p.a")
    public final List field42;

    @ObfuscatedName("p.s")
    public static Comparator field40 = new class13();

    @ObfuscatedName("p.g")
    public static Comparator field41;

    @ObfuscatedName("p.x")
    public static Comparator field48;

    @ObfuscatedName("p.h")
    public static Comparator field43;

    static {
        new class6();
        field41 = new class11();
        field48 = new class12();
        field43 = new class9();
    }

    public class7(class190 arg0, boolean arg1) {
        int var3 = arg0.method3610();
        boolean var4 = arg0.method3443() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3610();
        this.field42 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field42.add(new class8(arg0, var5, var3));
        }
    }

    @ObfuscatedName("p.a(Ljava/util/Comparator;ZB)V")
    public void method69(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field42, arg0);
        } else {
            Collections.sort(this.field42, Collections.reverseOrder(arg0));
        }
    }
}
