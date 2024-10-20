package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("ho")
public class class222 {

    @ObfuscatedName("ho.t")
    public final List field3180;

    @ObfuscatedName("ho.i")
    public static Comparator field3181 = new class219();

    @ObfuscatedName("ho.g")
    public static Comparator field3182;

    @ObfuscatedName("ho.h")
    public static Comparator field3183;

    @ObfuscatedName("ho.z")
    public static Comparator field3184;

    static {
        new class220();
        field3182 = new class218();
        field3183 = new class214();
        field3184 = new class217();
    }

    public class222(class120 arg0, boolean arg1) {
        int var3 = arg0.method2310();
        boolean var4 = arg0.method2334() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2310();
        this.field3180 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3180.add(new class215(arg0, var5, var3));
        }
    }

    @ObfuscatedName("ho.t(Ljava/util/Comparator;ZI)V")
    public void method3684(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3180, arg0);
        } else {
            Collections.sort(this.field3180, Collections.reverseOrder(arg0));
        }
    }
}
