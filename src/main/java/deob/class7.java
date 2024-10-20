package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("d")
public class class7 {

    @ObfuscatedName("d.c")
    public final List field32;

    @ObfuscatedName("d.t")
    public static Comparator field37 = new class13();

    @ObfuscatedName("d.o")
    public static Comparator field34;

    @ObfuscatedName("d.e")
    public static Comparator field33;

    @ObfuscatedName("d.i")
    public static Comparator field36;

    static {
        new class6();
        field34 = new class11();
        field33 = new class12();
        field36 = new class9();
    }

    public class7(class301 arg0, boolean arg1) {
        int var3 = arg0.method5124();
        boolean var4 = arg0.method5129() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method5124();
        this.field32 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field32.add(new class8(arg0, var5, var3));
        }
    }

    @ObfuscatedName("d.c(Ljava/util/Comparator;ZI)V")
    public void method59(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field32, arg0);
        } else {
            Collections.sort(this.field32, Collections.reverseOrder(arg0));
        }
    }
}
