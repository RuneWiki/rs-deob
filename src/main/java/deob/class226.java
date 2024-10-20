package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("hm")
public class class226 {

    @ObfuscatedName("hm.o")
    public int field2745 = -1;

    @ObfuscatedName("hm.q")
    public String field2738;

    @ObfuscatedName("hm.l")
    public String field2737;

    @ObfuscatedName("hm.k")
    public int field2739 = -1;

    @ObfuscatedName("hm.a")
    public int field2741 = -1;

    @ObfuscatedName("hm.m")
    public class290 field2742 = null;

    @ObfuscatedName("hm.p")
    public int field2743 = Integer.MAX_VALUE;

    @ObfuscatedName("hm.s")
    public int field2744 = 0;

    @ObfuscatedName("hm.r")
    public int field2747 = Integer.MAX_VALUE;

    @ObfuscatedName("hm.v")
    public int field2746 = 0;

    @ObfuscatedName("hm.y")
    public boolean field2750 = false;

    @ObfuscatedName("hm.c")
    public LinkedList field2748;

    @ObfuscatedName("hm.o(Lpx;IB)V")
    public void method4127(class440 arg0, int arg1) {
        this.field2745 = arg1;
        this.field2738 = arg0.method7044();
        this.field2737 = arg0.method7044();
        this.field2742 = new class290(arg0.method6898());
        this.field2739 = arg0.method6898();
        arg0.method7071();
        this.field2750 = arg0.method7071() == 1;
        this.field2741 = arg0.method7071();
        int var3 = arg0.method7071();
        this.field2748 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2748.add(this.method4128(arg0));
        }
        this.method4134();
    }

    @ObfuscatedName("hm.q(Lpx;B)Lie;")
    public class246 method4128(class440 arg0) {
        int var2 = arg0.method7071();
        class234[] var3 = new class234[] { class234.field2834, class234.field2836, class234.field2831, class234.field2830 };
        class234 var4 = (class234) class330.method4934(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field2833) {
            case 0:
                var6 = new class233();
                break;
            case 1:
                var6 = new class225();
                break;
            case 2:
                var6 = new class230();
                break;
            case 3:
                var6 = new class243();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class246) var6).method4113(arg0);
        return (class246) var6;
    }

    @ObfuscatedName("hm.l(IIIB)Z")
    public boolean method4184(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2748.iterator();
        class246 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class246) var4.next();
        } while (!var5.method4120(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("hm.k(IIS)Z")
    public boolean method4130(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2743 || var3 > this.field2744) {
            return false;
        } else if (var4 >= this.field2747 && var4 <= this.field2746) {
            Iterator var5 = this.field2748.iterator();
            class246 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class246) var5.next();
            } while (!var6.method4124(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hm.a(IIII)[I")
    public int[] method4131(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2748.iterator();
        class246 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class246) var4.next();
        } while (!var5.method4120(arg0, arg1, arg2));
        return var5.method4110(arg0, arg1, arg2);
    }

    @ObfuscatedName("hm.m(III)Lkd;")
    public class290 method4132(int arg0, int arg1) {
        Iterator var3 = this.field2748.iterator();
        class246 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class246) var3.next();
        } while (!var4.method4124(arg0, arg1));
        return var4.method4112(arg0, arg1);
    }

    @ObfuscatedName("hm.p(I)V")
    public void method4134() {
        Iterator var1 = this.field2748.iterator();
        while (var1.hasNext()) {
            class246 var2 = (class246) var1.next();
            var2.method4125(this);
        }
    }

    @ObfuscatedName("hm.s(I)I")
    public int method4139() {
        return this.field2745;
    }

    @ObfuscatedName("hm.r(I)Z")
    public boolean method4135() {
        return this.field2750;
    }

    @ObfuscatedName("hm.v(B)Ljava/lang/String;")
    public String method4180() {
        return this.field2738;
    }

    @ObfuscatedName("hm.y(I)Ljava/lang/String;")
    public String method4137() {
        return this.field2737;
    }

    @ObfuscatedName("hm.c(B)I")
    public int method4138() {
        return this.field2739;
    }

    @ObfuscatedName("hm.w(I)I")
    public int method4141() {
        return this.field2741;
    }

    @ObfuscatedName("hm.b(S)I")
    public int method4169() {
        return this.field2743;
    }

    @ObfuscatedName("hm.t(I)I")
    public int method4178() {
        return this.field2744;
    }

    @ObfuscatedName("hm.g(B)I")
    public int method4142() {
        return this.field2747;
    }

    @ObfuscatedName("hm.x(I)I")
    public int method4143() {
        return this.field2746;
    }

    @ObfuscatedName("hm.n(I)I")
    public int method4144() {
        return this.field2742.field3351;
    }

    @ObfuscatedName("hm.e(I)I")
    public int method4156() {
        return this.field2742.field3350;
    }

    @ObfuscatedName("hm.h(I)I")
    public int method4146() {
        return this.field2742.field3354;
    }

    @ObfuscatedName("hm.f(I)Lkd;")
    public class290 method4167() {
        return new class290(this.field2742);
    }
}
