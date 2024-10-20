package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("c")
public class class2 {

    @ObfuscatedName("c.d")
    public final List field16;

    @ObfuscatedName("c.c")
    public static Comparator field12 = new class8();

    @ObfuscatedName("c.n")
    public static Comparator field13;

    @ObfuscatedName("c.q")
    public static Comparator field14;

    @ObfuscatedName("c.t")
    public static Comparator field15;

    static {
        new class1();
        field13 = new class6();
        field14 = new class7();
        field15 = new class4();
    }

    public class2(class130 arg0, boolean arg1) {
        int var3 = arg0.method2232();
        boolean var4 = arg0.method2379() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2232();
        this.field16 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field16.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("c.d(Ljava/util/Comparator;ZI)V")
    public void method17(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field16, arg0);
        } else {
            Collections.sort(this.field16, Collections.reverseOrder(arg0));
        }
    }
}
