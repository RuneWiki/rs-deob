package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("i")
public class class14 {

    @ObfuscatedName("i.d")
    public final List field283;

    @ObfuscatedName("i.z")
    public static Comparator field285 = new class20();

    @ObfuscatedName("i.n")
    public static Comparator field284;

    @ObfuscatedName("i.r")
    public static Comparator field287;

    @ObfuscatedName("i.e")
    public static Comparator field286;

    static {
        new class13();
        field284 = new class18();
        field287 = new class19();
        field286 = new class16();
    }

    public class14(class195 arg0, boolean arg1) {
        int var3 = arg0.method3269();
        boolean var4 = arg0.method3330() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3269();
        this.field283 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field283.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("i.d(Ljava/util/Comparator;ZB)V")
    public void method68(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field283, arg0);
        } else {
            Collections.sort(this.field283, Collections.reverseOrder(arg0));
        }
    }
}
