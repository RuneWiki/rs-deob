package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("e")
public class class2 {

    @ObfuscatedName("e.b")
    public final List field12;

    @ObfuscatedName("e.e")
    public static Comparator field13 = new class8();

    @ObfuscatedName("e.c")
    public static Comparator field10;

    @ObfuscatedName("e.l")
    public static Comparator field11;

    @ObfuscatedName("e.y")
    public static Comparator field17;

    static {
        new class1();
        field10 = new class6();
        field11 = new class7();
        field17 = new class4();
    }

    public class2(class154 arg0, boolean arg1) {
        int var3 = arg0.method2671();
        boolean var4 = arg0.method2669() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2671();
        this.field12 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field12.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("e.b(Ljava/util/Comparator;ZB)V")
    public void method13(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field12, arg0);
        } else {
            Collections.sort(this.field12, Collections.reverseOrder(arg0));
        }
    }
}
