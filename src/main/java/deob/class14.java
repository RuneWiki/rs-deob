package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("f")
public class class14 {

    @ObfuscatedName("f.c")
    public final List field270;

    @ObfuscatedName("f.i")
    public static Comparator field272 = new class20();

    @ObfuscatedName("f.o")
    public static Comparator field268;

    @ObfuscatedName("f.j")
    public static Comparator field269;

    @ObfuscatedName("f.k")
    public static Comparator field271;

    static {
        new class13();
        field268 = new class18();
        field269 = new class19();
        field271 = new class16();
    }

    public class14(class195 arg0, boolean arg1) {
        int var3 = arg0.method3218();
        boolean var4 = arg0.method3429() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3218();
        this.field270 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field270.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("f.c(Ljava/util/Comparator;ZI)V")
    public void method75(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field270, arg0);
        } else {
            Collections.sort(this.field270, Collections.reverseOrder(arg0));
        }
    }
}
