package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hz")
public class class222 {

    @ObfuscatedName("hz.w")
    public final List field3180;

    @ObfuscatedName("hz.x")
    public static Comparator field3181 = new class219();

    @ObfuscatedName("hz.t")
    public static Comparator field3182;

    @ObfuscatedName("hz.p")
    public static Comparator field3183;

    @ObfuscatedName("hz.e")
    public static Comparator field3184;

    static {
        new class220();
        field3182 = new class218();
        field3183 = new class214();
        field3184 = new class217();
    }

    public class222(class120 arg0, boolean arg1) {
        int var3 = arg0.method2365();
        boolean var4 = arg0.method2363() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2365();
        this.field3180 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3180.add(new class215(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hz.w(Ljava/util/Comparator;ZI)V")
    public void method3768(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3180, arg0);
        } else {
            Collections.sort(this.field3180, Collections.reverseOrder(arg0));
        }
    }
}
