package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("e")
public class class2 {

    @ObfuscatedName("e.i")
    public final List field15;

    @ObfuscatedName("e.e")
    public static Comparator field11 = new class8();

    @ObfuscatedName("e.f")
    public static Comparator field12;

    @ObfuscatedName("e.k")
    public static Comparator field13;

    @ObfuscatedName("e.g")
    public static Comparator field14;

    static {
        new class1();
        field12 = new class6();
        field13 = new class7();
        field14 = new class4();
    }

    public class2(class154 arg0, boolean arg1) {
        int var3 = arg0.method2575();
        boolean var4 = arg0.method2573() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2575();
        this.field15 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field15.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("e.i(Ljava/util/Comparator;ZB)V")
    public void method16(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field15, arg0);
        } else {
            Collections.sort(this.field15, Collections.reverseOrder(arg0));
        }
    }
}
