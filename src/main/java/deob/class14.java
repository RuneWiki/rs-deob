package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("q")
public class class14 {

    @ObfuscatedName("q.i")
    public final List field273;

    @ObfuscatedName("q.c")
    public static Comparator field274 = new class20();

    @ObfuscatedName("q.e")
    public static Comparator field275;

    @ObfuscatedName("q.v")
    public static Comparator field276;

    @ObfuscatedName("q.b")
    public static Comparator field277;

    static {
        new class13();
        field275 = new class18();
        field276 = new class19();
        field277 = new class16();
    }

    public class14(class174 arg0, boolean arg1) {
        int var3 = arg0.method2872();
        boolean var4 = arg0.method2870() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2872();
        this.field273 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field273.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("q.i(Ljava/util/Comparator;ZI)V")
    public void method61(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field273, arg0);
        } else {
            Collections.sort(this.field273, Collections.reverseOrder(arg0));
        }
    }
}
