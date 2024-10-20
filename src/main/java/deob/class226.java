package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ht")
public class class226 {

    @ObfuscatedName("ht.c")
    public int field2733 = -1;

    @ObfuscatedName("ht.p")
    public String field2732;

    @ObfuscatedName("ht.f")
    public String field2740;

    @ObfuscatedName("ht.n")
    public int field2734 = -1;

    @ObfuscatedName("ht.k")
    public int field2738 = -1;

    @ObfuscatedName("ht.w")
    public class291 field2736 = null;

    @ObfuscatedName("ht.s")
    public int field2737 = Integer.MAX_VALUE;

    @ObfuscatedName("ht.q")
    public int field2745 = 0;

    @ObfuscatedName("ht.m")
    public int field2739 = Integer.MAX_VALUE;

    @ObfuscatedName("ht.x")
    public int field2731 = 0;

    @ObfuscatedName("ht.j")
    public boolean field2741 = false;

    @ObfuscatedName("ht.v")
    public LinkedList field2742;

    @ObfuscatedName("ht.c(Lqq;II)V")
    public void method4338(class445 arg0, int arg1) {
        this.field2733 = arg1;
        this.field2732 = arg0.method7206();
        this.field2740 = arg0.method7206();
        this.field2736 = new class291(arg0.method7201());
        this.field2734 = arg0.method7201();
        arg0.method7196();
        this.field2741 = arg0.method7196() == 1;
        this.field2738 = arg0.method7196();
        int var3 = arg0.method7196();
        this.field2742 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2742.add(this.method4408(arg0));
        }
        this.method4344();
    }

    @ObfuscatedName("ht.p(Lqq;B)Lis;")
    public class246 method4408(class445 arg0) {
        int var2 = arg0.method7196();
        class234[] var3 = new class234[] { class234.field2821, class234.field2823, class234.field2822, class234.field2824 };
        class234 var4 = (class234) class331.method5118(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field2820) {
            case 0:
                var6 = new class243();
                break;
            case 1:
                var6 = new class233();
                break;
            case 2:
                var6 = new class225();
                break;
            case 3:
                var6 = new class230();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class246) var6).method4317(arg0);
        return (class246) var6;
    }

    @ObfuscatedName("ht.f(IIII)Z")
    public boolean method4340(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2742.iterator();
        class246 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class246) var4.next();
        } while (!var5.method4311(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ht.n(III)Z")
    public boolean method4383(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2737 || var3 > this.field2745) {
            return false;
        } else if (var4 >= this.field2739 && var4 <= this.field2731) {
            Iterator var5 = this.field2742.iterator();
            class246 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class246) var5.next();
            } while (!var6.method4312(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ht.k(IIIB)[I")
    public int[] method4414(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2742.iterator();
        class246 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class246) var4.next();
        } while (!var5.method4311(arg0, arg1, arg2));
        return var5.method4313(arg0, arg1, arg2);
    }

    @ObfuscatedName("ht.w(III)Lkz;")
    public class291 method4337(int arg0, int arg1) {
        Iterator var3 = this.field2742.iterator();
        class246 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class246) var3.next();
        } while (!var4.method4312(arg0, arg1));
        return var4.method4331(arg0, arg1);
    }

    @ObfuscatedName("ht.s(I)V")
    public void method4344() {
        Iterator var1 = this.field2742.iterator();
        while (var1.hasNext()) {
            class246 var2 = (class246) var1.next();
            var2.method4310(this);
        }
    }

    @ObfuscatedName("ht.q(I)I")
    public int method4345() {
        return this.field2733;
    }

    @ObfuscatedName("ht.m(I)Z")
    public boolean method4346() {
        return this.field2741;
    }

    @ObfuscatedName("ht.x(B)Ljava/lang/String;")
    public String method4347() {
        return this.field2732;
    }

    @ObfuscatedName("ht.j(I)Ljava/lang/String;")
    public String method4348() {
        return this.field2740;
    }

    @ObfuscatedName("ht.v(I)I")
    public int method4361() {
        return this.field2734;
    }

    @ObfuscatedName("ht.h(I)I")
    public int method4350() {
        return this.field2738;
    }

    @ObfuscatedName("ht.t(B)I")
    public int method4351() {
        return this.field2737;
    }

    @ObfuscatedName("ht.u(B)I")
    public int method4352() {
        return this.field2745;
    }

    @ObfuscatedName("ht.d(I)I")
    public int method4353() {
        return this.field2739;
    }

    @ObfuscatedName("ht.b(I)I")
    public int method4412() {
        return this.field2731;
    }

    @ObfuscatedName("ht.a(B)I")
    public int method4355() {
        return this.field2736.field3349;
    }

    @ObfuscatedName("ht.l(I)I")
    public int method4362() {
        return this.field2736.field3351;
    }

    @ObfuscatedName("ht.e(I)I")
    public int method4376() {
        return this.field2736.field3350;
    }

    @ObfuscatedName("ht.g(B)Lkz;")
    public class291 method4358() {
        return new class291(this.field2736);
    }
}
