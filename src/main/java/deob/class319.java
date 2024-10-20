package deob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ObfuscatedName("lg")
public class class319 {

    @ObfuscatedName("lg.c")
    public final List field4079;

    @ObfuscatedName("lg.p")
    public static Comparator field4083 = new class322();

    @ObfuscatedName("lg.f")
    public static Comparator field4081;

    @ObfuscatedName("lg.n")
    public static Comparator field4082;

    @ObfuscatedName("lg.k")
    public static Comparator field4080;

    static {
        new class324();
        field4081 = new class327();
        field4082 = new class321();
        field4080 = new class320();
    }

    public class319(class445 arg0, boolean arg1) {
        int var3 = arg0.method7198();
        boolean var4 = arg0.method7196() == 1;
        byte var5;
        if (var4) {
            var5 = 1;
        } else {
            var5 = 0;
        }
        int var6 = arg0.method7198();
        this.field4079 = new ArrayList(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            this.field4079.add(new class325(arg0, var5, var3));
        }
    }

    @ObfuscatedName("lg.c(Ljava/util/Comparator;ZI)V")
    public void method5525(Comparator arg0, boolean arg1) {
        if (arg1) {
            Collections.sort(this.field4079, arg0);
        } else {
            Collections.sort(this.field4079, Collections.reverseOrder(arg0));
        }
    }
}
