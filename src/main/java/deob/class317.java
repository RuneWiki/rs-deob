package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("ls")
public class class317 {

    @ObfuscatedName("ls.c")
    public final List field4044;

    @ObfuscatedName("ls.v")
    public static Comparator field4039 = new class320();

    @ObfuscatedName("ls.q")
    public static Comparator field4040;

    @ObfuscatedName("ls.f")
    public static Comparator field4041;

    @ObfuscatedName("ls.j")
    public static Comparator field4038;

    static {
        new class322();
        field4040 = new class325();
        field4041 = new class319();
        field4038 = new class318();
    }

    public class317(class443 arg0, boolean arg1) {
        int var3 = arg0.method7049();
        boolean var4 = arg0.method7047() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method7049();
        this.field4044 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4044.add(new class323(arg0, var5, var3));
        }
    }

    @ObfuscatedName("ls.c(Ljava/util/Comparator;ZS)V")
    public void method5402(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4044, arg0);
        } else {
            Collections.sort(this.field4044, Collections.reverseOrder(arg0));
        }
    }
}
