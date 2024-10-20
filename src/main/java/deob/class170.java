package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("fx")
public final class class170 {

    @ObfuscatedName("fx.s")
    public boolean field1979 = false;

    @ObfuscatedName("fx.t")
    public boolean field1975 = false;

    @ObfuscatedName("fx.v")
    public class189 field1991;

    @ObfuscatedName("fx.j")
    public class398 field1990;

    @ObfuscatedName("fx.l")
    public HashMap field1978;

    @ObfuscatedName("fx.n")
    public class169[][] field1977;

    @ObfuscatedName("fx.w")
    public HashMap field1980 = new HashMap();

    @ObfuscatedName("fx.f")
    public class397[] field1981;

    @ObfuscatedName("fx.o")
    public final class277 field1985;

    @ObfuscatedName("fx.x")
    public final class277 field1983;

    @ObfuscatedName("fx.r")
    public final HashMap field1984;

    @ObfuscatedName("fx.p")
    public int field1974;

    @ObfuscatedName("fx.h")
    public int field1986;

    @ObfuscatedName("fx.k")
    public int field1987;

    @ObfuscatedName("fx.a")
    public int field1988;

    @ObfuscatedName("fx.q")
    public int field1989 = 0;

    public class170(class397[] arg0, HashMap arg1, class277 arg2, class277 arg3) {
        this.field1981 = arg0;
        this.field1984 = arg1;
        this.field1985 = arg2;
        this.field1983 = arg3;
    }

    @ObfuscatedName("fx.s(Ljy;Ljava/lang/String;ZI)V")
    public void method3152(class277 arg0, String arg1, boolean arg2) {
        if (this.field1975) {
            return;
        }
        this.field1979 = false;
        this.field1975 = true;
        System.nanoTime();
        int var4 = arg0.method4474(class187.field2118.field2114);
        int var5 = arg0.method4476(var4, arg1);
        class385 var6 = new class385(arg0.method4478(class187.field2118.field2114, arg1));
        class385 var7 = new class385(arg0.method4478(class187.field2116.field2114, arg1));
        System.nanoTime();
        System.nanoTime();
        this.field1991 = new class189();
        try {
            this.field1991.method3303(var6, var7, var5, arg2);
        } catch (IllegalStateException var20) {
            return;
        }
        this.field1991.method2998();
        this.field1991.method2988();
        this.field1991.method2989();
        this.field1974 = this.field1991.method3029() * 64;
        this.field1986 = this.field1991.method2985() * 64;
        this.field1987 = (this.field1991.method2984() - this.field1991.method3029() + 1) * 64;
        this.field1988 = (this.field1991.method2986() - this.field1991.method2985() + 1) * 64;
        int var9 = this.field1991.method2984() - this.field1991.method3029() + 1;
        int var10 = this.field1991.method2986() - this.field1991.method2985() + 1;
        System.nanoTime();
        System.nanoTime();
        class169.method2404();
        this.field1977 = new class169[var9][var10];
        Iterator var11 = this.field1991.field2125.iterator();
        while (var11.hasNext()) {
            class163 var12 = (class163) var11.next();
            int var13 = var12.field2049;
            int var14 = var12.field2053;
            int var15 = var13 - this.field1991.method3029();
            int var16 = var14 - this.field1991.method2985();
            this.field1977[var15][var16] = new class169(var13, var14, this.field1991.method2981(), this.field1984);
            this.field1977[var15][var16].method3040(var12, this.field1991.field2124);
        }
        for (int var17 = 0; var17 < var9; var17++) {
            for (int var18 = 0; var18 < var10; var18++) {
                if (this.field1977[var17][var18] == null) {
                    this.field1977[var17][var18] = new class169(this.field1991.method3029() + var17, this.field1991.method2985() + var18, this.field1991.method2981(), this.field1984);
                    this.field1977[var17][var18].method3041(this.field1991.field2123, this.field1991.field2124);
                }
            }
        }
        System.nanoTime();
        System.nanoTime();
        if (arg0.method4477(class187.field2115.field2114, arg1)) {
            byte[] var19 = arg0.method4478(class187.field2115.field2114, arg1);
            this.field1990 = class16.method1834(var19);
        }
        System.nanoTime();
        arg0.method4471();
        arg0.method4473();
        this.field1979 = true;
    }

    @ObfuscatedName("fx.t(S)V")
    public final void method3153() {
        this.field1978 = null;
    }

    @ObfuscatedName("fx.v(IIIIIIIII)V")
    public final void method3154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[] var9 = Statics.field4250;
        int var10 = Statics.field4245;
        int var11 = Statics.field4246;
        int[] var12 = new int[4];
        class394.method6266(var12);
        class178 var13 = this.method3157(arg0, arg1, arg2, arg3);
        float var14 = this.method3161(arg6 - arg4, arg2 - arg0);
        int var15 = (int) Math.ceil((double) var14);
        this.field1989 = var15;
        if (!this.field1980.containsKey(var15)) {
            class190 var16 = new class190(var15);
            var16.method3314();
            this.field1980.put(var15, var16);
        }
        int var17 = var13.field2065 + var13.field2064 - 1;
        int var18 = var13.field2066 + var13.field2063 - 1;
        for (int var19 = var13.field2065; var19 <= var17; var19++) {
            for (int var20 = var13.field2066; var20 <= var18; var20++) {
                this.field1977[var19][var20].method3048(var15, (class190) this.field1980.get(var15), this.field1981, this.field1985, this.field1983);
            }
        }
        class394.method6319(var9, var10, var11);
        class394.method6267(var12);
        int var21 = (int) (var14 * 64.0F);
        int var22 = this.field1974 + arg0;
        int var23 = this.field1986 + arg1;
        for (int var24 = var13.field2065; var24 < var13.field2065 + var13.field2064; var24++) {
            for (int var25 = var13.field2066; var25 < var13.field2066 + var13.field2063; var25++) {
                this.field1977[var24][var25].method3039((this.field1977[var24][var25].field1969 * 64 - var22) * var21 / 64 + arg4, arg7 - (this.field1977[var24][var25].field1963 * 64 - var23 + 64) * var21 / 64, var21);
            }
        }
    }

    @ObfuscatedName("fx.j(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
    public final void method3186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
        class178 var14 = this.method3157(arg0, arg1, arg2, arg3);
        float var15 = this.method3161(arg6 - arg4, arg2 - arg0);
        int var16 = (int) (var15 * 64.0F);
        int var17 = this.field1974 + arg0;
        int var18 = this.field1986 + arg1;
        for (int var19 = var14.field2065; var19 < var14.field2065 + var14.field2064; var19++) {
            for (int var20 = var14.field2066; var20 < var14.field2066 + var14.field2063; var20++) {
                if (arg12) {
                    this.field1977[var19][var20].method3044();
                }
                this.field1977[var19][var20].method3049((this.field1977[var19][var20].field1969 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field1977[var19][var20].field1963 * 64 - var18 + 64) * var16 / 64, var16, arg8);
            }
        }
        if (arg9 == null || arg10 <= 0) {
            return;
        }
        for (int var21 = var14.field2065; var21 < var14.field2065 + var14.field2064; var21++) {
            for (int var22 = var14.field2066; var22 < var14.field2066 + var14.field2063; var22++) {
                this.field1977[var21][var22].method3063(arg9, arg10, arg11);
            }
        }
    }

    @ObfuscatedName("fx.l(IIIILjava/util/HashSet;IIS)V")
    public void method3176(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
        if (this.field1990 == null) {
            return;
        }
        this.field1990.method6380(arg0, arg1, arg2, arg3);
        if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
            return;
        }
        if (this.field1978 == null) {
            this.method3179();
        }
        Iterator var8 = arg4.iterator();
        while (true) {
            List var10;
            do {
                if (!var8.hasNext()) {
                    return;
                }
                int var9 = (Integer) var8.next();
                var10 = (List) this.field1978.get(var9);
            } while (var10 == null);
            Iterator var11 = var10.iterator();
            while (var11.hasNext()) {
                class186 var12 = (class186) var11.next();
                int var13 = (var12.field2110.field2920 - this.field1974) * arg2 / this.field1987;
                int var14 = arg3 - (var12.field2110.field2922 - this.field1986) * arg3 / this.field1988;
                class394.method6270(arg0 + var13, arg1 + var14, 2, 16776960, 256);
            }
        }
    }

    @ObfuscatedName("fx.n(IIIIIIIIIIS)Ljava/util/List;")
    public List method3159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LinkedList var11 = new LinkedList();
        if (!this.field1979) {
            return var11;
        }
        class178 var12 = this.method3157(arg0, arg1, arg2, arg3);
        float var13 = this.method3161(arg6, arg2 - arg0);
        int var14 = (int) (var13 * 64.0F);
        int var15 = this.field1974 + arg0;
        int var16 = this.field1986 + arg1;
        for (int var17 = var12.field2065; var17 < var12.field2065 + var12.field2064; var17++) {
            for (int var18 = var12.field2066; var18 < var12.field2066 + var12.field2063; var18++) {
                List var19 = this.field1977[var17][var18].method3070((this.field1977[var17][var18].field1969 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field1977[var17][var18].field1963 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
                if (!var19.isEmpty()) {
                    var11.addAll(var19);
                }
            }
        }
        return var11;
    }

    @ObfuscatedName("fx.w(IIIII)Lfo;")
    public class178 method3157(int arg0, int arg1, int arg2, int arg3) {
        class178 var5 = new class178(this);
        int var6 = this.field1974 + arg0;
        int var7 = this.field1986 + arg1;
        int var8 = this.field1974 + arg2;
        int var9 = this.field1986 + arg3;
        int var10 = var6 / 64;
        int var11 = var7 / 64;
        int var12 = var8 / 64;
        int var13 = var9 / 64;
        var5.field2064 = var12 - var10 + 1;
        var5.field2063 = var13 - var11 + 1;
        var5.field2065 = var10 - this.field1991.method3029();
        var5.field2066 = var11 - this.field1991.method2985();
        if (var5.field2065 < 0) {
            var5.field2064 += var5.field2065;
            var5.field2065 = 0;
        }
        if (var5.field2065 > this.field1977.length - var5.field2064) {
            var5.field2064 = this.field1977.length - var5.field2065;
        }
        if (var5.field2066 < 0) {
            var5.field2063 += var5.field2066;
            var5.field2066 = 0;
        }
        if (var5.field2066 > this.field1977[0].length - var5.field2063) {
            var5.field2063 = this.field1977[0].length - var5.field2066;
        }
        var5.field2064 = Math.min(var5.field2064, this.field1977.length);
        var5.field2063 = Math.min(var5.field2063, this.field1977[0].length);
        return var5;
    }

    @ObfuscatedName("fx.f(B)Z")
    public boolean method3177() {
        return this.field1979;
    }

    @ObfuscatedName("fx.o(I)Ljava/util/HashMap;")
    public HashMap method3175() {
        this.method3179();
        return this.field1978;
    }

    @ObfuscatedName("fx.x(I)V")
    public void method3179() {
        if (this.field1978 == null) {
            this.field1978 = new HashMap();
        }
        this.field1978.clear();
        for (int var1 = 0; var1 < this.field1977.length; var1++) {
            for (int var2 = 0; var2 < this.field1977[var1].length; var2++) {
                List var3 = this.field1977[var1][var2].method3071();
                Iterator var4 = var3.iterator();
                while (var4.hasNext()) {
                    class186 var5 = (class186) var4.next();
                    if (var5.method3284()) {
                        int var6 = var5.method2921();
                        if (this.field1978.containsKey(var6)) {
                            List var8 = (List) this.field1978.get(var6);
                            var8.add(var5);
                        } else {
                            LinkedList var7 = new LinkedList();
                            var7.add(var5);
                            this.field1978.put(var6, var7);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fx.r(IIB)F")
    public float method3161(int arg0, int arg1) {
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
