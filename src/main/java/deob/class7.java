package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("h")
public class class7 {

    @ObfuscatedName("h.u")
    public final List field42;

    @ObfuscatedName("h.f")
    public static Comparator field34 = new class13();

    @ObfuscatedName("h.b")
    public static Comparator field40;

    @ObfuscatedName("h.g")
    public static Comparator field36;

    @ObfuscatedName("h.z")
    public static Comparator field35;

    static {
        new class6();
        field40 = new class11();
        field36 = new class12();
        field35 = new class9();
    }

    public class7(class300 arg0, boolean arg1) {
        int var3 = arg0.method5337();
        boolean var4 = arg0.method5138() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method5337();
        this.field42 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field42.add(new class8(arg0, var5, var3));
        }
    }

    @ObfuscatedName("h.u(Ljava/util/Comparator;ZI)V")
    public void method60(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field42, arg0);
        } else {
            Collections.sort(this.field42, Collections.reverseOrder(arg0));
        }
    }
}
