package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ft")
public final class class169 {

    @ObfuscatedName("ft.f")
    public boolean field1999 = false;

    @ObfuscatedName("ft.e")
    public boolean field1993 = false;

    @ObfuscatedName("ft.v")
    public class188 field2002;

    @ObfuscatedName("ft.y")
    public class397 field1992;

    @ObfuscatedName("ft.j")
    public HashMap field1996;

    @ObfuscatedName("ft.o")
    public class168[][] field1997;

    @ObfuscatedName("ft.m")
    public HashMap field1998 = new HashMap();

    @ObfuscatedName("ft.r")
    public class396[] field1994;

    @ObfuscatedName("ft.h")
    public final class276 field2000;

    @ObfuscatedName("ft.d")
    public final class276 field2001;

    @ObfuscatedName("ft.z")
    public final HashMap field1995;

    @ObfuscatedName("ft.b")
    public int field2003;

    @ObfuscatedName("ft.i")
    public int field2004;

    @ObfuscatedName("ft.k")
    public int field2005;

    @ObfuscatedName("ft.g")
    public int field2006;

    @ObfuscatedName("ft.t")
    public int field2007 = 0;

    public class169(class396[] arg0, HashMap arg1, class276 arg2, class276 arg3) {
        this.field1994 = arg0;
        this.field1995 = arg1;
        this.field2000 = arg2;
        this.field2001 = arg3;
    }

    @ObfuscatedName("ft.f(Ljp;Ljava/lang/String;ZS)V")
    public void method3204(class276 arg0, String arg1, boolean arg2) {
        if (this.field1993) {
            return;
        }
        this.field1999 = false;
        this.field1993 = true;
        System.nanoTime();
        int var4 = arg0.method4582(class186.field2132.field2134);
        int var5 = arg0.method4521(var4, arg1);
        class384 var6 = new class384(arg0.method4567(class186.field2132.field2134, arg1));
        class384 var7 = new class384(arg0.method4567(class186.field2135.field2134, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field2002 = new class188();
        try {
            this.field2002.method3357(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field2002.method3036();
        this.field2002.method3037();
        this.field2002.method3038();
        this.field2003 = this.field2002.method3032() * 64;
        this.field2004 = this.field2002.method3034() * 64;
        this.field2005 = (this.field2002.method3062() - this.field2002.method3032() + 1) * 64;
        this.field2006 = (this.field2002.method3035() - this.field2002.method3034() + 1) * 64;
        int var9 = this.field2002.method3062() - this.field2002.method3032() + 1;
        int var10 = this.field2002.method3035() - this.field2002.method3034() + 1;
        System.nanoTime();
        System.nanoTime();
        class168.method369();
        this.field1997 = new class168[var9][var10];
        Iterator var11 = this.field2002.field2138.iterator();
        while (var11.hasNext()) {
            class162 var12 = (class162) var11.next();
            int var13 = var12.field2062;
            int var14 = var12.field2063;
            int var15 = var13 - this.field2002.method3032();
            int var16 = var14 - this.field2002.method3034();
            this.field1997[var15][var16] = new class168(var13, var14, this.field2002.method3065(), this.field1995);
            this.field1997[var15][var16].method3167(var12, this.field2002.field2141);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field1997[var17][var18] == null) {
                    this.field1997[var17][var18] = new class168(this.field2002.method3032() + var17, this.field2002.method3034() + var18, this.field2002.method3065(), this.field1995);
                    this.field1997[var17][var18].method3089(this.field2002.field2139, this.field2002.field2141);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4522(class186.field2131.field2134, arg1)) {
            byte[] var19 = arg0.method4567(class186.field2131.field2134, arg1);
            this.field1992 = Statics.method2311(var19);
        }
        System.nanoTime();
        arg0.method4516();
        arg0.method4518();
        this.field1999 = true;
    }

    @ObfuscatedName("ft.e(I)V")
    public final void method3205() {
        this.field1996 = null;
    }

    @ObfuscatedName("ft.v(IIIIIIIIB)V")
    public final void method3227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4230;
        int var10 = Statics.field4233;
        int var11 = Statics.field4232;
        int[] var12 = new int[4];
        class393.method6175(var12);
        class177 var13 = this.method3219(arg0, arg1, arg2, arg3);
        float var14 = this.method3214(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field2007 = var15;
        if (!this.field1998.containsKey(var15)) {
            class189 var16 = new class189(var15);
            var16.method3364();
            this.field1998.put(var15, var16);
        }
        int var17 = var13.field2081 + var13.field2078 - 1;
        int var18 = var13.field2079 + var13.field2077 - 1;
        for (int var19 = var13.field2078; var19 <= var17; var19++) {
            for (int var20 = var13.field2079; var20 <= var18; var20++) {
                this.field1997[var19][var20].method3099(var15, (class189) this.field1998.get(var15), this.field1994, this.field2000, this.field2001);
            }
        }
        class393.method6174(var9, var10, var11);
        class393.method6179(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field2003 + arg0;
        int var23 = this.field2004 + arg1;
        for (int var24 = var13.field2078; var24 < var13.field2081 + var13.field2078; var24++) {
            for (int var25 = var13.field2079; var25 < var13.field2079 + var13.field2077; var25++) {
                this.field1997[var24][var25].method3090((this.field1997[var24][var25].field1983 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field1997[var24][var25].field1990 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("ft.y(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V")
    public final void method3207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class177 var14 = this.method3219(arg0, arg1, arg2, arg3);
        float var15 = this.method3214(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field2003 + arg0;
        int var18 = this.field2004 + arg1;
        for (int var19 = var14.field2078; var19 < var14.field2081 + var14.field2078; var19++) {
            for (int var20 = var14.field2079; var20 < var14.field2079 + var14.field2077; var20++) {
                if (arg12) {
                    this.field1997[var19][var20].method3095();
                }
                this.field1997[var19][var20].method3100((this.field1997[var19][var20].field1983 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field1997[var19][var20].field1990 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2078; var21 < var14.field2081 + var14.field2078; var21++) {
            for (int var22 = var14.field2079; var22 < var14.field2079 + var14.field2077; var22++) {
                this.field1997[var21][var22].method3101(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("ft.j(IIIILjava/util/HashSet;III)V")
    public void method3208(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field1992 == null) {
            return;
        }
        this.field1992.method6394(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field1996 == null) {
            this.method3213();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field1996.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class185 var12 = (class185) var11.next();
                int var13 = (var12.field2122.field2927 - this.field2003) * arg2 / this.field2005;
                int var14 = arg3 - (var12.field2122.field2928 - this.field2004) * arg3 / this.field2006;
                class393.method6182(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("ft.o(IIIIIIIIIII)Ljava/util/List;")
    public List method3209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field1999) {
            return var11;
        }
        class177 var12 = this.method3219(arg0, arg1, arg2, arg3);
        float var13 = this.method3214(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field2003 + arg0;
        int var16 = this.field2004 + arg1;
        for (int var17 = var12.field2078; var17 < var12.field2081 + var12.field2078; var17++) {
            for (int var18 = var12.field2079; var18 < var12.field2079 + var12.field2077; var18++) {
                List var19 = this.field1997[var17][var18].method3120((this.field1997[var17][var18].field1983 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field1997[var17][var18].field1990 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("ft.m(IIIII)Lfh;")
    public class177 method3219(int arg0, int arg1, int arg2, int arg3) {
        class177 var5 = new class177(this);
        int var6 = this.field2003 + arg0;
        int var7 = this.field2004 + arg1;
        int var8 = this.field2003 + arg2;
        int var9 = this.field2004 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2081 = var12 - var10 + 1;
        var5.field2077 = var13 - var11 + 1;
        var5.field2078 = var10 - this.field2002.method3032();
        var5.field2079 = var11 - this.field2002.method3034();
        if (var5.field2078 < 0) {
            var5.field2081 += var5.field2078;
            var5.field2078 = 0;
        }
        if (var5.field2078 > this.field1997.length - var5.field2081) {
            var5.field2081 = this.field1997.length - var5.field2078;
        }
        if (var5.field2079 < 0) {
            var5.field2077 += var5.field2079;
            var5.field2079 = 0;
        }
        if (var5.field2079 > this.field1997[0].length - var5.field2077) {
            var5.field2077 = this.field1997[0].length - var5.field2079;
        }
        var5.field2081 = Math.min(var5.field2081, this.field1997.length);
        var5.field2077 = Math.min(var5.field2077, this.field1997[0].length);
        return var5;
    }

    @ObfuscatedName("ft.r(B)Z")
    public boolean method3203() {
        return this.field1999;
    }

    @ObfuscatedName("ft.h(I)Ljava/util/HashMap;")
    public HashMap method3212() {
        this.method3213();
        return this.field1996;
    }

    @ObfuscatedName("ft.d(B)V")
    public void method3213() {
        if (this.field1996 == null) {
            this.field1996 = new HashMap();
        }
        this.field1996.clear();
        for (int var1 = 0; var1 < this.field1997.length; var1++) {
            for (int var2 = 0; var2 < this.field1997[var1].length; var2++) {
                List var3 = this.field1997[var1][var2].method3121();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class185 var5 = (class185) var4.next();
                    if (var5.method3335()) {
                        int var6 = var5.method2967();
                        if (this.field1996.containsKey(var6)) {
                            List var8 = (List) this.field1996.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field1996.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ft.z(III)F")
    public float method3214(int arg0, int arg1) {
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
