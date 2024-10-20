package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("l")
public class class2 {

    @ObfuscatedName("l.b")
    public final List field13;

    @ObfuscatedName("l.l")
    public static Comparator field7 = new class8();

    @ObfuscatedName("l.i")
    public static Comparator field8;

    @ObfuscatedName("l.t")
    public static Comparator field9;

    @ObfuscatedName("l.k")
    public static Comparator field15;

    static {
        new class1();
        field8 = new class6();
        field9 = new class7();
        field15 = new class4();
    }

    public class2(class154 arg0, boolean arg1) {
        int var3 = arg0.method2801();
        boolean var4 = arg0.method2678() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2801();
        this.field13 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field13.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("l.b(Ljava/util/Comparator;ZI)V")
    public void method19(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field13, arg0);
        } else {
            Collections.sort(this.field13, Collections.reverseOrder(arg0));
        }
    }
}
