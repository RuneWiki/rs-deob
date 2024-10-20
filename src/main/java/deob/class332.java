package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("ly")
public class class332 {

    @ObfuscatedName("ly.a")
    public final List field4188;

    @ObfuscatedName("ly.f")
    public static Comparator field4186 = new class335();

    @ObfuscatedName("ly.c")
    public static Comparator field4189;

    @ObfuscatedName("ly.x")
    public static Comparator field4190;

    @ObfuscatedName("ly.h")
    public static Comparator field4187;

    static {
        new class337();
        field4189 = new class340();
        field4190 = new class334();
        field4187 = new class333();
    }

    public class332(class464 arg0, boolean arg1) {
        int var3 = arg0.method7716();
        boolean var4 = arg0.method7735() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method7716();
        this.field4188 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4188.add(new class338(arg0, var5, var3));
        }
    }

    @ObfuscatedName("ly.a(Ljava/util/Comparator;ZI)V")
    public void method5884(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4188, arg0);
        } else {
            Collections.sort(this.field4188, Collections.reverseOrder(arg0));
        }
    }
}
