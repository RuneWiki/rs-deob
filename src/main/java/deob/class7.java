package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("q")
public class class7 {

    @ObfuscatedName("q.z")
    public final List field31;

    @ObfuscatedName("q.n")
    public static Comparator field32 = new class13();

    @ObfuscatedName("q.v")
    public static Comparator field42;

    @ObfuscatedName("q.u")
    public static Comparator field33;

    @ObfuscatedName("q.r")
    public static Comparator field35;

    static {
        new class6();
        field42 = new class11();
        field33 = new class12();
        field35 = new class9();
    }

    public class7(class300 arg0, boolean arg1) {
        int var3 = arg0.method4992();
        boolean var4 = arg0.method4990() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method4992();
        this.field31 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field31.add(new class8(arg0, var5, var3));
        }
    }

    @ObfuscatedName("q.z(Ljava/util/Comparator;ZI)V")
    public void method68(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field31, arg0);
        } else {
            Collections.sort(this.field31, Collections.reverseOrder(arg0));
        }
    }
}
