package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("v")
public class class14 {

    @ObfuscatedName("v.p")
    public final List field271;

    @ObfuscatedName("v.i")
    public static Comparator field272 = new class20();

    @ObfuscatedName("v.w")
    public static Comparator field267;

    @ObfuscatedName("v.s")
    public static Comparator field268;

    @ObfuscatedName("v.j")
    public static Comparator field269;

    static {
        new class13();
        field267 = new class18();
        field268 = new class19();
        field269 = new class16();
    }

    public class14(class185 arg0, boolean arg1) {
        int var3 = arg0.method3124();
        boolean var4 = arg0.method3197() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3124();
        this.field271 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field271.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("v.p(Ljava/util/Comparator;ZB)V")
    public void method79(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field271, arg0);
        } else {
            Collections.sort(this.field271, Collections.reverseOrder(arg0));
        }
    }
}
