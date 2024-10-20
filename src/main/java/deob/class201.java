package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("gu")
public class class201 {

    @ObfuscatedName("gu.v")
    public int field2239 = -1;

    @ObfuscatedName("gu.c")
    public String field2238;

    @ObfuscatedName("gu.i")
    public String field2244;

    @ObfuscatedName("gu.f")
    public int field2240 = -1;

    @ObfuscatedName("gu.b")
    public int field2241 = -1;

    @ObfuscatedName("gu.n")
    public class290 field2242 = null;

    @ObfuscatedName("gu.s")
    public int field2243 = Integer.MAX_VALUE;

    @ObfuscatedName("gu.l")
    public int field2249 = 0;

    @ObfuscatedName("gu.q")
    public int field2245 = Integer.MAX_VALUE;

    @ObfuscatedName("gu.o")
    public int field2246 = 0;

    @ObfuscatedName("gu.r")
    public boolean field2248 = false;

    @ObfuscatedName("gu.p")
    public LinkedList field2250;

    @ObfuscatedName("gu.v(Lpi;IB)V")
    public void method3674(class438 arg0, int arg1) {
        this.field2239 = arg1;
        this.field2238 = arg0.method6981();
        this.field2244 = arg0.method6981();
        this.field2242 = new class290(arg0.method6976());
        this.field2240 = arg0.method6976();
        arg0.method6971();
        this.field2248 = arg0.method6971() == 1;
        this.field2241 = arg0.method6971();
        int var3 = arg0.method6971();
        this.field2250 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2250.add(this.method3646(arg0));
        }
        this.method3634();
    }

    @ObfuscatedName("gu.c(Lpi;I)Lhs;")
    public class221 method3646(class438 arg0) {
        int var2 = arg0.method6971();
        class209 var3 = (class209) class330.method4919(class209.method3895(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field2327) {
            case 0:
                var5 = new class205();
                break;
            case 1:
                var5 = new class208();
                break;
            case 2:
                var5 = new class218();
                break;
            case 3:
                var5 = new class200();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class221) var5).method3594(arg0);
        return (class221) var5;
    }

    @ObfuscatedName("gu.i(IIII)Z")
    public boolean method3637(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2250.iterator();
        class221 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class221) var4.next();
        } while (!var5.method3597(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("gu.f(III)Z")
    public boolean method3619(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2243 || var3 > this.field2249) {
            return false;
        } else if (var4 >= this.field2245 && var4 <= this.field2246) {
            Iterator var5 = this.field2250.iterator();
            class221 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class221) var5.next();
            } while (!var6.method3602(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gu.b(IIII)[I")
    public int[] method3621(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2250.iterator();
        class221 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class221) var4.next();
        } while (!var5.method3597(arg0, arg1, arg2));
        return var5.method3592(arg0, arg1, arg2);
    }

    @ObfuscatedName("gu.n(IIB)Lks;")
    public class290 method3617(int arg0, int arg1) {
        Iterator var3 = this.field2250.iterator();
        class221 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class221) var3.next();
        } while (!var4.method3602(arg0, arg1));
        return var4.method3606(arg0, arg1);
    }

    @ObfuscatedName("gu.s(I)V")
    public void method3634() {
        Iterator var1 = this.field2250.iterator();
        while (var1.hasNext()) {
            class221 var2 = (class221) var1.next();
            var2.method3590(this);
        }
    }

    @ObfuscatedName("gu.l(I)I")
    public int method3623() {
        return this.field2239;
    }

    @ObfuscatedName("gu.q(I)Z")
    public boolean method3624() {
        return this.field2248;
    }

    @ObfuscatedName("gu.o(I)Ljava/lang/String;")
    public String method3677() {
        return this.field2238;
    }

    @ObfuscatedName("gu.r(S)Ljava/lang/String;")
    public String method3626() {
        return this.field2244;
    }

    @ObfuscatedName("gu.p(I)I")
    public int method3685() {
        return this.field2240;
    }

    @ObfuscatedName("gu.w(I)I")
    public int method3615() {
        return this.field2241;
    }

    @ObfuscatedName("gu.k(B)I")
    public int method3629() {
        return this.field2243;
    }

    @ObfuscatedName("gu.d(I)I")
    public int method3630() {
        return this.field2249;
    }

    @ObfuscatedName("gu.m(I)I")
    public int method3631() {
        return this.field2245;
    }

    @ObfuscatedName("gu.u(I)I")
    public int method3671() {
        return this.field2246;
    }

    @ObfuscatedName("gu.t(I)I")
    public int method3690() {
        return this.field2242.field3287;
    }

    @ObfuscatedName("gu.g(I)I")
    public int method3625() {
        return this.field2242.field3288;
    }

    @ObfuscatedName("gu.x(S)I")
    public int method3635() {
        return this.field2242.field3286;
    }

    @ObfuscatedName("gu.a(I)Lks;")
    public class290 method3644() {
        return new class290(this.field2242);
    }
}
