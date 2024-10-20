package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("lr")
public class class335 {

    @ObfuscatedName("lr.h")
    public final List field4240;

    @ObfuscatedName("lr.e")
    public static Comparator field4244 = new class338();

    @ObfuscatedName("lr.v")
    public static Comparator field4239;

    @ObfuscatedName("lr.x")
    public static Comparator field4242;

    @ObfuscatedName("lr.m")
    public static Comparator field4243;

    static {
        new class340();
        field4239 = new class343();
        field4242 = new class337();
        field4243 = new class336();
    }

    public class335(class467 arg0, boolean arg1) {
        int var3 = arg0.method7794();
        boolean var4 = arg0.method7792() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method7794();
        this.field4240 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4240.add(new class341(arg0, var5, var3));
        }
    }

    @ObfuscatedName("lr.h(Ljava/util/Comparator;ZI)V")
    public void method5944(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4240, arg0);
        } else {
            Collections.sort(this.field4240, Collections.reverseOrder(arg0));
        }
    }
}
