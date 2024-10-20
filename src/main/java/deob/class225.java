package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("hg")
public class class225 {

    @ObfuscatedName("hg.c")
    public int field2709 = -1;

    @ObfuscatedName("hg.v")
    public String field2708;

    @ObfuscatedName("hg.q")
    public String field2705;

    @ObfuscatedName("hg.f")
    public int field2702 = -1;

    @ObfuscatedName("hg.j")
    public int field2699 = -1;

    @ObfuscatedName("hg.e")
    public class289 field2704 = null;

    @ObfuscatedName("hg.g")
    public int field2700 = Integer.MAX_VALUE;

    @ObfuscatedName("hg.w")
    public int field2706 = 0;

    @ObfuscatedName("hg.y")
    public int field2707 = Integer.MAX_VALUE;

    @ObfuscatedName("hg.i")
    public int field2703 = 0;

    @ObfuscatedName("hg.s")
    public boolean field2710 = false;

    @ObfuscatedName("hg.t")
    public LinkedList field2701;

    @ObfuscatedName("hg.c(Lqt;II)V")
    public void method4272(class443 arg0, int arg1) {
        this.field2709 = arg1;
        this.field2708 = arg0.method7057();
        this.field2705 = arg0.method7057();
        this.field2704 = new class289(arg0.method7052());
        this.field2702 = arg0.method7052();
        arg0.method7047();
        this.field2710 = arg0.method7047() == 1;
        this.field2699 = arg0.method7047();
        int var3 = arg0.method7047();
        this.field2701 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2701.add(this.method4273(arg0));
        }
        this.method4312();
    }

    @ObfuscatedName("hg.v(Lqt;I)Lih;")
    public class245 method4273(class443 arg0) {
        int var2 = arg0.method7047();
        class233 var3 = (class233) class329.method2087(Statics.method4542(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field2791) {
            case 0:
                var5 = new class229();
                break;
            case 1:
                var5 = new class224();
                break;
            case 2:
                var5 = new class232();
                break;
            case 3:
                var5 = new class242();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class245) var5).method4270(arg0);
        return (class245) var5;
    }

    @ObfuscatedName("hg.q(IIII)Z")
    public boolean method4274(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2701.iterator();
        class245 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class245) var4.next();
        } while (!var5.method4259(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("hg.f(III)Z")
    public boolean method4275(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2700 || var3 > this.field2706) {
            return false;
        } else if (var4 >= this.field2707 && var4 <= this.field2703) {
            Iterator var5 = this.field2701.iterator();
            class245 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class245) var5.next();
            } while (!var6.method4248(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hg.j(IIII)[I")
    public int[] method4276(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2701.iterator();
        class245 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class245) var4.next();
        } while (!var5.method4259(arg0, arg1, arg2));
        return var5.method4249(arg0, arg1, arg2);
    }

    @ObfuscatedName("hg.e(III)Lkd;")
    public class289 method4277(int arg0, int arg1) {
        Iterator var3 = this.field2701.iterator();
        class245 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class245) var3.next();
        } while (!var4.method4248(arg0, arg1));
        return var4.method4250(arg0, arg1);
    }

    @ObfuscatedName("hg.g(I)V")
    public void method4312() {
        Iterator var1 = this.field2701.iterator();
        while (var1.hasNext()) {
            class245 var2 = (class245) var1.next();
            var2.method4246(this);
        }
    }

    @ObfuscatedName("hg.w(I)I")
    public int method4279() {
        return this.field2709;
    }

    @ObfuscatedName("hg.y(B)Z")
    public boolean method4280() {
        return this.field2710;
    }

    @ObfuscatedName("hg.i(I)Ljava/lang/String;")
    public String method4338() {
        return this.field2708;
    }

    @ObfuscatedName("hg.s(B)Ljava/lang/String;")
    public String method4296() {
        return this.field2705;
    }

    @ObfuscatedName("hg.t(I)I")
    public int method4342() {
        return this.field2702;
    }

    @ObfuscatedName("hg.z(I)I")
    public int method4284() {
        return this.field2699;
    }

    @ObfuscatedName("hg.r(B)I")
    public int method4283() {
        return this.field2700;
    }

    @ObfuscatedName("hg.u(I)I")
    public int method4292() {
        return this.field2706;
    }

    @ObfuscatedName("hg.k(B)I")
    public int method4287() {
        return this.field2707;
    }

    @ObfuscatedName("hg.h(I)I")
    public int method4288() {
        return this.field2703;
    }

    @ObfuscatedName("hg.x(I)I")
    public int method4289() {
        return this.field2704.field3328;
    }

    @ObfuscatedName("hg.l(I)I")
    public int method4290() {
        return this.field2704.field3329;
    }

    @ObfuscatedName("hg.a(B)I")
    public int method4299() {
        return this.field2704.field3330;
    }

    @ObfuscatedName("hg.p(I)Lkd;")
    public class289 method4281() {
        return new class289(this.field2704);
    }
}
