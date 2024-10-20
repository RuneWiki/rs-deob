package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("jb")
public class class269 implements class266 {

    @ObfuscatedName("jb.f")
    public static final class269 field3374 = new class269("", 0, new class265[] { class265.field3340 });

    @ObfuscatedName("jb.o")
    public static final class269 field3362 = new class269("", 1, new class265[] { class265.field3341, class265.field3340 });

    @ObfuscatedName("jb.u")
    public static final class269 field3363 = new class269("", 2, new class265[] { class265.field3341, class265.field3342, class265.field3340 });

    @ObfuscatedName("jb.p")
    public static final class269 field3364 = new class269("", 3, new class265[] { class265.field3341 });

    @ObfuscatedName("jb.b")
    public static final class269 field3361 = new class269("", 4);

    @ObfuscatedName("jb.e")
    public static final class269 field3366 = new class269("", 5, new class265[] { class265.field3341, class265.field3340 });

    @ObfuscatedName("jb.k")
    public static final class269 field3367 = new class269("", 6, new class265[] { class265.field3340 });

    @ObfuscatedName("jb.g")
    public static final class269 field3368 = new class269("", 8, new class265[] { class265.field3341, class265.field3340 });

    @ObfuscatedName("jb.h")
    public static final class269 field3365 = new class269("", 9, new class265[] { class265.field3341, class265.field3342 });

    @ObfuscatedName("jb.n")
    public static final class269 field3370 = new class269("", 10, new class265[] { class265.field3341 });

    @ObfuscatedName("jb.l")
    public static final class269 field3377 = new class269("", 11, new class265[] { class265.field3341 });

    @ObfuscatedName("jb.m")
    public static final class269 field3375 = new class269("", 12, new class265[] { class265.field3341, class265.field3340 });

    @ObfuscatedName("jb.d")
    public static final class269 field3373 = new class269("", 13, new class265[] { class265.field3341 });

    @ObfuscatedName("jb.c")
    public final int field3376;

    @ObfuscatedName("jb.j")
    public final Set field3372 = new HashSet();

    public class269(String arg0, int arg1) {
        this.field3376 = arg1;
    }

    public class269(String arg0, int arg1, class265[] arg2) {
        this.field3376 = arg1;
        class265[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class265 var6 = var4[var5];
            this.field3372.add(var6);
        }
    }

    @ObfuscatedName("jb.f(I)I")
    public int method240() {
        return this.field3376;
    }
}
