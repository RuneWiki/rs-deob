package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("i")
public class class16 {

    @ObfuscatedName("i.n")
    public final List field75;

    @ObfuscatedName("i.v")
    public static Comparator field73 = new class22();

    @ObfuscatedName("i.d")
    public static Comparator field72;

    @ObfuscatedName("i.c")
    public static Comparator field76;

    @ObfuscatedName("i.y")
    public static Comparator field74;

    static {
        new class15();
        field72 = new class20();
        field76 = new class21();
        field74 = new class18();
    }

    public class16(class311 arg0, boolean arg1) {
        int var3 = arg0.method5247();
        boolean var4 = arg0.method5310() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method5247();
        this.field75 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field75.add(new class17(arg0, var5, var3));
        }
    }

    @ObfuscatedName("i.n(Ljava/util/Comparator;ZS)V")
    public void method117(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field75, arg0);
        } else {
            Collections.sort(this.field75, Collections.reverseOrder(arg0));
        }
    }
}
