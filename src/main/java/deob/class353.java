package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("mm")
public class class353 implements class350 {

    @ObfuscatedName("mm.f")
    public static final class353 field4335 = new class353("", 0, new class349[] { class349.field4309 });

    @ObfuscatedName("mm.w")
    public static final class353 field4327 = new class353("", 1, new class349[] { class349.field4310, class349.field4309 });

    @ObfuscatedName("mm.v")
    public static final class353 field4328 = new class353("", 2, new class349[] { class349.field4310, class349.field4311, class349.field4309 });

    @ObfuscatedName("mm.s")
    public static final class353 field4329 = new class353("", 3, new class349[] { class349.field4310 });

    @ObfuscatedName("mm.z")
    public static final class353 field4342 = new class353("", 4);

    @ObfuscatedName("mm.j")
    public static final class353 field4339 = new class353("", 5, new class349[] { class349.field4310, class349.field4309 });

    @ObfuscatedName("mm.i")
    public static final class353 field4330 = new class353("", 6, new class349[] { class349.field4309 });

    @ObfuscatedName("mm.n")
    public static final class353 field4333 = new class353("", 8, new class349[] { class349.field4310, class349.field4309 });

    @ObfuscatedName("mm.l")
    public static final class353 field4334 = new class353("", 9, new class349[] { class349.field4310, class349.field4311 });

    @ObfuscatedName("mm.k")
    public static final class353 field4326 = new class353("", 10, new class349[] { class349.field4310 });

    @ObfuscatedName("mm.c")
    public static final class353 field4338 = new class353("", 11, new class349[] { class349.field4310 });

    @ObfuscatedName("mm.r")
    public static final class353 field4337 = new class353("", 12, new class349[] { class349.field4310, class349.field4309 });

    @ObfuscatedName("mm.b")
    public static final class353 field4331 = new class353("", 13, new class349[] { class349.field4310 });

    @ObfuscatedName("mm.m")
    public final int field4332;

    @ObfuscatedName("mm.t")
    public final Set field4340 = new HashSet();

    public class353(String arg0, int arg1) {
        this.field4332 = arg1;
    }

    public class353(String arg0, int arg1, class349[] arg2) {
        this.field4332 = arg1;
        class349[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class349 var6 = var4[var5];
            this.field4340.add(var6);
        }
    }

    @ObfuscatedName("mm.f(B)I")
    public int method46() {
        return this.field4332;
    }
}
