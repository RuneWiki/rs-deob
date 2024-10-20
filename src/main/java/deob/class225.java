package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("ho")
public class class225 {

    @ObfuscatedName("ho.e")
    public final List field3222;

    @ObfuscatedName("ho.l")
    public static Comparator field3221 = new class222();

    @ObfuscatedName("ho.c")
    public static Comparator field3220;

    @ObfuscatedName("ho.h")
    public static Comparator field3223;

    @ObfuscatedName("ho.r")
    public static Comparator field3224;

    static {
        new class223();
        field3220 = new class221();
        field3223 = new class217();
        field3224 = new class220();
    }

    public class225(class123 arg0, boolean arg1) {
        int var3 = arg0.method2466();
        boolean var4 = arg0.method2464() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2466();
        this.field3222 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3222.add(new class218(arg0, var5, var3));
        }
    }

    @ObfuscatedName("ho.e(Ljava/util/Comparator;ZS)V")
    public void method3852(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3222, arg0);
        } else {
            Collections.sort(this.field3222, Collections.reverseOrder(arg0));
        }
    }
}
