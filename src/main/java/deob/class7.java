package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("j")
public class class7 {

    @ObfuscatedName("j.c")
    public final List field38;

    @ObfuscatedName("j.x")
    public static Comparator field36 = new class13();

    @ObfuscatedName("j.t")
    public static Comparator field37;

    @ObfuscatedName("j.g")
    public static Comparator field39;

    @ObfuscatedName("j.l")
    public static Comparator field42;

    static {
        new class6();
        field37 = new class11();
        field39 = new class12();
        field42 = new class9();
    }

    public class7(class300 arg0, boolean arg1) {
        int var3 = arg0.method5304();
        boolean var4 = arg0.method5103() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method5304();
        this.field38 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field38.add(new class8(arg0, var5, var3));
        }
    }

    @ObfuscatedName("j.c(Ljava/util/Comparator;ZB)V")
    public void method51(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field38, arg0);
        } else {
            Collections.sort(this.field38, Collections.reverseOrder(arg0));
        }
    }
}
