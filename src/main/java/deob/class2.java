package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("c")
public class class2 {

    @ObfuscatedName("c.s")
    public final List field11;

    @ObfuscatedName("c.c")
    public static Comparator field13 = new class8();

    @ObfuscatedName("c.f")
    public static Comparator field18;

    @ObfuscatedName("c.h")
    public static Comparator field14;

    @ObfuscatedName("c.a")
    public static Comparator field15;

    static {
        new class1();
        field18 = new class6();
        field14 = new class7();
        field15 = new class4();
    }

    public class2(class154 arg0, boolean arg1) {
        int var3 = arg0.method2541();
        boolean var4 = arg0.method2545() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2541();
        this.field11 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field11.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("c.s(Ljava/util/Comparator;ZB)V")
    public void method14(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field11, arg0);
        } else {
            Collections.sort(this.field11, Collections.reverseOrder(arg0));
        }
    }
}
