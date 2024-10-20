package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("y")
public class class2 {

    @ObfuscatedName("y.k")
    public final List field20;

    @ObfuscatedName("y.y")
    public static Comparator field7 = new class8();

    @ObfuscatedName("y.o")
    public static Comparator field8;

    @ObfuscatedName("y.r")
    public static Comparator field9;

    @ObfuscatedName("y.w")
    public static Comparator field15;

    static {
        new class1();
        field8 = new class6();
        field9 = new class7();
        field15 = new class4();
    }

    public class2(class161 arg0, boolean arg1) {
        int var3 = arg0.method2735();
        boolean var4 = arg0.method2733() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2735();
        this.field20 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field20.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("y.k(Ljava/util/Comparator;ZB)V")
    public void method16(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field20, arg0);
        } else {
            Collections.sort(this.field20, Collections.reverseOrder(arg0));
        }
    }
}
