package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("hw")
public class class211 {

    @ObfuscatedName("hw.e")
    public final List field3034;

    @ObfuscatedName("hw.a")
    public static Comparator field3036 = new class208();

    @ObfuscatedName("hw.l")
    public static Comparator field3035;

    @ObfuscatedName("hw.c")
    public static Comparator field3037;

    @ObfuscatedName("hw.u")
    public static Comparator field3033;

    static {
        new class209();
        field3035 = new class207();
        field3037 = new class203();
        field3033 = new class206();
    }

    public class211(class111 arg0, boolean arg1) {
        int var3 = arg0.method2178();
        boolean var4 = arg0.method2176() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method2178();
        this.field3034 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3034.add(new class204(arg0, var5, var3));
        }
    }

    @ObfuscatedName("hw.e(Ljava/util/Comparator;ZB)V")
    public void method3554(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3034, arg0);
        } else {
            Collections.sort(this.field3034, Collections.reverseOrder(arg0));
        }
    }
}
