package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("c")
public class class7 {

    @ObfuscatedName("c.a")
    public final List field37;

    @ObfuscatedName("c.t")
    public static Comparator field34 = new class13();

    @ObfuscatedName("c.n")
    public static Comparator field36;

    @ObfuscatedName("c.q")
    public static Comparator field35;

    @ObfuscatedName("c.v")
    public static Comparator field38;

    static {
        new class6();
        field36 = new class11();
        field35 = new class12();
        field38 = new class9();
    }

    public class7(class300 arg0, boolean arg1) {
        int var3 = arg0.method5166();
        boolean var4 = arg0.method5123() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method5166();
        this.field37 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field37.add(new class8(arg0, var5, var3));
        }
    }

    @ObfuscatedName("c.a(Ljava/util/Comparator;ZB)V")
    public void method75(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field37, arg0);
        } else {
            Collections.sort(this.field37, Collections.reverseOrder(arg0));
        }
    }
}
