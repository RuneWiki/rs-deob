package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("s")
public class class14 {

    @ObfuscatedName("s.j")
    public final List field283;

    @ObfuscatedName("s.h")
    public static Comparator field275 = new class20();

    @ObfuscatedName("s.f")
    public static Comparator field284;

    @ObfuscatedName("s.p")
    public static Comparator field277;

    @ObfuscatedName("s.x")
    public static Comparator field276;

    static {
        new class13();
        field284 = new class18();
        field277 = new class19();
        field276 = new class16();
    }

    public class14(class175 arg0, boolean arg1) {
        int var3 = arg0.method3023();
        boolean var4 = arg0.method2903() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3023();
        this.field283 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field283.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("s.j(Ljava/util/Comparator;ZI)V")
    public void method65(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field283, arg0);
        } else {
            Collections.sort(this.field283, Collections.reverseOrder(arg0));
        }
    }
}
