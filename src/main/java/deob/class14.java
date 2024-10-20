package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("a")
public class class14 {

    @ObfuscatedName("a.p")
    public final List field288;

    @ObfuscatedName("a.m")
    public static Comparator field283 = new class20();

    @ObfuscatedName("a.e")
    public static Comparator field284;

    @ObfuscatedName("a.t")
    public static Comparator field286;

    @ObfuscatedName("a.w")
    public static Comparator field289;

    static {
        new class13();
        field284 = new class18();
        field286 = new class19();
        field289 = new class16();
    }

    public class14(class174 arg0, boolean arg1) {
        int var3 = arg0.method2824();
        boolean var4 = arg0.method2810() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2824();
        this.field288 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field288.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("a.p(Ljava/util/Comparator;ZI)V")
    public void method70(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field288, arg0);
        } else {
            Collections.sort(this.field288, Collections.reverseOrder(arg0));
        }
    }
}
