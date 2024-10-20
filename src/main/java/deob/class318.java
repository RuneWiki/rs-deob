package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("lg")
public class class318 {

    @ObfuscatedName("lg.s")
    public final List field4046;

    @ObfuscatedName("lg.h")
    public static Comparator field4042 = new class321();

    @ObfuscatedName("lg.w")
    public static Comparator field4043;

    @ObfuscatedName("lg.v")
    public static Comparator field4044;

    @ObfuscatedName("lg.c")
    public static Comparator field4045;

    static {
        new class323();
        field4043 = new class326();
        field4044 = new class320();
        field4045 = new class319();
    }

    public class318(class444 arg0, boolean arg1) {
        int var3 = arg0.method7120();
        boolean var4 = arg0.method6929() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method7120();
        this.field4046 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4046.add(new class324(arg0, var5, var3));
        }
    }

    @ObfuscatedName("lg.s(Ljava/util/Comparator;ZI)V")
    public void method5291(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4046, arg0);
        } else {
            Collections.sort(this.field4046, Collections.reverseOrder(arg0));
        }
    }
}
