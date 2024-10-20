package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ff")
public final class class168 {

    @ObfuscatedName("ff.v")
    public boolean field1997 = false;

    @ObfuscatedName("ff.n")
    public boolean field1989 = false;

    @ObfuscatedName("ff.f")
    public class187 field1990;

    @ObfuscatedName("ff.y")
    public class396 field1998;

    @ObfuscatedName("ff.p")
    public HashMap field1992;

    @ObfuscatedName("ff.j")
    public class167[][] field1995;

    @ObfuscatedName("ff.r")
    public HashMap field1994 = new HashMap();

    @ObfuscatedName("ff.b")
    public class395[] field1991;

    @ObfuscatedName("ff.d")
    public final class275 field2001;

    @ObfuscatedName("ff.s")
    public final class275 field1988;

    @ObfuscatedName("ff.u")
    public final HashMap field2000;

    @ObfuscatedName("ff.l")
    public int field1999;

    @ObfuscatedName("ff.o")
    public int field1996;

    @ObfuscatedName("ff.c")
    public int field1993;

    @ObfuscatedName("ff.e")
    public int field2002;

    @ObfuscatedName("ff.g")
    public int field2003 = 0;

    public class168(class395[] arg0, HashMap arg1, class275 arg2, class275 arg3) {
        this.field1991 = arg0;
        this.field2000 = arg1;
        this.field2001 = arg2;
        this.field1988 = arg3;
    }

    @ObfuscatedName("ff.v(Ljv;Ljava/lang/String;ZB)V")
    public void method3214(class275 arg0, String arg1, boolean arg2) {
        if (this.field1989) {
            return;
        }
        this.field1997 = false;
        this.field1989 = true;
        System.nanoTime();
        int var4 = arg0.method4484(class185.field2138.field2137);
        int var5 = arg0.method4485(var4, arg1);
        class383 var6 = new class383(arg0.method4471(class185.field2138.field2137, arg1));
        class383 var7 = new class383(arg0.method4471(class185.field2133.field2137, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field1990 = new class187();
        try {
            this.field1990.method3355(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field1990.method3036();
        this.field1990.method3037();
        this.field1990.method3022();
        this.field1999 = this.field1990.method3032() * 64;
        this.field1996 = this.field1990.method3034() * 64;
        this.field1993 = (this.field1990.method3079() - this.field1990.method3032() + 1) * 64;
        this.field2002 = (this.field1990.method3058() - this.field1990.method3034() + 1) * 64;
        int var9 = this.field1990.method3079() - this.field1990.method3032() + 1;
        int var10 = this.field1990.method3058() - this.field1990.method3034() + 1;
        System.nanoTime();
        System.nanoTime();
        class167.field1974.method3917();
        this.field1995 = new class167[var9][var10];
        Iterator var11 = this.field1990.field2142.iterator();
        while (var11.hasNext()) {
            class161 var12 = (class161) var11.next();
            int var13 = var12.field2058;
            int var14 = var12.field2059;
            int var15 = var13 - this.field1990.method3032();
            int var16 = var14 - this.field1990.method3034();
            this.field1995[var15][var16] = new class167(var13, var14, this.field1990.method3030(), this.field2000);
            this.field1995[var15][var16].method3084(var12, this.field1990.field2141);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field1995[var17][var18] == null) {
                    this.field1995[var17][var18] = new class167(this.field1990.method3032() + var17, this.field1990.method3034() + var18, this.field1990.method3030(), this.field2000);
                    this.field1995[var17][var18].method3085(this.field1990.field2139, this.field1990.field2141);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4501(class185.field2135.field2137, arg1)) {
            byte[] var19 = arg0.method4471(class185.field2135.field2137, arg1);
            this.field1998 = class44.method2638(var19);
        }
        System.nanoTime();
        arg0.method4480();
        arg0.method4529();
        this.field1997 = true;
    }

    @ObfuscatedName("ff.n(S)V")
    public final void method3215() {
        this.field1992 = null;
    }

    @ObfuscatedName("ff.f(IIIIIIIII)V")
    public final void method3216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4227;
        int var10 = Statics.field4221;
        int var11 = Statics.field4223;
        int[] var12 = new int[4];
        class392.method6239(var12);
        class176 var13 = this.method3217(arg0, arg1, arg2, arg3);
        float var14 = this.method3230(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field2003 = var15;
        if (!this.field1994.containsKey(var15)) {
            class188 var16 = new class188(var15);
            var16.method3391();
            this.field1994.put(var15, var16);
        }
        int var17 = var13.field2076 + var13.field2072 - 1;
        int var18 = var13.field2075 + var13.field2073 - 1;
        for (int var19 = var13.field2072; var19 <= var17; var19++) {
            for (int var20 = var13.field2075; var20 <= var18; var20++) {
                this.field1995[var19][var20].method3092(var15, (class188) this.field1994.get(var15), this.field1991, this.field2001, this.field1988);
            }
        }
        class392.method6240(var9, var10, var11);
        class392.method6273(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field1999 + arg0;
        int var23 = this.field1996 + arg1;
        for (int var24 = var13.field2072; var24 < var13.field2076 + var13.field2072; var24++) {
            for (int var25 = var13.field2075; var25 < var13.field2075 + var13.field2073; var25++) {
                this.field1995[var24][var25].method3083((this.field1995[var24][var25].field1977 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field1995[var24][var25].field1979 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("ff.y(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method3229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class176 var14 = this.method3217(arg0, arg1, arg2, arg3);
        float var15 = this.method3230(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field1999 + arg0;
        int var18 = this.field1996 + arg1;
        for (int var19 = var14.field2072; var19 < var14.field2076 + var14.field2072; var19++) {
            for (int var20 = var14.field2075; var20 < var14.field2075 + var14.field2073; var20++) {
                if (arg12) {
                    this.field1995[var19][var20].method3088();
                }
                this.field1995[var19][var20].method3108((this.field1995[var19][var20].field1977 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field1995[var19][var20].field1979 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2072; var21 < var14.field2076 + var14.field2072; var21++) {
            for (int var22 = var14.field2075; var22 < var14.field2075 + var14.field2073; var22++) {
                this.field1995[var21][var22].method3094(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ff.p(IIIILjava/util/HashSet;III)V")
    public void method3218(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field1998 == null) {
            return;
        }
        this.field1998.method6357(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field1992 == null) {
            this.method3223();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field1992.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class184 var12 = (class184) var11.next();
                int var13 = (var12.field2131.field2926 - this.field1999) * arg2 / this.field1993;
                int var14 = arg3 - (var12.field2131.field2925 - this.field1996) * arg3 / this.field2002;
                class392.method6261(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ff.j(IIIIIIIIIII)Ljava/util/List;")
    public List method3220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field1997) {
            return var11;
        }
        class176 var12 = this.method3217(arg0, arg1, arg2, arg3);
        float var13 = this.method3230(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field1999 + arg0;
        int var16 = this.field1996 + arg1;
        for (int var17 = var12.field2072; var17 < var12.field2076 + var12.field2072; var17++) {
            for (int var18 = var12.field2075; var18 < var12.field2075 + var12.field2073; var18++) {
                List var19 = this.field1995[var17][var18].method3114((this.field1995[var17][var18].field1977 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field1995[var17][var18].field1979 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ff.r(IIIIB)Lfu;")
    public class176 method3217(int arg0, int arg1, int arg2, int arg3) {
        class176 var5 = new class176(this);
        int var6 = this.field1999 + arg0;
        int var7 = this.field1996 + arg1;
        int var8 = this.field1999 + arg2;
        int var9 = this.field1996 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2076 = var12 - var10 + 1;
        var5.field2073 = var13 - var11 + 1;
        var5.field2072 = var10 - this.field1990.method3032();
        var5.field2075 = var11 - this.field1990.method3034();
        if (var5.field2072 < 0) {
            var5.field2076 += var5.field2072;
            var5.field2072 = 0;
        }
        if (var5.field2072 > this.field1995.length - var5.field2076) {
            var5.field2076 = this.field1995.length - var5.field2072;
        }
        if (var5.field2075 < 0) {
            var5.field2073 += var5.field2075;
            var5.field2075 = 0;
        }
        if (var5.field2075 > this.field1995[0].length - var5.field2073) {
            var5.field2073 = this.field1995[0].length - var5.field2075;
        }
        var5.field2076 = Math.min(var5.field2076, this.field1995.length);
        var5.field2073 = Math.min(var5.field2073, this.field1995[0].length);
        return var5;
    }

    @ObfuscatedName("ff.b(I)Z")
    public boolean method3221() {
        return this.field1997;
    }

    @ObfuscatedName("ff.d(I)Ljava/util/HashMap;")
    public HashMap method3222() {
        this.method3223();
        return this.field1992;
    }

    @ObfuscatedName("ff.s(I)V")
    public void method3223() {
        if (this.field1992 == null) {
            this.field1992 = new HashMap();
        }
        this.field1992.clear();
        for (int var1 = 0; var1 < this.field1995.length; var1++) {
            for (int var2 = 0; var2 < this.field1995[var1].length; var2++) {
                List var3 = this.field1995[var1][var2].method3163();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class184 var5 = (class184) var4.next();
                    if (var5.method3340()) {
                        int var6 = var5.method2989();
                        if (this.field1992.containsKey(var6)) {
                            List var8 = (List) this.field1992.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field1992.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ff.u(IIB)F")
    public float method3230(int arg0, int arg1) {
        float var3 = (float) arg0 / (float) arg1;
        if (var3 > 8.0F) {
            return 8.0F;
        } else if (var3 < 1.0F) {
            return 1.0F;
        } else {
            int var4 = Math.round(var3);
            return Math.abs((float) var4 - var3) < 0.05F ? (float) var4 : var3;
        }
    }
}
