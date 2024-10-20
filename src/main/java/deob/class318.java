package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("lu")
public class class318 {

    @ObfuscatedName("lu.v")
    public final List field4010;

    @ObfuscatedName("lu.c")
    public static Comparator field4005 = new class321();

    @ObfuscatedName("lu.i")
    public static Comparator field4006;

    @ObfuscatedName("lu.f")
    public static Comparator field4007;

    @ObfuscatedName("lu.b")
    public static Comparator field4008;

    static {
        new class323();
        field4006 = new class326();
        field4007 = new class320();
        field4008 = new class319();
    }

    public class318(class438 arg0, boolean arg1) {
        int var3 = arg0.method7148();
        boolean var4 = arg0.method6971() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method7148();
        this.field4010 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4010.add(new class324(arg0, var5, var3));
        }
    }

    @ObfuscatedName("lu.v(Ljava/util/Comparator;ZI)V")
    public void method5392(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4010, arg0);
        } else {
            Collections.sort(this.field4010, Collections.reverseOrder(arg0));
        }
    }
}
