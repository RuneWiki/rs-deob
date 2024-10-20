package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("lb")
public class class318 {

    @ObfuscatedName("lb.o")
    public final List field4066;

    @ObfuscatedName("lb.q")
    public static Comparator field4061 = new class321();

    @ObfuscatedName("lb.l")
    public static Comparator field4065;

    @ObfuscatedName("lb.k")
    public static Comparator field4060;

    @ObfuscatedName("lb.a")
    public static Comparator field4064;

    static {
        new class323();
        field4065 = new class326();
        field4060 = new class320();
        field4064 = new class319();
    }

    public class318(class440 arg0, boolean arg1) {
        int var3 = arg0.method7082();
        boolean var4 = arg0.method7071() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method7082();
        this.field4066 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4066.add(new class324(arg0, var5, var3));
        }
    }

    @ObfuscatedName("lb.o(Ljava/util/Comparator;ZI)V")
    public void method5288(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4066, arg0);
        } else {
            Collections.sort(this.field4066, Collections.reverseOrder(arg0));
        }
    }
}
