package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("w")
public class class14 {

    @ObfuscatedName("w.n")
    public final List field272;

    @ObfuscatedName("w.v")
    public static Comparator field265 = new class20();

    @ObfuscatedName("w.y")
    public static Comparator field266;

    @ObfuscatedName("w.r")
    public static Comparator field267;

    @ObfuscatedName("w.h")
    public static Comparator field268;

    static {
        new class13();
        field266 = new class18();
        field267 = new class19();
        field268 = new class16();
    }

    public class14(class185 arg0, boolean arg1) {
        int var3 = arg0.method3015();
        boolean var4 = arg0.method3021() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method3015();
        this.field272 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field272.add(new class15(arg0, var5, var3));
        }
    }

    @ObfuscatedName("w.n(Ljava/util/Comparator;ZB)V")
    public void method66(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field272, arg0);
        } else {
            Collections.sort(this.field272, Collections.reverseOrder(arg0));
        }
    }
}
