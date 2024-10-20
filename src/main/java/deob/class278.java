package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("jk")
public class class278 {

    @ObfuscatedName("jk.f")
    public final List field3625;

    @ObfuscatedName("jk.e")
    public static Comparator field3627 = new class281();

    @ObfuscatedName("jk.v")
    public static Comparator field3624;

    @ObfuscatedName("jk.y")
    public static Comparator field3629;

    @ObfuscatedName("jk.j")
    public static Comparator field3628;

    static {
        new class283();
        field3624 = new class286();
        field3629 = new class280();
        field3628 = new class279();
    }

    public class278(class384 arg0, boolean arg1) {
        int var3 = arg0.method5899();
        boolean var4 = arg0.method5902() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method5899();
        this.field3625 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3625.add(new class284(arg0, var5, var3));
        }
    }

    @ObfuscatedName("jk.f(Ljava/util/Comparator;ZS)V")
    public void method4605(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3625, arg0);
        } else {
            Collections.sort(this.field3625, Collections.reverseOrder(arg0));
        }
    }
}
