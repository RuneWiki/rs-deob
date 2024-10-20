package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("ke")
public class class309 {

    @ObfuscatedName("ke.c")
    public final List field3934;

    @ObfuscatedName("ke.l")
    public static Comparator field3935 = new class312();

    @ObfuscatedName("ke.s")
    public static Comparator field3938;

    @ObfuscatedName("ke.e")
    public static Comparator field3936;

    @ObfuscatedName("ke.r")
    public static Comparator field3937;

    static {
        new class314();
        field3938 = new class317();
        field3936 = new class311();
        field3937 = new class310();
    }

    public class309(class421 arg0, boolean arg1) {
        int var3 = arg0.method6666();
        boolean var4 = arg0.method6686() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method6666();
        this.field3934 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3934.add(new class315(arg0, var5, var3));
        }
    }

    @ObfuscatedName("ke.c(Ljava/util/Comparator;ZB)V")
    public void method5122(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3934, arg0);
        } else {
            Collections.sort(this.field3934, Collections.reverseOrder(arg0));
        }
    }
}
