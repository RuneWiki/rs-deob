package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("h")
public class class2 {

    @ObfuscatedName("h.f")
    public final List field8;

    @ObfuscatedName("h.h")
    public static Comparator field13 = new class8();

    @ObfuscatedName("h.e")
    public static Comparator field7;

    @ObfuscatedName("h.b")
    public static Comparator field10;

    @ObfuscatedName("h.l")
    public static Comparator field11;

    static {
        new class1();
        field7 = new class6();
        field10 = new class7();
        field11 = new class4();
    }

    public class2(class185 arg0, boolean arg1) {
        int var3 = arg0.method3325();
        boolean var4 = arg0.method3323() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3325();
        this.field8 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field8.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("h.f(Ljava/util/Comparator;ZB)V")
    public void method15(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field8, arg0);
        } else {
            Collections.sort(this.field8, Collections.reverseOrder(arg0));
        }
    }
}
