package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("hm")
public class class218 {

    @ObfuscatedName("hm.c")
    public int field2629 = -1;

    @ObfuscatedName("hm.l")
    public String field2633;

    @ObfuscatedName("hm.s")
    public String field2638;

    @ObfuscatedName("hm.e")
    public int field2632 = -1;

    @ObfuscatedName("hm.r")
    public int field2639 = -1;

    @ObfuscatedName("hm.o")
    public class282 field2634 = null;

    @ObfuscatedName("hm.i")
    public int field2635 = Integer.MAX_VALUE;

    @ObfuscatedName("hm.w")
    public int field2636 = 0;

    @ObfuscatedName("hm.v")
    public int field2630 = Integer.MAX_VALUE;

    @ObfuscatedName("hm.a")
    public int field2637 = 0;

    @ObfuscatedName("hm.y")
    public boolean field2631 = false;

    @ObfuscatedName("hm.u")
    public LinkedList field2640;

    @ObfuscatedName("hm.c(Lpi;IB)V")
    public void method4027(class421 arg0, int arg1) {
        this.field2629 = arg1;
        this.field2633 = arg0.method6674();
        this.field2638 = arg0.method6674();
        this.field2634 = new class282(arg0.method6669());
        this.field2632 = arg0.method6669();
        arg0.method6686();
        this.field2631 = arg0.method6686() == 1;
        this.field2639 = arg0.method6686();
        int var3 = arg0.method6686();
        this.field2640 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2640.add(this.method4028(arg0));
        }
        this.method4033();
    }

    @ObfuscatedName("hm.l(Lpi;I)Liu;")
    public class238 method4028(class421 arg0) {
        int var2 = arg0.method6686();
        class226 var3 = (class226) class321.method2696(class226.method4311(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field2719) {
            case 0:
                var5 = new class222();
                break;
            case 1:
                var5 = new class235();
                break;
            case 2:
                var5 = new class225();
                break;
            case 3:
                var5 = new class217();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class238) var5).method4002(arg0);
        return (class238) var5;
    }

    @ObfuscatedName("hm.s(IIII)Z")
    public boolean method4026(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2640.iterator();
        class238 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class238) var4.next();
        } while (!var5.method4024(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("hm.e(III)Z")
    public boolean method4074(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2635 || var3 > this.field2636) {
            return false;
        } else if (var4 >= this.field2630 && var4 <= this.field2637) {
            Iterator var5 = this.field2640.iterator();
            class238 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class238) var5.next();
            } while (!var6.method4007(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hm.r(IIII)[I")
    public int[] method4073(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2640.iterator();
        class238 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class238) var4.next();
        } while (!var5.method4024(arg0, arg1, arg2));
        return var5.method4013(arg0, arg1, arg2);
    }

    @ObfuscatedName("hm.o(III)Ljd;")
    public class282 method4032(int arg0, int arg1) {
        Iterator var3 = this.field2640.iterator();
        class238 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class238) var3.next();
        } while (!var4.method4007(arg0, arg1));
        return var4.method4006(arg0, arg1);
    }

    @ObfuscatedName("hm.i(B)V")
    public void method4033() {
        Iterator var1 = this.field2640.iterator();
        while (var1.hasNext()) {
            class238 var2 = (class238) var1.next();
            var2.method4003(this);
        }
    }

    @ObfuscatedName("hm.w(B)I")
    public int method4034() {
        return this.field2629;
    }

    @ObfuscatedName("hm.v(B)Z")
    public boolean method4088() {
        return this.field2631;
    }

    @ObfuscatedName("hm.a(I)Ljava/lang/String;")
    public String method4037() {
        return this.field2633;
    }

    @ObfuscatedName("hm.y(B)Ljava/lang/String;")
    public String method4085() {
        return this.field2638;
    }

    @ObfuscatedName("hm.u(I)I")
    public int method4038() {
        return this.field2632;
    }

    @ObfuscatedName("hm.h(S)I")
    public int method4039() {
        return this.field2639;
    }

    @ObfuscatedName("hm.q(I)I")
    public int method4040() {
        return this.field2635;
    }

    @ObfuscatedName("hm.x(I)I")
    public int method4041() {
        return this.field2636;
    }

    @ObfuscatedName("hm.p(B)I")
    public int method4071() {
        return this.field2630;
    }

    @ObfuscatedName("hm.n(I)I")
    public int method4035() {
        return this.field2637;
    }

    @ObfuscatedName("hm.m(I)I")
    public int method4044() {
        return this.field2634.field3228;
    }

    @ObfuscatedName("hm.d(I)I")
    public int method4045() {
        return this.field2634.field3227;
    }

    @ObfuscatedName("hm.j(B)I")
    public int method4046() {
        return this.field2634.field3229;
    }

    @ObfuscatedName("hm.f(B)Ljd;")
    public class282 method4056() {
        return new class282(this.field2634);
    }
}
