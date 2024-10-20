package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("it")
public class class235 {

    @ObfuscatedName("it.a")
    public int field2791 = -1;

    @ObfuscatedName("it.f")
    public String field2782;

    @ObfuscatedName("it.c")
    public String field2783;

    @ObfuscatedName("it.x")
    public int field2784 = -1;

    @ObfuscatedName("it.h")
    public int field2785 = -1;

    @ObfuscatedName("it.j")
    public class294 field2786 = null;

    @ObfuscatedName("it.y")
    public int field2787 = Integer.MAX_VALUE;

    @ObfuscatedName("it.d")
    public int field2781 = 0;

    @ObfuscatedName("it.n")
    public int field2788 = Integer.MAX_VALUE;

    @ObfuscatedName("it.r")
    public int field2790 = 0;

    @ObfuscatedName("it.l")
    public boolean field2789 = false;

    @ObfuscatedName("it.s")
    public LinkedList field2792;

    @ObfuscatedName("it.a(Lqr;II)V")
    public void method4407(class464 arg0, int arg1) {
        this.field2791 = arg1;
        this.field2782 = arg0.method7725();
        this.field2783 = arg0.method7725();
        this.field2786 = new class294(arg0.method7720());
        this.field2784 = arg0.method7720();
        arg0.method7735();
        this.field2789 = arg0.method7735() == 1;
        this.field2785 = arg0.method7735();
        int var3 = arg0.method7735();
        this.field2792 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2792.add(this.method4455(arg0));
        }
        this.method4453();
    }

    @ObfuscatedName("it.f(Lqr;B)Lin;")
    public class255 method4455(class464 arg0) {
        int var2 = arg0.method7735();
        class243[] var3 = new class243[] { class243.field2868, class243.field2875, class243.field2871, class243.field2869 };
        class243 var4 = (class243) class344.method4292(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field2872) {
            case 0:
                var6 = new class239();
                break;
            case 1:
                var6 = new class242();
                break;
            case 2:
                var6 = new class234();
                break;
            case 3:
                var6 = new class252();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class255) var6).method4354(arg0);
        return (class255) var6;
    }

    @ObfuscatedName("it.c(IIIB)Z")
    public boolean method4417(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2792.iterator();
        class255 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class255) var4.next();
        } while (!var5.method4371(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("it.x(IIB)Z")
    public boolean method4382(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2787 || var3 > this.field2781) {
            return false;
        } else if (var4 >= this.field2788 && var4 <= this.field2790) {
            Iterator var5 = this.field2792.iterator();
            class255 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class255) var5.next();
            } while (!var6.method4367(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("it.h(IIII)[I")
    public int[] method4383(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2792.iterator();
        class255 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class255) var4.next();
        } while (!var5.method4371(arg0, arg1, arg2));
        return var5.method4352(arg0, arg1, arg2);
    }

    @ObfuscatedName("it.j(IIB)Lki;")
    public class294 method4434(int arg0, int arg1) {
        Iterator var3 = this.field2792.iterator();
        class255 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class255) var3.next();
        } while (!var4.method4367(arg0, arg1));
        return var4.method4353(arg0, arg1);
    }

    @ObfuscatedName("it.y(B)V")
    public void method4453() {
        Iterator var1 = this.field2792.iterator();
        while (var1.hasNext()) {
            class255 var2 = (class255) var1.next();
            var2.method4373(this);
        }
    }

    @ObfuscatedName("it.d(I)I")
    public int method4397() {
        return this.field2791;
    }

    @ObfuscatedName("it.n(I)Z")
    public boolean method4419() {
        return this.field2789;
    }

    @ObfuscatedName("it.r(I)Ljava/lang/String;")
    public String method4388() {
        return this.field2782;
    }

    @ObfuscatedName("it.l(B)Ljava/lang/String;")
    public String method4389() {
        return this.field2783;
    }

    @ObfuscatedName("it.s(B)I")
    public int method4390() {
        return this.field2784;
    }

    @ObfuscatedName("it.p(I)I")
    public int method4391() {
        return this.field2785;
    }

    @ObfuscatedName("it.b(I)I")
    public int method4458() {
        return this.field2787;
    }

    @ObfuscatedName("it.o(B)I")
    public int method4393() {
        return this.field2781;
    }

    @ObfuscatedName("it.u(B)I")
    public int method4413() {
        return this.field2788;
    }

    @ObfuscatedName("it.z(B)I")
    public int method4395() {
        return this.field2790;
    }

    @ObfuscatedName("it.t(I)I")
    public int method4403() {
        return this.field2786.field3397;
    }

    @ObfuscatedName("it.w(B)I")
    public int method4437() {
        return this.field2786.field3395;
    }

    @ObfuscatedName("it.m(I)I")
    public int method4442() {
        return this.field2786.field3396;
    }

    @ObfuscatedName("it.q(I)Lki;")
    public class294 method4398() {
        return new class294(this.field2786);
    }
}
