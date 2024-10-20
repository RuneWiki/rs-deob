package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("lq")
public class class318 implements class315 {

    @ObfuscatedName("lq.c")
    public static final class318 field3949 = new class318("", 0, new class314[] { class314.field3916 });

    @ObfuscatedName("lq.b")
    public static final class318 field3941 = new class318("", 1, new class314[] { class314.field3918, class314.field3916 });

    @ObfuscatedName("lq.p")
    public static final class318 field3939 = new class318("", 2, new class314[] { class314.field3918, class314.field3917, class314.field3916 });

    @ObfuscatedName("lq.m")
    public static final class318 field3940 = new class318("", 3, new class314[] { class314.field3918 });

    @ObfuscatedName("lq.t")
    public static final class318 field3956 = new class318("", 4);

    @ObfuscatedName("lq.s")
    public static final class318 field3942 = new class318("", 5, new class314[] { class314.field3918, class314.field3916 });

    @ObfuscatedName("lq.j")
    public static final class318 field3944 = new class318("", 6, new class314[] { class314.field3916 });

    @ObfuscatedName("lq.w")
    public static final class318 field3938 = new class318("", 8, new class314[] { class314.field3918, class314.field3916 });

    @ObfuscatedName("lq.n")
    public static final class318 field3945 = new class318("", 9, new class314[] { class314.field3918, class314.field3917 });

    @ObfuscatedName("lq.r")
    public static final class318 field3946 = new class318("", 10, new class314[] { class314.field3918 });

    @ObfuscatedName("lq.o")
    public static final class318 field3948 = new class318("", 11, new class314[] { class314.field3918 });

    @ObfuscatedName("lq.v")
    public static final class318 field3943 = new class318("", 12, new class314[] { class314.field3918, class314.field3916 });

    @ObfuscatedName("lq.d")
    public static final class318 field3937 = new class318("", 13, new class314[] { class314.field3918 });

    @ObfuscatedName("lq.h")
    public final int field3950;

    @ObfuscatedName("lq.g")
    public final Set field3951 = new HashSet();

    public class318(String arg0, int arg1) {
        this.field3950 = arg1;
    }

    public class318(String arg0, int arg1, class314[] arg2) {
        this.field3950 = arg1;
        class314[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class314 var6 = var4[var5];
            this.field3951.add(var6);
        }
    }

    @ObfuscatedName("lq.b(B)I")
    public int method46() {
        return this.field3950;
    }
}
