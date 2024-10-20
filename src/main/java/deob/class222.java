package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hf")
public class class222 {

    @ObfuscatedName("hf.b")
    public final List field3186;

    @ObfuscatedName("hf.g")
    public static Comparator field3180 = new class219();

    @ObfuscatedName("hf.j")
    public static Comparator field3182;

    @ObfuscatedName("hf.d")
    public static Comparator field3185;

    @ObfuscatedName("hf.x")
    public static Comparator field3183;

    static {
        new class220();
        field3182 = new class218();
        field3185 = new class214();
        field3183 = new class217();
    }

    public class222(class120 arg0, boolean arg1) {
        int var3 = arg0.method2346();
        boolean var4 = arg0.method2344() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2346();
        this.field3186 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3186.add(new class215(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hf.b(Ljava/util/Comparator;ZB)V")
    public void method3751(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3186, arg0);
        } else {
            Collections.sort(this.field3186, Collections.reverseOrder(arg0));
        }
    }
}
