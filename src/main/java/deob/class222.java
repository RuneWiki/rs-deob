package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("ho")
public class class222 {

    @ObfuscatedName("ho.s")
    public final List field3184;

    @ObfuscatedName("ho.j")
    public static Comparator field3182 = new class219();

    @ObfuscatedName("ho.p")
    public static Comparator field3186;

    @ObfuscatedName("ho.x")
    public static Comparator field3183;

    @ObfuscatedName("ho.d")
    public static Comparator field3181;

    static {
        new class220();
        field3186 = new class218();
        field3183 = new class214();
        field3181 = new class217();
    }

    public class222(class120 arg0, boolean arg1) {
        int var3 = arg0.method2430();
        boolean var4 = arg0.method2338() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2430();
        this.field3184 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3184.add(new class215(arg0, var5, var3));
        }
    }

    @ObfuscatedName("ho.s(Ljava/util/Comparator;ZS)V")
    public void method3726(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3184, arg0);
        } else {
            Collections.sort(this.field3184, Collections.reverseOrder(arg0));
        }
    }
}
