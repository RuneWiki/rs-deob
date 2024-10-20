package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ii")
public class class242 {

    @ObfuscatedName("ii.f")
    public int field2846 = -1;

    @ObfuscatedName("ii.w")
    public String field2847;

    @ObfuscatedName("ii.v")
    public String field2857;

    @ObfuscatedName("ii.s")
    public int field2849 = -1;

    @ObfuscatedName("ii.z")
    public int field2850 = -1;

    @ObfuscatedName("ii.j")
    public class301 field2851 = null;

    @ObfuscatedName("ii.i")
    public int field2858 = Integer.MAX_VALUE;

    @ObfuscatedName("ii.n")
    public int field2853 = 0;

    @ObfuscatedName("ii.l")
    public int field2854 = Integer.MAX_VALUE;

    @ObfuscatedName("ii.k")
    public int field2855 = 0;

    @ObfuscatedName("ii.c")
    public boolean field2856 = false;

    @ObfuscatedName("ii.r")
    public LinkedList field2848;

    @ObfuscatedName("ii.f(Lrd;IS)V")
    public void method4562(class474 arg0, int arg1) {
        this.field2846 = arg1;
        this.field2847 = arg0.method7983();
        this.field2857 = arg0.method7983();
        this.field2851 = new class301(arg0.method7979());
        this.field2849 = arg0.method7979();
        arg0.method7964();
        this.field2856 = arg0.method7964() == 1;
        this.field2850 = arg0.method7964();
        int var3 = arg0.method7964();
        this.field2848 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2848.add(this.method4563(arg0));
        }
        this.method4568();
    }

    @ObfuscatedName("ii.w(Lrd;B)Ljy;")
    public class262 method4563(class474 arg0) {
        int var2 = arg0.method7964();
        class250[] var3 = new class250[] { class250.field2940, class250.field2933, class250.field2935, class250.field2936 };
        class250 var4 = (class250) class351.method19(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field2937) {
            case 0:
                var6 = new class241();
                break;
            case 1:
                var6 = new class249();
                break;
            case 2:
                var6 = new class246();
                break;
            case 3:
                var6 = new class259();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class262) var6).method4543(arg0);
        return (class262) var6;
    }

    @ObfuscatedName("ii.v(IIII)Z")
    public boolean method4564(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2848.iterator();
        class262 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class262) var4.next();
        } while (!var5.method4549(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ii.s(IIB)Z")
    public boolean method4566(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2858 || var3 > this.field2853) {
            return false;
        } else if (var4 >= this.field2854 && var4 <= this.field2855) {
            Iterator var5 = this.field2848.iterator();
            class262 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class262) var5.next();
            } while (!var6.method4558(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ii.z(IIII)[I")
    public int[] method4581(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2848.iterator();
        class262 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class262) var4.next();
        } while (!var5.method4549(arg0, arg1, arg2));
        return var5.method4541(arg0, arg1, arg2);
    }

    @ObfuscatedName("ii.j(IIB)Lko;")
    public class301 method4574(int arg0, int arg1) {
        Iterator var3 = this.field2848.iterator();
        class262 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class262) var3.next();
        } while (!var4.method4558(arg0, arg1));
        return var4.method4542(arg0, arg1);
    }

    @ObfuscatedName("ii.i(B)V")
    public void method4568() {
        Iterator var1 = this.field2848.iterator();
        while (var1.hasNext()) {
            class262 var2 = (class262) var1.next();
            var2.method4545(this);
        }
    }

    @ObfuscatedName("ii.n(I)I")
    public int method4569() {
        return this.field2846;
    }

    @ObfuscatedName("ii.l(I)Z")
    public boolean method4570() {
        return this.field2856;
    }

    @ObfuscatedName("ii.k(I)Ljava/lang/String;")
    public String method4571() {
        return this.field2847;
    }

    @ObfuscatedName("ii.c(I)Ljava/lang/String;")
    public String method4624() {
        return this.field2857;
    }

    @ObfuscatedName("ii.r(I)I")
    public int method4573() {
        return this.field2849;
    }

    @ObfuscatedName("ii.b(B)I")
    public int method4617() {
        return this.field2850;
    }

    @ObfuscatedName("ii.m(I)I")
    public int method4575() {
        return this.field2858;
    }

    @ObfuscatedName("ii.t(I)I")
    public int method4576() {
        return this.field2853;
    }

    @ObfuscatedName("ii.h(B)I")
    public int method4577() {
        return this.field2854;
    }

    @ObfuscatedName("ii.p(B)I")
    public int method4587() {
        return this.field2855;
    }

    @ObfuscatedName("ii.o(I)I")
    public int method4579() {
        return this.field2851.field3463;
    }

    @ObfuscatedName("ii.u(B)I")
    public int method4580() {
        return this.field2851.field3464;
    }

    @ObfuscatedName("ii.x(I)I")
    public int method4639() {
        return this.field2851.field3462;
    }

    @ObfuscatedName("ii.a(B)Lko;")
    public class301 method4582() {
        return new class301(this.field2851);
    }
}
