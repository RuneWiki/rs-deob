package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("m")
public class class2 {

    @ObfuscatedName("m.w")
    public final List field7;

    @ObfuscatedName("m.m")
    public static Comparator field6 = new class8();

    @ObfuscatedName("m.q")
    public static Comparator field8;

    @ObfuscatedName("m.b")
    public static Comparator field9;

    @ObfuscatedName("m.f")
    public static Comparator field10;

    static {
        new class1();
        field8 = new class6();
        field9 = new class7();
        field10 = new class4();
    }

    public class2(class183 arg0, boolean arg1) {
        int var3 = arg0.method3268();
        boolean var4 = arg0.method3436() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3268();
        this.field7 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field7.add(new class3(arg0, var5, var3));
        }
    }

    @ObfuscatedName("m.w(Ljava/util/Comparator;ZB)V")
    public void method12(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field7, arg0);
        } else {
            Collections.sort(this.field7, Collections.reverseOrder(arg0));
        }
    }
}
