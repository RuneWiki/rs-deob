package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ht")
public class class225 {

    @ObfuscatedName("ht.s")
    public int field2713 = -1;

    @ObfuscatedName("ht.h")
    public String field2712;

    @ObfuscatedName("ht.w")
    public String field2711;

    @ObfuscatedName("ht.v")
    public int field2714 = -1;

    @ObfuscatedName("ht.c")
    public int field2715 = -1;

    @ObfuscatedName("ht.q")
    public class290 field2716 = null;

    @ObfuscatedName("ht.i")
    public int field2722 = Integer.MAX_VALUE;

    @ObfuscatedName("ht.k")
    public int field2718 = 0;

    @ObfuscatedName("ht.o")
    public int field2720 = Integer.MAX_VALUE;

    @ObfuscatedName("ht.n")
    public int field2719 = 0;

    @ObfuscatedName("ht.d")
    public boolean field2721 = false;

    @ObfuscatedName("ht.a")
    public LinkedList field2717;

    @ObfuscatedName("ht.s(Lqr;II)V")
    public void method4151(class444 arg0, int arg1) {
        this.field2713 = arg1;
        this.field2712 = arg0.method6975();
        this.field2711 = arg0.method6975();
        this.field2716 = new class290(arg0.method6934());
        this.field2714 = arg0.method6934();
        arg0.method6929();
        this.field2721 = arg0.method6929() == 1;
        this.field2715 = arg0.method6929();
        int var3 = arg0.method6929();
        this.field2717 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2717.add(this.method4152(arg0));
        }
        this.method4216();
    }

    @ObfuscatedName("ht.h(Lqr;I)Lim;")
    public class245 method4152(class444 arg0) {
        int var2 = arg0.method6929();
        class233 var3 = (class233) class330.method525(class233.method4442(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field2800) {
            case 0:
                var5 = new class242();
                break;
            case 1:
                var5 = new class224();
                break;
            case 2:
                var5 = new class232();
                break;
            case 3:
                var5 = new class229();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class245) var5).method4136(arg0);
        return (class245) var5;
    }

    @ObfuscatedName("ht.w(IIII)Z")
    public boolean method4153(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2717.iterator();
        class245 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class245) var4.next();
        } while (!var5.method4123(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ht.v(III)Z")
    public boolean method4154(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2722 || var3 > this.field2718) {
            return false;
        } else if (var4 >= this.field2720 && var4 <= this.field2719) {
            Iterator var5 = this.field2717.iterator();
            class245 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class245) var5.next();
            } while (!var6.method4124(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ht.c(IIIB)[I")
    public int[] method4187(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2717.iterator();
        class245 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class245) var4.next();
        } while (!var5.method4123(arg0, arg1, arg2));
        return var5.method4125(arg0, arg1, arg2);
    }

    @ObfuscatedName("ht.q(III)Lku;")
    public class290 method4200(int arg0, int arg1) {
        Iterator var3 = this.field2717.iterator();
        class245 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class245) var3.next();
        } while (!var4.method4124(arg0, arg1));
        return var4.method4126(arg0, arg1);
    }

    @ObfuscatedName("ht.i(I)V")
    public void method4216() {
        Iterator var1 = this.field2717.iterator();
        while (var1.hasNext()) {
            class245 var2 = (class245) var1.next();
            var2.method4122(this);
        }
    }

    @ObfuscatedName("ht.k(B)I")
    public int method4158() {
        return this.field2713;
    }

    @ObfuscatedName("ht.o(S)Z")
    public boolean method4159() {
        return this.field2721;
    }

    @ObfuscatedName("ht.n(I)Ljava/lang/String;")
    public String method4160() {
        return this.field2712;
    }

    @ObfuscatedName("ht.d(I)Ljava/lang/String;")
    public String method4161() {
        return this.field2711;
    }

    @ObfuscatedName("ht.a(B)I")
    public int method4162() {
        return this.field2714;
    }

    @ObfuscatedName("ht.m(S)I")
    public int method4163() {
        return this.field2715;
    }

    @ObfuscatedName("ht.u(I)I")
    public int method4164() {
        return this.field2722;
    }

    @ObfuscatedName("ht.l(I)I")
    public int method4165() {
        return this.field2718;
    }

    @ObfuscatedName("ht.z(S)I")
    public int method4166() {
        return this.field2720;
    }

    @ObfuscatedName("ht.r(I)I")
    public int method4190() {
        return this.field2719;
    }

    @ObfuscatedName("ht.y(B)I")
    public int method4204() {
        return this.field2716.field3320;
    }

    @ObfuscatedName("ht.p(I)I")
    public int method4169() {
        return this.field2716.field3318;
    }

    @ObfuscatedName("ht.e(I)I")
    public int method4170() {
        return this.field2716.field3317;
    }

    @ObfuscatedName("ht.b(I)Lku;")
    public class290 method4171() {
        return new class290(this.field2716);
    }
}
