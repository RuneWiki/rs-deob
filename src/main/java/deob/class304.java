package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("ka")
public class class304 {

    @ObfuscatedName("ka.c")
    public final List field3871;

    @ObfuscatedName("ka.b")
    public static Comparator field3874 = new class307();

    @ObfuscatedName("ka.p")
    public static Comparator field3872;

    @ObfuscatedName("ka.m")
    public static Comparator field3873;

    @ObfuscatedName("ka.t")
    public static Comparator field3870;

    static {
        new class309();
        field3872 = new class312();
        field3873 = new class306();
        field3870 = new class305();
    }

    public class304(class419 arg0, boolean arg1) {
        int var3 = arg0.method6672();
        boolean var4 = arg0.method6781() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method6672();
        this.field3871 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field3871.add(new class310(arg0, var5, var3));
        }
    }

    @ObfuscatedName("ka.c(Ljava/util/Comparator;ZB)V")
    public void method5164(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field3871, arg0);
        } else {
            Collections.sort(this.field3871, Collections.reverseOrder(arg0));
        }
    }
}
