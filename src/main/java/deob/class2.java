package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("l")
public class class2 {

    @ObfuscatedName("l.f")
    public final List field14;

    @ObfuscatedName("l.l")
    public static Comparator field6 = new class8();

    @ObfuscatedName("l.w")
    public static Comparator field11;

    @ObfuscatedName("l.s")
    public static Comparator field8;

    @ObfuscatedName("l.e")
    public static Comparator field9;

    static {
        new class1();
        field11 = new class6();
        field8 = new class7();
        field9 = new class4();
    }

    public class2(class185 arg0, boolean arg1) {
        int var3 = arg0.method3346();
        boolean var4 = arg0.method3344() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3346();
        this.field14 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field14.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("l.f(Ljava/util/Comparator;ZI)V")
    public void method9(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field14, arg0);
        } else {
            Collections.sort(this.field14, Collections.reverseOrder(arg0));
        }
    }
}
