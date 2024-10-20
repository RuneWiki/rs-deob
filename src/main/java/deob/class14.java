package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("k")
public class class14 {

    @ObfuscatedName("k.a")
    public final List field295;

    @ObfuscatedName("k.j")
    public static Comparator field289 = new class20();

    @ObfuscatedName("k.n")
    public static Comparator field293;

    @ObfuscatedName("k.r")
    public static Comparator field291;

    @ObfuscatedName("k.v")
    public static Comparator field292;

    static {
        new class13();
        field293 = new class18();
        field291 = new class19();
        field292 = new class16();
    }

    public class14(class174 arg0, boolean arg1) {
        int var3 = arg0.method2873();
        boolean var4 = arg0.method2871() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2873();
        this.field295 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field295.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("k.a(Ljava/util/Comparator;ZI)V")
    public void method67(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field295, arg0);
        } else {
            Collections.sort(this.field295, Collections.reverseOrder(arg0));
        }
    }
}
