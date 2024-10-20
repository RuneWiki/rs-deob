package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("r")
public class class2 {

    @ObfuscatedName("r.g")
    public final List field15;

    @ObfuscatedName("r.r")
    public static Comparator field5 = new class8();

    @ObfuscatedName("r.e")
    public static Comparator field4;

    @ObfuscatedName("r.q")
    public static Comparator field11;

    @ObfuscatedName("r.c")
    public static Comparator field8;

    static {
        new class1();
        field4 = new class6();
        field11 = new class7();
        field8 = new class4();
    }

    public class2(class185 arg0, boolean arg1) {
        int var3 = arg0.method3467();
        boolean var4 = arg0.method3679() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3467();
        this.field15 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field15.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("r.g(Ljava/util/Comparator;ZI)V")
    public void method16(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field15, arg0);
        } else {
            Collections.sort(this.field15, Collections.reverseOrder(arg0));
        }
    }
}
